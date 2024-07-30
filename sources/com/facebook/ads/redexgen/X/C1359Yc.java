package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1359Yc extends AbstractRunnableC0997Ju {
    public final /* synthetic */ AbstractC1358Yb A00;
    public final /* synthetic */ J3 A01;

    public C1359Yc(AbstractC1358Yb abstractC1358Yb, J3 j32) {
        this.A00 = abstractC1358Yb;
        this.A01 = j32;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        this.A00.A0B.A0D().A4Z(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
