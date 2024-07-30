package com.anythink.network.vungle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.vungle.warren.AdConfig;
import com.vungle.warren.HeaderBiddingCallback;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import java.util.Map;

/* loaded from: classes.dex */
public class VungleATInterstitialAdapter extends CustomInterstitialAdapter implements HeaderBiddingCallback {

    /* renamed from: a, reason: collision with root package name */
    String f12842a;

    /* renamed from: b, reason: collision with root package name */
    AdConfig f12843b;

    /* renamed from: d, reason: collision with root package name */
    private final String f12845d = "VungleATInterstitialAdapter";

    /* renamed from: c, reason: collision with root package name */
    String f12844c = "";

    /* renamed from: e, reason: collision with root package name */
    private LoadAdCallback f12846e = new LoadAdCallback() { // from class: com.anythink.network.vungle.VungleATInterstitialAdapter.1
        @Override // com.vungle.warren.LoadAdCallback
        public final void onAdLoad(String str) {
            if (!TextUtils.isEmpty(VungleATInterstitialAdapter.this.f12844c)) {
                VungleATInitManager.getInstance().a(VungleATInterstitialAdapter.this.f12842a);
            }
            if (((ATBaseAdAdapter) VungleATInterstitialAdapter.this).mLoadListener != null) {
                ((ATBaseAdAdapter) VungleATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.vungle.warren.LoadAdCallback
        public final void onError(String str, VungleException vungleException) {
            if (((ATBaseAdAdapter) VungleATInterstitialAdapter.this).mLoadListener != null) {
                ((ATBaseAdAdapter) VungleATInterstitialAdapter.this).mLoadListener.onAdLoadError("", vungleException.toString());
            }
        }
    };
    private final PlayAdCallback f = new PlayAdCallback() { // from class: com.anythink.network.vungle.VungleATInterstitialAdapter.2
        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdClick(String str) {
            if (((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdEnd(String str, boolean z10, boolean z11) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdStart(String str) {
            if (((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                ((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onError(String str, VungleException vungleException) {
            if (((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError("", vungleException.toString());
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdEnd(String str) {
            if (((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                ((CustomInterstitialAdapter) VungleATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void creativeId(String str) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdLeftApplication(String str) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdRewarded(String str) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdViewed(String str) {
        }
    };

    public static /* synthetic */ void o(VungleATInterstitialAdapter vungleATInterstitialAdapter) {
        try {
            if (!TextUtils.isEmpty(vungleATInterstitialAdapter.f12844c)) {
                if (Vungle.canPlayAd(vungleATInterstitialAdapter.f12842a, vungleATInterstitialAdapter.f12844c)) {
                    ATCustomLoadListener aTCustomLoadListener = vungleATInterstitialAdapter.mLoadListener;
                    if (aTCustomLoadListener != null) {
                        aTCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        return;
                    }
                    return;
                }
                VungleATInitManager.getInstance().a(vungleATInterstitialAdapter.f12842a, vungleATInterstitialAdapter);
                Vungle.loadAd(vungleATInterstitialAdapter.f12842a, vungleATInterstitialAdapter.f12844c, vungleATInterstitialAdapter.f12843b, vungleATInterstitialAdapter.f12846e);
                return;
            }
            if (Vungle.canPlayAd(vungleATInterstitialAdapter.f12842a)) {
                ATCustomLoadListener aTCustomLoadListener2 = vungleATInterstitialAdapter.mLoadListener;
                if (aTCustomLoadListener2 != null) {
                    aTCustomLoadListener2.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            Vungle.loadAd(vungleATInterstitialAdapter.f12842a, vungleATInterstitialAdapter.f12843b, vungleATInterstitialAdapter.f12846e);
        } catch (Throwable th) {
            ATCustomLoadListener aTCustomLoadListener3 = vungleATInterstitialAdapter.mLoadListener;
            if (aTCustomLoadListener3 != null) {
                aTCustomLoadListener3.onAdLoadError("", th.getMessage());
            }
        }
    }

    @Override // com.vungle.warren.HeaderBiddingCallback
    public void adAvailableForBidToken(String str, String str2) {
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        this.f12846e = null;
        this.f12843b = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f12842a = (String) map.get("placement_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        VungleATInitManager.getInstance().a(context, map, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return VungleATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return VungleATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12842a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return VungleATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        if (!TextUtils.isEmpty(this.f12844c)) {
            return Vungle.canPlayAd(this.f12842a, this.f12844c);
        }
        return Vungle.canPlayAd(this.f12842a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0066 -> B:19:0x0069). Please report as a decompilation issue!!! */
    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("app_id");
        this.f12842a = (String) map.get("placement_id");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f12842a)) {
            if (map.containsKey("payload")) {
                this.f12844c = map.get("payload").toString();
            }
            this.f12843b = new AdConfig();
            boolean z10 = false;
            try {
                if (map2.containsKey(ATAdConst.KEY.AD_ORIENTATION)) {
                    int parseInt = Integer.parseInt(map2.get(ATAdConst.KEY.AD_ORIENTATION).toString());
                    if (parseInt != 1) {
                        if (parseInt == 2) {
                            this.f12843b.setOrdinal(1);
                        }
                    } else {
                        this.f12843b.setOrdinal(0);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (map2.containsKey(ATAdConst.KEY.AD_SOUND)) {
                    int parseInt2 = Integer.parseInt(map2.get(ATAdConst.KEY.AD_SOUND).toString());
                    AdConfig adConfig = this.f12843b;
                    if (parseInt2 != 1) {
                        z10 = true;
                    }
                    adConfig.setMuted(z10);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            VungleATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.vungle.VungleATInterstitialAdapter.3
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str2) {
                    if (((ATBaseAdAdapter) VungleATInterstitialAdapter.this).mLoadListener != null) {
                        ((ATBaseAdAdapter) VungleATInterstitialAdapter.this).mLoadListener.onAdLoadError("", str2);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    VungleATInterstitialAdapter.o(VungleATInterstitialAdapter.this);
                }
            });
            return;
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", "vungle appid & placementId is empty.");
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        return VungleATInitManager.getInstance().setUserDataConsent(context, z10, z11);
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (!TextUtils.isEmpty(this.f12844c)) {
            Vungle.playAd(this.f12842a, this.f12844c, this.f12843b, this.f);
        } else {
            Vungle.playAd(this.f12842a, this.f12843b, this.f);
        }
    }

    private void a() {
        try {
            if (!TextUtils.isEmpty(this.f12844c)) {
                if (Vungle.canPlayAd(this.f12842a, this.f12844c)) {
                    ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
                    if (aTCustomLoadListener != null) {
                        aTCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        return;
                    }
                    return;
                }
                VungleATInitManager.getInstance().a(this.f12842a, this);
                Vungle.loadAd(this.f12842a, this.f12844c, this.f12843b, this.f12846e);
                return;
            }
            if (Vungle.canPlayAd(this.f12842a)) {
                ATCustomLoadListener aTCustomLoadListener2 = this.mLoadListener;
                if (aTCustomLoadListener2 != null) {
                    aTCustomLoadListener2.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            Vungle.loadAd(this.f12842a, this.f12843b, this.f12846e);
        } catch (Throwable th) {
            ATCustomLoadListener aTCustomLoadListener3 = this.mLoadListener;
            if (aTCustomLoadListener3 != null) {
                aTCustomLoadListener3.onAdLoadError("", th.getMessage());
            }
        }
    }

    @Override // com.vungle.warren.HeaderBiddingCallback
    public void onBidTokenAvailable(String str, String str2) {
    }
}
