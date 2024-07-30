package com.anythink.expressad.exoplayer.d;

import android.util.Log;
import com.anythink.expressad.exoplayer.k.af;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7634a = "ClearKeyUtil";

    private a() {
    }

    public static byte[] a(byte[] bArr) {
        if (af.f8993a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(af.a(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(b(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(b(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return af.c(sb2.toString());
        } catch (JSONException e10) {
            Log.e(f7634a, "Failed to adjust response data: " + af.a(bArr), e10);
            return bArr;
        }
    }

    private static byte[] b(byte[] bArr) {
        return af.f8993a >= 27 ? bArr : af.c(af.a(bArr).replace('+', '-').replace('/', '_'));
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    private static String a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }
}
