package com.ironsource.adapters.facebook;

import a3.k;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class FacebookRewardedVideoAdListener implements RewardedVideoAdExtendedListener {
    private WeakReference<FacebookAdapter> mAdapter;
    private boolean mDidCallClosed;
    private RewardedVideoSmashListener mListener;
    private String mPlacementId;

    public FacebookRewardedVideoAdListener(FacebookAdapter facebookAdapter, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        this.mAdapter = new WeakReference<>(facebookAdapter);
        this.mPlacementId = str;
        this.mListener = rewardedVideoSmashListener;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
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
            this.mAdapter.get().mRewardedVideoAdsAvailability.put(this.mPlacementId, Boolean.TRUE);
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        } else {
            IronLog.INTERNAL.verbose("adapter is null");
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, AdError adError) {
        int errorCode;
        IronLog.ADAPTER_CALLBACK.verbose("placementId = " + this.mPlacementId + " error = " + adError.getErrorCode() + ", " + adError.getErrorMessage());
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mAdapter.get().mRewardedVideoAdsAvailability.put(this.mPlacementId, Boolean.FALSE);
            if (adError.getErrorCode() == 1001) {
                errorCode = IronSourceError.ERROR_RV_LOAD_NO_FILL;
            } else {
                errorCode = adError.getErrorCode();
            }
            IronSourceError ironSourceError = new IronSourceError(errorCode, adError.getErrorMessage());
            if (this.mAdapter.get().mRewardedVideoPlacementIdShowCalled.get(this.mPlacementId).booleanValue()) {
                this.mListener.onRewardedVideoAdShowFailed(ironSourceError);
                return;
            } else {
                this.mListener.onRewardedVideoAvailabilityChanged(false);
                this.mListener.onRewardedVideoLoadFailed(ironSourceError);
                return;
            }
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mDidCallClosed = false;
            this.mListener.onRewardedVideoAdOpened();
            this.mListener.onRewardedVideoAdStarted();
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public void onRewardedVideoActivityDestroyed() {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            if (!this.mDidCallClosed) {
                this.mListener.onRewardedVideoAdClosed();
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("adapter is null");
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        if (this.mListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
            return;
        }
        WeakReference<FacebookAdapter> weakReference = this.mAdapter;
        if (weakReference != null && weakReference.get() != null) {
            this.mDidCallClosed = true;
            this.mListener.onRewardedVideoAdClosed();
        } else {
            IronLog.INTERNAL.verbose("adapter is null");
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        k.v(new StringBuilder("placementId = "), this.mPlacementId, IronLog.ADAPTER_CALLBACK);
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mListener;
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.verbose("listener is null");
        } else {
            rewardedVideoSmashListener.onRewardedVideoAdEnded();
            this.mListener.onRewardedVideoAdRewarded();
        }
    }
}
