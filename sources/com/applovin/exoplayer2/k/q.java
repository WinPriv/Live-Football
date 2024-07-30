package com.applovin.exoplayer2.k;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.l.ai;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public class q extends e implements t {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16163b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16164c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16165d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16166e;
    private final t.f f;

    /* renamed from: g, reason: collision with root package name */
    private final t.f f16167g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f16168h;

    /* renamed from: i, reason: collision with root package name */
    private Predicate<String> f16169i;

    /* renamed from: j, reason: collision with root package name */
    private l f16170j;

    /* renamed from: k, reason: collision with root package name */
    private HttpURLConnection f16171k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f16172l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16173m;

    /* renamed from: n, reason: collision with root package name */
    private int f16174n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private long f16175p;

    /* loaded from: classes.dex */
    public static final class a implements t.b {

        /* renamed from: b, reason: collision with root package name */
        private aa f16177b;

        /* renamed from: c, reason: collision with root package name */
        private Predicate<String> f16178c;

        /* renamed from: d, reason: collision with root package name */
        private String f16179d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f16181g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f16182h;

        /* renamed from: a, reason: collision with root package name */
        private final t.f f16176a = new t.f();

        /* renamed from: e, reason: collision with root package name */
        private int f16180e = 8000;
        private int f = 8000;

        @Override // com.applovin.exoplayer2.k.t.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a() {
            q qVar = new q(this.f16179d, this.f16180e, this.f, this.f16181g, this.f16176a, this.f16178c, this.f16182h);
            aa aaVar = this.f16177b;
            if (aaVar != null) {
                qVar.a(aaVar);
            }
            return qVar;
        }

        public a a(String str) {
            this.f16179d = str;
            return this;
        }
    }

    private HttpURLConnection d(l lVar) throws IOException {
        HttpURLConnection a10;
        boolean z10;
        URL url = new URL(lVar.f16095a.toString());
        int i10 = lVar.f16097c;
        byte[] bArr = lVar.f16098d;
        long j10 = lVar.f16100g;
        long j11 = lVar.f16101h;
        boolean b10 = lVar.b(1);
        if (!this.f16163b && !this.f16168h) {
            return a(url, i10, bArr, j10, j11, b10, true, lVar.f16099e);
        }
        URL url2 = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 <= 20) {
                long j12 = j10;
                long j13 = j10;
                int i14 = i11;
                URL url3 = url2;
                long j14 = j11;
                a10 = a(url2, i11, bArr2, j12, j11, b10, false, lVar.f16099e);
                int responseCode = a10.getResponseCode();
                String headerField = a10.getHeaderField("Location");
                if ((i14 != 1 && i14 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    a10.disconnect();
                    if (this.f16168h && responseCode == 302) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        bArr2 = null;
                        i11 = 1;
                    } else {
                        i11 = i14;
                    }
                    url2 = a(url3, headerField, lVar);
                } else {
                    a10.disconnect();
                    url2 = a(url3, headerField, lVar);
                    i11 = i14;
                }
                i12 = i13;
                j10 = j13;
                j11 = j14;
            } else {
                throw new t.c(new NoRouteToHostException(a3.l.i("Too many redirects: ", i13)), lVar, 2001, 1);
            }
        }
        return a10;
    }

    private void e() {
        HttpURLConnection httpURLConnection = this.f16171k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                com.applovin.exoplayer2.l.q.c("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f16171k = null;
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        HttpURLConnection httpURLConnection = this.f16171k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f16171k;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws t.c {
        try {
            InputStream inputStream = this.f16172l;
            if (inputStream != null) {
                long j10 = this.o;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f16175p;
                }
                a(this.f16171k, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new t.c(e10, (l) ai.a(this.f16170j), 2000, 3);
                }
            }
        } finally {
            this.f16172l = null;
            e();
            if (this.f16173m) {
                this.f16173m = false;
                d();
            }
        }
    }

    @Deprecated
    public q() {
        this(null, 8000, 8000);
    }

    private int b(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.o;
        if (j10 != -1) {
            long j11 = j10 - this.f16175p;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) ai.a(this.f16172l)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f16175p += read;
        a(read);
        return read;
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws t.c {
        byte[] bArr;
        this.f16170j = lVar;
        long j10 = 0;
        this.f16175p = 0L;
        this.o = 0L;
        b(lVar);
        try {
            HttpURLConnection d10 = d(lVar);
            this.f16171k = d10;
            this.f16174n = d10.getResponseCode();
            String responseMessage = d10.getResponseMessage();
            int i10 = this.f16174n;
            if (i10 >= 200 && i10 <= 299) {
                String contentType = d10.getContentType();
                Predicate<String> predicate = this.f16169i;
                if (predicate != null && !predicate.apply(contentType)) {
                    e();
                    throw new t.d(contentType, lVar);
                }
                if (this.f16174n == 200) {
                    long j11 = lVar.f16100g;
                    if (j11 != 0) {
                        j10 = j11;
                    }
                }
                boolean a10 = a(d10);
                if (!a10) {
                    long j12 = lVar.f16101h;
                    if (j12 != -1) {
                        this.o = j12;
                    } else {
                        long a11 = u.a(d10.getHeaderField("Content-Length"), d10.getHeaderField("Content-Range"));
                        this.o = a11 != -1 ? a11 - j10 : -1L;
                    }
                } else {
                    this.o = lVar.f16101h;
                }
                try {
                    this.f16172l = d10.getInputStream();
                    if (a10) {
                        this.f16172l = new GZIPInputStream(this.f16172l);
                    }
                    this.f16173m = true;
                    c(lVar);
                    try {
                        a(j10, lVar);
                        return this.o;
                    } catch (IOException e10) {
                        e();
                        if (e10 instanceof t.c) {
                            throw ((t.c) e10);
                        }
                        throw new t.c(e10, lVar, 2000, 1);
                    }
                } catch (IOException e11) {
                    e();
                    throw new t.c(e11, lVar, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = d10.getHeaderFields();
            if (this.f16174n == 416) {
                if (lVar.f16100g == u.a(d10.getHeaderField("Content-Range"))) {
                    this.f16173m = true;
                    c(lVar);
                    long j13 = lVar.f16101h;
                    if (j13 != -1) {
                        return j13;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = d10.getErrorStream();
            try {
                bArr = errorStream != null ? ai.a(errorStream) : ai.f;
            } catch (IOException unused) {
                bArr = ai.f;
            }
            byte[] bArr2 = bArr;
            e();
            throw new t.e(this.f16174n, responseMessage, this.f16174n == 416 ? new j(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, lVar, bArr2);
        } catch (IOException e12) {
            e();
            throw t.c.a(e12, lVar, 1);
        }
    }

    @Deprecated
    public q(String str, int i10, int i11) {
        this(str, i10, i11, false, null);
    }

    @Deprecated
    public q(String str, int i10, int i11, boolean z10, t.f fVar) {
        this(str, i10, i11, z10, fVar, null, false);
    }

    private q(String str, int i10, int i11, boolean z10, t.f fVar, Predicate<String> predicate, boolean z11) {
        super(true);
        this.f16166e = str;
        this.f16164c = i10;
        this.f16165d = i11;
        this.f16163b = z10;
        this.f = fVar;
        this.f16169i = predicate;
        this.f16167g = new t.f();
        this.f16168h = z11;
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws t.c {
        try {
            return b(bArr, i10, i11);
        } catch (IOException e10) {
            throw t.c.a(e10, (l) ai.a(this.f16170j), 2);
        }
    }

    private HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection a10 = a(url);
        a10.setConnectTimeout(this.f16164c);
        a10.setReadTimeout(this.f16165d);
        HashMap hashMap = new HashMap();
        t.f fVar = this.f;
        if (fVar != null) {
            hashMap.putAll(fVar.a());
        }
        hashMap.putAll(this.f16167g.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            a10.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a11 = u.a(j10, j11);
        if (a11 != null) {
            a10.setRequestProperty("Range", a11);
        }
        String str = this.f16166e;
        if (str != null) {
            a10.setRequestProperty("User-Agent", str);
        }
        a10.setRequestProperty("Accept-Encoding", z10 ? com.anythink.expressad.foundation.g.f.g.c.f10012d : "identity");
        a10.setInstanceFollowRedirects(z11);
        a10.setDoOutput(bArr != null);
        a10.setRequestMethod(l.a(i10));
        if (bArr != null) {
            a10.setFixedLengthStreamingMode(bArr.length);
            a10.connect();
            OutputStream outputStream = a10.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            a10.connect();
        }
        return a10;
    }

    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    private URL a(URL url, String str, l lVar) throws t.c {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new t.c(s.f.b("Unsupported protocol redirect: ", protocol), lVar, 2001, 1);
                }
                if (this.f16163b || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new t.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", lVar, 2001, 1);
            } catch (MalformedURLException e10) {
                throw new t.c(e10, lVar, 2001, 1);
            }
        }
        throw new t.c("Null location redirect", lVar, 2001, 1);
    }

    private void a(long j10, l lVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int read = ((InputStream) ai.a(this.f16172l)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new t.c(new InterruptedIOException(), lVar, 2000, 1);
            }
            if (read != -1) {
                j10 -= read;
                a(read);
            } else {
                throw new t.c(lVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
            }
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = ai.f16274a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) com.applovin.exoplayer2.l.a.b(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        return com.anythink.expressad.foundation.g.f.g.c.f10012d.equalsIgnoreCase(httpURLConnection.getHeaderField(HttpConnection.CONTENT_ENCODING));
    }
}
