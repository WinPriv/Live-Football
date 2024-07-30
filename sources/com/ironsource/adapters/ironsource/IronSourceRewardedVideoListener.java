package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.adapters.facebook.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.j.c;
import e0.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceRewardedVideoListener implements c {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    boolean mIsRvDemandOnly;
    RewardedVideoSmashListener mListener;

    public IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str, boolean z10) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z10;
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialAdRewarded(String str, int i10) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder sb2 = new StringBuilder();
        i.o(sb2, this.mDemandSourceName, " rewardedVideoListener demandSourceId=", str, " amount=");
        sb2.append(i10);
        ironLog.verbose(sb2.toString());
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClick() {
        a.r(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClose() {
        a.r(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
            if ("impressions".equals(str)) {
                this.mListener.onRewardedVideoAdVisible();
            }
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitFailed(String str) {
        a.r(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitSuccess() {
        a.r(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(str));
        if (!this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadSuccess() {
        a.r(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        if (this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoLoadSuccess();
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialOpen() {
        a.r(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowSuccess() {
        a.r(new StringBuilder(), this.mDemandSourceName, " rewardedVideoListener", IronLog.ADAPTER_CALLBACK);
        if (!this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoAvailabilityChanged(false);
        }
    }
}
