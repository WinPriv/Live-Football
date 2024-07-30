package ka;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o3 extends y {
    public o3() {
        super("syncAgProtocolStatus");
    }

    @Override // ka.y, ka.b2
    public final String a(Context context, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject(str3);
        int i10 = jSONObject.getInt(com.huawei.openalliance.ad.constant.ba.f);
        String optString = jSONObject.optString(com.huawei.openalliance.ad.constant.ba.f22059h);
        String optString2 = jSONObject.optString(com.huawei.openalliance.ad.constant.ba.M);
        n7.f("SyncAgProtocolStatusCmd", "SyncAgProtocolStatusCmd protocolStatus: %s", Integer.valueOf(i10));
        ra.g.j(context).getClass();
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new n3(str, optString, context, str2, optString2, i10), 2);
        ra.g.j(context).getClass();
        return null;
    }
}
