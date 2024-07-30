package ka;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c2 extends y {
    public c2() {
        super("recommendationSettingException");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString(com.huawei.openalliance.ad.constant.ba.f22049a);
        String string2 = jSONObject.getString("content");
        String string3 = jSONObject.getString("package_name");
        String string4 = jSONObject.getString("sdk_version");
        if (!TextUtils.isEmpty(string3)) {
            str = string3;
        }
        if (!TextUtils.isEmpty(string4)) {
            str2 = string4;
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            n7.c("RecommdationSettingExceptionCmd", " callerPkgName=%s", str);
            n7.c("RecommdationSettingExceptionCmd", " callerSdkVersion=%s", str2);
            n7.c("RecommdationSettingExceptionCmd", " eventId=%s", string);
            t tVar = new t(context);
            Context context2 = tVar.f31722a;
            tVar.f31723b = str2;
            Boolean.parseBoolean(string2);
            try {
                String packageName = context2.getPackageName();
                o c10 = tVar.c(packageName, false);
                if (c10 != null) {
                    c10.f31525a = string;
                    if (!ib.r.f(context2)) {
                        try {
                            c10.A = ib.r.c(context2);
                        } catch (ib.s unused) {
                            n7.g("OaidAnalysisReport", "get oaid error");
                        }
                    }
                    new ke(context2, zh.a(-1, context2), null).t(packageName, c10, false, true);
                }
            } catch (Throwable th) {
                e0.i.p(th, "onRecommdationSettingReport:", "OaidAnalysisReport");
            }
            e(aVar);
            return;
        }
        y.d(aVar, "recommendationSettingException", 500, " param is invalid");
    }

    @Override // ka.y, ka.b2
    public final void a() {
    }
}
