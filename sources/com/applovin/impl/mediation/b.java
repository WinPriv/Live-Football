package com.applovin.impl.mediation;

import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b implements a.InterfaceC0200a, c.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f17675a;

    /* renamed from: b, reason: collision with root package name */
    private final c f17676b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdListener f17677c;

    public b(p pVar, MaxAdListener maxAdListener) {
        this.f17677c = maxAdListener;
        this.f17675a = new a(pVar);
        this.f17676b = new c(pVar, this);
    }

    public void b(com.applovin.impl.mediation.a.c cVar) {
        long C = cVar.C();
        if (C >= 0) {
            this.f17676b.a(cVar, C);
        }
        if (cVar.D()) {
            this.f17675a.a(cVar, this);
        }
    }

    @Override // com.applovin.impl.mediation.c.a
    public void c(com.applovin.impl.mediation.a.c cVar) {
        this.f17677c.onAdHidden(cVar);
    }

    public void a(MaxAd maxAd) {
        this.f17676b.a();
        this.f17675a.a();
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0200a
    public void a(final com.applovin.impl.mediation.a.c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.f17677c.onAdHidden(cVar);
            }
        }, cVar.E());
    }
}
