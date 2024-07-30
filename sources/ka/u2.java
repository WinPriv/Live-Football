package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class u2 extends y {
    public u2() {
        super("reportVideoPlayException");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        int i10;
        ContentRecord contentRecord = null;
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        if (analysisEventReport == null) {
            return;
        }
        n7.e("CmdReportVideoPlayException", "execute");
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
        String o = analysisEventReport.o();
        if (!TextUtils.isEmpty(o)) {
            i10 = Integer.parseInt(o);
        } else {
            i10 = -3;
        }
        long u2 = analysisEventReport.u();
        long w10 = analysisEventReport.w();
        if (contentRecord != null) {
            try {
                o f = pVar.f(contentRecord);
                if (f != null) {
                    n7.f("AnalysisReport", "onVideoPlayEx, contentId: %s", contentRecord.h());
                    if (n7.d()) {
                        n7.c("AnalysisReport", "onVideoPlayEx, waitingTime: %s, playedTime: %s", Long.valueOf(u2), Long.valueOf(w10));
                    }
                    f.f31525a = "160";
                    f.f31577z = u2;
                    f.B = w10;
                    f.D = String.valueOf(i10);
                    Context context2 = pVar.f31722a;
                    new ke(context2, zh.a(f.f31569u.intValue(), context2), contentRecord).p(f.f31552l, f, false, true);
                }
            } catch (Throwable th) {
                n7.h("AnalysisReport", "onVideoPlayException ex: %s", th.getClass().getSimpleName());
            }
        }
        e(aVar);
    }
}
