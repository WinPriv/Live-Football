package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SI implements KW {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SH A01;

    public SI(SH sh, int i10) {
        this.A01 = sh;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.KW
    public final void AAH() {
        this.A01.A03 = false;
        this.A01.A0S();
        this.A01.A0C.setToolbarActionMode(this.A01.getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.KW
    public final void ABs(float f) {
        this.A01.A0C.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
