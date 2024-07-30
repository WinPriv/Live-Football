package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

/* loaded from: classes2.dex */
public interface LevelPlayRewardedVideoManualListener extends LevelPlayRewardedVideoBaseListener {
    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdClicked(Placement placement, AdInfo adInfo);

    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdClosed(AdInfo adInfo);

    void onAdLoadFailed(IronSourceError ironSourceError);

    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdOpened(AdInfo adInfo);

    void onAdReady(AdInfo adInfo);

    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdRewarded(Placement placement, AdInfo adInfo);

    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo);
}
