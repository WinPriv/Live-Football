package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class RL extends AbstractRunnableC0997Ju {
    public static byte[] A01;
    public final /* synthetic */ C1092No A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{5, 58, 55, 54, 60, 115, 61, 54, 37, 54, 33, 115, 32, 39, 50, 33, 39, 54, 55, 115, 35, 63, 50, 42, 58, 61, 52};
    }

    public RL(C1092No c1092No) {
        this.A00 = c1092No;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        boolean z10;
        z10 = this.A00.A04;
        if (!z10) {
            this.A00.A0I(A00(0, 27, 122));
        }
    }
}
