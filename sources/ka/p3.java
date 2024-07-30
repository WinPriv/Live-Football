package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p3 extends y {
    public p3() {
        super("trafficReminderExceptionEvent");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22049a);
        String optString = jSONObject.optString("content_id");
        String optString2 = jSONObject.optString("package_name");
        String optString3 = jSONObject.optString("sdk_version");
        if (TextUtils.isEmpty(optString2)) {
            optString2 = str;
        }
        if (TextUtils.isEmpty(optString3)) {
            optString3 = str2;
        }
        if ("69".equals(string)) {
            v vVar = new v(context);
            vVar.f31723b = optString3;
            try {
                o c10 = vVar.c("", true);
                if (c10 != null) {
                    c10.f31525a = "69";
                    c10.f31565s = optString2;
                    new ke(vVar.f31722a, null, null).p(c10.f31552l, c10, false, true);
                    return;
                }
                return;
            } catch (Throwable th) {
                e0.i.p(th, "onActiveAppFromBackBtn:", "AnalysisReport");
                return;
            }
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(optString)) {
            if (n7.d()) {
                n7.c("TrafficReminderExceptionCmd", "callerPkgName=%s", optString2);
                n7.c("TrafficReminderExceptionCmd", "callerSdkVersion=%s", optString3);
                n7.c("TrafficReminderExceptionCmd", "contentId=%s", optString);
                n7.c("TrafficReminderExceptionCmd", "eventId=%s", string);
            }
            ContentRecord n10 = j7.r.n(context, optString2, optString, jSONObject);
            if (n10 == null) {
                n7.e("TrafficReminderExceptionCmd", "content id is invalid");
                y.d(aVar, "trafficReminderExceptionEvent", 500, "param is invalid");
                return;
            }
            v vVar2 = new v(context);
            vVar2.f31723b = optString3;
            try {
                n7.e("AnalysisReport", "report dialog action:" + string);
                vVar2.f31723b = n10.n1();
                o e10 = vVar2.e(n10, optString2);
                if (e10 != null) {
                    e10.f31525a = string;
                    if (!TextUtils.isEmpty(null)) {
                        e10.f31565s = null;
                    }
                    Context context2 = vVar2.f31722a;
                    ke keVar = new ke(context2, zh.a(n10.z0(), context2), null);
                    keVar.f31382b = n10;
                    keVar.p(optString2, e10, false, true);
                }
            } catch (Throwable th2) {
                e0.i.p(th2, "reportDialogActionEvent:", "AnalysisReport");
            }
            e(aVar);
            return;
        }
        y.d(aVar, "trafficReminderExceptionEvent", 500, "param is invalid");
    }
}
