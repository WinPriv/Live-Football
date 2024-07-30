package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05571o {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.EM, 95, 67, 90, 91, 124, 107, 121, 111, 124, 106, 107, 106, 81, 120, 103, 106, 107, 97};
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x00d3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(com.facebook.ads.redexgen.X.C1316Wj r12, com.facebook.ads.redexgen.X.C6G r13, com.facebook.ads.redexgen.X.C1371Yo r14) {
        /*
            com.facebook.ads.redexgen.X.6E r3 = new com.facebook.ads.redexgen.X.6E
            com.facebook.ads.redexgen.X.1U r0 = r14.A0R()
            java.lang.String r4 = r0.A01()
            int r5 = com.facebook.ads.redexgen.X.OL.A04
            int r6 = com.facebook.ads.redexgen.X.OL.A04
            java.lang.String r7 = r14.A0Z()
            r2 = 5
            r1 = 14
            r0 = 28
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0c(r3)
            boolean r6 = r14.A0r()
            if (r6 == 0) goto L4d
            java.lang.String r5 = r14.A0V()
            java.lang.String r4 = r14.A0Z()
            r2 = 5
            r1 = 14
            r0 = 28
            java.lang.String r0 = A00(r2, r1, r0)
            com.facebook.ads.redexgen.X.6C r3 = new com.facebook.ads.redexgen.X.6C
            r3.<init>(r5, r4, r0)
            r0 = 1
            r3.A04 = r0
            r2 = 0
            r1 = 5
            r0 = 37
            java.lang.String r0 = A00(r2, r1, r0)
            r3.A03 = r0
            r13.A0X(r3)
        L4d:
            boolean r0 = com.facebook.ads.redexgen.X.PS.A03()
            boolean r3 = com.facebook.ads.redexgen.X.ID.A29(r12, r0)
            com.facebook.ads.redexgen.X.1B r0 = r14.A0O()
            com.facebook.ads.redexgen.X.1E r0 = r0.A0D()
            java.lang.String r8 = r0.A08()
            com.facebook.ads.redexgen.X.6C r7 = new com.facebook.ads.redexgen.X.6C
            java.lang.String r9 = r14.A0Z()
            com.facebook.ads.redexgen.X.1B r0 = r14.A0O()
            com.facebook.ads.redexgen.X.1E r0 = r0.A0D()
            long r11 = r0.A05()
            r2 = 5
            r1 = 14
            r0 = 28
            java.lang.String r10 = A00(r2, r1, r0)
            r7.<init>(r8, r9, r10, r11)
            if (r6 == 0) goto Lf3
            if (r3 != 0) goto Lf3
            r13.A0X(r7)
        L86:
            com.facebook.ads.redexgen.X.6E r3 = new com.facebook.ads.redexgen.X.6E
            com.facebook.ads.redexgen.X.1B r0 = r14.A0O()
            com.facebook.ads.redexgen.X.1E r0 = r0.A0D()
            java.lang.String r4 = r0.A07()
            com.facebook.ads.redexgen.X.1B r0 = r14.A0O()
            com.facebook.ads.redexgen.X.1E r0 = r0.A0D()
            int r5 = com.facebook.ads.redexgen.X.C05521j.A00(r0)
            com.facebook.ads.redexgen.X.1B r0 = r14.A0O()
            com.facebook.ads.redexgen.X.1E r0 = r0.A0D()
            int r6 = com.facebook.ads.redexgen.X.C05521j.A01(r0)
            java.lang.String r7 = r14.A0Z()
            r2 = 5
            r1 = 14
            r0 = 28
            java.lang.String r8 = A00(r2, r1, r0)
            r3.<init>(r4, r5, r6, r7, r8)
            r13.A0c(r3)
            com.facebook.ads.redexgen.X.1B r0 = r14.A0O()
            com.facebook.ads.redexgen.X.1M r0 = r0.A0G()
            java.util.List r0 = r0.A00()
            java.util.Iterator r3 = r0.iterator()
        Lcf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lf7
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            com.facebook.ads.redexgen.X.6E r4 = new com.facebook.ads.redexgen.X.6E
            r6 = -1
            r7 = -1
            java.lang.String r8 = r14.A0Z()
            r2 = 5
            r1 = 14
            r0 = 28
            java.lang.String r9 = A00(r2, r1, r0)
            r4.<init>(r5, r6, r7, r8, r9)
            r13.A0c(r4)
            goto Lcf
        Lf3:
            r13.A0a(r7)
            goto L86
        Lf7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C05571o.A02(com.facebook.ads.redexgen.X.Wj, com.facebook.ads.redexgen.X.6G, com.facebook.ads.redexgen.X.Yo):void");
    }
}
