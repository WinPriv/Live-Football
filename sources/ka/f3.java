package ka;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f3 extends y {
    public f3() {
        super("reportInstallPermission");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        boolean parseBoolean = Boolean.parseBoolean(new JSONObject(str3).getString(com.huawei.openalliance.ad.constant.ba.ai));
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        n7.f("CmdReportInstallPermission", " CmdReportInstallPermission hasPermission:%s", Boolean.valueOf(parseBoolean));
        synchronized (d10.f22585a) {
            d10.G(str).edit().putBoolean(com.huawei.openalliance.ad.constant.ba.ai, parseBoolean).commit();
        }
        y.d(aVar, this.f32203a, 200, "");
    }
}
