package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1282Vb implements BX {
    public final long A00;
    public final BW A01;

    public C1282Vb(long j10) {
        this(j10, 0L);
    }

    public C1282Vb(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new BW(j11 == 0 ? BY.A04 : new BY(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return false;
    }
}
