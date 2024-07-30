package ka;

import android.content.Context;
import com.huawei.openalliance.ad.constant.cp;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;

/* loaded from: classes2.dex */
public final class g4 extends r3 {
    public g4() {
        super(com.huawei.openalliance.ad.constant.s.f22111e);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        String N0 = adEventReport.N0();
        n7.f("CmdReportVastVideoProgressMonitor", "report vast video monitor, type: %s", N0);
        ke f = r3.f(context, str, str2, adEventReport);
        if (cp.V.equalsIgnoreCase(N0)) {
            f.A("vastFirstQuart");
            return;
        }
        if ("midpoint".equalsIgnoreCase(N0)) {
            f.A("vastMidPoint");
            return;
        }
        if (cp.Z.equalsIgnoreCase(N0)) {
            f.A("vastThirdQuart");
            return;
        }
        if ("start".equalsIgnoreCase(N0)) {
            f.A("vastPlayStart");
        } else if ("complete".equalsIgnoreCase(N0)) {
            f.A("vastPlayComplete");
        } else {
            n7.e("CmdReportVastVideoProgressMonitor", "unsupported monitor");
        }
    }
}
