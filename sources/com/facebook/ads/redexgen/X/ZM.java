package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZM extends AbstractC05230f {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, Byte.MIN_VALUE, 50, 126, 123, Byte.MIN_VALUE, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = ZM.class.getSimpleName();
    }

    public ZM(C1316Wj c1316Wj, IT it, String str, Uri uri) {
        super(c1316Wj, it, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05230f
    public final void A0C() {
        try {
            KL.A0A(new KL(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
    }
}
