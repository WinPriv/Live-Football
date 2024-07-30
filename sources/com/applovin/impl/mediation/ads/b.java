package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.ac;
import com.applovin.impl.sdk.ad;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class b implements ad.a {

    /* renamed from: a, reason: collision with root package name */
    private final p f17670a;

    /* renamed from: b, reason: collision with root package name */
    private final d f17671b;

    /* renamed from: c, reason: collision with root package name */
    private final ad f17672c;

    /* renamed from: d, reason: collision with root package name */
    private final ac f17673d;

    /* renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0201a f17674e;

    public b(d dVar, ViewGroup viewGroup, a.InterfaceC0201a interfaceC0201a, p pVar) {
        this.f17670a = pVar;
        this.f17671b = dVar;
        this.f17674e = interfaceC0201a;
        this.f17673d = new ac(viewGroup, pVar);
        ad adVar = new ad(viewGroup, pVar, this);
        this.f17672c = adVar;
        adVar.a(dVar);
        pVar.L();
        if (y.a()) {
            pVar.L().b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f17672c.a();
    }

    public void b() {
        this.f17670a.L();
        if (y.a()) {
            this.f17670a.L().b("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f17671b.G().compareAndSet(false, true)) {
            this.f17670a.L();
            if (y.a()) {
                this.f17670a.L().b("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f17671b.getNativeAd().isExpired()) {
                y.i("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else if (((Boolean) this.f17670a.a(com.applovin.impl.sdk.c.b.bG)).booleanValue()) {
                this.f17670a.V().a(this.f17671b);
            } else {
                this.f17671b.J();
            }
            this.f17670a.ap().processRawAdImpressionPostback(this.f17671b, this.f17674e);
        }
    }

    public d c() {
        return this.f17671b;
    }

    @Override // com.applovin.impl.sdk.ad.a
    public void onLogVisibilityImpression() {
        a(this.f17673d.a(this.f17671b));
    }

    private void a(long j10) {
        if (this.f17671b.H().compareAndSet(false, true)) {
            this.f17670a.L();
            if (y.a()) {
                this.f17670a.L().b("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f17670a.ap().processViewabilityAdImpressionPostback(this.f17671b, j10, this.f17674e);
        }
    }
}
