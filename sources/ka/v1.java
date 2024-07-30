package ka;

import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.ppskit.activity.InnerPPSInterstitialAdActivity;
import com.huawei.openalliance.ad.ppskit.beans.metadata.GlobalShareData;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v1 extends y {
    public v1() {
        super("interstitial_ad_show");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        n7.e("CmdShowInterstitialAd", "CmdShowInterstitialAd call from " + str);
        JSONObject jSONObject = new JSONObject(str3);
        Intent intent = new Intent(context, (Class<?>) InnerPPSInterstitialAdActivity.class);
        intent.putExtra("content_id", jSONObject.getString("content_id"));
        intent.putExtra("sdk_version", jSONObject.getString("sdk_version"));
        intent.putExtra("request_id", jSONObject.optString("request_id"));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22057e, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.f22057e));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.N, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.N));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.O, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.O));
        intent.putExtra("reward_key_nonwifi_action_play", jSONObject.optString("reward_key_nonwifi_action_play"));
        intent.putExtra("reward_key_nonwifi_action_download", jSONObject.optString("reward_key_nonwifi_action_download"));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.y, str);
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.ag, true);
        intent.putExtra("unique_id", jSONObject.optString("unique_id"));
        intent.putExtra("templateId", jSONObject.optString("templateId"));
        intent.putExtra("apiVer", jSONObject.optInt("apiVer", -1));
        intent.putExtra("slotid", jSONObject.optString("slotid"));
        intent.addFlags(268959744);
        r4.b(new GlobalShareData(jSONObject.getString("content_id"), jSONObject.getString("sdk_version"), str));
        intent.setClipData(oa.a.f33785b);
        context.startActivity(intent);
    }

    @Override // ka.y, ka.b2
    public final void a() {
    }
}
