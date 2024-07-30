package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9P {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final EK A04;
    public final boolean A05;
    public final boolean A06;

    public C9P(EK ek, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.A04 = ek;
        this.A03 = j10;
        this.A02 = j11;
        this.A00 = j12;
        this.A01 = j13;
        this.A06 = z10;
        this.A05 = z11;
    }

    public final C9P A00(int i10) {
        return new C9P(this.A04.A00(i10), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C9P A01(long j10) {
        return new C9P(this.A04, j10, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
