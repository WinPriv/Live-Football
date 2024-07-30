package gb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.huawei.hms.ads.ex;
import gb.q0;

/* loaded from: classes2.dex */
public final class p0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q0.a f28610s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q0 f28611t;

    public p0(q0 q0Var, q0.a aVar) {
        this.f28611t = q0Var;
        this.f28610s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q0 q0Var = this.f28611t;
        if (q0Var.e()) {
            synchronized (q0Var.f28614b) {
                try {
                    if (q0Var.f28617e == null) {
                        ex.V("HandlerExecAgent", "init handler thread");
                        HandlerThread handlerThread = new HandlerThread(q0Var.f28615c);
                        handlerThread.start();
                        Looper looper = handlerThread.getLooper();
                        if (looper != null) {
                            q0Var.f28617e = handlerThread;
                            n0 n0Var = new n0(new Handler(looper));
                            synchronized (q0Var.f28613a) {
                                q0Var.f28616d = n0Var;
                            }
                        } else {
                            handlerThread.quit();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        n0 a10 = this.f28611t.a();
        if (a10 != null) {
            q0.a aVar = this.f28610s;
            int i10 = aVar.f28618a;
            if (i10 == 1) {
                a10.a(aVar.f28619b, aVar.f28620c, aVar.f28621d);
                return;
            }
            if (i10 == 2) {
                String str = aVar.f28620c;
                Handler handler = a10.f28607a;
                if (handler != null && str != null) {
                    handler.removeCallbacksAndMessages(str);
                }
            }
        }
    }
}
