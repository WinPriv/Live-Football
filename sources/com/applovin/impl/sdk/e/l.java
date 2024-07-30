package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Map;

/* loaded from: classes.dex */
public class l extends k {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.c f18875b;

    public l(com.applovin.impl.sdk.ad.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super(com.applovin.impl.sdk.ad.d.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", pVar);
        this.f18875b = cVar;
    }

    @Override // com.applovin.impl.sdk.e.h
    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(2);
        map.put("adtoken", this.f18875b.a());
        map.put("adtoken_prefix", this.f18875b.c());
        return map;
    }

    @Override // com.applovin.impl.sdk.e.h
    public com.applovin.impl.sdk.ad.b h() {
        return com.applovin.impl.sdk.ad.b.REGULAR_AD_TOKEN;
    }
}
