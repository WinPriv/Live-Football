package qa;

import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.net.http.HttpsConfig;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class h extends c {

    /* renamed from: s, reason: collision with root package name */
    public final HttpURLConnection f34739s;

    public h(String str, long j10) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f34739s = httpURLConnection;
        HttpsConfig.b(httpURLConnection, true, false);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setUseCaches(false);
        if (j10 > 0) {
            httpURLConnection.setRequestProperty("Range", a3.l.k("bytes=", j10, "-"));
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.connect();
    }

    @Override // qa.c
    public final InputStream b() {
        return this.f34739s.getInputStream();
    }

    @Override // qa.c
    public final String c(String str) {
        return this.f34739s.getHeaderField(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n.J(this.f34739s);
    }

    @Override // qa.c
    public final int e() {
        return this.f34739s.getResponseCode();
    }

    @Override // qa.c
    public final int f() {
        return this.f34739s.getContentLength();
    }
}
