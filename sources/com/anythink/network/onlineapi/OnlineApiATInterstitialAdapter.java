package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.d;
import com.anythink.basead.e.c;
import com.anythink.basead.e.g;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    j f12788a;

    /* renamed from: b, reason: collision with root package name */
    d f12789b;

    /* renamed from: c, reason: collision with root package name */
    String f12790c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f12791d;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        d dVar = this.f12789b;
        if (dVar != null) {
            dVar.b();
            this.f12789b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f12791d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12790c;
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
        d dVar = this.f12789b;
        if (dVar != null && dVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f12791d == null) {
            this.f12791d = b.a(this.f12789b);
        }
        return z10;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.f12789b.a(new c() { // from class: com.anythink.network.onlineapi.OnlineApiATInterstitialAdapter.2
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                OnlineApiATInterstitialAdapter onlineApiATInterstitialAdapter = OnlineApiATInterstitialAdapter.this;
                onlineApiATInterstitialAdapter.f12791d = b.a(onlineApiATInterstitialAdapter.f12789b);
                if (((ATBaseAdAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (((ATBaseAdAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener.onAdLoadError(eVar.a(), eVar.b());
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
        this.f12789b.a(new g() { // from class: com.anythink.network.onlineapi.OnlineApiATInterstitialAdapter.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i10) {
                com.anythink.core.common.e.e trackingInfo = OnlineApiATInterstitialAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.x(i10);
                }
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdShow() {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z10) {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onDeeplinkCallback(z10);
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onShowFailed(e eVar) {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayEnd() {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayStart() {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onRewarded() {
            }
        });
        d dVar = this.f12789b;
        if (dVar != null) {
            dVar.a(activity, hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        this.f12790c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int parseInt = (!map.containsKey("v_m") || (obj2 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj2.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj.toString());
        j jVar = (j) map.get(g.k.f5110a);
        this.f12788a = jVar;
        d dVar = new d(context, b.a.ONLINE_API_OFFER_REQUEST_TYPE, jVar);
        this.f12789b = dVar;
        dVar.a(new c.a().a(parseInt).b(parseInt2).a());
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_type");
        if (TextUtils.isEmpty(stringFromMap)) {
            return;
        }
        this.f12789b.a(stringFromMap);
    }
}
