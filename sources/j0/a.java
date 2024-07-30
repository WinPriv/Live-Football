package j0;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;

/* compiled from: BuildCompat.java */
/* loaded from: classes.dex */
public final class a {
    public static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) < 0) {
            return false;
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && (i10 < 30 || !a("S", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }

    public static boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && (i10 < 32 || !a("Tiramisu", Build.VERSION.CODENAME))) {
            return false;
        }
        return true;
    }
}
