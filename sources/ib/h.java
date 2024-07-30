package ib;

import com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsReq;
import com.huawei.opendevice.open.OAIDSettingActivity;

/* loaded from: classes2.dex */
public final class h implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f29489s = "resetOaid";

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f29490t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f29491u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ OAIDSettingActivity f29492v;

    public h(OAIDSettingActivity oAIDSettingActivity, String str, String str2) {
        this.f29492v = oAIDSettingActivity;
        this.f29490t = str;
        this.f29491u = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApiStatisticsReq apiStatisticsReq = new ApiStatisticsReq();
        apiStatisticsReq.e(this.f29489s);
        apiStatisticsReq.b();
        apiStatisticsReq.c(System.currentTimeMillis());
        apiStatisticsReq.h(this.f29490t);
        apiStatisticsReq.j(this.f29491u);
        OAIDSettingActivity oAIDSettingActivity = this.f29492v;
        oAIDSettingActivity.y.e(2, apiStatisticsReq);
        oAIDSettingActivity.y.b();
    }
}
