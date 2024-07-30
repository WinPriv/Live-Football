package ka;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d1 extends y {
    public d1() {
        super("remoteSharedPrefSet");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22050aa);
        String string2 = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22051ab);
        if (string != null && string2 != null) {
            n7.f("CmdRemoteSharedPrefSet", "CmdRemoteSharedPrefSet key=%s, value=%s", string, string2);
            if (!string.equals("AutoOpenForbidden")) {
                n7.g("CmdRemoteSharedPrefSet", "invalid key");
                return;
            }
            com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
            d10.getClass();
            boolean parseBoolean = Boolean.parseBoolean(string2);
            synchronized (d10.f22585a) {
                d10.G(str).edit().putBoolean("auto_open_forbidden", parseBoolean).commit();
            }
            e(aVar);
            return;
        }
        n7.g("CmdRemoteSharedPrefSet", "parameter error");
    }
}
