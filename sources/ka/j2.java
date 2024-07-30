package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class j2 extends y {
    public j2() {
        super(com.huawei.openalliance.ad.constant.s.f22126v);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        ContentRecord contentRecord;
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str3, AnalysisEventReport.class, new Class[0]);
        if (analysisEventReport == null) {
            return;
        }
        v vVar = new v(context);
        String x10 = analysisEventReport.x();
        String y = analysisEventReport.y();
        String o = analysisEventReport.o();
        if (TextUtils.isEmpty(y)) {
            str4 = str;
        } else {
            str4 = y;
        }
        if (!TextUtils.isEmpty(x10)) {
            contentRecord = j7.r.m(context, str, analysisEventReport.x(), analysisEventReport.A(), analysisEventReport.B(), analysisEventReport.C());
        } else {
            contentRecord = null;
        }
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onFeedbackAction, contentRecord is null.");
            } else {
                o c10 = vVar.c(str4, true);
                if (c10 != null) {
                    if (n7.d()) {
                        n7.c("AnalysisReport", "onFeedbackAction, extraStr1: %s", o);
                    }
                    c10.f31525a = "157";
                    c10.b(contentRecord.z0());
                    c10.f31559p = contentRecord.p2();
                    c10.f31561q = contentRecord.h();
                    c10.R = contentRecord.i();
                    c10.D = o;
                    Context context2 = vVar.f31722a;
                    new ke(context2, zh.a(contentRecord.z0(), context2), null).p(str4, c10, false, false);
                }
            }
        } catch (Throwable th) {
            e0.i.p(th, "onFeedbackAction:", "AnalysisReport");
        }
        e(aVar);
    }
}
