package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class RE implements KW {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC0997Ju A01;
    public final /* synthetic */ RB A02;

    public RE(RB rb2, int i10, AbstractRunnableC0997Ju abstractRunnableC0997Ju) {
        this.A02 = rb2;
        this.A00 = i10;
        this.A01 = abstractRunnableC0997Ju;
    }

    @Override // com.facebook.ads.redexgen.X.KW
    public final void AAH() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.KW
    public final void ABs(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
