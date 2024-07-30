package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import ka.vf;

/* loaded from: classes2.dex */
public final class v3 extends r3 {
    public v3() {
        super(com.huawei.openalliance.ad.constant.s.B);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        int intValue;
        int intValue2;
        int i10;
        int i11 = 0;
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        if (adEventReport.g() == null) {
            intValue = 0;
        } else {
            intValue = adEventReport.g().intValue();
        }
        if (adEventReport.h() != null) {
            i11 = adEventReport.h().intValue();
        }
        if (adEventReport.i() == null) {
            intValue2 = 1;
        } else {
            intValue2 = adEventReport.i().intValue();
        }
        ke f = r3.f(context, str, str2, adEventReport);
        vf.a aVar2 = new vf.a();
        aVar2.f32021a = adEventReport.v0();
        aVar2.f32022b = adEventReport.y0();
        aVar2.f32023c = adEventReport.B0();
        if (adEventReport.b0() != null) {
            i10 = adEventReport.b0().intValue();
        } else {
            i10 = 7;
        }
        aVar2.f32024d = Integer.valueOf(i10);
        MaterialClickInfo.a aVar3 = new MaterialClickInfo.a();
        aVar3.f22639a = adEventReport.c();
        aVar3.f22640b = adEventReport.d();
        aVar3.f22641c = adEventReport.e();
        aVar3.f22644g = adEventReport.u();
        aVar3.f22642d = adEventReport.r();
        aVar3.f22643e = adEventReport.s();
        aVar3.f = adEventReport.t();
        aVar2.f32025e = new MaterialClickInfo(aVar3);
        aVar2.f = adEventReport.P0();
        aVar2.f32026g = intValue;
        aVar2.f32027h = i11;
        aVar2.f32029j = adEventReport.w();
        aVar2.f32028i = intValue2;
        f.r(new vf(aVar2));
        e(aVar);
    }
}
