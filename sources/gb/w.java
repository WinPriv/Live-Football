package gb;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f28641a = new n0(new Handler(Looper.getMainLooper()));

    public static void a(long j10, Runnable runnable) {
        f28641a.a(runnable, null, j10);
    }

    public static void b(Runnable runnable) {
        f28641a.a(runnable, null, 0L);
    }

    public static void c(Runnable runnable, String str, long j10) {
        f28641a.a(runnable, str, j10);
    }

    public static void d(String str) {
        Handler handler = f28641a.f28607a;
        if (handler != null && str != null) {
            handler.removeCallbacksAndMessages(str);
        }
    }
}
