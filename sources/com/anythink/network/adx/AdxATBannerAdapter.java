package com.anythink.network.adx;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.d.a;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.e.e;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    j f12605a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f12606b;

    /* renamed from: c, reason: collision with root package name */
    private a f12607c;

    /* renamed from: d, reason: collision with root package name */
    private View f12608d;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        this.f12608d = null;
        a aVar = this.f12607c;
        if (aVar != null) {
            aVar.a((com.anythink.basead.e.a) null);
            this.f12607c.b();
            this.f12607c = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f12608d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        String str;
        j jVar = (j) map.get(g.k.f5110a);
        if (jVar != null) {
            str = jVar.f5654b;
        } else {
            str = "";
        }
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, str);
        adxBidRequestInfo.fillBannerData(map);
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f12606b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        j jVar = this.f12605a;
        if (jVar != null) {
            return jVar.f5654b;
        }
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i10;
        String str;
        Object obj;
        Object obj2;
        int i11 = 0;
        if (map.containsKey("close_button") && (obj2 = map.get("close_button")) != null) {
            i10 = Integer.parseInt(obj2.toString());
        } else {
            i10 = 0;
        }
        if (map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE) && (obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)) != null) {
            str = obj.toString();
        } else {
            str = k.f5666a;
        }
        if (map2 != null && map2.containsKey(ATAdConst.KEY.AD_HEIGHT)) {
            try {
                i11 = (int) Double.parseDouble(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        j jVar = (j) map.get(g.k.f5110a);
        this.f12605a = jVar;
        a aVar = new a(context, b.a.ADX_OFFER_REQUEST_TYPE, jVar);
        this.f12607c = aVar;
        aVar.a(new c.a().c(i10).b(str).g(i11).a());
        this.f12607c.a(new com.anythink.basead.e.c() { // from class: com.anythink.network.adx.AdxATBannerAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                if (AdxATBannerAdapter.this.f12607c != null && ((ATBaseAdAdapter) AdxATBannerAdapter.this).mLoadListener != null) {
                    AdxATBannerAdapter adxATBannerAdapter = AdxATBannerAdapter.this;
                    adxATBannerAdapter.f12606b = com.anythink.basead.b.a(adxATBannerAdapter.f12607c);
                    AdxATBannerAdapter.this.f12607c.a(new e(AdxATBannerAdapter.this.f12607c.d()) { // from class: com.anythink.network.adx.AdxATBannerAdapter.1.1
                        @Override // com.anythink.basead.e.a
                        public final void onAdClick(int i12) {
                            com.anythink.core.common.e.e trackingInfo = AdxATBannerAdapter.this.getTrackingInfo();
                            if (trackingInfo != null) {
                                trackingInfo.x(i12);
                            }
                            if (((CustomBannerAdapter) AdxATBannerAdapter.this).mImpressionEventListener != null) {
                                ((CustomBannerAdapter) AdxATBannerAdapter.this).mImpressionEventListener.onBannerAdClicked();
                            }
                        }

                        @Override // com.anythink.basead.e.a
                        public final void onAdClosed() {
                            if (((CustomBannerAdapter) AdxATBannerAdapter.this).mImpressionEventListener != null) {
                                ((CustomBannerAdapter) AdxATBannerAdapter.this).mImpressionEventListener.onBannerAdClose();
                            }
                        }

                        @Override // com.anythink.basead.e.e, com.anythink.basead.e.a
                        public final void onAdShow() {
                            super.onAdShow();
                            if (((CustomBannerAdapter) AdxATBannerAdapter.this).mImpressionEventListener != null) {
                                ((CustomBannerAdapter) AdxATBannerAdapter.this).mImpressionEventListener.onBannerAdShow();
                            }
                        }

                        @Override // com.anythink.basead.e.a
                        public final void onDeeplinkCallback(boolean z10) {
                            if (((CustomBannerAdapter) AdxATBannerAdapter.this).mImpressionEventListener != null) {
                                ((CustomBannerAdapter) AdxATBannerAdapter.this).mImpressionEventListener.onDeeplinkCallback(z10);
                            }
                        }

                        @Override // com.anythink.basead.e.a
                        public final void onShowFailed(com.anythink.basead.c.e eVar) {
                        }
                    });
                    AdxATBannerAdapter adxATBannerAdapter2 = AdxATBannerAdapter.this;
                    adxATBannerAdapter2.f12608d = adxATBannerAdapter2.f12607c.a();
                    if (AdxATBannerAdapter.this.f12608d != null) {
                        ((ATBaseAdAdapter) AdxATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    } else {
                        ((ATBaseAdAdapter) AdxATBannerAdapter.this).mLoadListener.onAdLoadError("", "Adx bannerView = null");
                    }
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdAdapter) AdxATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) AdxATBannerAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(com.anythink.basead.c.e eVar) {
                if (((ATBaseAdAdapter) AdxATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) AdxATBannerAdapter.this).mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        Object obj2;
        int i10 = 0;
        int parseInt = (!map.containsKey("close_button") || (obj2 = map.get("close_button")) == null) ? 0 : Integer.parseInt(obj2.toString());
        String obj3 = (!map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE) || (obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)) == null) ? k.f5666a : obj.toString();
        if (map2 != null && map2.containsKey(ATAdConst.KEY.AD_HEIGHT)) {
            try {
                i10 = (int) Double.parseDouble(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        j jVar = (j) map.get(g.k.f5110a);
        this.f12605a = jVar;
        a aVar = new a(context, b.a.ADX_OFFER_REQUEST_TYPE, jVar);
        this.f12607c = aVar;
        aVar.a(new c.a().c(parseInt).b(obj3).g(i10).a());
    }
}
