package com.ironsource.sdk;

import com.ironsource.sdk.g.d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {
    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(b bVar) {
        return (bVar.a() ? d.e.Banner : bVar.f26020a ? d.e.RewardedVideo : d.e.Interstitial).toString();
    }

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return "ManRewInst_" + jSONObject.optString("name");
    }
}
