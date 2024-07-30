package com.huawei.hms.ads.reward;

import com.huawei.hms.ads.annotation.GlobalApi;

@GlobalApi
/* loaded from: classes2.dex */
public interface RewardAdListener {
    void onRewardAdClosed();

    void onRewardAdCompleted();

    void onRewardAdFailedToLoad(int i10);

    void onRewardAdLeftApp();

    void onRewardAdLoaded();

    void onRewardAdOpened();

    void onRewardAdStarted();

    void onRewarded(Reward reward);
}
