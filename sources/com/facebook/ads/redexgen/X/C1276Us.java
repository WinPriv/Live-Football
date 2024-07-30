package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1276Us implements CU {
    public static byte[] A0E;
    public static String[] A0F = {"a", "PSzfdfjRZC0XN6VxjsgcztfFaZhzgWb7", "1Gl4YGiW2C7ithS", "fAa", "AJgx", "lYVk", "kBtUfz7weItcbZk1MBk54uJpUuqD7Dj9", "de5NTYCoeu4fZv0TXl8jvZIWd"};
    public long A00;
    public long A01;
    public InterfaceC0789Ba A02;
    public CZ A03;
    public String A04;
    public boolean A05;
    public final C0806Cd A0B;
    public final boolean[] A0D = new boolean[3];
    public final C0803Ca A0A = new C0803Ca(32, 128);
    public final C0803Ca A08 = new C0803Ca(33, 128);
    public final C0803Ca A06 = new C0803Ca(34, 128);
    public final C0803Ca A07 = new C0803Ca(39, 128);
    public final C0803Ca A09 = new C0803Ca(40, 128);
    public final HV A0C = new HV();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-65, -87, -83, -84, -55, -36, -40, -37, -36, -23, -20, 5, -4, Ascii.SI, 7, -4, -6, Ascii.VT, -4, -5, -73, -8, 10, 7, -4, -6, Ascii.VT, -10, 9, -8, Ascii.VT, 0, 6, -10, 0, -5, -6, -73, Ascii.CR, -8, 3, Ascii.FF, -4, -47, -73, 49, 36, Ascii.US, 32, 42, -22, 35, 32, 49, Ascii.RS};
    }

    static {
        A02();
    }

    public C1276Us(C0806Cd c0806Cd) {
        this.A0B = c0806Cd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0243, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d2, code lost:
    
        if (r6 == 255) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d4, code lost:
    
        r1 = r3.A05(16);
        r0 = r3.A05(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01de, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e0, code lost:
    
        if (r0 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e2, code lost:
    
        r4 = r1 / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020b, code lost:
    
        if (r6 >= com.facebook.ads.redexgen.X.HR.A04.length) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020d, code lost:
    
        r4 = com.facebook.ads.redexgen.X.HR.A04[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0212, code lost:
    
        android.util.Log.w(A01(0, 10, 32), A01(10, 35, 64) + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0205, code lost:
    
        if (r6 == 255) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.internal.exoplayer2.Format A00(java.lang.String r17, com.facebook.ads.redexgen.X.C0803Ca r18, com.facebook.ads.redexgen.X.C0803Ca r19, com.facebook.ads.redexgen.X.C0803Ca r20) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1276Us.A00(java.lang.String, com.facebook.ads.redexgen.X.Ca, com.facebook.ads.redexgen.X.Ca, com.facebook.ads.redexgen.X.Ca):com.facebook.ads.internal.exoplayer2.Format");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        if (r3.A03() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        r5.A02.A5T(A00(r5.A04, r5.A0A, r5.A08, r5.A06));
        r2 = com.facebook.ads.redexgen.X.C1276Us.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r2[5].length() == r2[4].length()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        com.facebook.ads.redexgen.X.C1276Us.A0F[1] = "ZjqETcMPlDZxu07sDnjN9sy4wI9cybTG";
        r5.A05 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00df, code lost:
    
        if (r3.A03() != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03(long r6, int r8, int r9, long r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1276Us.A03(long, int, int, long):void");
    }

    private void A04(long j10, int i10, int i11, long j11) {
        if (this.A05) {
            this.A03.A03(j10, i10, i11, j11);
        } else {
            this.A0A.A01(i11);
            this.A08.A01(i11);
            this.A06.A01(i11);
        }
        this.A07.A01(i11);
        this.A09.A01(i11);
    }

    public static void A05(HW hw) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                if (!hw.A0A()) {
                    hw.A04();
                } else {
                    int sizeId = i10 << 1;
                    int min = Math.min(64, 1 << (sizeId + 4));
                    if (i10 > 1) {
                        hw.A03();
                    }
                    for (int sizeId2 = 0; sizeId2 < min; sizeId2++) {
                        hw.A03();
                    }
                }
                int sizeId3 = 3;
                if (i10 != 3) {
                    sizeId3 = 1;
                }
                i11 += sizeId3;
            }
        }
    }

    public static void A06(HW hw) {
        int A04 = hw.A04();
        boolean z10 = false;
        int i10 = 0;
        for (int numPositivePics = 0; numPositivePics < A04; numPositivePics++) {
            if (numPositivePics != 0) {
                z10 = hw.A0A();
            }
            if (z10) {
                hw.A06();
                hw.A04();
                for (int i11 = 0; i11 <= i10; i11++) {
                    if (hw.A0A()) {
                        hw.A06();
                    }
                }
            } else {
                int A042 = hw.A04();
                int numNegativePics = hw.A04();
                i10 = A042 + numNegativePics;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < A042; numShortTermRefPicSets++) {
                    hw.A04();
                    hw.A06();
                }
                for (int stRpsIdx = 0; stRpsIdx < numNegativePics; stRpsIdx++) {
                    hw.A04();
                    if (A0F[2].length() != 15) {
                        throw new RuntimeException();
                    }
                    A0F[7] = "29HJBmKLkgSGGX3jFY36NCeZA";
                    hw.A06();
                }
            }
        }
    }

    private void A07(byte[] bArr, int i10, int i11) {
        if (this.A05) {
            this.A03.A04(bArr, i10, i11);
        } else {
            this.A0A.A02(bArr, i10, i11);
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A09.A02(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A48(HV hv) {
        while (hv.A04() > 0) {
            int A06 = hv.A06();
            int A07 = hv.A07();
            byte[] bArr = hv.A00;
            long j10 = this.A01;
            int offset = hv.A04();
            this.A01 = j10 + offset;
            InterfaceC0789Ba interfaceC0789Ba = this.A02;
            int offset2 = hv.A04();
            interfaceC0789Ba.AE8(hv, offset2);
            while (A06 < A07) {
                int A04 = HR.A04(bArr, A06, A07, this.A0D);
                if (A04 == A07) {
                    A07(bArr, A06, A07);
                    return;
                }
                int bytesWrittenPastPosition = HR.A00(bArr, A04);
                int i10 = A04 - A06;
                if (i10 > 0) {
                    A07(bArr, A06, A04);
                }
                int i11 = A07 - A04;
                long j11 = this.A01 - i11;
                int offset3 = i10 < 0 ? -i10 : 0;
                A03(j11, i11, offset3, this.A00);
                long absolutePosition = this.A00;
                A04(j11, i11, bytesWrittenPastPosition, absolutePosition);
                A06 = A04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0811Ci c0811Ci) {
        c0811Ci.A05();
        this.A04 = c0811Ci.A04();
        this.A02 = bq.AF2(c0811Ci.A03(), 2);
        this.A03 = new CZ(this.A02);
        this.A0B.A03(bq, c0811Ci);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACx() {
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void ACy(long j10, boolean z10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void AEC() {
        HR.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
