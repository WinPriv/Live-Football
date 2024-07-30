package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.c f19049b;

    public b(com.applovin.impl.sdk.ad.c cVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, p pVar) {
        super(com.applovin.impl.sdk.ad.d.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, pVar);
        this.f19049b = cVar;
    }

    @Override // com.applovin.impl.sdk.e.h
    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("adtoken", this.f19049b.a());
        map.put("adtoken_prefix", this.f19049b.c());
        return map;
    }
}
