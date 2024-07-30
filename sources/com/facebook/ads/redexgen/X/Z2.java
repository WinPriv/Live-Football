package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Z2 extends AbstractRunnableC0997Ju {
    public static byte[] A01;
    public final /* synthetic */ Z1 A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public Z2(Z1 z12) {
        this.A00 = z12;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C1316Wj c1316Wj;
        AbstractC1070Ms abstractC1070Ms;
        Z3 z32;
        c1316Wj = this.A00.A02;
        c1316Wj.A0D().AFM();
        abstractC1070Ms = this.A00.A04;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A00(0, 11, 35));
        z32 = this.A00.A00;
        sb2.append(z32.A03());
        abstractC1070Ms.loadUrl(sb2.toString());
    }
}
