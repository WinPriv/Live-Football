package ka;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes2.dex */
public final class k6 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver f31364s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ IntentFilter f31365t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m6 f31366u;

    public k6(m6 m6Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f31366u = m6Var;
        this.f31364s = broadcastReceiver;
        this.f31365t = intentFilter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m6 m6Var = this.f31366u;
        if (m6Var.f31450a.isEmpty()) {
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new i6(m6Var));
        }
        m6Var.f31450a.put(this.f31364s, this.f31365t);
    }
}
