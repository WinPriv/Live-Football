package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;

/* loaded from: classes2.dex */
public final class w3 extends r3 {
    public w3() {
        super("reportClickPlayEvent");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        n7.b("CmdReportClickPlayEvent", "CmdReportClickPlayEvent");
        ke f = r3.f(context, str, str2, (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]));
        EventRecord z10 = f.z("clickPlay");
        if (!ke.v(z10, "clickPlay")) {
            androidx.transition.n.z(f.f31386g, f.f31381a, z10.i()).d(z10.i(), z10, true, f.f31382b);
        }
        e(aVar);
    }
}
