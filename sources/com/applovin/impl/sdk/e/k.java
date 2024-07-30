package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends h {

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinAdLoadListener f18874b;

    public k(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", pVar);
    }

    @Override // com.applovin.impl.sdk.e.h
    public a a(JSONObject jSONObject) {
        return new p(jSONObject, ((h) this).f18865a, h(), this.f18874b, this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    public String b() {
        return com.applovin.impl.sdk.utils.i.h(this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    public String c() {
        return com.applovin.impl.sdk.utils.i.i(this.f);
    }

    public k(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.p pVar) {
        super(dVar, str, pVar);
        this.f18874b = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.h
    public void a(int i10, String str) {
        super.a(i10, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f18874b;
        if (appLovinAdLoadListener instanceof com.applovin.impl.sdk.ad.i) {
            ((com.applovin.impl.sdk.ad.i) this.f18874b).failedToReceiveAdV2(new AppLovinError(i10, str));
        } else {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
    }
}
