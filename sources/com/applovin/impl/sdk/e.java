package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final p f18831a;

    /* renamed from: b, reason: collision with root package name */
    private final y f18832b;

    /* renamed from: d, reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, aa> f18834d = CollectionUtils.map();

    /* renamed from: e, reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, aa> f18835e = CollectionUtils.map();

    /* renamed from: c, reason: collision with root package name */
    private final Object f18833c = new Object();

    public e(p pVar) {
        this.f18831a = pVar;
        this.f18832b = pVar.L();
        for (com.applovin.impl.sdk.ad.d dVar : com.applovin.impl.sdk.ad.d.f()) {
            this.f18834d.put(dVar, new aa());
            this.f18835e.put(dVar, new aa());
        }
    }

    private aa d(com.applovin.impl.sdk.ad.d dVar) {
        aa aaVar;
        synchronized (this.f18833c) {
            aaVar = this.f18834d.get(dVar);
            if (aaVar == null) {
                aaVar = new aa();
                this.f18834d.put(dVar, aaVar);
            }
        }
        return aaVar;
    }

    private aa e(com.applovin.impl.sdk.ad.d dVar) {
        aa aaVar;
        synchronized (this.f18833c) {
            aaVar = this.f18835e.get(dVar);
            if (aaVar == null) {
                aaVar = new aa();
                this.f18835e.put(dVar, aaVar);
            }
        }
        return aaVar;
    }

    private aa f(com.applovin.impl.sdk.ad.d dVar) {
        synchronized (this.f18833c) {
            aa e10 = e(dVar);
            if (e10.a() > 0) {
                return e10;
            }
            return d(dVar);
        }
    }

    public AppLovinAdImpl a(com.applovin.impl.sdk.ad.d dVar) {
        com.applovin.impl.sdk.ad.f fVar;
        synchronized (this.f18833c) {
            aa d10 = d(dVar);
            if (d10.a() > 0) {
                e(dVar).a(d10.c());
                fVar = new com.applovin.impl.sdk.ad.f(dVar, this.f18831a);
            } else {
                fVar = null;
            }
        }
        if (fVar != null) {
            if (y.a()) {
                this.f18832b.b("AdPreloadManager", "Retrieved ad of zone " + dVar + "...");
            }
        } else if (y.a()) {
            this.f18832b.b("AdPreloadManager", "Unable to retrieve ad of zone " + dVar + "...");
        }
        return fVar;
    }

    public AppLovinAdImpl b(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl c10;
        synchronized (this.f18833c) {
            c10 = f(dVar).c();
        }
        return c10;
    }

    public AppLovinAdBase c(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAdImpl d10;
        synchronized (this.f18833c) {
            d10 = f(dVar).d();
        }
        return d10;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f18833c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (y.a()) {
                this.f18832b.b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }
}
