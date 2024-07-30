package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.b;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.g;
import com.anythink.basead.e.a;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.e;
import com.anythink.core.common.e.j;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    g f12804a;

    /* renamed from: b, reason: collision with root package name */
    j f12805b;

    /* renamed from: c, reason: collision with root package name */
    String f12806c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f12807d;

    /* renamed from: com.anythink.network.onlineapi.OnlineApiATSplashAdapter$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClick(int i10) {
            e trackingInfo = OnlineApiATSplashAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.x(i10);
            }
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClosed() {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onAdShow() {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onDeeplinkCallback(boolean z10) {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onDeeplinkCallback(z10);
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onShowFailed(com.anythink.basead.c.e eVar) {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, eVar.a(), eVar.b()));
            }
        }
    }

    public void destory() {
        g gVar = this.f12804a;
        if (gVar != null) {
            gVar.b();
            this.f12804a = null;
        }
        this.f12805b = null;
    }

    public Map<String, Object> getNetworkInfoMap() {
        return this.f12807d;
    }

    public String getNetworkName() {
        return "";
    }

    public String getNetworkPlacementId() {
        return this.f12806c;
    }

    public String getNetworkSDKVersion() {
        return "";
    }

    public boolean isAdReady() {
        boolean z10;
        g gVar = this.f12804a;
        if (gVar != null && gVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f12807d == null) {
            this.f12807d = b.a(this.f12804a);
        }
        return z10;
    }

    public boolean isSupportCustomSkipView() {
        return true;
    }

    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str;
        int i10;
        int i11;
        Object obj;
        int parseInt;
        Object obj2;
        Object obj3;
        if (map.get("unit_id") != null) {
            str = map.get("unit_id").toString();
        } else {
            str = "";
        }
        this.f12806c = str;
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
        this.f12805b = jVar;
        com.anythink.basead.d.g gVar = new com.anythink.basead.d.g(context, b.a.ONLINE_API_OFFER_REQUEST_TYPE, jVar);
        this.f12804a = gVar;
        gVar.a(new c.a().d(i10).e(i11).f(i12).a());
        this.f12804a.a(new AnonymousClass2());
        this.f12804a.a(new com.anythink.basead.e.c() { // from class: com.anythink.network.onlineapi.OnlineApiATSplashAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                OnlineApiATSplashAdapter onlineApiATSplashAdapter = OnlineApiATSplashAdapter.this;
                onlineApiATSplashAdapter.f12807d = com.anythink.basead.b.a(onlineApiATSplashAdapter.f12804a);
                if (OnlineApiATSplashAdapter.this.mLoadListener != null) {
                    OnlineApiATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (OnlineApiATSplashAdapter.this.mLoadListener != null) {
                    OnlineApiATSplashAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(com.anythink.basead.c.e eVar) {
                if (OnlineApiATSplashAdapter.this.mLoadListener != null) {
                    OnlineApiATSplashAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.f12804a != null) {
            if (isCustomSkipView()) {
                this.f12804a.a();
            }
            this.f12804a.a(viewGroup);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        int parseInt;
        Object obj2;
        Object obj3;
        this.f12806c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i10 = 1;
        int parseInt2 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        int parseInt3 = (!map.containsKey("countdown") || (obj2 = map.get("countdown")) == null) ? 5 : Integer.parseInt(obj2.toString()) * 1000;
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (parseInt = Integer.parseInt(obj.toString())) != 0) {
            i10 = parseInt == 1 ? 0 : parseInt;
        }
        j jVar = (j) map.get(g.k.f5110a);
        this.f12805b = jVar;
        com.anythink.basead.d.g gVar = new com.anythink.basead.d.g(context, b.a.ONLINE_API_OFFER_REQUEST_TYPE, jVar);
        this.f12804a = gVar;
        gVar.a(new c.a().d(parseInt2).e(parseInt3).f(i10).a());
        this.f12804a.a(new AnonymousClass2());
    }
}
