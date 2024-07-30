package d6;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: Log.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f27342a = new Object();

    @Pure
    public static String a(String str, Throwable th) {
        boolean z10;
        String replace;
        synchronized (f27342a) {
            try {
                if (th == null) {
                    replace = null;
                } else {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 != null) {
                            if (th2 instanceof UnknownHostException) {
                                z10 = true;
                                break;
                            }
                            th2 = th2.getCause();
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        replace = "UnknownHostException (no network)";
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "\n  ");
            l10.append(replace.replace("\n", "\n  "));
            l10.append('\n');
            return l10.toString();
        }
        return str;
    }

    @Pure
    public static void b(String str, String str2) {
        synchronized (f27342a) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void c(String str, String str2) {
        synchronized (f27342a) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    @Pure
    public static void e(String str, String str2) {
        synchronized (f27342a) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void f(String str, String str2) {
        synchronized (f27342a) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void g(String str, String str2, Throwable th) {
        f(str, a(str2, th));
    }
}
