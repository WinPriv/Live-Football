package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class FE implements QV {
    public final QN A00;
    public final C4L A01;

    public FE(C4L c4l, QN qn) {
        this.A01 = c4l;
        this.A00 = qn;
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public void A3O(Map<QD, EnumC1155Qa> map, Map<FI, QN> map2) {
        map2.put(this.A01, this.A00);
    }
}
