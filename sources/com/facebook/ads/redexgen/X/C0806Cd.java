package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0806Cd {
    public static byte[] A02;
    public final List<Format> A00;
    public final InterfaceC0789Ba[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-91, -54, -46, -67, -56, -59, -64, 124, -65, -56, -53, -49, -63, -64, 124, -65, -67, -52, -48, -59, -53, -54, 124, -55, -59, -55, -63, 124, -48, -43, -52, -63, 124, -52, -50, -53, -46, -59, -64, -63, -64, -106, 124, -110, -95, -95, -99, -102, -108, -110, -91, -102, -96, -97, 96, -108, -106, -110, 94, 103, 97, 105, -33, -18, -18, -22, -25, -31, -33, -14, -25, -19, -20, -83, -31, -29, -33, -85, -75, -82, -74};
    }

    public C0806Cd(List<Format> closedCaptionFormats) {
        this.A00 = closedCaptionFormats;
        this.A01 = new InterfaceC0789Ba[closedCaptionFormats.size()];
    }

    public final void A02(long j10, HV hv) {
        FU.A03(j10, hv, this.A01);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.facebook.ads.redexgen.X.BQ r16, com.facebook.ads.redexgen.X.C0811Ci r17) {
        /*
            r15 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.Ba[] r0 = r15.A01
            int r0 = r0.length
            if (r2 >= r0) goto L7e
            r17.A05()
            int r1 = r17.A03()
            r0 = 3
            r3 = r16
            com.facebook.ads.redexgen.X.Ba r1 = r3.AF2(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.Format> r0 = r15.A00
            java.lang.Object r5 = r0.get(r2)
            com.facebook.ads.internal.exoplayer2.Format r5 = (com.facebook.ads.internal.exoplayer2.Format) r5
            java.lang.String r8 = r5.A0O
            r4 = 43
            r3 = 19
            r0 = 42
            java.lang.String r0 = A00(r4, r3, r0)
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L3e
            r4 = 62
            r3 = 19
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r0 = A00(r4, r3, r0)
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L7c
        L3e:
            r7 = 1
        L3f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r4 = 0
            r3 = 43
            r0 = 85
            java.lang.String r0 = A00(r4, r3, r0)
            r6.append(r0)
            r6.append(r8)
            java.lang.String r0 = r6.toString()
            com.facebook.ads.redexgen.X.H6.A05(r7, r0)
            java.lang.String r0 = r5.A0M
            if (r0 == 0) goto L77
            java.lang.String r7 = r5.A0M
        L60:
            r9 = 0
            r10 = -1
            int r11 = r5.A0D
            java.lang.String r12 = r5.A0N
            int r13 = r5.A03
            r14 = 0
            com.facebook.ads.internal.exoplayer2.Format r0 = com.facebook.ads.internal.exoplayer2.Format.A08(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A5T(r0)
            com.facebook.ads.redexgen.X.Ba[] r0 = r15.A01
            r0[r2] = r1
            int r2 = r2 + 1
            goto L1
        L77:
            java.lang.String r7 = r17.A04()
            goto L60
        L7c:
            r7 = 0
            goto L3f
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0806Cd.A03(com.facebook.ads.redexgen.X.BQ, com.facebook.ads.redexgen.X.Ci):void");
    }
}
