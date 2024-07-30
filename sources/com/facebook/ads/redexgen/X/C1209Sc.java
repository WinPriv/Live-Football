package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1209Sc implements InterfaceC1021Ku {
    public int A00;
    public final InterfaceC1021Ku A01;
    public final InterfaceC1021Ku A02;

    public C1209Sc(InterfaceC1021Ku interfaceC1021Ku, int i10, InterfaceC1021Ku interfaceC1021Ku2) {
        this.A01 = interfaceC1021Ku;
        this.A00 = i10;
        this.A02 = interfaceC1021Ku2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1021Ku
    public final void ADD(String str) {
        if (this.A00 > 0) {
            this.A01.ADD(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.ADD(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1021Ku
    public final void flush() {
        this.A02.flush();
    }
}
