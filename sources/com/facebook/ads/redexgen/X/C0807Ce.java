package com.facebook.ads.redexgen.X;

import com.anythink.expressad.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.Ce, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0807Ce implements VN {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C0807Ce(long j10, long j11, BU bu) {
        this.A04 = j11;
        this.A01 = bu.A02;
        this.A00 = bu.A00;
        if (j10 == -1) {
            this.A02 = -1L;
            this.A03 = b.f7291b;
        } else {
            this.A02 = j10 - j11;
            this.A03 = A7c(j10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j10) {
        long j11 = this.A02;
        if (j11 == -1) {
            return new BW(new BY(0L, this.A04));
        }
        int i10 = this.A01;
        long A0E = C0940Hl.A0E((((this.A00 * j10) / 8000000) / i10) * i10, 0L, j11 - i10);
        long j12 = this.A04 + A0E;
        long A7c = A7c(j12);
        BY seekPoint = new BY(A7c, j12);
        if (A7c < j10) {
            long j13 = this.A02;
            int i11 = this.A01;
            if (A0E != j13 - i11) {
                long j14 = i11 + j12;
                return new BW(seekPoint, new BY(A7c(j14), j14));
            }
        }
        return new BW(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.VN
    public final long A7c(long j10) {
        return ((Math.max(0L, j10 - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return this.A02 != -1;
    }
}
