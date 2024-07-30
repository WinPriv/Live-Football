package ka;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Device;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z extends c0 {
    public z() {
        super("buildApiRequestBody");
    }

    @Override // ka.c0
    public final void h(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        AdSlotParam adSlotParam = (AdSlotParam) com.huawei.openalliance.ad.ppskit.utils.y0.b(null, new JSONObject(str3).getString(com.huawei.openalliance.ad.constant.ba.I), AdSlotParam.class, new Class[0]);
        Pair c02 = androidx.activity.n.c0(context, str);
        if (c02 != null) {
            adSlotParam.C((String) c02.first);
            adSlotParam.D(((Boolean) c02.second).booleanValue());
        }
        ad adVar = new ad(context);
        adVar.f = str2;
        int T = adSlotParam.T();
        App a10 = adVar.a(adSlotParam, str);
        if (a10 == null) {
            a10 = new App(adVar.f30934a, str);
        }
        adSlotParam.x(a10);
        AdContentReq a11 = adVar.f30937d.a(str, T, adSlotParam, null, null, null);
        Device D = a11.D();
        D.j();
        a11.g(D);
        a11.h(null);
        a11.t(UUID.randomUUID().toString());
        if (!adSlotParam.R()) {
            yd ydVar = new yd(context);
            if (ydVar.f32222d != null) {
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new zd(ydVar, a11), 21);
            } else {
                n7.e("BfeProcessor", "param error or not hms");
            }
        }
        y.d(aVar, this.f32203a, 200, com.huawei.openalliance.ad.ppskit.utils.y0.q(null, a11));
    }
}
