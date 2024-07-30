package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.beans.metadata.CtrlExt;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class d4 extends r3 {
    public d4() {
        super(com.huawei.openalliance.ad.constant.s.V);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        boolean equals;
        String str4;
        boolean z10;
        boolean z11 = false;
        CtrlExt ctrlExt = null;
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        ke f = r3.f(context, str, str2, adEventReport);
        if (adEventReport.S()) {
            ge geVar = new ge();
            geVar.f31220a = adEventReport.p();
            geVar.f31221b = adEventReport.q();
            f.o(com.huawei.openalliance.ad.constant.ah.V, Long.valueOf(adEventReport.T().longValue()), Integer.valueOf(adEventReport.X().intValue()), null, null, null, null, geVar);
        } else if (adEventReport.i0() != null && com.huawei.openalliance.ad.constant.ah.f22015b.equals(adEventReport.i0())) {
            f.m(com.huawei.openalliance.ad.constant.ah.f22015b, adEventReport);
        } else if (adEventReport.i0() != null && com.huawei.openalliance.ad.constant.ah.f22018e.equals(adEventReport.i0())) {
            f.m(com.huawei.openalliance.ad.constant.ah.f22018e, adEventReport);
        } else {
            Integer b02 = adEventReport.b0();
            boolean w10 = adEventReport.w();
            n7.c("EventProcessor", "isSupplementImp(), impSource= %s", b02);
            ContentRecord contentRecord = f.f31382b;
            if (contentRecord != null) {
                ctrlExt = contentRecord.Q1();
            }
            if (ctrlExt == null) {
                equals = false;
            } else {
                equals = "1".equals(ctrlExt.a());
            }
            if (equals && w10 && !a0.a.d0(b02)) {
                if (b02 != null && b02.intValue() == 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    z11 = true;
                }
            }
            if (z11) {
                str4 = "supplementImp";
            } else {
                str4 = "imp";
            }
            f.m(str4, adEventReport);
        }
        e(aVar);
    }
}
