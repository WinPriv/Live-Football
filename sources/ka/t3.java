package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;

/* loaded from: classes2.dex */
public final class t3 extends r3 {
    public t3() {
        super(com.huawei.openalliance.ad.constant.s.f22110d);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ke f = r3.f(context, str, str2, (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]));
        EventRecord z10 = f.z("serve");
        if (!ke.v(z10, "serve")) {
            ContentRecord contentRecord = f.f31382b;
            String i10 = z10.i();
            Context context2 = f.f31386g;
            if (androidx.transition.n.M(hg.a(context2, contentRecord, i10))) {
                n7.b("EventProcessor", "serve monitor is empty, cancel report ad serve event.");
            } else {
                String b10 = ke.b(androidx.transition.n.Y(f.f31382b.q0()), f.f31382b, z10.i());
                String h12 = f.f31382b.h1();
                n7.c("EventProcessor", "onAdServe key: %s", b10);
                if (!l9.a(context2, h12).b(f.f31382b.z0(), b10)) {
                    n7.f("EventProcessor", "onAdServe key: %s report  event", b10);
                    androidx.transition.n.z(context2, f.f31381a, z10.i()).k(z10.i(), z10, true, f.f31382b);
                } else {
                    n7.f("EventProcessor", "onAdServe key: %s don't report event", b10);
                }
            }
        }
        e(aVar);
    }
}
