package com.vungle.warren;

import a3.k;
import a3.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.persistence.FutureResult;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.view.MediaView;
import com.vungle.warren.utility.AdMarkupDecoder;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.ImageLoader;
import com.vungle.warren.utility.ImpressionTracker;
import com.vungle.warren.utility.TimeoutProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class NativeAd {
    private static final int STATE_DESTROY = 4;
    private static final int STATE_ERROR = 5;
    private static final int STATE_NEW = 1;
    private static final int STATE_READY = 2;
    private static final int STATE_VIEWING = 3;
    private static final String TAG = "NativeAd";
    private static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    private static final String TOKEN_APP_ICON = "APP_ICON";
    private static final String TOKEN_APP_NAME = "APP_NAME";
    private static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    private static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    public static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    private static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    private static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    private static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    public static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";
    private AdConfig adConfig;
    private String adMarkUp;
    private FrameLayout adOptionsRootView;
    private NativeAdOptionsView adOptionsView;
    private int adState;
    private List<View> clickableViews;
    private MediaView contentView;
    private final Context context;
    private ImageView iconView;
    private final ImageLoader imageLoader;
    private ImpressionTracker impressionTracker;
    private Map<String, String> nativeAdAssetMap;
    private NativeAdListener nativeAdCallback;
    private final String placementId;
    private NativeAdLayout rootNativeView;
    private final Executor uiExecutor;
    private final LoadNativeAdCallback loadAdCallback = new LoadNativeAdCallback() { // from class: com.vungle.warren.NativeAd.1
        @Override // com.vungle.warren.LoadNativeAdCallback
        public void onAdLoad(Advertisement advertisement) {
            VungleLogger.debug(true, NativeAd.TAG, NativeAd.TAG, "Native Ad Loaded : " + NativeAd.this.placementId);
            if (advertisement != null) {
                NativeAd.this.adState = 2;
                NativeAd.this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
                if (NativeAd.this.nativeAdCallback != null) {
                    NativeAd.this.nativeAdCallback.onNativeAdLoaded(NativeAd.this);
                    return;
                }
                return;
            }
            NativeAd nativeAd = NativeAd.this;
            nativeAd.onLoadError(nativeAd.placementId, NativeAd.this.nativeAdCallback, 11);
        }

        @Override // com.vungle.warren.LoadAdCallback
        public void onError(String str, VungleException vungleException) {
            String str2 = NativeAd.TAG;
            StringBuilder s10 = l.s("Native Ad Load Error : ", str, " Message : ");
            s10.append(vungleException.getLocalizedMessage());
            VungleLogger.debug(true, str2, NativeAd.TAG, s10.toString());
            NativeAd nativeAd = NativeAd.this;
            nativeAd.onLoadError(str, nativeAd.nativeAdCallback, vungleException.getExceptionCode());
        }

        @Override // com.vungle.warren.LoadAdCallback
        public void onAdLoad(String str) {
            VungleLogger.error(true, NativeAd.TAG, NativeAd.TAG, "Internal error! For native ads we should use onAdLoad(advertisement) callback.");
        }
    };
    private final PlayAdCallback playAdCallback = new PlayAdCallback() { // from class: com.vungle.warren.NativeAd.5
        @Override // com.vungle.warren.PlayAdCallback
        public void creativeId(String str) {
            if (NativeAd.this.nativeAdCallback != null) {
                NativeAd.this.nativeAdCallback.creativeId(str);
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdClick(String str) {
            if (NativeAd.this.nativeAdCallback != null) {
                NativeAd.this.nativeAdCallback.onAdClick(str);
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdLeftApplication(String str) {
            if (NativeAd.this.nativeAdCallback != null) {
                NativeAd.this.nativeAdCallback.onAdLeftApplication(str);
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdViewed(String str) {
            if (NativeAd.this.nativeAdCallback != null) {
                NativeAd.this.nativeAdCallback.onAdImpression(str);
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onError(String str, VungleException vungleException) {
            NativeAd.this.adState = 5;
            if (NativeAd.this.nativeAdCallback != null) {
                NativeAd.this.nativeAdCallback.onAdPlayError(str, vungleException);
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdEnd(String str, boolean z10, boolean z11) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdRewarded(String str) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public void onAdStart(String str) {
        }
    };

    public NativeAd(Context context, String str) {
        this.context = context;
        this.placementId = str;
        Executors executors = (Executors) ServiceLocator.getInstance(context).getService(Executors.class);
        this.uiExecutor = executors.getUIExecutor();
        ImageLoader imageLoader = ImageLoader.getInstance();
        this.imageLoader = imageLoader;
        imageLoader.init(executors.getIOExecutor());
        this.adState = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLoadError(String str, NativeAdListener nativeAdListener, @VungleException.ExceptionCode int i10) {
        this.adState = 5;
        VungleException vungleException = new VungleException(i10);
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str, vungleException);
        }
        VungleLogger.error("NativeAd#onLoadError", "NativeAd load error: " + vungleException.getLocalizedMessage());
    }

    public boolean canPlayAd() {
        if (TextUtils.isEmpty(this.placementId)) {
            VungleLogger.error(true, TAG, TAG, "PlacementId is null");
            return false;
        }
        if (this.adState != 2) {
            Log.w(TAG, "Ad is not loaded or is displaying for placement: " + this.placementId);
            return false;
        }
        AdMarkup decode = AdMarkupDecoder.decode(this.adMarkUp);
        if (!TextUtils.isEmpty(this.adMarkUp) && decode == null) {
            Log.e(TAG, "Invalid AdMarkup");
            return false;
        }
        final ServiceLocator serviceLocator = ServiceLocator.getInstance(this.context);
        return Boolean.TRUE.equals(new FutureResult(((Executors) serviceLocator.getService(Executors.class)).getApiExecutor().submit(new Callable<Boolean>() { // from class: com.vungle.warren.NativeAd.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                if (!Vungle.isInitialized()) {
                    VungleLogger.error(true, NativeAd.TAG, NativeAd.TAG, "Vungle is not initialized");
                    return Boolean.FALSE;
                }
                Repository repository = (Repository) serviceLocator.getService(Repository.class);
                AdRequest adRequest = new AdRequest(NativeAd.this.placementId, AdMarkupDecoder.decode(NativeAd.this.adMarkUp), false);
                Placement placement = (Placement) repository.load(NativeAd.this.placementId, Placement.class).get();
                if (placement == null) {
                    return Boolean.FALSE;
                }
                if (!placement.isMultipleHBPEnabled() || adRequest.getEventId() != null) {
                    Advertisement advertisement = repository.findValidAdvertisementForPlacement(NativeAd.this.placementId, adRequest.getEventId()).get();
                    if (advertisement == null) {
                        return Boolean.FALSE;
                    }
                    return Boolean.valueOf(Vungle.canPlayAd(advertisement));
                }
                return Boolean.FALSE;
            }
        })).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS));
    }

    public void destroy() {
        Log.d(TAG, "destroy()");
        this.adState = 4;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map != null) {
            map.clear();
            this.nativeAdAssetMap = null;
        }
        ImpressionTracker impressionTracker = this.impressionTracker;
        if (impressionTracker != null) {
            impressionTracker.destroy();
            this.impressionTracker = null;
        }
        ImageView imageView = this.iconView;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            this.iconView = null;
        }
        MediaView mediaView = this.contentView;
        if (mediaView != null) {
            mediaView.destroy();
            this.contentView = null;
        }
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.destroy();
            this.adOptionsView = null;
        }
        NativeAdLayout nativeAdLayout = this.rootNativeView;
        if (nativeAdLayout != null) {
            nativeAdLayout.finishDisplayingAdInternal(true);
            this.rootNativeView = null;
        }
    }

    public void displayImage(String str, final ImageView imageView) {
        this.imageLoader.displayImage(str, new ImageLoader.ImageLoaderListener() { // from class: com.vungle.warren.NativeAd.6
            @Override // com.vungle.warren.utility.ImageLoader.ImageLoaderListener
            public void onImageLoaded(final Bitmap bitmap) {
                if (imageView != null) {
                    NativeAd.this.uiExecutor.execute(new Runnable() { // from class: com.vungle.warren.NativeAd.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                }
            }
        });
    }

    public String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = "";
        } else {
            str = map.get(TOKEN_APP_DESCRIPTION);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = "";
        } else {
            str = map.get(TOKEN_CTA_BUTTON_TEXT);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = "";
        } else {
            str = map.get(TOKEN_SPONSORED_BY);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = null;
        } else {
            str = map.get(TOKEN_APP_RATING_VALUE);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                VungleLogger.error(true, TAG, TAG, k.l("Unable to parse ", str, " as double."));
            }
        }
        return null;
    }

    public String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = "";
        } else {
            str = map.get(TOKEN_APP_NAME);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = "";
        } else {
            str = map.get(TOKEN_APP_ICON);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getCtaUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = "";
        } else {
            str = map.get(TOKEN_CTA_BUTTON_URL);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getPrivacyIconUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = "";
        } else {
            str = map.get(TOKEN_VUNGLE_PRIVACY_ICON_URL);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getPrivacyUrl() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = "";
        } else {
            str = map.get(TOKEN_VUNGLE_PRIVACY_URL);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public boolean hasCallToAction() {
        return !TextUtils.isEmpty(getCtaUrl());
    }

    public void loadAd(AdConfig adConfig, NativeAdListener nativeAdListener) {
        loadAd(adConfig, null, nativeAdListener);
    }

    public void registerClickEvent(View view, final int i10) {
        view.setClickable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.warren.NativeAd.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (NativeAd.this.rootNativeView != null) {
                    NativeAd.this.rootNativeView.onItemClicked(i10);
                }
            }
        });
    }

    public void registerViewForInteraction(final NativeAdLayout nativeAdLayout, MediaView mediaView, ImageView imageView, List<View> list) {
        String str;
        if (!canPlayAd()) {
            this.playAdCallback.onError(this.placementId, new VungleException(10));
            return;
        }
        this.adState = 3;
        this.rootNativeView = nativeAdLayout;
        this.contentView = mediaView;
        this.iconView = imageView;
        this.clickableViews = list;
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.destroy();
        }
        NativeAdOptionsView nativeAdOptionsView2 = new NativeAdOptionsView(this.context);
        this.adOptionsView = nativeAdOptionsView2;
        if (this.adOptionsRootView == null) {
            this.adOptionsRootView = nativeAdLayout;
        }
        nativeAdOptionsView2.renderTo(this, this.adOptionsRootView, this.adConfig.getAdOptionsPosition());
        this.impressionTracker = new ImpressionTracker(this.context);
        nativeAdLayout.finishDisplayingAdInternal(false);
        this.impressionTracker.addView(this.adOptionsRootView, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.warren.NativeAd.3
            @Override // com.vungle.warren.utility.ImpressionTracker.ImpressionListener
            public void onImpression(View view) {
                nativeAdLayout.onImpression();
            }
        });
        ServiceLocator serviceLocator = ServiceLocator.getInstance(this.context);
        AdRequest adRequest = new AdRequest(this.placementId, AdMarkupDecoder.decode(this.adMarkUp), false);
        nativeAdLayout.register(this.context, this, (PresentationFactory) serviceLocator.getService(PresentationFactory.class), Vungle.getEventListener(adRequest, this.playAdCallback), this.adConfig, adRequest);
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null) {
            str = null;
        } else {
            str = map.get(TOKEN_MAIN_IMAGE);
        }
        displayImage(str, mediaView.getMainImage());
        if (imageView != null) {
            displayImage(getAppIcon(), imageView);
        }
        if (list != null && list.size() > 0) {
            Iterator<View> it = list.iterator();
            while (it.hasNext()) {
                registerClickEvent(it.next(), 1);
            }
            return;
        }
        registerClickEvent(mediaView, 1);
    }

    public void setAdOptionsRootView(FrameLayout frameLayout) {
        VungleApiClient.WrapperFramework wrapperFramework = VungleApiClient.WRAPPER_FRAMEWORK_SELECTED;
        if (wrapperFramework != null && wrapperFramework != VungleApiClient.WrapperFramework.none) {
            this.adOptionsRootView = frameLayout;
        } else {
            Log.w(TAG, "You can NOT use this API to change the privacy icon parent view, please use NativeAdLayout as your native ad root view!");
        }
    }

    public void unregisterView() {
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null && nativeAdOptionsView.getParent() != null) {
            ((ViewGroup) this.adOptionsView.getParent()).removeView(this.adOptionsView);
        }
        ImpressionTracker impressionTracker = this.impressionTracker;
        if (impressionTracker != null) {
            impressionTracker.clear();
        }
        List<View> list = this.clickableViews;
        if (list != null) {
            Iterator<View> it = list.iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(null);
            }
        } else {
            MediaView mediaView = this.contentView;
            if (mediaView != null) {
                mediaView.setOnClickListener(null);
            }
        }
    }

    public void loadAd(AdConfig adConfig, String str, NativeAdListener nativeAdListener) {
        VungleLogger.debug("NativeAd#loadAd", "loadAd API call invoked");
        if (!Vungle.isInitialized()) {
            onLoadError(this.placementId, nativeAdListener, 9);
            return;
        }
        this.adState = 1;
        if (adConfig == null) {
            adConfig = new AdConfig();
        }
        this.adConfig = adConfig;
        this.adMarkUp = str;
        this.nativeAdCallback = nativeAdListener;
        Vungle.loadAdInternal(this.placementId, str, adConfig, this.loadAdCallback);
    }
}
