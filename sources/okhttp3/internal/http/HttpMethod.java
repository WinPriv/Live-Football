package okhttp3.internal.http;

import com.android.volley.toolbox.HttpClientStack;
import com.ironsource.mediationsdk.config.VersionInfo;

/* loaded from: classes2.dex */
public final class HttpMethod {
    private HttpMethod() {
    }

    public static boolean invalidatesCache(String str) {
        if (!str.equals("POST") && !str.equals(HttpClientStack.HttpPatch.METHOD_NAME) && !str.equals("PUT") && !str.equals("DELETE") && !str.equals("MOVE")) {
            return false;
        }
        return true;
    }

    public static boolean permitsRequestBody(String str) {
        if (!str.equals("GET") && !str.equals(VersionInfo.GIT_BRANCH)) {
            return true;
        }
        return false;
    }

    public static boolean redirectsToGet(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean redirectsWithBody(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean requiresRequestBody(String str) {
        if (!str.equals("POST") && !str.equals("PUT") && !str.equals(HttpClientStack.HttpPatch.METHOD_NAME) && !str.equals("PROPPATCH") && !str.equals("REPORT")) {
            return false;
        }
        return true;
    }
}
