package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.provider.InnerApiProvider;
import com.huawei.openalliance.ad.ppskit.provider.a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a1 extends y {
    public a1() {
        super(com.huawei.openalliance.ad.constant.s.f22128x);
    }

    public static String f(Context context, String str) {
        n7.f("CmdQueryContentPath", "paramContent %s", com.huawei.openalliance.ad.ppskit.utils.y1.j(str));
        String str2 = "tplate";
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            if (jSONObject.optInt("apiVer", 3) != 3) {
                str2 = "normal";
            }
            str = optString;
        } catch (Throwable unused) {
        }
        if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(str)) {
            d5 a10 = y4.a(context, str2);
            String h10 = a10.h(context, a10.j(context, str));
            if (com.huawei.openalliance.ad.ppskit.utils.x.q(h10)) {
                n7.e("CmdQueryContentPath", "change path to content");
                String[] strArr = InnerApiProvider.f22792v;
                return a.b.b(context, h10, str2);
            }
        }
        return null;
    }

    @Override // ka.y, ka.b2
    public final String a(Context context, String str, String str2, String str3) {
        return f(context, str3);
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        y.d(aVar, this.f32203a, 200, f(context, str3));
    }
}
