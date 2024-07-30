package okhttp3.internal.cache;

import com.anythink.expressad.foundation.g.f.g.c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.a0;
import okio.b;
import okio.d;
import okio.q;
import okio.t;
import okio.u;
import okio.y;
import okio.z;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes2.dex */
public final class CacheInterceptor implements Interceptor {

    @Nullable
    final InternalCache cache;

    public CacheInterceptor(@Nullable InternalCache internalCache) {
        this.cache = internalCache;
    }

    private Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        y body = cacheRequest.body();
        if (body == null) {
            return response;
        }
        final d source = response.body().source();
        Logger logger = q.f33861a;
        final t tVar = new t(body);
        z zVar = new z() { // from class: okhttp3.internal.cache.CacheInterceptor.1
            boolean cacheRequestClosed;

            @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                source.close();
            }

            @Override // okio.z
            public long read(b bVar, long j10) throws IOException {
                try {
                    long read = source.read(bVar, j10);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            tVar.close();
                        }
                        return -1L;
                    }
                    bVar.e(bVar.f33824t - read, tVar.n(), read);
                    tVar.z();
                    return read;
                } catch (IOException e10) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e10;
                }
            }

            @Override // okio.z
            public a0 timeout() {
                return source.timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(response.header("Content-Type"), response.body().contentLength(), new u(zVar))).build();
    }

    private static Headers combine(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String name = headers.name(i10);
            String value = headers.value(i10);
            if ((!"Warning".equalsIgnoreCase(name) || !value.startsWith("1")) && (isContentSpecificHeader(name) || !isEndToEnd(name) || headers2.get(name) == null)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        int size2 = headers2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String name2 = headers2.name(i11);
            if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                Internal.instance.addLenient(builder, name2, headers2.value(i11));
            }
        }
        return builder.build();
    }

    public static boolean isContentSpecificHeader(String str) {
        if (!"Content-Length".equalsIgnoreCase(str) && !HttpConnection.CONTENT_ENCODING.equalsIgnoreCase(str) && !"Content-Type".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static boolean isEndToEnd(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !c.f10011c.equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    private static Response stripBody(Response response) {
        if (response != null && response.body() != null) {
            return response.newBuilder().body(null).build();
        }
        return response;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response response;
        InternalCache internalCache = this.cache;
        if (internalCache != null) {
            response = internalCache.get(chain.request());
        } else {
            response = null;
        }
        CacheStrategy cacheStrategy = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).get();
        Request request = cacheStrategy.networkRequest;
        Response response2 = cacheStrategy.cacheResponse;
        InternalCache internalCache2 = this.cache;
        if (internalCache2 != null) {
            internalCache2.trackResponse(cacheStrategy);
        }
        if (response != null && response2 == null) {
            Util.closeQuietly(response.body());
        }
        if (request == null && response2 == null) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (request == null) {
            return response2.newBuilder().cacheResponse(stripBody(response2)).build();
        }
        try {
            Response proceed = chain.proceed(request);
            if (proceed == null && response != null) {
            }
            if (response2 != null) {
                if (proceed.code() == 304) {
                    Response build = response2.newBuilder().headers(combine(response2.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
                    proceed.body().close();
                    this.cache.trackConditionalCacheHit();
                    this.cache.update(response2, build);
                    return build;
                }
                Util.closeQuietly(response2.body());
            }
            Response build2 = proceed.newBuilder().cacheResponse(stripBody(response2)).networkResponse(stripBody(proceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.hasBody(build2) && CacheStrategy.isCacheable(build2, request)) {
                    return cacheWritingResponse(this.cache.put(build2), build2);
                }
                if (HttpMethod.invalidatesCache(request.method())) {
                    try {
                        this.cache.remove(request);
                    } catch (IOException unused) {
                    }
                }
            }
            return build2;
        } finally {
            if (response != null) {
                Util.closeQuietly(response.body());
            }
        }
    }
}
