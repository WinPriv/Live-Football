package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class ZE extends AbstractC1136Ph {
    public final /* synthetic */ ZC A00;

    public ZE(ZC zc2) {
        this.A00 = zc2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1136Ph
    public final void A02() {
        L6 l62;
        L6 l63;
        DY dy;
        Z1 z12;
        DY dy2;
        C1377Yu c1377Yu;
        C1137Pi c1137Pi;
        L6 l64;
        C1377Yu c1377Yu2;
        IT it;
        C1377Yu c1377Yu3;
        C1137Pi c1137Pi2;
        l62 = this.A00.A05;
        if (!l62.A07()) {
            l63 = this.A00.A05;
            l63.A05();
            dy = this.A00.A03;
            ZU A0D = dy.A0D();
            z12 = this.A00.A01;
            A0D.A3Z(z12 != null);
            dy2 = this.A00.A03;
            dy2.A0D().A2Y();
            c1377Yu = this.A00.A02;
            AnonymousClass29.A00(c1377Yu.A0W());
            N2 n22 = new N2();
            c1137Pi = this.A00.A0A;
            N2 A03 = n22.A03(c1137Pi);
            l64 = this.A00.A05;
            N2 A02 = A03.A02(l64);
            c1377Yu2 = this.A00.A02;
            Map<String, String> A05 = A02.A04(c1377Yu2.A0X()).A05();
            it = this.A00.A04;
            c1377Yu3 = this.A00.A02;
            it.A8z(c1377Yu3.A0U(), A05);
            c1137Pi2 = this.A00.A0A;
            c1137Pi2.A0V();
        }
    }
}
