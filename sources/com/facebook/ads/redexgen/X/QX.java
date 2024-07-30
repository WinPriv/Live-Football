package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class QX extends AbstractRunnableC0997Ju {
    public final /* synthetic */ C1112Oj A00;

    public QX(C1112Oj c1112Oj) {
        this.A00 = c1112Oj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        P1 p12;
        LC lc2;
        AbstractC1011Kk abstractC1011Kk;
        AbstractC1044Lr abstractC1044Lr;
        p12 = this.A00.A02;
        C8N<C8O, C8M> eventBus = p12.getEventBus();
        lc2 = this.A00.A04;
        abstractC1011Kk = this.A00.A05;
        abstractC1044Lr = this.A00.A03;
        eventBus.A04(lc2, abstractC1011Kk, abstractC1044Lr);
    }
}
