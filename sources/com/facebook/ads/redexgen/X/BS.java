package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class BS {
    public static byte[] A02;
    public static String[] A03 = {"di8Sf9Pe7Jbfr41S9La3sE0XUXUbIcTt", "VdReIzyhJEkxgwUPMqeI1KmebCO9QkDh", "oL0VvX6tDLEIK9z1dEY1PtjpuEVwAQ4k", "mKzHDdQgrsp66MEU970RQbCyF", "y1nS2Utxj9rUbNITrIgIYwtdoX0kLvBw", "fSxpMgDRgawYiaXZH4Uz0154e", "ZtMJpUGbuzN6IhF", "0I28Lm89b1qn6II"};
    public static final DE A04;
    public static final Pattern A05;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].charAt(0) == strArr[0].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "HJDAX8MhmPuczgxrb1BIwyZzboPzSHEz";
            strArr2[1] = "hQdnt0euFC7WLrk25AhIcQLHRa72NrIb";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 127);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{47, -15, 44, 1, -2, 10, 50, -2, 55, Ascii.DC2, -2, Ascii.ETB, 46, 76, 9, 78, -15, -7, 44, 1, -2, 10, 50, -2, 55, Ascii.DC2, -2, Ascii.ETB, 46, 76, 9, 78, -6, -15, -7, 44, 1, -2, 10, 50, -2, 55, Ascii.DC2, -2, Ascii.ETB, 46, 76, 9, 78, -6, 71, 83, 81, Ascii.DC2, 69, 84, 84, 80, 73, Ascii.DC2, 77, 56, 89, 82, 73, 87, 77, 56, 89, 82, 55, 49, 52, 38};
    }

    static {
        A01();
        A04 = new C1283Vc();
        A05 = Pattern.compile(A00(0, 50, 82));
    }

    private boolean A02(String str) {
        Matcher matcher = A05.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.A00 = parseInt;
                    this.A01 = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i10) {
        int encoderPadding = i10 >> 12;
        int encoderDelay = i10 & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        String[] strArr = A03;
        if (strArr[2].charAt(0) == strArr[0].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[3] = "eE8liYxgzzft2czJer5Cb1MId";
        strArr2[5] = "8t68lQEI2igrSMQNmlK51xizE";
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(com.facebook.ads.internal.exoplayer2.metadata.Metadata r9) {
        /*
            r8 = this;
            r4 = 0
        L1:
            int r0 = r9.A00()
            if (r4 >= r0) goto L7e
            com.facebook.ads.internal.exoplayer2.metadata.Metadata$Entry r5 = r9.A01(r4)
            boolean r3 = r5 instanceof com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame
            r2 = 66
            r1 = 8
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r6 = A00(r2, r1, r0)
            r7 = 1
            if (r3 == 0) goto L2d
            com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame r5 = (com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame) r5
            java.lang.String r0 = r5.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L75
            java.lang.String r0 = r5.A02
            boolean r0 = r8.A02(r0)
            if (r0 == 0) goto L75
            return r7
        L2d:
            boolean r3 = r5 instanceof com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BS.A03
            r0 = 2
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L78
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.BS.A03
            java.lang.String r1 = "JUr596XT5dN8x1JiD53IGmhrrDc6hzgO"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "1JQdlsQIbSDn6BLSr5BIwZm7GWHfhsN6"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L75
            com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame r5 = (com.facebook.ads.internal.exoplayer2.metadata.id3.InternalFrame) r5
            java.lang.String r3 = r5.A01
            r2 = 50
            r1 = 16
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L75
            java.lang.String r0 = r5.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L75
            java.lang.String r0 = r5.A02
            boolean r0 = r8.A02(r0)
            if (r0 == 0) goto L75
            return r7
        L75:
            int r4 = r4 + 1
            goto L1
        L78:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L7e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.BS.A05(com.facebook.ads.internal.exoplayer2.metadata.Metadata):boolean");
    }
}
