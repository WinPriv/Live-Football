package ka;

import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.ppskit.activity.InnerPPSArActivity;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t0 extends y {
    public t0() {
        super("openArDetailPageNew");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        n7.e("CmdOpenArDetailPageNewParam", "CmdOpenArDetailPage call from " + str);
        try {
            n7.f("CmdOpenArDetailPageNewParam", "content: %s", com.huawei.openalliance.ad.ppskit.utils.y1.j(str3));
            JSONObject jSONObject = new JSONObject(str3);
            Intent intent = new Intent(context, (Class<?>) InnerPPSArActivity.class);
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.y, str);
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.ag, true);
            if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(jSONObject.optString(com.huawei.openalliance.ad.constant.ba.P, null))) {
                intent.putExtra(com.huawei.openalliance.ad.constant.ba.P, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.P));
            }
            if (com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
                intent.addFlags(268468224);
            } else {
                intent.addFlags(268435456);
            }
            intent.putExtra("contentRecord", jSONObject.optString("contentRecord"));
            intent.setClipData(oa.a.f33785b);
            context.startActivity(intent);
        } catch (Throwable th) {
            n7.e("CmdOpenArDetailPageNewParam", "CmdOpenArDetailPage occurs: ".concat(th.getClass().getSimpleName()));
        }
    }
}
