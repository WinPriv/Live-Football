package com.ironsource.adapters.vungle;

import com.ironsource.adapters.facebook.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.error.VungleException;

/* loaded from: classes2.dex */
public class VungleRewardedVideoLoadListener implements LoadAdCallback {
    private RewardedVideoSmashListener mListener;

    public VungleRewardedVideoLoadListener(RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mListener = rewardedVideoSmashListener;
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(true);
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
            buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_RV_LOAD_NO_FILL, vungleException.getLocalizedMessage());
        } else {
            buildLoadFailedError = ErrorBuilder.buildLoadFailedError(vungleException.getLocalizedMessage());
        }
        this.mListener.onRewardedVideoAvailabilityChanged(false);
        this.mListener.onRewardedVideoLoadFailed(buildLoadFailedError);
    }
}
