package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YD implements AnonymousClass22 {
    public static byte[] A04;
    public static String[] A05 = {"PyT2XUnl", "3EmvKqRjFYzRkizxlD8eotggUBC8U5J9", "Ib6uyfMRsh5ysHZ3i8ryXk3sO16qq9Ys", "q2kkzr74cnXMazMYxmC9c", "9U931lGThJH7Qz6wctlm6EKEWHFtvDAV", "f15MquYM06llw3BWZWASFwAp5egI2HKX", "yMUgiPhi", "t3xZZPMR"};
    public final YP A00;
    public final InterfaceC05641v A01;
    public final AnonymousClass20 A02;
    public final C1316Wj A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-77, -42, -110, -31, -44, -36, -41, -43, -26, -110, -37, -27, -110, -32, -25, -34, -34, -115, -96, -103, -113, -105, -112, -86, -112, -93, -97, -99, -116, -98, -86, -106, -112, -92, -74, -78, -79, -27, -44, -39, -43, -34, -45, -43, -66, -43, -28, -25, -33, -30, -37, -87, -82, -76, -65, -91, -78, -78, -81, -78, -65, -93, -81, -92, -91, -65, -85, -91, -71, 4, 7, 6, -1, Ascii.ETB, 1, 6, Ascii.SO, -7, 4, 1, -4, -7, Ascii.FF, 1, 7, 6, Ascii.ETB, Ascii.FF, 1, 5, -3, Ascii.ETB, 3, -3, 17, -61, -37, -23, -23, -41, -35, -37, -80, -106, -66, -38, -28, -28, -38, -33, -40, -111, -45, -26, -33, -43, -35, -42, -111, -41, -32, -29, -111, -34, -42, -28, -28, -46, -40, -42, -97, -95, -94, -96, -83, -109, -96, -96, -99, -96, -83, -101, -109, -95, -95, -113, -107, -109, -83, -103, -109, -89, 4, 19, Ascii.FF};
    }

    static {
        A01();
    }

    public YD(C1316Wj c1316Wj, AnonymousClass20 anonymousClass20, InterfaceC05641v interfaceC05641v, YP yp) {
        this.A03 = c1316Wj;
        this.A02 = anonymousClass20;
        this.A01 = interfaceC05641v;
        this.A00 = yp;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x00ce. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A7y(android.os.Message r12) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.YD.A7y(android.os.Message):void");
    }
}
