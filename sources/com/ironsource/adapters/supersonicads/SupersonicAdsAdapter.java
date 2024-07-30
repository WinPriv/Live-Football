package com.ironsource.adapters.supersonicads;

import android.app.Activity;
import android.text.TextUtils;
import com.huawei.hms.ads.ep;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.sdk.j;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.o;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.SSAFactory;
import com.ironsource.sdk.g.a;
import com.ironsource.sdk.j.c;
import com.ironsource.sdk.j.e;
import com.ironsource.sdk.j.f;
import com.ironsource.sdk.utils.SDKUtils;
import e0.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class SupersonicAdsAdapter extends AbstractAdapter implements ContextProvider.a, j, c, e, f {
    private static final String VERSION = "7.2.7";
    private final String AD_VISIBLE_EVENT_NAME;
    private final String APPLICATION_PRIVATE_KEY;
    private final String CAMPAIGN_ID;
    private final String CLIENT_SIDE_CALLBACKS;
    private final String CUSTOM_PARAM_PREFIX;
    private final String CUSTOM_SEGMENT;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String ITEM_COUNT;
    private final String ITEM_NAME;
    private final String ITEM_SIGNATURE;
    private final String LANGUAGE;
    private final String MAX_VIDEO_LENGTH;
    private final String OW_PLACEMENT_ID;
    private final String SDK_PLUGIN_TYPE;
    private final String SESSION_ID;
    private final String SUPERSONIC_ADS;
    private final String TIMESTAMP;
    private AtomicBoolean isRVInitiated;
    private boolean mConsent;
    private boolean mDidSetConsent;
    private boolean mIsAlreadyShowing;
    private boolean mIsRVAvailable;
    private String mMediationSegment;
    private com.ironsource.mediationsdk.sdk.f mOfferwallListener;
    private com.ironsource.sdk.f mSSAPublisher;
    private static AtomicBoolean mDidSetInitParams = new AtomicBoolean(false);
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);

    private SupersonicAdsAdapter(String str) {
        super(str);
        this.TIMESTAMP = "timestamp";
        this.ITEM_SIGNATURE = "itemSignature";
        this.SDK_PLUGIN_TYPE = "SDKPluginType";
        this.OW_PLACEMENT_ID = "placementId";
        this.SESSION_ID = "sessionid";
        this.mIsRVAvailable = false;
        this.SUPERSONIC_ADS = IronSourceConstants.SUPERSONIC_CONFIG_NAME;
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.LANGUAGE = "language";
        this.MAX_VIDEO_LENGTH = "maxVideoLength";
        this.CAMPAIGN_ID = "campaignId";
        this.CUSTOM_PARAM_PREFIX = "custom_";
        this.CUSTOM_SEGMENT = "custom_Segment";
        this.ITEM_NAME = "itemName";
        this.ITEM_COUNT = "itemCount";
        this.APPLICATION_PRIVATE_KEY = "privateKey";
        this.CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
        this.AD_VISIBLE_EVENT_NAME = "impressions";
        IronLog.INTERNAL.verbose("");
        this.isRVInitiated = new AtomicBoolean(false);
        ContextProvider.getInstance().registerLifeCycleListener(this);
        this.mIsAlreadyShowing = false;
    }

    private void addItemNameCountSignature(HashMap<String, String> hashMap, JSONObject jSONObject) {
        boolean z10;
        try {
            String optString = jSONObject.optString("itemName");
            int optInt = jSONObject.optInt("itemCount", -1);
            String optString2 = jSONObject.optString("privateKey");
            boolean z11 = false;
            if (TextUtils.isEmpty(optString)) {
                z10 = false;
            } else {
                hashMap.put("itemName", optString);
                z10 = true;
            }
            if (TextUtils.isEmpty(optString2)) {
                z10 = false;
            }
            if (optInt != -1) {
                hashMap.put("itemCount", String.valueOf(optInt));
                z11 = z10;
            }
            if (z11) {
                int currentTimestamp = IronSourceUtils.getCurrentTimestamp();
                hashMap.put("timestamp", String.valueOf(currentTimestamp));
                hashMap.put("itemSignature", createItemSig(currentTimestamp, optString, optInt, optString2));
            }
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error(" addItemNameCountSignature" + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyConsent(boolean z10) {
        if (this.mSSAPublisher == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gdprConsentStatus", String.valueOf(z10));
            jSONObject.put("demandSourceName", getProviderName());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        this.mSSAPublisher.a(jSONObject);
    }

    private String createItemSig(int i10, String str, int i11, String str2) {
        return IronSourceUtils.getMD5(i10 + str + i11 + str2);
    }

    private String createMinimumOfferCommissionSig(double d10, String str) {
        return IronSourceUtils.getMD5(d10 + str);
    }

    private String createUserCreationDateSig(String str, String str2, String str3) {
        return IronSourceUtils.getMD5(str + str2 + str3);
    }

    public static String getAdapterSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    private HashMap<String, String> getGenenralExtraParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        return hashMap;
    }

    private HashMap<String, String> getInitParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        if (!TextUtils.isEmpty(this.mMediationSegment)) {
            hashMap.put("custom_Segment", this.mMediationSegment);
        }
        if (!TextUtils.isEmpty(L.a().f24863p)) {
            hashMap.put("sessionid", L.a().f24863p);
        }
        return hashMap;
    }

    public static IntegrationData getIntegrationData(Activity activity) {
        IntegrationData integrationData = new IntegrationData(IronSourceConstants.SUPERSONIC_CONFIG_NAME, "7.2.7");
        integrationData.activities = new String[]{"com.ironsource.sdk.controller.ControllerActivity", "com.ironsource.sdk.controller.InterstitialActivity", "com.ironsource.sdk.controller.OpenUrlActivity"};
        integrationData.providers = new String[]{"com.ironsource.lifecycle.IronsourceLifecycleProvider"};
        return integrationData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getInterstitialExtraParams() {
        return getGenenralExtraParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams(JSONObject jSONObject) {
        HashMap<String, String> genenralExtraParams = getGenenralExtraParams();
        String optString = jSONObject.optString("language");
        if (!TextUtils.isEmpty(optString)) {
            genenralExtraParams.put("language", optString);
        }
        genenralExtraParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            genenralExtraParams.putAll(offerwallCustomParams);
        }
        addItemNameCountSignature(genenralExtraParams, jSONObject);
        return genenralExtraParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getRewardedVideoExtraParams(JSONObject jSONObject) {
        HashMap<String, String> genenralExtraParams = getGenenralExtraParams();
        String optString = jSONObject.optString("language");
        if (!TextUtils.isEmpty(optString)) {
            genenralExtraParams.put("language", optString);
        }
        String optString2 = jSONObject.optString("maxVideoLength");
        if (!TextUtils.isEmpty(optString2)) {
            genenralExtraParams.put("maxVideoLength", optString2);
        }
        String optString3 = jSONObject.optString("campaignId");
        if (!TextUtils.isEmpty(optString3)) {
            genenralExtraParams.put("campaignId", optString3);
        }
        if (!TextUtils.isEmpty(this.mMediationSegment)) {
            genenralExtraParams.put("custom_Segment", this.mMediationSegment);
        }
        addItemNameCountSignature(genenralExtraParams, jSONObject);
        Map<String, String> rewardedVideoCustomParams = SupersonicConfig.getConfigObj().getRewardedVideoCustomParams();
        if (rewardedVideoCustomParams != null && !rewardedVideoCustomParams.isEmpty()) {
            genenralExtraParams.putAll(rewardedVideoCustomParams);
        }
        return genenralExtraParams;
    }

    private boolean isValidMetaData(String str, String str2) {
        if (str.equals("do_not_sell")) {
            return MetaDataUtils.isValidCCPAMetaData(str, str2);
        }
        return true;
    }

    private void setParamsBeforeInit(JSONObject jSONObject) {
        String str;
        if (mDidSetInitParams.compareAndSet(false, true)) {
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            int optInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            }
            SDKUtils.setDebugMode(optInt);
            JSONObject optJSONObject = jSONObject.optJSONObject("controllerConfig");
            if (optJSONObject != null) {
                str = optJSONObject.toString();
            } else {
                str = "";
            }
            SDKUtils.setControllerConfig(str);
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + "setting controller url to " + jSONObject.optString("controllerUrl"));
            ironLog.verbose(getProviderName() + "setting controller config to " + str);
            ironLog.verbose(getProviderName() + "setting debug mode to " + optInt);
        }
    }

    public static SupersonicAdsAdapter startAdapter(String str) {
        return new SupersonicAdsAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        int optInt;
        IronSourceUtils.sendAutomationLog(getProviderName() + ": earlyInit");
        if (mDidInitSdk.compareAndSet(false, true)) {
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            } else {
                optInt = jSONObject.optInt("debugMode", 0);
            }
            SDKUtils.setDebugMode(optInt);
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(getProviderName() + " IronSourceNetwork setting controller url to  " + jSONObject.optString("controllerUrl"));
            SDKUtils.setControllerConfig(jSONObject.optString("controllerConfig", ""));
            ironLog.verbose(getProviderName() + " IronSourceNetwork setting controller config to  " + jSONObject.optString("controllerConfig"));
            HashMap<String, String> initParams = getInitParams();
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getCurrentActiveActivity(), L.a().f24855j, str2, initParams);
            StringBuilder sb2 = new StringBuilder("initSDK with appKey=");
            i.o(sb2, L.a().f24855j, " userId=", str2, " parameters ");
            sb2.append(initParams);
            ironLog.verbose(sb2.toString());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose(getProviderName());
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(this.mIsRVAvailable);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.sdk.j
    public void getOfferwallCredits() {
        if (this.mSSAPublisher != null) {
            L.a();
            String str = L.a().f24857k;
            IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.getOfferWallCredits userId=" + str);
            this.mSSAPublisher.a(L.a().f24855j, str, this);
            return;
        }
        IronLog.INTERNAL.error("Please call init before calling getOfferwallCredits");
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "7.2.7";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        setParamsBeforeInit(jSONObject);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.supersonicads.SupersonicAdsAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String mediationUserId = IronSourceUtils.getMediationUserId();
                    SupersonicAdsAdapter.this.mSSAPublisher = SSAFactory.getPublisherInstance(ContextProvider.getInstance().getCurrentActiveActivity());
                    HashMap interstitialExtraParams = SupersonicAdsAdapter.this.getInterstitialExtraParams();
                    if (SupersonicAdsAdapter.this.mDidSetConsent) {
                        SupersonicAdsAdapter supersonicAdsAdapter = SupersonicAdsAdapter.this;
                        supersonicAdsAdapter.applyConsent(supersonicAdsAdapter.mConsent);
                    }
                    IronLog.ADAPTER_API.verbose(SupersonicAdsAdapter.this.getProviderName() + " mSSAPublisher.initInterstitial userId=" + mediationUserId);
                    SupersonicAdsAdapter.this.mSSAPublisher.a(L.a().f24855j, mediationUserId, SupersonicAdsAdapter.this.getProviderName(), (Map<String, String>) interstitialExtraParams, (c) SupersonicAdsAdapter.this);
                    SupersonicAdsAdapter.mDidInitSdk.set(true);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    SupersonicAdsAdapter.this.onInterstitialInitFailed(e10.getMessage());
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.sdk.j
    public void initOfferwall(String str, final String str2, final JSONObject jSONObject) {
        IronLog.ADAPTER_API.verbose(getProviderName() + " userId=" + str2);
        setParamsBeforeInit(jSONObject);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.supersonicads.SupersonicAdsAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HashMap offerwallExtraParams = SupersonicAdsAdapter.this.getOfferwallExtraParams(jSONObject);
                    SupersonicAdsAdapter.this.mSSAPublisher = SSAFactory.getPublisherInstance(ContextProvider.getInstance().getCurrentActiveActivity());
                    if (SupersonicAdsAdapter.this.mDidSetConsent) {
                        SupersonicAdsAdapter supersonicAdsAdapter = SupersonicAdsAdapter.this;
                        supersonicAdsAdapter.applyConsent(supersonicAdsAdapter.mConsent);
                    }
                    IronLog.ADAPTER_API.verbose(SupersonicAdsAdapter.this.getProviderName() + " mSSAPublisher.initOfferWall");
                    SupersonicAdsAdapter.this.mSSAPublisher.a(L.a().f24855j, str2, offerwallExtraParams, SupersonicAdsAdapter.this);
                    SupersonicAdsAdapter.mDidInitSdk.set(true);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    IronLog.ADAPTER_API.error(SupersonicAdsAdapter.this.getProviderName() + ":initOfferwall(userId:" + str2 + ")" + e10);
                    com.ironsource.mediationsdk.sdk.f fVar = SupersonicAdsAdapter.this.mOfferwallListener;
                    StringBuilder sb2 = new StringBuilder("Adapter initialization failure - ");
                    sb2.append(SupersonicAdsAdapter.this.getProviderName());
                    sb2.append(" - ");
                    sb2.append(e10.getMessage());
                    fVar.a(false, ErrorBuilder.buildInitFailedError(sb2.toString(), IronSourceConstants.OFFERWALL_AD_UNIT));
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideo(String str, String str2, final JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        if (this.isRVInitiated.compareAndSet(false, true)) {
            setParamsBeforeInit(jSONObject);
            postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.supersonicads.SupersonicAdsAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String mediationUserId = IronSourceUtils.getMediationUserId();
                        SupersonicAdsAdapter.this.mSSAPublisher = SSAFactory.getPublisherInstance(ContextProvider.getInstance().getCurrentActiveActivity());
                        HashMap rewardedVideoExtraParams = SupersonicAdsAdapter.this.getRewardedVideoExtraParams(jSONObject);
                        if (SupersonicAdsAdapter.this.mDidSetConsent) {
                            SupersonicAdsAdapter supersonicAdsAdapter = SupersonicAdsAdapter.this;
                            supersonicAdsAdapter.applyConsent(supersonicAdsAdapter.mConsent);
                        }
                        IronLog.ADAPTER_API.verbose(SupersonicAdsAdapter.this.getProviderName() + " mSSAPublisher.initRewardedVideo userId=" + mediationUserId);
                        SupersonicAdsAdapter.this.mSSAPublisher.a(L.a().f24855j, mediationUserId, SupersonicAdsAdapter.this.getProviderName(), (Map<String, String>) rewardedVideoExtraParams, (f) SupersonicAdsAdapter.this);
                        SupersonicAdsAdapter.mDidInitSdk.set(true);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        SupersonicAdsAdapter.this.onRVInitFail("initRewardedVideo");
                    }
                }
            });
            return;
        }
        IronLog.ADAPTER_API.verbose(getProviderName() + " adapter already initiated");
        fetchRewardedVideoForAutomaticLoad(jSONObject, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public boolean isInterstitialReady(JSONObject jSONObject) {
        com.ironsource.sdk.f fVar = this.mSSAPublisher;
        if (fVar != null && fVar.a(getProviderName())) {
            return true;
        }
        return false;
    }

    public boolean isOfferwallAvailable() {
        return true;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.k
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        return this.mIsRVAvailable;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        if (this.mSSAPublisher != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.loadInterstitial");
            this.mSSAPublisher.c(jSONObject2);
            return;
        }
        IronLog.INTERNAL.error("Please call initInterstitial before calling loadInterstitial");
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Load was called before Init"));
            }
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onGetOWCreditsFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onGetOfferwallCreditsFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClick() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdClicked();
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialClose() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdClosed();
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterstitialSmashListener interstitialSmashListener;
        if (jSONObject != null) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName() + " " + str + " extData: " + jSONObject.toString());
            if (!TextUtils.isEmpty(str) && "impressions".equals(str) && (interstitialSmashListener = this.mActiveInterstitialSmash) != null) {
                interstitialSmashListener.onInterstitialAdVisible();
            }
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, "Interstitial"));
            }
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialInitSuccess();
            }
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
            }
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<InterstitialSmashListener> it = this.mAllInterstitialSmashes.iterator();
        while (it.hasNext()) {
            InterstitialSmashListener next = it.next();
            if (next != null) {
                next.onInterstitialAdReady();
            }
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialOpen() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdOpened();
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialShowSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        InterstitialSmashListener interstitialSmashListener = this.mActiveInterstitialSmash;
        if (interstitialSmashListener != null) {
            interstitialSmashListener.onInterstitialAdShowSucceeded();
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOWAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        com.ironsource.mediationsdk.sdk.f fVar = this.mOfferwallListener;
        if (fVar != null) {
            fVar.onOfferwallClosed();
        }
    }

    @Override // com.ironsource.sdk.j.e
    public boolean onOWAdCredited(int i10, int i11, boolean z10) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        com.ironsource.mediationsdk.sdk.f fVar = this.mOfferwallListener;
        if (fVar != null && fVar.onOfferwallAdCredited(i10, i11, z10)) {
            return true;
        }
        return false;
    }

    @Override // com.ironsource.sdk.j.e
    public void onOWShowFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onOfferwallShowFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOWShowSuccess(String str) {
        if (TextUtils.isEmpty(str)) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        } else {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName() + ":onOWShowSuccess(placementId:" + str + ")");
        }
        com.ironsource.mediationsdk.sdk.f fVar = this.mOfferwallListener;
        if (fVar != null) {
            fVar.onOfferwallOpened();
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOfferwallEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOfferwallInitFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.a(false, ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOfferwallInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        com.ironsource.mediationsdk.sdk.f fVar = this.mOfferwallListener;
        if (fVar != null) {
            fVar.onOfferwallAvailable(true);
        }
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onPause(Activity activity) {
        if (this.mSSAPublisher != null) {
            IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.onPause");
            this.mSSAPublisher.b(activity);
        }
    }

    @Override // com.ironsource.sdk.j.f
    public void onRVAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdClicked();
        }
    }

    @Override // com.ironsource.sdk.j.f
    public void onRVAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdClosed();
        }
    }

    @Override // com.ironsource.sdk.j.f
    public void onRVAdCredited(int i10) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdRewarded();
        }
    }

    @Override // com.ironsource.sdk.j.f
    public void onRVAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdOpened();
        }
    }

    @Override // com.ironsource.sdk.j.f
    public void onRVEventNotificationReceived(String str, JSONObject jSONObject) {
        RewardedVideoSmashListener rewardedVideoSmashListener;
        if (jSONObject != null) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName() + " " + str + " extData: " + jSONObject.toString());
        }
        if (!TextUtils.isEmpty(str) && "impressions".equals(str) && (rewardedVideoSmashListener = this.mActiveRewardedVideoSmash) != null) {
            rewardedVideoSmashListener.onRewardedVideoAdVisible();
        }
    }

    @Override // com.ironsource.sdk.j.f
    public void onRVInitFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    @Override // com.ironsource.sdk.j.f
    public void onRVInitSuccess(a aVar) {
        int i10;
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        boolean z10 = false;
        try {
            i10 = Integer.parseInt(aVar.f26469b);
        } catch (NumberFormatException e10) {
            IronLog.INTERNAL.error("parseInt()" + e10);
            i10 = 0;
        }
        if (i10 > 0) {
            z10 = true;
        }
        this.mIsRVAvailable = z10;
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(z10);
            }
        }
    }

    @Override // com.ironsource.sdk.j.f
    public void onRVNoMoreOffers() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        this.mIsRVAvailable = false;
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    @Override // com.ironsource.sdk.j.f
    public void onRVShowFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mActiveRewardedVideoSmash;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, str));
        }
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onResume(Activity activity) {
        if (this.mSSAPublisher != null) {
            IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.onResume");
            this.mSSAPublisher.c(activity);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z10) {
        String str;
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getProviderName());
        sb2.append(": setConsent (");
        if (z10) {
            str = ep.Code;
        } else {
            str = ep.V;
        }
        com.ironsource.adapters.facebook.a.r(sb2, str, ")", ironLog);
        this.mDidSetConsent = true;
        this.mConsent = z10;
        applyConsent(z10);
    }

    @Override // com.ironsource.mediationsdk.sdk.j
    public void setInternalOfferwallListener(com.ironsource.mediationsdk.sdk.f fVar) {
        this.mOfferwallListener = fVar;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMediationSegment(String str) {
        this.mMediationSegment = str;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMediationState(AbstractC1414b.a aVar, String str) {
        if (this.mSSAPublisher != null) {
            IronLog.ADAPTER_API.verbose(getProviderName() + ": setMediationState(" + str + " , " + getProviderName() + " , " + aVar.f25351l + ")");
            this.mSSAPublisher.a(str, getProviderName(), aVar.f25351l);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, String str2) {
        if (!mDidInitSdk.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("key=" + str + ", value=" + str2);
            if (!isValidMetaData(str, str2)) {
                ironLog.verbose("not valid");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, str2);
                IronSourceNetwork.updateMetadata(jSONObject);
            } catch (JSONException e10) {
                IronLog.ADAPTER_API.error("error - " + e10);
                e10.printStackTrace();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        this.mActiveInterstitialSmash = interstitialSmashListener;
        if (this.mSSAPublisher != null) {
            int b10 = o.a().b(2);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
                jSONObject2.put(IronSourceConstants.KEY_SESSION_DEPTH, b10);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.showInterstitial");
            this.mSSAPublisher.d(jSONObject2);
            return;
        }
        IronLog.INTERNAL.error("Please call loadInterstitialForBidding before calling showInterstitial");
        InterstitialSmashListener interstitialSmashListener2 = this.mActiveInterstitialSmash;
        if (interstitialSmashListener2 != null) {
            interstitialSmashListener2.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.j
    public void showOfferwall(String str, JSONObject jSONObject) {
        HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams(jSONObject);
        if (offerwallExtraParams != null) {
            offerwallExtraParams.put("placementId", str);
        }
        if (this.mSSAPublisher != null) {
            IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.showOfferWall");
            this.mSSAPublisher.a(ContextProvider.getInstance().getCurrentActiveActivity(), offerwallExtraParams);
            return;
        }
        IronLog.INTERNAL.error("Please call init before calling showOfferwall");
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.k
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mActiveRewardedVideoSmash = rewardedVideoSmashListener;
        if (this.mSSAPublisher != null) {
            int b10 = o.a().b(1);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("demandSourceName", getProviderName());
                jSONObject2.put(IronSourceConstants.KEY_SESSION_DEPTH, b10);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            IronLog.ADAPTER_API.verbose(getProviderName() + " mSSAPublisher.showRewardedVideo");
            this.mSSAPublisher.b(jSONObject2);
            return;
        }
        this.mIsRVAvailable = false;
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        Iterator<RewardedVideoSmashListener> it = this.mAllRewardedVideoSmashes.iterator();
        while (it.hasNext()) {
            RewardedVideoSmashListener next = it.next();
            if (next != null) {
                next.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    @Override // com.ironsource.sdk.j.c
    public void onInterstitialAdRewarded(String str, int i10) {
    }
}
