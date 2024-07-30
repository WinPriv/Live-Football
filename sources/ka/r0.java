package ka;

import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.ppskit.activity.InnerPPSArActivity;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r0 extends y {
    public r0() {
        super(com.huawei.openalliance.ad.constant.s.o);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        n7.e("CmdOpenArDetailPage", "CmdOpenArDetailPage call from " + str);
        try {
            JSONObject jSONObject = new JSONObject(str3);
            Intent intent = new Intent(context, (Class<?>) InnerPPSArActivity.class);
            intent.putExtra("content_id", jSONObject.getString("content_id"));
            intent.putExtra("sdk_version", jSONObject.getString("sdk_version"));
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22057e, jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22057e));
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.y, str);
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.ag, true);
            if (com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
                intent.addFlags(268468224);
            } else {
                intent.addFlags(268435456);
            }
            if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(jSONObject.optString(com.huawei.openalliance.ad.constant.ba.P, null))) {
                intent.putExtra(com.huawei.openalliance.ad.constant.ba.P, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.P));
            }
            intent.putExtra("contentRecord", jSONObject.optString("contentRecord"));
            intent.setClipData(oa.a.f33785b);
            context.startActivity(intent);
        } catch (Throwable th) {
            n7.e("CmdOpenArDetailPage", "CmdOpenArDetailPage occurs: ".concat(th.getClass().getSimpleName()));
        }
    }
}
