package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.k.p;

/* loaded from: assets/audience_network.dex */
public final class VI implements InterfaceC0795Br {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final HV A04;

    public VI(VK vk) {
        this.A04 = vk.A00;
        this.A04.A0Y(12);
        this.A02 = this.A04.A0H() & p.f9095b;
        this.A03 = this.A04.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0795Br
    public final int A7H() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0795Br
    public final boolean A8R() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0795Br
    public final int ADW() {
        int i10 = this.A02;
        if (i10 == 8) {
            return this.A04.A0E();
        }
        if (i10 == 16) {
            return this.A04.A0I();
        }
        int i11 = this.A01;
        this.A01 = i11 + 1;
        if (i11 % 2 == 0) {
            this.A00 = this.A04.A0E();
            return (this.A00 & 240) >> 4;
        }
        return this.A00 & 15;
    }
}
