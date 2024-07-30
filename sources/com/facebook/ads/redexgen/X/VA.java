package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class VA implements CH, BX {
    public static String[] A05 = {"yHlOCb8hYCUAGFBSR1KAQUls", "juuz7zvmjSSgkVuftf6ZJcl9wJUxZwvI", "9ebISPaipFvwM", "wI75rrP9DnRc8cDmDq6gSrlsVWTLnppT", "4k7x4VjdHI9zouAPkna3Rg4ZAMvyURep", "hKkxNrfwukp47", "HBJCJbTVml8ZYTmPInpazFF5", "aaJAILk2rqVBl9Nm5Oiw"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ V9 A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.BX
    public final BW A7M(long j10) {
        int A0B = C0940Hl.A0B(this.A02, this.A04.A04(j10), true, true);
        long A03 = this.A04.A03(this.A02[A0B]);
        BY by = new BY(A03, this.A00 + this.A03[A0B]);
        if (A03 < j10) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                return new BW(by, new BY(this.A04.A03(jArr[A0B + 1]), this.A00 + this.A03[A0B + 1]));
            }
        }
        return new BW(by);
    }

    public VA(V9 v92) {
        this.A04 = v92;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(HV hv) {
        hv.A0Z(1);
        int length = hv.A0G();
        int i10 = length / 18;
        this.A02 = new long[i10];
        this.A03 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.A02[i11] = hv.A0L();
            int numberOfSeekPoints = A05[4].charAt(31);
            if (numberOfSeekPoints != 112) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "w9Elnsp9xD6AY";
            strArr[2] = "jAQAlpm0y2ybi";
            this.A03[i11] = hv.A0L();
            hv.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final BX A4S() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final long A6Q() {
        HI hi;
        hi = this.A04.A01;
        return hi.A01();
    }

    @Override // com.facebook.ads.redexgen.X.BX
    public final boolean A8d() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final long ADR(BP bp) throws IOException, InterruptedException {
        long j10 = this.A01;
        if (j10 < 0) {
            return -1L;
        }
        long result = -(j10 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final long AEs(long j10) {
        long A04 = this.A04.A04(j10);
        long granule = this.A02[C0940Hl.A0B(this.A02, A04, true, true)];
        this.A01 = granule;
        return A04;
    }
}
