package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

/* loaded from: classes2.dex */
public interface RewardedVideoManualListener extends RewardedVideoListener {
    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    /* synthetic */ void onRewardedVideoAdClicked(Placement placement);

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    /* synthetic */ void onRewardedVideoAdClosed();

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    /* synthetic */ void onRewardedVideoAdEnded();

    void onRewardedVideoAdLoadFailed(IronSourceError ironSourceError);

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    /* synthetic */ void onRewardedVideoAdOpened();

    void onRewardedVideoAdReady();

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    /* synthetic */ void onRewardedVideoAdRewarded(Placement placement);

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    /* synthetic */ void onRewardedVideoAdShowFailed(IronSourceError ironSourceError);

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    /* synthetic */ void onRewardedVideoAdStarted();

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    /* synthetic */ void onRewardedVideoAvailabilityChanged(boolean z10);
}
