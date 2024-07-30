package ka;

import android.content.Context;
import ka.a7;

/* loaded from: classes2.dex */
public final class ld implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31418s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ad f31419t;

    public ld(ad adVar, String str) {
        this.f31419t = adVar;
        this.f31418s = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        a7 a7Var;
        if (!com.huawei.openalliance.ad.constant.w.cp.equalsIgnoreCase(this.f31419t.f30934a.getPackageName())) {
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f31419t.f30934a);
            String str = this.f31418s;
            synchronized (d10.f22585a) {
                z10 = true;
                if (1 != d10.G(str).getInt("need_notify_kit_when_request", 1)) {
                    z10 = false;
                }
            }
            if (z10) {
                Context context = this.f31419t.f30934a;
                synchronized (a7.f30927i) {
                    if (a7.f30926h == null) {
                        a7.f30926h = new a7(context);
                    }
                    a7Var = a7.f30926h;
                }
                a7Var.getClass();
                n7.e("PPSApiServiceManager", "onRequestingAd");
                a7Var.d(new a7.a());
                return;
            }
        }
        c7.l(this.f31419t.f30934a).k("reportConsent", null, null, null);
    }
}
