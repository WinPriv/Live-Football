package com.anythink.network.vungle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.vungle.warren.AdConfig;
import com.vungle.warren.HeaderBiddingCallback;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import java.util.Map;

/* loaded from: classes.dex */
public class VungleATRewardedVideoAdapter extends CustomRewardVideoAdapter implements HeaderBiddingCallback {

    /* renamed from: a, reason: collision with root package name */
    String f12857a;

    /* renamed from: b, reason: collision with root package name */
    AdConfig f12858b;

    /* renamed from: d, reason: collision with root package name */
    private final String f12860d = "VungleATRewardedVideoAdapter";

    /* renamed from: c, reason: collision with root package name */
    String f12859c = "";

    /* renamed from: e, reason: collision with root package name */
    private final LoadAdCallback f12861e = new LoadAdCallback() { // from class: com.anythink.network.vungle.VungleATRewardedVideoAdapter.1
        @Override // com.vungle.warren.LoadAdCallback
        public final void onAdLoad(String str) {
            if (!TextUtils.isEmpty(VungleATRewardedVideoAdapter.this.f12859c)) {
                VungleATInitManager.getInstance().a(VungleATRewardedVideoAdapter.this.f12857a);
            }
            if (VungleATRewardedVideoAdapter.this.mLoadListener != null) {
                VungleATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.vungle.warren.LoadAdCallback
        public final void onError(String str, VungleException vungleException) {
            if (VungleATRewardedVideoAdapter.this.mLoadListener != null) {
                VungleATRewardedVideoAdapter.this.mLoadListener.onAdLoadError("", vungleException.toString());
            }
        }
    };
    private PlayAdCallback f = new PlayAdCallback() { // from class: com.anythink.network.vungle.VungleATRewardedVideoAdapter.2
        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdClick(String str) {
            if (VungleATRewardedVideoAdapter.this.mImpressionListener != null) {
                VungleATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdEnd(String str, boolean z10, boolean z11) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdRewarded(String str) {
            if (VungleATRewardedVideoAdapter.this.mImpressionListener != null) {
                VungleATRewardedVideoAdapter.this.mImpressionListener.onReward();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdStart(String str) {
            if (VungleATRewardedVideoAdapter.this.mImpressionListener != null) {
                VungleATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onError(String str, VungleException vungleException) {
            if (VungleATRewardedVideoAdapter.this.mImpressionListener != null) {
                VungleATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed("", vungleException.toString());
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdEnd(String str) {
            if (VungleATRewardedVideoAdapter.this.mImpressionListener != null) {
                VungleATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                VungleATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void creativeId(String str) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdLeftApplication(String str) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdViewed(String str) {
        }
    };

    public static /* synthetic */ void p(VungleATRewardedVideoAdapter vungleATRewardedVideoAdapter) {
        try {
            if (!TextUtils.isEmpty(vungleATRewardedVideoAdapter.f12859c)) {
                if (Vungle.canPlayAd(vungleATRewardedVideoAdapter.f12857a, vungleATRewardedVideoAdapter.f12859c)) {
                    if (vungleATRewardedVideoAdapter.mLoadListener != null) {
                        vungleATRewardedVideoAdapter.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        return;
                    }
                    return;
                } else {
                    VungleATInitManager.getInstance().a(vungleATRewardedVideoAdapter.f12857a, vungleATRewardedVideoAdapter);
                    Vungle.loadAd(vungleATRewardedVideoAdapter.f12857a, vungleATRewardedVideoAdapter.f12859c, vungleATRewardedVideoAdapter.f12858b, vungleATRewardedVideoAdapter.f12861e);
                    return;
                }
            }
            if (Vungle.canPlayAd(vungleATRewardedVideoAdapter.f12857a)) {
                if (vungleATRewardedVideoAdapter.mLoadListener != null) {
                    vungleATRewardedVideoAdapter.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            Vungle.loadAd(vungleATRewardedVideoAdapter.f12857a, vungleATRewardedVideoAdapter.f12858b, vungleATRewardedVideoAdapter.f12861e);
        } catch (Throwable th) {
            if (vungleATRewardedVideoAdapter.mLoadListener != null) {
                vungleATRewardedVideoAdapter.mLoadListener.onAdLoadError("", th.getMessage());
            }
        }
    }

    @Override // com.vungle.warren.HeaderBiddingCallback
    public void adAvailableForBidToken(String str, String str2) {
        if (this.mLoadListener != null) {
            this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
        }
    }

    public void destory() {
        this.f12858b = null;
        this.f = null;
    }

    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f12857a = (String) map.get("placement_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        VungleATInitManager.getInstance().a(context, map, aTBidRequestInfoListener);
    }

    public ATInitMediation getMediationInitManager() {
        return VungleATInitManager.getInstance();
    }

    public String getNetworkName() {
        return VungleATInitManager.getInstance().getNetworkName();
    }

    public String getNetworkPlacementId() {
        return this.f12857a;
    }

    public String getNetworkSDKVersion() {
        return VungleATInitManager.getInstance().getNetworkVersion();
    }

    public boolean isAdReady() {
        if (!TextUtils.isEmpty(this.f12859c)) {
            return Vungle.canPlayAd(this.f12857a, this.f12859c);
        }
        return Vungle.canPlayAd(this.f12857a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0069 -> B:18:0x006c). Please report as a decompilation issue!!! */
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("app_id");
        this.f12857a = (String) map.get("placement_id");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f12857a)) {
            if (map.containsKey("payload")) {
                this.f12859c = map.get("payload").toString();
            }
            AdConfig adConfig = new AdConfig();
            this.f12858b = adConfig;
            adConfig.setOrdinal(2);
            boolean z10 = false;
            try {
                if (map2.containsKey(ATAdConst.KEY.AD_ORIENTATION)) {
                    int parseInt = Integer.parseInt(map2.get(ATAdConst.KEY.AD_ORIENTATION).toString());
                    if (parseInt != 1) {
                        if (parseInt == 2) {
                            this.f12858b.setOrdinal(1);
                        }
                    } else {
                        this.f12858b.setOrdinal(0);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (map2.containsKey(ATAdConst.KEY.AD_SOUND)) {
                    int parseInt2 = Integer.parseInt(map2.get(ATAdConst.KEY.AD_SOUND).toString());
                    AdConfig adConfig2 = this.f12858b;
                    if (parseInt2 != 1) {
                        z10 = true;
                    }
                    adConfig2.setMuted(z10);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            VungleATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.vungle.VungleATRewardedVideoAdapter.3
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str2) {
                    if (VungleATRewardedVideoAdapter.this.mLoadListener != null) {
                        VungleATRewardedVideoAdapter.this.mLoadListener.onAdLoadError("", str2);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    VungleATRewardedVideoAdapter.p(VungleATRewardedVideoAdapter.this);
                }
            });
            return;
        }
        if (this.mLoadListener != null) {
            this.mLoadListener.onAdLoadError("", " appid & placementId is empty.");
        }
    }

    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        return VungleATInitManager.getInstance().setUserDataConsent(context, z10, z11);
    }

    public void show(Activity activity) {
        Vungle.setIncentivizedFields(this.mUserId, "", "", "", "");
        if (!TextUtils.isEmpty(this.f12859c)) {
            Vungle.playAd(this.f12857a, this.f12859c, this.f12858b, this.f);
        } else {
            Vungle.playAd(this.f12857a, this.f12858b, this.f);
        }
    }

    private void a() {
        try {
            if (!TextUtils.isEmpty(this.f12859c)) {
                if (Vungle.canPlayAd(this.f12857a, this.f12859c)) {
                    if (this.mLoadListener != null) {
                        this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        return;
                    }
                    return;
                } else {
                    VungleATInitManager.getInstance().a(this.f12857a, this);
                    Vungle.loadAd(this.f12857a, this.f12859c, this.f12858b, this.f12861e);
                    return;
                }
            }
            if (Vungle.canPlayAd(this.f12857a)) {
                if (this.mLoadListener != null) {
                    this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            Vungle.loadAd(this.f12857a, this.f12858b, this.f12861e);
        } catch (Throwable th) {
            if (this.mLoadListener != null) {
                this.mLoadListener.onAdLoadError("", th.getMessage());
            }
        }
    }

    @Override // com.vungle.warren.HeaderBiddingCallback
    public void onBidTokenAvailable(String str, String str2) {
    }
}
