package ka;

import android.content.Context;
import com.huawei.hms.ads.cy;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;

/* loaded from: classes2.dex */
public final class i2 extends y {
    public i2() {
        super(cy.D);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        if (analysisEventReport == null) {
            return;
        }
        u uVar = new u(context);
        uVar.f31723b = str2;
        int b10 = analysisEventReport.b();
        long u2 = analysisEventReport.u();
        String o = analysisEventReport.o();
        String q10 = analysisEventReport.q();
        String s10 = analysisEventReport.s();
        Context context2 = uVar.f31722a;
        if (b10 == 0) {
            try {
                o c10 = uVar.c(str, true);
                if (c10 != null) {
                    c10.f31525a = "161";
                    c10.L = 0;
                    c10.f31577z = u2;
                    c10.D = o;
                    c10.E = q10;
                    new ke(context2, null, null).p(c10.f31552l, c10, false, true);
                }
            } catch (Throwable th) {
                e0.i.p(th, "reportDynamicLoaderSuccessEvent:", "AnalysisReport");
            }
        } else {
            try {
                o c11 = uVar.c(str, true);
                if (c11 != null) {
                    c11.f31525a = "161";
                    c11.L = b10;
                    c11.D = o;
                    c11.E = q10;
                    c11.F = s10;
                    new ke(context2, null, null).p(c11.f31552l, c11, false, true);
                }
            } catch (Throwable th2) {
                e0.i.p(th2, "reportDynamicLoaderExceptionEvent:", "AnalysisReport");
            }
        }
        e(aVar);
    }
}
