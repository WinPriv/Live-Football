package qa;

import com.huawei.openalliance.ad.ppskit.net.http.HttpsConfig;
import j7.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import ka.n7;
import okhttp3.CacheControl;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class i extends c {

    /* renamed from: u, reason: collision with root package name */
    public static OkHttpClient f34740u;

    /* renamed from: v, reason: collision with root package name */
    public static OkHttpClient f34741v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f34742w = new byte[0];

    /* renamed from: s, reason: collision with root package name */
    public Response f34743s;

    /* renamed from: t, reason: collision with root package name */
    public ResponseBody f34744t;

    public i(String str, long j10) {
        Request.Builder url = new Request.Builder().url(str);
        if (j10 > 0) {
            url.header("Range", a3.l.k("bytes=", j10, "-"));
        }
        url.header("Accept-Encoding", "identity");
        url.cacheControl(CacheControl.FORCE_NETWORK);
        Request build = url.build();
        if (h(build, false)) {
            h(build, true);
        }
    }

    public static OkHttpClient g(boolean z10) {
        OkHttpClient okHttpClient;
        synchronized (f34742w) {
            if (f34740u == null || f34741v == null) {
                OkHttpClient.Builder connectionPool = new OkHttpClient.Builder().connectionPool(new ConnectionPool(8, 10L, TimeUnit.MINUTES));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                OkHttpClient.Builder connectTimeout = connectionPool.readTimeout(10000L, timeUnit).connectTimeout(10000L, timeUnit);
                Protocol protocol = Protocol.HTTP_2;
                OkHttpClient.Builder protocols = connectTimeout.protocols(Collections.unmodifiableList(Arrays.asList(protocol, Protocol.HTTP_1_1)));
                HttpsConfig.c(protocols, false, false);
                try {
                    protocols.dispatcher(protocols.createDispatcher(protocol));
                } catch (Throwable unused) {
                    n7.g("OkHttpNetworkConnection", "createDispatcher encounter exception");
                }
                f34740u = protocols.build();
                f34741v = protocols.dns(new com.huawei.openalliance.ad.ppskit.net.http.i()).build();
            }
            if (z10) {
                okHttpClient = f34741v;
            } else {
                okHttpClient = f34740u;
            }
        }
        return okHttpClient;
    }

    @Override // qa.c
    public final InputStream b() {
        ResponseBody responseBody = this.f34744t;
        if (responseBody != null) {
            return responseBody.byteStream();
        }
        throw new IOException("get input stream error");
    }

    @Override // qa.c
    public final String c(String str) {
        Response response = this.f34743s;
        if (response == null) {
            return "";
        }
        return response.header(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Response response = this.f34743s;
        if (response != null) {
            response.close();
            return;
        }
        throw new IOException("close stream error");
    }

    @Override // qa.c
    public final int e() {
        Response response = this.f34743s;
        if (response != null) {
            return response.code();
        }
        throw new IOException("get response code error");
    }

    @Override // qa.c
    public final int f() {
        ResponseBody responseBody = this.f34744t;
        if (responseBody == null) {
            return -1;
        }
        return (int) responseBody.contentLength();
    }

    public final boolean h(Request request, boolean z10) {
        boolean z11 = false;
        try {
            Response execute = g(z10).newCall(request).execute();
            this.f34743s = execute;
            if (8 == r.k(execute.code())) {
                z11 = true;
            }
            this.f34744t = this.f34743s.body();
        } catch (IOException e10) {
            n7.g("OkHttpNetworkConnection", "http execute encounter IOException:".concat(e10.getClass().getSimpleName()));
            if (r.v(e10)) {
                return true;
            }
        }
        return z11;
    }
}
