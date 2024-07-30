package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class R5 extends AbstractRunnableC0997Ju {
    public static byte[] A02;
    public final /* synthetic */ C7C A00;
    public final /* synthetic */ C06826r A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public R5(C7C c7c, C06826r c06826r) {
        this.A00 = c7c;
        this.A01 = c06826r;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        P1 p12;
        P1 p13;
        p12 = this.A00.A0B;
        if (p12.getState() == EnumC1134Pf.A02) {
            p13 = this.A00.A0B;
            if (p13.getCurrentPositionInMillis() == A00()) {
                this.A00.A0G(A00(0, 22, 11));
            }
        }
    }
}
