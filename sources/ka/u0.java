package ka;

import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.ppskit.activity.InnerPPSActivity;
import com.huawei.openalliance.ad.ppskit.beans.metadata.GlobalShareData;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class u0 extends y {
    public u0() {
        super(com.huawei.openalliance.ad.constant.s.f22107a);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        n7.e("CmdOpenDetailPage", "CmdOpenDetailPage call from " + str);
        JSONObject jSONObject = new JSONObject(str3);
        Intent intent = new Intent(context, (Class<?>) InnerPPSActivity.class);
        GlobalShareData globalShareData = new GlobalShareData(jSONObject.getString("content_id"), jSONObject.getString("sdk_version"), str, jSONObject.getBoolean(com.huawei.openalliance.ad.constant.ba.f22056d));
        intent.putExtra("content_id", jSONObject.getString("content_id"));
        intent.putExtra("sdk_version", jSONObject.getString("sdk_version"));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22056d, jSONObject.getBoolean(com.huawei.openalliance.ad.constant.ba.f22056d));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22057e, jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22057e));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.y, str);
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22062k, jSONObject.getBoolean(com.huawei.openalliance.ad.constant.ba.f22062k));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.ag, true);
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.N, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.N));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.O, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.O));
        intent.putExtra("unique_id", jSONObject.optString("unique_id"));
        intent.putExtra("apiVer", jSONObject.optInt("apiVer"));
        intent.putExtra("templateId", jSONObject.optString("templateId"));
        intent.putExtra("slotid", jSONObject.optString("slotid"));
        intent.putExtra("request_id", jSONObject.optString("request_id"));
        intent.addFlags(268959744);
        n7.b("CmdOpenDetailPage", "parseLinkedAdConfig");
        if (jSONObject.has(com.huawei.openalliance.ad.constant.ba.f22065n)) {
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22065n, jSONObject.optInt(com.huawei.openalliance.ad.constant.ba.f22065n));
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22064m, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.f22064m));
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.o, jSONObject.optInt(com.huawei.openalliance.ad.constant.ba.o));
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22067q, jSONObject.optBoolean(com.huawei.openalliance.ad.constant.ba.f22067q));
            intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22066p, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.f22066p));
        }
        r4.b(globalShareData);
        intent.setClipData(oa.a.f33785b);
        context.startActivity(intent);
    }
}
