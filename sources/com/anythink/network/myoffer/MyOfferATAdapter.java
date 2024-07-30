package com.anythink.network.myoffer;

import android.content.Context;
import com.anythink.basead.e.a;
import com.anythink.basead.e.c;
import com.anythink.basead.f.e;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.g;
import com.anythink.core.common.s;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    e f12737a;

    /* renamed from: b, reason: collision with root package name */
    j f12738b;

    /* renamed from: c, reason: collision with root package name */
    private String f12739c = "";

    /* renamed from: d, reason: collision with root package name */
    private boolean f12740d = false;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        e eVar = this.f12737a;
        if (eVar != null) {
            eVar.a((a) null);
            this.f12737a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public BaseAd getBaseAdObject(Context context) {
        e eVar = this.f12737a;
        if (eVar != null && eVar.a()) {
            return new MyOfferATNativeAd(context, this.f12737a);
        }
        return null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12739c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return g.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f12739c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.f5110a)) {
            this.f12738b = (j) map.get(g.k.f5110a);
        }
        if (map.containsKey(s.f6506b)) {
            this.f12740d = ((Boolean) map.get(s.f6506b)).booleanValue();
        }
        this.f12737a = new e(context, this.f12738b, this.f12739c, this.f12740d);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f12739c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.f5110a)) {
            this.f12738b = (j) map.get(g.k.f5110a);
        }
        this.f12737a = new e(context, this.f12738b, this.f12739c, this.f12740d);
        final Context applicationContext = context.getApplicationContext();
        this.f12737a.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                if (((ATBaseAdAdapter) MyOfferATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) MyOfferATAdapter.this).mLoadListener.onAdCacheLoaded(new MyOfferATNativeAd(applicationContext, MyOfferATAdapter.this.f12737a));
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(com.anythink.basead.c.e eVar) {
                if (((ATBaseAdAdapter) MyOfferATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) MyOfferATAdapter.this).mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }
        });
    }

    private void a(Context context) {
        this.f12737a = new e(context, this.f12738b, this.f12739c, this.f12740d);
    }
}
