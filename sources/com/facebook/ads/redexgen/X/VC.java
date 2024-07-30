package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class VC implements BX {
    public final /* synthetic */ VB A00;

    public VC(VB vb2) {
        this.A00 = vb2;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        CK ck;
        long j10;
        ck = this.A00.A0B;
        j10 = this.A00.A07;
        return ck.A03(j10);
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long granule) {
        CK ck;
        long j10;
        long A00;
        long j11;
        if (granule == 0) {
            j11 = this.A00.A09;
            return new BW(new BY(0L, j11));
        }
        ck = this.A00.A0B;
        long A04 = ck.A04(granule);
        VB vb2 = this.A00;
        j10 = vb2.A09;
        A00 = vb2.A00(j10, A04, 30000L);
        return new BW(new BY(granule, A00));
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return true;
    }
}
