package ka;

import android.content.Context;
import com.huawei.hms.ads.nativead.NativeAdAssetNames;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class d2 extends y {
    public d2() {
        super("rptPlacePlayErr");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        p pVar = new p(context);
        pVar.f31723b = str2;
        AdContentData i10 = analysisEventReport.i();
        if (i10 != null) {
            ContentRecord m10 = j7.r.m(context, str, i10.B(), i10.p(), i10.A(), i10.o());
            String a10 = analysisEventReport.a();
            int b10 = analysisEventReport.b();
            int e10 = analysisEventReport.e();
            try {
                if (m10 == null) {
                    n7.g("AnalysisReport", "onPlacementPlayError, contentRecord is null");
                } else {
                    o e11 = pVar.e(m10, str);
                    if (e11 != null) {
                        e11.f31525a = NativeAdAssetNames.CHOICES_CONTAINER;
                        e11.f31563r = a10;
                        e11.f31565s = "errorcode:" + b10 + ", extra:" + e10;
                        Context context2 = pVar.f31722a;
                        ke keVar = new ke(context2, zh.a(m10.z0(), context2), null);
                        keVar.f31382b = m10;
                        keVar.p(str, e11, false, true);
                    }
                }
            } catch (Throwable th) {
                e0.i.p(th, "onPlacementPlayError:", "AnalysisReport");
            }
        }
        e(aVar);
    }
}
