package ka;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class n7 {

    /* renamed from: a, reason: collision with root package name */
    public static final p7 f31494a = new p7();

    public static void a() {
        f31494a.getClass();
    }

    public static void b(String str, String str2) {
        f31494a.b(3, str, str2);
    }

    public static void c(String str, String str2, Object... objArr) {
        if (d()) {
            b(str, String.format(Locale.ENGLISH, str2, objArr));
        }
    }

    public static boolean d() {
        return f31494a.a(3);
    }

    public static void e(String str, String str2) {
        f31494a.b(4, str, str2);
    }

    public static void f(String str, String str2, Object... objArr) {
        if (f31494a.a(4)) {
            e(str, String.format(Locale.ENGLISH, str2, objArr));
        }
    }

    public static void g(String str, String str2) {
        String simpleName;
        String str3;
        try {
            f31494a.b(5, str, str2);
        } catch (RuntimeException e10) {
            simpleName = e10.getClass().getSimpleName();
            str3 = "log w ";
            Log.w("TAG", str3.concat(simpleName));
        } catch (Throwable th) {
            simpleName = th.getClass().getSimpleName();
            str3 = "log w ex: ";
            Log.w("TAG", str3.concat(simpleName));
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (f31494a.a(5) && str2 != null) {
            g(str, String.format(Locale.ENGLISH, str2, objArr));
        }
    }

    public static void i(String str, String str2) {
        f31494a.b(6, str, str2);
    }

    public static void j(String str, String str2, Object... objArr) {
        if (f31494a.a(6)) {
            i(str, String.format(Locale.ENGLISH, str2, objArr));
        }
    }
}
