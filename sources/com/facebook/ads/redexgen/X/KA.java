package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class KA implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1316Wj A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public KA(C1316Wj c1316Wj) {
        this.A00 = c1316Wj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            C06987m c06987m = new C06987m(A00(0, 4, 88));
            c06987m.A03(1);
            c06987m.A04(1);
            c06987m.A08(false);
            this.A00.A06().A8v(A00(4, 7, 112), C06977l.A1Y, c06987m);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
