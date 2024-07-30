package com.ironsource.adapters.vungle;

import com.ironsource.adapters.facebook.a;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.vungle.warren.AdConfig;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class VungleBannerLoadListener implements LoadAdCallback {
    private WeakReference<VungleAdapter> mAdapter;
    private ISBannerSize mBannerSize;
    private BannerSmashListener mListener;

    public VungleBannerLoadListener(VungleAdapter vungleAdapter, BannerSmashListener bannerSmashListener, ISBannerSize iSBannerSize) {
        this.mAdapter = new WeakReference<>(vungleAdapter);
        this.mListener = bannerSmashListener;
        this.mBannerSize = iSBannerSize;
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onAdLoad(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        a.q("placementId = ", str, ironLog);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<VungleAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            if (this.mBannerSize == null) {
                IronLog.INTERNAL.verbose("banner size is null");
                return;
            }
            AdConfig.AdSize bannerSize = this.mAdapter.get().getBannerSize(this.mBannerSize);
            if (!this.mAdapter.get().isBannerAdAvailableInternal(str, bannerSize)) {
                ironLog.error("can't play ad");
                this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("can't play ad"));
                return;
            }
            VungleBanner createVungleBannerAdView = this.mAdapter.get().createVungleBannerAdView(str, bannerSize);
            if (createVungleBannerAdView != null) {
                this.mListener.onBannerAdLoaded(createVungleBannerAdView, this.mAdapter.get().getBannerLayoutParams(this.mBannerSize));
                return;
            }
            ironLog.error("banner view is null");
            this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(this.mAdapter.get().getProviderName() + " LoadBanner failed - banner view is null"));
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.vungle.warren.LoadAdCallback
    public void onError(String str, VungleException vungleException) {
        IronSourceError buildLoadFailedError;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + str + ", exception = " + vungleException);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        if (vungleException.getExceptionCode() == 1) {
            buildLoadFailedError = new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, vungleException.getLocalizedMessage());
        } else {
            buildLoadFailedError = ErrorBuilder.buildLoadFailedError(vungleException.getLocalizedMessage());
        }
        this.mListener.onBannerAdLoadFailed(buildLoadFailedError);
    }
}
