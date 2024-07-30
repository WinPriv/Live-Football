package okhttp3.internal.http1;

import a3.k;
import com.huawei.openalliance.ad.constant.w;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.a0;
import okio.b;
import okio.c;
import okio.d;
import okio.i;
import okio.y;
import okio.z;
import s.f;

/* loaded from: classes2.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    private static final int HEADER_LIMIT = 262144;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection realConnection;
    private final c sink;
    private final d source;
    private Headers trailers;
    private int state = 0;
    private long headerLimit = 262144;

    /* loaded from: classes2.dex */
    public abstract class AbstractSource implements z {
        protected boolean closed;
        protected final i timeout;

        private AbstractSource() {
            this.timeout = new i(Http1ExchangeCodec.this.source.timeout());
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        @Override // okio.z
        public long read(b bVar, long j10) throws IOException {
            try {
                return Http1ExchangeCodec.this.source.read(bVar, j10);
            } catch (IOException e10) {
                Http1ExchangeCodec.this.realConnection.noNewExchanges();
                responseBodyComplete();
                throw e10;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
            } else {
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }

        @Override // okio.z
        public a0 timeout() {
            return this.timeout;
        }
    }

    /* loaded from: classes2.dex */
    public final class ChunkedSink implements y {
        private boolean closed;
        private final i timeout;

        public ChunkedSink() {
            this.timeout = new i(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.G("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // okio.y, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.y
        public a0 timeout() {
            return this.timeout;
        }

        @Override // okio.y
        public void write(b bVar, long j10) throws IOException {
            if (!this.closed) {
                if (j10 == 0) {
                    return;
                }
                Http1ExchangeCodec.this.sink.K(j10);
                Http1ExchangeCodec.this.sink.G("\r\n");
                Http1ExchangeCodec.this.sink.write(bVar, j10);
                Http1ExchangeCodec.this.sink.G("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes2.dex */
    public class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpUrl url;

        public ChunkedSource(HttpUrl httpUrl) {
            super();
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
            this.url = httpUrl;
        }

        private void readChunkSize() throws IOException {
            if (this.bytesRemainingInChunk != -1) {
                Http1ExchangeCodec.this.source.M();
            }
            try {
                this.bytesRemainingInChunk = Http1ExchangeCodec.this.source.V();
                String trim = Http1ExchangeCodec.this.source.M().trim();
                if (this.bytesRemainingInChunk >= 0 && (trim.isEmpty() || trim.startsWith(w.aG))) {
                    if (this.bytesRemainingInChunk == 0) {
                        this.hasMoreChunks = false;
                        Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
                        http1ExchangeCodec.trailers = http1ExchangeCodec.readHeaders();
                        HttpHeaders.receiveHeaders(Http1ExchangeCodec.this.client.cookieJar(), this.url, Http1ExchangeCodec.this.trailers);
                        responseBodyComplete();
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.realConnection.noNewExchanges();
                responseBodyComplete();
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.z
        public long read(b bVar, long j10) throws IOException {
            if (j10 >= 0) {
                if (!this.closed) {
                    if (!this.hasMoreChunks) {
                        return -1L;
                    }
                    long j11 = this.bytesRemainingInChunk;
                    if (j11 == 0 || j11 == -1) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return -1L;
                        }
                    }
                    long read = super.read(bVar, Math.min(j10, this.bytesRemainingInChunk));
                    if (read != -1) {
                        this.bytesRemainingInChunk -= read;
                        return read;
                    }
                    Http1ExchangeCodec.this.realConnection.noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(k.k("byteCount < 0: ", j10));
        }
    }

    /* loaded from: classes2.dex */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j10) {
            super();
            this.bytesRemaining = j10;
            if (j10 == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.realConnection.noNewExchanges();
                responseBodyComplete();
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.z
        public long read(b bVar, long j10) throws IOException {
            if (j10 >= 0) {
                if (!this.closed) {
                    long j11 = this.bytesRemaining;
                    if (j11 == 0) {
                        return -1L;
                    }
                    long read = super.read(bVar, Math.min(j11, j10));
                    if (read != -1) {
                        long j12 = this.bytesRemaining - read;
                        this.bytesRemaining = j12;
                        if (j12 == 0) {
                            responseBodyComplete();
                        }
                        return read;
                    }
                    Http1ExchangeCodec.this.realConnection.noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(k.k("byteCount < 0: ", j10));
        }
    }

    /* loaded from: classes2.dex */
    public final class KnownLengthSink implements y {
        private boolean closed;
        private final i timeout;

        private KnownLengthSink() {
            this.timeout = new i(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // okio.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // okio.y, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // okio.y
        public a0 timeout() {
            return this.timeout;
        }

        @Override // okio.y
        public void write(b bVar, long j10) throws IOException {
            if (!this.closed) {
                Util.checkOffsetAndCount(bVar.f33824t, 0L, j10);
                Http1ExchangeCodec.this.sink.write(bVar, j10);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes2.dex */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        private UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, okio.z
        public long read(b bVar, long j10) throws IOException {
            if (j10 >= 0) {
                if (!this.closed) {
                    if (this.inputExhausted) {
                        return -1L;
                    }
                    long read = super.read(bVar, j10);
                    if (read == -1) {
                        this.inputExhausted = true;
                        responseBodyComplete();
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalArgumentException(k.k("byteCount < 0: ", j10));
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, d dVar, c cVar) {
        this.client = okHttpClient;
        this.realConnection = realConnection;
        this.source = dVar;
        this.sink = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void detachTimeout(i iVar) {
        a0 a0Var = iVar.f33841a;
        a0 a0Var2 = a0.NONE;
        if (a0Var2 != null) {
            iVar.f33841a = a0Var2;
            a0Var.clearDeadline();
            a0Var.clearTimeout();
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    private y newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    private z newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    private z newFixedLengthSource(long j10) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j10);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    private y newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    private z newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            this.realConnection.noNewExchanges();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    private String readHeaderLine() throws IOException {
        String B = this.source.B(this.headerLimit);
        this.headerLimit -= B.length();
        return B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() != 0) {
                Internal.instance.addLenient(builder, readHeaderLine);
            } else {
                return builder.build();
            }
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        RealConnection realConnection = this.realConnection;
        if (realConnection != null) {
            realConnection.cancel();
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection connection() {
        return this.realConnection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public y createRequestBody(Request request, long j10) throws IOException {
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j10 != -1) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws IOException {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.sink.flush();
    }

    public boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public z openResponseBodySource(Response response) {
        if (!HttpHeaders.hasBody(response)) {
            return newFixedLengthSource(0L);
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return newChunkedSource(response.request().url());
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return newFixedLengthSource(contentLength);
        }
        return newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z10) throws IOException {
        String str;
        int i10 = this.state;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.state);
        }
        try {
            StatusLine parse = StatusLine.parse(readHeaderLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
            if (z10 && parse.code == 100) {
                return null;
            }
            if (parse.code == 100) {
                this.state = 3;
                return headers;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e10) {
            RealConnection realConnection = this.realConnection;
            if (realConnection != null) {
                str = realConnection.route().address().url().redact();
            } else {
                str = "unknown";
            }
            throw new IOException(f.b("unexpected end of stream on ", str), e10);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        if (!HttpHeaders.hasBody(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return -1L;
        }
        return HttpHeaders.contentLength(response);
    }

    public void skipConnectBody(Response response) throws IOException {
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength == -1) {
            return;
        }
        z newFixedLengthSource = newFixedLengthSource(contentLength);
        Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        if (this.state == 6) {
            Headers headers = this.trailers;
            if (headers == null) {
                return Util.EMPTY_HEADERS;
            }
            return headers;
        }
        throw new IllegalStateException("too early; can't read the trailers yet");
    }

    public void writeRequest(Headers headers, String str) throws IOException {
        if (this.state == 0) {
            this.sink.G(str).G("\r\n");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.sink.G(headers.name(i10)).G(": ").G(headers.value(i10)).G("\r\n");
            }
            this.sink.G("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.state);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) throws IOException {
        writeRequest(request.headers(), RequestLine.get(request, this.realConnection.route().proxy().type()));
    }
}
