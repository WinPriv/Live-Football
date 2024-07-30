package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class q2 extends y {
    public q2() {
        super("rptSplashFailedEvt");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        int s10;
        ContentRecord contentRecord;
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AnalysisEventReport.class, new Class[0]);
        String valueOf = String.valueOf(analysisEventReport.e());
        u uVar = new u(context);
        uVar.f31723b = str2;
        AdContentData i10 = analysisEventReport.i();
        String o = analysisEventReport.o();
        if (i10 == null) {
            s10 = 1;
        } else {
            s10 = i10.s();
        }
        if (i10 != null && !TextUtils.isEmpty(i10.B())) {
            contentRecord = j7.r.m(context, str, analysisEventReport.x(), analysisEventReport.A(), analysisEventReport.B(), analysisEventReport.C());
            o = i10.e();
            contentRecord.c2(i10.m());
        } else {
            contentRecord = null;
        }
        int b10 = analysisEventReport.b();
        String q10 = analysisEventReport.q();
        try {
            o e10 = uVar.e(contentRecord, str);
            if (e10 != null) {
                e10.f31525a = "54";
                e10.b(s10);
                e10.f31567t = o;
                e10.L = b10;
                e10.F = valueOf;
                e10.D = "normal";
                if (com.huawei.openalliance.ad.ppskit.utils.y1.h(e10.f31559p)) {
                    e10.f31559p = q10;
                }
                if (contentRecord != null) {
                    e10.E = String.valueOf(contentRecord.A1());
                }
                String str4 = "errorCode:" + b10 + ", reason:" + u.h(b10);
                e10.f31565s = str4;
                n7.c("AnalysisReport", "onSplashAdLoadFailed, reason: %s", str4);
                Context context2 = uVar.f31722a;
                new ke(context2, zh.a(s10, context2), null).t(e10.f31552l, e10, false, true);
            }
        } catch (Throwable th) {
            e0.i.p(th, "onSplashAdLoadFailed:", "AnalysisReport");
        }
        e(aVar);
    }
}
