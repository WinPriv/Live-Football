package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class X7 extends AbstractRunnableC0985Jh {
    public final /* synthetic */ X6 A00;

    public X7(X6 x62) {
        this.A00 = x62;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0985Jh
    public final void A01() {
        C5Q c5q;
        C5Q c5q2;
        c5q = this.A00.A01.A00;
        if (c5q.A00() != null) {
            c5q2 = this.A00.A01.A00;
            c5q2.A00().onAdsLoaded();
        }
    }
}
