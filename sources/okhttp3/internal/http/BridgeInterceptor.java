package okhttp3.internal.http;

import com.anythink.expressad.foundation.g.f.g.c;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okio.k;
import okio.q;
import okio.u;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes2.dex */
public final class BridgeInterceptor implements Interceptor {
    private final CookieJar cookieJar;

    public BridgeInterceptor(CookieJar cookieJar) {
        this.cookieJar = cookieJar;
    }

    private String cookieHeader(List<Cookie> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append("; ");
            }
            Cookie cookie = list.get(i10);
            sb2.append(cookie.name());
            sb2.append('=');
            sb2.append(cookie.value());
        }
        return sb2.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        RequestBody body = request.body();
        if (body != null) {
            MediaType contentType = body.contentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", Long.toString(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
        }
        boolean z10 = false;
        if (request.header("Host") == null) {
            newBuilder.header("Host", Util.hostHeader(request.url(), false));
        }
        if (request.header("Connection") == null) {
            newBuilder.header("Connection", c.f10011c);
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            newBuilder.header("Accept-Encoding", c.f10012d);
            z10 = true;
        }
        List<Cookie> loadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder.header("Cookie", cookieHeader(loadForRequest));
        }
        if (request.header("User-Agent") == null) {
            newBuilder.header("User-Agent", Version.userAgent());
        }
        Response proceed = chain.proceed(newBuilder.build());
        HttpHeaders.receiveHeaders(this.cookieJar, request.url(), proceed.headers());
        Response.Builder request2 = proceed.newBuilder().request(request);
        if (z10 && c.f10012d.equalsIgnoreCase(proceed.header(HttpConnection.CONTENT_ENCODING)) && HttpHeaders.hasBody(proceed)) {
            k kVar = new k(proceed.body().source());
            request2.headers(proceed.headers().newBuilder().removeAll(HttpConnection.CONTENT_ENCODING).removeAll("Content-Length").build());
            String header = proceed.header("Content-Type");
            Logger logger = q.f33861a;
            request2.body(new RealResponseBody(header, -1L, new u(kVar)));
        }
        return request2.build();
    }
}
