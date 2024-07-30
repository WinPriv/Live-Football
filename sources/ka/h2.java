package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.cy;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class h2 extends y {
    public h2() {
        super(cy.C);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ContentRecord contentRecord;
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        if (analysisEventReport == null) {
            return;
        }
        p pVar = new p(context);
        String str4 = str2;
        pVar.f31723b = str4;
        String x10 = analysisEventReport.x();
        String o = analysisEventReport.o();
        String y = analysisEventReport.y();
        String z10 = analysisEventReport.z();
        TextUtils.isEmpty(y);
        if (!TextUtils.isEmpty(z10)) {
            str4 = z10;
        }
        pVar.f31723b = str4;
        if (!TextUtils.isEmpty(x10)) {
            contentRecord = j7.r.m(context, str, analysisEventReport.x(), analysisEventReport.A(), analysisEventReport.B(), analysisEventReport.C());
        } else {
            contentRecord = null;
        }
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onArLandingPageResult, contentRecord is null.");
            } else {
                o v3 = pVar.v(contentRecord, str, o);
                if (v3 != null) {
                    v3.f31525a = "106";
                    Context context2 = pVar.f31722a;
                    new ke(context2, zh.a(contentRecord.z0(), context2), null).p(str, v3, false, false);
                }
            }
        } catch (Throwable th) {
            e0.i.p(th, "onArLandingPageResult:", "AnalysisReport");
        }
        e(aVar);
    }
}
