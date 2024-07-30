package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1380Yx implements N1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1379Yw A01;
    public final /* synthetic */ C1228Sw A02;

    public C1380Yx(AbstractC1379Yw abstractC1379Yw, int i10, C1228Sw c1228Sw) {
        this.A01 = abstractC1379Yw;
        this.A00 = i10;
        this.A02 = c1228Sw;
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void AAr(boolean z10) {
        AbstractC1136Ph abstractC1136Ph;
        if (this.A00 == 0) {
            C1228Sw c1228Sw = this.A02;
            abstractC1136Ph = this.A01.A04;
            c1228Sw.A1Z(abstractC1136Ph);
        }
        this.A02.A1c(z10, true);
    }
}
