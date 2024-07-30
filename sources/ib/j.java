package ib;

import com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsReq;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.opendevice.open.OaidDataProvider;
import ka.ae;
import ka.n7;

/* loaded from: classes2.dex */
public final class j implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ OaidDataProvider f29495s;

    public j(OaidDataProvider oaidDataProvider) {
        this.f29495s = oaidDataProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OaidDataProvider oaidDataProvider = this.f29495s;
        try {
            ApiStatisticsReq apiStatisticsReq = new ApiStatisticsReq();
            apiStatisticsReq.e("clickHmsNext");
            apiStatisticsReq.b();
            apiStatisticsReq.c(System.currentTimeMillis());
            apiStatisticsReq.j(r.c(oaidDataProvider.f24216t));
            ae aeVar = new ae(oaidDataProvider.f24216t);
            aeVar.c(4, y0.q(null, apiStatisticsReq));
            aeVar.g();
        } catch (RuntimeException unused) {
            n7.g("OaidDataProvider", "reportClickHmsNext RuntimeException");
        } catch (Exception unused2) {
            n7.i("OaidDataProvider", "reportClickHmsNext meets exception");
        }
    }
}
