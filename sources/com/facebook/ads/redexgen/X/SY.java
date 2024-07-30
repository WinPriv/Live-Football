package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SY implements InterfaceC1021Ku {
    public final C1020Kt A00;
    public final InterfaceC1021Ku A01;

    public SY(InterfaceC1021Ku interfaceC1021Ku, int i10, int i11) {
        this.A01 = interfaceC1021Ku;
        this.A00 = new C1020Kt(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1021Ku
    public final void ADD(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = C1023Kw.A08(this.A00);
            if (A08) {
                this.A01.ADD(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1021Ku
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = C1023Kw.A08(this.A00);
            if (A08) {
                this.A01.ADD(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
