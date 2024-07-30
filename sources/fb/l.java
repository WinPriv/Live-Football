package fb;

import android.content.Context;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.v;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import gb.b0;

/* loaded from: classes2.dex */
public final class l extends m {
    public l(Context context, AdContentData adContentData) {
        super(context, adContentData);
    }

    @Override // fb.m
    public final boolean a() {
        String str;
        ex.V("SpecifiedAgdDownloadAction", "handle SpecifiedAgdDownloadAction");
        AdContentData adContentData = this.f28347b;
        if (adContentData != null && adContentData.c1() != null) {
            AppInfo c12 = adContentData.c1();
            if (c12 != null && b0.b(this.f28346a, c12.q())) {
                str = "app installed";
            } else {
                AppDownloadTask p10 = com.huawei.openalliance.ad.download.app.a.t().p(c12);
                if (p10 == null) {
                    if (c12 == null) {
                        p10 = null;
                    } else {
                        p10 = new AppDownloadTask();
                        p10.f(false);
                        p10.w(c12);
                        p10.e(c12.G());
                        p10.n(c12.p());
                        p10.d(c12.k());
                        p10.l();
                        AppDownloadTask.u(p10, c12);
                    }
                    if (p10 != null) {
                        p10.x(2);
                        p10.B(1);
                        p10.v(adContentData);
                    }
                }
                if (p10 != null) {
                    p10.r(adContentData.b1());
                    p10.G(adContentData.D());
                    p10.t(adContentData.L());
                    p10.C(adContentData.u());
                    p10.H(adContentData.e0());
                    p10.s(adContentData.f0());
                }
                if (p10 == null) {
                    str = "downloadTask is null";
                } else {
                    p10.x(2);
                    this.f28348c = v.Code;
                    com.huawei.openalliance.ad.download.app.a.t().s(p10);
                    return true;
                }
            }
        } else {
            str = "getAppInfo is null";
        }
        ex.V("SpecifiedAgdDownloadAction", str);
        return d();
    }
}
