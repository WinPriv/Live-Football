package ka;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e3 extends y {
    public e3() {
        super("reportFullScreenNotify");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.T);
        int optInt = jSONObject.optInt(com.huawei.openalliance.ad.constant.ba.U, 0);
        boolean parseBoolean = Boolean.parseBoolean(string);
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        String optString = jSONObject.optString(com.huawei.openalliance.ad.constant.ba.W, com.huawei.openalliance.ad.constant.ba.T);
        n7.f("CmdReportFullScreenNotify", " CmdReportFullScreenNotify showFlag:%s, showStlye: %s, paramKey: %s", string, Integer.valueOf(optInt), optString);
        if (optString.equalsIgnoreCase(com.huawei.openalliance.ad.constant.ba.T)) {
            synchronized (d10.f22585a) {
                d10.G(str).edit().putBoolean(com.huawei.openalliance.ad.constant.ba.T, parseBoolean).commit();
            }
        } else if (optString.equalsIgnoreCase(com.huawei.openalliance.ad.constant.ba.U)) {
            synchronized (d10.f22585a) {
                d10.G(str).edit().putInt("activate_notify_style", optInt).commit();
            }
        }
        y.d(aVar, this.f32203a, 200, "");
    }
}
