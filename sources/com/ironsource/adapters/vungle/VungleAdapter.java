package com.ironsource.adapters.vungle;

import android.app.Activity;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.bj;
import com.ironsource.adapters.facebook.a;
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
import com.vungle.warren.AdConfig;
import com.vungle.warren.BannerAdConfig;
import com.vungle.warren.Banners;
import com.vungle.warren.InitCallback;
import com.vungle.warren.Plugin;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.VungleSettings;
import com.vungle.warren.error.VungleException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class VungleAdapter extends AbstractAdapter implements INetworkInitCallbackListener, InitCallback {
    private static final String APP_ID = "AppID";
    private static final String CONSENT_MESSAGE_VERSION = "1.0.0";
    private static final String GitHash = "4166db564";
    private static final String LWS_SUPPORT_STATE = "isSupportedLWSByInstance";
    private static final String ORIENTATION_AUTO_ROTATE = "AUTO_ROTATE";
    private static final String ORIENTATION_FLAG = "vungle_adorientation";
    private static final String ORIENTATION_LANDSCAPE = "LANDSCAPE";
    private static final String ORIENTATION_PORTRAIT = "PORTRAIT";
    private static final String PLACEMENT_ID = "PlacementId";
    private static final String VERSION = "4.3.19";
    private static final String VUNGLE_COPPA_FLAG = "vungle_coppa";
    private static String mAdOrientation;
    private static Boolean mCCPA;
    private static Boolean mConsent;
    private ISBannerSize mCurrentBannerSize;
    private ConcurrentHashMap<String, String> mPlacementIdToBannerServerData;
    private ConcurrentHashMap<String, BannerSmashListener> mPlacementIdToBannerSmashListener;
    protected ConcurrentHashMap<String, VungleBanner> mPlacementIdToBannerView;
    private ConcurrentHashMap<String, String> mPlacementIdToInterstitialServerData;
    private ConcurrentHashMap<String, InterstitialSmashListener> mPlacementIdToInterstitialSmashListener;
    private ConcurrentHashMap<String, String> mPlacementIdToRewardedVideoServerData;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mPlacementIdToRewardedVideoSmashListener;
    private CopyOnWriteArraySet<String> mRewardedVideoPlacementIdsForInitCallbacks;
    private static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    private static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();
    private static InitState mInitState = InitState.INIT_STATE_NONE;

    /* renamed from: com.ironsource.adapters.vungle.VungleAdapter$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$ironsource$adapters$vungle$VungleAdapter$InitState;

        static {
            int[] iArr = new int[InitState.values().length];
            $SwitchMap$com$ironsource$adapters$vungle$VungleAdapter$InitState = iArr;
            try {
                iArr[InitState.INIT_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$vungle$VungleAdapter$InitState[InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$vungle$VungleAdapter$InitState[InitState.INIT_STATE_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$vungle$VungleAdapter$InitState[InitState.INIT_STATE_FAILED.ordinal()] = 4;
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

    private VungleAdapter(String str) {
        super(str);
        this.mCurrentBannerSize = null;
        IronLog.INTERNAL.verbose("");
        this.mPlacementIdToRewardedVideoSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToRewardedVideoServerData = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mPlacementIdToInterstitialSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToInterstitialServerData = new ConcurrentHashMap<>();
        this.mPlacementIdToBannerSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToBannerServerData = new ConcurrentHashMap<>();
        this.mPlacementIdToBannerView = new ConcurrentHashMap<>();
    }

    private AdConfig createAdConfig() {
        AdConfig adConfig = new AdConfig();
        String str = mAdOrientation;
        if (str != null) {
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -784136725:
                    if (str.equals(ORIENTATION_AUTO_ROTATE)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -77725029:
                    if (str.equals(ORIENTATION_LANDSCAPE)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1511893915:
                    if (str.equals(ORIENTATION_PORTRAIT)) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    adConfig.setAdOrientation(2);
                    break;
                case 1:
                    adConfig.setAdOrientation(1);
                    break;
                case 2:
                    adConfig.setAdOrientation(0);
                    break;
            }
            IronLog.INTERNAL.verbose("setAdOrientation to " + adConfig.getAdOrientation());
        }
        return adConfig;
    }

    public static String getAdapterSDKVersion() {
        return com.vungle.warren.BuildConfig.VERSION_NAME;
    }

    private Map<String, Object> getBiddingData() {
        if (mInitState == InitState.INIT_STATE_FAILED) {
            IronLog.INTERNAL.error("Returning null as token since init failed");
            return null;
        }
        String availableBidTokens = Vungle.getAvailableBidTokens(ContextProvider.getInstance().getApplicationContext());
        if (TextUtils.isEmpty(availableBidTokens)) {
            availableBidTokens = "";
        }
        String coreSDKVersion = getCoreSDKVersion();
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("sdkVersion = " + coreSDKVersion);
        ironLog.verbose("token = " + availableBidTokens);
        HashMap hashMap = new HashMap();
        hashMap.put(bj.f.Code, coreSDKVersion);
        hashMap.put(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, availableBidTokens);
        return hashMap;
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData(com.vungle.warren.BuildConfig.OMSDK_PARTNER_NAME, "4.3.19");
        integrationData.validateWriteExternalStorage = true;
        return integrationData;
    }

    private void initSDK(String str) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            a.q("appId = ", str, IronLog.ADAPTER_API);
            mInitState = InitState.INIT_STATE_IN_PROGRESS;
            Plugin.addWrapperInfo(VungleApiClient.WrapperFramework.ironsource, getVersion());
            Vungle.init(str, ContextProvider.getInstance().getApplicationContext(), this, new VungleSettings.Builder().disableBannerRefresh().build());
        }
    }

    private boolean isBannerSizeSupported(ISBannerSize iSBannerSize) {
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
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    private boolean isValidCOPPAMetaData(String str, String str2) {
        if (str.equalsIgnoreCase(VUNGLE_COPPA_FLAG) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    private void loadBannerInternal(final String str, final IronSourceBannerLayout ironSourceBannerLayout, final BannerSmashListener bannerSmashListener, final String str2) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + str);
        if (!isBannerSizeSupported(ironSourceBannerLayout.getSize())) {
            ironLog.verbose("size not supported, size = " + ironSourceBannerLayout.getSize().getDescription());
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
            return;
        }
        this.mCurrentBannerSize = ironSourceBannerLayout.getSize();
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.vungle.VungleAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                AdConfig.AdSize bannerSize = VungleAdapter.this.getBannerSize(ironSourceBannerLayout.getSize());
                BannerAdConfig bannerAdConfig = new BannerAdConfig(bannerSize);
                IronLog.ADAPTER_API.verbose("bannerSize = " + bannerSize);
                VungleAdapter vungleAdapter = VungleAdapter.this;
                VungleBannerLoadListener vungleBannerLoadListener = new VungleBannerLoadListener(vungleAdapter, bannerSmashListener, vungleAdapter.mCurrentBannerSize);
                if (!TextUtils.isEmpty(str2)) {
                    Banners.loadBanner(str, str2, bannerAdConfig, vungleBannerLoadListener);
                } else {
                    Banners.loadBanner(str, bannerAdConfig, vungleBannerLoadListener);
                }
            }
        });
    }

    private void loadInterstitialInternal(String str, InterstitialSmashListener interstitialSmashListener, String str2) {
        IronLog.ADAPTER_API.verbose("placementId = " + str);
        VungleInterstitialLoadListener vungleInterstitialLoadListener = new VungleInterstitialLoadListener(interstitialSmashListener);
        if (!TextUtils.isEmpty(str2)) {
            Vungle.loadAd(str, str2, createAdConfig(), vungleInterstitialLoadListener);
        } else {
            Vungle.loadAd(str, vungleInterstitialLoadListener);
        }
    }

    private void loadRewardedVideoInternal(String str, RewardedVideoSmashListener rewardedVideoSmashListener, String str2) {
        IronLog.ADAPTER_API.verbose("placementId = " + str);
        VungleRewardedVideoLoadListener vungleRewardedVideoLoadListener = new VungleRewardedVideoLoadListener(rewardedVideoSmashListener);
        if (!TextUtils.isEmpty(str2)) {
            Vungle.loadAd(str, str2, createAdConfig(), vungleRewardedVideoLoadListener);
        } else {
            Vungle.loadAd(str, vungleRewardedVideoLoadListener);
        }
    }

    private void setCCPAValue(boolean z10) {
        Vungle.Consent consent;
        if (mInitState == InitState.INIT_STATE_SUCCESS) {
            if (!z10) {
                consent = Vungle.Consent.OPTED_IN;
            } else {
                consent = Vungle.Consent.OPTED_OUT;
            }
            IronLog.ADAPTER_API.verbose("key = Vungle.Consent, value = " + consent.name());
            Vungle.updateCCPAStatus(consent);
            return;
        }
        mCCPA = Boolean.valueOf(z10);
    }

    private void setCOPPAValue(boolean z10) {
        if (mInitState == InitState.INIT_STATE_NONE) {
            IronLog.ADAPTER_API.verbose("coppa = " + z10);
            Vungle.updateUserCoppaStatus(z10);
            return;
        }
        IronLog.INTERNAL.verbose("COPPA value can be set only before the initialization of Vungle");
    }

    public static VungleAdapter startAdapter(String str) {
        return new VungleAdapter(str);
    }

    public VungleBanner createVungleBannerAdView(String str, AdConfig.AdSize adSize) {
        boolean z10;
        VungleBanner banner;
        BannerAdConfig bannerAdConfig = new BannerAdConfig(adSize);
        if (adSize == AdConfig.AdSize.VUNGLE_MREC) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bannerAdConfig.setMuted(true);
        }
        String str2 = this.mPlacementIdToBannerServerData.get(str);
        VungleBannerPlayListener vungleBannerPlayListener = new VungleBannerPlayListener(this.mPlacementIdToBannerSmashListener.get(str));
        if (!TextUtils.isEmpty(str2)) {
            banner = Banners.getBanner(str, str2, bannerAdConfig, vungleBannerPlayListener);
        } else {
            banner = Banners.getBanner(str, bannerAdConfig, vungleBannerPlayListener);
        }
        if (banner != null) {
            this.mPlacementIdToBannerView.put(str, banner);
        }
        return banner;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void destroyBanner(JSONObject jSONObject) {
        final String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        a.q("placementId = ", optString, ironLog);
        if (this.mCurrentBannerSize == null) {
            ironLog.verbose("mCurrentBannerSize is null");
        } else {
            postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.vungle.VungleAdapter.2
                @Override // java.lang.Runnable
                public void run() {
                    if (VungleAdapter.this.mPlacementIdToBannerView.containsKey(optString)) {
                        VungleAdapter.this.mPlacementIdToBannerView.get(optString).destroyAd();
                        VungleAdapter.this.mPlacementIdToBannerView.remove(optString);
                    }
                    VungleAdapter.this.mCurrentBannerSize = null;
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        if (isRewardedVideoAdAvailableInternal(optString)) {
            a.q("ad already cached for placement Id ", optString, IronLog.ADAPTER_API);
            this.mPlacementIdToRewardedVideoSmashListener.get(optString).onRewardedVideoAvailabilityChanged(true);
        } else {
            loadRewardedVideoInternal(optString, rewardedVideoSmashListener, null);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r6.equals("RECTANGLE") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.FrameLayout.LayoutParams getBannerLayoutParams(com.ironsource.mediationsdk.ISBannerSize r6) {
        /*
            r5 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 0
            r0.<init>(r1, r1)
            com.ironsource.environment.ContextProvider r2 = com.ironsource.environment.ContextProvider.getInstance()
            android.app.Activity r2 = r2.getCurrentActiveActivity()
            java.lang.String r6 = r6.getDescription()
            r6.getClass()
            int r3 = r6.hashCode()
            r4 = -1
            switch(r3) {
                case -387072689: goto L40;
                case 72205083: goto L35;
                case 79011241: goto L2a;
                case 1951953708: goto L1f;
                default: goto L1d;
            }
        L1d:
            r1 = r4
            goto L49
        L1f:
            java.lang.String r1 = "BANNER"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L28
            goto L1d
        L28:
            r1 = 3
            goto L49
        L2a:
            java.lang.String r1 = "SMART"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L33
            goto L1d
        L33:
            r1 = 2
            goto L49
        L35:
            java.lang.String r1 = "LARGE"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L3e
            goto L1d
        L3e:
            r1 = 1
            goto L49
        L40:
            java.lang.String r3 = "RECTANGLE"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L49
            goto L1d
        L49:
            r6 = 50
            r3 = 320(0x140, float:4.48E-43)
            switch(r1) {
                case 0: goto L85;
                case 1: goto L77;
                case 2: goto L51;
                case 3: goto L77;
                default: goto L50;
            }
        L50:
            goto L96
        L51:
            boolean r0 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r2)
            if (r0 == 0) goto L69
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r6 = 728(0x2d8, float:1.02E-42)
            int r6 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r6)
            r1 = 90
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r1)
            r0.<init>(r6, r1)
            goto L96
        L69:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r3)
            int r6 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r6)
            r0.<init>(r1, r6)
            goto L96
        L77:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r3)
            int r6 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r6)
            r0.<init>(r1, r6)
            goto L96
        L85:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r6 = 300(0x12c, float:4.2E-43)
            int r6 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r6)
            r1 = 250(0xfa, float:3.5E-43)
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r2, r1)
            r0.<init>(r6, r1)
        L96:
            r6 = 17
            r0.gravity = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.vungle.VungleAdapter.getBannerLayoutParams(com.ironsource.mediationsdk.ISBannerSize):android.widget.FrameLayout$LayoutParams");
    }

    public AdConfig.AdSize getBannerSize(ISBannerSize iSBannerSize) {
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
        }
        switch (c10) {
            case 0:
                return AdConfig.AdSize.VUNGLE_MREC;
            case 1:
            case 3:
                return AdConfig.AdSize.BANNER;
            case 2:
                if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity())) {
                    return AdConfig.AdSize.BANNER_LEADERBOARD;
                }
                return AdConfig.AdSize.BANNER;
            default:
                return null;
        }
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
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        LoadWhileShowSupportState loadWhileShowSupportState = this.mLWSSupportState;
        if (jSONObject != null) {
            if (jSONObject.optBoolean(LWS_SUPPORT_STATE)) {
                return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
            }
            return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK;
        }
        return loadWhileShowSupportState;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "4.3.19";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        String optString2 = jSONObject.optString(APP_ID);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing param - PlacementId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("Missing param - AppID");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + optString + ", appId = " + optString2);
        this.mPlacementIdToRewardedVideoSmashListener.put(optString, rewardedVideoSmashListener);
        int i10 = AnonymousClass3.$SwitchMap$com$ironsource$adapters$vungle$VungleAdapter$InitState[mInitState.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    IronLog.INTERNAL.verbose("init failed - placementId = " + optString);
                    rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
                    return;
                }
                return;
            }
            if (isRewardedVideoAdAvailableInternal(optString)) {
                ironLog.verbose("ad already cached for placement Id " + optString);
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(true);
                return;
            }
            loadRewardedVideoInternal(optString, rewardedVideoSmashListener, null);
            return;
        }
        initSDK(optString2);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        initBanners(str, str2, jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        String optString2 = jSONObject.optString(APP_ID);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing param - PlacementId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing param - PlacementId", "Banner"));
            return;
        }
        if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("Missing param - AppID");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing param - AppID", "Banner"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + optString + ", appId = " + optString2);
        this.mPlacementIdToBannerSmashListener.put(optString, bannerSmashListener);
        int i10 = AnonymousClass3.$SwitchMap$com$ironsource$adapters$vungle$VungleAdapter$InitState[mInitState.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    IronLog.INTERNAL.verbose("init failed - placementId = " + optString);
                    bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Vungle SDK init failed", "Banner"));
                    return;
                }
                return;
            }
            bannerSmashListener.onBannerInitSuccess();
            return;
        }
        initSDK(optString2);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        String optString2 = jSONObject.optString(APP_ID);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing param - PlacementId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing param - PlacementId", "Interstitial"));
            return;
        }
        if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("Missing param - AppID");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing param - AppID", "Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + optString + ", appId = " + optString2);
        this.mPlacementIdToInterstitialSmashListener.put(optString, interstitialSmashListener);
        int i10 = AnonymousClass3.$SwitchMap$com$ironsource$adapters$vungle$VungleAdapter$InitState[mInitState.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    IronLog.INTERNAL.verbose("init failed - placementId = " + optString);
                    interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Vungle SDK init failed", "Interstitial"));
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
        initInterstitial(str, str2, jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        String optString2 = jSONObject.optString(APP_ID);
        if (TextUtils.isEmpty(optString)) {
            IronLog.INTERNAL.error("Missing param - PlacementId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing param - PlacementId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (TextUtils.isEmpty(optString2)) {
            IronLog.INTERNAL.error("Missing param - AppID");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing param - AppID", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + optString + ", appId = " + optString2);
        this.mPlacementIdToRewardedVideoSmashListener.put(optString, rewardedVideoSmashListener);
        this.mRewardedVideoPlacementIdsForInitCallbacks.add(optString);
        int i10 = AnonymousClass3.$SwitchMap$com$ironsource$adapters$vungle$VungleAdapter$InitState[mInitState.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    IronLog.INTERNAL.verbose("init failed - placementId = " + optString);
                    rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Vungle SDK init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                return;
            }
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            return;
        }
        initSDK(optString2);
    }

    public boolean isBannerAdAvailableInternal(String str, AdConfig.AdSize adSize) {
        if (this.mPlacementIdToBannerServerData.containsKey(str)) {
            return Banners.canPlayAd(str, this.mPlacementIdToBannerServerData.get(str), adSize);
        }
        return Banners.canPlayAd(str, adSize);
    }

    public boolean isInterstitialAdAvailableInternal(String str) {
        if (this.mPlacementIdToInterstitialServerData.containsKey(str)) {
            return Vungle.canPlayAd(str, this.mPlacementIdToInterstitialServerData.get(str));
        }
        return Vungle.canPlayAd(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public boolean isInterstitialReady(JSONObject jSONObject) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        if (Vungle.isInitialized() && this.mPlacementIdToInterstitialSmashListener.containsKey(optString) && isInterstitialAdAvailableInternal(optString)) {
            return true;
        }
        return false;
    }

    public boolean isRewardedVideoAdAvailableInternal(String str) {
        if (this.mPlacementIdToRewardedVideoServerData.containsKey(str)) {
            return Vungle.canPlayAd(str, this.mPlacementIdToRewardedVideoServerData.get(str));
        }
        return Vungle.canPlayAd(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.k
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog.ADAPTER_API.verbose("placementId = " + optString);
        if (Vungle.isInitialized() && this.mPlacementIdToRewardedVideoSmashListener.containsKey(optString) && isRewardedVideoAdAvailableInternal(optString)) {
            return true;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject.optString(PLACEMENT_ID), ironSourceBannerLayout, bannerSmashListener, null);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        this.mPlacementIdToBannerServerData.put(optString, str);
        loadBannerInternal(optString, ironSourceBannerLayout, bannerSmashListener, str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        loadInterstitialInternal(jSONObject.optString(PLACEMENT_ID), interstitialSmashListener, null);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        this.mPlacementIdToInterstitialServerData.put(optString, str);
        loadInterstitialInternal(optString, interstitialSmashListener, str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        this.mPlacementIdToRewardedVideoServerData.put(optString, str);
        loadRewardedVideoInternal(optString, rewardedVideoSmashListener, str);
    }

    @Override // com.vungle.warren.InitCallback
    public void onAutoCacheAdAvailable(String str) {
        a.q("placementId ", str, IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.vungle.warren.InitCallback
    public void onError(VungleException vungleException) {
        IronLog.ADAPTER_CALLBACK.verbose("Failed to initialize SDK");
        mInitState = InitState.INIT_STATE_FAILED;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed("Vungle sdk init failed - " + vungleException.getLocalizedMessage());
        }
        initCallbackListeners.clear();
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        for (String str2 : this.mPlacementIdToRewardedVideoSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str2);
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(str2)) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
        Iterator<InterstitialSmashListener> it = this.mPlacementIdToInterstitialSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, "Interstitial"));
        }
        Iterator<BannerSmashListener> it2 = this.mPlacementIdToBannerSmashListener.values().iterator();
        while (it2.hasNext()) {
            it2.next().onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (String str : this.mPlacementIdToRewardedVideoSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mPlacementIdToRewardedVideoSmashListener.get(str);
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(str)) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoInternal(str, rewardedVideoSmashListener, null);
            }
        }
        Iterator<InterstitialSmashListener> it = this.mPlacementIdToInterstitialSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onInterstitialInitSuccess();
        }
        Iterator<BannerSmashListener> it2 = this.mPlacementIdToBannerSmashListener.values().iterator();
        while (it2.hasNext()) {
            it2.next().onBannerInitSuccess();
        }
    }

    @Override // com.vungle.warren.InitCallback
    public void onSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("Succeeded to initialize SDK");
        mInitState = InitState.INIT_STATE_SUCCESS;
        Boolean bool = mConsent;
        if (bool != null) {
            setConsent(bool.booleanValue());
        }
        Boolean bool2 = mCCPA;
        if (bool2 != null) {
            setCCPAValue(bool2.booleanValue());
        }
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.mPlacementIdToRewardedVideoSmashListener.clear();
            this.mPlacementIdToRewardedVideoServerData.clear();
            this.mRewardedVideoPlacementIdsForInitCallbacks.clear();
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.mPlacementIdToInterstitialSmashListener.clear();
            this.mPlacementIdToInterstitialServerData.clear();
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            Iterator<VungleBanner> it = this.mPlacementIdToBannerView.values().iterator();
            while (it.hasNext()) {
                it.next().destroyAd();
            }
            this.mPlacementIdToBannerView.clear();
            this.mPlacementIdToBannerSmashListener.clear();
            this.mPlacementIdToBannerServerData.clear();
            this.mCurrentBannerSize = null;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.INTERNAL.warning("Unsupported method");
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z10) {
        Vungle.Consent consent;
        IronLog.ADAPTER_API.verbose("consent = " + z10);
        if (mInitState == InitState.INIT_STATE_SUCCESS) {
            if (z10) {
                consent = Vungle.Consent.OPTED_IN;
            } else {
                consent = Vungle.Consent.OPTED_OUT;
            }
            Vungle.updateConsentStatus(consent, CONSENT_MESSAGE_VERSION);
            return;
        }
        mConsent = Boolean.valueOf(z10);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        String str2 = list.get(0);
        IronLog.ADAPTER_API.verbose("key = " + str + ", value = " + str2);
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
            return;
        }
        if (str.equalsIgnoreCase(ORIENTATION_FLAG)) {
            mAdOrientation = str2;
            return;
        }
        String formatValueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (isValidCOPPAMetaData(str, formatValueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(formatValueForType));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean shouldBindBannerViewOnReload() {
        return true;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        a.q("placementId = ", optString, IronLog.ADAPTER_API);
        if (isInterstitialAdAvailableInternal(optString)) {
            VungleInterstitialPlayListener vungleInterstitialPlayListener = new VungleInterstitialPlayListener(interstitialSmashListener);
            AdConfig createAdConfig = createAdConfig();
            String str = this.mPlacementIdToInterstitialServerData.get(optString);
            if (!TextUtils.isEmpty(str)) {
                Vungle.playAd(optString, str, createAdConfig, vungleInterstitialPlayListener);
                return;
            } else {
                Vungle.playAd(optString, createAdConfig, vungleInterstitialPlayListener);
                return;
            }
        }
        IronLog.INTERNAL.error("There is no ad available for placementId = " + optString);
        interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.k
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String optString = jSONObject.optString(PLACEMENT_ID);
        IronLog.ADAPTER_API.verbose("placementId = " + optString);
        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        if (isRewardedVideoAdAvailableInternal(optString)) {
            if (!TextUtils.isEmpty(getDynamicUserId())) {
                Vungle.setIncentivizedFields(getDynamicUserId(), null, null, null, null);
            }
            VungleRewardedVideoPlayListener vungleRewardedVideoPlayListener = new VungleRewardedVideoPlayListener(rewardedVideoSmashListener);
            AdConfig createAdConfig = createAdConfig();
            String str = this.mPlacementIdToRewardedVideoServerData.get(optString);
            if (!TextUtils.isEmpty(str)) {
                Vungle.playAd(optString, str, createAdConfig, vungleRewardedVideoPlayListener);
                return;
            } else {
                Vungle.playAd(optString, createAdConfig, vungleRewardedVideoPlayListener);
                return;
            }
        }
        IronLog.INTERNAL.error("There is no ad available for placementId = " + optString);
        rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackLoadSuccess(String str) {
    }
}
