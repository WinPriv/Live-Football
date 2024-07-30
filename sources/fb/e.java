package fb;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.constant.v;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import gb.q;
import gb.x;

/* loaded from: classes2.dex */
public final class e extends m {
    public e(Context context, AdContentData adContentData) {
        super(context, adContentData);
    }

    @Override // fb.m
    public final boolean a() {
        AdContentData adContentData = this.f28347b;
        try {
            ex.V("HarmonyAppAction", "handle harmony app action");
            AppInfo c12 = adContentData.c1();
            if (c12 != null && !TextUtils.isEmpty(c12.q())) {
                if (Boolean.parseBoolean((String) q.a(new x(11, this.f28346a, adContentData), null))) {
                    this.f28348c = v.Z;
                    return true;
                }
            } else {
                ex.V("HarmonyAppAction", "parameters occur error");
            }
        } catch (Throwable th) {
            ex.I("HarmonyAppAction", "handle uri exception: %s", th.getClass().getSimpleName());
        }
        return d();
    }
}
