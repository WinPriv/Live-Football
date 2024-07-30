package com.anythink.network.directly;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.d.d;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.i;
import com.anythink.network.adx.AdxATInterstitialAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class DirectlyATInterstitialAdapter extends AdxATInterstitialAdapter {

    /* renamed from: d, reason: collision with root package name */
    private int f12636d = 0;

    public void fixDirectlyInterstitial() {
        i d10;
        int i10;
        d dVar = this.f12613b;
        if (dVar == null || (d10 = dVar.d()) == null) {
            return;
        }
        if (this.f12636d == 0) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        d10.d(i10);
        aa aaVar = (aa) d10;
        if (aaVar.Y() == 5 && this.f12636d == 0) {
            aaVar.j(3);
        }
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "Directly";
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        if (map.containsKey("unit_type") && (obj = map.get("unit_type")) != null) {
            this.f12636d = Integer.parseInt(obj.toString());
        }
        super.loadCustomNetworkAd(context, map, map2);
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        fixDirectlyInterstitial();
        super.show(activity);
    }
}
