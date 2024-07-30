package com.anythink.network.vungle;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.vungle.warren.AdConfig;
import com.vungle.warren.BannerAdConfig;
import com.vungle.warren.Banners;
import com.vungle.warren.HeaderBiddingCallback;
import com.vungle.warren.LoadAdCallback;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public class VungleATBannerAdapter extends CustomBannerAdapter implements HeaderBiddingCallback {

    /* renamed from: a, reason: collision with root package name */
    String f12815a;

    /* renamed from: b, reason: collision with root package name */
    BannerAdConfig f12816b;

    /* renamed from: e, reason: collision with root package name */
    String f12819e;
    View f;

    /* renamed from: i, reason: collision with root package name */
    private final String f12822i = "VungleATBannerAdapter";

    /* renamed from: c, reason: collision with root package name */
    String f12817c = "";

    /* renamed from: d, reason: collision with root package name */
    String f12818d = "";

    /* renamed from: g, reason: collision with root package name */
    LoadAdCallback f12820g = new LoadAdCallback() { // from class: com.anythink.network.vungle.VungleATBannerAdapter.1
        @Override // com.vungle.warren.LoadAdCallback
        public final void onAdLoad(String str) {
            if (!TextUtils.isEmpty(VungleATBannerAdapter.this.f12819e)) {
                if (((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            VungleATBannerAdapter vungleATBannerAdapter = VungleATBannerAdapter.this;
            VungleBanner banner = Banners.getBanner(vungleATBannerAdapter.f12815a, vungleATBannerAdapter.f12816b, vungleATBannerAdapter.f12821h);
            VungleATBannerAdapter vungleATBannerAdapter2 = VungleATBannerAdapter.this;
            vungleATBannerAdapter2.f = banner;
            if (banner != null) {
                if (((ATBaseAdAdapter) vungleATBannerAdapter2).mLoadListener != null) {
                    ((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            } else if (((ATBaseAdAdapter) vungleATBannerAdapter2).mLoadListener != null) {
                ((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener.onAdLoadError("", "Load success but couldn't play banner");
            }
        }

        @Override // com.vungle.warren.LoadAdCallback
        public final void onError(String str, VungleException vungleException) {
            if (((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener.onAdLoadError("", vungleException.toString());
            }
        }
    };

    /* renamed from: h, reason: collision with root package name */
    PlayAdCallback f12821h = new PlayAdCallback() { // from class: com.anythink.network.vungle.VungleATBannerAdapter.2
        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdClick(String str) {
            if (((CustomBannerAdapter) VungleATBannerAdapter.this).mImpressionEventListener != null) {
                ((CustomBannerAdapter) VungleATBannerAdapter.this).mImpressionEventListener.onBannerAdClicked();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdEnd(String str) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdViewed(String str) {
            if (((CustomBannerAdapter) VungleATBannerAdapter.this).mImpressionEventListener != null) {
                ((CustomBannerAdapter) VungleATBannerAdapter.this).mImpressionEventListener.onBannerAdShow();
            }
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onAdEnd(String str, boolean z10, boolean z11) {
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
        public final void onAdStart(String str) {
        }

        @Override // com.vungle.warren.PlayAdCallback
        public final void onError(String str, VungleException vungleException) {
        }
    };

    public static /* synthetic */ void m(VungleATBannerAdapter vungleATBannerAdapter) {
        ATCustomLoadListener aTCustomLoadListener;
        if (!TextUtils.isEmpty(vungleATBannerAdapter.f12817c)) {
            String str = vungleATBannerAdapter.f12817c;
            str.getClass();
            if (!str.equals("1")) {
                if (!TextUtils.isEmpty(vungleATBannerAdapter.f12818d)) {
                    String str2 = vungleATBannerAdapter.f12818d;
                    str2.getClass();
                    char c10 = 65535;
                    switch (str2.hashCode()) {
                        case 50:
                            if (str2.equals("2")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 51:
                            if (str2.equals("3")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 52:
                            if (str2.equals("4")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            vungleATBannerAdapter.f12816b.setAdSize(AdConfig.AdSize.BANNER);
                            break;
                        case 1:
                            vungleATBannerAdapter.f12816b.setAdSize(AdConfig.AdSize.BANNER_SHORT);
                            break;
                        case 2:
                            vungleATBannerAdapter.f12816b.setAdSize(AdConfig.AdSize.BANNER_LEADERBOARD);
                            break;
                        default:
                            vungleATBannerAdapter.f12816b.setAdSize(AdConfig.AdSize.BANNER);
                            break;
                    }
                } else {
                    vungleATBannerAdapter.f12816b.setAdSize(AdConfig.AdSize.BANNER);
                }
            } else {
                vungleATBannerAdapter.f12816b.setAdSize(AdConfig.AdSize.VUNGLE_MREC);
            }
        }
        if (vungleATBannerAdapter.f12816b.getAdSize() == null) {
            vungleATBannerAdapter.f12816b.setAdSize(AdConfig.AdSize.BANNER);
        }
        if (!TextUtils.isEmpty(vungleATBannerAdapter.f12819e)) {
            if (Banners.canPlayAd(vungleATBannerAdapter.f12815a, vungleATBannerAdapter.f12819e, vungleATBannerAdapter.f12816b.getAdSize())) {
                ATCustomLoadListener aTCustomLoadListener2 = vungleATBannerAdapter.mLoadListener;
                if (aTCustomLoadListener2 != null) {
                    aTCustomLoadListener2.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            Banners.loadBanner(vungleATBannerAdapter.f12815a, vungleATBannerAdapter.f12819e, vungleATBannerAdapter.f12816b, vungleATBannerAdapter.f12820g);
            return;
        }
        if (Banners.canPlayAd(vungleATBannerAdapter.f12815a, vungleATBannerAdapter.f12816b.getAdSize())) {
            VungleBanner banner = Banners.getBanner(vungleATBannerAdapter.f12815a, vungleATBannerAdapter.f12816b, vungleATBannerAdapter.f12821h);
            vungleATBannerAdapter.f = banner;
            if (banner != null && (aTCustomLoadListener = vungleATBannerAdapter.mLoadListener) != null) {
                aTCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
                return;
            }
            return;
        }
        Banners.loadBanner(vungleATBannerAdapter.f12815a, vungleATBannerAdapter.f12816b, vungleATBannerAdapter.f12820g);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        View view = this.f;
        if (view instanceof VungleBanner) {
            ((VungleBanner) view).destroyAd();
        }
        this.f = null;
        this.f12821h = null;
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        if (this.f == null && !TextUtils.isEmpty(this.f12819e)) {
            WeakReference b10 = VungleATInitManager.getInstance().b(this.f12815a);
            if (b10 != null) {
                Object obj = b10.get();
                if (obj instanceof VungleBanner) {
                    ((VungleBanner) obj).destroyAd();
                }
            }
            VungleBanner banner = Banners.getBanner(this.f12815a, this.f12819e, this.f12816b, this.f12821h);
            this.f = banner;
            VungleATInitManager.getInstance().a(this.f12815a, new WeakReference(banner));
        }
        return this.f;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f12815a = (String) map.get("placement_id");
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
        return this.f12815a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return VungleATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter, com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        BannerAdConfig bannerAdConfig;
        if (Vungle.isInitialized() && !TextUtils.isEmpty(this.f12815a) && (bannerAdConfig = this.f12816b) != null) {
            if (bannerAdConfig.getAdSize() == null) {
                this.f12816b.setAdSize(AdConfig.AdSize.BANNER);
            }
            if (!TextUtils.isEmpty(this.f12819e)) {
                return Banners.canPlayAd(this.f12815a, this.f12819e, this.f12816b.getAdSize());
            }
            return Banners.canPlayAd(this.f12815a, this.f12816b.getAdSize());
        }
        return false;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("app_id");
        this.f12815a = (String) map.get("placement_id");
        if (map.containsKey("unit_type")) {
            this.f12817c = (String) map.get("unit_type");
        }
        if (map.containsKey("size_type")) {
            this.f12818d = (String) map.get("size_type");
        }
        if (map.containsKey("payload")) {
            this.f12819e = map.get("payload").toString();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f12815a)) {
            BannerAdConfig bannerAdConfig = new BannerAdConfig();
            this.f12816b = bannerAdConfig;
            bannerAdConfig.setMuted(true);
            VungleATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.vungle.VungleATBannerAdapter.3
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str2) {
                    if (((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener != null) {
                        ((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener.onAdLoadError("", str2);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    try {
                        VungleATBannerAdapter.m(VungleATBannerAdapter.this);
                    } catch (Throwable th) {
                        if (((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener != null) {
                            ((ATBaseAdAdapter) VungleATBannerAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                        }
                    }
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

    private void a() {
        ATCustomLoadListener aTCustomLoadListener;
        if (!TextUtils.isEmpty(this.f12817c)) {
            String str = this.f12817c;
            str.getClass();
            if (!str.equals("1")) {
                if (!TextUtils.isEmpty(this.f12818d)) {
                    String str2 = this.f12818d;
                    str2.getClass();
                    char c10 = 65535;
                    switch (str2.hashCode()) {
                        case 50:
                            if (str2.equals("2")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 51:
                            if (str2.equals("3")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 52:
                            if (str2.equals("4")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            this.f12816b.setAdSize(AdConfig.AdSize.BANNER);
                            break;
                        case 1:
                            this.f12816b.setAdSize(AdConfig.AdSize.BANNER_SHORT);
                            break;
                        case 2:
                            this.f12816b.setAdSize(AdConfig.AdSize.BANNER_LEADERBOARD);
                            break;
                        default:
                            this.f12816b.setAdSize(AdConfig.AdSize.BANNER);
                            break;
                    }
                } else {
                    this.f12816b.setAdSize(AdConfig.AdSize.BANNER);
                }
            } else {
                this.f12816b.setAdSize(AdConfig.AdSize.VUNGLE_MREC);
            }
        }
        if (this.f12816b.getAdSize() == null) {
            this.f12816b.setAdSize(AdConfig.AdSize.BANNER);
        }
        if (!TextUtils.isEmpty(this.f12819e)) {
            if (Banners.canPlayAd(this.f12815a, this.f12819e, this.f12816b.getAdSize())) {
                ATCustomLoadListener aTCustomLoadListener2 = this.mLoadListener;
                if (aTCustomLoadListener2 != null) {
                    aTCustomLoadListener2.onAdCacheLoaded(new BaseAd[0]);
                    return;
                }
                return;
            }
            Banners.loadBanner(this.f12815a, this.f12819e, this.f12816b, this.f12820g);
            return;
        }
        if (Banners.canPlayAd(this.f12815a, this.f12816b.getAdSize())) {
            VungleBanner banner = Banners.getBanner(this.f12815a, this.f12816b, this.f12821h);
            this.f = banner;
            if (banner == null || (aTCustomLoadListener = this.mLoadListener) == null) {
                return;
            }
            aTCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
            return;
        }
        Banners.loadBanner(this.f12815a, this.f12816b, this.f12820g);
    }

    @Override // com.vungle.warren.HeaderBiddingCallback
    public void adAvailableForBidToken(String str, String str2) {
    }

    @Override // com.vungle.warren.HeaderBiddingCallback
    public void onBidTokenAvailable(String str, String str2) {
    }
}
