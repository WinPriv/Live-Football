package gb;

import android.os.HandlerThread;
import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class o0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q0 f28609s;

    public o0(q0 q0Var) {
        this.f28609s = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f28609s.f28614b) {
            HandlerThread handlerThread = this.f28609s.f28617e;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.f28609s.f28617e = null;
            }
            q0 q0Var = this.f28609s;
            synchronized (q0Var.f28613a) {
                q0Var.f28616d = null;
            }
            ex.V("HandlerExecAgent", "quit thread and release");
        }
    }
}
