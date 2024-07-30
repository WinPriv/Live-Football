package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC05200c {
    A09(A00(103, 5, 27)),
    A07(A00(90, 5, 74)),
    A03(A00(54, 8, 22)),
    A08(A00(95, 8, 13)),
    A04(A00(62, 10, 107)),
    A06(A00(81, 9, 102)),
    A05(A00(72, 9, 56));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 17, 2, Ascii.US, 5, 3, Ascii.NAK, Ascii.FS, Ascii.ETB, 0, Ascii.US, Ascii.FF, Ascii.ESC, 10, 17, 1, Ascii.SUB, Ascii.ETB, 116, 99, 124, 111, 121, 125, 113, 119, 117, Ascii.SYN, 1, Ascii.RS, Ascii.CR, 4, Ascii.ESC, Ascii.SYN, Ascii.ETB, Ascii.GS, 101, 97, 109, 107, 105, 78, 82, 95, 71, 95, 92, 82, 91, 92, 67, 78, 79, 69, 71, 69, 86, 75, 81, 87, 65, 72, 61, 42, 53, 6, 49, 32, 59, 43, 48, 61, 110, 121, 102, 85, 99, 103, 107, 109, 111, 48, 39, 56, Ascii.VT, 34, 61, 48, 49, 59, 17, Ascii.NAK, Ascii.EM, Ascii.US, Ascii.GS, 79, 83, 94, 70, 94, 93, 83, 90, 95, 64, 77, 76, 70};
    }

    static {
        A01();
    }

    EnumC05200c(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
