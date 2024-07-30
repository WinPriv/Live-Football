package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class RO implements InterfaceC1098Nv {
    public static byte[] A01;
    public static String[] A02 = {"0PGepnyvQncL93SwwJBKfYdUcygiJGu5", "mA1Oa6p2jIMu30EggfbRnzpoMhUl4ssl", "uwNPSbrm", "iNgEEx1gRKfrkJTOWqECaM4K08S9ZrIg", "vqVg9oljZl3AjvyleCGqLOYkhmYrxu", "amhtUlMIP3hZuFCKepG62aSokShv2UYv", "BTFyXEOVMEP0nOw0jY0q9zOCSLZ2OeYc", "tcCWg0XVw1JTHEC59N6ZXoklrHSl9wSv"};
    public final /* synthetic */ C07268o A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
            String[] strArr = A02;
            if (strArr[0].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "WujDwNVbN3bAuExlfya79vhQsxgnNgQM";
            strArr2[5] = "dVRJVduTnq2Mgx4vxcEM2Hhpe9jWwRq5";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{91, 90, 44, 111, 126, 109, Ascii.DEL, 100, 105, 104, 87, 69, 66, Ascii.DEL, 86, 73, 69, 87};
    }

    static {
        A01();
    }

    public RO(C07268o c07268o) {
        this.A00 = c07268o;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1098Nv
    public final void ABr() {
        C1315Wi context = C7F.A00();
        if (context != null) {
            context.A06().A8u(A00(10, 8, 19), C06977l.A2d, new C06987m(A00(0, 10, 63)));
        }
    }
}
