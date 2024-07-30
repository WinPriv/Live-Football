package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;

/* loaded from: classes2.dex */
public final class e4 extends r3 {
    public e4() {
        super(com.huawei.openalliance.ad.constant.s.I);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        ke f = r3.f(context, str, str2, adEventReport);
        Long f10 = adEventReport.f();
        Boolean b10 = adEventReport.b();
        EventRecord z10 = f.z(com.huawei.openalliance.ad.constant.ah.Code);
        if (!ke.v(z10, com.huawei.openalliance.ad.constant.ah.Code)) {
            if (f10 != null) {
                z10.Q0(f10.longValue());
            }
            zf z11 = androidx.transition.n.z(f.f31386g, f.f31381a, z10.i());
            if (b10 != null && !b10.booleanValue()) {
                z11.d(z10.i(), z10, false, f.f31382b);
            } else {
                z11.k(z10.i(), z10, false, f.f31382b);
            }
        }
        e(aVar);
        try {
            new w0().b(context, str, str2, str3, null);
        } catch (Throwable th) {
            n7.h("CmdReportShowStartEvent", "preloadWebView error, %s", th.getClass().getSimpleName());
        }
    }
}
