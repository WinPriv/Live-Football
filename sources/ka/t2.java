package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class t2 extends y {
    public t2() {
        super("rptStartSpareSplashAd");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ContentRecord contentRecord;
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        p pVar = new p(context);
        pVar.f31723b = str2;
        AdContentData i10 = analysisEventReport.i();
        if (i10 != null) {
            contentRecord = j7.r.m(context, str, analysisEventReport.x(), analysisEventReport.A(), analysisEventReport.B(), analysisEventReport.C());
        } else {
            contentRecord = null;
        }
        if (contentRecord != null) {
            contentRecord.D(i10.e());
            contentRecord.c2(i10.m());
        }
        int b10 = analysisEventReport.b();
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onStartSpareSplashAd, contentRecord is null.");
            } else {
                o c10 = pVar.c(str, true);
                if (c10 != null) {
                    c10.f31525a = "105";
                    c10.f31567t = contentRecord.o1();
                    c10.b(contentRecord.z0());
                    c10.f31559p = contentRecord.p2();
                    c10.f31561q = contentRecord.h();
                    c10.R = contentRecord.i();
                    c10.f31559p = contentRecord.p2();
                    c10.D = String.valueOf(contentRecord.A1());
                    c10.L = b10;
                    c10.E = "normal";
                    Context context2 = pVar.f31722a;
                    new ke(context2, zh.a(contentRecord.z0(), context2), null).p(str, c10, false, false);
                }
            }
        } catch (Throwable th) {
            e0.i.p(th, "onStartSpareSplashAd:", "AnalysisReport");
        }
        e(aVar);
    }
}
