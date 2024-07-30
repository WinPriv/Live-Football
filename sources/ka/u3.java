package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.AdSampleRecord;

/* loaded from: classes2.dex */
public final class u3 extends r3 {
    public u3() {
        super(com.huawei.openalliance.ad.constant.s.D);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        ke f = r3.f(context, str, str2, adEventReport);
        f.n("appOpen", adEventReport.b0(), null, true, true, null, null, null, null, null);
        yd ydVar = new yd(f.f31386g, f.f31382b);
        AdSampleRecord e10 = ydVar.e("appOpen");
        if (!yd.c(e10, "appOpen")) {
            ydVar.a(e10);
        }
        e(aVar);
    }
}
