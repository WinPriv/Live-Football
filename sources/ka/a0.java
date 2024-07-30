package ka;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a0 extends f0 {
    public a0() {
        super("apiReqConfig");
    }

    @Override // ka.f0, ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        JSONObject jSONObject = new JSONObject(str3);
        super.b(context, jSONObject.optString(com.huawei.openalliance.ad.constant.ba.y), str2, jSONObject.optString("slotid"), aVar);
    }

    @Override // ka.f0
    public final String f() {
        return "CmdApiReqSdkConfig";
    }
}
