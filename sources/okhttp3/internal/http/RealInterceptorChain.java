package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.Transmitter;

/* loaded from: classes2.dex */
public final class RealInterceptorChain implements Interceptor.Chain {
    private final Call call;
    private int calls;
    private final int connectTimeout;

    @Nullable
    private final Exchange exchange;
    private final int index;
    private final List<Interceptor> interceptors;
    private final int readTimeout;
    private final Request request;
    private final Transmitter transmitter;
    private final int writeTimeout;

    public RealInterceptorChain(List<Interceptor> list, Transmitter transmitter, @Nullable Exchange exchange, int i10, Request request, Call call, int i11, int i12, int i13) {
        this.interceptors = list;
        this.transmitter = transmitter;
        this.exchange = exchange;
        this.index = i10;
        this.request = request;
        this.call = call;
        this.connectTimeout = i11;
        this.readTimeout = i12;
        this.writeTimeout = i13;
    }

    @Override // okhttp3.Interceptor.Chain
    public Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.connectTimeout;
    }

    @Override // okhttp3.Interceptor.Chain
    @Nullable
    public Connection connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.connection();
        }
        return null;
    }

    public Exchange exchange() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange;
        }
        throw new IllegalStateException();
    }

    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request) throws IOException {
        return proceed(request, this.transmitter, this.exchange);
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeout;
    }

    @Override // okhttp3.Interceptor.Chain
    public Request request() {
        return this.request;
    }

    public Transmitter transmitter() {
        return this.transmitter;
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withConnectTimeout(int i10, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.transmitter, this.exchange, this.index, this.request, this.call, Util.checkDuration("timeout", i10, timeUnit), this.readTimeout, this.writeTimeout);
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withReadTimeout(int i10, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.transmitter, this.exchange, this.index, this.request, this.call, this.connectTimeout, Util.checkDuration("timeout", i10, timeUnit), this.writeTimeout);
    }

    @Override // okhttp3.Interceptor.Chain
    public Interceptor.Chain withWriteTimeout(int i10, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.interceptors, this.transmitter, this.exchange, this.index, this.request, this.call, this.connectTimeout, this.readTimeout, Util.checkDuration("timeout", i10, timeUnit));
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeout;
    }

    public Response proceed(Request request, Transmitter transmitter, @Nullable Exchange exchange) throws IOException {
        if (this.index < this.interceptors.size()) {
            this.calls++;
            Exchange exchange2 = this.exchange;
            if (exchange2 != null && !exchange2.connection().supportsUrl(request.url())) {
                throw new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port");
            }
            if (this.exchange != null && this.calls > 1) {
                throw new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once");
            }
            RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.interceptors, transmitter, exchange, this.index + 1, request, this.call, this.connectTimeout, this.readTimeout, this.writeTimeout);
            Interceptor interceptor = this.interceptors.get(this.index);
            Response intercept = interceptor.intercept(realInterceptorChain);
            if (exchange != null && this.index + 1 < this.interceptors.size() && realInterceptorChain.calls != 1) {
                throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
            }
            if (intercept != null) {
                if (intercept.body() != null) {
                    return intercept;
                }
                throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        throw new AssertionError();
    }
}
