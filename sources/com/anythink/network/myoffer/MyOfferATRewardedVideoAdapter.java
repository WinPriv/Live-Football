package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.e.c;
import com.anythink.basead.e.g;
import com.anythink.basead.f.f;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.d;
import com.anythink.core.common.s;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: a, reason: collision with root package name */
    j f12761a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f12762b;

    /* renamed from: d, reason: collision with root package name */
    private f f12764d;

    /* renamed from: c, reason: collision with root package name */
    private String f12763c = "";

    /* renamed from: e, reason: collision with root package name */
    private boolean f12765e = false;

    public void destory() {
        f fVar = this.f12764d;
        if (fVar != null) {
            fVar.a((g) null);
            this.f12764d = null;
        }
    }

    public Map<String, Object> getNetworkInfoMap() {
        return this.f12762b;
    }

    public String getNetworkName() {
        return "MyOffer";
    }

    public String getNetworkPlacementId() {
        return this.f12763c;
    }

    public String getNetworkSDKVersion() {
        return com.anythink.core.common.k.g.a();
    }

    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f12763c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.f5110a)) {
            this.f12761a = (j) map.get(g.k.f5110a);
        }
        if (map.containsKey(s.f6506b)) {
            this.f12765e = ((Boolean) map.get(s.f6506b)).booleanValue();
        }
        a(context);
        return true;
    }

    public boolean isAdReady() {
        boolean z10;
        f fVar = this.f12764d;
        if (fVar != null && fVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f12762b == null) {
            this.f12762b = b.a(this.f12764d);
        }
        return z10;
    }

    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f12763c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.f5110a)) {
            this.f12761a = (j) map.get(g.k.f5110a);
        }
        a(context);
        this.f12764d.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATRewardedVideoAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                MyOfferATRewardedVideoAdapter myOfferATRewardedVideoAdapter = MyOfferATRewardedVideoAdapter.this;
                myOfferATRewardedVideoAdapter.f12762b = b.a(myOfferATRewardedVideoAdapter.f12764d);
                if (MyOfferATRewardedVideoAdapter.this.mLoadListener != null) {
                    MyOfferATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (MyOfferATRewardedVideoAdapter.this.mLoadListener != null) {
                    MyOfferATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }
        });
    }

    public void show(Activity activity) {
        int g6 = d.g(activity);
        if (isAdReady()) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(com.anythink.basead.f.c.f3976h, this.f12761a.f5656d);
            hashMap.put("extra_scenario", this.mScenario);
            hashMap.put(com.anythink.basead.f.c.f3978j, Integer.valueOf(g6));
            this.f12764d.a(new com.anythink.basead.e.g() { // from class: com.anythink.network.myoffer.MyOfferATRewardedVideoAdapter.2
                @Override // com.anythink.basead.e.a
                public final void onAdClick(int i10) {
                    com.anythink.core.common.e.e trackingInfo = MyOfferATRewardedVideoAdapter.this.getTrackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.x(i10);
                    }
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onAdClosed() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onAdShow() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.e.g
                public final void onRewarded() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onReward();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onShowFailed(e eVar) {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(eVar.a(), eVar.b());
                    }
                }

                @Override // com.anythink.basead.e.g
                public final void onVideoAdPlayEnd() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.e.g
                public final void onVideoAdPlayStart() {
                }

                @Override // com.anythink.basead.e.a
                public final void onDeeplinkCallback(boolean z10) {
                }
            });
            this.f12764d.a(activity, hashMap);
        }
    }

    private void a(Context context) {
        this.f12764d = new f(context, this.f12761a, this.f12763c, this.f12765e);
    }
}
