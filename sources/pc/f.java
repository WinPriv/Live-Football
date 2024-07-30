package pc;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class f {
    public static boolean a() {
        String property;
        int parseInt;
        try {
            property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = "-1";
            }
            parseInt = Integer.parseInt(property2);
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(property) && parseInt != -1) {
            return true;
        }
        return false;
    }
}
