package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8Q {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static C8S A00(C1315Wi c1315Wi) {
        try {
            return new W9(c1315Wi);
        } catch (IOException e10) {
            c1315Wi.A06().A8u(A02(0, 15, 89), C06977l.A2J, new C06987m(e10));
            return new WC();
        }
    }

    public static D7 A01(C1315Wi c1315Wi) {
        return new D7(c1315Wi);
    }
}
