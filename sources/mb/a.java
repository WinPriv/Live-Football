package mb;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a {
    @TargetApi(9)
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            Pattern pattern = lb.a.f32591a;
            if (!TextUtils.isEmpty("url is null")) {
                Log.i("UriUtil", lb.a.a("url is null"));
            }
            return str;
        }
        try {
            if (!URLUtil.isNetworkUrl(str)) {
                lb.a.c("UriUtil", "url don't starts with http or https");
                return "";
            }
            return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
        } catch (MalformedURLException e10) {
            lb.a.c("UriUtil", "getHostByURI error  MalformedURLException : " + e10.getMessage());
            return "";
        }
    }
}
