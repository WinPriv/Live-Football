package com.ironsource.adapters.vungle;

import com.ironsource.adapters.facebook.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.error.VungleException;

/* loaded from: classes2.dex */
public class VungleBannerPlayListener implements PlayAdCallback {
    private BannerSmashListener mListener;

    public VungleBannerPlayListener(BannerSmashListener bannerSmashListener) {
        this.mListener = bannerSmashListener;
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdClick(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdLeftApplication(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdLeftApplication();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdViewed(String str) {
        a.q("placementId = ", str, IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdShown();
        }
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onError(String str, VungleException vungleException) {
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + str + ", exception = " + vungleException);
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdEnd(String str, boolean z10, boolean z11) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void creativeId(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdRewarded(String str) {
    }

    @Override // com.vungle.warren.PlayAdCallback
    public void onAdStart(String str) {
    }
}
