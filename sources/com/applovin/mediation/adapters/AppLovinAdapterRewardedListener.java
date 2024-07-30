package com.applovin.mediation.adapters;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.h;
import com.applovin.impl.sdk.ad.i;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinAdapterRewardedListener implements h, i, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {
    private boolean hasGrantedReward;
    private final MaxRewardedAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterRewardedListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxRewardedAdapterListener;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad clicked");
        this.listener.onRewardedAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad shown");
        this.listener.onRewardedAdDisplayed();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        if (this.hasGrantedReward || this.parentAdapter.shouldAlwaysRewardUser()) {
            MaxReward reward = this.parentAdapter.getReward();
            this.parentAdapter.log("Rewarded user with reward: " + reward);
            this.listener.onUserRewarded(reward);
        }
        this.parentAdapter.log("Rewarded ad hidden");
        this.listener.onRewardedAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad loaded");
        this.parentAdapter.loadedRewardedAd = appLovinAd;
        this.listener.onRewardedAdLoaded();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.sdk.ad.i
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        this.parentAdapter.log("Rewarded ad failed to load with error code: " + appLovinError);
        this.listener.onRewardedAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    @Override // com.applovin.impl.sdk.ad.h
    public void onAdDisplayFailed(String str) {
        this.parentAdapter.log("Rewarded ad failed to display with error: " + str);
        this.listener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        this.parentAdapter.log("User is over quota: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        this.parentAdapter.log("Reward rejected: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        this.parentAdapter.log("Reward verified");
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
        this.parentAdapter.log("Reward validation request failed with code: " + i10);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        this.parentAdapter.log("Rewarded ad video started");
        this.listener.onRewardedAdVideoStarted();
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
        this.parentAdapter.log("Rewarded ad video ended at " + d10 + "% and is fully watched: " + z10);
        this.hasGrantedReward = z10;
        this.listener.onRewardedAdVideoCompleted();
    }
}
