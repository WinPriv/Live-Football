package com.applovin.mediation.adapters;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.warren.AdConfig;
import com.vungle.warren.BannerAdConfig;
import com.vungle.warren.Banners;
import com.vungle.warren.BuildConfig;
import com.vungle.warren.InitCallback;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.NativeAd;
import com.vungle.warren.NativeAdLayout;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Plugin;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.VungleSettings;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.ui.view.MediaView;
import e0.i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class VungleMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private VungleBanner adViewAd;
    private NativeAd nativeAd;

    /* loaded from: classes.dex */
    public class AdViewAdListener implements PlayAdCallback {
        private final String adFormatLabel;
        private String creativeId;
        private final MaxAdViewAdapterListener listener;

        public AdViewAdListener(String str, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormatLabel = str;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void creativeId(String str) {
            VungleMediationAdapter.this.log(l.q(new StringBuilder(), this.adFormatLabel, "ad with creative id: ", str, " will be played"));
            this.creativeId = str;
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdClick(String str) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str, boolean z10, boolean z11) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdLeftApplication(String str) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad left application");
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdStart(String str) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad started");
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdViewed(String str) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad displayed");
            if (AppLovinSdk.VERSION_CODE >= 9150000 && AppLovinSdkUtils.isValidString(this.creativeId)) {
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", this.creativeId);
                this.listener.onAdViewAdDisplayed(bundle);
                return;
            }
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onError(String str, VungleException vungleException) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleException);
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad display failed with error: " + maxError);
            this.listener.onAdViewAdDisplayFailed(maxError);
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str) {
            VungleMediationAdapter.this.log(this.adFormatLabel + " ad hidden");
            this.listener.onAdViewAdHidden();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdRewarded(String str) {
        }
    }

    /* loaded from: classes.dex */
    public class AppOpenAdListener implements PlayAdCallback {
        private String creativeId;
        private final MaxAppOpenAdapterListener listener;

        public AppOpenAdListener(MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.listener = maxAppOpenAdapterListener;
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void creativeId(String str) {
            VungleMediationAdapter.this.log("App open ad with creative id: " + str + " will be played");
            this.creativeId = str;
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdClick(String str) {
            VungleMediationAdapter.this.log("App open ad clicked");
            this.listener.onAppOpenAdClicked();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str, boolean z10, boolean z11) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdLeftApplication(String str) {
            VungleMediationAdapter.this.log("App open ad left application");
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdStart(String str) {
            VungleMediationAdapter.this.log("App open ad started");
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdViewed(String str) {
            VungleMediationAdapter.this.log("App open ad displayed");
            if (AppLovinSdk.VERSION_CODE >= 9150000 && AppLovinSdkUtils.isValidString(this.creativeId)) {
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", this.creativeId);
                this.listener.onAppOpenAdDisplayed(bundle);
                return;
            }
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onError(String str, VungleException vungleException) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleException);
            VungleMediationAdapter.this.log("App open ad failed to display with error: " + maxError);
            this.listener.onAppOpenAdDisplayFailed(maxError);
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str) {
            VungleMediationAdapter.this.log("App open ad hidden");
            this.listener.onAppOpenAdHidden();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdRewarded(String str) {
        }
    }

    /* loaded from: classes.dex */
    public class InterstitialAdListener implements PlayAdCallback {
        private String creativeId;
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void creativeId(String str) {
            VungleMediationAdapter.this.log("Interstitial ad with creative id: " + str + " will be played");
            this.creativeId = str;
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdClick(String str) {
            VungleMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str, boolean z10, boolean z11) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdLeftApplication(String str) {
            VungleMediationAdapter.this.log("Interstitial ad left application");
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdStart(String str) {
            VungleMediationAdapter.this.log("Interstitial ad started");
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdViewed(String str) {
            VungleMediationAdapter.this.log("Interstitial ad displayed");
            if (AppLovinSdk.VERSION_CODE >= 9150000 && AppLovinSdkUtils.isValidString(this.creativeId)) {
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", this.creativeId);
                this.listener.onInterstitialAdDisplayed(bundle);
                return;
            }
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onError(String str, VungleException vungleException) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleException);
            VungleMediationAdapter.this.log("Interstitial ad failed to display with error: " + maxError);
            this.listener.onInterstitialAdDisplayFailed(maxError);
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str) {
            VungleMediationAdapter.this.log("Interstitial ad hidden");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdRewarded(String str) {
        }
    }

    /* loaded from: classes.dex */
    public class MaxVungleNativeAd extends MaxNativeAd {
        public MaxVungleNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            NativeAd nativeAd = VungleMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                VungleMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return;
            }
            NativeAdLayout nativeAdLayout = new NativeAdLayout(maxNativeAdView.getContext());
            View mainView = maxNativeAdView.getMainView();
            maxNativeAdView.removeView(mainView);
            nativeAdLayout.addView(mainView);
            maxNativeAdView.addView(nativeAdLayout);
            ArrayList arrayList = new ArrayList();
            if (AppLovinSdkUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                arrayList.add(maxNativeAdView.getTitleTextView());
            }
            if (AppLovinSdkUtils.isValidString(getAdvertiser()) && maxNativeAdView.getAdvertiserTextView() != null) {
                arrayList.add(maxNativeAdView.getAdvertiserTextView());
            }
            if (AppLovinSdkUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
                arrayList.add(maxNativeAdView.getBodyTextView());
            }
            if (AppLovinSdkUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                arrayList.add(maxNativeAdView.getCallToActionButton());
            }
            if (getIcon() != null && maxNativeAdView.getIconImageView() != null) {
                arrayList.add(maxNativeAdView.getIconImageView());
            }
            if (getMediaView() != null && maxNativeAdView.getMediaContentViewGroup() != null) {
                arrayList.add(maxNativeAdView.getMediaContentViewGroup());
            }
            nativeAd.registerViewForInteraction(nativeAdLayout, (MediaView) getMediaView(), (ImageView) getIconView(), arrayList);
        }
    }

    /* loaded from: classes.dex */
    public class NativeAdListener implements com.vungle.warren.NativeAdListener {
        private final Context applicationContext;
        private String creativeId;
        private final MaxNativeAdAdapterListener listener;
        private final Bundle serverParameters;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.applicationContext = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.vungle.warren.NativeAdListener
        public void creativeId(String str) {
            VungleMediationAdapter.this.log("Native ad with creative id: " + str + " will be played");
            this.creativeId = str;
        }

        @Override // com.vungle.warren.NativeAdListener
        public void onAdClick(String str) {
            VungleMediationAdapter.this.log("Native ad clicked with placement id: " + str);
            this.listener.onNativeAdClicked();
        }

        @Override // com.vungle.warren.NativeAdListener
        public void onAdImpression(String str) {
            Bundle bundle;
            VungleMediationAdapter.this.log("Native ad shown with placement id: " + str);
            if (AppLovinSdkUtils.isValidString(this.creativeId)) {
                bundle = new Bundle(1);
                bundle.putString("creative_id", this.creativeId);
            } else {
                bundle = null;
            }
            this.listener.onNativeAdDisplayed(bundle);
        }

        @Override // com.vungle.warren.NativeAdListener
        public void onAdLeftApplication(String str) {
            VungleMediationAdapter.this.log("Native ad left application with placement id: " + str);
        }

        @Override // com.vungle.warren.NativeAdListener
        public void onAdLoadError(String str, VungleException vungleException) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleException);
            VungleMediationAdapter.this.log("Native ad failed to load with error " + maxError + " with placement id: " + str);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.vungle.warren.NativeAdListener
        public void onAdPlayError(String str, VungleException vungleException) {
            VungleMediationAdapter.this.log("Native ad failed to play with error " + VungleMediationAdapter.toMaxError(vungleException) + " with placement id: " + str);
        }

        @Override // com.vungle.warren.NativeAdListener
        public void onNativeAdLoaded(NativeAd nativeAd) {
            if (VungleMediationAdapter.this.nativeAd != null && VungleMediationAdapter.this.nativeAd == nativeAd) {
                if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(VungleMediationAdapter.this.nativeAd.getAdTitle())) {
                    VungleMediationAdapter.this.e("Native ad (" + VungleMediationAdapter.this.nativeAd + ") does not have required assets.");
                    this.listener.onNativeAdLoadFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
                    return;
                }
                VungleMediationAdapter.this.log("Native ad loaded: " + VungleMediationAdapter.this.nativeAd.getPlacementId());
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.NativeAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NativeAdListener.this.listener.onNativeAdLoaded(new MaxVungleNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(VungleMediationAdapter.this.nativeAd.getAdTitle()).setAdvertiser(VungleMediationAdapter.this.nativeAd.getAdSponsoredText()).setBody(VungleMediationAdapter.this.nativeAd.getAdBodyText()).setCallToAction(VungleMediationAdapter.this.nativeAd.getAdCallToActionText()).setIcon(new MaxNativeAd.MaxNativeAdImage(Uri.parse(VungleMediationAdapter.this.nativeAd.getAppIcon()))).setMediaView(new MediaView(NativeAdListener.this.applicationContext))), null);
                    }
                });
                return;
            }
            VungleMediationAdapter.this.log("Native ad failed to load: no fill");
            this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
        }
    }

    /* loaded from: classes.dex */
    public class RewardedAdListener implements PlayAdCallback {
        private String creativeId;
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void creativeId(String str) {
            VungleMediationAdapter.this.log("Rewarded ad with creative id: " + str + " will be played");
            this.creativeId = str;
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdClick(String str) {
            VungleMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str, boolean z10, boolean z11) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdLeftApplication(String str) {
            VungleMediationAdapter.this.log("Rewarded ad left application");
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdRewarded(String str) {
            VungleMediationAdapter.this.log("Rewarded ad user did earn reward");
            this.hasGrantedReward = true;
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdStart(String str) {
            VungleMediationAdapter.this.log("Rewarded ad started");
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdViewed(String str) {
            VungleMediationAdapter.this.log("Rewarded ad displayed");
            if (AppLovinSdk.VERSION_CODE >= 9150000 && AppLovinSdkUtils.isValidString(this.creativeId)) {
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", this.creativeId);
                this.listener.onRewardedAdDisplayed(bundle);
            } else {
                this.listener.onRewardedAdDisplayed();
            }
            this.listener.onRewardedAdVideoStarted();
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onError(String str, VungleException vungleException) {
            MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleException);
            VungleMediationAdapter.this.log("Rewarded ad failed to display with error: " + maxError);
            this.listener.onRewardedAdDisplayFailed(maxError);
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str) {
            VungleMediationAdapter.this.log("Rewarded ad video completed");
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || VungleMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = VungleMediationAdapter.this.getReward();
                VungleMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            VungleMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdHidden();
        }
    }

    public VungleMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    private AdConfig createAdConfig(Bundle bundle, Context context) {
        AdConfig adConfig = new AdConfig();
        if (bundle.containsKey(ReportDBAdapter.ReportColumns.COLUMN_ORDINAL)) {
            adConfig.setOrdinal(bundle.getInt(ReportDBAdapter.ReportColumns.COLUMN_ORDINAL));
        }
        if (bundle.containsKey("immersive_mode")) {
            adConfig.setImmersiveMode(bundle.getBoolean("immersive_mode"));
        }
        if (bundle.containsKey("is_muted")) {
            adConfig.setMuted(bundle.getBoolean("is_muted"));
        }
        adConfig.setAdOrientation(vungleAdOrientation(context));
        return adConfig;
    }

    private Context getContext(Activity activity) {
        if (activity != null) {
            return activity.getApplicationContext();
        }
        return getApplicationContext();
    }

    private int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            return configuration.orientation;
        }
        return 0;
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e10) {
            log("Error getting privacy setting " + str + " with exception: ", e10);
            if (AppLovinSdk.VERSION_CODE >= 9140000) {
                return null;
            }
            return Boolean.FALSE;
        }
    }

    private boolean isValidPlacement(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        if (!Vungle.getValidPlacements().contains(maxAdapterResponseParameters.getThirdPartyAdPlacementId()) && !maxAdapterResponseParameters.isTesting()) {
            return false;
        }
        return true;
    }

    private void loadFullscreenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, LoadAdCallback loadAdCallback) {
        AdConfig createAdConfig = createAdConfig(maxAdapterResponseParameters.getServerParameters(), context);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            Vungle.loadAd(thirdPartyAdPlacementId, bidResponse, createAdConfig, loadAdCallback);
        } else {
            Vungle.loadAd(thirdPartyAdPlacementId, createAdConfig, loadAdCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAdViewAd(MaxAdFormat maxAdFormat, BannerAdConfig bannerAdConfig, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdViewAdapterListener maxAdViewAdapterListener, PlayAdCallback playAdCallback) {
        String str;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String label = maxAdFormat.getLabel();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Showing ");
        if (isValidString) {
            str = "bidding ";
        } else {
            str = "";
        }
        i.o(sb2, str, label, " ad for placement: ", thirdPartyAdPlacementId);
        sb2.append("...");
        log(sb2.toString());
        if (isValidString) {
            this.adViewAd = Banners.getBanner(thirdPartyAdPlacementId, bidResponse, bannerAdConfig, playAdCallback);
        } else {
            this.adViewAd = Banners.getBanner(thirdPartyAdPlacementId, bannerAdConfig, playAdCallback);
        }
        if (this.adViewAd != null) {
            log(label + " ad loaded");
            this.adViewAd.setGravity(17);
            maxAdViewAdapterListener.onAdViewAdLoaded(this.adViewAd);
            return;
        }
        MaxAdapterError maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
        log(label + " ad failed to load: " + maxAdapterError);
        maxAdViewAdapterListener.onAdViewAdLoadFailed(maxAdapterError);
    }

    private void showFullscreenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, PlayAdCallback playAdCallback) {
        AdConfig createAdConfig = createAdConfig(maxAdapterResponseParameters.getServerParameters(), context);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        if (AppLovinSdkUtils.isValidString(bidResponse)) {
            Vungle.playAd(thirdPartyAdPlacementId, bidResponse, createAdConfig, playAdCallback);
        } else {
            Vungle.playAd(thirdPartyAdPlacementId, createAdConfig, playAdCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(VungleException vungleException) {
        int exceptionCode = vungleException.getExceptionCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (exceptionCode) {
            case 1:
                maxAdapterError = MaxAdapterError.NO_FILL;
                break;
            case 3:
            case 5:
            case 12:
            case 13:
            case 17:
            case 18:
            case 19:
            case 28:
            case 29:
            case 30:
            case 34:
            case 35:
            case 36:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
            case 4:
            case 37:
                maxAdapterError = MaxAdapterError.AD_EXPIRED;
                break;
            case 6:
            case 7:
            case 9:
            case 16:
                maxAdapterError = MaxAdapterError.NOT_INITIALIZED;
                break;
            case 8:
            case 15:
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                break;
            case 10:
            case 25:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
            case 11:
            case 20:
            case 23:
            case 24:
            case 33:
            case 38:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                break;
            case 14:
            case 21:
            case 22:
            case 26:
                maxAdapterError = MaxAdapterError.SERVER_ERROR;
                break;
            case 27:
            case 31:
            case 32:
                maxAdapterError = MaxAdapterError.WEBVIEW_ERROR;
                break;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), exceptionCode, vungleException.getLocalizedMessage());
    }

    private void updateUserPrivacySettings(MaxAdapterParameters maxAdapterParameters) {
        Boolean privacySetting;
        Vungle.Consent consent;
        Boolean privacySetting2;
        Vungle.Consent consent2;
        if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES && (privacySetting2 = getPrivacySetting("hasUserConsent", maxAdapterParameters)) != null) {
            if (privacySetting2.booleanValue()) {
                consent2 = Vungle.Consent.OPTED_IN;
            } else {
                consent2 = Vungle.Consent.OPTED_OUT;
            }
            Vungle.updateConsentStatus(consent2, "");
        }
        if (AppLovinSdk.VERSION_CODE >= 91100 && (privacySetting = getPrivacySetting("isDoNotSell", maxAdapterParameters)) != null) {
            if (privacySetting.booleanValue()) {
                consent = Vungle.Consent.OPTED_OUT;
            } else {
                consent = Vungle.Consent.OPTED_IN;
            }
            Vungle.updateCCPAStatus(consent);
        }
    }

    private int vungleAdOrientation(Context context) {
        int orientation = getOrientation(context);
        if (orientation == 1) {
            return 0;
        }
        if (orientation == 2) {
            return 1;
        }
        return 2;
    }

    private static AdConfig.AdSize vungleAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdConfig.AdSize.BANNER;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdConfig.AdSize.BANNER_LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdConfig.AdSize.VUNGLE_MREC;
        }
        throw new IllegalArgumentException("Unsupported ad view ad format: " + maxAdFormat.getLabel());
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateUserPrivacySettings(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(Vungle.getAvailableBidTokens(activity.getApplicationContext()));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return "6.12.0.2";
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(BuildConfig.class, "VERSION_NAME");
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        updateUserPrivacySettings(maxAdapterInitializationParameters);
        if (initialized.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("app_id", null);
            log("Initializing Vungle SDK with app id: " + string + "...");
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterInitializationParameters);
            if (privacySetting != null) {
                Vungle.updateUserCoppaStatus(privacySetting.booleanValue());
            }
            Plugin.addWrapperInfo(VungleApiClient.WrapperFramework.max, getAdapterVersion());
            Vungle.init(string, getContext(activity), new InitCallback() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.1
                @Override // com.vungle.warren.InitCallback
                public void onAutoCacheAdAvailable(String str) {
                    VungleMediationAdapter.this.log("Auto-cached ad: " + str);
                }

                @Override // com.vungle.warren.InitCallback
                public void onError(VungleException vungleException) {
                    VungleMediationAdapter.this.log("Vungle SDK failed to initialize with error: ", vungleException);
                    MaxAdapter.InitializationStatus unused = VungleMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    onCompletionListener.onCompletion(VungleMediationAdapter.status, vungleException.getLocalizedMessage());
                }

                @Override // com.vungle.warren.InitCallback
                public void onSuccess() {
                    VungleMediationAdapter.this.log("Vungle SDK initialized");
                    MaxAdapter.InitializationStatus unused = VungleMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(VungleMediationAdapter.status, null);
                }
            }, new VungleSettings.Builder().disableBannerRefresh().build());
            return;
        }
        log("Vungle SDK already initialized");
        onCompletionListener.onCompletion(status, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String str;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        final String label = maxAdFormat.getLabel();
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ");
        if (isValidString) {
            str = "bidding ";
        } else {
            str = "";
        }
        i.o(sb2, str, label, " ad for placement: ", thirdPartyAdPlacementId);
        sb2.append("...");
        log(sb2.toString());
        if (!Vungle.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing " + label + " ad load...");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        if (!isValidPlacement(maxAdapterResponseParameters)) {
            log(label + " ad failed to load due to an invalid placement id: " + thirdPartyAdPlacementId);
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        final AdViewAdListener adViewAdListener = new AdViewAdListener(label, maxAdViewAdapterListener);
        final BannerAdConfig bannerAdConfig = new BannerAdConfig();
        AdConfig.AdSize vungleAdSize = vungleAdSize(maxAdFormat);
        bannerAdConfig.setAdSize(vungleAdSize);
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        if (serverParameters.containsKey("is_muted")) {
            bannerAdConfig.setMuted(serverParameters.getBoolean("is_muted"));
        }
        if (isValidString) {
            if (Banners.canPlayAd(thirdPartyAdPlacementId, bidResponse, vungleAdSize)) {
                showAdViewAd(maxAdFormat, bannerAdConfig, maxAdapterResponseParameters, maxAdViewAdapterListener, adViewAdListener);
                return;
            }
        } else if (Banners.canPlayAd(thirdPartyAdPlacementId, vungleAdSize)) {
            showAdViewAd(maxAdFormat, bannerAdConfig, maxAdapterResponseParameters, maxAdViewAdapterListener, adViewAdListener);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        LoadAdCallback loadAdCallback = new LoadAdCallback() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.5
            @Override // com.vungle.warren.LoadAdCallback
            public void onAdLoad(String str2) {
                VungleMediationAdapter.this.showAdViewAd(maxAdFormat, bannerAdConfig, maxAdapterResponseParameters, maxAdViewAdapterListener, adViewAdListener);
            }

            @Override // com.vungle.warren.LoadAdCallback
            public void onError(String str2, VungleException vungleException) {
                MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleException);
                VungleMediationAdapter vungleMediationAdapter = VungleMediationAdapter.this;
                StringBuilder sb3 = new StringBuilder();
                i.o(sb3, label, " ad for placement ", str2, " failed to load with error: ");
                sb3.append(maxError);
                vungleMediationAdapter.log(sb3.toString());
                maxAdViewAdapterListener.onAdViewAdLoadFailed(maxError);
            }
        };
        if (isValidString) {
            Banners.loadBanner(thirdPartyAdPlacementId, bidResponse, bannerAdConfig, loadAdCallback);
        } else {
            Banners.loadBanner(thirdPartyAdPlacementId, bannerAdConfig, loadAdCallback);
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String str;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ");
        if (isValidString) {
            str = "bidding ";
        } else {
            str = "";
        }
        log(l.q(sb2, str, "app open ad for placement: ", thirdPartyAdPlacementId, "..."));
        if (!Vungle.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing app open ad load...");
            maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        if (!isValidPlacement(maxAdapterResponseParameters)) {
            log("App open ad failed to load due to an invalid placement id: " + thirdPartyAdPlacementId);
            maxAppOpenAdapterListener.onAppOpenAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        if (isValidString) {
            if (Vungle.canPlayAd(thirdPartyAdPlacementId, bidResponse)) {
                log("App open ad loaded");
                maxAppOpenAdapterListener.onAppOpenAdLoaded();
                return;
            }
        } else if (Vungle.canPlayAd(thirdPartyAdPlacementId)) {
            log("App open ad loaded");
            maxAppOpenAdapterListener.onAppOpenAdLoaded();
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        loadFullscreenAd(maxAdapterResponseParameters, getContext(activity), new LoadAdCallback() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.3
            @Override // com.vungle.warren.LoadAdCallback
            public void onAdLoad(String str2) {
                VungleMediationAdapter.this.log("App open ad loaded");
                maxAppOpenAdapterListener.onAppOpenAdLoaded();
            }

            @Override // com.vungle.warren.LoadAdCallback
            public void onError(String str2, VungleException vungleException) {
                MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleException);
                VungleMediationAdapter.this.log("App open ad for placement " + str2 + " failed to load with error: " + maxError);
                maxAppOpenAdapterListener.onAppOpenAdLoadFailed(maxError);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String str;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ");
        if (isValidString) {
            str = "bidding ";
        } else {
            str = "";
        }
        log(l.q(sb2, str, "interstitial ad for placement: ", thirdPartyAdPlacementId, "..."));
        if (!Vungle.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing interstitial ad load...");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        if (!isValidPlacement(maxAdapterResponseParameters)) {
            log("Interstitial ad failed to load due to an invalid placement id: " + thirdPartyAdPlacementId);
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        if (isValidString) {
            if (Vungle.canPlayAd(thirdPartyAdPlacementId, bidResponse)) {
                log("Interstitial ad loaded");
                maxInterstitialAdapterListener.onInterstitialAdLoaded();
                return;
            }
        } else if (Vungle.canPlayAd(thirdPartyAdPlacementId)) {
            log("Interstitial ad loaded");
            maxInterstitialAdapterListener.onInterstitialAdLoaded();
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        loadFullscreenAd(maxAdapterResponseParameters, getContext(activity), new LoadAdCallback() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.2
            @Override // com.vungle.warren.LoadAdCallback
            public void onAdLoad(String str2) {
                VungleMediationAdapter.this.log("Interstitial ad loaded");
                maxInterstitialAdapterListener.onInterstitialAdLoaded();
            }

            @Override // com.vungle.warren.LoadAdCallback
            public void onError(String str2, VungleException vungleException) {
                MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleException);
                VungleMediationAdapter.this.log("Interstitial ad for placement " + str2 + " failed to load with error: " + maxError);
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(maxError);
            }
        });
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String str;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ");
        if (isValidString) {
            str = "bidding ";
        } else {
            str = "";
        }
        log(l.q(sb2, str, "native ad for placement: ", thirdPartyAdPlacementId, "..."));
        if (!Vungle.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing interstitial ad load...");
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        if (!isValidPlacement(maxAdapterResponseParameters)) {
            log("Native ad failed to load due to an invalid placement id: " + thirdPartyAdPlacementId);
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        Context context = getContext(activity);
        this.nativeAd = new NativeAd(context, thirdPartyAdPlacementId);
        AdConfig adConfig = new AdConfig();
        if (isValidString) {
            this.nativeAd.loadAd(adConfig, bidResponse, new NativeAdListener(maxAdapterResponseParameters, context, maxNativeAdAdapterListener));
        } else {
            this.nativeAd.loadAd(adConfig, new NativeAdListener(maxAdapterResponseParameters, context, maxNativeAdAdapterListener));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String str;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading ");
        if (isValidString) {
            str = "bidding ";
        } else {
            str = "";
        }
        log(l.q(sb2, str, "rewarded ad for placement: ", thirdPartyAdPlacementId, "..."));
        if (!Vungle.isInitialized()) {
            log("Vungle SDK not successfully initialized: failing rewarded ad load...");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        if (!isValidPlacement(maxAdapterResponseParameters)) {
            log("Rewarded ad failed to load due to an invalid placement id: " + thirdPartyAdPlacementId);
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        if (isValidString) {
            if (Vungle.canPlayAd(thirdPartyAdPlacementId, bidResponse)) {
                log("Rewarded ad loaded");
                maxRewardedAdapterListener.onRewardedAdLoaded();
                return;
            }
        } else if (Vungle.canPlayAd(thirdPartyAdPlacementId)) {
            log("Rewarded ad loaded");
            maxRewardedAdapterListener.onRewardedAdLoaded();
            return;
        }
        updateUserPrivacySettings(maxAdapterResponseParameters);
        loadFullscreenAd(maxAdapterResponseParameters, getContext(activity), new LoadAdCallback() { // from class: com.applovin.mediation.adapters.VungleMediationAdapter.4
            @Override // com.vungle.warren.LoadAdCallback
            public void onAdLoad(String str2) {
                VungleMediationAdapter.this.log("Rewarded ad loaded");
                maxRewardedAdapterListener.onRewardedAdLoaded();
            }

            @Override // com.vungle.warren.LoadAdCallback
            public void onError(String str2, VungleException vungleException) {
                MaxAdapterError maxError = VungleMediationAdapter.toMaxError(vungleException);
                VungleMediationAdapter.this.log("Rewarded ad for placement " + str2 + " failed to load with error: " + maxError);
                maxRewardedAdapterListener.onRewardedAdLoadFailed(maxError);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        VungleBanner vungleBanner = this.adViewAd;
        if (vungleBanner != null) {
            vungleBanner.destroyAd();
            this.adViewAd = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.nativeAd.destroy();
            this.nativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String str;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Showing ");
        if (isValidString) {
            str = "bidding ";
        } else {
            str = "";
        }
        log(l.q(sb2, str, "app open ad for placement: ", thirdPartyAdPlacementId, "..."));
        Context context = getContext(activity);
        if (isValidString) {
            if (Vungle.canPlayAd(thirdPartyAdPlacementId, bidResponse)) {
                showFullscreenAd(maxAdapterResponseParameters, context, new AppOpenAdListener(maxAppOpenAdapterListener));
                return;
            }
        } else if (Vungle.canPlayAd(thirdPartyAdPlacementId)) {
            showFullscreenAd(maxAdapterResponseParameters, context, new AppOpenAdListener(maxAppOpenAdapterListener));
            return;
        }
        log("App open ad not ready");
        maxAppOpenAdapterListener.onAppOpenAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String str;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Showing ");
        if (isValidString) {
            str = "bidding ";
        } else {
            str = "";
        }
        log(l.q(sb2, str, "interstitial ad for placement: ", thirdPartyAdPlacementId, "..."));
        if (isValidString) {
            if (Vungle.canPlayAd(thirdPartyAdPlacementId, bidResponse)) {
                showFullscreenAd(maxAdapterResponseParameters, getContext(activity), new InterstitialAdListener(maxInterstitialAdapterListener));
                return;
            }
        } else if (Vungle.canPlayAd(thirdPartyAdPlacementId)) {
            showFullscreenAd(maxAdapterResponseParameters, getContext(activity), new InterstitialAdListener(maxInterstitialAdapterListener));
            return;
        }
        log("Interstitial ad not ready");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String str;
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Showing ");
        if (isValidString) {
            str = "bidding ";
        } else {
            str = "";
        }
        log(l.q(sb2, str, "rewarded ad for placement: ", thirdPartyAdPlacementId, "..."));
        if (isValidString) {
            if (Vungle.canPlayAd(thirdPartyAdPlacementId, bidResponse)) {
                configureReward(maxAdapterResponseParameters);
                showFullscreenAd(maxAdapterResponseParameters, getContext(activity), new RewardedAdListener(maxRewardedAdapterListener));
                return;
            }
        } else if (Vungle.canPlayAd(thirdPartyAdPlacementId)) {
            configureReward(maxAdapterResponseParameters);
            showFullscreenAd(maxAdapterResponseParameters, getContext(activity), new RewardedAdListener(maxRewardedAdapterListener));
            return;
        }
        log("Rewarded ad not ready");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }
}
