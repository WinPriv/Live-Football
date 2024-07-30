package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;

/* loaded from: classes2.dex */
public final class s3 extends r3 {
    public s3() {
        super(com.huawei.openalliance.ad.constant.s.f22108b);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        String N0 = adEventReport.N0();
        String O0 = adEventReport.O0();
        ke f = r3.f(context, str, str2, adEventReport);
        String P0 = adEventReport.P0();
        EventRecord z10 = f.z("adRewarded");
        if (!ke.v(z10, "adRewarded")) {
            z10.O1(N0);
            z10.Q1(O0);
            androidx.transition.n.z(f.f31386g, f.f31381a, z10.i()).k(z10.i(), z10, false, f.f31382b);
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new me(f, P0), 5);
        }
        e(aVar);
    }
}
