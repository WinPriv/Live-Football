package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;

/* loaded from: classes2.dex */
public final class h4 extends r3 {
    public h4() {
        super(com.huawei.openalliance.ad.constant.s.Z);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        long j10;
        int i10;
        int i11;
        AdEventReport adEventReport = (AdEventReport) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, str3, AdEventReport.class, new Class[0]);
        ke f = r3.f(context, str, str2, adEventReport);
        String i02 = adEventReport.i0();
        long j11 = -111111;
        if (adEventReport.l0() != null) {
            j10 = adEventReport.l0().longValue();
        } else {
            j10 = -111111;
        }
        if (adEventReport.n0() != null) {
            j11 = adEventReport.n0().longValue();
        }
        long j12 = j11;
        if (adEventReport.q0() != null) {
            i10 = adEventReport.q0().intValue();
        } else {
            i10 = -111111;
        }
        if (adEventReport.s0() != null) {
            i11 = adEventReport.s0().intValue();
        } else {
            i11 = -111111;
        }
        if (TextUtils.equals(com.huawei.openalliance.ad.constant.ah.B, i02)) {
            f.l(com.huawei.openalliance.ad.constant.ah.B, -111111L, -111111L, -111111, -111111, null);
        } else if (TextUtils.equals(com.huawei.openalliance.ad.constant.ah.C, i02)) {
            f.l(com.huawei.openalliance.ad.constant.ah.C, j10, j12, i10, i11, null);
        } else if (TextUtils.equals(com.huawei.openalliance.ad.constant.ah.S, i02)) {
            f.l(com.huawei.openalliance.ad.constant.ah.S, -111111L, -111111L, -111111, -111111, null);
        } else if (TextUtils.equals(com.huawei.openalliance.ad.constant.ah.Z, i02)) {
            f.l(com.huawei.openalliance.ad.constant.ah.Z, j10, j12, i10, i11, null);
        } else if (TextUtils.equals("linkedContinuePlay", i02)) {
            f.l("linkedContinuePlay", -111111L, -111111L, -111111, -111111, null);
        } else if (TextUtils.equals("playBtnStart", i02)) {
            f.l("playBtnStart", -111111L, -111111L, -111111, -111111, null);
        } else if (TextUtils.equals("playBtnPause", i02)) {
            f.l("playBtnPause", j10, j12, i10, i11, null);
        } else if (TextUtils.equals("rePlay", i02)) {
            f.l("rePlay", -111111L, -111111L, -111111, -111111, null);
        } else if (TextUtils.equals(com.huawei.openalliance.ad.constant.ah.L, i02)) {
            f.l(com.huawei.openalliance.ad.constant.ah.L, -111111L, -111111L, -111111, -111111, null);
        } else if (TextUtils.equals(com.huawei.openalliance.ad.constant.ah.f, i02)) {
            f.l(com.huawei.openalliance.ad.constant.ah.f, j10, j12, i10, i11, adEventReport.N0());
        } else {
            n7.f("event", "report video play state event no eventType match: %s", i02);
        }
        e(aVar);
    }
}
