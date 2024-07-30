package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class RT extends AbstractC1136Ph {
    public final /* synthetic */ C07278p A00;

    public RT(C07278p c07278p) {
        this.A00 = c07278p;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1136Ph
    public final void A02() {
        L6 l62;
        L6 l63;
        C1137Pi c1137Pi;
        L6 l64;
        IT it;
        AnonymousClass18 anonymousClass18;
        C1316Wj c1316Wj;
        AnonymousClass18 anonymousClass182;
        InterfaceC1029Lc interfaceC1029Lc;
        InterfaceC1029Lc interfaceC1029Lc2;
        M4 m42;
        l62 = this.A00.A0B;
        if (!l62.A07()) {
            l63 = this.A00.A0B;
            l63.A05();
            N2 n22 = new N2();
            c1137Pi = this.A00.A0H;
            N2 A03 = n22.A03(c1137Pi);
            l64 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(l64).A05();
            it = this.A00.A08;
            anonymousClass18 = this.A00.A06;
            it.A8z(anonymousClass18.A0U(), A05);
            c1316Wj = this.A00.A07;
            c1316Wj.A0D().A2Y();
            anonymousClass182 = this.A00.A06;
            AnonymousClass29.A00(anonymousClass182.A0W());
            interfaceC1029Lc = this.A00.A0C;
            if (interfaceC1029Lc != null) {
                interfaceC1029Lc2 = this.A00.A0C;
                m42 = this.A00.A0D;
                interfaceC1029Lc2.A3s(m42.A6k());
            }
        }
    }
}
