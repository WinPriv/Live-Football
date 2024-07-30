package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z2 extends y {
    public z2() {
        super("AppNotificationExceptionCmd");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22049a);
        String string2 = jSONObject.getString("content_id");
        String optString = jSONObject.optString("package_name");
        String optString2 = jSONObject.optString("sdk_version");
        String optString3 = jSONObject.optString("action");
        if (!TextUtils.isEmpty(optString)) {
            str = optString;
        }
        if (!TextUtils.isEmpty(optString2)) {
            str2 = optString2;
        }
        boolean isEmpty = TextUtils.isEmpty(string);
        String str4 = this.f32203a;
        if (!isEmpty && !TextUtils.isEmpty(string2)) {
            n7.c("AppNotificationExceptionCmd", " callerPkgName=%s", str);
            n7.c("AppNotificationExceptionCmd", " callerSdkVersion=%s", str2);
            n7.c("AppNotificationExceptionCmd", " contentId=%s", string2);
            n7.c("AppNotificationExceptionCmd", " eventId=%s", string);
            n7.c("AppNotificationExceptionCmd", " action=%s", optString3);
            ContentRecord n10 = j7.r.n(context, str, string2, jSONObject);
            if (n10 == null) {
                n7.e("AppNotificationExceptionCmd", " content id is invalid");
                y.d(aVar, str4, 500, " param is invalid");
                return;
            }
            v vVar = new v(context);
            vVar.f31723b = str2;
            if (com.huawei.hms.ads.gg.Code.equals(string)) {
                try {
                    o e10 = vVar.e(n10, str);
                    if (e10 != null) {
                        e10.f31525a = com.huawei.hms.ads.gg.Code;
                        if (!TextUtils.isEmpty(optString3)) {
                            e10.f31565s = optString3;
                        }
                        Context context2 = vVar.f31722a;
                        ke keVar = new ke(context2, zh.a(n10.z0(), context2), null);
                        keVar.f31382b = n10;
                        keVar.p(str, e10, false, true);
                    }
                } catch (Throwable th) {
                    e0.i.p(th, "onAppNotificationOperateAction:", "AnalysisReport");
                }
            }
            e(aVar);
            return;
        }
        y.d(aVar, str4, 500, " param is invalid");
    }
}
