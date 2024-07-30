package gb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f28607a;

    public n0(Handler handler) {
        this.f28607a = handler;
    }

    public final void a(Runnable runnable, String str, long j10) {
        Looper looper;
        Handler handler = this.f28607a;
        if (handler == null || runnable == null) {
            return;
        }
        if (j10 < 0) {
            j10 = 0;
        }
        v vVar = new v(runnable);
        if (j10 == 0) {
            boolean z10 = false;
            if (handler != null && (looper = handler.getLooper()) != null) {
                if (Thread.currentThread() == looper.getThread()) {
                    z10 = true;
                }
            }
            if (z10) {
                vVar.run();
                return;
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis() + j10;
        try {
            Message obtain = Message.obtain(handler, vVar);
            obtain.setAsynchronous(true);
            obtain.obj = str;
            handler.sendMessageAtTime(obtain, uptimeMillis);
        } catch (Throwable unused) {
            handler.postAtTime(vVar, str, uptimeMillis);
        }
    }
}
