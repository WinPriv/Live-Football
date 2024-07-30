package ka;

import android.content.BroadcastReceiver;
import android.content.Context;

/* loaded from: classes2.dex */
public final class j6 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m6 f31321s;

    public j6(m6 m6Var) {
        this.f31321s = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m6 m6Var = this.f31321s;
        BroadcastReceiver broadcastReceiver = m6Var.f31451b;
        if (broadcastReceiver == null) {
            return;
        }
        Context context = m6Var.f31452c;
        if (context != null) {
            context.unregisterReceiver(broadcastReceiver);
        }
        m6Var.f31451b = null;
    }
}
