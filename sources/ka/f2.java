package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.cy;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;

/* loaded from: classes2.dex */
public class f2 extends y {
    public f2() {
        super(cy.Z);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        if (analysisEventReport == null) {
            c(aVar);
            return;
        }
        int e10 = analysisEventReport.e();
        String o = analysisEventReport.o();
        String q10 = analysisEventReport.q();
        String s10 = analysisEventReport.s();
        if (TextUtils.isEmpty(s10)) {
            s10 = "reqAgPendingIntent";
        }
        String str4 = s10;
        if (n7.d()) {
            n7.c(f(), "pending intent type: %s , agAppPkgName: %s", Integer.valueOf(e10), o);
        }
        p pVar = new p(context);
        ra.g.j(context).getClass();
        pVar.p(str, o, null, q10, e10, str4, null, null);
        e(aVar);
    }

    public String f() {
        return "CmdReportAgApiCalledEvent";
    }

    public f2(int i10) {
        super(cy.I);
    }
}
