package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AnalysisEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class k2 extends y {
    public k2() {
        super("reportEventFullScreenNotify");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ContentRecord contentRecord = null;
        AnalysisEventReport analysisEventReport = (AnalysisEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str3, AnalysisEventReport.class, new Class[0]);
        p pVar = new p(context);
        String x10 = analysisEventReport.x();
        String y = analysisEventReport.y();
        String o = analysisEventReport.o();
        w wVar = new w();
        wVar.f32042e = analysisEventReport.q();
        wVar.f = analysisEventReport.s();
        if (!TextUtils.isEmpty(y)) {
            str = y;
        }
        if (!TextUtils.isEmpty(x10)) {
            contentRecord = j7.r.m(context, str, x10, analysisEventReport.A(), analysisEventReport.B(), analysisEventReport.C());
        }
        pVar.m(str, contentRecord, o, wVar);
        e(aVar);
    }
}
