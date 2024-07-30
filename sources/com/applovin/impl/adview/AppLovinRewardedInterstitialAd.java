package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinRewardedInterstitialAd {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinIncentivizedInterstitial f16932a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinAdDisplayListener f16933b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdClickListener f16934c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdVideoPlaybackListener f16935d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f16932a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f16934c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f16933b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f16935d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f16932a.show(appLovinAd, context, appLovinAdRewardListener, this.f16935d, this.f16933b, this.f16934c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
