package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;

/* loaded from: classes2.dex */
public final class a4 extends r3 {
    public a4() {
        super(com.huawei.openalliance.ad.constant.s.S);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        ke f = r3.f(context, str, str2, adEventReport);
        String i02 = adEventReport.i0();
        if (i02 != null) {
            f.i(adEventReport.G0(), adEventReport.H0(), i02);
        }
        e(aVar);
    }
}
