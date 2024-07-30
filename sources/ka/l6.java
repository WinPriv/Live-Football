package ka;

import android.content.BroadcastReceiver;

/* loaded from: classes2.dex */
public final class l6 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver f31404s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m6 f31405t;

    public l6(m6 m6Var, BroadcastReceiver broadcastReceiver) {
        this.f31405t = m6Var;
        this.f31404s = broadcastReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m6 m6Var = this.f31405t;
        m6Var.f31450a.remove(this.f31404s);
        if (m6Var.f31450a.isEmpty()) {
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new j6(m6Var));
        }
    }
}
