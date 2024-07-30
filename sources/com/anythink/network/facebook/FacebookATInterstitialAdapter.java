package com.anythink.network.facebook;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    InterstitialAd f12672a;

    /* renamed from: b, reason: collision with root package name */
    String f12673b;

    /* renamed from: c, reason: collision with root package name */
    String f12674c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f12675d;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        try {
            InterstitialAd interstitialAd = this.f12672a;
            if (interstitialAd != null) {
                interstitialAd.destroy();
                this.f12672a = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f12673b = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookATInitManager.getInstance().a(context, map, false, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return FacebookATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f12675d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return FacebookATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12673b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        InterstitialAd interstitialAd = this.f12672a;
        if (interstitialAd == null || !interstitialAd.isAdLoaded() || this.f12672a.isAdInvalidated()) {
            return false;
        }
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("unit_id")) {
            this.f12673b = (String) map.get("unit_id");
            FacebookATInitManager.getInstance().initSDK(context.getApplicationContext(), map);
            if (map.containsKey("payload")) {
                this.f12674c = map.get("payload").toString();
                HashMap hashMap = new HashMap();
                this.f12675d = hashMap;
                FacebookATInitManager.getInstance();
                hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f12674c));
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            InterstitialAd interstitialAd = new InterstitialAd(context.getApplicationContext(), this.f12673b);
            this.f12672a = interstitialAd;
            InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd.buildLoadAdConfig().withAdListener(anonymousClass1);
            if (!TextUtils.isEmpty(this.f12674c)) {
                withAdListener.withBid(this.f12674c);
            }
            this.f12672a.loadAd(withAdListener.build());
            return;
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", "facebook sdkkey is empty.");
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        return false;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        InterstitialAd interstitialAd = this.f12672a;
        if (interstitialAd != null) {
            interstitialAd.show();
        }
    }

    private void a(Context context, Map<String, Object> map) {
        if (map.containsKey("payload")) {
            this.f12674c = map.get("payload").toString();
            HashMap hashMap = new HashMap();
            this.f12675d = hashMap;
            FacebookATInitManager.getInstance();
            hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f12674c));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        InterstitialAd interstitialAd = new InterstitialAd(context.getApplicationContext(), this.f12673b);
        this.f12672a = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd.buildLoadAdConfig().withAdListener(anonymousClass1);
        if (!TextUtils.isEmpty(this.f12674c)) {
            withAdListener.withBid(this.f12674c);
        }
        this.f12672a.loadAd(withAdListener.build());
    }

    /* renamed from: com.anythink.network.facebook.FacebookATInterstitialAdapter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements InterstitialAdListener {
        public AnonymousClass1() {
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad2) {
            if (((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad2) {
            if (((ATBaseAdAdapter) FacebookATInterstitialAdapter.this).mLoadListener != null) {
                ((ATBaseAdAdapter) FacebookATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad2, AdError adError) {
            if (((ATBaseAdAdapter) FacebookATInterstitialAdapter.this).mLoadListener != null) {
                ATCustomLoadListener aTCustomLoadListener = ((ATBaseAdAdapter) FacebookATInterstitialAdapter.this).mLoadListener;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(adError.getErrorCode());
                aTCustomLoadListener.onAdLoadError(sb2.toString(), adError.getErrorMessage());
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public final void onInterstitialDismissed(Ad ad2) {
            if (((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad2) {
            if (((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public final void onInterstitialDisplayed(Ad ad2) {
        }
    }
}
