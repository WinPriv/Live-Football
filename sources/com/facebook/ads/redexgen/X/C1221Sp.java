package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1221Sp extends AbstractRunnableC0997Ju {
    public static byte[] A01;
    public static String[] A02 = {"HdBP5Xz", "1x1Spdd4leaR6rMyIqz7jDuVALPBafGP", "axXL5TnL0HBMXsVKsrA9GDOWQxSG9OY6", "1dEgnVHIT0m43fI6JYH9hpNhfyiBWS6N", "iEi5yE", "UjLwzpYsoJIrFySVWBkKISpV5tCrd9dB", "Qbq65yz", "qKKFep347IAmJ8sue1lLg6VgEBnKG6W3"};
    public final /* synthetic */ JW A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            A02[7] = "vKWhPjbFalI70MxhKihYQQhrE25QXeUX";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 89);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{Ascii.EM, Ascii.FS, Ascii.DLE, Ascii.SO, Ascii.EM, Ascii.FF, 33, Ascii.NAK, Ascii.US, Ascii.FS, 33, 33, Ascii.EM, Ascii.DC2};
    }

    static {
        A02();
    }

    public C1221Sp(JW jw) {
        this.A00 = jw;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C1316Wj c1316Wj;
        c1316Wj = this.A00.A04;
        c1316Wj.A06().A8D(A00(0, 14, 84));
    }
}
