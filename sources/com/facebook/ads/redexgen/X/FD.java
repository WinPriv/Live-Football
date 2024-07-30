package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class FD implements QV {
    public final C0888Fl A00;
    public final EnumC1155Qa A01;

    public FD(C0888Fl c0888Fl, EnumC1155Qa enumC1155Qa) {
        this.A00 = c0888Fl;
        this.A01 = enumC1155Qa;
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public void A3O(Map<QD, EnumC1155Qa> map, Map<FI, QN> map2) {
        map.put(this.A00, this.A01);
    }
}
