package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.d.b;
import com.anythink.basead.d.e;
import com.anythink.basead.d.h;
import com.anythink.basead.e.d;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    e f12596a;

    /* renamed from: b, reason: collision with root package name */
    j f12597b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12598c;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        if (this.f12596a != null) {
            this.f12596a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        String str;
        j jVar = (j) map.get(g.k.f5110a);
        if (jVar != null) {
            str = jVar.f5654b;
        } else {
            str = "";
        }
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, str);
        boolean equals = TextUtils.equals("1", ATInitMediation.getStringFromMap(map, "layout_type"));
        this.f12598c = equals;
        if (equals) {
            adxBidRequestInfo.fillAdAcceptType();
        }
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        j jVar = this.f12597b;
        if (jVar != null) {
            return jVar.f5654b;
        }
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i10;
        int i11;
        final int i12;
        final int i13;
        j jVar = (j) map.get(g.k.f5110a);
        this.f12597b = jVar;
        this.f12596a = new e(context, b.a.ADX_OFFER_REQUEST_TYPE, jVar);
        this.f12598c = TextUtils.equals("1", ATInitMediation.getStringFromMap(map, "layout_type"));
        final boolean equals = TextUtils.equals("0", ATInitMediation.getStringFromMap(map, "close_button", "0"));
        final boolean equals2 = TextUtils.equals("0", ATInitMediation.getStringFromMap(map, "v_m", "0"));
        final String stringFromMap = ATInitMediation.getStringFromMap(map, "video_autoplay", "1");
        if (map2 != null) {
            i10 = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_WIDTH);
            i11 = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_HEIGHT);
        } else {
            i10 = -1;
            i11 = -1;
        }
        int i14 = context.getResources().getDisplayMetrics().widthPixels;
        int i15 = context.getResources().getDisplayMetrics().heightPixels;
        if (i10 <= 0) {
            i10 = Math.min(i14, i15);
        }
        if (i11 <= 0) {
            i11 = (i10 * 3) / 4;
        }
        if (i10 > i14) {
            i12 = i14;
        } else {
            i12 = i10;
        }
        if (i11 > i15) {
            i13 = i15;
        } else {
            i13 = i11;
        }
        final Context applicationContext = context.getApplicationContext();
        this.f12596a.a(new d() { // from class: com.anythink.network.adx.AdxATAdapter.1
            @Override // com.anythink.basead.e.d
            public final void onNativeAdLoadError(com.anythink.basead.c.e eVar) {
                if (((ATBaseAdAdapter) AdxATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) AdxATAdapter.this).mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.d
            public final void onNativeAdLoaded(h... hVarArr) {
                AdxATNativeAd[] adxATNativeAdArr = new AdxATNativeAd[hVarArr.length];
                for (int i16 = 0; i16 < hVarArr.length; i16++) {
                    h hVar = hVarArr[i16];
                    hVar.a(i12, i13);
                    hVar.a(equals2);
                    hVar.a(stringFromMap);
                    adxATNativeAdArr[i16] = new AdxATNativeAd(applicationContext, hVar, AdxATAdapter.this.f12598c, equals);
                }
                if (((ATBaseAdAdapter) AdxATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdAdapter) AdxATAdapter.this).mLoadListener.onAdCacheLoaded(adxATNativeAdArr);
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map) {
        j jVar = (j) map.get(g.k.f5110a);
        this.f12597b = jVar;
        this.f12596a = new e(context, b.a.ADX_OFFER_REQUEST_TYPE, jVar);
    }
}
