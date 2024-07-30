package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ig implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31295s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31296t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31297u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f31298v;

    public ig(Context context, String str, String str2, int i10) {
        this.f31295s = context;
        this.f31296t = str;
        this.f31297u = str2;
        this.f31298v = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Context context = this.f31295s;
        if (context == null) {
            return;
        }
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        String str = this.f31296t;
        String str2 = this.f31297u;
        synchronized (d10.f22585a) {
            i10 = d10.G(str).getInt(str2 + "fc_counts", 0);
        }
        n7.c("FlowControlManager", "fc counts: %d", Integer.valueOf(i10));
        if (i10 <= 0) {
            n7.e("FlowControlManager", "no need report");
            return;
        }
        u uVar = new u(this.f31295s);
        String str3 = this.f31296t;
        String str4 = this.f31297u;
        int i11 = this.f31298v;
        try {
            if (com.huawei.openalliance.ad.ppskit.utils.y1.h(str4) || i10 <= 0) {
                n7.e("AnalysisReport", "no fc");
            }
            o c10 = uVar.c(str3, true);
            if (c10 != null) {
                c10.f31525a = "162";
                c10.f31559p = str4;
                c10.b(i11);
                c10.D = String.valueOf(i10);
                new ke(uVar.f31722a, null, null).t(str3, c10, false, true);
            }
        } catch (Throwable th) {
            n7.h("AnalysisReport", "fc analysis err, %s", th.getClass().getSimpleName());
        }
        String str5 = this.f31296t;
        String str6 = this.f31297u;
        synchronized (d10.f22585a) {
            d10.G(str5).edit().remove(str6 + "fc_counts").commit();
        }
    }
}
