package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class RJ extends AbstractRunnableC0997Ju {
    public static byte[] A02;
    public final /* synthetic */ C1092No A00;
    public final /* synthetic */ C06826r A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, 63, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public RJ(C1092No c1092No, C06826r c06826r) {
        this.A00 = c1092No;
        this.A01 = c06826r;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        P1 p12;
        P1 p13;
        p12 = this.A00.A0D;
        if (p12.getState() == EnumC1134Pf.A02) {
            p13 = this.A00.A0D;
            if (p13.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 49));
            }
        }
    }
}
