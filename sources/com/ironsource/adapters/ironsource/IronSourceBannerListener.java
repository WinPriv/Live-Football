package com.ironsource.adapters.ironsource;

import android.widget.FrameLayout;
import com.ironsource.adapters.facebook.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.sdk.c.c;
import com.ironsource.sdk.j.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class IronSourceBannerListener implements b {
    private WeakReference<IronSourceAdapter> mAdapter;
    private final String mDemandSourceName;
    private final BannerSmashListener mListener;

    public IronSourceBannerListener(IronSourceAdapter ironSourceAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new WeakReference<>(ironSourceAdapter);
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerClick() {
        a.r(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdClicked();
    }

    public void onBannerInitFailed(String str) {
        a.r(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerInitFailed(new IronSourceError(612, str));
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerInitSuccess() {
        a.r(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerInitSuccess();
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerLoadFail(String str) {
        a.r(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerLoadSuccess(com.ironsource.sdk.b bVar, com.ironsource.sdk.c.a aVar) {
        com.ironsource.sdk.a aVar2;
        a.r(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        if (this.mAdapter.get() != null) {
            if (aVar == null) {
                this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
                return;
            }
            ConcurrentHashMap<String, ArrayList<com.ironsource.sdk.b>> concurrentHashMap = this.mAdapter.get().mDemandSourceToBnAd;
            if (concurrentHashMap.get(this.mDemandSourceName) == null) {
                concurrentHashMap.put(this.mDemandSourceName, new ArrayList<>());
            }
            concurrentHashMap.get(this.mDemandSourceName).add(bVar);
            c cVar = aVar.f26042a;
            if (cVar != null) {
                aVar2 = cVar.f26048d;
            } else {
                aVar2 = new com.ironsource.sdk.a();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar2.f25981a, aVar2.f25982b);
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(aVar, layoutParams);
        }
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerShowSuccess() {
        a.r(new StringBuilder(), this.mDemandSourceName, " onBannerShowSuccess", IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
