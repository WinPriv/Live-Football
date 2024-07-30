package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.d;
import com.anythink.basead.e.c;
import com.anythink.basead.e.f;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    protected j f12612a;

    /* renamed from: b, reason: collision with root package name */
    protected d f12613b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f12614c;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        d dVar = this.f12613b;
        if (dVar != null) {
            dVar.b();
            this.f12613b = null;
        }
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
        adxBidRequestInfo.fillInterstitial(map);
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f12614c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        j jVar = this.f12612a;
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
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        boolean z10;
        d dVar = this.f12613b;
        if (dVar != null && dVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f12614c == null) {
            this.f12614c = b.a(this.f12613b);
        }
        return z10;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.f12613b.a(new c() { // from class: com.anythink.network.adx.AdxATInterstitialAdapter.2
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                AdxATInterstitialAdapter adxATInterstitialAdapter = AdxATInterstitialAdapter.this;
                adxATInterstitialAdapter.f12614c = b.a(adxATInterstitialAdapter.f12613b);
                if (((ATBaseAdAdapter) AdxATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) AdxATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdAdapter) AdxATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) AdxATInterstitialAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (((ATBaseAdAdapter) AdxATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) AdxATInterstitialAdapter.this).mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        int g6 = com.anythink.core.common.k.d.g(activity);
        HashMap hashMap = new HashMap(1);
        hashMap.put("extra_scenario", this.mScenario);
        hashMap.put(com.anythink.basead.f.c.f3978j, Integer.valueOf(g6));
        d dVar = this.f12613b;
        dVar.a(new f(dVar.d()) { // from class: com.anythink.network.adx.AdxATInterstitialAdapter.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i10) {
                com.anythink.core.common.e.e trackingInfo = AdxATInterstitialAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.x(i10);
                }
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.anythink.basead.e.f, com.anythink.basead.e.a
            public final void onAdShow() {
                super.onAdShow();
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z10) {
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onDeeplinkCallback(z10);
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onShowFailed(e eVar) {
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayEnd() {
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayStart() {
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onRewarded() {
            }
        });
        d dVar2 = this.f12613b;
        if (dVar2 != null) {
            dVar2.a(activity, hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        Object obj3;
        int parseInt = (!map.containsKey("v_m") || (obj3 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj3.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj2 = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj2.toString());
        j jVar = (j) map.get(g.k.f5110a);
        this.f12612a = jVar;
        this.f12613b = new d(context, b.a.ADX_OFFER_REQUEST_TYPE, jVar);
        this.f12613b.a(new c.a().a((!map.containsKey("inter_type") || (obj = map.get("inter_type")) == null) ? "1" : obj.toString()).a(parseInt).b(parseInt2).a());
    }
}
