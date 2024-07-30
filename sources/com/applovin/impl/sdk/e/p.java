package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p extends a implements com.applovin.impl.sdk.ad.i {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f18917a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.d f18918b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f18919c;

    /* renamed from: d, reason: collision with root package name */
    private final AppLovinAdLoadListener f18920d;

    public p(JSONObject jSONObject, com.applovin.impl.sdk.ad.d dVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskProcessAdResponse", pVar);
        if (jSONObject != null) {
            if (dVar != null) {
                this.f18917a = jSONObject;
                this.f18918b = dVar;
                this.f18919c = bVar;
                this.f18920d = appLovinAdLoadListener;
                return;
            }
            throw new IllegalArgumentException("No zone specified");
        }
        throw new IllegalArgumentException("No response specified");
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", "undefined");
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Starting task for AppLovin ad...");
            }
            this.f.M().a((a) new s(jSONObject, this.f18917a, this.f18919c, this, this.f));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Starting task for VAST ad...");
            }
            this.f.M().a((a) r.a(jSONObject, this.f18917a, this.f18919c, this, this.f));
            return;
        }
        if ("js_tag".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Starting task for JS tag ad...");
            }
            this.f.M().a((a) new q(jSONObject, this.f18917a, this.f18919c, this, this.f));
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, s.f.b("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f18920d;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.sdk.ad.i
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f18920d;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
            ((com.applovin.impl.sdk.ad.i) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f18917a, com.anythink.expressad.foundation.d.d.f9543h, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.d(this.f18838g, "No ads were returned from the server");
            }
            Utils.maybeHandleNoFillResponseForPublisher(this.f18918b.a(), this.f18918b.b(), this.f18917a, this.f);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }
}
