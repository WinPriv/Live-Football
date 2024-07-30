package com.ironsource.adapters.vungle;

import com.ironsource.adapters.facebook.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.error.VungleException;

/* loaded from: classes2.dex */
public class VungleRewardedVideoPlayListener implements PlayAdCallback {
    private RewardedVideoSmashListener mListener;

    public VungleRewardedVideoPlayListener(RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mListener = rewardedVideoSmashListener;
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str, boolean z10, boolean z11) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdStarted();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdOpened();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + str + ", exception = " + vungleException);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, vungleException.getLocalizedMessage()));
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdEnded();
            this.mListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(String str) {
    }
}
