package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class J extends AbstractC1414b implements InterstitialSmashListener {

    /* renamed from: t, reason: collision with root package name */
    public final JSONObject f24831t;

    /* renamed from: u, reason: collision with root package name */
    public w f24832u;

    /* renamed from: v, reason: collision with root package name */
    public long f24833v;

    /* renamed from: x, reason: collision with root package name */
    public final int f24834x;

    public J(NetworkSettings networkSettings, int i10) {
        super(networkSettings);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        this.f24831t = interstitialSettings;
        this.o = interstitialSettings.optInt("maxAdsPerIteration", 99);
        this.f25333p = interstitialSettings.optInt("maxAdsPerSession", 99);
        this.f25331m = interstitialSettings.optInt("maxAdsPerDay", 99);
        this.f25326h = networkSettings.isMultipleInstances();
        this.f = networkSettings.getSubProviderId();
        this.f24834x = i10;
    }

    @Override // com.ironsource.mediationsdk.AbstractC1414b
    public final void h() {
        this.f25328j = 0;
        a(AbstractC1414b.a.INITIATED);
    }

    @Override // com.ironsource.mediationsdk.AbstractC1414b
    public final String i() {
        return "interstitial";
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        w wVar = this.f24832u;
        if (wVar != null) {
            wVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        w wVar = this.f24832u;
        if (wVar != null) {
            wVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        g();
        if (this.f25320a == AbstractC1414b.a.LOAD_PENDING && this.f24832u != null) {
            this.f24832u.a(ironSourceError, this, e0.i.e() - this.f24833v);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        w wVar = this.f24832u;
        if (wVar != null) {
            wVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        g();
        if (this.f25320a == AbstractC1414b.a.LOAD_PENDING && this.f24832u != null) {
            this.f24832u.a(this, e0.i.e() - this.f24833v);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        w wVar = this.f24832u;
        if (wVar != null) {
            wVar.b(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        w wVar = this.f24832u;
        if (wVar != null) {
            wVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        w wVar = this.f24832u;
        if (wVar != null) {
            wVar.f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        f();
        if (this.f25320a == AbstractC1414b.a.INIT_PENDING) {
            a(AbstractC1414b.a.INIT_FAILED);
            w wVar = this.f24832u;
            if (wVar != null) {
                wVar.a(ironSourceError, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        f();
        if (this.f25320a == AbstractC1414b.a.INIT_PENDING) {
            a(AbstractC1414b.a.INITIATED);
            w wVar = this.f24832u;
            if (wVar != null) {
                wVar.a(this);
            }
        }
    }
}
