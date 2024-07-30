package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;

/* loaded from: classes2.dex */
public final class b4 extends r3 {
    public b4() {
        super("rptLandingEvent");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        boolean z10 = false;
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        ke f = r3.f(context, str, str2, adEventReport);
        String i02 = adEventReport.i0();
        String N0 = adEventReport.N0();
        if (adEventReport.b() != null) {
            z10 = adEventReport.b().booleanValue();
        }
        if (!TextUtils.isEmpty(i02) && !TextUtils.isEmpty(N0)) {
            EventRecord z11 = f.z(i02);
            if (z11 != null) {
                z11.Y0(N0);
                zf z12 = androidx.transition.n.z(f.f31386g, f.f31381a, z11.i());
                if (z10) {
                    z12.k(z11.i(), z11, true, f.f31382b);
                } else {
                    z12.d(z11.i(), z11, true, f.f31382b);
                }
            }
        } else {
            n7.g("EventProcessor", "param is null");
        }
        e(aVar);
    }
}
