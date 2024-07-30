package com.anythink.network.vungle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import com.vungle.warren.AdConfig;
import com.vungle.warren.HeaderBiddingCallback;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import java.util.Map;

/* loaded from: classes.dex */
public class VungleATSplashAdapter extends CustomSplashAdapter implements HeaderBiddingCallback {

    /* renamed from: a, reason: collision with root package name */
    String f12865a;

    /* renamed from: b, reason: collision with root package name */
    AdConfig f12866b;

    /* renamed from: d, reason: collision with root package name */
    private final String f12868d = "VungleATSplashAdapter";

    /* renamed from: c, reason: collision with root package name */
    String f12867c = "";

    /* renamed from: e, reason: collision with root package name */
    private LoadAdCallback f12869e = new LoadAdCallback() { // from class: com.anythink.network.vungle.VungleATSplashAdapter.1
        @Override // com.vungle.warren.LoadAdCallback
        public final void onAdLoad(String str) {
            if (!TextUtils.isEmpty(VungleATSplashAdapter.this.f12867c)) {
                VungleATInitManager.getInstance().a(VungleATSplashAdapter.this.f12865a);
            }
            if (VungleATSplashAdapter.this.mLoadListener != null) {
                VungleATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.vungle.warren.LoadAdCallback
        public final void onError(String str, VungleException vungleException) {
            if (VungleATSplashAdapter.this.mLoadListener != null) {
                VungleATSplashAdapter.this.mLoadListener.onAdLoadError("", vungleException.toString());
            }
        }
    };
    private final PlayAdCallback f = new PlayAdCallback() { // from class: com.anythink.network.vungle.VungleATSplashAdapter.2
        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdClick(String str) {
            if (VungleATSplashAdapter.this.mImpressionListener != null) {
                VungleATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdEnd(String str, boolean z10, boolean z11) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdStart(String str) {
            if (VungleATSplashAdapter.this.mImpressionListener != null) {
                VungleATSplashAdapter.this.mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onError(String str, VungleException vungleException) {
            VungleATSplashAdapter.k(VungleATSplashAdapter.this);
            if (VungleATSplashAdapter.this.mImpressionListener != null) {
                VungleATSplashAdapter.this.mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, "", vungleException.toString()));
                VungleATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdEnd(String str) {
            if (VungleATSplashAdapter.this.mImpressionListener != null) {
                VungleATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
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

    public static /* synthetic */ int k(VungleATSplashAdapter vungleATSplashAdapter) {
        vungleATSplashAdapter.mDismissType = 99;
        return 99;
    }

    public static /* synthetic */ void o(VungleATSplashAdapter vungleATSplashAdapter) {
        try {
            if (!TextUtils.isEmpty(vungleATSplashAdapter.f12867c)) {
                if (Vungle.canPlayAd(vungleATSplashAdapter.f12865a, vungleATSplashAdapter.f12867c)) {
                    if (vungleATSplashAdapter.mLoadListener != null) {
                        vungleATSplashAdapter.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        return;
                    }
                    return;
                } else {
                    VungleATInitManager.getInstance().a(vungleATSplashAdapter.f12865a, vungleATSplashAdapter);
                    Vungle.loadAd(vungleATSplashAdapter.f12865a, vungleATSplashAdapter.f12867c, vungleATSplashAdapter.f12866b, vungleATSplashAdapter.f12869e);
                    return;
                }
            }
            if (Vungle.canPlayAd(vungleATSplashAdapter.f12865a)) {
                if (vungleATSplashAdapter.mLoadListener != null) {
                    vungleATSplashAdapter.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            Vungle.loadAd(vungleATSplashAdapter.f12865a, vungleATSplashAdapter.f12866b, vungleATSplashAdapter.f12869e);
        } catch (Throwable th) {
            if (vungleATSplashAdapter.mLoadListener != null) {
                vungleATSplashAdapter.mLoadListener.onAdLoadError("", th.getMessage());
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
        this.f12869e = null;
        this.f12866b = null;
    }

    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f12865a = (String) map.get("placement_id");
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
        return this.f12865a;
    }

    public String getNetworkSDKVersion() {
        return VungleATInitManager.getInstance().getNetworkVersion();
    }

    public boolean isAdReady() {
        if (!TextUtils.isEmpty(this.f12867c)) {
            return Vungle.canPlayAd(this.f12865a, this.f12867c);
        }
        return Vungle.canPlayAd(this.f12865a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0066 -> B:19:0x0069). Please report as a decompilation issue!!! */
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("app_id");
        this.f12865a = (String) map.get("placement_id");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f12865a)) {
            if (map.containsKey("payload")) {
                this.f12867c = map.get("payload").toString();
            }
            this.f12866b = new AdConfig();
            boolean z10 = false;
            try {
                if (map2.containsKey(ATAdConst.KEY.AD_ORIENTATION)) {
                    int parseInt = Integer.parseInt(map2.get(ATAdConst.KEY.AD_ORIENTATION).toString());
                    if (parseInt != 1) {
                        if (parseInt == 2) {
                            this.f12866b.setOrdinal(1);
                        }
                    } else {
                        this.f12866b.setOrdinal(0);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (map2.containsKey(ATAdConst.KEY.AD_SOUND)) {
                    int parseInt2 = Integer.parseInt(map2.get(ATAdConst.KEY.AD_SOUND).toString());
                    AdConfig adConfig = this.f12866b;
                    if (parseInt2 != 1) {
                        z10 = true;
                    }
                    adConfig.setMuted(z10);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            VungleATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.vungle.VungleATSplashAdapter.3
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str2) {
                    if (VungleATSplashAdapter.this.mLoadListener != null) {
                        VungleATSplashAdapter.this.mLoadListener.onAdLoadError("", str2);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    VungleATSplashAdapter.o(VungleATSplashAdapter.this);
                }
            });
            return;
        }
        if (this.mLoadListener != null) {
            this.mLoadListener.onAdLoadError("", "vungle appid & placementId is empty.");
        }
    }

    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        return VungleATInitManager.getInstance().setUserDataConsent(context, z10, z11);
    }

    public void show(Activity activity, ViewGroup viewGroup) {
        if (!TextUtils.isEmpty(this.f12867c)) {
            Vungle.playAd(this.f12865a, this.f12867c, this.f12866b, this.f);
        } else {
            Vungle.playAd(this.f12865a, this.f12866b, this.f);
        }
    }

    private void a() {
        try {
            if (!TextUtils.isEmpty(this.f12867c)) {
                if (Vungle.canPlayAd(this.f12865a, this.f12867c)) {
                    if (this.mLoadListener != null) {
                        this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        return;
                    }
                    return;
                } else {
                    VungleATInitManager.getInstance().a(this.f12865a, this);
                    Vungle.loadAd(this.f12865a, this.f12867c, this.f12866b, this.f12869e);
                    return;
                }
            }
            if (Vungle.canPlayAd(this.f12865a)) {
                if (this.mLoadListener != null) {
                    this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            Vungle.loadAd(this.f12865a, this.f12866b, this.f12869e);
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
