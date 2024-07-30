package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.provider.InnerApiProvider;
import com.huawei.openalliance.ad.ppskit.provider.a;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class l0 extends y {
    public l0() {
        super("getSpareSplashAd");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        ContentRecord contentRecord;
        long j10;
        boolean z10;
        ContentRecord contentRecord2;
        int intValue = com.huawei.openalliance.ad.ppskit.utils.y1.q(str3).intValue();
        n7.e("CmdGetSpareSplashAd", "getSpareSplashAd");
        synchronized (r4.f31738c) {
            HashMap<String, ContentRecord> hashMap = r4.f;
            if (hashMap.containsKey(str)) {
                contentRecord = hashMap.get(str);
            } else {
                contentRecord = null;
            }
        }
        String str4 = "";
        if (contentRecord != null) {
            AdContentData f = AdContentData.f(context, contentRecord);
            if (f != null && com.huawei.openalliance.ad.ppskit.utils.y1.t(f.K()) && (contentRecord2 = (ContentRecord) c5.e.e(new k0(context, str, f))) != null) {
                String m32 = contentRecord2.m3();
                String[] strArr = InnerApiProvider.f22792v;
                f.E(a.b.a(context, m32));
            }
            str4 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, f);
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
                n7.g("CmdGetSpareSplashAd", "getSpare isTriggerDisturb, ignore");
                str4 = "";
            }
        }
        y.d(aVar, this.f32203a, 200, str4);
    }
}
