package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class A6 extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{95, 55, 5, 83, 95, 111, 44, 39, 46, 33, 33, 42, 35, 60, 111, 38, 33, 111, 42, 33, 44, 32, 43, 38, 33, 40, 111, 65, 122, 124, 117, 122, 112, 120, 113, 112, 52, 114, 123, 102, 121, 117, 96, 46, 52};
    }

    public A6(int i10, int i11, int i12) {
        super(A00(27, 18, 12) + i10 + A00(0, 5, 103) + i11 + A00(5, 22, 87) + i12);
    }
}
