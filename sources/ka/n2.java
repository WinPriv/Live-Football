package ka;

import android.content.Context;
import com.huawei.hms.ads.cy;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;

/* loaded from: classes2.dex */
public final class n2 extends y {
    public n2() {
        super(cy.Code);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        if (analysisEventReport == null) {
            return;
        }
        u uVar = new u(context);
        uVar.f31723b = str2;
        uVar.n(str, analysisEventReport.o(), analysisEventReport.q(), null, analysisEventReport.e(), analysisEventReport.b(), analysisEventReport.s());
        e(aVar);
    }
}
