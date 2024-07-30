package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class HY extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{33, 45, 101, 100, 106, 101, 104, 126, 121, 48, 61, Ascii.US, 4, 2, Ascii.US, 4, Ascii.EM, Ascii.DC4, 77, Ascii.EM, 2, 2, 77, 1, 2, Ascii.SUB, 77, 54, Ascii.GS, Ascii.US, 4, 2, Ascii.US, 4, Ascii.EM, Ascii.DC4, 80, 65};
    }

    public HY(int i10, int i11) {
        super(A00(10, 27, 94) + i10 + A00(0, 10, 62) + i11 + A00(37, 1, 47));
    }
}
