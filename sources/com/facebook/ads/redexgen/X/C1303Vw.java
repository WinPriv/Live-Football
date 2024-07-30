package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1303Vw implements AT {
    public final C1297Vq A00 = new C1297Vq();
    public final C1296Vp A01 = new C1296Vp();
    public final A7[] A02;

    public C1303Vw(A7... a7Arr) {
        this.A02 = (A7[]) Arrays.copyOf(a7Arr, a7Arr.length + 2);
        A7[] a7Arr2 = this.A02;
        a7Arr2[a7Arr.length] = this.A00;
        a7Arr2[a7Arr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AT
    public final C9T A3Q(C9T c9t) {
        this.A00.A0B(c9t.A02);
        return new C9T(this.A01.A01(c9t.A01), this.A01.A00(c9t.A00), c9t.A02);
    }

    @Override // com.facebook.ads.redexgen.X.AT
    public final A7[] A5j() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AT
    public final long A6w(long j10) {
        return this.A01.A02(j10);
    }

    @Override // com.facebook.ads.redexgen.X.AT
    public final long A7T() {
        return this.A00.A0A();
    }
}
