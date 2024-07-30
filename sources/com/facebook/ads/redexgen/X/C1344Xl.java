package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1344Xl implements C4R {
    public static byte[] A04;
    public static String[] A05 = {"yYJ6SOT3uDFyj2TBTti7WWfRsn28EaA0", "ibfMp1J9gSZsYrxVf4NvaZx8D9JO1QBg", "rjgnGVcZwB7yGoiyculy9B4zYqmoHpCR", "", "BFeMqfRovMahqpkErO60kJAdny9RRdno", "ZwvbtEc0kmFFJCTTqnK3GQ6ySyfI7Whf", "3RaP0tr92GxZHPCEm9", "lHI5DV8"};
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-87, -66, -42, -52, -46, -47, 125, -51, -52, -48, -58, -47, -58, -52, -53, -48, 125, -54, -46, -48, -47, 125, -65, -62, 125, -53, -52, -53, -118, -53, -62, -60, -66, -47, -58, -45, -62, -60, -35, -20, -39, -32, -108, -40, -35, -25, -24, -43, -30, -41, -39, -108, -31, -23, -25, -24, -108, -42, -39, -108, -30, -29, -30, -95, -30, -39, -37, -43, -24, -35, -22, -39};
    }

    static {
        A01();
    }

    public final void A02() {
        int[] iArr = this.A03;
        if (iArr != null) {
            if (A05[7].length() != 7) {
                throw new RuntimeException();
            }
            A05[7] = "V5jR13F";
            Arrays.fill(iArr, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i10, int i11) {
        this.A01 = i10;
        this.A02 = i11;
    }

    public final void A04(C0849Dw c0849Dw, boolean z10) {
        this.A00 = 0;
        int[] iArr = this.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        C4T c4t = c0849Dw.A06;
        if (c0849Dw.A04 != null && c4t != null && c4t.A1Y()) {
            if (z10) {
                boolean A0J = c0849Dw.A00.A0J();
                String[] strArr = A05;
                if (strArr[0].charAt(30) != strArr[5].charAt(30)) {
                    A05[7] = "b5aEeD0";
                    if (!A0J) {
                        c4t.A1v(c0849Dw.A04.A0D(), this);
                    }
                }
                throw new RuntimeException();
            }
            if (!c0849Dw.A1t()) {
                c4t.A1u(this.A01, this.A02, c0849Dw.A0s, this);
            }
            int i10 = this.A00;
            int i11 = c4t.A00;
            String[] strArr2 = A05;
            if (strArr2[3].length() != strArr2[6].length()) {
                A05[7] = "TjVTm35";
                if (i10 > i11) {
                    c4t.A00 = this.A00;
                    c4t.A08 = z10;
                    c0849Dw.A0r.A0O();
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    public final boolean A05(int i10) {
        if (this.A03 != null) {
            int i11 = this.A00 * 2;
            for (int i12 = 0; i12 < i11; i12 += 2) {
                int count = this.A03[i12];
                if (count == i10) {
                    String[] strArr = A05;
                    String str = strArr[0];
                    String str2 = strArr[5];
                    int i13 = str.charAt(30);
                    int count2 = str2.charAt(30);
                    if (i13 == count2) {
                        throw new RuntimeException();
                    }
                    A05[2] = "SVfMGWcG5IEJEA83X9P3956xbutBXkdM";
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4R
    public final void A3G(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.A00 * 2;
                int[] iArr = this.A03;
                if (iArr == null) {
                    this.A03 = new int[4];
                    Arrays.fill(this.A03, -1);
                } else {
                    int storagePosition = iArr.length;
                    if (i12 >= storagePosition) {
                        int[] iArr2 = this.A03;
                        int storagePosition2 = i12 * 2;
                        this.A03 = new int[storagePosition2];
                        System.arraycopy(iArr2, 0, this.A03, 0, iArr2.length);
                    }
                }
                int[] iArr3 = this.A03;
                iArr3[i12] = i10;
                int storagePosition3 = i12 + 1;
                iArr3[storagePosition3] = i11;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 33));
        }
        throw new IllegalArgumentException(A00(0, 37, 10));
    }
}
