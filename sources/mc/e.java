package mc;

import a3.l;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e extends b {
    @Override // mc.b
    public final String b(String str) {
        return str.trim();
    }

    @Override // mc.b
    public final String c() {
        if (ic.a.f29536a == null) {
            synchronized (ic.a.class) {
                if (ic.a.f29536a == null) {
                    ic.a.f29536a = new ic.a();
                }
            }
        }
        sc.a c10 = sc.c.c(jc.b.a().f30202a);
        if (c10 == null) {
            return "https://aa.birdgesdk.com/v1/d_api";
        }
        String str = c10.f35318p;
        if (TextUtils.isEmpty(str)) {
            return "https://aa.birdgesdk.com/v1/d_api";
        }
        return str;
    }

    @Override // mc.b
    public final HashMap d() {
        return l.t("Content-Type", "application/json;charset=utf-8");
    }

    @Override // mc.b
    public final byte[] e() {
        try {
            return g().getBytes(com.anythink.expressad.foundation.g.a.bN);
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // mc.b
    public final JSONObject f() {
        String str = "1";
        JSONObject jSONObject = new JSONObject();
        Context context = jc.b.a().f30202a;
        try {
            jSONObject.put("platform", "1");
            jSONObject.put("os_vn", pc.e.c());
            jSONObject.put("os_vc", pc.e.a());
            jSONObject.put("package_name", pc.e.e(context));
            jSONObject.put("app_vn", pc.e.d(context));
            jSONObject.put("app_vc", pc.e.b(context));
            jSONObject.put("sdk_ver", "1.0.2");
            String str2 = "";
            if (!jc.b.a().d("android_id")) {
                try {
                    if (pc.e.f == null) {
                        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        pc.e.f = string;
                        if (string == null) {
                            pc.e.f = "";
                        }
                    }
                } catch (Exception unused) {
                    pc.e.f = "";
                }
                str2 = pc.e.f;
            }
            jSONObject.put("android_id", str2);
            if (!pc.f.a()) {
                str = "0";
            }
            jSONObject.put("is_proxy", str);
            jSONObject.put("pil_offset", jc.b.a().f30206e);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    @Override // mc.b
    public final boolean h() {
        return true;
    }
}
