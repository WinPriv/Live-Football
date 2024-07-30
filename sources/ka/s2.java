package ka;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class s2 extends y {
    public s2() {
        super("rptSplashDismissForExSplash");
    }

    @Override // ka.y, ka.b2
    public final void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        String str4;
        int i10;
        try {
            JSONObject jSONObject = new JSONObject(str3);
            str4 = jSONObject.optString("slotid");
            i10 = jSONObject.optInt("adType");
        } catch (JSONException unused) {
            str4 = str3;
            i10 = 1;
        }
        p pVar = new p(context);
        try {
            o c10 = pVar.c(str, true);
            if (c10 != null) {
                c10.b(i10);
                c10.f31525a = "85";
                c10.f31559p = str4;
                Context context2 = pVar.f31722a;
                new ke(context2, zh.a(i10, context2), null).p(str, c10, false, false);
            }
        } catch (Throwable th) {
            e0.i.p(th, "onExLinkedShow:", "AnalysisReport");
        }
        e(aVar);
    }
}
