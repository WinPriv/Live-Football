package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.g.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f26196a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f26197b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f26198c = new LinkedHashMap();

    public final com.ironsource.sdk.g.c a(d.e eVar, com.ironsource.sdk.b bVar) {
        LinkedHashMap c10;
        com.ironsource.sdk.g.c cVar = new com.ironsource.sdk.g.c(bVar);
        String str = bVar.f26021b;
        if (!TextUtils.isEmpty(str) && (c10 = c(eVar)) != null) {
            c10.put(str, cVar);
        }
        return cVar;
    }

    public final Collection<com.ironsource.sdk.g.c> b(d.e eVar) {
        LinkedHashMap c10 = c(eVar);
        if (c10 != null) {
            return c10.values();
        }
        return new ArrayList();
    }

    public final LinkedHashMap c(d.e eVar) {
        if (eVar.name().equalsIgnoreCase(d.e.RewardedVideo.name())) {
            return this.f26196a;
        }
        if (eVar.name().equalsIgnoreCase(d.e.Interstitial.name())) {
            return this.f26197b;
        }
        if (eVar.name().equalsIgnoreCase(d.e.Banner.name())) {
            return this.f26198c;
        }
        return null;
    }

    public final com.ironsource.sdk.g.c a(d.e eVar, String str) {
        LinkedHashMap c10;
        if (TextUtils.isEmpty(str) || (c10 = c(eVar)) == null) {
            return null;
        }
        return (com.ironsource.sdk.g.c) c10.get(str);
    }

    public final com.ironsource.sdk.g.c a(d.e eVar, String str, Map<String, String> map, com.ironsource.sdk.j.a aVar) {
        LinkedHashMap c10;
        com.ironsource.sdk.g.c cVar = new com.ironsource.sdk.g.c(str, str, map, aVar);
        if (!TextUtils.isEmpty(str) && (c10 = c(eVar)) != null) {
            c10.put(str, cVar);
        }
        return cVar;
    }
}
