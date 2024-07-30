package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s extends a {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f18931a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f18932b;

    /* renamed from: c, reason: collision with root package name */
    private final AppLovinAdLoadListener f18933c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f18934d;

    public s(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super("TaskRenderAppLovinAd", pVar);
        this.f18931a = jSONObject;
        this.f18932b = jSONObject2;
        this.f18934d = bVar;
        this.f18933c = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f18931a, this.f18932b, this.f18934d, this.f);
        boolean booleanValue = JsonUtils.getBoolean(this.f18931a, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f18931a, "vs_load_immediately", Boolean.TRUE).booleanValue();
        d dVar = new d(aVar, this.f, this.f18933c);
        dVar.b(booleanValue2);
        dVar.c(booleanValue);
        o.a aVar2 = o.a.CACHING_OTHER;
        if (((Boolean) this.f.a(com.applovin.impl.sdk.c.b.bv)).booleanValue()) {
            AppLovinAdSize size = aVar.getSize();
            AppLovinAdSize appLovinAdSize = AppLovinAdSize.INTERSTITIAL;
            if (size == appLovinAdSize && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = o.a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == appLovinAdSize && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = o.a.CACHING_INCENTIVIZED;
            } else if (aVar.getSize() == AppLovinAdSize.NATIVE && aVar.getType() == AppLovinAdType.NATIVE) {
                aVar2 = o.a.CACHING_NATIVE;
            }
        }
        this.f.M().a(dVar, aVar2);
    }
}
