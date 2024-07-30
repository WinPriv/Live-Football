package com.applovin.impl.sdk.e;

import android.net.Uri;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f18854b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18855c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18856d;

    public d(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.p pVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, pVar, appLovinAdLoadListener);
        this.f18854b = aVar;
    }

    private void j() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Caching HTML resources...");
        }
        String a10 = a(this.f18854b.b(), this.f18854b.I(), this.f18854b);
        if (this.f18854b.q() && this.f18854b.isOpenMeasurementEnabled()) {
            a10 = this.f.ag().a(a10);
        }
        this.f18854b.a(a10);
        this.f18854b.a(true);
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Finish caching non-video resources for ad #" + this.f18854b.getAdIdNumber());
        }
        this.f18839h.a(this.f18838g, "Ad updated with cachedHTML = " + this.f18854b.b());
    }

    private void k() {
        Uri a10;
        if (!b() && (a10 = a(this.f18854b.i())) != null) {
            if (this.f18854b.aM()) {
                this.f18854b.a(this.f18854b.b().replaceFirst(this.f18854b.e(), a10.toString()));
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.b(this.f18838g, "Replaced video URL with cached video URI in HTML for web video ad");
                }
            }
            this.f18854b.g();
            this.f18854b.a(a10);
        }
    }

    public void b(boolean z10) {
        this.f18855c = z10;
    }

    public void c(boolean z10) {
        this.f18856d = z10;
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        super.run();
        boolean f = this.f18854b.f();
        boolean z10 = this.f18856d;
        if (!f && !z10) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Begin processing for non-streaming ad #" + this.f18854b.getAdIdNumber() + "...");
            }
            c();
            j();
            k();
            i();
        } else {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Begin caching for streaming ad #" + this.f18854b.getAdIdNumber() + "...");
            }
            c();
            if (f) {
                if (this.f18855c) {
                    i();
                }
                j();
                if (!this.f18855c) {
                    i();
                }
                k();
            } else {
                i();
                j();
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f18854b.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f18854b, this.f);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, this.f18854b, this.f);
        a(this.f18854b);
        a();
    }
}
