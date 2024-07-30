package com.ironsource.adapters.vungle;

import com.ironsource.adapters.facebook.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.error.VungleException;

/* loaded from: classes2.dex */
public class VungleInterstitialPlayListener implements PlayAdCallback {
    private InterstitialSmashListener mListener;

    public VungleInterstitialPlayListener(InterstitialSmashListener interstitialSmashListener) {
        this.mListener = interstitialSmashListener;
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str, boolean z10, boolean z11) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdShowSucceeded();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdOpened();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + str + ", exception = " + vungleException);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", " reason = " + vungleException.getLocalizedMessage() + " errorCode = " + vungleException.getExceptionCode()));
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(String str) {
    }
}
