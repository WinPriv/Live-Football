package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.e.h;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends h {

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f19050b;

    public c(com.applovin.impl.sdk.ad.d dVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super(dVar, str, pVar);
        this.f19050b = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.e.h
    public com.applovin.impl.sdk.e.a a(JSONObject jSONObject) {
        return new d(jSONObject, this.f19050b, this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    public String b() {
        return i.j(this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    public String c() {
        return i.k(this.f);
    }

    @Override // com.applovin.impl.sdk.e.h
    public void a(int i10, String str) {
        super.a(i10, str);
        this.f19050b.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }
}
