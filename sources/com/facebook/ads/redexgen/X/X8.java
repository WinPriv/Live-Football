package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class X8 extends AbstractRunnableC0985Jh {
    public final /* synthetic */ X5 A00;
    public final /* synthetic */ J3 A01;

    public X8(X5 x52, J3 j32) {
        this.A00 = x52;
        this.A01 = j32;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0985Jh
    public final void A01() {
        C5Q c5q;
        C5Q c5q2;
        c5q = this.A00.A00;
        if (c5q.A00() != null) {
            c5q2 = this.A00.A00;
            c5q2.A00().onAdError(KP.A00(this.A01));
        }
    }
}
