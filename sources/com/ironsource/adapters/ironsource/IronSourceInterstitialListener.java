package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.adapters.facebook.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.sdk.j.c;
import e0.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceInterstitialListener implements c {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    private final InterstitialSmashListener mListener;

    public IronSourceInterstitialListener(InterstitialSmashListener interstitialSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialAdRewarded(String str, int i10) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        StringBuilder sb2 = new StringBuilder();
        i.o(sb2, this.mDemandSourceName, " interstitialListener demandSourceId=", str, " amount=");
        sb2.append(i10);
        ironLog.verbose(sb2.toString());
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClick() {
        a.r(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClose() {
        a.r(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
            if ("impressions".equals(str)) {
                this.mListener.onInterstitialAdVisible();
            }
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitFailed(String str) {
        a.r(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitSuccess() {
        a.r(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadSuccess() {
        a.r(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialOpen() {
        a.r(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowSuccess() {
        a.r(new StringBuilder(), this.mDemandSourceName, " interstitialListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
