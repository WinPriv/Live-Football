package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SZ implements InterfaceC1021Ku {
    public int A00;
    public final InterfaceC1021Ku A01;

    public SZ(InterfaceC1021Ku interfaceC1021Ku, int i10) {
        this.A01 = interfaceC1021Ku;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1021Ku
    public final void ADD(String str) {
        if (this.A00 > 0) {
            this.A01.ADD(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1021Ku
    public final void flush() {
        this.A01.flush();
    }
}
