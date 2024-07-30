package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class ZG extends AbstractRunnableC0997Ju {
    public final /* synthetic */ ZF A00;
    public final /* synthetic */ C07268o A01;

    public ZG(ZF zf, C07268o c07268o) {
        this.A00 = zf;
        this.A01 = c07268o;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C1137Pi c1137Pi;
        C1137Pi c1137Pi2;
        C1137Pi c1137Pi3;
        this.A00.A00.A09();
        c1137Pi = this.A00.A00.A0A;
        if (c1137Pi != null) {
            C07268o c07268o = this.A01;
            c1137Pi2 = this.A00.A00.A0A;
            c07268o.setAdViewabilityChecker(c1137Pi2);
            c1137Pi3 = this.A00.A00.A0A;
            c1137Pi3.A0U();
        }
    }
}
