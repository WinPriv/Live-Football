package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class j extends k {

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f18873b;

    public j(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.p pVar) {
        super(com.applovin.impl.sdk.ad.d.a(a(list)), appLovinAdLoadListener, "TaskFetchMultizoneAd", pVar);
        this.f18873b = Collections.unmodifiableList(list);
    }

    private static String a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        throw new IllegalArgumentException("No zone identifiers specified");
    }

    @Override // com.applovin.impl.sdk.e.h
    public com.applovin.impl.sdk.ad.b h() {
        return com.applovin.impl.sdk.ad.b.APPLOVIN_MULTIZONE;
    }

    @Override // com.applovin.impl.sdk.e.h
    public Map<String, String> a() {
        Map<String, String> map = CollectionUtils.map(1);
        List<String> list = this.f18873b;
        map.put("zone_ids", CollectionUtils.implode(list, list.size()));
        return map;
    }
}
