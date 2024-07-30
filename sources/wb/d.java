package wb;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import ka.p4;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.ironsource.sdk.controller.d f36195a;

    /* renamed from: b, reason: collision with root package name */
    public final p4 f36196b;

    public d(com.ironsource.sdk.controller.d dVar, p4 p4Var) {
        this.f36195a = dVar;
        this.f36196b = p4Var;
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        boolean z10;
        try {
            Logger.i("wb.d", "messageHandler(" + str + " " + str3 + ")");
            p4 p4Var = this.f36196b;
            p4Var.getClass();
            try {
                z10 = str3.equalsIgnoreCase(p4.a(str + str2 + p4Var.f31624b));
            } catch (Exception e10) {
                e10.printStackTrace();
                z10 = false;
            }
            com.ironsource.sdk.controller.d dVar = this.f36195a;
            if (z10) {
                dVar.a(str, str2);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("functionName", SDKUtils.encodeString(str));
                jSONObject.put("params", SDKUtils.encodeString(str2));
                jSONObject.put("hash", SDKUtils.encodeString(str3));
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            String jSONObject2 = jSONObject.toString();
            x.d dVar2 = dVar.f26101a;
            if (dVar2 != null) {
                x.this.b(x.b("unauthorizedMessage", jSONObject2, null, null));
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            Logger.i("wb.d", "messageHandler failed with exception " + e12.getMessage());
        }
    }
}
