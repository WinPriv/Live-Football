package okhttp3.internal.http;

import a3.k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.logging.Logger;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okio.q;
import okio.t;
import okio.y;

/* loaded from: classes2.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z10) {
        this.forWebSocket = z10;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z10;
        Response build;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.exchange();
        Request request = realInterceptorChain.request();
        long currentTimeMillis = System.currentTimeMillis();
        exchange.writeRequestHeaders(request);
        Response.Builder builder = null;
        if (HttpMethod.permitsRequestBody(request.method()) && request.body() != null) {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                exchange.flushRequest();
                exchange.responseHeadersStart();
                builder = exchange.readResponseHeaders(true);
                z10 = true;
            } else {
                z10 = false;
            }
            if (builder == null) {
                if (request.body().isDuplex()) {
                    exchange.flushRequest();
                    y createRequestBody = exchange.createRequestBody(request, true);
                    Logger logger = q.f33861a;
                    request.body().writeTo(new t(createRequestBody));
                } else {
                    y createRequestBody2 = exchange.createRequestBody(request, false);
                    Logger logger2 = q.f33861a;
                    t tVar = new t(createRequestBody2);
                    request.body().writeTo(tVar);
                    tVar.close();
                }
            } else {
                exchange.noRequestBody();
                if (!exchange.connection().isMultiplexed()) {
                    exchange.noNewExchangesOnConnection();
                }
            }
        } else {
            exchange.noRequestBody();
            z10 = false;
        }
        if (request.body() == null || !request.body().isDuplex()) {
            exchange.finishRequest();
        }
        if (!z10) {
            exchange.responseHeadersStart();
        }
        if (builder == null) {
            builder = exchange.readResponseHeaders(false);
        }
        Response build2 = builder.request(request).handshake(exchange.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build2.code();
        if (code == 100) {
            build2 = exchange.readResponseHeaders(false).request(request).handshake(exchange.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build2.code();
        }
        exchange.responseHeadersEnd(build2);
        if (this.forWebSocket && code == 101) {
            build = build2.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            build = build2.newBuilder().body(exchange.openResponseBody(build2)).build();
        }
        if ("close".equalsIgnoreCase(build.request().header("Connection")) || "close".equalsIgnoreCase(build.header("Connection"))) {
            exchange.noNewExchangesOnConnection();
        }
        if ((code != 204 && code != 205) || build.body().contentLength() <= 0) {
            return build;
        }
        StringBuilder n10 = k.n("HTTP ", code, " had non-zero Content-Length: ");
        n10.append(build.body().contentLength());
        throw new ProtocolException(n10.toString());
    }
}
