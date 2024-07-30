package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.f;
import com.anythink.basead.e.c;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.k.d;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: a, reason: collision with root package name */
    j f12625a;

    /* renamed from: b, reason: collision with root package name */
    f f12626b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f12627c;

    public void destory() {
        f fVar = this.f12626b;
        if (fVar != null) {
            fVar.b();
            this.f12626b = null;
        }
    }

    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, ((j) map.get(g.k.f5110a)).f5654b);
        adxBidRequestInfo.fillAdAcceptType();
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    public Map<String, Object> getNetworkInfoMap() {
        return this.f12627c;
    }

    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    public String getNetworkPlacementId() {
        j jVar = this.f12625a;
        if (jVar != null) {
            return jVar.f5654b;
        }
        return "";
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
        f fVar = this.f12626b;
        if (fVar != null && fVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f12627c == null) {
            this.f12627c = b.a(this.f12626b);
        }
        return z10;
    }

    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.f12626b.a(new c() { // from class: com.anythink.network.adx.AdxATRewardedVideoAdapter.2
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                AdxATRewardedVideoAdapter adxATRewardedVideoAdapter = AdxATRewardedVideoAdapter.this;
                adxATRewardedVideoAdapter.f12627c = b.a(adxATRewardedVideoAdapter.f12626b);
                if (AdxATRewardedVideoAdapter.this.mLoadListener != null) {
                    AdxATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (AdxATRewardedVideoAdapter.this.mLoadListener != null) {
                    AdxATRewardedVideoAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (AdxATRewardedVideoAdapter.this.mLoadListener != null) {
                    AdxATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    public void show(Activity activity) {
        int g6 = d.g(activity);
        HashMap hashMap = new HashMap(1);
        hashMap.put("extra_scenario", this.mScenario);
        hashMap.put(com.anythink.basead.f.c.f3978j, Integer.valueOf(g6));
        f fVar = this.f12626b;
        fVar.a(new com.anythink.basead.e.f(fVar.d()) { // from class: com.anythink.network.adx.AdxATRewardedVideoAdapter.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i10) {
                com.anythink.core.common.e.e trackingInfo = AdxATRewardedVideoAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.x(i10);
                }
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.anythink.basead.e.f, com.anythink.basead.e.a
            public final void onAdShow() {
                super.onAdShow();
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z10) {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onDeeplinkCallback(z10);
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onRewarded() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onReward();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onShowFailed(e eVar) {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayEnd() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayStart() {
            }
        });
        f fVar2 = this.f12626b;
        if (fVar2 != null) {
            fVar2.a(activity, hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        int parseInt = (!map.containsKey("v_m") || (obj2 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj2.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj.toString());
        j jVar = (j) map.get(g.k.f5110a);
        this.f12625a = jVar;
        f fVar = new f(context, b.a.ADX_OFFER_REQUEST_TYPE, jVar);
        this.f12626b = fVar;
        fVar.a(new c.a().a(parseInt).b(parseInt2).a());
    }
}
