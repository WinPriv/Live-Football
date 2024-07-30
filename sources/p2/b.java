package p2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DefaultLottieNetworkFetcher.java */
/* loaded from: classes.dex */
public final class b {
    public static a a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
