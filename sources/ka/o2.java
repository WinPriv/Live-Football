package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class o2 extends y {
    public o2() {
        super("reportNoCachePlayInCacheMode");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ContentRecord contentRecord = null;
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        if (analysisEventReport == null) {
            return;
        }
        n7.e("CmdReportNoCachePlayInCacheMode", "execute");
        p pVar = new p(context);
        String x10 = analysisEventReport.x();
        String z10 = analysisEventReport.z();
        String y = analysisEventReport.y();
        if (TextUtils.isEmpty(z10)) {
            z10 = str2;
        }
        if (TextUtils.isEmpty(y)) {
            y = str;
        }
        pVar.f31723b = z10;
        if (!TextUtils.isEmpty(x10)) {
            contentRecord = j7.r.m(context, y, analysisEventReport.x(), analysisEventReport.A(), analysisEventReport.B(), analysisEventReport.C());
        }
        int e10 = analysisEventReport.e();
        if (contentRecord != null) {
            try {
                o f = pVar.f(contentRecord);
                if (f != null) {
                    f.f31525a = "175";
                    f.D = String.valueOf(e10);
                    Context context2 = pVar.f31722a;
                    new ke(context2, zh.a(f.f31569u.intValue(), context2), contentRecord).p(f.f31552l, f, false, false);
                }
            } catch (Throwable th) {
                n7.h("AnalysisReport", "OnlinePlayInCacheMode ex: %s", th.getClass().getSimpleName());
            }
        }
        e(aVar);
    }
}
