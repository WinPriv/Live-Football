package com.ironsource.adapters.vungle;

import com.ironsource.adapters.facebook.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.error.VungleException;

/* loaded from: classes2.dex */
public class VungleInterstitialLoadListener implements LoadAdCallback {
    private InterstitialSmashListener mListener;

    public VungleInterstitialLoadListener(InterstitialSmashListener interstitialSmashListener) {
        this.mListener = interstitialSmashListener;
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        InterstitialSmashListener interstitialSmashListener = this.mListener;
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            interstitialSmashListener.onInterstitialAdReady();
        }
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onError(String str, VungleException vungleException) {
        IronSourceError buildLoadFailedError;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + str + ", exception = " + vungleException);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (vungleException.getExceptionCode() == 1) {
            buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_IS_LOAD_NO_FILL, vungleException.getLocalizedMessage());
        } else {
            buildLoadFailedError = ErrorBuilder.buildLoadFailedError(vungleException.getLocalizedMessage());
        }
        this.mListener.onInterstitialAdLoadFailed(buildLoadFailedError);
    }
}
