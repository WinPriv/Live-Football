package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final y f19580a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.a.a> f19581b = CollectionUtils.map(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f19582c = new Object();

    public z(p pVar) {
        this.f19580a = pVar.L();
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f19582c) {
            if (y.a()) {
                this.f19580a.b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            }
            this.f19581b.put(aVar.getAdUnitId(), aVar);
        }
    }

    public void b(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f19582c) {
            String adUnitId = aVar.getAdUnitId();
            com.applovin.impl.mediation.a.a aVar2 = this.f19581b.get(adUnitId);
            if (aVar == aVar2) {
                if (y.a()) {
                    this.f19580a.b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar2);
                }
                this.f19581b.remove(adUnitId);
            } else if (y.a()) {
                this.f19580a.b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + aVar2);
            }
        }
    }

    public com.applovin.impl.mediation.a.a a(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f19582c) {
            aVar = this.f19581b.get(str);
        }
        return aVar;
    }
}
