package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import okio.b;
import okio.g;
import okio.h;
import okio.q;
import okio.u;
import okio.y;
import okio.z;

/* loaded from: classes2.dex */
public final class Exchange {
    final Call call;
    final ExchangeCodec codec;
    private boolean duplex;
    final EventListener eventListener;
    final ExchangeFinder finder;
    final Transmitter transmitter;

    /* loaded from: classes2.dex */
    public final class RequestBodySink extends g {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private long contentLength;

        public RequestBodySink(y yVar, long j10) {
            super(yVar);
            this.contentLength = j10;
        }

        @Nullable
        private IOException complete(@Nullable IOException iOException) {
            if (this.completed) {
                return iOException;
            }
            this.completed = true;
            return Exchange.this.bodyComplete(this.bytesReceived, false, true, iOException);
        }

        @Override // okio.g, okio.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j10 = this.contentLength;
            if (j10 != -1 && this.bytesReceived != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e10) {
                throw complete(e10);
            }
        }

        @Override // okio.g, okio.y, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw complete(e10);
            }
        }

        @Override // okio.g, okio.y
        public void write(b bVar, long j10) throws IOException {
            if (!this.closed) {
                long j11 = this.contentLength;
                if (j11 != -1 && this.bytesReceived + j10 > j11) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j10));
                }
                try {
                    super.write(bVar, j10);
                    this.bytesReceived += j10;
                    return;
                } catch (IOException e10) {
                    throw complete(e10);
                }
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes2.dex */
    public final class ResponseBodySource extends h {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;

        public ResponseBodySource(z zVar, long j10) {
            super(zVar);
            this.contentLength = j10;
            if (j10 == 0) {
                complete(null);
            }
        }

        @Override // okio.h, okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e10) {
                throw complete(e10);
            }
        }

        @Nullable
        public IOException complete(@Nullable IOException iOException) {
            if (this.completed) {
                return iOException;
            }
            this.completed = true;
            return Exchange.this.bodyComplete(this.bytesReceived, true, false, iOException);
        }

        @Override // okio.h, okio.z
        public long read(b bVar, long j10) throws IOException {
            if (!this.closed) {
                try {
                    long read = delegate().read(bVar, j10);
                    if (read == -1) {
                        complete(null);
                        return -1L;
                    }
                    long j11 = this.bytesReceived + read;
                    long j12 = this.contentLength;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j11);
                    }
                    this.bytesReceived = j11;
                    if (j11 == j12) {
                        complete(null);
                    }
                    return read;
                } catch (IOException e10) {
                    throw complete(e10);
                }
            }
            throw new IllegalStateException("closed");
        }
    }

    public Exchange(Transmitter transmitter, Call call, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        this.transmitter = transmitter;
        this.call = call;
        this.eventListener = eventListener;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
    }

    @Nullable
    public IOException bodyComplete(long j10, boolean z10, boolean z11, @Nullable IOException iOException) {
        if (iOException != null) {
            trackFailure(iOException);
        }
        if (z11) {
            if (iOException != null) {
                this.eventListener.requestFailed(this.call, iOException);
            } else {
                this.eventListener.requestBodyEnd(this.call, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.eventListener.responseFailed(this.call, iOException);
            } else {
                this.eventListener.responseBodyEnd(this.call, j10);
            }
        }
        return this.transmitter.exchangeMessageDone(this, z11, z10, iOException);
    }

    public void cancel() {
        this.codec.cancel();
    }

    public RealConnection connection() {
        return this.codec.connection();
    }

    public y createRequestBody(Request request, boolean z10) throws IOException {
        this.duplex = z10;
        long contentLength = request.body().contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this.codec.createRequestBody(request, contentLength), contentLength);
    }

    public void detachWithViolence() {
        this.codec.cancel();
        this.transmitter.exchangeMessageDone(this, true, true, null);
    }

    public void finishRequest() throws IOException {
        try {
            this.codec.finishRequest();
        } catch (IOException e10) {
            this.eventListener.requestFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }

    public void flushRequest() throws IOException {
        try {
            this.codec.flushRequest();
        } catch (IOException e10) {
            this.eventListener.requestFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }

    public boolean isDuplex() {
        return this.duplex;
    }

    public RealWebSocket.Streams newWebSocketStreams() throws SocketException {
        this.transmitter.timeoutEarlyExit();
        return this.codec.connection().newWebSocketStreams(this);
    }

    public void noNewExchangesOnConnection() {
        this.codec.connection().noNewExchanges();
    }

    public void noRequestBody() {
        this.transmitter.exchangeMessageDone(this, true, false, null);
    }

    public ResponseBody openResponseBody(Response response) throws IOException {
        try {
            this.eventListener.responseBodyStart(this.call);
            String header = response.header("Content-Type");
            long reportedContentLength = this.codec.reportedContentLength(response);
            ResponseBodySource responseBodySource = new ResponseBodySource(this.codec.openResponseBodySource(response), reportedContentLength);
            Logger logger = q.f33861a;
            return new RealResponseBody(header, reportedContentLength, new u(responseBodySource));
        } catch (IOException e10) {
            this.eventListener.responseFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }

    @Nullable
    public Response.Builder readResponseHeaders(boolean z10) throws IOException {
        try {
            Response.Builder readResponseHeaders = this.codec.readResponseHeaders(z10);
            if (readResponseHeaders != null) {
                Internal.instance.initExchange(readResponseHeaders, this);
            }
            return readResponseHeaders;
        } catch (IOException e10) {
            this.eventListener.responseFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }

    public void responseHeadersEnd(Response response) {
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public void timeoutEarlyExit() {
        this.transmitter.timeoutEarlyExit();
    }

    public void trackFailure(IOException iOException) {
        this.finder.trackFailure();
        this.codec.connection().trackFailure(iOException);
    }

    public Headers trailers() throws IOException {
        return this.codec.trailers();
    }

    public void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public void writeRequestHeaders(Request request) throws IOException {
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e10) {
            this.eventListener.requestFailed(this.call, e10);
            trackFailure(e10);
            throw e10;
        }
    }
}
