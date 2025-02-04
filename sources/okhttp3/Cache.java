package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.b;
import okio.c;
import okio.d;
import okio.e;
import okio.g;
import okio.h;
import okio.q;
import okio.t;
import okio.u;
import okio.y;
import okio.z;

/* loaded from: classes2.dex */
public final class Cache implements Closeable, Flushable {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    int writeAbortCount;
    int writeSuccessCount;

    /* loaded from: classes2.dex */
    public final class CacheRequestImpl implements CacheRequest {
        private y body;
        private y cacheOut;
        boolean done;
        private final DiskLruCache.Editor editor;

        public CacheRequestImpl(final DiskLruCache.Editor editor) {
            this.editor = editor;
            y newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new g(newSink) { // from class: okhttp3.Cache.CacheRequestImpl.1
                @Override // okio.g, okio.y, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    synchronized (Cache.this) {
                        CacheRequestImpl cacheRequestImpl = CacheRequestImpl.this;
                        if (cacheRequestImpl.done) {
                            return;
                        }
                        cacheRequestImpl.done = true;
                        Cache.this.writeSuccessCount++;
                        super.close();
                        editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (Cache.this) {
                if (this.done) {
                    return;
                }
                this.done = true;
                Cache.this.writeAbortCount++;
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public y body() {
            return this.body;
        }
    }

    /* loaded from: classes2.dex */
    public static class CacheResponseBody extends ResponseBody {
        private final d bodySource;

        @Nullable
        private final String contentLength;

        @Nullable
        private final String contentType;
        final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(final DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            h hVar = new h(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.h, okio.z, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    snapshot.close();
                    super.close();
                }
            };
            Logger logger = q.f33861a;
            this.bodySource = new u(hVar);
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            try {
                String str = this.contentLength;
                if (str == null) {
                    return -1L;
                }
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        public d source() {
            return this.bodySource;
        }
    }

    public Cache(File file, long j10) {
        this(file, j10, FileSystem.SYSTEM);
    }

    private void abortQuietly(@Nullable DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static String key(HttpUrl httpUrl) {
        return e.p(httpUrl.toString()).o("MD5").r();
    }

    public static int readInt(d dVar) throws IOException {
        try {
            long A = dVar.A();
            String M = dVar.M();
            if (A >= 0 && A <= 2147483647L && M.isEmpty()) {
                return (int) A;
            }
            throw new IOException("expected an int but was \"" + A + M + "\"");
        } catch (NumberFormatException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public void delete() throws IOException {
        this.cache.delete();
    }

    public File directory() {
        return this.cache.getDirectory();
    }

    public void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    @Nullable
    public Response get(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (!entry.matches(request, response)) {
                    Util.closeQuietly(response.body());
                    return null;
                }
                return response;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public synchronized int hitCount() {
        return this.hitCount;
    }

    public void initialize() throws IOException {
        this.cache.initialize();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    public long maxSize() {
        return this.cache.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.networkCount;
    }

    @Nullable
    public CacheRequest put(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!method.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = this.cache.edit(key(response.request().url()));
            if (editor == null) {
                return null;
            }
            try {
                entry.writeTo(editor);
                return new CacheRequestImpl(editor);
            } catch (IOException unused2) {
                abortQuietly(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public void remove(Request request) throws IOException {
        this.cache.remove(key(request.url()));
    }

    public synchronized int requestCount() {
        return this.requestCount;
    }

    public long size() throws IOException {
        return this.cache.size();
    }

    public synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    public synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    public void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editor != null) {
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                    abortQuietly(editor);
                }
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public Iterator<String> urls() throws IOException {
        return new Iterator<String>() { // from class: okhttp3.Cache.2
            boolean canRemove;
            final Iterator<DiskLruCache.Snapshot> delegate;

            @Nullable
            String nextUrl;

            {
                this.delegate = Cache.this.cache.snapshots();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    try {
                        DiskLruCache.Snapshot next = this.delegate.next();
                        try {
                            continue;
                            z source = next.getSource(0);
                            Logger logger = q.f33861a;
                            this.nextUrl = new u(source).M();
                            next.close();
                            return true;
                        } finally {
                            try {
                                continue;
                                break;
                            } finally {
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }

            @Override // java.util.Iterator
            public String next() {
                if (hasNext()) {
                    String str = this.nextUrl;
                    this.nextUrl = null;
                    this.canRemove = true;
                    return str;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    public Cache(File file, long j10, FileSystem fileSystem) {
        this.internalCache = new InternalCache() { // from class: okhttp3.Cache.1
            @Override // okhttp3.internal.cache.InternalCache
            @Nullable
            public Response get(Request request) throws IOException {
                return Cache.this.get(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            @Nullable
            public CacheRequest put(Response response) throws IOException {
                return Cache.this.put(response);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void remove(Request request) throws IOException {
                Cache.this.remove(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, VERSION, 2, j10);
    }

    /* loaded from: classes2.dex */
    public static final class Entry {
        private final int code;

        @Nullable
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;
        private static final String SENT_MILLIS = Platform.get().getPrefix() + "-Sent-Millis";
        private static final String RECEIVED_MILLIS = Platform.get().getPrefix() + "-Received-Millis";

        public Entry(z zVar) throws IOException {
            TlsVersion tlsVersion;
            try {
                Logger logger = q.f33861a;
                u uVar = new u(zVar);
                this.url = uVar.M();
                this.requestMethod = uVar.M();
                Headers.Builder builder = new Headers.Builder();
                int readInt = Cache.readInt(uVar);
                for (int i10 = 0; i10 < readInt; i10++) {
                    builder.addLenient(uVar.M());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(uVar.M());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt2 = Cache.readInt(uVar);
                for (int i11 = 0; i11 < readInt2; i11++) {
                    builder2.addLenient(uVar.M());
                }
                String str = SENT_MILLIS;
                String str2 = builder2.get(str);
                String str3 = RECEIVED_MILLIS;
                String str4 = builder2.get(str3);
                builder2.removeAll(str);
                builder2.removeAll(str3);
                this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String M = uVar.M();
                    if (M.length() <= 0) {
                        CipherSuite forJavaName = CipherSuite.forJavaName(uVar.M());
                        List<Certificate> readCertificateList = readCertificateList(uVar);
                        List<Certificate> readCertificateList2 = readCertificateList(uVar);
                        if (!uVar.u()) {
                            tlsVersion = TlsVersion.forJavaName(uVar.M());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.handshake = Handshake.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + M + "\"");
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                zVar.close();
            }
        }

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        private List<Certificate> readCertificateList(d dVar) throws IOException {
            int readInt = Cache.readInt(dVar);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 < readInt; i10++) {
                    String M = dVar.M();
                    b bVar = new b();
                    bVar.Y(e.l(M));
                    arrayList.add(certificateFactory.generateCertificate(new b.a()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private void writeCertList(c cVar, List<Certificate> list) throws IOException {
            try {
                cVar.U(list.size()).writeByte(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    cVar.G(e.v(list.get(i10).getEncoded()).k()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            if (this.url.equals(request.url().toString()) && this.requestMethod.equals(request.method()) && HttpHeaders.varyMatches(response, this.varyHeaders, request)) {
                return true;
            }
            return false;
        }

        public Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public void writeTo(DiskLruCache.Editor editor) throws IOException {
            y newSink = editor.newSink(0);
            Logger logger = q.f33861a;
            t tVar = new t(newSink);
            tVar.G(this.url);
            tVar.writeByte(10);
            tVar.G(this.requestMethod);
            tVar.writeByte(10);
            tVar.U(this.varyHeaders.size());
            tVar.writeByte(10);
            int size = this.varyHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                tVar.G(this.varyHeaders.name(i10));
                tVar.G(": ");
                tVar.G(this.varyHeaders.value(i10));
                tVar.writeByte(10);
            }
            tVar.G(new StatusLine(this.protocol, this.code, this.message).toString());
            tVar.writeByte(10);
            tVar.U(this.responseHeaders.size() + 2);
            tVar.writeByte(10);
            int size2 = this.responseHeaders.size();
            for (int i11 = 0; i11 < size2; i11++) {
                tVar.G(this.responseHeaders.name(i11));
                tVar.G(": ");
                tVar.G(this.responseHeaders.value(i11));
                tVar.writeByte(10);
            }
            tVar.G(SENT_MILLIS);
            tVar.G(": ");
            tVar.U(this.sentRequestMillis);
            tVar.writeByte(10);
            tVar.G(RECEIVED_MILLIS);
            tVar.G(": ");
            tVar.U(this.receivedResponseMillis);
            tVar.writeByte(10);
            if (isHttps()) {
                tVar.writeByte(10);
                tVar.G(this.handshake.cipherSuite().javaName());
                tVar.writeByte(10);
                writeCertList(tVar, this.handshake.peerCertificates());
                writeCertList(tVar, this.handshake.localCertificates());
                tVar.G(this.handshake.tlsVersion().javaName());
                tVar.writeByte(10);
            }
            tVar.close();
        }

        public Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
