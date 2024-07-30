package com.anythink.network.myoffer;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.c.e;
import com.anythink.basead.e.a;
import com.anythink.basead.e.c;
import com.anythink.basead.f.b;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.g;
import com.anythink.core.common.s;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    String f12743a;

    /* renamed from: b, reason: collision with root package name */
    j f12744b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f12745c;

    /* renamed from: d, reason: collision with root package name */
    private b f12746d;

    /* renamed from: e, reason: collision with root package name */
    private View f12747e;
    private boolean f = false;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        this.f12747e = null;
        b bVar = this.f12746d;
        if (bVar != null) {
            bVar.a((a) null);
            this.f12746d.c();
            this.f12746d = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        b bVar;
        if (this.f12747e == null && (bVar = this.f12746d) != null && bVar.a()) {
            this.f12747e = this.f12746d.b();
            if (this.f12745c == null) {
                this.f12745c = com.anythink.basead.b.a(this.f12746d);
            }
        }
        return this.f12747e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f12745c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12743a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return g.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f12743a = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.f5110a)) {
            this.f12744b = (j) map.get(g.k.f5110a);
        }
        if (map.containsKey(s.f6506b)) {
            this.f = ((Boolean) map.get(s.f6506b)).booleanValue();
        }
        a(context);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f12743a = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.f5110a)) {
            this.f12744b = (j) map.get(g.k.f5110a);
        }
        a(context);
        this.f12746d.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                MyOfferATBannerAdapter myOfferATBannerAdapter = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter.f12747e = myOfferATBannerAdapter.f12746d.b();
                MyOfferATBannerAdapter myOfferATBannerAdapter2 = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter2.f12745c = com.anythink.basead.b.a(myOfferATBannerAdapter2.f12746d);
                if (((ATBaseAdAdapter) MyOfferATBannerAdapter.this).mLoadListener != null) {
                    if (MyOfferATBannerAdapter.this.f12747e != null) {
                        ((ATBaseAdAdapter) MyOfferATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    } else {
                        ((ATBaseAdAdapter) MyOfferATBannerAdapter.this).mLoadListener.onAdLoadError("", "MyOffer bannerView = null");
                    }
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (((ATBaseAdAdapter) MyOfferATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) MyOfferATBannerAdapter.this).mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }
        });
    }

    private void a(Context context) {
        b bVar = new b(context, this.f12744b, this.f12743a, this.f);
        this.f12746d = bVar;
        bVar.a(new a() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.2
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i10) {
                com.anythink.core.common.e.e trackingInfo = MyOfferATBannerAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.x(i10);
                }
                if (((CustomBannerAdapter) MyOfferATBannerAdapter.this).mImpressionEventListener != null) {
                    ((CustomBannerAdapter) MyOfferATBannerAdapter.this).mImpressionEventListener.onBannerAdClicked();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                if (((CustomBannerAdapter) MyOfferATBannerAdapter.this).mImpressionEventListener != null) {
                    ((CustomBannerAdapter) MyOfferATBannerAdapter.this).mImpressionEventListener.onBannerAdClose();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdShow() {
                if (((CustomBannerAdapter) MyOfferATBannerAdapter.this).mImpressionEventListener != null) {
                    ((CustomBannerAdapter) MyOfferATBannerAdapter.this).mImpressionEventListener.onBannerAdShow();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z10) {
            }

            @Override // com.anythink.basead.e.a
            public final void onShowFailed(e eVar) {
            }
        });
    }
}
