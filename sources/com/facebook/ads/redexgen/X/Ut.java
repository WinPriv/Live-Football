package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Ut implements CU {
    public static byte[] A0E;
    public static String[] A0F = {"OaAtDjibDffMS", "aj2yyuicdEn8dhTDbWTrD1WtuleVGPEx", "a3NvGU2CXdpQvxvcysdReyA6yUgKGJjf", "4BBSavRiCGZis8TiCNo6nDJqjRzxnCkr", "3Isw3BGBXoN1VbjlJcagr5xDVNXHwLpI", "HfhncQp7sGaDAl", "zNtUp", "pzzsrx2QpEHePoyNV"};
    public long A00;
    public long A01;
    public InterfaceC0789Ba A02;
    public CY A03;
    public String A04;
    public boolean A05;
    public final C0806Cd A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final C0803Ca A08 = new C0803Ca(7, 128);
    public final C0803Ca A06 = new C0803Ca(8, 128);
    public final C0803Ca A07 = new C0803Ca(6, 128);
    public final HV A0A = new HV();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{37, 58, 55, 54, 60, 124, 50, 37, 48};
    }

    static {
        A01();
    }

    public Ut(C0806Cd c0806Cd, boolean z10, boolean z11) {
        this.A09 = c0806Cd;
        this.A0B = z10;
        this.A0C = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0175, code lost:
    
        if (r4.A03() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        r24.A03.A04(com.facebook.ads.redexgen.X.HR.A05(r24.A06.A01, 3, r24.A06.A00));
        r24.A06.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019f, code lost:
    
        if (r4.A03() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(long r25, int r27, int r28, long r29) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Ut.A02(long, int, int, long):void");
    }

    private void A03(long j10, int i10, long j11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i10);
            this.A06.A01(i10);
        }
        this.A07.A01(i10);
        String[] strArr = A0F;
        if (strArr[4].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "7DOfm1dA88ob89";
        strArr2[0] = "yqrgSqZS2XcB9";
        this.A03.A03(j10, i10, j11);
    }

    private void A04(byte[] bArr, int i10, int i11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A03.A06(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A48(HV hv) {
        int A06 = hv.A06();
        int A07 = hv.A07();
        byte[] bArr = hv.A00;
        long j10 = this.A01;
        int offset = hv.A04();
        this.A01 = j10 + offset;
        InterfaceC0789Ba interfaceC0789Ba = this.A02;
        int offset2 = hv.A04();
        interfaceC0789Ba.AE8(hv, offset2);
        while (true) {
            int A04 = HR.A04(bArr, A06, A07, this.A0D);
            if (A04 == A07) {
                A04(bArr, A06, A07);
                return;
            }
            int lengthToNalUnit = HR.A01(bArr, A04);
            int i10 = A04 - A06;
            if (i10 > 0) {
                A04(bArr, A06, A04);
            }
            int i11 = A07 - A04;
            long j11 = this.A01 - i11;
            int offset3 = i10 < 0 ? -i10 : 0;
            A02(j11, i11, offset3, this.A00);
            A03(j11, lengthToNalUnit, this.A00);
            A06 = A04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.CU
    public final void A4V(BQ bq, C0811Ci c0811Ci) {
        c0811Ci.A05();
        this.A04 = c0811Ci.A04();
        this.A02 = bq.AF2(c0811Ci.A03(), 2);
        this.A03 = new CY(this.A02, this.A0B, this.A0C);
        this.A09.A03(bq, c0811Ci);
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
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
