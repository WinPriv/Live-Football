package ka;

import android.content.Context;
import android.content.Intent;
import com.huawei.openalliance.ad.ppskit.activity.InnerPPSRewardActivity;
import com.huawei.openalliance.ad.ppskit.beans.metadata.GlobalShareData;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w1 extends y {
    public w1() {
        super("showReward");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        n7.e("CmdShowRewardAd", "CmdShowRewardAd call from " + str);
        JSONObject jSONObject = new JSONObject(str3);
        Intent intent = new Intent(context, (Class<?>) InnerPPSRewardActivity.class);
        String optString = jSONObject.optString("content_id");
        String optString2 = jSONObject.optString("sdk_version");
        intent.putExtra("content_id", optString);
        intent.putExtra("sdk_version", optString2);
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22061j, jSONObject.optBoolean(com.huawei.openalliance.ad.constant.ba.f22061j));
        intent.putExtra("request_id", jSONObject.optString("request_id"));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.f22057e, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.f22057e));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.N, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.N));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.O, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.O));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.J, jSONObject.optBoolean(com.huawei.openalliance.ad.constant.ba.J));
        intent.putExtra("reward_key_nonwifi_action_play", jSONObject.optString("reward_key_nonwifi_action_play"));
        intent.putExtra("reward_key_nonwifi_action_download", jSONObject.optString("reward_key_nonwifi_action_download"));
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.y, str);
        intent.putExtra(com.huawei.openalliance.ad.constant.ba.ag, true);
        intent.putExtra("unique_id", jSONObject.optString("unique_id"));
        intent.addFlags(268435456);
        r4.b(new GlobalShareData(optString, optString2, str));
        intent.setClipData(oa.a.f33785b);
        context.startActivity(intent);
    }
}
