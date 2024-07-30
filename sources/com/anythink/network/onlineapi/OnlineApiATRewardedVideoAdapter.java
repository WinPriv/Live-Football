package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.f;
import com.anythink.basead.e.c;
import com.anythink.basead.e.g;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.d;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: a, reason: collision with root package name */
    j f12798a;

    /* renamed from: b, reason: collision with root package name */
    f f12799b;

    /* renamed from: c, reason: collision with root package name */
    String f12800c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f12801d;

    public void destory() {
        f fVar = this.f12799b;
        if (fVar != null) {
            fVar.b();
            this.f12799b = null;
        }
    }

    public Map<String, Object> getNetworkInfoMap() {
        return this.f12801d;
    }

    public String getNetworkName() {
        return "";
    }

    public String getNetworkPlacementId() {
        return this.f12800c;
    }

    public String getNetworkSDKVersion() {
        return "";
    }

    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        return true;
    }

    public boolean isAdReady() {
        boolean z10;
        f fVar = this.f12799b;
        if (fVar != null && fVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f12801d == null) {
            this.f12801d = b.a(this.f12799b);
        }
        return z10;
    }

    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.f12799b.a(new c() { // from class: com.anythink.network.onlineapi.OnlineApiATRewardedVideoAdapter.2
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                OnlineApiATRewardedVideoAdapter onlineApiATRewardedVideoAdapter = OnlineApiATRewardedVideoAdapter.this;
                onlineApiATRewardedVideoAdapter.f12801d = b.a(onlineApiATRewardedVideoAdapter.f12799b);
                if (OnlineApiATRewardedVideoAdapter.this.mLoadListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (OnlineApiATRewardedVideoAdapter.this.mLoadListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (OnlineApiATRewardedVideoAdapter.this.mLoadListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    public void show(Activity activity) {
        int g6 = d.g(activity);
        HashMap hashMap = new HashMap(1);
        hashMap.put("extra_scenario", this.mScenario);
        hashMap.put(com.anythink.basead.f.c.f3978j, Integer.valueOf(g6));
        this.f12799b.a(new g() { // from class: com.anythink.network.onlineapi.OnlineApiATRewardedVideoAdapter.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i10) {
                com.anythink.core.common.e.e trackingInfo = OnlineApiATRewardedVideoAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.x(i10);
                }
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdShow() {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z10) {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onDeeplinkCallback(z10);
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onRewarded() {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onReward();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onShowFailed(e eVar) {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayEnd() {
                if (OnlineApiATRewardedVideoAdapter.this.mImpressionListener != null) {
                    OnlineApiATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayStart() {
            }
        });
        f fVar = this.f12799b;
        if (fVar != null) {
            fVar.a(activity, hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        this.f12800c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int parseInt = (!map.containsKey("v_m") || (obj2 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj2.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj.toString());
        j jVar = (j) map.get(g.k.f5110a);
        this.f12798a = jVar;
        f fVar = new f(context, b.a.ONLINE_API_OFFER_REQUEST_TYPE, jVar);
        this.f12799b = fVar;
        fVar.a(new c.a().a(parseInt).b(parseInt2).a());
    }
}
