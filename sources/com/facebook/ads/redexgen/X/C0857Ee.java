package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0857Ee {
    public static String[] A0I = {"CqT0KuE1AFfImBFy4ik", "hGcHjrCi226kocD9vKzS9HyQAF0ZqssA", "ZD81yrpYsqeXe4L", "XJx", "nsm5GlP1XQIMmswL2BtDEyl4JYnPccJt", "OHNFP06lkToQsW2YsoX4lx0", "UGSwurzNNOniPMx0TIQOqAAX3osRvTJh", "YaODE33QO8vEeLZGxHQ5TNBfWhqIAS5S"};
    public int A00;
    public int A01 = 1000;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Format A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public int[] A0C;
    public int[] A0D;
    public long[] A0E;
    public long[] A0F;
    public Format[] A0G;
    public BZ[] A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A09(C9L c9l, C1294Vn c1294Vn, boolean z10, boolean z11, Format format, C0856Ed c0856Ed) {
        if (!A0I()) {
            if (z11) {
                c1294Vn.A02(4);
                return -4;
            }
            if (this.A08 == null || (!z10 && this.A08 == format)) {
                return -3;
            }
            c9l.A00 = this.A08;
            return -5;
        }
        int A00 = A00(this.A03);
        if (z10 || this.A0G[A00] != format) {
            c9l.A00 = this.A0G[A00];
            return -5;
        }
        if (c1294Vn.A0B()) {
            return -3;
        }
        c1294Vn.A00 = this.A0F[A00];
        c1294Vn.A02(this.A0B[A00]);
        c0856Ed.A00 = this.A0C[A00];
        c0856Ed.A01 = this.A0E[A00];
        c0856Ed.A02 = this.A0H[A00];
        this.A03++;
        return -4;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0G(long j10, int i10, long j11, int i11, BZ bz) {
        if (this.A0A) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.A0A = false;
            }
        }
        H6.A04(!this.A09);
        A04(j10);
        int A00 = A00(this.A02);
        this.A0F[A00] = j10;
        this.A0E[A00] = j11;
        this.A0C[A00] = i11;
        this.A0B[A00] = i10;
        this.A0H[A00] = bz;
        this.A0G[A00] = this.A08;
        this.A0D[A00] = this.A05;
        this.A02++;
        if (this.A02 == this.A01) {
            int i12 = this.A01 + 1000;
            int[] iArr = new int[i12];
            long[] jArr = new long[i12];
            long[] jArr2 = new long[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            BZ[] bzArr = new BZ[i12];
            Format[] formatArr = new Format[i12];
            int i13 = this.A01 - this.A04;
            System.arraycopy(this.A0E, this.A04, jArr, 0, i13);
            System.arraycopy(this.A0F, this.A04, jArr2, 0, i13);
            System.arraycopy(this.A0B, this.A04, iArr2, 0, i13);
            System.arraycopy(this.A0C, this.A04, iArr3, 0, i13);
            System.arraycopy(this.A0H, this.A04, bzArr, 0, i13);
            System.arraycopy(this.A0G, this.A04, formatArr, 0, i13);
            System.arraycopy(this.A0D, this.A04, iArr, 0, i13);
            int i14 = this.A04;
            System.arraycopy(this.A0E, 0, jArr, i13, i14);
            System.arraycopy(this.A0F, 0, jArr2, i13, i14);
            System.arraycopy(this.A0B, 0, iArr2, i13, i14);
            System.arraycopy(this.A0C, 0, iArr3, i13, i14);
            System.arraycopy(this.A0H, 0, bzArr, i13, i14);
            System.arraycopy(this.A0G, 0, formatArr, i13, i14);
            System.arraycopy(this.A0D, 0, iArr, i13, i14);
            this.A0E = jArr;
            this.A0F = jArr2;
            this.A0B = iArr2;
            this.A0C = iArr3;
            this.A0H = bzArr;
            this.A0G = formatArr;
            this.A0D = iArr;
            this.A04 = 0;
            this.A02 = this.A01;
            this.A01 = i12;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A0J(long j10) {
        if (this.A02 == 0) {
            return j10 > this.A06;
        }
        if (Math.max(this.A06, A03(this.A03)) >= j10) {
            return false;
        }
        int i10 = this.A02;
        int A00 = A00(this.A02 - 1);
        while (i10 > this.A03 && this.A0F[A00] >= j10) {
            i10--;
            A00--;
            if (A00 == -1) {
                A00 = this.A01 - 1;
            }
        }
        A0C(this.A00 + i10);
        return true;
    }

    public C0857Ee() {
        int i10 = this.A01;
        this.A0D = new int[i10];
        this.A0E = new long[i10];
        this.A0F = new long[i10];
        this.A0B = new int[i10];
        this.A0C = new int[i10];
        this.A0H = new BZ[i10];
        this.A0G = new Format[i10];
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A09 = true;
        this.A0A = true;
    }

    private int A00(int i10) {
        int i11 = this.A04 + i10;
        int relativeIndex = this.A01;
        return i11 < relativeIndex ? i11 : i11 - relativeIndex;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if ((r0 & 1) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(int r8, int r9, long r10, boolean r12) {
        /*
            r7 = this;
            r6 = -1
            r3 = 0
        L2:
            if (r3 >= r9) goto L45
            long[] r0 = r7.A0F
            r4 = r0[r8]
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0857Ee.A0I
            r0 = 3
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0857Ee.A0I
            java.lang.String r1 = "JFV"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "8A9T2ZHBGF6P3L1HGcqfomX"
            r0 = 5
            r2[r0] = r1
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L45
            if (r12 == 0) goto L34
            int[] r0 = r7.A0B
            r0 = r0[r8]
            r0 = r0 & 1
            if (r0 == 0) goto L35
        L34:
            r6 = r3
        L35:
            int r8 = r8 + 1
            int r0 = r7.A01
            if (r8 != r0) goto L3c
            r8 = 0
        L3c:
            int r3 = r3 + 1
            goto L2
        L3f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L45:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0857Ee.A01(int, int, long, boolean):int");
    }

    private long A02(int i10) {
        this.A06 = Math.max(this.A06, A03(i10));
        this.A02 -= i10;
        this.A00 += i10;
        this.A04 += i10;
        int i11 = this.A04;
        int i12 = this.A01;
        if (i11 >= i12) {
            int i13 = i11 - i12;
            String[] strArr = A0I;
            if (strArr[7].charAt(18) != strArr[6].charAt(18)) {
                throw new RuntimeException();
            }
            A0I[2] = "rmPQqkiHfMf";
            this.A04 = i13;
        }
        this.A03 -= i10;
        if (this.A03 < 0) {
            if (A0I[2].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[4] = "rGNm6jdFTVK86xam60qdwwsNjuy3SfLS";
            strArr2[1] = "zCUBtEUnOSv2Jph2uhLKbu226T4aXBY5";
            this.A03 = 0;
        }
        if (this.A02 == 0) {
            int i14 = this.A04;
            if (i14 == 0) {
                i14 = this.A01;
            }
            int i15 = i14 - 1;
            long j10 = this.A0E[i15];
            int relativeLastDiscardIndex = this.A0C[i15];
            return j10 + relativeLastDiscardIndex;
        }
        return this.A0E[this.A04];
    }

    private long A03(int i10) {
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        long j10 = Long.MIN_VALUE;
        int A00 = A00(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.A0F[A00]);
            int i12 = this.A0B[A00];
            if ((i12 & 1) != 0) {
                break;
            }
            A00--;
            if (A00 == -1) {
                int i13 = this.A01;
                String[] strArr = A0I;
                if (strArr[4].charAt(25) == strArr[1].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[3] = "3tp";
                strArr2[5] = "Z0W9OfGRhIfCW820bOQ6uFB";
                A00 = i13 - 1;
            }
        }
        return j10;
    }

    private final synchronized void A04(long j10) {
        this.A07 = Math.max(this.A07, j10);
    }

    public final int A05() {
        return this.A00 + this.A03;
    }

    public final int A06() {
        return this.A00 + this.A02;
    }

    public final synchronized int A07() {
        int i10;
        i10 = this.A02 - this.A03;
        int skipCount = this.A02;
        this.A03 = skipCount;
        return i10;
    }

    public final synchronized int A08(long j10, boolean z10, boolean z11) {
        int A00 = A00(this.A03);
        if (!A0I() || j10 < this.A0F[A00] || (j10 > this.A07 && !z11)) {
            return -1;
        }
        int i10 = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(A00, i10 - relativeReadIndex, j10, z10);
        if (offset == -1) {
            return -1;
        }
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return offset;
    }

    public final synchronized long A0A() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A02(this.A02);
    }

    public final synchronized long A0B() {
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0C(int r6) {
        /*
            r5 = this;
            int r2 = r5.A06()
            int r2 = r2 - r6
            r4 = 1
            if (r2 < 0) goto L2d
            int r1 = r5.A02
            int r0 = r5.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L2d
            r0 = 1
        L10:
            com.facebook.ads.redexgen.X.H6.A03(r0)
            int r0 = r5.A02
            int r0 = r0 - r2
            r5.A02 = r0
            long r2 = r5.A06
            int r0 = r5.A02
            long r0 = r5.A03(r0)
            long r0 = java.lang.Math.max(r2, r0)
            r5.A07 = r0
            int r0 = r5.A02
            if (r0 != 0) goto L2f
            r0 = 0
            return r0
        L2d:
            r0 = 0
            goto L10
        L2f:
            int r0 = r0 - r4
            int r1 = r5.A00(r0)
            long[] r0 = r5.A0E
            r2 = r0[r1]
            int[] r0 = r5.A0C
            r0 = r0[r1]
            long r0 = (long) r0
            long r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0857Ee.A0C(int):long");
    }

    public final synchronized long A0D(long j10, boolean z10, boolean z11) {
        if (this.A02 != 0 && j10 >= this.A0F[this.A04]) {
            int A01 = A01(this.A04, (!z11 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j10, z10);
            if (A01 == -1) {
                return -1L;
            }
            return A02(A01);
        }
        return -1L;
    }

    public final synchronized Format A0E() {
        return this.A09 ? null : this.A08;
    }

    public final synchronized void A0F() {
        this.A03 = 0;
    }

    public final void A0H(boolean z10) {
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = true;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        if (z10) {
            this.A08 = null;
            this.A09 = true;
        }
    }

    public final synchronized boolean A0I() {
        return this.A03 != this.A02;
    }

    public final synchronized boolean A0K(Format format) {
        if (format == null) {
            this.A09 = true;
            return false;
        }
        this.A09 = false;
        if (C0940Hl.A0g(format, this.A08)) {
            return false;
        }
        this.A08 = format;
        return true;
    }
}
