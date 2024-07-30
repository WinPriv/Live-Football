package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f19051a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f19052b;

    public d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super("TaskProcessNativeAdResponse", pVar);
        this.f19051a = jSONObject;
        this.f19052b = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f19051a, com.anythink.expressad.foundation.d.d.f9543h, new JSONArray());
        if (jSONArray.length() > 0) {
            if (y.a()) {
                this.f18839h.b(this.f18838g, "Processing ad...");
            }
            this.f.M().a((com.applovin.impl.sdk.e.a) new e(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f19051a, this.f19052b, this.f));
            return;
        }
        if (y.a()) {
            this.f18839h.d(this.f18838g, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher("native_native", MaxAdFormat.NATIVE, this.f19051a, this.f);
        this.f19052b.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
