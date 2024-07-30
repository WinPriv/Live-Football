package com.ironsource.adapters.facebook;

import a3.k;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class FacebookBannerAdListener implements AdListener {
    private WeakReference<FacebookAdapter> mAdapter;
    private FrameLayout.LayoutParams mBannerLayoutParams;
    private BannerSmashListener mListener;
    private String mPlacementId;

    public FacebookBannerAdListener(FacebookAdapter facebookAdapter, BannerSmashListener bannerSmashListener, String str, FrameLayout.LayoutParams layoutParams) {
        this.mAdapter = new WeakReference<>(facebookAdapter);
        this.mListener = bannerSmashListener;
        this.mPlacementId = str;
        this.mBannerLayoutParams = layoutParams;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            AdView adView = this.mAdapter.get().mBannerPlacementIdToAd.get(this.mPlacementId);
            if (adView != null) {
                this.mListener.onBannerAdLoaded(adView, this.mBannerLayoutParams);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
        int errorCode;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + " error = " + adError.getErrorCode() + ", " + adError.getErrorMessage());
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (adError.getErrorCode() == 1001) {
            errorCode = IronSourceError.ERROR_BN_LOAD_NO_FILL;
        } else {
            errorCode = adError.getErrorCode();
        }
        this.mListener.onBannerAdLoadFailed(new IronSourceError(errorCode, adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
