package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class e2 extends y {
    public e2() {
        super("rptAdInvalidEvt");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        u uVar = new u(context);
        uVar.f31723b = str2;
        AdContentData i10 = analysisEventReport.i();
        if (i10 != null) {
            ContentRecord m10 = j7.r.m(context, str, i10.B(), i10.p(), i10.A(), i10.o());
            String k10 = analysisEventReport.k();
            long m11 = analysisEventReport.m();
            try {
                if (k10 != null && m10 != null) {
                    o e10 = uVar.e(m10, str);
                    if (e10 != null) {
                        e10.f31525a = k10;
                        if (m11 > 0) {
                            e10.B = m11;
                        }
                        Context context2 = uVar.f31722a;
                        new ke(context2, zh.a(m10.z0(), context2), m10).p(str, e10, false, true);
                    }
                } else {
                    n7.g("AnalysisReport", "onAdExpire, contentRecord or ExceptionType is null ");
                }
            } catch (Throwable th) {
                e0.i.p(th, "onAdInvalid:", "AnalysisReport");
            }
        }
        e(aVar);
    }
}
