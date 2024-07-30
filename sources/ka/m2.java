package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class m2 extends r3 {
    public m2() {
        super(com.huawei.openalliance.ad.constant.s.f22121q);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        n7.b("cmdReportImageLoadFailedEvent", "cmdReportImageLoadFailedEvent");
        ContentRecord contentRecord = null;
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        if (analysisEventReport == null) {
            return;
        }
        p pVar = new p(context);
        String x10 = analysisEventReport.x();
        String y = analysisEventReport.y();
        String z10 = analysisEventReport.z();
        TextUtils.isEmpty(y);
        if (!TextUtils.isEmpty(z10)) {
            str2 = z10;
        }
        pVar.f31723b = str2;
        if (!TextUtils.isEmpty(x10)) {
            contentRecord = j7.r.m(context, str, analysisEventReport.x(), analysisEventReport.A(), analysisEventReport.B(), analysisEventReport.C());
        }
        pVar.i(analysisEventReport.b(), analysisEventReport.o(), contentRecord, false, "unKnown");
        e(aVar);
    }
}
