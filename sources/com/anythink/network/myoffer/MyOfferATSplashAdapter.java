package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.e.a;
import com.anythink.basead.e.c;
import com.anythink.basead.f.g;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    String f12768a;

    /* renamed from: b, reason: collision with root package name */
    g f12769b;

    /* renamed from: c, reason: collision with root package name */
    j f12770c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f12771d;

    public void destory() {
        g gVar = this.f12769b;
        if (gVar != null) {
            gVar.f();
            this.f12769b = null;
        }
        this.f12770c = null;
    }

    public Map<String, Object> getNetworkInfoMap() {
        return this.f12771d;
    }

    public String getNetworkName() {
        return "MyOffer";
    }

    public String getNetworkPlacementId() {
        return this.f12768a;
    }

    public String getNetworkSDKVersion() {
        return com.anythink.core.common.k.g.a();
    }

    public boolean isAdReady() {
        boolean z10;
        g gVar = this.f12769b;
        if (gVar != null && gVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f12771d == null) {
            this.f12771d = b.a(this.f12769b);
        }
        return z10;
    }

    public boolean isSupportCustomSkipView() {
        return true;
    }

    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f12768a = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.f5110a)) {
            this.f12770c = (j) map.get(g.k.f5110a);
        }
        com.anythink.basead.f.g gVar = new com.anythink.basead.f.g(context, this.f12770c, this.f12768a);
        this.f12769b = gVar;
        gVar.a(new AnonymousClass2());
        this.f12769b.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATSplashAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                if (MyOfferATSplashAdapter.this.mLoadListener != null) {
                    MyOfferATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (MyOfferATSplashAdapter.this.mLoadListener != null) {
                    MyOfferATSplashAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }
        });
    }

    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.f12769b != null) {
            if (isCustomSkipView()) {
                this.f12769b.b();
            }
            this.f12769b.a(viewGroup);
        }
    }

    private void a(Context context) {
        com.anythink.basead.f.g gVar = new com.anythink.basead.f.g(context, this.f12770c, this.f12768a);
        this.f12769b = gVar;
        gVar.a(new AnonymousClass2());
    }

    /* renamed from: com.anythink.network.myoffer.MyOfferATSplashAdapter$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClick(int i10) {
            com.anythink.core.common.e.e trackingInfo = MyOfferATSplashAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.x(i10);
            }
            if (MyOfferATSplashAdapter.this.mImpressionListener != null) {
                MyOfferATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClosed() {
            if (MyOfferATSplashAdapter.this.mImpressionListener != null) {
                MyOfferATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onAdShow() {
            if (MyOfferATSplashAdapter.this.mImpressionListener != null) {
                MyOfferATSplashAdapter.this.mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onShowFailed(e eVar) {
            if (MyOfferATSplashAdapter.this.mImpressionListener != null) {
                MyOfferATSplashAdapter.this.mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, eVar.a(), eVar.b()));
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onDeeplinkCallback(boolean z10) {
        }
    }
}
