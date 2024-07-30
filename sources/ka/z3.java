package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;

/* loaded from: classes2.dex */
public final class z3 extends r3 {
    public z3() {
        super(com.huawei.openalliance.ad.constant.s.f22127w);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str3, AdEventReport.class, new Class[0]);
        if (adEventReport == null) {
            return;
        }
        String N0 = adEventReport.N0();
        ke f = r3.f(context, str, str2, adEventReport);
        try {
            if (2 == Integer.parseInt(N0)) {
                f.u(adEventReport.l());
            } else if (1 == Integer.parseInt(N0) || 3 == Integer.parseInt(N0)) {
                f.q(adEventReport.l());
            }
        } catch (Throwable th) {
            n7.h("CmdReportFeedbackEvent", "error: %s", th.getClass().getSimpleName());
        }
        e(aVar);
    }
}
