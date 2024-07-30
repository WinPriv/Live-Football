package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class UK implements InterfaceC0860Eh {
    public final int A00;
    public final /* synthetic */ B6 A01;

    public UK(B6 b62, int i10) {
        this.A01 = b62;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Eh
    public final boolean A8Z() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Eh
    public final void A9R() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Eh
    public final int ADT(C9L c9l, C1294Vn c1294Vn, boolean z10) {
        return this.A01.A0P(this.A00, c9l, c1294Vn, z10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Eh
    public final int AEj(long j10) {
        return this.A01.A0O(this.A00, j10);
    }
}
