package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public abstract class r3 extends y {
    public r3(String str) {
        super(str);
    }

    public static ke f(Context context, String str, String str2, AdEventReport adEventReport) {
        if (!TextUtils.isEmpty(adEventReport.J0())) {
            str = adEventReport.J0();
        }
        String str3 = str;
        if (!TextUtils.isEmpty(adEventReport.K0())) {
            str2 = adEventReport.K0();
        }
        ContentRecord m10 = j7.r.m(context, str3, adEventReport.x(), adEventReport.n(), adEventReport.o(), adEventReport.m());
        if (m10 != null) {
            m10.B(str2);
            m10.V1(adEventReport.I0());
            m10.D(adEventReport.M0());
            m10.L(adEventReport.a());
            m10.s2(adEventReport.k());
        }
        ke keVar = new ke(context, zh.a(adEventReport.G(), context), null);
        keVar.f31382b = m10;
        return keVar;
    }
}
