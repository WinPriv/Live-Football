package com.ironsource.adapters.facebook;

import a3.k;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class FacebookInterstitialAdListener implements InterstitialAdExtendedListener {
    private WeakReference<FacebookAdapter> mAdapter;
    private boolean mDidCallClosed;
    private InterstitialSmashListener mListener;
    private String mPlacementId;

    public FacebookInterstitialAdListener(FacebookAdapter facebookAdapter, InterstitialSmashListener interstitialSmashListener, String str) {
        this.mAdapter = new WeakReference<>(facebookAdapter);
        this.mListener = interstitialSmashListener;
        this.mPlacementId = str;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mInterstitialAdsAvailability.put(this.mPlacementId, Boolean.TRUE);
            this.mListener.onInterstitialAdReady();
        } else {
            IronLog.INTERNAL.verbose("adapter is null");
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
        int errorCode;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + " error = " + adError.getErrorCode() + ", " + adError.getErrorMessage());
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mInterstitialAdsAvailability.put(this.mPlacementId, Boolean.FALSE);
            if (adError.getErrorCode() == 1001) {
                errorCode = IronSourceError.ERROR_IS_LOAD_NO_FILL;
            } else {
                errorCode = adError.getErrorCode();
            }
            IronSourceError ironSourceError = new IronSourceError(errorCode, adError.getErrorMessage());
            if (this.mAdapter.get().mInterstitialPlacementIdShowCalled.get(this.mPlacementId).booleanValue()) {
                this.mListener.onInterstitialAdShowFailed(ironSourceError);
                return;
            } else {
                this.mListener.onInterstitialAdLoadFailed(ironSourceError);
                return;
            }
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            if (!this.mDidCallClosed) {
                this.mListener.onInterstitialAdClosed();
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mDidCallClosed = true;
            this.mListener.onInterstitialAdClosed();
        } else {
            IronLog.INTERNAL.verbose("adapter is null");
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mDidCallClosed = false;
            this.mListener.onInterstitialAdOpened();
            this.mListener.onInterstitialAdShowSucceeded();
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
    }
}
