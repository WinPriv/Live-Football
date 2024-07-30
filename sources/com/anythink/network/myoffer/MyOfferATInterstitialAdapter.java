package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.e.c;
import com.anythink.basead.e.g;
import com.anythink.basead.f.d;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.s;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    j f12750a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f12751b;

    /* renamed from: d, reason: collision with root package name */
    private d f12753d;

    /* renamed from: c, reason: collision with root package name */
    private String f12752c = "";

    /* renamed from: e, reason: collision with root package name */
    private boolean f12754e = false;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        d dVar = this.f12753d;
        if (dVar != null) {
            dVar.a((g) null);
            this.f12753d = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f12751b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12752c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return com.anythink.core.common.k.g.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f12752c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.f5110a)) {
            this.f12750a = (j) map.get(g.k.f5110a);
        }
        if (map.containsKey(s.f6506b)) {
            this.f12754e = ((Boolean) map.get(s.f6506b)).booleanValue();
        }
        a(context);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        boolean z10;
        d dVar = this.f12753d;
        if (dVar != null && dVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f12751b == null) {
            this.f12751b = b.a(this.f12753d);
        }
        return z10;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f12752c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.f5110a)) {
            this.f12750a = (j) map.get(g.k.f5110a);
        }
        a(context);
        this.f12753d.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATInterstitialAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                MyOfferATInterstitialAdapter myOfferATInterstitialAdapter = MyOfferATInterstitialAdapter.this;
                myOfferATInterstitialAdapter.f12751b = b.a(myOfferATInterstitialAdapter.f12753d);
                if (((ATBaseAdAdapter) MyOfferATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) MyOfferATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (((ATBaseAdAdapter) MyOfferATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) MyOfferATInterstitialAdapter.this).mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }
        });
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            HashMap hashMap = new HashMap(1);
            int g6 = com.anythink.core.common.k.d.g(activity);
            hashMap.put(com.anythink.basead.f.c.f3976h, this.f12750a.f5656d);
            hashMap.put("extra_scenario", this.mScenario);
            hashMap.put(com.anythink.basead.f.c.f3978j, Integer.valueOf(g6));
            this.f12753d.a(new com.anythink.basead.e.g() { // from class: com.anythink.network.myoffer.MyOfferATInterstitialAdapter.2
                @Override // com.anythink.basead.e.a
                public final void onAdClick(int i10) {
                    com.anythink.core.common.e.e trackingInfo = MyOfferATInterstitialAdapter.this.getTrackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.x(i10);
                    }
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onAdClosed() {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onAdShow() {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onShowFailed(e eVar) {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(eVar.a(), eVar.b());
                    }
                }

                @Override // com.anythink.basead.e.g
                public final void onVideoAdPlayEnd() {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                    }
                }

                @Override // com.anythink.basead.e.g
                public final void onVideoAdPlayStart() {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
                    }
                }

                @Override // com.anythink.basead.e.g
                public final void onRewarded() {
                }

                @Override // com.anythink.basead.e.a
                public final void onDeeplinkCallback(boolean z10) {
                }
            });
            this.f12753d.a(activity, hashMap);
        }
    }

    private void a(Context context) {
        this.f12753d = new d(context, this.f12750a, this.f12752c, this.f12754e);
    }
}
