package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SF implements NF {
    public final /* synthetic */ S9 A00;

    public SF(S9 s92) {
        this.A00 = s92;
    }

    @Override // com.facebook.ads.redexgen.X.NF
    public final void A9r() {
        boolean A0Y;
        A0Y = this.A00.A0Y();
        if (A0Y) {
            this.A00.A0M();
            this.A00.A0V.setToolbarActionMessage("");
            this.A00.A0V.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NF
    public final void ABJ() {
        KX kx;
        this.A00.A0A = false;
        kx = this.A00.A0J;
        kx.A07();
    }

    @Override // com.facebook.ads.redexgen.X.NF
    public final void ABK() {
        KX kx;
        this.A00.A0A = true;
        kx = this.A00.A0J;
        kx.A06();
    }
}
