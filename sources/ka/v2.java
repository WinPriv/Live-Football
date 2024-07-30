package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.cy;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class v2 extends y {
    public v2() {
        super(cy.V);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        ContentRecord contentRecord;
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        if (analysisEventReport == null) {
            return;
        }
        p pVar = new p(context);
        String x10 = analysisEventReport.x();
        String y = analysisEventReport.y();
        String z10 = analysisEventReport.z();
        if (TextUtils.isEmpty(y)) {
            str4 = str;
        } else {
            str4 = y;
        }
        if (TextUtils.isEmpty(z10)) {
            z10 = str2;
        }
        pVar.f31723b = z10;
        if (!TextUtils.isEmpty(x10)) {
            contentRecord = j7.r.m(context, str4, analysisEventReport.x(), analysisEventReport.A(), analysisEventReport.B(), analysisEventReport.C());
        } else {
            contentRecord = null;
        }
        long u2 = analysisEventReport.u();
        long w10 = analysisEventReport.w();
        try {
            o e10 = pVar.e(contentRecord, str4);
            if (e10 != null) {
                e10.f31525a = "86";
                e10.f31577z = u2;
                e10.B = w10;
                if (contentRecord != null) {
                    e10.D = contentRecord.J0();
                }
                if (n7.d()) {
                    n7.c("AnalysisReport", "onVideoStartTimeCost duration: %s, bufferingDuration: %s, contentId: %s, fileSize:%s", Long.valueOf(e10.f31577z), Long.valueOf(e10.B), e10.f31561q, e10.D);
                }
                Context context2 = pVar.f31722a;
                ke keVar = new ke(context2, zh.a(e10.f31569u.intValue(), context2), null);
                keVar.f31382b = contentRecord;
                keVar.p(str4, e10, false, true);
            }
        } catch (Throwable th) {
            e0.i.p(th, "onVideoStartTimeCost:", "AnalysisReport");
        }
        e(aVar);
    }
}
