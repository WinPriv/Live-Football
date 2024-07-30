package com.applovin.mediation.adapters;

import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;

/* loaded from: classes.dex */
public class AppLovinAdapterNativeListener implements AppLovinNativeAdEventListener, AppLovinNativeAdLoadListener {
    private final MaxNativeAdAdapterListener listener;
    private final MaxAdapterResponseParameters parameters;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterNativeListener(MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinMediationAdapter appLovinMediationAdapter, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        this.parameters = maxAdapterResponseParameters;
        this.parentAdapter = appLovinMediationAdapter;
        this.listener = maxNativeAdAdapterListener;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener
    public void onNativeAdClicked(AppLovinNativeAd appLovinNativeAd) {
        this.parentAdapter.d("Native ad clicked");
        this.listener.onNativeAdClicked();
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
    public void onNativeAdLoadFailed(AppLovinError appLovinError) {
        this.parentAdapter.d("Native ad failed to load with error: " + appLovinError);
        this.listener.onNativeAdLoadFailed(AppLovinMediationAdapter.toMaxError(appLovinError));
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
    public void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd) {
        this.parentAdapter.d("Native ad loaded: " + appLovinNativeAd);
        if (StringUtils.isValidString(BundleUtils.getString("template", "", this.parameters.getServerParameters())) && TextUtils.isEmpty(appLovinNativeAd.getTitle())) {
            this.parentAdapter.e("Native ad does not have required assets: " + appLovinNativeAd);
            this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            return;
        }
        ((AppLovinNativeAdImpl) appLovinNativeAd).setEventListener(this);
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.loadedNativeAd = appLovinNativeAd;
        this.listener.onNativeAdLoaded(new AppLovinAdapterNativeAd(appLovinMediationAdapter, new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(appLovinNativeAd.getTitle()).setBody(appLovinNativeAd.getBody()).setAdvertiser(appLovinNativeAd.getAdvertiser()).setCallToAction(appLovinNativeAd.getCallToAction()).setStarRating(appLovinNativeAd.getStarRating()).setIcon(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAd.getIconUri())).setMainImage(new MaxNativeAd.MaxNativeAdImage(((AppLovinNativeAdImpl) appLovinNativeAd).getMainImageUri())).setMediaView(appLovinNativeAd.getMediaView()).setMediaContentAspectRatio(appLovinNativeAd.getMediaView().getAspectRatio()).setOptionsView(appLovinNativeAd.getOptionsView())), null);
    }
}
