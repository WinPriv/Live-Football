package nc;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f extends h {
    public static lc.a i(JSONObject jSONObject, lc.b bVar, String str, String str2) {
        Object obj;
        String optString = jSONObject.optString("pre");
        String optString2 = jSONObject.optString("clna");
        Object b10 = h.b(jSONObject.optString("in_na"), str);
        JSONArray jSONArray = bVar.f32600e;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (!TextUtils.equals(str2, "0")) {
                b10 = h.a(b10, optString, stringBuffer, new e(optString2));
            }
            if (b10 == null) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    String optString3 = jSONArray.optString(i10);
                    try {
                        obj = b10.getClass().getMethod(jSONObject.optString(optString3), new Class[0]).invoke(b10, new Object[0]);
                    } catch (Throwable unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        String obj2 = obj.toString();
                        if (!TextUtils.isEmpty(obj2)) {
                            jSONObject2.put(optString3, obj2);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (jSONObject2.length() <= 0) {
                return null;
            }
            lc.a aVar = new lc.a();
            aVar.f32592a = jSONObject2;
            return aVar;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
