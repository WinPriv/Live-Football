package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SQ implements InterfaceC1064Mm {
    public final /* synthetic */ InterfaceC1029Lc A00;
    public final /* synthetic */ SO A01;

    public SQ(SO so, InterfaceC1029Lc interfaceC1029Lc) {
        this.A01 = so;
        this.A00 = interfaceC1029Lc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    public final void ABa(String str) {
        C1057Mf c1057Mf;
        c1057Mf = this.A01.A0A;
        c1057Mf.setProgress(100);
        this.A01.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    public final void ABc(String str) {
        C1056Me c1056Me;
        this.A01.A05 = true;
        c1056Me = this.A01.A09;
        c1056Me.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    public final void ABt(int i10) {
        boolean z10;
        C1057Mf c1057Mf;
        z10 = this.A01.A05;
        if (z10) {
            c1057Mf = this.A01.A0A;
            c1057Mf.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    public final void ABy(String str) {
        C1056Me c1056Me;
        c1056Me = this.A01.A09;
        c1056Me.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    public final void AC0() {
        this.A00.AA9(14);
    }
}
