package com.anythink.network.onlineapi;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.d.a;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    j f12781a;

    /* renamed from: b, reason: collision with root package name */
    String f12782b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f12783c;

    /* renamed from: d, reason: collision with root package name */
    private a f12784d;

    /* renamed from: e, reason: collision with root package name */
    private View f12785e;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        this.f12785e = null;
        a aVar = this.f12784d;
        if (aVar != null) {
            aVar.a((com.anythink.basead.e.a) null);
            this.f12784d.b();
            this.f12784d = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        a aVar;
        if (this.f12785e == null && (aVar = this.f12784d) != null && aVar.c()) {
            this.f12785e = this.f12784d.a();
        }
        if (this.f12783c == null) {
            this.f12783c = b.a(this.f12784d);
        }
        return this.f12785e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f12783c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12782b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str;
        int i10;
        String str2;
        Object obj;
        Object obj2;
        if (map.get("unit_id") != null) {
            str = map.get("unit_id").toString();
        } else {
            str = "";
        }
        this.f12782b = str;
        if (map.containsKey("close_button") && (obj2 = map.get("close_button")) != null) {
            i10 = Integer.parseInt(obj2.toString());
        } else {
            i10 = 0;
        }
        if (map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE) && (obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)) != null) {
            str2 = obj.toString();
        } else {
            str2 = k.f5666a;
        }
        j jVar = (j) map.get(g.k.f5110a);
        this.f12781a = jVar;
        a aVar = new a(context, b.a.ONLINE_API_OFFER_REQUEST_TYPE, jVar);
        this.f12784d = aVar;
        aVar.a(new c.a().c(i10).b(str2).a());
        this.f12784d.a(new AnonymousClass2());
        this.f12784d.a(new com.anythink.basead.e.c() { // from class: com.anythink.network.onlineapi.OnlineApiATBannerAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                OnlineApiATBannerAdapter onlineApiATBannerAdapter = OnlineApiATBannerAdapter.this;
                onlineApiATBannerAdapter.f12785e = onlineApiATBannerAdapter.f12784d.a();
                if (((ATBaseAdAdapter) OnlineApiATBannerAdapter.this).mLoadListener != null) {
                    if (OnlineApiATBannerAdapter.this.f12785e != null) {
                        ((ATBaseAdAdapter) OnlineApiATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    } else {
                        ((ATBaseAdAdapter) OnlineApiATBannerAdapter.this).mLoadListener.onAdLoadError("", "Online bannerView = null");
                    }
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdAdapter) OnlineApiATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) OnlineApiATBannerAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (((ATBaseAdAdapter) OnlineApiATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) OnlineApiATBannerAdapter.this).mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        this.f12782b = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int parseInt = (!map.containsKey("close_button") || (obj2 = map.get("close_button")) == null) ? 0 : Integer.parseInt(obj2.toString());
        String obj3 = (!map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE) || (obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)) == null) ? k.f5666a : obj.toString();
        j jVar = (j) map.get(g.k.f5110a);
        this.f12781a = jVar;
        a aVar = new a(context, b.a.ONLINE_API_OFFER_REQUEST_TYPE, jVar);
        this.f12784d = aVar;
        aVar.a(new c.a().c(parseInt).b(obj3).a());
        this.f12784d.a(new AnonymousClass2());
    }

    /* renamed from: com.anythink.network.onlineapi.OnlineApiATBannerAdapter$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements com.anythink.basead.e.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClick(int i10) {
            com.anythink.core.common.e.e trackingInfo = OnlineApiATBannerAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.x(i10);
            }
            if (((CustomBannerAdapter) OnlineApiATBannerAdapter.this).mImpressionEventListener != null) {
                ((CustomBannerAdapter) OnlineApiATBannerAdapter.this).mImpressionEventListener.onBannerAdClicked();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClosed() {
            if (((CustomBannerAdapter) OnlineApiATBannerAdapter.this).mImpressionEventListener != null) {
                ((CustomBannerAdapter) OnlineApiATBannerAdapter.this).mImpressionEventListener.onBannerAdClose();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onAdShow() {
            if (((CustomBannerAdapter) OnlineApiATBannerAdapter.this).mImpressionEventListener != null) {
                ((CustomBannerAdapter) OnlineApiATBannerAdapter.this).mImpressionEventListener.onBannerAdShow();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onDeeplinkCallback(boolean z10) {
            if (((CustomBannerAdapter) OnlineApiATBannerAdapter.this).mImpressionEventListener != null) {
                ((CustomBannerAdapter) OnlineApiATBannerAdapter.this).mImpressionEventListener.onDeeplinkCallback(z10);
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onShowFailed(e eVar) {
        }
    }
}
