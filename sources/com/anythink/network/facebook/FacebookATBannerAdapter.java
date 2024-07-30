package com.anythink.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.e.k;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    AdView f12645a;

    /* renamed from: c, reason: collision with root package name */
    String f12647c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f12648d;

    /* renamed from: e, reason: collision with root package name */
    private String f12649e = "";

    /* renamed from: b, reason: collision with root package name */
    String f12646b = "";

    /* renamed from: com.anythink.network.facebook.FacebookATBannerAdapter$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements AdListener {
        public AnonymousClass1() {
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad2) {
            if (((CustomBannerAdapter) FacebookATBannerAdapter.this).mImpressionEventListener != null) {
                ((CustomBannerAdapter) FacebookATBannerAdapter.this).mImpressionEventListener.onBannerAdClicked();
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad2) {
            FacebookATBannerAdapter facebookATBannerAdapter = FacebookATBannerAdapter.this;
            facebookATBannerAdapter.f12645a = (AdView) ad2;
            if (((ATBaseAdAdapter) facebookATBannerAdapter).mLoadListener != null) {
                ((ATBaseAdAdapter) FacebookATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad2, AdError adError) {
            if (((ATBaseAdAdapter) FacebookATBannerAdapter.this).mLoadListener != null) {
                ATCustomLoadListener aTCustomLoadListener = ((ATBaseAdAdapter) FacebookATBannerAdapter.this).mLoadListener;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(adError.getErrorCode());
                aTCustomLoadListener.onAdLoadError(sb2.toString(), adError.getErrorMessage());
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad2) {
            if (((CustomBannerAdapter) FacebookATBannerAdapter.this).mImpressionEventListener != null) {
                ((CustomBannerAdapter) FacebookATBannerAdapter.this).mImpressionEventListener.onBannerAdShow();
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        AdView adView = this.f12645a;
        if (adView != null) {
            adView.destroy();
            this.f12645a = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f12645a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f12649e = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookATInitManager.getInstance().a(context, map, true, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return FacebookATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f12648d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return FacebookATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12649e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        AdView adView;
        if (map.containsKey("unit_id")) {
            this.f12649e = (String) map.get("unit_id");
            FacebookATInitManager.getInstance().initSDK(context.getApplicationContext(), map);
            if (map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)) {
                this.f12646b = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE).toString();
            }
            if (map.containsKey("payload")) {
                this.f12647c = map.get("payload").toString();
                HashMap hashMap = new HashMap();
                this.f12648d = hashMap;
                FacebookATInitManager.getInstance();
                hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f12647c));
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            Context applicationContext = context.getApplicationContext();
            String str = this.f12646b;
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -559799608:
                    if (str.equals(k.f5668c)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -502541306:
                    if (str.equals("320x250")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1507809730:
                    if (str.equals(k.f5666a)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1507809854:
                    if (str.equals(k.f5667b)) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    adView = new AdView(applicationContext, this.f12649e, AdSize.RECTANGLE_HEIGHT_250);
                    break;
                case 2:
                    adView = new AdView(applicationContext, this.f12649e, AdSize.BANNER_HEIGHT_50);
                    break;
                case 3:
                    adView = new AdView(applicationContext, this.f12649e, AdSize.BANNER_HEIGHT_90);
                    break;
                default:
                    adView = new AdView(applicationContext, this.f12649e, AdSize.BANNER_HEIGHT_50);
                    break;
            }
            if (TextUtils.isEmpty(this.f12647c)) {
                adView.loadAd(adView.buildLoadAdConfig().withAdListener(anonymousClass1).build());
                return;
            } else {
                adView.loadAd(adView.buildLoadAdConfig().withBid(this.f12647c).withAdListener(anonymousClass1).build());
                return;
            }
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", "facebook unitid is empty.");
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        return false;
    }

    private void a(Context context, Map<String, Object> map) {
        AdView adView;
        if (map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)) {
            this.f12646b = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE).toString();
        }
        if (map.containsKey("payload")) {
            this.f12647c = map.get("payload").toString();
            HashMap hashMap = new HashMap();
            this.f12648d = hashMap;
            FacebookATInitManager.getInstance();
            hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f12647c));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        Context applicationContext = context.getApplicationContext();
        String str = this.f12646b;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -559799608:
                if (str.equals(k.f5668c)) {
                    c10 = 0;
                    break;
                }
                break;
            case -502541306:
                if (str.equals("320x250")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1507809730:
                if (str.equals(k.f5666a)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1507809854:
                if (str.equals(k.f5667b)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                adView = new AdView(applicationContext, this.f12649e, AdSize.RECTANGLE_HEIGHT_250);
                break;
            case 2:
                adView = new AdView(applicationContext, this.f12649e, AdSize.BANNER_HEIGHT_50);
                break;
            case 3:
                adView = new AdView(applicationContext, this.f12649e, AdSize.BANNER_HEIGHT_90);
                break;
            default:
                adView = new AdView(applicationContext, this.f12649e, AdSize.BANNER_HEIGHT_50);
                break;
        }
        if (TextUtils.isEmpty(this.f12647c)) {
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(anonymousClass1).build());
        } else {
            adView.loadAd(adView.buildLoadAdConfig().withBid(this.f12647c).withAdListener(anonymousClass1).build());
        }
    }
}
