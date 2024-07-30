package okhttp3;

import com.ironsource.adapters.facebook.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.b;
import okio.u;

/* loaded from: classes2.dex */
public final class Response implements Closeable {

    @Nullable
    final ResponseBody body;

    @Nullable
    private volatile CacheControl cacheControl;

    @Nullable
    final Response cacheResponse;
    final int code;

    @Nullable
    final Exchange exchange;

    @Nullable
    final Handshake handshake;
    final Headers headers;
    final String message;

    @Nullable
    final Response networkResponse;

    @Nullable
    final Response priorResponse;
    final Protocol protocol;
    final long receivedResponseAtMillis;
    final Request request;
    final long sentRequestAtMillis;

    public Response(Builder builder) {
        this.request = builder.request;
        this.protocol = builder.protocol;
        this.code = builder.code;
        this.message = builder.message;
        this.handshake = builder.handshake;
        this.headers = builder.headers.build();
        this.body = builder.body;
        this.networkResponse = builder.networkResponse;
        this.cacheResponse = builder.cacheResponse;
        this.priorResponse = builder.priorResponse;
        this.sentRequestAtMillis = builder.sentRequestAtMillis;
        this.receivedResponseAtMillis = builder.receivedResponseAtMillis;
        this.exchange = builder.exchange;
    }

    @Nullable
    public ResponseBody body() {
        return this.body;
    }

    public CacheControl cacheControl() {
        CacheControl cacheControl = this.cacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.parse(this.headers);
            this.cacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    @Nullable
    public Response cacheResponse() {
        return this.cacheResponse;
    }

    public List<Challenge> challenges() {
        String str;
        int i10 = this.code;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 == 407) {
            str = "Proxy-Authenticate";
        } else {
            return Collections.emptyList();
        }
        return HttpHeaders.parseChallenges(headers(), str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public int code() {
        return this.code;
    }

    @Nullable
    public Handshake handshake() {
        return this.handshake;
    }

    @Nullable
    public String header(String str) {
        return header(str, null);
    }

    public List<String> headers(String str) {
        return this.headers.values(str);
    }

    public boolean isRedirect() {
        int i10 = this.code;
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public boolean isSuccessful() {
        int i10 = this.code;
        if (i10 >= 200 && i10 < 300) {
            return true;
        }
        return false;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public Response networkResponse() {
        return this.networkResponse;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public ResponseBody peekBody(long j10) throws IOException {
        u peek = this.body.source().peek();
        b bVar = new b();
        peek.L(j10);
        long min = Math.min(j10, peek.f33873s.f33824t);
        while (min > 0) {
            long read = peek.read(bVar, min);
            if (read != -1) {
                min -= read;
            } else {
                throw new EOFException();
            }
        }
        return ResponseBody.create(this.body.contentType(), bVar.f33824t, bVar);
    }

    @Nullable
    public Response priorResponse() {
        return this.priorResponse;
    }

    public Protocol protocol() {
        return this.protocol;
    }

    public long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public Request request() {
        return this.request;
    }

    public long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available");
    }

    @Nullable
    public String header(String str, @Nullable String str2) {
        String str3 = this.headers.get(str);
        return str3 != null ? str3 : str2;
    }

    public Headers headers() {
        return this.headers;
    }

    /* loaded from: classes2.dex */
    public static class Builder {

        @Nullable
        ResponseBody body;

        @Nullable
        Response cacheResponse;
        int code;

        @Nullable
        Exchange exchange;

        @Nullable
        Handshake handshake;
        Headers.Builder headers;
        String message;

        @Nullable
        Response networkResponse;

        @Nullable
        Response priorResponse;

        @Nullable
        Protocol protocol;
        long receivedResponseAtMillis;

        @Nullable
        Request request;
        long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private void checkPriorResponse(Response response) {
            if (response.body == null) {
            } else {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void checkSupportResponse(String str, Response response) {
            if (response.body == null) {
                if (response.networkResponse == null) {
                    if (response.cacheResponse == null) {
                        if (response.priorResponse == null) {
                            return;
                        } else {
                            throw new IllegalArgumentException(a.h(str, ".priorResponse != null"));
                        }
                    }
                    throw new IllegalArgumentException(a.h(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(a.h(str, ".networkResponse != null"));
            }
            throw new IllegalArgumentException(a.h(str, ".body != null"));
        }

        public Builder addHeader(String str, String str2) {
            this.headers.add(str, str2);
            return this;
        }

        public Builder body(@Nullable ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        public Response build() {
            if (this.request != null) {
                if (this.protocol != null) {
                    if (this.code >= 0) {
                        if (this.message != null) {
                            return new Response(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.code);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        public Builder cacheResponse(@Nullable Response response) {
            if (response != null) {
                checkSupportResponse("cacheResponse", response);
            }
            this.cacheResponse = response;
            return this;
        }

        public Builder code(int i10) {
            this.code = i10;
            return this;
        }

        public Builder handshake(@Nullable Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String str, String str2) {
            this.headers.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            this.headers = headers.newBuilder();
            return this;
        }

        public void initExchange(Exchange exchange) {
            this.exchange = exchange;
        }

        public Builder message(String str) {
            this.message = str;
            return this;
        }

        public Builder networkResponse(@Nullable Response response) {
            if (response != null) {
                checkSupportResponse("networkResponse", response);
            }
            this.networkResponse = response;
            return this;
        }

        public Builder priorResponse(@Nullable Response response) {
            if (response != null) {
                checkPriorResponse(response);
            }
            this.priorResponse = response;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long j10) {
            this.receivedResponseAtMillis = j10;
            return this;
        }

        public Builder removeHeader(String str) {
            this.headers.removeAll(str);
            return this;
        }

        public Builder request(Request request) {
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long j10) {
            this.sentRequestAtMillis = j10;
            return this;
        }

        public Builder(Response response) {
            this.code = -1;
            this.request = response.request;
            this.protocol = response.protocol;
            this.code = response.code;
            this.message = response.message;
            this.handshake = response.handshake;
            this.headers = response.headers.newBuilder();
            this.body = response.body;
            this.networkResponse = response.networkResponse;
            this.cacheResponse = response.cacheResponse;
            this.priorResponse = response.priorResponse;
            this.sentRequestAtMillis = response.sentRequestAtMillis;
            this.receivedResponseAtMillis = response.receivedResponseAtMillis;
            this.exchange = response.exchange;
        }
    }
}
