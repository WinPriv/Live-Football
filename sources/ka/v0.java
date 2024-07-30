package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AdPreReq;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v0 extends y {
    public v0() {
        super(com.huawei.openalliance.ad.constant.s.f22125u);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        if (com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
            n7.e("CmdPreRequest", "in hms process, skip pre request.");
            return;
        }
        JSONObject jSONObject = new JSONObject(str3);
        int optInt = jSONObject.optInt(com.huawei.openalliance.ad.constant.ba.ae);
        boolean optBoolean = jSONObject.optBoolean(com.huawei.openalliance.ad.constant.ba.af);
        if (optInt != 1 && !optBoolean) {
            if (optInt == 2) {
                String[] strArr = {com.huawei.openalliance.ad.constant.s.f22125u};
                ad adVar = new ad(context);
                AdSlotParam adSlotParam = new AdSlotParam();
                adSlotParam.A(Arrays.asList((Object[]) strArr.clone()));
                adVar.e(str, adSlotParam, null, 3, null);
                return;
            }
            return;
        }
        com.huawei.openalliance.ad.ppskit.handlers.i0 d10 = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        AdPreReq adPreReq = new AdPreReq();
        d10.getClass();
        try {
            t9 i10 = d10.i(str);
            d10.f22556b.m(str);
            d10.g(adPreReq, str, str2);
            j7.r.r(str);
            n7.f("i0", "pre request response: %s", Integer.valueOf(i10.c().a()));
        } catch (Throwable unused) {
            n7.e("i0", "preReq error.");
        }
    }
}
