package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class RY extends AbstractRunnableC0997Ju {
    public final /* synthetic */ RX A00;
    public final /* synthetic */ boolean A01;

    public RY(RX rx, boolean z10) {
        this.A00 = rx;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        NV nv;
        nv = this.A00.A0E;
        AbstractC1028Lb A08 = nv.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A01 || A08.A05()) ? false : true);
        A08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
