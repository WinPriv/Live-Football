package ka;

import android.content.Context;
import android.content.IntentFilter;
import ka.m6;

/* loaded from: classes2.dex */
public final class i6 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m6 f31269s;

    public i6(m6 m6Var) {
        this.f31269s = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m6 m6Var = this.f31269s;
        if (m6Var.f31451b != null) {
            com.huawei.openalliance.ad.ppskit.utils.d2.a(new j6(m6Var));
        }
        m6Var.f31451b = new m6.a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        Context context = m6Var.f31452c;
        if (context != null) {
            context.registerReceiver(m6Var.f31451b, intentFilter);
        }
    }
}
