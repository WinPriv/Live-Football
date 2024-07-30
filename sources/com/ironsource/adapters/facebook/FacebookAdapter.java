package com.ironsource.adapters.facebook;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FacebookAdapter extends AbstractAdapter implements INetworkInitCallbackListener, AudienceNetworkAds.InitListener {
    private static final String GitHash = "4edd0f021";
    private static final String MEDIATION_NAME = "ironSource";
    protected static final String META_NETWORK_NAME = "Facebook";
    private static final String VERSION = "4.3.38";
    protected final String ALL_PLACEMENT_IDS;
    protected final String FACEBOOK_INTERSTITIAL_CACHE_FLAG;
    protected final String META_INTERSTITIAL_CACHE_FLAG;
    protected final String META_MIXED_AUDIENCE;
    protected final String PLACEMENT_ID;
    protected ConcurrentHashMap<String, AdView> mBannerPlacementIdToAd;
    protected ConcurrentHashMap<String, BannerSmashListener> mBannerPlacementIdToSmashListener;
    protected ConcurrentHashMap<String, Boolean> mInterstitialAdsAvailability;
    protected ConcurrentHashMap<String, Boolean> mInterstitialPlacementIdShowCalled;
    protected ConcurrentHashMap<String, InterstitialAd> mInterstitialPlacementIdToAd;
    protected ConcurrentHashMap<String, FacebookInterstitialAdListener> mInterstitialPlacementIdToFacebookAdListener;
    protected ConcurrentHashMap<String, InterstitialSmashListener> mInterstitialPlacementIdToSmashListener;
    protected ConcurrentHashMap<String, Boolean> mRewardedVideoAdsAvailability;
    protected ConcurrentHashMap<String, Boolean> mRewardedVideoPlacementIdShowCalled;
    protected ConcurrentHashMap<String, RewardedVideoAd> mRewardedVideoPlacementIdToAd;
    protected ConcurrentHashMap<String, FacebookRewardedVideoAdListener> mRewardedVideoPlacementIdToFacebookAdListener;
    protected ConcurrentHashMap<String, RewardedVideoSmashListener> mRewardedVideoPlacementIdToSmashListener;
    protected CopyOnWriteArraySet<String> mRewardedVideoPlacementIdsForInitCallbacks;
    protected static EnumSet<CacheFlag> mInterstitialFacebookCacheFlags = EnumSet.allOf(CacheFlag.class);
    protected static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    protected static InitState mInitState = InitState.INIT_STATE_NONE;
    protected static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);

    /* renamed from: com.ironsource.adapters.facebook.FacebookAdapter$7, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState;

        static {
            int[] iArr = new int[InitState.values().length];
            $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState = iArr;
            try {
                iArr[InitState.INIT_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[InitState.INIT_STATE_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[InitState.INIT_STATE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_FAILED
    }

    private FacebookAdapter(String str) {
        super(str);
        this.PLACEMENT_ID = "placementId";
        this.ALL_PLACEMENT_IDS = "placementIds";
        this.FACEBOOK_INTERSTITIAL_CACHE_FLAG = "facebook_is_cacheflag";
        this.META_INTERSTITIAL_CACHE_FLAG = "meta_is_cacheflag";
        this.META_MIXED_AUDIENCE = "meta_mixed_audience";
        IronLog.INTERNAL.verbose("");
        this.mRewardedVideoPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdToAd = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdToFacebookAdListener = new ConcurrentHashMap<>();
        this.mRewardedVideoAdsAvailability = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mRewardedVideoPlacementIdShowCalled = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToAd = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToFacebookAdListener = new ConcurrentHashMap<>();
        this.mInterstitialAdsAvailability = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdShowCalled = new ConcurrentHashMap<>();
        this.mBannerPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mBannerPlacementIdToAd = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    private AdSize calculateBannerSize(ISBannerSize iSBannerSize, Activity activity) {
        String description = iSBannerSize.getDescription();
        description.getClass();
        char c10 = 65535;
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals("RECTANGLE")) {
                    c10 = 0;
                    break;
                }
                break;
            case 72205083:
                if (description.equals("LARGE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 79011241:
                if (description.equals("SMART")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1951953708:
                if (description.equals("BANNER")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1999208305:
                if (description.equals("CUSTOM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return AdSize.RECTANGLE_HEIGHT_250;
            case 1:
                return AdSize.BANNER_HEIGHT_90;
            case 2:
                if (AdapterUtils.isLargeScreen(activity)) {
                    return AdSize.BANNER_HEIGHT_90;
                }
                return AdSize.BANNER_HEIGHT_50;
            case 3:
                return AdSize.BANNER_HEIGHT_50;
            case 4:
                if (iSBannerSize.getHeight() == 50) {
                    return AdSize.BANNER_HEIGHT_50;
                }
                if (iSBannerSize.getHeight() == 90) {
                    return AdSize.BANNER_HEIGHT_90;
                }
                if (iSBannerSize.getHeight() == 250) {
                    return AdSize.RECTANGLE_HEIGHT_250;
                }
                return null;
            default:
                return null;
        }
    }

    public static String getAdapterSDKVersion() {
        return "6.12.0";
    }

    private Map<String, Object> getBiddingData() {
        if (mInitState == InitState.INIT_STATE_FAILED) {
            IronLog.INTERNAL.verbose("returning null as token since init failed");
            return null;
        }
        String bidderToken = BidderTokenProvider.getBidderToken(ContextProvider.getInstance().getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        IronLog.ADAPTER_API.verbose("token = " + bidderToken);
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, bidderToken);
        return hashMap;
    }

    private EnumSet<CacheFlag> getFacebookAllCacheFlags() {
        IronLog.ADAPTER_API.verbose("");
        return EnumSet.allOf(CacheFlag.class);
    }

    private CacheFlag getFacebookCacheFlag(String str) {
        a.q("value = ", str, IronLog.ADAPTER_API);
        return CacheFlag.valueOf(str.toUpperCase(Locale.ENGLISH));
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        return new IntegrationData(META_NETWORK_NAME, "4.3.38");
    }

    private String getMediationServiceInfo() {
        String format = String.format("%s_%s:%s", MEDIATION_NAME, IronSourceUtils.getSDKVersion(), "4.3.38");
        a.q("mediationServiceInfo = ", format, IronLog.INTERNAL);
        return format;
    }

    private void initBannersInternal(JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString("placementId");
        String optString2 = jSONObject.optString("placementIds");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = placementId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementId", "Banner"));
            return;
        }
        if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = placementIds");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementIds", "Banner"));
            return;
        }
        a.q("placementId = ", optString, IronLog.ADAPTER_API);
        this.mBannerPlacementIdToSmashListener.put(optString, bannerSmashListener);
        int i10 = AnonymousClass7.$SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[mInitState.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    IronLog.INTERNAL.verbose("init failed - placementId = " + optString);
                    bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", "Banner"));
                    return;
                }
                return;
            }
            bannerSmashListener.onBannerInitSuccess();
            return;
        }
        initSDK(optString2);
    }

    private void initSDK(String str) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            List<String> asList = Arrays.asList(str.split(","));
            IronLog.ADAPTER_API.verbose("Initialize Meta with placement ids = " + asList.toString());
            AudienceNetworkAds.buildInitSettings(ContextProvider.getInstance().getApplicationContext()).withInitListener(this).withMediationService(getMediationServiceInfo()).withPlacementIds(asList).initialize();
        }
    }

    private boolean isValidMixedAudienceMetaData(String str) {
        return !TextUtils.isEmpty(str);
    }

    private void loadBannerInternal(final IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, final BannerSmashListener bannerSmashListener, final String str) {
        final String optString = jSONObject.optString("placementId");
        if (ironSourceBannerLayout == null) {
            IronLog.INTERNAL.error("banner is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner is null"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + optString);
        final AdSize calculateBannerSize = calculateBannerSize(ironSourceBannerLayout.getSize(), ironSourceBannerLayout.getActivity());
        if (calculateBannerSize == null) {
            IronLog.INTERNAL.error("loadBanner - size not supported, size = " + ironSourceBannerLayout.getSize().getDescription());
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
            return;
        }
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.FacebookAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdView adView = new AdView(ironSourceBannerLayout.getActivity(), optString, calculateBannerSize);
                    FacebookBannerAdListener facebookBannerAdListener = new FacebookBannerAdListener(FacebookAdapter.this, bannerSmashListener, optString, FacebookAdapter.this.calcLayoutParams(ironSourceBannerLayout.getSize(), ironSourceBannerLayout.getActivity()));
                    AdView.AdViewLoadConfigBuilder buildLoadAdConfig = adView.buildLoadAdConfig();
                    buildLoadAdConfig.withAdListener(facebookBannerAdListener);
                    String str2 = str;
                    if (str2 != null) {
                        buildLoadAdConfig.withBid(str2);
                    }
                    FacebookAdapter.this.mBannerPlacementIdToAd.put(optString, adView);
                    adView.loadAd(buildLoadAdConfig.build());
                } catch (Exception e10) {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Meta loadBanner exception " + e10.getMessage()));
                }
            }
        });
    }

    private void loadInterstitialInternal(final InterstitialSmashListener interstitialSmashListener, JSONObject jSONObject, final String str) {
        final String optString = jSONObject.optString("placementId");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.mInterstitialPlacementIdShowCalled;
        Boolean bool = Boolean.FALSE;
        concurrentHashMap.put(optString, bool);
        this.mInterstitialAdsAvailability.put(optString, bool);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.FacebookAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (FacebookAdapter.this.mInterstitialPlacementIdToAd.containsKey(optString)) {
                        IronLog.ADAPTER_API.verbose("destroying previous ad with placement id " + optString);
                        FacebookAdapter.this.mInterstitialPlacementIdToAd.get(optString).destroy();
                        FacebookAdapter.this.mInterstitialPlacementIdToAd.remove(optString);
                    }
                    InterstitialAd interstitialAd = new InterstitialAd(ContextProvider.getInstance().getApplicationContext(), optString);
                    InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig = interstitialAd.buildLoadAdConfig();
                    buildLoadAdConfig.withCacheFlags(FacebookAdapter.mInterstitialFacebookCacheFlags);
                    buildLoadAdConfig.withAdListener(FacebookAdapter.this.mInterstitialPlacementIdToFacebookAdListener.get(optString));
                    if (!TextUtils.isEmpty(str)) {
                        buildLoadAdConfig.withBid(str);
                    }
                    IronLog.ADAPTER_API.verbose("loading placementId = " + optString + " with facebook cache flags = " + FacebookAdapter.mInterstitialFacebookCacheFlags.toString());
                    interstitialAd.loadAd(buildLoadAdConfig.build());
                    FacebookAdapter.this.mInterstitialPlacementIdToAd.put(optString, interstitialAd);
                } catch (Exception e10) {
                    interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(e10.getLocalizedMessage()));
                }
            }
        });
    }

    private void loadRewardedVideoInternal(final String str, final String str2) {
        a.q("placementId = ", str, IronLog.ADAPTER_API);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.mRewardedVideoAdsAvailability;
        Boolean bool = Boolean.FALSE;
        concurrentHashMap.put(str, bool);
        this.mRewardedVideoPlacementIdShowCalled.put(str, bool);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.FacebookAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (FacebookAdapter.this.mRewardedVideoPlacementIdToAd.containsKey(str)) {
                        IronLog.ADAPTER_API.verbose("destroying previous ad with placement id " + str);
                        FacebookAdapter.this.mRewardedVideoPlacementIdToAd.get(str).destroy();
                        FacebookAdapter.this.mRewardedVideoPlacementIdToAd.remove(str);
                    }
                    RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(ContextProvider.getInstance().getApplicationContext(), str);
                    RewardedVideoAd.RewardedVideoAdLoadConfigBuilder buildLoadAdConfig = rewardedVideoAd.buildLoadAdConfig();
                    buildLoadAdConfig.withAdListener(FacebookAdapter.this.mRewardedVideoPlacementIdToFacebookAdListener.get(str));
                    if (!TextUtils.isEmpty(str2)) {
                        buildLoadAdConfig.withBid(str2);
                    }
                    if (!TextUtils.isEmpty(FacebookAdapter.this.getDynamicUserId())) {
                        buildLoadAdConfig.withRewardData(new RewardData(FacebookAdapter.this.getDynamicUserId(), ""));
                    }
                    FacebookAdapter.this.mRewardedVideoPlacementIdToAd.put(str, rewardedVideoAd);
                    rewardedVideoAd.loadAd(buildLoadAdConfig.build());
                } catch (Exception unused) {
                    if (FacebookAdapter.this.mRewardedVideoPlacementIdToSmashListener.containsKey(str)) {
                        FacebookAdapter.this.mRewardedVideoPlacementIdToSmashListener.get(str).onRewardedVideoAvailabilityChanged(false);
                    }
                }
            }
        });
    }

    private void setMixedAudience(boolean z10) {
        IronLog.ADAPTER_API.verbose("isMixedAudience = " + z10);
        AdSettings.setMixedAudience(z10);
    }

    public static FacebookAdapter startAdapter(String str) {
        return new FacebookAdapter(str);
    }

    public FrameLayout.LayoutParams calcLayoutParams(ISBannerSize iSBannerSize, Activity activity) {
        int i10;
        if (iSBannerSize.getDescription().equals("RECTANGLE")) {
            i10 = 300;
        } else if (iSBannerSize.getDescription().equals("SMART") && AdapterUtils.isLargeScreen(activity)) {
            i10 = 728;
        } else {
            i10 = 320;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(activity, i10), -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void destroyBanner(JSONObject jSONObject) {
        final String optString = jSONObject.optString("placementId");
        IronLog.ADAPTER_API.verbose("placementId = " + optString);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.FacebookAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (FacebookAdapter.this.mBannerPlacementIdToAd.containsKey(optString)) {
                        FacebookAdapter.this.mBannerPlacementIdToAd.get(optString).destroy();
                        FacebookAdapter.this.mBannerPlacementIdToAd.remove(optString);
                    }
                } catch (Exception e10) {
                    IronLog.INTERNAL.error("destroyBanner failed for placementId - " + optString + " with an exception = " + e10);
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("placementId");
        a.q("placementId = ", optString, IronLog.ADAPTER_API);
        loadRewardedVideoInternal(optString, null);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.38";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("placementId");
        String optString2 = jSONObject.optString("placementIds");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = placementId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = placementIds");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + optString);
        this.mRewardedVideoPlacementIdToFacebookAdListener.put(optString, new FacebookRewardedVideoAdListener(this, rewardedVideoSmashListener, optString));
        this.mRewardedVideoPlacementIdToSmashListener.put(optString, rewardedVideoSmashListener);
        int i10 = AnonymousClass7.$SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[mInitState.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    IronLog.INTERNAL.verbose("init failed - placementId = " + optString);
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                    return;
                }
                return;
            }
            loadRewardedVideoInternal(optString, null);
            return;
        }
        initSDK(optString2);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString("placementId");
        String optString2 = jSONObject.optString("placementIds");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params = placementId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementId", "Interstitial"));
            return;
        }
        if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params = placementIds");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementIds", "Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + optString);
        this.mInterstitialPlacementIdToFacebookAdListener.put(optString, new FacebookInterstitialAdListener(this, interstitialSmashListener, optString));
        this.mInterstitialPlacementIdToSmashListener.put(optString, interstitialSmashListener);
        int i10 = AnonymousClass7.$SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[mInitState.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    IronLog.INTERNAL.verbose("init failed - placementId = " + optString);
                    interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", "Interstitial"));
                    return;
                }
                return;
            }
            interstitialSmashListener.onInterstitialInitSuccess();
            return;
        }
        initSDK(optString2);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        initInterstitial(str, str2, jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString("placementId");
        String optString2 = jSONObject.optString("placementIds");
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("missing params - placementId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("missing params - placementIds");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - placementIds", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + optString);
        this.mRewardedVideoPlacementIdToFacebookAdListener.put(optString, new FacebookRewardedVideoAdListener(this, rewardedVideoSmashListener, optString));
        this.mRewardedVideoPlacementIdToSmashListener.put(optString, rewardedVideoSmashListener);
        this.mRewardedVideoPlacementIdsForInitCallbacks.add(optString);
        int i10 = AnonymousClass7.$SwitchMap$com$ironsource$adapters$facebook$FacebookAdapter$InitState[mInitState.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    IronLog.INTERNAL.verbose("init failed - placementId = " + optString);
                    rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            return;
        }
        initSDK(optString2);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public boolean isInterstitialReady(JSONObject jSONObject) {
        String optString = jSONObject.optString("placementId");
        if (this.mInterstitialAdsAvailability.containsKey(optString) && this.mInterstitialAdsAvailability.get(optString).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.k
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        String optString = jSONObject.optString("placementId");
        if (this.mRewardedVideoAdsAvailability.containsKey(optString) && this.mRewardedVideoAdsAvailability.get(optString).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        loadBannerInternal(ironSourceBannerLayout, jSONObject, bannerSmashListener, null);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        IronLog.ADAPTER_API.verbose("");
        loadBannerInternal(ironSourceBannerLayout, jSONObject, bannerSmashListener, str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose("");
        loadInterstitialInternal(interstitialSmashListener, jSONObject, null);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        IronLog.ADAPTER_API.verbose("");
        loadInterstitialInternal(interstitialSmashListener, jSONObject, str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        String optString = jSONObject.optString("placementId");
        a.q("placementId = ", optString, IronLog.ADAPTER_API);
        loadRewardedVideoInternal(optString, str);
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        IronLog.ADAPTER_CALLBACK.verbose("init SDK is completed with status: " + initResult.isSuccess() + ", " + initResult.getMessage());
        if (initResult.isSuccess()) {
            mInitState = InitState.INIT_STATE_SUCCESS;
            Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
            while (it.hasNext()) {
                it.next().onNetworkInitCallbackSuccess();
            }
        } else {
            mInitState = InitState.INIT_STATE_FAILED;
            Iterator<INetworkInitCallbackListener> it2 = initCallbackListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onNetworkInitCallbackFailed(initResult.getMessage());
            }
        }
        initCallbackListeners.clear();
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        for (String str2 : this.mRewardedVideoPlacementIdToSmashListener.keySet()) {
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(str2)) {
                this.mRewardedVideoPlacementIdToSmashListener.get(str2).onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                this.mRewardedVideoPlacementIdToSmashListener.get(str2).onRewardedVideoAvailabilityChanged(false);
            }
        }
        Iterator<InterstitialSmashListener> it = this.mInterstitialPlacementIdToSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, "Interstitial"));
        }
        Iterator<BannerSmashListener> it2 = this.mBannerPlacementIdToSmashListener.values().iterator();
        while (it2.hasNext()) {
            it2.next().onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (String str : this.mRewardedVideoPlacementIdToSmashListener.keySet()) {
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(str)) {
                this.mRewardedVideoPlacementIdToSmashListener.get(str).onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoInternal(str, null);
            }
        }
        Iterator<InterstitialSmashListener> it = this.mInterstitialPlacementIdToSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onInterstitialInitSuccess();
        }
        Iterator<BannerSmashListener> it2 = this.mBannerPlacementIdToSmashListener.values().iterator();
        while (it2.hasNext()) {
            it2.next().onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        IronLog.INTERNAL.verbose("adUnit = " + ad_unit);
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            Iterator<RewardedVideoAd> it = this.mRewardedVideoPlacementIdToAd.values().iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.mRewardedVideoPlacementIdToAd.clear();
            this.mRewardedVideoPlacementIdToFacebookAdListener.clear();
            this.mRewardedVideoPlacementIdToSmashListener.clear();
            this.mRewardedVideoAdsAvailability.clear();
            this.mRewardedVideoPlacementIdsForInitCallbacks.clear();
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            Iterator<InterstitialAd> it2 = this.mInterstitialPlacementIdToAd.values().iterator();
            while (it2.hasNext()) {
                it2.next().destroy();
            }
            this.mInterstitialPlacementIdToAd.clear();
            this.mInterstitialPlacementIdToFacebookAdListener.clear();
            this.mInterstitialPlacementIdToSmashListener.clear();
            this.mInterstitialAdsAvailability.clear();
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            Iterator<AdView> it3 = this.mBannerPlacementIdToAd.values().iterator();
            while (it3.hasNext()) {
                it3.next().destroy();
            }
            this.mBannerPlacementIdToAd.clear();
            this.mBannerPlacementIdToSmashListener.clear();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.INTERNAL.warning("Unsupported method");
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        lowerCase.getClass();
        char c10 = 65535;
        switch (lowerCase.hashCode()) {
            case -2119383230:
                if (lowerCase.equals("meta_mixed_audience")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1227342573:
                if (lowerCase.equals("meta_is_cacheflag")) {
                    c10 = 1;
                    break;
                }
                break;
            case 5585394:
                if (lowerCase.equals("facebook_is_cacheflag")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                String str2 = list.get(0);
                IronLog.ADAPTER_API.verbose("key = " + str + ", value = " + str2);
                String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
                if (isValidMixedAudienceMetaData(formatValueForType)) {
                    setMixedAudience(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
                    return;
                }
                return;
            case 1:
            case 2:
                IronLog.ADAPTER_API.verbose("key = " + str + ", values = " + list);
                mInterstitialFacebookCacheFlags.clear();
                try {
                    for (String str3 : list) {
                        CacheFlag facebookCacheFlag = getFacebookCacheFlag(str3);
                        IronLog.ADAPTER_API.verbose("flag for value " + str3 + " is " + facebookCacheFlag.name());
                        mInterstitialFacebookCacheFlags.add(facebookCacheFlag);
                    }
                    return;
                } catch (Exception unused) {
                    IronLog.INTERNAL.error("flag is unknown or all, set all as default");
                    mInterstitialFacebookCacheFlags = getFacebookAllCacheFlags();
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public void showInterstitial(JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String optString = jSONObject.optString("placementId");
        a.q("placementId = ", optString, IronLog.ADAPTER_API);
        this.mInterstitialAdsAvailability.put(optString, Boolean.FALSE);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.FacebookAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InterstitialAd interstitialAd = FacebookAdapter.this.mInterstitialPlacementIdToAd.get(optString);
                    if (interstitialAd != null && interstitialAd.isAdLoaded() && !interstitialAd.isAdInvalidated()) {
                        FacebookAdapter.this.mInterstitialPlacementIdShowCalled.put(optString, Boolean.TRUE);
                        interstitialAd.show();
                    } else {
                        interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
                    }
                } catch (Exception e10) {
                    IronLog.INTERNAL.error("ex.getMessage() = " + e10.getMessage());
                    interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", e10.getMessage()));
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.k
    public void showRewardedVideo(JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        final String optString = jSONObject.optString("placementId");
        IronLog.ADAPTER_API.verbose("placementId = " + optString);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.FacebookAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FacebookAdapter.this.mRewardedVideoAdsAvailability.put(optString, Boolean.FALSE);
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                    RewardedVideoAd rewardedVideoAd = FacebookAdapter.this.mRewardedVideoPlacementIdToAd.get(optString);
                    if (rewardedVideoAd != null && rewardedVideoAd.isAdLoaded() && !rewardedVideoAd.isAdInvalidated()) {
                        FacebookAdapter.this.mRewardedVideoPlacementIdShowCalled.put(optString, Boolean.TRUE);
                        rewardedVideoAd.show();
                    } else {
                        rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    }
                } catch (Exception e10) {
                    IronLog.INTERNAL.error("ex.getMessage() = " + e10.getMessage());
                    rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, e10.getMessage()));
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackLoadSuccess(String str) {
    }
}
