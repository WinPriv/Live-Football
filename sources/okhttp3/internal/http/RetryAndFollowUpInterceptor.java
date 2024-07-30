package okhttp3.internal.http;

import a3.l;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.annotation.Nullable;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.Transmitter;
import okhttp3.internal.http2.ConnectionShutdownException;

/* loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    private Request followUpRequest(Response response, @Nullable Route route) throws IOException {
        String header;
        HttpUrl resolve;
        Proxy proxy;
        if (response != null) {
            int code = response.code();
            String method = response.request().method();
            RequestBody requestBody = null;
            if (code != 307 && code != 308) {
                if (code != 401) {
                    if (code != 503) {
                        if (code != 407) {
                            if (code != 408) {
                                switch (code) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.client.retryOnConnectionFailure()) {
                                    return null;
                                }
                                RequestBody body = response.request().body();
                                if (body != null && body.isOneShot()) {
                                    return null;
                                }
                                if ((response.priorResponse() != null && response.priorResponse().code() == 408) || retryAfter(response, 0) > 0) {
                                    return null;
                                }
                                return response.request();
                            }
                        } else {
                            if (route != null) {
                                proxy = route.proxy();
                            } else {
                                proxy = this.client.proxy();
                            }
                            if (proxy.type() == Proxy.Type.HTTP) {
                                return this.client.proxyAuthenticator().authenticate(route, response);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        if ((response.priorResponse() != null && response.priorResponse().code() == 503) || retryAfter(response, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return response.request();
                    }
                } else {
                    return this.client.authenticator().authenticate(route, response);
                }
            } else if (!method.equals("GET") && !method.equals(VersionInfo.GIT_BRANCH)) {
                return null;
            }
            if (!this.client.followRedirects() || (header = response.header("Location")) == null || (resolve = response.request().url().resolve(header)) == null) {
                return null;
            }
            if (!resolve.scheme().equals(response.request().url().scheme()) && !this.client.followSslRedirects()) {
                return null;
            }
            Request.Builder newBuilder = response.request().newBuilder();
            if (HttpMethod.permitsRequestBody(method)) {
                boolean redirectsWithBody = HttpMethod.redirectsWithBody(method);
                if (HttpMethod.redirectsToGet(method)) {
                    newBuilder.method("GET", null);
                } else {
                    if (redirectsWithBody) {
                        requestBody = response.request().body();
                    }
                    newBuilder.method(method, requestBody);
                }
                if (!redirectsWithBody) {
                    newBuilder.removeHeader("Transfer-Encoding");
                    newBuilder.removeHeader("Content-Length");
                    newBuilder.removeHeader("Content-Type");
                }
            }
            if (!Util.sameConnection(response.request().url(), resolve)) {
                newBuilder.removeHeader("Authorization");
            }
            return newBuilder.url(resolve).build();
        }
        throw new IllegalStateException();
    }

    private boolean isRecoverable(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z10) {
                return false;
            }
            return true;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private boolean recover(IOException iOException, Transmitter transmitter, boolean z10, Request request) {
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((z10 && requestIsOneShot(iOException, request)) || !isRecoverable(iOException, z10) || !transmitter.canRetry()) {
            return false;
        }
        return true;
    }

    private boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        if ((body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private int retryAfter(Response response, int i10) {
        String header = response.header("Retry-After");
        if (header == null) {
            return i10;
        }
        if (header.matches("\\d+")) {
            return Integer.valueOf(header).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z10;
        Exchange exchange;
        Route route;
        Request followUpRequest;
        Request request = chain.request();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Transmitter transmitter = realInterceptorChain.transmitter();
        int i10 = 0;
        Response response = null;
        while (true) {
            transmitter.prepareToConnect(request);
            if (!transmitter.isCanceled()) {
                try {
                    try {
                        Response proceed = realInterceptorChain.proceed(request, transmitter, null);
                        if (response != null) {
                            proceed = proceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                        }
                        response = proceed;
                        exchange = Internal.instance.exchange(response);
                        if (exchange != null) {
                            route = exchange.connection().route();
                        } else {
                            route = null;
                        }
                        followUpRequest = followUpRequest(response, route);
                    } catch (IOException e10) {
                        if (!(e10 instanceof ConnectionShutdownException)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!recover(e10, transmitter, z10, request)) {
                            throw e10;
                        }
                    } catch (RouteException e11) {
                        if (!recover(e11.getLastConnectException(), transmitter, false, request)) {
                            throw e11.getFirstConnectException();
                        }
                    }
                    if (followUpRequest == null) {
                        if (exchange != null && exchange.isDuplex()) {
                            transmitter.timeoutEarlyExit();
                        }
                        return response;
                    }
                    RequestBody body = followUpRequest.body();
                    if (body != null && body.isOneShot()) {
                        return response;
                    }
                    Util.closeQuietly(response.body());
                    if (transmitter.hasExchange()) {
                        exchange.detachWithViolence();
                    }
                    i10++;
                    if (i10 <= 20) {
                        request = followUpRequest;
                    } else {
                        throw new ProtocolException(l.i("Too many follow-up requests: ", i10));
                    }
                } finally {
                    transmitter.exchangeDoneDueToException();
                }
            } else {
                throw new IOException("Canceled");
            }
        }
    }
}
