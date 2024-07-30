package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.l.ai;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a {
    public static byte[] a(byte[] bArr) {
        return ai.f16274a >= 27 ? bArr : ai.c(a(ai.a(bArr)));
    }

    public static byte[] b(byte[] bArr) {
        if (ai.f16274a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(ai.a(bArr));
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
            return ai.c(sb2.toString());
        } catch (JSONException e10) {
            com.applovin.exoplayer2.l.q.c("ClearKeyUtil", "Failed to adjust response data: " + ai.a(bArr), e10);
            return bArr;
        }
    }

    private static String a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
