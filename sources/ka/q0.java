package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q0 extends y {
    public q0() {
        super("openAppMainPage");
    }

    @Override // ka.y, ka.b2
    public final String a(Context context, String str, String str2, String str3) {
        String packageName;
        try {
            JSONObject jSONObject = new JSONObject(str3);
            ContentRecord n10 = j7.r.n(context, str, jSONObject.getString("content_id"), jSONObject);
            if (n10 == null) {
                if (n7.d()) {
                    n7.b("CmdQueryActivity", "content record is empty");
                }
                return String.valueOf(false);
            }
            AppInfo j02 = n10.j0();
            if (j02 == null) {
                packageName = null;
            } else {
                packageName = j02.getPackageName();
            }
            return String.valueOf(com.huawei.openalliance.ad.ppskit.utils.o2.m(context, packageName));
        } catch (Throwable th) {
            n7.g("CmdQueryActivity", "openApp err, ".concat(th.getClass().getSimpleName()));
            return String.valueOf(false);
        }
    }
}
