package ib;

import com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsReq;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.opendevice.open.OAIDMoreSettingActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f29477s = "openOaidSettings";

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ OAIDMoreSettingActivity f29478t;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            try {
                eVar.f29478t.E.setText(r.c(eVar.f29478t));
            } catch (s unused) {
                n7.i("OAIDMoreSettingActivity", "update oaid PpsOpenDeviceException");
            }
        }
    }

    public e(OAIDMoreSettingActivity oAIDMoreSettingActivity) {
        this.f29478t = oAIDMoreSettingActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OAIDMoreSettingActivity oAIDMoreSettingActivity = this.f29478t;
        try {
            ApiStatisticsReq apiStatisticsReq = new ApiStatisticsReq();
            apiStatisticsReq.e(this.f29477s);
            apiStatisticsReq.b();
            apiStatisticsReq.c(System.currentTimeMillis());
            apiStatisticsReq.j(r.c(oAIDMoreSettingActivity));
            oAIDMoreSettingActivity.y.e(5, apiStatisticsReq);
            oAIDMoreSettingActivity.y.e(6, apiStatisticsReq);
            oAIDMoreSettingActivity.y.b();
            d2.a(new a());
        } catch (Throwable unused) {
            n7.i("OAIDMoreSettingActivity", "reportOpenOaidSettings meets exception");
        }
    }
}
