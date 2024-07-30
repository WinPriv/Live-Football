package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;

/* loaded from: classes2.dex */
public final class f4 extends r3 {
    public f4() {
        super(com.huawei.openalliance.ad.constant.s.f22114i);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        ke f = r3.f(context, str, str2, adEventReport);
        if (adEventReport.h0()) {
            str4 = "soundClickOff";
        } else {
            str4 = "soundClickOn";
        }
        EventRecord z10 = f.z(str4);
        if (!ke.v(z10, str4)) {
            zf z11 = androidx.transition.n.z(f.f31386g, f.f31381a, z10.i());
            z11.d(z10.i(), z10, true, f.f31382b);
            z11.i().execute(new com.huawei.openalliance.ad.ppskit.utils.b2(new ag(z11, z10, f.f31382b)));
        }
    }
}
