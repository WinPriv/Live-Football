package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.AbstractC1414b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AbstractAdapter implements com.ironsource.mediationsdk.sdk.g, com.ironsource.mediationsdk.sdk.k {
    private static Boolean mAdapterDebug;
    protected BannerSmashListener mActiveBannerSmash;
    protected InterstitialSmashListener mActiveInterstitialSmash;
    protected RewardedVideoSmashListener mActiveRewardedVideoSmash;
    private String mPluginFrameworkVersion;
    private String mPluginType;
    private String mProviderName;
    protected LoadWhileShowSupportState mLWSSupportState = LoadWhileShowSupportState.NONE;
    private IronSourceLoggerManager mLoggerManager = IronSourceLoggerManager.getLogger();
    protected CopyOnWriteArrayList<RewardedVideoSmashListener> mAllRewardedVideoSmashes = new CopyOnWriteArrayList<>();
    protected CopyOnWriteArrayList<InterstitialSmashListener> mAllInterstitialSmashes = new CopyOnWriteArrayList<>();
    protected CopyOnWriteArrayList<BannerSmashListener> mAllBannerSmashes = new CopyOnWriteArrayList<>();
    protected ConcurrentHashMap<String, RewardedVideoSmashListener> mRewardedVideoPlacementToListenerMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, InterstitialSmashListener> mInterstitialPlacementToListenerMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, BannerSmashListener> mBannerPlacementToListenerMap = new ConcurrentHashMap<>();

    public AbstractAdapter(String str) {
        this.mProviderName = str;
    }

    public void addInterstitialListener(InterstitialSmashListener interstitialSmashListener) {
        this.mAllInterstitialSmashes.add(interstitialSmashListener);
    }

    public void addRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAllRewardedVideoSmashes.add(rewardedVideoSmashListener);
    }

    public void collectBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        Map<String, Object> bannerBiddingData = getBannerBiddingData(jSONObject, jSONObject2);
        if (bannerBiddingData != null) {
            biddingDataCallback.onSuccess(bannerBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void collectInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        Map<String, Object> interstitialBiddingData = getInterstitialBiddingData(jSONObject, jSONObject2);
        if (interstitialBiddingData != null) {
            biddingDataCallback.onSuccess(interstitialBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void collectRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2, BiddingDataCallback biddingDataCallback) {
        Map<String, Object> rewardedVideoBiddingData = getRewardedVideoBiddingData(jSONObject, jSONObject2);
        if (rewardedVideoBiddingData != null) {
            biddingDataCallback.onSuccess(rewardedVideoBiddingData);
        } else {
            biddingDataCallback.onFailure("bidding data map is null");
        }
    }

    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return null;
    }

    public abstract String getCoreSDKVersion();

    public String getDynamicUserId() {
        return L.a().f24861m;
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return null;
    }

    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        return this.mLWSSupportState;
    }

    public JSONObject getPlayerBiddingData() {
        return null;
    }

    public String getPluginFrameworkVersion() {
        return this.mPluginFrameworkVersion;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getProviderName() {
        return this.mProviderName;
    }

    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return null;
    }

    public abstract String getVersion();

    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
    }

    @Override // com.ironsource.mediationsdk.sdk.g
    public abstract /* synthetic */ void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);

    public void initRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        initAndLoadRewardedVideo(str, str2, jSONObject, jSONObject2, rewardedVideoSmashListener);
    }

    public void initRewardedVideoForBidding(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        initRewardedVideoWithCallback(str, str2, jSONObject, rewardedVideoSmashListener);
    }

    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "method not implemented"));
        }
    }

    public boolean isAdaptersDebugEnabled() {
        Boolean bool = mAdapterDebug;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.g
    public abstract /* synthetic */ boolean isInterstitialReady(JSONObject jSONObject);

    public abstract /* synthetic */ boolean isRewardedVideoAvailable(JSONObject jSONObject);

    public void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
    }

    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
    }

    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
    }

    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
    }

    public void postOnUIThread(Runnable runnable) {
        com.ironsource.environment.e.c.f24668a.b(runnable);
    }

    public void removeInterstitialListener(InterstitialSmashListener interstitialSmashListener) {
        this.mAllInterstitialSmashes.remove(interstitialSmashListener);
    }

    public void removeRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAllRewardedVideoSmashes.remove(rewardedVideoSmashListener);
    }

    public void setAdapterDebug(Boolean bool) {
        mAdapterDebug = bool;
    }

    public void setMetaData(String str, String str2) {
    }

    public void setPluginData(String str, String str2) {
        this.mPluginType = str;
        this.mPluginFrameworkVersion = str2;
    }

    public boolean shouldBindBannerViewOnReload() {
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.g
    public abstract /* synthetic */ void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener);

    public abstract /* synthetic */ void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener);

    public void updateRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAllRewardedVideoSmashes.clear();
        this.mAllRewardedVideoSmashes.add(rewardedVideoSmashListener);
    }

    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        fetchRewardedVideoForAutomaticLoad(jSONObject, rewardedVideoSmashListener);
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBannerBiddingData(jSONObject);
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getInterstitialBiddingData(jSONObject);
    }

    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getRewardedVideoBiddingData(jSONObject);
    }

    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        initAndLoadRewardedVideo(str, str2, jSONObject, rewardedVideoSmashListener);
    }

    public void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, JSONObject jSONObject2, BannerSmashListener bannerSmashListener) {
        loadBanner(ironSourceBannerLayout, jSONObject, bannerSmashListener);
    }

    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, JSONObject jSONObject2, BannerSmashListener bannerSmashListener, String str) {
        loadBannerForBidding(ironSourceBannerLayout, jSONObject, bannerSmashListener, str);
    }

    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        loadInterstitial(jSONObject, interstitialSmashListener);
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener, String str) {
        loadInterstitialForBidding(jSONObject, interstitialSmashListener, str);
    }

    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        loadRewardedVideoForBidding(jSONObject, rewardedVideoSmashListener, str);
    }

    public void setMetaData(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            setMetaData(str, it.next());
        }
    }

    public void addBannerListener(BannerSmashListener bannerSmashListener) {
    }

    public void destroyBanner(JSONObject jSONObject) {
    }

    public void removeBannerListener(BannerSmashListener bannerSmashListener) {
    }

    public void setAge(int i10) {
    }

    public void setConsent(boolean z10) {
    }

    public void setGender(String str) {
    }

    public void setLogListener(LogListener logListener) {
    }

    public void setMediationSegment(String str) {
    }

    public void loadRewardedVideoForDemandOnly(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
    }

    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
    }

    public void setMediationState(AbstractC1414b.a aVar, String str) {
    }

    public void earlyInit(String str, String str2, JSONObject jSONObject) {
    }

    public void loadRewardedVideoForDemandOnlyForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
    }

    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
    }

    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
    }

    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
    }

    public void loadBannerForDemandOnlyForBidding(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
    }
}
