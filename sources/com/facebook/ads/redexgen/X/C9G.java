package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9G {
    public int A00;
    public int A01;
    public C9S A02;
    public boolean A03;

    public C9G() {
    }

    public final void A03(int i10) {
        this.A01 += i10;
    }

    public final void A04(int i10) {
        if (this.A03 && this.A00 != 4) {
            H6.A03(i10 == 4);
        } else {
            this.A03 = true;
            this.A00 = i10;
        }
    }

    public final void A05(C9S c9s) {
        this.A02 = c9s;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C9S c9s) {
        return c9s != this.A02 || this.A01 > 0 || this.A03;
    }
}
