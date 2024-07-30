package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class XI extends AbstractRunnableC0997Ju {
    public final /* synthetic */ XH A00;
    public final /* synthetic */ C07268o A01;

    public XI(XH xh, C07268o c07268o) {
        this.A00 = xh;
        this.A01 = c07268o;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1A());
        this.A00.A02.A1c(true, true);
    }
}
