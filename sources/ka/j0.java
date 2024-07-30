package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class j0 extends y {
    public j0() {
        super("getNormalSplashAd");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ContentRecord contentRecord;
        long j10;
        boolean z10;
        int intValue = com.huawei.openalliance.ad.ppskit.utils.y1.q(str3).intValue();
        synchronized (r4.f31738c) {
            HashMap<String, ContentRecord> hashMap = r4.f31740e;
            if (hashMap.containsKey(str)) {
                contentRecord = hashMap.get(str);
            } else {
                contentRecord = null;
            }
        }
        String str4 = "";
        if (contentRecord != null) {
            str4 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, AdContentData.f(context, contentRecord));
        }
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        if (2 == intValue || 3 == intValue) {
            HashMap hashMap2 = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (d10.f22585a) {
                j10 = d10.G(str).getLong("no_show_ad_time", 0L);
            }
            if (j10 >= currentTimeMillis) {
                n7.e("AppDayFcRule", "disturb is triggered");
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                n7.g("CmdGetNormalSplashAd", "getSpare isTriggerDisturb, ignore");
                str4 = "";
            }
        }
        y.d(aVar, this.f32203a, 200, str4);
        r4.a(str, null);
    }
}
