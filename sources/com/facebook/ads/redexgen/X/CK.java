package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public abstract class CK {
    public static String[] A0D = {"vdpx440NSg8M4CnGdydtu5qQkftaFl81", "8FBVTf92WyxNz1PbVx8WfEYVHOwD1jYA", "DKJKTeADHw9YeVFClTVADEpoqL7THNTT", "QMHe7Xu97ps4f3hWTDxnFcitcXlvMrzA", "cT681YGQWd9DutiYQJBSPFEBPfK5r2m4", "EyU4ukvYlXQau4YgIYVQwMEfY7bgqA6h", "DftqlnKuE3jyyUo0DxEITdlkAR2KkpEx", "3J2n16rNLfrexVGozCu5PKnUXiDeYKol"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public BQ A06;
    public InterfaceC0789Ba A07;
    public CH A08;
    public CJ A09;
    public boolean A0A;
    public boolean A0B;
    public final CF A0C = new CF();

    public abstract long A07(HV hv);

    public abstract boolean A0A(HV hv, long j10, CJ cj) throws IOException, InterruptedException;

    private int A00(BP bp) throws IOException, InterruptedException {
        boolean z10 = true;
        while (z10) {
            boolean readingHeaders = this.A0C.A05(bp);
            if (!readingHeaders) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = bp.A7D() - this.A04;
            z10 = A0A(this.A0C.A02(), this.A04, this.A09);
            if (z10) {
                this.A04 = bp.A7D();
            }
        }
        this.A00 = this.A09.A00.A0C;
        boolean readingHeaders2 = this.A0A;
        if (!readingHeaders2) {
            this.A07.A5T(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            CJ cj = this.A09;
            String[] strArr = A0D;
            if (strArr[3].charAt(31) == strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[2] = "bh7MBcJSzFDWGWL7bYV4RFdmzZ5DJPtg";
            strArr2[4] = "jbTTtcEVTbmVVWffnqyGAcPkGPEAibSD";
            this.A08 = cj.A01;
        } else if (bp.A6r() == -1) {
            this.A08 = new V5();
        } else {
            CG firstPayloadPageHeader = this.A0C.A01();
            this.A08 = new VB(this.A04, bp.A6r(), this, firstPayloadPageHeader.A01 + firstPayloadPageHeader.A00, firstPayloadPageHeader.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A04();
        return 0;
    }

    private int A01(BP bp, BV bv) throws IOException, InterruptedException {
        long position = this.A08.ADR(bp);
        if (position >= 0) {
            bv.A00 = position;
            return 1;
        }
        if (position < -1) {
            A08(-(2 + position));
        }
        boolean z10 = this.A0B;
        if (A0D[1].charAt(31) == 'Q') {
            throw new RuntimeException();
        }
        A0D[6] = "YKdoYyhEaGRVIGwSTWAYioMwjJxRxWbM";
        if (!z10) {
            this.A06.AEE(this.A08.A4S());
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A05(bp)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        HV A02 = this.A0C.A02();
        long A07 = A07(A02);
        if (A07 >= 0) {
            long j10 = this.A02;
            long granulesInPacket = j10 + A07;
            if (granulesInPacket >= this.A05) {
                long A03 = A03(j10);
                this.A07.AE8(A02, A02.A07());
                this.A07.AE9(A03, 1, A02.A07(), 0, null);
                this.A05 = -1L;
            }
        }
        this.A02 += A07;
        return 0;
    }

    public final int A02(BP bp, BV bv) throws IOException, InterruptedException {
        int i10 = this.A01;
        if (i10 == 0) {
            return A00(bp);
        }
        if (i10 == 1) {
            bp.AEk((int) this.A04);
            this.A01 = 2;
            return 0;
        }
        if (i10 == 2) {
            int A01 = A01(bp, bv);
            if (A0D[6].charAt(6) == 'm') {
                throw new RuntimeException();
            }
            A0D[1] = "ecnT7ItXVuTi5H8Gayt4a9jA0qUq5vI3";
            return A01;
        }
        throw new IllegalStateException();
    }

    public final long A03(long j10) {
        return (1000000 * j10) / this.A00;
    }

    public final long A04(long j10) {
        return (this.A00 * j10) / 1000000;
    }

    public final void A05(long j10, long j11) {
        this.A0C.A03();
        if (j10 == 0) {
            A09(!this.A0B);
        } else {
            if (this.A01 == 0) {
                return;
            }
            this.A05 = this.A08.AEs(j11);
            this.A01 = 2;
        }
    }

    public final void A06(BQ bq, InterfaceC0789Ba interfaceC0789Ba) {
        this.A06 = bq;
        this.A07 = interfaceC0789Ba;
        A09(true);
    }

    public void A08(long j10) {
        this.A02 = j10;
    }

    public void A09(boolean z10) {
        if (z10) {
            this.A09 = new CJ();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
