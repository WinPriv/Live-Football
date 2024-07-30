package com.ironsource.mediationsdk.sdk;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface g {
    void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);

    boolean isInterstitialReady(JSONObject jSONObject);

    void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);
}
