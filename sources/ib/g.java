package ib;

import com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsReq;
import com.huawei.opendevice.open.OAIDSettingActivity;

/* loaded from: classes2.dex */
public final class g implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f29485s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f29486t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f29487u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ OAIDSettingActivity f29488v;

    public g(OAIDSettingActivity oAIDSettingActivity, String str, String str2, String str3) {
        this.f29488v = oAIDSettingActivity;
        this.f29485s = str;
        this.f29486t = str2;
        this.f29487u = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApiStatisticsReq apiStatisticsReq = new ApiStatisticsReq();
        apiStatisticsReq.e(this.f29485s);
        apiStatisticsReq.b();
        apiStatisticsReq.c(System.currentTimeMillis());
        apiStatisticsReq.h(this.f29486t);
        apiStatisticsReq.j(this.f29487u);
        OAIDSettingActivity oAIDSettingActivity = this.f29488v;
        oAIDSettingActivity.y.e(1, apiStatisticsReq);
        oAIDSettingActivity.y.b();
    }
}
