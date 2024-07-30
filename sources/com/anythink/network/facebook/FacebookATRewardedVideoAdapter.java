package com.anythink.network.facebook;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookATRewardedVideoAdapter extends CustomRewardVideoAdapter {
    public static final String TAG = "FacebookATRewardedVideoAdapter";

    /* renamed from: d, reason: collision with root package name */
    private static final int f12684d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f12685e = 2;

    /* renamed from: a, reason: collision with root package name */
    String f12686a;

    /* renamed from: b, reason: collision with root package name */
    String f12687b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f12688c;
    private int f = 1;

    /* renamed from: g, reason: collision with root package name */
    private a f12689g;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: b, reason: collision with root package name */
        private RewardedVideoAd f12693b;

        /* renamed from: c, reason: collision with root package name */
        private RewardedInterstitialAd f12694c;

        /* renamed from: com.anythink.network.facebook.FacebookATRewardedVideoAdapter$a$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements RewardedInterstitialAdListener {
            public AnonymousClass1() {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad2) {
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad2) {
                if (FacebookATRewardedVideoAdapter.this.mLoadListener != null) {
                    FacebookATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad2, AdError adError) {
                if (FacebookATRewardedVideoAdapter.this.mLoadListener != null) {
                    ATCustomLoadListener aTCustomLoadListener = FacebookATRewardedVideoAdapter.this.mLoadListener;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(adError.getErrorCode());
                    aTCustomLoadListener.onAdLoadError(sb2.toString(), adError.getErrorMessage());
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad2) {
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.facebook.ads.RewardedInterstitialAdListener
            public final void onRewardedInterstitialClosed() {
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.facebook.ads.RewardedInterstitialAdListener
            public final void onRewardedInterstitialCompleted() {
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                }
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onReward();
                }
            }
        }

        /* renamed from: com.anythink.network.facebook.FacebookATRewardedVideoAdapter$a$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements S2SRewardedVideoAdListener {
            public AnonymousClass2() {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad2) {
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad2) {
                if (FacebookATRewardedVideoAdapter.this.mLoadListener != null) {
                    FacebookATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad2, AdError adError) {
                if (FacebookATRewardedVideoAdapter.this.mLoadListener != null) {
                    ATCustomLoadListener aTCustomLoadListener = FacebookATRewardedVideoAdapter.this.mLoadListener;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(adError.getErrorCode());
                    aTCustomLoadListener.onAdLoadError(sb2.toString(), adError.getErrorMessage());
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad2) {
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.facebook.ads.S2SRewardedVideoAdListener
            public final void onRewardServerFailed() {
                Log.e(FacebookATRewardedVideoAdapter.TAG, "Facebook: onRewardServerFailed() ");
            }

            @Override // com.facebook.ads.S2SRewardedVideoAdListener
            public final void onRewardServerSuccess() {
                Log.e(FacebookATRewardedVideoAdapter.TAG, "Facebook: onRewardServerSuccess() ");
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                }
                if (FacebookATRewardedVideoAdapter.this.mImpressionListener != null) {
                    FacebookATRewardedVideoAdapter.this.mImpressionListener.onReward();
                }
            }
        }

        private a() {
        }

        private void a(Context context) {
            this.f12694c = new RewardedInterstitialAd(context.getApplicationContext(), FacebookATRewardedVideoAdapter.this.f12686a);
            RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled = this.f12694c.buildLoadAdConfig().withAdListener(new AnonymousClass1()).withFailOnCacheFailureEnabled(true);
            if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.mUserData) && FacebookATRewardedVideoAdapter.this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter = FacebookATRewardedVideoAdapter.this;
                facebookATRewardedVideoAdapter.mUserData = facebookATRewardedVideoAdapter.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookATRewardedVideoAdapter.this.f12686a);
            }
            withFailOnCacheFailureEnabled.withRewardData(new RewardData(FacebookATRewardedVideoAdapter.this.mUserId, FacebookATRewardedVideoAdapter.this.mUserData));
            if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.f12687b)) {
                withFailOnCacheFailureEnabled.withBid(FacebookATRewardedVideoAdapter.this.f12687b);
            }
            this.f12694c.loadAd(withFailOnCacheFailureEnabled.build());
        }

        private void b(Context context) {
            this.f12693b = new RewardedVideoAd(context.getApplicationContext(), FacebookATRewardedVideoAdapter.this.f12686a);
            RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = this.f12693b.buildLoadAdConfig().withAdListener(new AnonymousClass2()).withFailOnCacheFailureEnabled(true);
            if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.mUserData) && FacebookATRewardedVideoAdapter.this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter = FacebookATRewardedVideoAdapter.this;
                facebookATRewardedVideoAdapter.mUserData = facebookATRewardedVideoAdapter.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookATRewardedVideoAdapter.this.f12686a);
            }
            withFailOnCacheFailureEnabled.withRewardData(new RewardData(FacebookATRewardedVideoAdapter.this.mUserId, FacebookATRewardedVideoAdapter.this.mUserData));
            if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.f12687b)) {
                withFailOnCacheFailureEnabled.withBid(FacebookATRewardedVideoAdapter.this.f12687b);
            }
            this.f12693b.loadAd(withFailOnCacheFailureEnabled.build());
        }

        public final void destroy() {
            RewardedVideoAd rewardedVideoAd = this.f12693b;
            if (rewardedVideoAd != null) {
                rewardedVideoAd.destroy();
                this.f12693b = null;
            }
            RewardedInterstitialAd rewardedInterstitialAd = this.f12694c;
            if (rewardedInterstitialAd != null) {
                rewardedInterstitialAd.destroy();
                this.f12694c = null;
            }
        }

        public final boolean isAdInvalidated() {
            RewardedInterstitialAd rewardedInterstitialAd;
            RewardedVideoAd rewardedVideoAd;
            if (FacebookATRewardedVideoAdapter.this.f == 1 && (rewardedVideoAd = this.f12693b) != null) {
                return rewardedVideoAd.isAdInvalidated();
            }
            if (FacebookATRewardedVideoAdapter.this.f == 2 && (rewardedInterstitialAd = this.f12694c) != null) {
                return rewardedInterstitialAd.isAdInvalidated();
            }
            return false;
        }

        public final boolean isAdLoaded() {
            RewardedInterstitialAd rewardedInterstitialAd;
            RewardedVideoAd rewardedVideoAd;
            if (FacebookATRewardedVideoAdapter.this.f == 1 && (rewardedVideoAd = this.f12693b) != null) {
                return rewardedVideoAd.isAdLoaded();
            }
            if (FacebookATRewardedVideoAdapter.this.f == 2 && (rewardedInterstitialAd = this.f12694c) != null) {
                return rewardedInterstitialAd.isAdLoaded();
            }
            return false;
        }

        public final void loadAd(Context context) {
            if (FacebookATRewardedVideoAdapter.this.f == 1) {
                this.f12693b = new RewardedVideoAd(context.getApplicationContext(), FacebookATRewardedVideoAdapter.this.f12686a);
                RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = this.f12693b.buildLoadAdConfig().withAdListener(new AnonymousClass2()).withFailOnCacheFailureEnabled(true);
                if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.mUserData) && FacebookATRewardedVideoAdapter.this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                    FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter = FacebookATRewardedVideoAdapter.this;
                    facebookATRewardedVideoAdapter.mUserData = facebookATRewardedVideoAdapter.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookATRewardedVideoAdapter.this.f12686a);
                }
                withFailOnCacheFailureEnabled.withRewardData(new RewardData(FacebookATRewardedVideoAdapter.this.mUserId, FacebookATRewardedVideoAdapter.this.mUserData));
                if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.f12687b)) {
                    withFailOnCacheFailureEnabled.withBid(FacebookATRewardedVideoAdapter.this.f12687b);
                }
                this.f12693b.loadAd(withFailOnCacheFailureEnabled.build());
                return;
            }
            this.f12694c = new RewardedInterstitialAd(context.getApplicationContext(), FacebookATRewardedVideoAdapter.this.f12686a);
            RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled2 = this.f12694c.buildLoadAdConfig().withAdListener(new AnonymousClass1()).withFailOnCacheFailureEnabled(true);
            if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.mUserData) && FacebookATRewardedVideoAdapter.this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter2 = FacebookATRewardedVideoAdapter.this;
                facebookATRewardedVideoAdapter2.mUserData = facebookATRewardedVideoAdapter2.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookATRewardedVideoAdapter.this.f12686a);
            }
            withFailOnCacheFailureEnabled2.withRewardData(new RewardData(FacebookATRewardedVideoAdapter.this.mUserId, FacebookATRewardedVideoAdapter.this.mUserData));
            if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.f12687b)) {
                withFailOnCacheFailureEnabled2.withBid(FacebookATRewardedVideoAdapter.this.f12687b);
            }
            this.f12694c.loadAd(withFailOnCacheFailureEnabled2.build());
        }

        public final void show() {
            RewardedInterstitialAd rewardedInterstitialAd;
            RewardedVideoAd rewardedVideoAd;
            if (FacebookATRewardedVideoAdapter.this.f == 1 && (rewardedVideoAd = this.f12693b) != null) {
                rewardedVideoAd.show();
            } else if (FacebookATRewardedVideoAdapter.this.f == 2 && (rewardedInterstitialAd = this.f12694c) != null) {
                rewardedInterstitialAd.show();
            }
        }

        public /* synthetic */ a(FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter, byte b10) {
            this();
        }
    }

    public void destory() {
        try {
            a aVar = this.f12689g;
            if (aVar != null) {
                aVar.destroy();
                this.f12689g = null;
            }
        } catch (Exception unused) {
        }
    }

    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f12686a = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookATInitManager.getInstance().a(context, map, false, aTBidRequestInfoListener);
    }

    public ATInitMediation getMediationInitManager() {
        return FacebookATInitManager.getInstance();
    }

    public Map<String, Object> getNetworkInfoMap() {
        return this.f12688c;
    }

    public String getNetworkName() {
        return FacebookATInitManager.getInstance().getNetworkName();
    }

    public String getNetworkPlacementId() {
        return this.f12686a;
    }

    public String getNetworkSDKVersion() {
        return FacebookATInitManager.getInstance().getNetworkVersion();
    }

    public boolean isAdReady() {
        a aVar = this.f12689g;
        if (aVar == null || !aVar.isAdLoaded() || this.f12689g.isAdInvalidated()) {
            return false;
        }
        return true;
    }

    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("unit_id")) {
            this.f12686a = (String) map.get("unit_id");
            if (map.containsKey("payload")) {
                this.f12687b = (String) map.get("payload");
                HashMap hashMap = new HashMap();
                this.f12688c = hashMap;
                FacebookATInitManager.getInstance();
                hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f12687b));
            }
            if (map.containsKey("unit_type")) {
                try {
                    Object obj = map.get("unit_type");
                    if (obj != null) {
                        this.f = Integer.parseInt(obj.toString());
                    }
                } catch (Exception unused) {
                }
            }
            FacebookATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.facebook.FacebookATRewardedVideoAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    if (FacebookATRewardedVideoAdapter.this.f12689g != null) {
                        FacebookATRewardedVideoAdapter.this.f12689g.destroy();
                    }
                    FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter = FacebookATRewardedVideoAdapter.this;
                    facebookATRewardedVideoAdapter.f12689g = new a(facebookATRewardedVideoAdapter, (byte) 0);
                    FacebookATRewardedVideoAdapter.this.f12689g.loadAd(context);
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                }
            });
            return;
        }
        if (this.mLoadListener != null) {
            this.mLoadListener.onAdLoadError("", "facebook sdkkey is empty.");
        }
    }

    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        return false;
    }

    public void show(Activity activity) {
        a aVar = this.f12689g;
        if (aVar != null) {
            aVar.show();
        }
    }
}
