package com.anythink.network.onlineapi;

import android.content.Context;
import com.anythink.basead.d.b;
import com.anythink.basead.d.e;
import com.anythink.basead.d.h;
import com.anythink.basead.e.d;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    e f12774a;

    /* renamed from: b, reason: collision with root package name */
    j f12775b;

    /* renamed from: c, reason: collision with root package name */
    String f12776c;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        if (this.f12774a != null) {
            this.f12774a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f12776c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str;
        int i10;
        int i11;
        if (map.get("unit_id") != null) {
            str = map.get("unit_id").toString();
        } else {
            str = "";
        }
        this.f12776c = str;
        j jVar = (j) map.get(g.k.f5110a);
        this.f12775b = jVar;
        this.f12774a = new e(context, b.a.ONLINE_API_OFFER_REQUEST_TYPE, jVar);
        int i12 = -1;
        if (map2 != null) {
            try {
                i10 = Integer.parseInt(map2.get(ATAdConst.KEY.AD_WIDTH).toString());
            } catch (Throwable unused) {
                i10 = -1;
            }
            try {
                i12 = Integer.parseInt(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
            } catch (Throwable unused2) {
            }
            i11 = i12;
            i12 = i10;
        } else {
            i11 = -1;
        }
        final int i13 = context.getResources().getDisplayMetrics().widthPixels;
        final int i14 = context.getResources().getDisplayMetrics().heightPixels;
        if (i12 <= 0) {
            i12 = Math.min(i13, i14);
        }
        if (i11 <= 0) {
            i11 = (i12 * 3) / 4;
        }
        if (i12 <= i13) {
            i13 = i12;
        }
        if (i11 <= i14) {
            i14 = i11;
        }
        final Context applicationContext = context.getApplicationContext();
        this.f12774a.a(new d() { // from class: com.anythink.network.onlineapi.OnlineApiATAdapter.1
            @Override // com.anythink.basead.e.d
            public final void onNativeAdLoadError(com.anythink.basead.c.e eVar) {
                if (((ATBaseAdAdapter) OnlineApiATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) OnlineApiATAdapter.this).mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.d
            public final void onNativeAdLoaded(h... hVarArr) {
                OnlineApiATNativeAd[] onlineApiATNativeAdArr = new OnlineApiATNativeAd[hVarArr.length];
                for (int i15 = 0; i15 < hVarArr.length; i15++) {
                    hVarArr[i15].a(i13, i14);
                    onlineApiATNativeAdArr[i15] = new OnlineApiATNativeAd(applicationContext, hVarArr[i15]);
                }
                if (((ATBaseAdAdapter) OnlineApiATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) OnlineApiATAdapter.this).mLoadListener.onAdCacheLoaded(onlineApiATNativeAdArr);
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map) {
        this.f12776c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        j jVar = (j) map.get(g.k.f5110a);
        this.f12775b = jVar;
        this.f12774a = new e(context, b.a.ONLINE_API_OFFER_REQUEST_TYPE, jVar);
    }
}
