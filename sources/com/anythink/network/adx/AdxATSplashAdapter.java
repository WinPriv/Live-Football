package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.g;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    g f12630a;

    /* renamed from: b, reason: collision with root package name */
    j f12631b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f12632c;

    public void destory() {
        g gVar = this.f12630a;
        if (gVar != null) {
            gVar.b();
            this.f12630a = null;
        }
        this.f12631b = null;
    }

    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        String str;
        j jVar = (j) map.get(g.k.f5110a);
        if (jVar != null) {
            str = jVar.f5654b;
        } else {
            str = "";
        }
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, str);
        adxBidRequestInfo.fillSplashData();
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    public Map<String, Object> getNetworkInfoMap() {
        return this.f12632c;
    }

    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    public String getNetworkPlacementId() {
        j jVar = this.f12631b;
        if (jVar != null) {
            return jVar.f5654b;
        }
        return "";
    }

    public String getNetworkSDKVersion() {
        return "";
    }

    public boolean isAdReady() {
        boolean z10;
        com.anythink.basead.d.g gVar = this.f12630a;
        if (gVar != null && gVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f12632c == null) {
            this.f12632c = b.a(this.f12630a);
        }
        return z10;
    }

    public boolean isSupportCustomSkipView() {
        com.anythink.basead.d.g gVar = this.f12630a;
        if (gVar != null && gVar.e()) {
            return true;
        }
        return false;
    }

    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i10;
        int i11;
        Object obj;
        int parseInt;
        Object obj2;
        Object obj3;
        int i12 = 1;
        if (map.containsKey("orientation") && (obj3 = map.get("orientation")) != null) {
            i10 = Integer.parseInt(obj3.toString());
        } else {
            i10 = 1;
        }
        if (map.containsKey("countdown") && (obj2 = map.get("countdown")) != null) {
            i11 = Integer.parseInt(obj2.toString()) * 1000;
        } else {
            i11 = 5;
        }
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (parseInt = Integer.parseInt(obj.toString())) != 0) {
            i12 = parseInt == 1 ? 0 : parseInt;
        }
        j jVar = (j) map.get(g.k.f5110a);
        this.f12631b = jVar;
        com.anythink.basead.d.g gVar = new com.anythink.basead.d.g(context, b.a.ADX_OFFER_REQUEST_TYPE, jVar);
        this.f12630a = gVar;
        gVar.a(new c.a().d(i10).e(i11).f(i12).a());
        this.f12630a.a(new com.anythink.basead.e.c() { // from class: com.anythink.network.adx.AdxATSplashAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                AdxATSplashAdapter adxATSplashAdapter = AdxATSplashAdapter.this;
                adxATSplashAdapter.f12632c = com.anythink.basead.b.a(adxATSplashAdapter.f12630a);
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    public void show(Activity activity, ViewGroup viewGroup) {
        com.anythink.basead.d.g gVar = this.f12630a;
        if (gVar != null) {
            gVar.a(new com.anythink.basead.e.e(gVar.d()) { // from class: com.anythink.network.adx.AdxATSplashAdapter.2
                @Override // com.anythink.basead.e.a
                public final void onAdClick(int i10) {
                    com.anythink.core.common.e.e trackingInfo = AdxATSplashAdapter.this.getTrackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.x(i10);
                    }
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onAdClosed() {
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
                    }
                }

                @Override // com.anythink.basead.e.e, com.anythink.basead.e.a
                public final void onAdShow() {
                    super.onAdShow();
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdShow();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onDeeplinkCallback(boolean z10) {
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onDeeplinkCallback(z10);
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onShowFailed(e eVar) {
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, eVar.a(), eVar.b()));
                    }
                }
            });
            if (isCustomSkipView()) {
                this.f12630a.a();
            }
            this.f12630a.a(viewGroup);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        int parseInt;
        Object obj2;
        Object obj3;
        int i10 = 1;
        int parseInt2 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        int parseInt3 = (!map.containsKey("countdown") || (obj2 = map.get("countdown")) == null) ? 5 : Integer.parseInt(obj2.toString()) * 1000;
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (parseInt = Integer.parseInt(obj.toString())) != 0) {
            i10 = parseInt == 1 ? 0 : parseInt;
        }
        j jVar = (j) map.get(g.k.f5110a);
        this.f12631b = jVar;
        com.anythink.basead.d.g gVar = new com.anythink.basead.d.g(context, b.a.ADX_OFFER_REQUEST_TYPE, jVar);
        this.f12630a = gVar;
        gVar.a(new c.a().d(parseInt2).e(parseInt3).f(i10).a());
    }
}
