package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum QG {
    A02,
    A03;

    public static byte[] A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-124, -115, -118, -122, -113, -107, -96, -112, -104, -113, -122, -123, -112, -126, -113, -109, -126, -113, -100, -116, -108, -117, -126, -127};
    }

    static {
        A01();
    }
}
