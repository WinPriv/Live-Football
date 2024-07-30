package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class ZA extends AbstractRunnableC0997Ju {
    public final /* synthetic */ Z9 A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public ZA(Z9 z92, Map map, Map map2) {
        this.A00 = z92;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        AnonymousClass11 anonymousClass11;
        C1316Wj c1316Wj;
        AnonymousClass11 anonymousClass112;
        anonymousClass11 = this.A00.A01;
        if (!TextUtils.isEmpty(anonymousClass11.A0Y())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1316Wj = this.A00.A09;
            IT A08 = c1316Wj.A08();
            anonymousClass112 = this.A00.A01;
            A08.A9F(anonymousClass112.A0Y(), hashMap);
        }
    }
}
