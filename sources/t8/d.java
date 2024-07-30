package t8;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialListener;

/* compiled from: AdsManager.java */
/* loaded from: classes2.dex */
public final class d implements InterstitialListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.b f35580a;

    public d(h9.b bVar) {
        this.f35580a = bVar;
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdClosed() {
        IronSource.loadInterstitial();
        this.f35580a.a();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronSource.loadInterstitial();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronSource.loadInterstitial();
        this.f35580a.a();
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdOpened() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdReady() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdShowSucceeded() {
    }
}
