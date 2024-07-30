package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;

/* loaded from: classes2.dex */
public final class k4 extends r3 {
    public k4() {
        super("reportWebOpen");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ke f = r3.f(context, str, str2, (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]));
        androidx.transition.n.z(f.f31386g, f.f31381a, "webopen").d("webopen", f.z("webopen"), true, f.f31382b);
        e(aVar);
    }
}
