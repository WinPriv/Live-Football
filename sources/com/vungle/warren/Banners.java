package com.vungle.warren;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.vungle.warren.AdConfig;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.admarkup.AdMarkup;
import com.vungle.warren.persistence.FutureResult;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.AdMarkupDecoder;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.TimeoutProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Banners {
    private static final String TAG = "Banners";

    public static boolean canPlayAd(String str, AdConfig.AdSize adSize) {
        return canPlayAd(str, null, adSize);
    }

    @Deprecated
    public static VungleBanner getBanner(String str, AdConfig.AdSize adSize, PlayAdCallback playAdCallback) {
        return getBanner(str, new BannerAdConfig(adSize), playAdCallback);
    }

    public static void loadBanner(String str, BannerAdConfig bannerAdConfig, LoadAdCallback loadAdCallback) {
        loadBanner(str, null, bannerAdConfig, loadAdCallback);
    }

    private static void onLoadError(String str, LoadAdCallback loadAdCallback, @VungleException.ExceptionCode int i10) {
        VungleException vungleException = new VungleException(i10);
        if (loadAdCallback != null) {
            loadAdCallback.onError(str, vungleException);
        }
        VungleLogger.error("Banners#onLoadError", "Banner load error: " + vungleException.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onPlaybackError(String str, PlayAdCallback playAdCallback, @VungleException.ExceptionCode int i10) {
        VungleException vungleException = new VungleException(i10);
        if (playAdCallback != null) {
            playAdCallback.onError(str, vungleException);
        }
        VungleLogger.error("Banners#onPlaybackError", "Banner play error: " + vungleException.getLocalizedMessage());
    }

    public static boolean canPlayAd(final String str, String str2, final AdConfig.AdSize adSize) {
        if (!AdConfig.AdSize.isBannerAdSize(adSize)) {
            Log.e(TAG, "Invalid Ad Size. Cannot check loaded status of non banner size placements.");
            return false;
        }
        final Context appContext = Vungle.appContext();
        if (appContext == null) {
            Log.e(TAG, "Context is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "PlacementId is null");
            return false;
        }
        final AdMarkup decode = AdMarkupDecoder.decode(str2);
        if (str2 != null && decode == null) {
            Log.e(TAG, "Invalid AdMarkup");
            return false;
        }
        ServiceLocator serviceLocator = ServiceLocator.getInstance(appContext);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        TimeoutProvider timeoutProvider = (TimeoutProvider) serviceLocator.getService(TimeoutProvider.class);
        return Boolean.TRUE.equals(new FutureResult(executors.getApiExecutor().submit(new Callable<Boolean>() { // from class: com.vungle.warren.Banners.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                AdConfig.AdSize adSize2;
                if (!Vungle.isInitialized()) {
                    Log.e(Banners.TAG, "Vungle is not initialized");
                    return Boolean.FALSE;
                }
                Repository repository = (Repository) ServiceLocator.getInstance(appContext).getService(Repository.class);
                AdMarkup adMarkup = decode;
                String eventId = adMarkup != null ? adMarkup.getEventId() : null;
                Placement placement = (Placement) repository.load(str, Placement.class).get();
                if (placement == null) {
                    return Boolean.FALSE;
                }
                if (placement.isMultipleHBPEnabled() && eventId == null) {
                    return Boolean.FALSE;
                }
                Advertisement advertisement = repository.findValidAdvertisementForPlacement(str, eventId).get();
                if (advertisement == null) {
                    return Boolean.FALSE;
                }
                AdConfig.AdSize adSize3 = placement.getAdSize();
                AdConfig.AdSize adSize4 = advertisement.getAdConfig().getAdSize();
                if (!((placement.isMultipleHBPEnabled() && AdConfig.AdSize.isNonMrecBannerAdSize(adSize3) && AdConfig.AdSize.isNonMrecBannerAdSize(adSize4) && AdConfig.AdSize.isNonMrecBannerAdSize(adSize)) ? true : adSize == AdConfig.AdSize.VUNGLE_MREC && AdConfig.AdSize.isDefaultAdSize(adSize3) && AdConfig.AdSize.isDefaultAdSize(adSize4) && placement.getPlacementAdType() == 3) && ((adSize2 = adSize) != adSize3 || adSize2 != adSize4)) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(Vungle.canPlayAd(advertisement));
            }
        })).get(timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS));
    }

    public static VungleBanner getBanner(String str, BannerAdConfig bannerAdConfig, PlayAdCallback playAdCallback) {
        return getBanner(str, null, bannerAdConfig, playAdCallback);
    }

    @Deprecated
    public static void loadBanner(String str, AdConfig.AdSize adSize, LoadAdCallback loadAdCallback) {
        if (adSize == null) {
            onLoadError(str, loadAdCallback, 28);
        } else {
            loadBanner(str, new BannerAdConfig(adSize), loadAdCallback);
        }
    }

    public static VungleBanner getBanner(final String str, final String str2, BannerAdConfig bannerAdConfig, PlayAdCallback playAdCallback) {
        VungleLogger.debug("VungleBanner#getBanner", "getBanner call invoked");
        Context appContext = Vungle.appContext();
        if (appContext == null) {
            Log.e(TAG, "Vungle is not initialized, returned VungleBanner = null");
            onPlaybackError(str, playAdCallback, 9);
            return null;
        }
        final AdConfig.AdSize adSize = bannerAdConfig.getAdSize();
        final ServiceLocator serviceLocator = ServiceLocator.getInstance(appContext);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        TimeoutProvider timeoutProvider = (TimeoutProvider) serviceLocator.getService(TimeoutProvider.class);
        VungleSettings vungleSettings = ((RuntimeValues) ServiceLocator.getInstance(appContext).getService(RuntimeValues.class)).settings.get();
        final PlayAdCallbackWrapper playAdCallbackWrapper = new PlayAdCallbackWrapper(executors.getUIExecutor(), playAdCallback);
        Pair pair = (Pair) new FutureResult(executors.getBackgroundExecutor().submit(new Callable<Pair<Boolean, Placement>>() { // from class: com.vungle.warren.Banners.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Pair<Boolean, Placement> call() throws Exception {
                if (!Vungle.isInitialized()) {
                    Log.e(Banners.TAG, "Vungle is not initialized.");
                    Banners.onPlaybackError(str, playAdCallbackWrapper, 9);
                    return new Pair<>(Boolean.FALSE, null);
                }
                if (TextUtils.isEmpty(str)) {
                    Banners.onPlaybackError(str, playAdCallbackWrapper, 13);
                    return new Pair<>(Boolean.FALSE, null);
                }
                Placement placement = (Placement) ((Repository) serviceLocator.getService(Repository.class)).load(str, Placement.class).get();
                if (placement == null) {
                    Banners.onPlaybackError(str, playAdCallbackWrapper, 13);
                    return new Pair<>(Boolean.FALSE, null);
                }
                if (!AdConfig.AdSize.isBannerAdSize(adSize)) {
                    Banners.onPlaybackError(str, playAdCallbackWrapper, 30);
                    return new Pair<>(Boolean.FALSE, placement);
                }
                if (!Banners.canPlayAd(str, str2, adSize)) {
                    Banners.onPlaybackError(str, playAdCallbackWrapper, 10);
                    return new Pair<>(Boolean.FALSE, placement);
                }
                return new Pair<>(Boolean.TRUE, placement);
            }
        })).get(timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (pair == null) {
            onPlaybackError(str, playAdCallback, 13);
            return null;
        }
        if (((Boolean) pair.first).booleanValue()) {
            return new VungleBanner(appContext, str, str2, (vungleSettings == null || !vungleSettings.getBannerRefreshDisabled()) ? adSize != AdConfig.AdSize.VUNGLE_MREC ? ((Placement) pair.second).getAdRefreshDuration() : 0 : 0, bannerAdConfig, playAdCallbackWrapper);
        }
        return null;
    }

    public static void loadBanner(String str, String str2, BannerAdConfig bannerAdConfig, LoadAdCallback loadAdCallback) {
        VungleLogger.debug("Banners#loadBanner", "loadBanner API call invoked");
        if (Vungle.appContext() != null && Vungle.isInitialized()) {
            AdConfig adConfig = new AdConfig(bannerAdConfig);
            if (!AdConfig.AdSize.isBannerAdSize(adConfig.getAdSize())) {
                onLoadError(str, loadAdCallback, 30);
                return;
            } else {
                Vungle.loadAdInternal(str, str2, adConfig, loadAdCallback);
                return;
            }
        }
        onLoadError(str, loadAdCallback, 9);
    }
}
