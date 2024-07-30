package ib;

import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsReq;
import com.huawei.opendevice.open.OAIDSettingActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f29493s = "openOaidSettings";

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ OAIDSettingActivity f29494t;

    public i(OAIDSettingActivity oAIDSettingActivity) {
        this.f29494t = oAIDSettingActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OAIDSettingActivity oAIDSettingActivity = this.f29494t;
        try {
            ApiStatisticsReq apiStatisticsReq = new ApiStatisticsReq();
            apiStatisticsReq.e(this.f29493s);
            apiStatisticsReq.b();
            apiStatisticsReq.c(System.currentTimeMillis());
            Pair<String, Boolean> b10 = a0.a.A().b(oAIDSettingActivity, "");
            if (b10 != null) {
                apiStatisticsReq.j((String) b10.first);
            }
            oAIDSettingActivity.y.e(5, apiStatisticsReq);
            oAIDSettingActivity.y.b();
        } catch (Throwable unused) {
            n7.i("OAIDSettingActivity", "reportOpenOaidSettings meets exception");
        }
    }
}
