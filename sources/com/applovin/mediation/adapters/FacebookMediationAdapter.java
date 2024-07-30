package com.applovin.mediation.adapters;

import a3.l;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.huawei.openalliance.ad.constant.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class FacebookMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxSignalProvider {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus sStatus;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private NativeAd mNativeAd;
    private NativeBannerAd mNativeBannerAd;
    private RewardedVideoAd mRewardedInterAd;
    private RewardedVideoAd mRewardedVideoAd;
    private final AtomicBoolean onInterstitialAdHiddenCalled;
    private final AtomicBoolean onRewardedAdHiddenCalled;
    private final AtomicBoolean onRewardedAdVideoCompletedCalled;

    /* loaded from: classes.dex */
    public class AdViewListener implements AdListener {
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;

        public AdViewListener(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad clicked: " + ad2.getPlacementId());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad loaded: " + ad2.getPlacementId());
            this.listener.onAdViewAdLoaded(FacebookMediationAdapter.this.mAdView);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad (" + ad2.getPlacementId() + ") failed to load with error (" + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad displayed: " + ad2.getPlacementId());
            this.listener.onAdViewAdDisplayed();
        }
    }

    /* loaded from: classes.dex */
    public class MaxFacebookNativeAd extends MaxNativeAd {
        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            ImageView imageView;
            Ad ad2 = FacebookMediationAdapter.this.mNativeAd != null ? FacebookMediationAdapter.this.mNativeAd : FacebookMediationAdapter.this.mNativeBannerAd;
            if (ad2 == null) {
                FacebookMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            if (list.isEmpty()) {
                FacebookMediationAdapter.this.e("No clickable views to prepare");
                return false;
            }
            Iterator<View> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    View next = it.next();
                    if (next instanceof ImageView) {
                        imageView = (ImageView) next;
                        break;
                    }
                } else {
                    imageView = null;
                    break;
                }
            }
            if (ad2 instanceof NativeBannerAd) {
                if (imageView != null) {
                    ((NativeBannerAd) ad2).registerViewForInteraction(viewGroup, imageView, list);
                    return true;
                }
                if (getMediaView() != null) {
                    ((NativeBannerAd) ad2).registerViewForInteraction(viewGroup, (ImageView) getMediaView(), list);
                    return true;
                }
                FacebookMediationAdapter.this.e("Failed to register native ad view for interaction: icon image view and media view are null");
                return false;
            }
            ((NativeAd) ad2).registerViewForInteraction(viewGroup, (MediaView) getMediaView(), imageView, list);
            return true;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
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
            if (arrayList.isEmpty()) {
                FacebookMediationAdapter.this.e("No clickable views to prepare");
            } else {
                prepareForInteraction(arrayList, maxNativeAdView);
            }
        }

        private MaxFacebookNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }
    }

    /* loaded from: classes.dex */
    public class MaxNativeAdListener implements NativeAdListener {
        final Context context;
        final MaxNativeAdAdapterListener listener;
        final Bundle serverParameters;

        public MaxNativeAdListener(Bundle bundle, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = bundle;
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleNativeAdLoaded(com.facebook.ads.NativeAdBase r6, android.graphics.drawable.Drawable r7, com.facebook.ads.MediaView r8, android.content.Context r9) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof com.facebook.ads.NativeAd
                r1 = 0
                if (r0 == 0) goto L1d
                com.facebook.ads.NativeAdBase$Image r0 = r6.getAdCoverImage()
                if (r0 == 0) goto L1d
                com.facebook.ads.NativeAdBase$Image r0 = r6.getAdCoverImage()
                java.lang.String r0 = r0.getUrl()
                android.net.Uri r0 = android.net.Uri.parse(r0)
                com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r2 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                r2.<init>(r0)
                goto L1e
            L1d:
                r2 = r1
            L1e:
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = new com.applovin.mediation.nativeAds.MaxNativeAd$Builder
                r0.<init>()
                com.applovin.mediation.MaxAdFormat r3 = com.applovin.mediation.MaxAdFormat.NATIVE
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r0.setAdFormat(r3)
                java.lang.String r3 = r6.getAdHeadline()
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r0.setTitle(r3)
                java.lang.String r3 = r6.getAdvertiserName()
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r0.setAdvertiser(r3)
                java.lang.String r3 = r6.getAdBodyText()
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r0.setBody(r3)
                java.lang.String r3 = r6.getAdCallToAction()
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r0.setCallToAction(r3)
                com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage r3 = new com.applovin.mediation.nativeAds.MaxNativeAd$MaxNativeAdImage
                r3.<init>(r7)
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r0.setIcon(r3)
                com.facebook.ads.AdOptionsView r3 = new com.facebook.ads.AdOptionsView
                r3.<init>(r9, r6, r1)
                com.applovin.mediation.nativeAds.MaxNativeAd$Builder r0 = r0.setOptionsView(r3)
                boolean r3 = r6 instanceof com.facebook.ads.NativeAd
                if (r3 == 0) goto L69
                int r3 = com.applovin.sdk.AppLovinSdk.VERSION_CODE
                r4 = 11040399(0xa8768f, float:1.5470894E-38)
                if (r3 < r4) goto L69
                r0.setMainImage(r2)
            L69:
                boolean r6 = r6 instanceof com.facebook.ads.NativeBannerAd
                if (r6 == 0) goto L86
                android.widget.ImageView r6 = new android.widget.ImageView
                r6.<init>(r9)
                r6.setImageDrawable(r7)
                r0.setMediaView(r6)
                if (r7 == 0) goto L84
                int r6 = r7.getIntrinsicWidth()
                float r6 = (float) r6
                int r7 = r7.getIntrinsicHeight()
                goto L92
            L84:
                r6 = 0
                goto L94
            L86:
                r0.setMediaView(r8)
                int r6 = r8.getMediaWidth()
                float r6 = (float) r6
                int r7 = r8.getMediaHeight()
            L92:
                float r7 = (float) r7
                float r6 = r6 / r7
            L94:
                int r7 = com.applovin.sdk.AppLovinSdk.VERSION_CODE
                r8 = 11040000(0xa87500, float:1.5470335E-38)
                if (r7 < r8) goto L9e
                r0.setMediaContentAspectRatio(r6)
            L9e:
                com.applovin.mediation.adapters.FacebookMediationAdapter$MaxFacebookNativeAd r6 = new com.applovin.mediation.adapters.FacebookMediationAdapter$MaxFacebookNativeAd
                com.applovin.mediation.adapters.FacebookMediationAdapter r7 = com.applovin.mediation.adapters.FacebookMediationAdapter.this
                r6.<init>(r0)
                com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener r7 = r5.listener
                r7.onNativeAdLoaded(r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.FacebookMediationAdapter.MaxNativeAdListener.handleNativeAdLoaded(com.facebook.ads.NativeAdBase, android.graphics.drawable.Drawable, com.facebook.ads.MediaView, android.content.Context):void");
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log("Native clicked: " + ad2.getPlacementId());
            this.listener.onNativeAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Native ad loaded: " + ad2.getPlacementId());
            final NativeAdBase nativeAdBase = FacebookMediationAdapter.this.mNativeAd != null ? FacebookMediationAdapter.this.mNativeAd : FacebookMediationAdapter.this.mNativeBannerAd;
            if (nativeAdBase != null && nativeAdBase == ad2) {
                if (nativeAdBase.isAdInvalidated()) {
                    FacebookMediationAdapter.this.log("Native ad failed to load: ad is no longer valid");
                    this.listener.onNativeAdLoadFailed(MaxAdapterError.AD_EXPIRED);
                    return;
                } else {
                    if (AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) && TextUtils.isEmpty(nativeAdBase.getAdHeadline())) {
                        FacebookMediationAdapter.this.e("Native ad (" + nativeAdBase + ") does not have required assets.");
                        this.listener.onNativeAdLoadFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.MaxNativeAdListener.1
                        @Override // java.lang.Runnable
                        public void run() {
                            final MediaView mediaView = new MediaView(MaxNativeAdListener.this.context);
                            Drawable preloadedIconViewDrawable = nativeAdBase.getPreloadedIconViewDrawable();
                            final NativeAdBase.Image adIcon = nativeAdBase.getAdIcon();
                            if (preloadedIconViewDrawable != null) {
                                MaxNativeAdListener maxNativeAdListener = MaxNativeAdListener.this;
                                maxNativeAdListener.handleNativeAdLoaded(nativeAdBase, preloadedIconViewDrawable, mediaView, maxNativeAdListener.context);
                            } else {
                                if (adIcon != null) {
                                    FacebookMediationAdapter.this.getCachingExecutorService().execute(new Runnable() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.MaxNativeAdListener.1.1
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            Drawable drawable = null;
                                            if (AppLovinSdkUtils.isValidString(adIcon.getUrl())) {
                                                FacebookMediationAdapter.this.log("Adding native ad icon (" + adIcon.getUrl() + ") to queue to be fetched");
                                                Future<Drawable> createDrawableFuture = FacebookMediationAdapter.this.createDrawableFuture(adIcon.getUrl(), MaxNativeAdListener.this.context.getResources());
                                                int i10 = BundleUtils.getInt("image_task_timeout_seconds", 10, MaxNativeAdListener.this.serverParameters);
                                                if (createDrawableFuture != null) {
                                                    try {
                                                        drawable = createDrawableFuture.get(i10, TimeUnit.SECONDS);
                                                    } catch (Throwable th) {
                                                        FacebookMediationAdapter.this.e("Image fetching tasks failed", th);
                                                    }
                                                }
                                            }
                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                            MaxNativeAdListener maxNativeAdListener2 = MaxNativeAdListener.this;
                                            maxNativeAdListener2.handleNativeAdLoaded(nativeAdBase, drawable, mediaView, maxNativeAdListener2.context);
                                        }
                                    });
                                    return;
                                }
                                FacebookMediationAdapter.this.log("No native ad icon (optional) available for the current creative.");
                                MaxNativeAdListener maxNativeAdListener2 = MaxNativeAdListener.this;
                                maxNativeAdListener2.handleNativeAdLoaded(nativeAdBase, null, mediaView, maxNativeAdListener2.context);
                            }
                        }
                    });
                    return;
                }
            }
            FacebookMediationAdapter.this.log("Native ad failed to load: no fill");
            this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log("Native ad (" + ad2.getPlacementId() + ") failed to load with error (" + maxError);
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log("Native shown: " + ad2.getPlacementId());
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Native ad successfully downloaded media: " + ad2.getPlacementId());
        }
    }

    /* loaded from: classes.dex */
    public class NativeAdViewListener implements NativeAdListener {
        final WeakReference<Activity> activityRef;
        final MaxAdFormat adFormat;
        final MaxAdViewAdapterListener listener;
        final Bundle serverParameters;

        public NativeAdViewListener(Bundle bundle, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.serverParameters = bundle;
            this.activityRef = new WeakReference<>(activity);
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        private void renderNativeAdView() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.NativeAdViewListener.1
                @Override // java.lang.Runnable
                public void run() {
                    MaxNativeAdView createMaxNativeAdView;
                    ViewGroup mediaContentView;
                    String str;
                    Activity activity = NativeAdViewListener.this.activityRef.get();
                    Context context = FacebookMediationAdapter.this.getContext(activity);
                    MediaView mediaView = new MediaView(context);
                    MediaView mediaView2 = new MediaView(context);
                    MaxNativeAd build = new MaxNativeAd.Builder().setAdFormat(NativeAdViewListener.this.adFormat).setTitle(FacebookMediationAdapter.this.mNativeAd.getAdHeadline()).setAdvertiser(FacebookMediationAdapter.this.mNativeAd.getAdvertiserName()).setBody(FacebookMediationAdapter.this.mNativeAd.getAdBodyText()).setCallToAction(FacebookMediationAdapter.this.mNativeAd.getAdCallToAction()).setIconView(mediaView).setMediaView(mediaView2).setOptionsView(new AdOptionsView(context, FacebookMediationAdapter.this.mNativeAd, null)).build();
                    String string = BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters);
                    if (string.contains("vertical")) {
                        if (AppLovinSdk.VERSION_CODE < 9140500) {
                            FacebookMediationAdapter.this.log("Vertical native banners are only supported on MAX SDK 9.14.5 and above. Default native template will be used.");
                        }
                        if (!string.equals("vertical")) {
                            createMaxNativeAdView = FacebookMediationAdapter.this.createMaxNativeAdView(build, string, activity);
                        } else {
                            NativeAdViewListener nativeAdViewListener = NativeAdViewListener.this;
                            if (nativeAdViewListener.adFormat == MaxAdFormat.LEADER) {
                                str = "vertical_leader_template";
                            } else {
                                str = "vertical_media_banner_template";
                            }
                            createMaxNativeAdView = FacebookMediationAdapter.this.createMaxNativeAdView(build, str, activity);
                        }
                    } else if (AppLovinSdk.VERSION_CODE < 9140500) {
                        FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                        if (!AppLovinSdkUtils.isValidString(string)) {
                            string = "no_body_banner_template";
                        }
                        createMaxNativeAdView = facebookMediationAdapter.createMaxNativeAdView(build, string, activity);
                    } else {
                        FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                        if (!AppLovinSdkUtils.isValidString(string)) {
                            string = "media_banner_template";
                        }
                        createMaxNativeAdView = facebookMediationAdapter2.createMaxNativeAdView(build, string, activity);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (build.getIconView() != null && createMaxNativeAdView.getIconContentView() != null) {
                        arrayList.add(createMaxNativeAdView.getIconContentView());
                    }
                    if (AppLovinSdk.VERSION_CODE >= 11000000) {
                        mediaContentView = createMaxNativeAdView.getMediaContentViewGroup();
                    } else {
                        mediaContentView = createMaxNativeAdView.getMediaContentView();
                    }
                    if (build.getMediaView() != null && mediaContentView != null) {
                        arrayList.add(mediaContentView);
                    }
                    if (AppLovinSdkUtils.isValidString(build.getTitle()) && createMaxNativeAdView.getTitleTextView() != null) {
                        arrayList.add(createMaxNativeAdView.getTitleTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(build.getCallToAction()) && createMaxNativeAdView.getCallToActionButton() != null) {
                        arrayList.add(createMaxNativeAdView.getCallToActionButton());
                    }
                    if (AppLovinSdkUtils.isValidString(build.getAdvertiser()) && createMaxNativeAdView.getAdvertiserTextView() != null) {
                        arrayList.add(createMaxNativeAdView.getAdvertiserTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(build.getBody()) && createMaxNativeAdView.getBodyTextView() != null) {
                        arrayList.add(createMaxNativeAdView.getBodyTextView());
                    }
                    FacebookMediationAdapter.this.mNativeAd.registerViewForInteraction(createMaxNativeAdView, mediaView2, mediaView, arrayList);
                    NativeAdViewListener.this.listener.onAdViewAdLoaded(createMaxNativeAdView);
                }
            });
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " clicked: " + ad2.getPlacementId());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad loaded: " + ad2.getPlacementId());
            if (FacebookMediationAdapter.this.mNativeAd != null && FacebookMediationAdapter.this.mNativeAd == ad2) {
                if (FacebookMediationAdapter.this.mNativeAd.isAdInvalidated()) {
                    FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load: ad is no longer valid");
                    this.listener.onAdViewAdLoadFailed(MaxAdapterError.AD_EXPIRED);
                    return;
                }
                if (this.adFormat == MaxAdFormat.MREC) {
                    this.listener.onAdViewAdLoaded(NativeAdView.render(FacebookMediationAdapter.this.getContext(this.activityRef.get()), FacebookMediationAdapter.this.mNativeAd));
                    return;
                } else {
                    if (AppLovinSdk.VERSION_CODE >= 9140000) {
                        renderNativeAdView();
                        return;
                    }
                    FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " failed to load: AppLovin SDK version must be at least 9.14.0");
                    this.listener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
                    return;
                }
            }
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad failed to load: no fill");
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " ad (" + ad2.getPlacementId() + ") failed to load with error: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " shown: " + ad2.getPlacementId());
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Native " + this.adFormat.getLabel() + " successfully downloaded media: " + ad2.getPlacementId());
        }
    }

    /* loaded from: classes.dex */
    public class RewardedAdListener implements RewardedVideoAdExtendedListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log("Rewarded ad clicked: " + ad2.getPlacementId());
            this.listener.onRewardedAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Rewarded ad loaded: " + ad2.getPlacementId());
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log("Rewarded ad (" + ad2.getPlacementId() + ") failed to load with error (" + maxError);
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log("Rewarded ad logging impression: " + ad2.getPlacementId());
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        @Override // com.facebook.ads.RewardedVideoAdExtendedListener
        public void onRewardedVideoActivityDestroyed() {
            FacebookMediationAdapter.this.log("Rewarded ad Activity destroyed");
            if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdVideoCompleted();
            }
            if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdHidden();
            }
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoClosed() {
            FacebookMediationAdapter.this.log("Rewarded ad hidden");
            if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                if (this.hasGrantedReward || FacebookMediationAdapter.this.shouldAlwaysRewardUser()) {
                    MaxReward reward = FacebookMediationAdapter.this.getReward();
                    FacebookMediationAdapter.this.log("Rewarded user with reward: " + reward);
                    this.listener.onUserRewarded(reward);
                }
                this.listener.onRewardedAdHidden();
            }
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoCompleted() {
            FacebookMediationAdapter.this.log("Rewarded ad video completed");
            if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdVideoCompleted();
                this.hasGrantedReward = true;
            }
        }
    }

    public FacebookMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
        this.onInterstitialAdHiddenCalled = new AtomicBoolean();
        this.onRewardedAdVideoCompletedCalled = new AtomicBoolean();
        this.onRewardedAdHiddenCalled = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView createMaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        if (AppLovinSdk.VERSION_CODE >= 11010000) {
            return new MaxNativeAdView(maxNativeAd, str, getApplicationContext());
        }
        return new MaxNativeAdView(maxNativeAd, str, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(Activity activity) {
        if (activity != null) {
            return activity.getApplicationContext();
        }
        return getApplicationContext();
    }

    private String getMediationIdentifier() {
        return "APPLOVIN_" + AppLovinSdk.VERSION + w.bE + getAdapterVersion();
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

    private AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER_HEIGHT_50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.BANNER_HEIGHT_90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.RECTANGLE_HEIGHT_250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static MaxAdapterError toMaxError(AdError adError) {
        int errorCode = adError.getErrorCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (errorCode != 2006) {
            if (errorCode != 2100) {
                if (errorCode != 9001) {
                    if (errorCode != 2008) {
                        if (errorCode != 2009) {
                            switch (errorCode) {
                                case 1000:
                                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                                    break;
                                case 1001:
                                    maxAdapterError = MaxAdapterError.NO_FILL;
                                    break;
                                default:
                                    switch (errorCode) {
                                        case 2000:
                                            break;
                                        case 2001:
                                            break;
                                        case 2002:
                                            break;
                                        case 2003:
                                        case 2004:
                                            break;
                                        default:
                                            switch (errorCode) {
                                                case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                                    maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets");
                                                    break;
                                                default:
                                                    switch (errorCode) {
                                                        case AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED /* 7003 */:
                                                            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                                                            break;
                                                    }
                                            }
                                    }
                                case 1002:
                                    maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                                    break;
                            }
                            return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
                        }
                        maxAdapterError = MaxAdapterError.TIMEOUT;
                        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
                    }
                    maxAdapterError = MaxAdapterError.SERVER_ERROR;
                    return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
                }
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
            }
            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
            return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
        }
        maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
    }

    private void updateAdSettings(MaxAdapterParameters maxAdapterParameters) {
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        if (serverParameters.containsKey("video_autoplay")) {
            AdSettings.setVideoAutoplay(serverParameters.getBoolean("video_autoplay"));
        }
        Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting != null) {
            AdSettings.setMixedAudience(privacySetting.booleanValue());
        }
        String string = serverParameters.getString("test_device_ids", null);
        if (!TextUtils.isEmpty(string)) {
            AdSettings.addTestDevices(Arrays.asList(string.split(",")));
        }
        AdSettings.setMediationService(getMediationIdentifier());
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateAdSettings(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(BidderTokenProvider.getBidderToken(getContext(activity)));
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
        updateAdSettings(maxAdapterInitializationParameters);
        if (INITIALIZED.compareAndSet(false, true)) {
            sStatus = MaxAdapter.InitializationStatus.INITIALIZING;
            ArrayList<String> stringArrayList = maxAdapterInitializationParameters.getServerParameters().getStringArrayList("placement_ids");
            AudienceNetworkAds.InitListener initListener = new AudienceNetworkAds.InitListener() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.1
                @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                public void onInitialized(AudienceNetworkAds.InitResult initResult) {
                    if (initResult.isSuccess()) {
                        FacebookMediationAdapter.this.log("Facebook SDK successfully finished initialization: " + initResult.getMessage());
                        MaxAdapter.InitializationStatus unused = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                        onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, null);
                        return;
                    }
                    FacebookMediationAdapter.this.log("Facebook SDK failed to finished initialization: " + initResult.getMessage());
                    MaxAdapter.InitializationStatus unused2 = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                    onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, initResult.getMessage());
                }
            };
            if (maxAdapterInitializationParameters.isTesting()) {
                AdSettings.setDebugBuild(true);
            }
            log("Initializing Facebook SDK with placements: " + stringArrayList);
            AudienceNetworkAds.buildInitSettings(getContext(activity)).withMediationService(getMediationIdentifier()).withPlacementIds(stringArrayList).withInitListener(initListener).initialize();
            return;
        }
        log("Facebook attempted initialization already - marking initialization as completed");
        onCompletionListener.onCompletion(sStatus, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String str;
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sb2 = new StringBuilder("Loading");
        if (z10) {
            str = " native ";
        } else {
            str = " ";
        }
        sb2.append(str);
        sb2.append(maxAdFormat.getLabel());
        sb2.append(" ad: ");
        sb2.append(thirdPartyAdPlacementId);
        sb2.append("...");
        log(sb2.toString());
        updateAdSettings(maxAdapterResponseParameters);
        if (z10) {
            NativeAd nativeAd = new NativeAd(getContext(activity), thirdPartyAdPlacementId);
            this.mNativeAd = nativeAd;
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdViewListener(maxAdapterResponseParameters.getServerParameters(), maxAdFormat, activity, maxAdViewAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            AdView adView = new AdView(getContext(activity), thirdPartyAdPlacementId, toAdSize(maxAdFormat));
            this.mAdView = adView;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(new AdViewListener(maxAdFormat, maxAdViewAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad: " + thirdPartyAdPlacementId + "...");
        updateAdSettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mInterstitialAd = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd.buildLoadAdConfig().withAdListener(new InterstitialAdListener(maxInterstitialAdapterListener));
        if (this.mInterstitialAd.isAdLoaded() && !this.mInterstitialAd.isAdInvalidated()) {
            log("An interstitial ad has been loaded already");
            maxInterstitialAdapterListener.onInterstitialAdLoaded();
        } else {
            log("Loading bidding interstitial ad...");
            this.mInterstitialAd.loadAd(withAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String str;
        boolean z10 = BundleUtils.getBoolean("is_native_banner", maxAdapterResponseParameters.getServerParameters());
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sb2 = new StringBuilder("Loading native ");
        if (z10) {
            str = "banner ";
        } else {
            str = "";
        }
        log(l.q(sb2, str, "ad: ", thirdPartyAdPlacementId, "..."));
        updateAdSettings(maxAdapterResponseParameters);
        Context context = getContext(activity);
        if (z10) {
            NativeBannerAd nativeBannerAd = new NativeBannerAd(context, thirdPartyAdPlacementId);
            this.mNativeBannerAd = nativeBannerAd;
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new MaxNativeAdListener(maxAdapterResponseParameters.getServerParameters(), context, maxNativeAdAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            NativeAd nativeAd = new NativeAd(context, thirdPartyAdPlacementId);
            this.mNativeAd = nativeAd;
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new MaxNativeAdListener(maxAdapterResponseParameters.getServerParameters(), context, maxNativeAdAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded: " + thirdPartyAdPlacementId + "...");
        updateAdSettings(maxAdapterResponseParameters);
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mRewardedVideoAd = rewardedVideoAd;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener = rewardedVideoAd.buildLoadAdConfig().withAdListener(new RewardedAdListener(maxRewardedAdapterListener));
        if (this.mRewardedVideoAd.isAdLoaded() && !this.mRewardedVideoAd.isAdInvalidated()) {
            log("A rewarded ad has been loaded already");
            maxRewardedAdapterListener.onRewardedAdLoaded();
        } else {
            log("Loading bidding rewarded ad...");
            this.mRewardedVideoAd.loadAd(withAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded interstitial: " + thirdPartyAdPlacementId + "...");
        updateAdSettings(maxAdapterResponseParameters);
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mRewardedInterAd = rewardedVideoAd;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener = rewardedVideoAd.buildLoadAdConfig().withAdExperience(AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL).withAdListener(new RewardedVideoAdExtendedListener() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.2
            private boolean hasGrantedReward;

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad2) {
                FacebookMediationAdapter.this.log("Rewarded interstitial ad clicked: " + thirdPartyAdPlacementId);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdClicked();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad2) {
                FacebookMediationAdapter.this.log("Rewarded interstitial ad loaded: " + thirdPartyAdPlacementId);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded();
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad2, AdError adError) {
                MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
                FacebookMediationAdapter.this.log("Rewarded interstitial ad (" + thirdPartyAdPlacementId + ") failed to load with error: " + maxError);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoadFailed(maxError);
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad2) {
                FacebookMediationAdapter.this.log("Rewarded interstitial ad logging impression: " + thirdPartyAdPlacementId);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayed();
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdVideoStarted();
            }

            @Override // com.facebook.ads.RewardedVideoAdExtendedListener
            public void onRewardedVideoActivityDestroyed() {
                FacebookMediationAdapter.this.log("Rewarded interstitial ad Activity destroyed: " + thirdPartyAdPlacementId);
                if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdVideoCompleted();
                }
                if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdHidden();
                }
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public void onRewardedVideoClosed() {
                if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                    if (this.hasGrantedReward || FacebookMediationAdapter.this.shouldAlwaysRewardUser()) {
                        MaxReward reward = FacebookMediationAdapter.this.getReward();
                        FacebookMediationAdapter.this.log("Rewarded user with reward: " + reward);
                        maxRewardedInterstitialAdapterListener.onUserRewarded(reward);
                    }
                    FacebookMediationAdapter.this.log("Rewarded interstitial ad hidden: " + thirdPartyAdPlacementId);
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdHidden();
                    return;
                }
                FacebookMediationAdapter.this.log("Rewarded interstitial ad hidden: " + thirdPartyAdPlacementId);
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public void onRewardedVideoCompleted() {
                FacebookMediationAdapter.this.log("Rewarded interstitial ad video completed: " + thirdPartyAdPlacementId);
                if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdVideoCompleted();
                    this.hasGrantedReward = true;
                }
            }
        });
        if (this.mRewardedInterAd.isAdLoaded() && !this.mRewardedInterAd.isAdInvalidated()) {
            log("A rewarded interstitial ad has been loaded already");
            maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded();
        } else {
            log("Loading bidding rewarded interstitial ad...");
            this.mRewardedInterAd.loadAd(withAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.mInterstitialAd = null;
        }
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this.mRewardedVideoAd = null;
        }
        RewardedVideoAd rewardedVideoAd2 = this.mRewardedInterAd;
        if (rewardedVideoAd2 != null) {
            rewardedVideoAd2.destroy();
            this.mRewardedInterAd = null;
        }
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
            this.mAdView = null;
        }
        NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.mNativeAd.destroy();
            this.mNativeAd = null;
        }
        NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.mNativeBannerAd.destroy();
            this.mNativeBannerAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null && interstitialAd.isAdLoaded()) {
            if (!this.mInterstitialAd.isAdInvalidated()) {
                this.mInterstitialAd.show();
                return;
            } else {
                log("Unable to show interstitial - ad expired...");
                maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
                return;
            }
        }
        log("Unable to show interstitial - no ad loaded...");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Interstitial ad not ready"));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd != null && rewardedVideoAd.isAdLoaded()) {
            if (!this.mRewardedVideoAd.isAdInvalidated()) {
                configureReward(maxAdapterResponseParameters);
                this.mRewardedVideoAd.show();
                return;
            } else {
                log("Unable to show rewarded ad - ad expired...");
                maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
                return;
            }
        }
        log("Unable to show rewarded ad - no ad loaded...");
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Rewarded ad not ready"));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        log("Showing rewarded interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        RewardedVideoAd rewardedVideoAd = this.mRewardedInterAd;
        if (rewardedVideoAd != null && rewardedVideoAd.isAdLoaded()) {
            if (!this.mRewardedInterAd.isAdInvalidated()) {
                configureReward(maxAdapterResponseParameters);
                this.mRewardedInterAd.show();
                return;
            } else {
                log("Unable to show rewarded interstitial ad - ad expired...");
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayFailed(MaxAdapterError.AD_EXPIRED);
                return;
            }
        }
        log("Unable to show rewarded interstitial ad - no ad loaded...");
        maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Rewarded Interstitial ad not ready"));
    }

    /* loaded from: classes.dex */
    public class InterstitialAdListener implements InterstitialAdExtendedListener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad clicked: " + ad2.getPlacementId());
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad loaded: " + ad2.getPlacementId());
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log("Interstitial ad (" + ad2.getPlacementId() + ") failed to load with error: " + maxError);
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.InterstitialAdExtendedListener
        public void onInterstitialActivityDestroyed() {
            FacebookMediationAdapter.this.log("Interstitial ad Activity destroyed");
            if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onInterstitialAdHidden();
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad hidden: " + ad2.getPlacementId());
            if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onInterstitialAdHidden();
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad displayed: " + ad2.getPlacementId());
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log("Interstitial ad logging impression: " + ad2.getPlacementId());
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdCompleted() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerFailed() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerSucceeded() {
        }
    }
}
