package pc;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class g {
    public static void a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("tramini", 0).edit();
            edit.putString(str, String.valueOf(str2));
            edit.apply();
        } catch (Error | Exception unused) {
        }
    }

    public static String b(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, "");
        } catch (Error | Exception unused) {
            return "";
        }
    }
}
