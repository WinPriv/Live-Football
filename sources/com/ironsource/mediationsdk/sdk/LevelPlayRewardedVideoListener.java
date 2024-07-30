package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;

/* loaded from: classes2.dex */
public interface LevelPlayRewardedVideoListener extends LevelPlayRewardedVideoBaseListener {
    void onAdAvailable(AdInfo adInfo);

    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdClicked(Placement placement, AdInfo adInfo);

    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdClosed(AdInfo adInfo);

    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdOpened(AdInfo adInfo);

    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdRewarded(Placement placement, AdInfo adInfo);

    @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
    /* synthetic */ void onAdShowFailed(IronSourceError ironSourceError, AdInfo adInfo);

    void onAdUnavailable();
}
