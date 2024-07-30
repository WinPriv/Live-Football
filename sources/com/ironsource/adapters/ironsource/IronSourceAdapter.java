package com.ironsource.adapters.ironsource;

import a3.k;
import android.app.Activity;
import android.text.TextUtils;
import com.huawei.hms.ads.ep;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.constant.av;
import com.ironsource.adapters.supersonicads.SupersonicConfig;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C1418f;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.sdk.f;
import com.ironsource.mediationsdk.sdk.j;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.o;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.a;
import com.ironsource.sdk.b;
import com.ironsource.sdk.c;
import com.ironsource.sdk.j.d;
import com.ironsource.sdk.j.e;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceAdapter extends AbstractAdapter implements ContextProvider.a, j, e {
    public static final String IRONSOURCE_BIDDING_TOKEN_KEY = "token";
    public static final String IRONSOURCE_ONE_FLOW_KEY = "isOneFlow";
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final String VERSION = "7.2.7";
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static String mediationSegment;
    private final String ADM_KEY;
    private final String CUSTOM_SEGMENT;
    private final String DEMAND_SOURCE_NAME;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String LWS_SUPPORT_STATE;
    private final String OW_CLIENT_SIDE_CALLBACKS;
    private final String OW_PLACEMENT_ID;
    private final String SDK_PLUGIN_TYPE;
    private final String SESSION_ID;
    final ConcurrentHashMap<String, BannerSmashListener> mDemandSourceToBNSmash;
    ConcurrentHashMap<String, ArrayList<b>> mDemandSourceToBnAd;
    ConcurrentHashMap<String, b> mDemandSourceToISAd;
    ConcurrentHashMap<String, InterstitialSmashListener> mDemandSourceToISSmash;
    ConcurrentHashMap<String, b> mDemandSourceToRvAd;
    ConcurrentHashMap<String, RewardedVideoSmashListener> mDemandSourceToRvSmash;
    private f mOfferwallListener;

    private IronSourceAdapter(String str) {
        super(str);
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.SESSION_ID = "sessionid";
        this.SDK_PLUGIN_TYPE = "SDKPluginType";
        this.CUSTOM_SEGMENT = "custom_Segment";
        this.ADM_KEY = "adm";
        this.DEMAND_SOURCE_NAME = "demandSourceName";
        this.OW_PLACEMENT_ID = "placementId";
        this.OW_CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mDemandSourceToRvAd = new ConcurrentHashMap<>();
        this.mDemandSourceToRvSmash = new ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new ConcurrentHashMap<>();
        this.mDemandSourceToISSmash = new ConcurrentHashMap<>();
        this.mDemandSourceToBnAd = new ConcurrentHashMap<>();
        this.mDemandSourceToBNSmash = new ConcurrentHashMap<>();
        mediationSegment = null;
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r8 != false) goto L40;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x004d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ironsource.sdk.a convertBannerSize(android.app.Activity r7, com.ironsource.mediationsdk.ISBannerSize r8) {
        /*
            r6 = this;
            java.lang.String r0 = r8.getDescription()
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -387072689: goto L3c;
                case 72205083: goto L31;
                case 79011241: goto L26;
                case 1951953708: goto L1b;
                case 1999208305: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L46
        L10:
            java.lang.String r1 = "CUSTOM"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L19
            goto L46
        L19:
            r2 = 4
            goto L46
        L1b:
            java.lang.String r1 = "BANNER"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L24
            goto L46
        L24:
            r2 = 3
            goto L46
        L26:
            java.lang.String r1 = "SMART"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2f
            goto L46
        L2f:
            r2 = 2
            goto L46
        L31:
            java.lang.String r1 = "LARGE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3a
            goto L46
        L3a:
            r2 = 1
            goto L46
        L3c:
            java.lang.String r1 = "RECTANGLE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L45
            goto L46
        L45:
            r2 = 0
        L46:
            r1 = 0
            r3 = 90
            r4 = 50
            r5 = 320(0x140, float:4.48E-43)
            switch(r2) {
                case 0: goto L6a;
                case 1: goto L6e;
                case 2: goto L5e;
                case 3: goto L5c;
                case 4: goto L51;
                default: goto L50;
            }
        L50:
            return r1
        L51:
            int r8 = r8.getHeight()
            if (r8 == r4) goto L5a
            if (r8 == r3) goto L5a
            return r1
        L5a:
            r3 = r8
            goto L6e
        L5c:
            r3 = r4
            goto L6e
        L5e:
            boolean r8 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r7)
            if (r8 == 0) goto L67
            r1 = 728(0x2d8, float:1.02E-42)
            r5 = r1
        L67:
            if (r8 == 0) goto L5c
            goto L6e
        L6a:
            r5 = 300(0x12c, float:4.2E-43)
            r3 = 250(0xfa, float:3.5E-43)
        L6e:
            int r8 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r7, r5)
            int r7 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r7, r3)
            com.ironsource.sdk.a r1 = new com.ironsource.sdk.a
            r1.<init>(r8, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.ironsource.IronSourceAdapter.convertBannerSize(android.app.Activity, com.ironsource.mediationsdk.ISBannerSize):com.ironsource.sdk.a");
    }

    private b createBannerAdInstance(String str, a aVar, JSONObject jSONObject) {
        boolean z10;
        IronLog.ADAPTER_API.verbose("creating banner ad instance for " + str);
        IronSourceBannerListener ironSourceBannerListener = new IronSourceBannerListener(this, this.mDemandSourceToBNSmash.get(str), str);
        boolean optBoolean = jSONObject.optBoolean("isOneFlow");
        if (jSONObject.optInt("instanceType", 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        c cVar = new c(str, ironSourceBannerListener);
        cVar.f26039d = getInitParams();
        cVar.f26037b = z10;
        cVar.f26040e = optBoolean;
        cVar.f26038c = aVar;
        return cVar.a();
    }

    private HashMap<String, String> createBannerLoadParams(JSONObject jSONObject, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (str != null) {
            C1418f.a();
            hashMap.put("adm", C1418f.c(str));
            hashMap.put("isOneFlow", String.valueOf(jSONObject.optBoolean("isOneFlow")));
            C1418f.a();
            hashMap.putAll(C1418f.b(str));
        }
        return hashMap;
    }

    private b getAdInstance(String str, boolean z10, boolean z11, boolean z12) {
        ConcurrentHashMap<String, b> concurrentHashMap;
        c cVar;
        ConcurrentHashMap<String, b> concurrentHashMap2;
        if (z12) {
            concurrentHashMap = this.mDemandSourceToRvAd;
        } else {
            concurrentHashMap = this.mDemandSourceToISAd;
        }
        b bVar = concurrentHashMap.get(str);
        if (bVar == null) {
            IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isDemandOnlyForRv=" + z10 + " isBidder=" + z11 + " isRewarded=" + z12);
            if (z12) {
                cVar = new c(str, new IronSourceRewardedVideoListener(this.mDemandSourceToRvSmash.get(str), str, z10));
                cVar.f26039d = getInitParams();
                cVar.f26036a = true;
            } else {
                cVar = new c(str, new IronSourceInterstitialListener(this.mDemandSourceToISSmash.get(str), str));
                cVar.f26039d = getInitParams();
            }
            cVar.f26037b = z11;
            bVar = cVar.a();
            if (z12) {
                concurrentHashMap2 = this.mDemandSourceToRvAd;
            } else {
                concurrentHashMap2 = this.mDemandSourceToISAd;
            }
            concurrentHashMap2.put(str, bVar);
        }
        return bVar;
    }

    private String getDemandSourceName(JSONObject jSONObject) {
        if (!TextUtils.isEmpty(jSONObject.optString("demandSourceName"))) {
            return jSONObject.optString("demandSourceName");
        }
        return getProviderName();
    }

    private HashMap<String, String> getInitParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        if (!TextUtils.isEmpty(mediationSegment)) {
            hashMap.put("custom_Segment", mediationSegment);
        }
        if (!TextUtils.isEmpty(L.a().f24863p)) {
            hashMap.put("sessionid", L.a().f24863p);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams() {
        HashMap<String, String> initParams = getInitParams();
        initParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            initParams.putAll(offerwallCustomParams);
        }
        return initParams;
    }

    private void initInterstitialInternal(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str2) {
        initSDK(str, jSONObject);
        this.mDemandSourceToISSmash.put(str2, interstitialSmashListener);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(String str, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str2) {
        initSDK(str, jSONObject);
        this.mDemandSourceToRvSmash.put(str2, rewardedVideoSmashListener);
    }

    private void initSDK(String str, JSONObject jSONObject) {
        String str2;
        if (mDidInitSdk.compareAndSet(false, true)) {
            String mediationUserId = IronSourceUtils.getMediationUserId();
            int optInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + optInt);
            SDKUtils.setDebugMode(optInt);
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            ironLog.verbose("IronSourceNetwork setting controller url to " + jSONObject.optString("controllerUrl"));
            JSONObject optJSONObject = jSONObject.optJSONObject("controllerConfig");
            if (optJSONObject != null) {
                str2 = optJSONObject.toString();
            } else {
                str2 = "";
            }
            SDKUtils.setControllerConfig(str2);
            ironLog.verbose("IronSourceNetwork setting controller config to " + str2);
            HashMap<String, String> initParams = getInitParams();
            String str3 = L.a().f24855j;
            StringBuilder o = k.o("with appKey=", str3, " userId=", mediationUserId, " parameters ");
            o.append(initParams);
            ironLog.verbose(o.toString());
            IronSourceNetwork.setInitListener(new d() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.1
                @Override // com.ironsource.sdk.j.d
                public void onFail(com.ironsource.sdk.g.e eVar) {
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    StringBuilder sb2 = new StringBuilder("OnNetworkSDKInitListener fail - code:");
                    sb2.append(eVar.f26516b);
                    sb2.append(" message:");
                    k.v(sb2, eVar.f26515a, ironLog2);
                }

                @Override // com.ironsource.sdk.j.d
                public void onSuccess() {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                }
            });
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), str3, mediationUserId, initParams);
        }
    }

    private boolean isValidMetaData(String str, String str2) {
        if (str.equals("do_not_sell")) {
            return MetaDataUtils.isValidCCPAMetaData(str, str2);
        }
        return true;
    }

    private void loadAdInternal(String str, String str2, boolean z10, boolean z11, boolean z12) {
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            C1418f.a();
            hashMap.put("adm", C1418f.c(str2));
            C1418f.a();
            hashMap.putAll(C1418f.b(str2));
        }
        b adInstance = getAdInstance(str, z10, z11, z12);
        printInstanceExtraParams(hashMap);
        IronLog.ADAPTER_API.verbose("demandSourceName=" + adInstance.f26022c);
        IronSourceNetwork.loadAd(ContextProvider.getInstance().getCurrentActiveActivity(), adInstance, hashMap);
    }

    private void loadBannerInternal(ISBannerSize iSBannerSize, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.adapters.facebook.a.q("demandSourceName: ", demandSourceName, IronLog.ADAPTER_API);
        try {
            a convertBannerSize = convertBannerSize(ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSize);
            if (convertBannerSize == null) {
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                return;
            }
            HashMap<String, String> createBannerLoadParams = createBannerLoadParams(jSONObject, str);
            printInstanceExtraParams(createBannerLoadParams);
            IronSourceNetwork.loadAd(ContextProvider.getInstance().getCurrentActiveActivity(), createBannerAdInstance(demandSourceName, convertBannerSize, jSONObject), createBannerLoadParams);
        } catch (Exception e10) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + e10.getMessage()));
        }
    }

    private void printInstanceExtraParams(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            IronLog.ADAPTER_API.verbose("instance extra params:");
            for (String str : map.keySet()) {
                k.v(com.ironsource.adapters.facebook.a.l(str, ContainerUtils.KEY_VALUE_DELIMITER), map.get(str), IronLog.ADAPTER_API);
            }
        }
    }

    private void showAdInternal(b bVar, int i10) {
        int b10 = o.a().b(i10);
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, String.valueOf(b10));
        IronLog.ADAPTER_API.verbose("demandSourceName=" + bVar.f26022c + " showParams=" + hashMap);
        IronSourceNetwork.showAd(bVar, hashMap);
    }

    public static IronSourceAdapter startAdapter(String str) {
        return new IronSourceAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void destroyBanner(JSONObject jSONObject) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName + ": destroyBanner()");
        ArrayList<b> arrayList = this.mDemandSourceToBnAd.get(demandSourceName);
        if (arrayList != null) {
            try {
                Iterator<b> it = arrayList.iterator();
                while (it.hasNext()) {
                    IronSourceNetwork.destroyAd(it.next());
                }
                this.mDemandSourceToBnAd.remove(demandSourceName);
            } catch (Exception e10) {
                IronLog.ADAPTER_API.verbose("destroyBanner failed: " + e10.getMessage());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        if (L.a().f24855j != null) {
            IronSourceUtils.sendAutomationLog(getDemandSourceName(jSONObject) + ": earlyInit");
            initSDK(L.a().f24855j, jSONObject);
            return;
        }
        IronLog.ADAPTER_API.error("Appkey is null for early init");
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName);
        try {
            loadAdInternal(demandSourceName, null, false, false, true);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
            RewardedVideoSmashListener rewardedVideoSmashListener2 = this.mDemandSourceToRvSmash.get(demandSourceName);
            if (rewardedVideoSmashListener2 != null) {
                IronLog.ADAPTER_API.error("exception " + e10.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, e10.getMessage()));
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    public Map<String, Object> getBiddingData() {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("");
        HashMap hashMap = new HashMap();
        String token = IronSourceNetwork.getToken(ContextProvider.getInstance().getApplicationContext());
        if (token != null) {
            hashMap.put(IRONSOURCE_BIDDING_TOKEN_KEY, token);
        } else {
            ironLog.error("bidding token is null");
            hashMap.put(IRONSOURCE_BIDDING_TOKEN_KEY, "");
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        LoadWhileShowSupportState loadWhileShowSupportState = this.mLWSSupportState;
        if (jSONObject != null && jSONObject.optBoolean("isSupportedLWS")) {
            return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
        }
        return loadWhileShowSupportState;
    }

    @Override // com.ironsource.mediationsdk.sdk.j
    public void getOfferwallCredits() {
        IronLog.ADAPTER_API.verbose(getProviderName() + " getOfferwallCredits");
        try {
            IronSourceNetwork.getOfferWallCredits(this);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public JSONObject getPlayerBiddingData() {
        JSONObject jSONObject;
        IronLog.ADAPTER_API.verbose("");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = IronSourceNetwork.getRawToken(ContextProvider.getInstance().getApplicationContext());
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("getRawToken exception: " + e10.getLocalizedMessage());
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        IronLog.ADAPTER_API.error("Player's bidding token is null");
        return jSONObject2;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "7.2.7";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
        fetchRewardedVideoForAutomaticLoad(jSONObject, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        com.ironsource.adapters.facebook.a.q("demandSourceName: ", demandSourceName, IronLog.ADAPTER_API);
        initSDK(str, jSONObject);
        this.mDemandSourceToBNSmash.put(demandSourceName, bannerSmashListener);
        bannerSmashListener.onBannerInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.sdk.j
    public void initOfferwall(String str, String str2, JSONObject jSONObject) {
        initSDK(str, jSONObject);
        IronLog.ADAPTER_API.verbose(":initOfferwall");
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    IronSourceNetwork.initOfferWall(IronSourceAdapter.this.getOfferwallExtraParams(), IronSourceAdapter.this);
                } catch (Exception e10) {
                    IronLog.ADAPTER_API.error(IronSourceAdapter.this.getProviderName() + ":initOfferwall " + e10);
                    IronSourceAdapter.this.mOfferwallListener.a(false, ErrorBuilder.buildInitFailedError("Adapter initialization failure - " + IronSourceAdapter.this.getProviderName() + " - " + e10.getMessage(), IronSourceConstants.OFFERWALL_AD_UNIT));
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public boolean isInterstitialReady(JSONObject jSONObject) {
        b bVar = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        if (bVar != null && IronSourceNetwork.isAdAvailableForInstance(bVar)) {
            return true;
        }
        return false;
    }

    public boolean isOfferwallAvailable() {
        return true;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.k
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        b bVar = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        if (bVar != null && IronSourceNetwork.isAdAvailableForInstance(bVar)) {
            return true;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        if (ironSourceBannerLayout != null) {
            loadBannerInternal(ironSourceBannerLayout.getSize(), jSONObject, bannerSmashListener, str);
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBannerForDemandOnlyForBidding(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        if (iSDemandOnlyBannerLayout != null) {
            loadBannerInternal(iSDemandOnlyBannerLayout.getSize(), jSONObject, bannerSmashListener, str);
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), null, false, false, false);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, false, true, false);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("for bidding exception " + e10.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, false, true, true);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e10.getMessage()));
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForDemandOnly(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), null, true, false, true);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForDemandOnlyForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, true, true, true);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e10.getMessage()));
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onGetOWCreditsFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onGetOfferwallCreditsFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOWAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        f fVar = this.mOfferwallListener;
        if (fVar != null) {
            fVar.onOfferwallClosed();
        }
    }

    @Override // com.ironsource.sdk.j.e
    public boolean onOWAdCredited(int i10, int i11, boolean z10) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        f fVar = this.mOfferwallListener;
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
        IronLog.ADAPTER_CALLBACK.verbose("onOWShowSuccess(placementId:" + str + ")");
        f fVar = this.mOfferwallListener;
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
        f fVar = this.mOfferwallListener;
        if (fVar != null) {
            fVar.onOfferwallAvailable(true);
        }
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onPause(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onPause");
        IronSourceNetwork.onPause(activity);
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onResume(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onResume");
        IronSourceNetwork.onResume(activity);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.warning("unsupported method");
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z10) {
        String str;
        String str2;
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb2 = new StringBuilder("(");
        if (z10) {
            str = ep.Code;
        } else {
            str = ep.V;
        }
        sb2.append(str);
        sb2.append(")");
        ironLog.verbose(sb2.toString());
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        try {
            jSONObject.put(av.O, str2);
            IronSourceNetwork.updateMetadata(jSONObject);
        } catch (JSONException e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.j
    public void setInternalOfferwallListener(f fVar) {
        this.mOfferwallListener = fVar;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMediationSegment(String str) {
        mediationSegment = str;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, String str2) {
        if (!mDidInitSdk.get()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("key=" + str + ", value=" + str2);
            if (!isValidMetaData(str, str2)) {
                ironLog.verbose("MetaData not valid");
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

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean shouldBindBannerViewOnReload() {
        return true;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.g
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            showAdInternal(this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject)), 2);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(1001, e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.j
    public void showOfferwall(String str, JSONObject jSONObject) {
        IronLog.ADAPTER_API.verbose(getProviderName() + " showOfferWall");
        try {
            HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams();
            offerwallExtraParams.put("placementId", str);
            IronSourceNetwork.showOfferWall(ContextProvider.getInstance().getCurrentActiveActivity(), offerwallExtraParams);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.k
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), 1);
        } catch (Exception e10) {
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(1003, e10.getMessage()));
        }
    }
}
