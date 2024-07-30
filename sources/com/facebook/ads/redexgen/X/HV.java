package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HV {
    public static byte[] A03;
    public static String[] A04 = {"HJCnnsvFRKCxDDAbEWuhDIcdg3xeT1pm", "aXWy8CvsRXCMVcJtmBA1wVRdgUuSFZpH", "GQPvM", "pDI65rPXKWggiakX8tUTXOsWDv9apWvH", "LM6A01RjpialbK5Oi", "vEfQavrNrAXrkYYeEOthMrPonFtv4Upj", "EEXi7u9hiAizt85cGACEO5SSNblzx1I5", "5Jpn3XfqvoPj"};
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-33, 4, Ascii.FF, -9, 2, -1, -6, -74, -21, -22, -36, -61, -50, -74, 9, -5, 7, Ascii.VT, -5, 4, -7, -5, -74, -7, 5, 4, 10, -1, 4, Ascii.VT, -9, 10, -1, 5, 4, -74, -8, Ascii.SI, 10, -5, -48, -74, -67, -30, -22, -43, -32, -35, -40, -108, -55, -56, -70, -95, -84, -108, -25, -39, -27, -23, -39, -30, -41, -39, -108, -38, -35, -26, -25, -24, -108, -42, -19, -24, -39, -82, -108, -113, -86, -85, 91, -99, -92, -81, 91, -87, -86, -81, 91, -75, -96, -83, -86, 117, 91, -49, -50, -64, -89, -78};
    }

    static {
        A01();
    }

    public HV() {
    }

    public HV(int i10) {
        this.A00 = new byte[i10];
        this.A01 = i10;
    }

    public HV(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public HV(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
    }

    public final char A02() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        return (char) ((bArr[i10 + 1] & DefaultClassResolver.NAME) | ((bArr[i10] & DefaultClassResolver.NAME) << 8));
    }

    public final double A03() {
        return Double.longBitsToDouble(A0L());
    }

    public final int A04() {
        return this.A01 - this.A02;
    }

    public final int A05() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int A06() {
        return this.A02;
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & DefaultClassResolver.NAME) << 24;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr[i12] & DefaultClassResolver.NAME) << 16);
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr[i14] & DefaultClassResolver.NAME) << 8);
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return (bArr[i16] & DefaultClassResolver.NAME) | i15;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = ((bArr[i10] & DefaultClassResolver.NAME) << 24) >> 8;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr[i12] & DefaultClassResolver.NAME) << 8);
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return (bArr[i14] & DefaultClassResolver.NAME) | i13;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & DefaultClassResolver.NAME;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr[i12] & DefaultClassResolver.NAME) << 8);
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr[i14] & DefaultClassResolver.NAME) << 16);
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return ((bArr[i16] & DefaultClassResolver.NAME) << 24) | i15;
    }

    public final int A0B() {
        int A0A = A0A();
        if (A0A >= 0) {
            return A0A;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A0A);
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & DefaultClassResolver.NAME;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return ((bArr[i12] & DefaultClassResolver.NAME) << 8) | i11;
    }

    public final int A0D() {
        int b22 = A0E();
        int b12 = A0E();
        int b42 = A0E();
        int b32 = A0E();
        int b23 = (b22 << 21) | (b12 << 14);
        int b13 = b42 << 7;
        return b23 | b13 | b32;
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        return bArr[i10] & DefaultClassResolver.NAME;
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = (bArr[i12] & DefaultClassResolver.NAME) | i11;
        int result = this.A02;
        this.A02 = result + 2;
        return i13;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & DefaultClassResolver.NAME) << 16;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr[i12] & DefaultClassResolver.NAME) << 8);
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return (bArr[i14] & DefaultClassResolver.NAME) | i13;
    }

    public final int A0H() {
        int A08 = A08();
        if (A08 >= 0) {
            return A08;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A08);
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (bArr[i12] & DefaultClassResolver.NAME) | i11;
    }

    public final long A0J() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = bArr[r1] & 255;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr[r1] & 255) << 8);
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr[r1] & 255) << 16);
        this.A02 = this.A02 + 1;
        long j13 = j12 | ((bArr[r1] & 255) << 24);
        this.A02 = this.A02 + 1;
        long j14 = j13 | ((bArr[r1] & 255) << 32);
        this.A02 = this.A02 + 1;
        long j15 = j14 | ((bArr[r1] & 255) << 40);
        this.A02 = this.A02 + 1;
        long j16 = j15 | ((bArr[r1] & 255) << 48);
        this.A02 = this.A02 + 1;
        return j16 | ((255 & bArr[r1]) << 56);
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = bArr[r1] & 255;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr[r1] & 255) << 8);
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr[r1] & 255) << 16);
        this.A02 = this.A02 + 1;
        return j12 | ((255 & bArr[r1]) << 24);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = (bArr[r1] & 255) << 56;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr[r1] & 255) << 48);
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr[r1] & 255) << 40);
        this.A02 = this.A02 + 1;
        long j13 = j12 | ((bArr[r1] & 255) << 32);
        this.A02 = this.A02 + 1;
        long j14 = j13 | ((bArr[r1] & 255) << 24);
        this.A02 = this.A02 + 1;
        long j15 = j14 | ((bArr[r1] & 255) << 16);
        this.A02 = this.A02 + 1;
        long j16 = j15 | ((bArr[r1] & 255) << 8);
        this.A02 = this.A02 + 1;
        return j16 | (255 & bArr[r1]);
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = (bArr[r1] & 255) << 24;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr[r1] & 255) << 16);
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr[r1] & 255) << 8);
        this.A02 = this.A02 + 1;
        return j12 | (255 & bArr[r1]);
    }

    public final long A0N() {
        long A0L = A0L();
        if (A0L >= 0) {
            return A0L;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A0L);
    }

    public final long A0O() {
        int i10 = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j10 = bArr[length];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            int length2 = 1 << i11;
            long j11 = length2 & j10;
            if (A04[3].charAt(7) == 'H') {
                throw new RuntimeException();
            }
            A04[7] = "lhGNf9ZIwuKG";
            if (j11 != 0) {
                i11--;
            } else if (i11 < 6) {
                int length3 = 1 << i11;
                j10 &= length3 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        if (i10 != 0) {
            int x10 = 1;
            while (x10 < i10) {
                byte[] bArr2 = this.A00;
                int length4 = this.A02;
                byte b10 = bArr2[length4 + x10];
                if ((b10 & 192) == 128) {
                    long j12 = j10 << 6;
                    String[] strArr = A04;
                    String str = strArr[5];
                    String str2 = strArr[6];
                    int charAt = str.charAt(9);
                    int length5 = str2.charAt(9);
                    if (charAt != length5) {
                        A04[7] = "BvJ8XuqLfWkj";
                        int length6 = b10 & 63;
                        j10 = j12 | length6;
                        x10 += 0;
                    } else {
                        A04[7] = "bl64THqm1YbP";
                        int length7 = b10 & 63;
                        j10 = j12 | length7;
                        x10++;
                    }
                } else {
                    throw new NumberFormatException(A00(0, 42, 126) + j10);
                }
            }
            int length8 = this.A02;
            this.A02 = length8 + i10;
            return j10;
        }
        throw new NumberFormatException(A00(42, 35, 92) + j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r0 == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if (r0 == r3) goto L34;
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x002c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0P() {
        /*
            r6 = this;
            int r0 = r6.A04()
            if (r0 != 0) goto L28
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.HV.A04
            r0 = 3
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L22
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HV.A04
            java.lang.String r1 = "Lp13SRVWSAlchtHB237WPpHnlSgF4gaJ"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "rKST0dS6uAv5sauBNsTeIX1rNmAgPgcE"
            r0 = 6
            r2[r0] = r1
            return r3
        L22:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            int r5 = r6.A02
        L2a:
            int r0 = r6.A01
            if (r5 >= r0) goto L3b
            byte[] r0 = r6.A00
            r0 = r0[r5]
            boolean r0 = com.facebook.ads.redexgen.X.C0940Hl.A0d(r0)
            if (r0 != 0) goto L3b
            int r5 = r5 + 1
            goto L2a
        L3b:
            int r4 = r6.A02
            int r0 = r5 - r4
            r3 = 3
            if (r0 < r3) goto L5d
            byte[] r2 = r6.A00
            r1 = r2[r4]
            r0 = -17
            if (r1 != r0) goto L5d
            int r0 = r4 + 1
            r1 = r2[r0]
            r0 = -69
            if (r1 != r0) goto L5d
            int r0 = r4 + 2
            r1 = r2[r0]
            r0 = -65
            if (r1 != r0) goto L5d
            int r4 = r4 + r3
            r6.A02 = r4
        L5d:
            byte[] r2 = r6.A00
            int r1 = r6.A02
            int r0 = r5 - r1
            java.lang.String r4 = com.facebook.ads.redexgen.X.C0940Hl.A0R(r2, r1, r0)
            r6.A02 = r5
            int r2 = r6.A02
            int r3 = r6.A01
            if (r2 != r3) goto L70
            return r4
        L70:
            byte[] r0 = r6.A00
            r1 = r0[r2]
            r0 = 13
            if (r1 != r0) goto La5
            int r0 = r2 + 1
            r6.A02 = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.HV.A04
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HV.A04
            java.lang.String r1 = "7WLwSFEg60VT5h1w5xCSRnUKgnyD8yNS"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "aRAvn4znRhpfiIQyr1UPz3MngzOxDO2U"
            r0 = 0
            r2[r0] = r1
            int r0 = r6.A02
            if (r0 != r3) goto La5
        L98:
            return r4
        L99:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HV.A04
            java.lang.String r1 = "q7voCOqIwzwrpNWuoMFHLwpJUMmmskbB"
            r0 = 3
            r2[r0] = r1
            int r0 = r6.A02
            if (r0 != r3) goto La5
            goto L98
        La5:
            byte[] r0 = r6.A00
            int r2 = r6.A02
            r1 = r0[r2]
            r0 = 10
            if (r1 != r0) goto Lb3
            int r0 = r2 + 1
            r6.A02 = r0
        Lb3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HV.A0P():java.lang.String");
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A0Q() {
        /*
            r4 = this;
            int r0 = r4.A04()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r4.A02
        La:
            int r0 = r4.A01
            if (r3 >= r0) goto L17
            byte[] r0 = r4.A00
            r0 = r0[r3]
            if (r0 == 0) goto L17
            int r3 = r3 + 1
            goto La
        L17:
            byte[] r2 = r4.A00
            int r1 = r4.A02
            int r0 = r3 - r1
            java.lang.String r2 = com.facebook.ads.redexgen.X.C0940Hl.A0R(r2, r1, r0)
            r4.A02 = r3
            int r1 = r4.A02
            int r0 = r4.A01
            if (r1 >= r0) goto L2d
            int r0 = r1 + 1
            r4.A02 = r0
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HV.A0Q():java.lang.String");
    }

    public final String A0R(int i10) {
        if (i10 == 0) {
            return A00(0, 0, 47);
        }
        int i11 = i10;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i10) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i11--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String A0R = C0940Hl.A0R(bArr, stringLength4, i11);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i10;
        return A0R;
    }

    public final String A0S(int i10) {
        return A0T(i10, Charset.forName(A00(95, 5, 98)));
    }

    public final String A0T(int i10, Charset charset) {
        String str = new String(this.A00, this.A02, i10, charset);
        this.A02 += i10;
        return str;
    }

    public final short A0U() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & DefaultClassResolver.NAME) << 8;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (short) ((bArr[i12] & DefaultClassResolver.NAME) | i11);
    }

    public final void A0V() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0W(int i10) {
        A0b(A05() < i10 ? new byte[i10] : this.A00, i10);
    }

    public final void A0X(int i10) {
        H6.A03(i10 >= 0 && i10 <= this.A00.length);
        this.A01 = i10;
    }

    public final void A0Y(int i10) {
        H6.A03(i10 >= 0 && i10 <= this.A01);
        this.A02 = i10;
    }

    public final void A0Z(int i10) {
        A0Y(this.A02 + i10);
    }

    public final void A0a(HU hu, int i10) {
        A0c(hu.A00, 0, i10);
        hu.A07(0);
    }

    public final void A0b(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
        this.A02 = 0;
    }

    public final void A0c(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.A00, this.A02, bArr, i10, i11);
        this.A02 += i11;
    }
}
