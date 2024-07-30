package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.openalliance.ad.constant.ag;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum O5 {
    A0A(A01(310, 10, 13)),
    A0E(A01(351, 24, 96)),
    A03(A01(244, 13, 76)),
    A06(A01(281, 18, 105)),
    A05(A01(262, 19, 19)),
    A0D(A01(341, 10, 39)),
    A0F(A01(375, 3, 12)),
    A04(A01(257, 5, 2)),
    A09(A01(304, 6, 81)),
    A0H(A01(388, 10, 14)),
    A0M(A01(457, 15, 119)),
    A07(A01(299, 5, 1)),
    A0G(A01(378, 10, 20)),
    A0C(A01(331, 10, 83)),
    A0N(A01(472, 10, 4)),
    A0K(A01(418, 10, 38)),
    A0J(A01(ag.f22002m, 11, 121)),
    A0P(A01(482, 12, 102)),
    A0L(A01(446, 11, 11)),
    A0B(A01(320, 11, 93)),
    A08(A01(428, 18, 20)),
    A0I(A01(398, 9, 16)),
    A0O(A01(0, 0, 107));

    public static byte[] A01;
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-21, -12, -9, -5, -19, 7, -22, -6, -9, -1, -5, -19, -6, -44, -43, -46, -27, -41, -82, -77, -67, -85, -84, -74, -81, -55, -84, -85, -83, -75, -55, -84, -65, -66, -66, -71, -72, -25, -16, -29, -28, -18, -25, 1, -28, -29, -27, -19, 1, -28, -9, -10, -10, -15, -16, -40, -27, -27, -30, -27, -12, 3, -6, -6, 1, -15, 0, -13, -13, -4, Ascii.SYN, 37, Ascii.RS, Ascii.RS, Ascii.NAK, Ascii.FS, -41, -48, -35, -45, -37, -44, -18, -46, -29, -48, -62, -69, -56, -66, -58, -65, -39, -64, -68, -52, -48, Ascii.DC4, Ascii.NAK, Ascii.DLE, 17, 43, 34, Ascii.NAK, Ascii.DLE, 17, Ascii.ESC, Ascii.NAK, Ascii.EM, Ascii.FS, Ascii.RS, 17, Ascii.US, Ascii.US, Ascii.NAK, Ascii.ESC, Ascii.SUB, Ascii.EM, Ascii.SO, 34, Ascii.ESC, Ascii.DLE, Ascii.NAK, 44, Ascii.SO, 17, 44, Ascii.US, Ascii.DC2, Ascii.GS, Ascii.FS, Ascii.US, 33, Ascii.SYN, Ascii.ESC, Ascii.DC4, -22, -19, -27, -30, -22, -23, -38, -12, -21, -34, -39, -38, -28, -33, -42, -24, -16, -41, -26, -33, -33, -42, -35, -24, -23, -34, -25, -8, -27, -30, -25, -28, -31, -46, -26, -28, -42, -16, -25, -38, -43, -42, -32, -20, -24, -35, -11, -5, -14, -27, -32, -31, -21, Ascii.FS, Ascii.SI, Ascii.VT, Ascii.SO, 41, Ascii.GS, Ascii.RS, Ascii.FS, 19, Ascii.CAN, 17, -2, -15, 3, -19, -2, -16, Ascii.VT, -17, -5, -7, -4, -8, -15, 0, -15, -75, -83, -85, -78, -63, -72, -85, -90, -89, -79, -36, -43, -46, -43, -42, -34, -43, -37, -42, -51, -40, -55, -29, -41, -40, -42, -51, -46, -53, Ascii.VT, Ascii.DC4, Ascii.ETB, Ascii.ESC, Ascii.CR, 7, 10, Ascii.SUB, Ascii.ETB, Ascii.US, Ascii.ESC, Ascii.CR, Ascii.SUB, -62, -61, -64, -45, -59, -45, -40, -30, -48, -47, -37, -44, -50, -47, -48, -46, -38, -50, -47, -28, -29, -29, -34, -35, 42, 51, 38, 39, 49, 42, 36, 39, 38, 40, 48, 36, 39, 58, 57, 57, 52, 51, -62, -49, -49, -52, -49, 19, 34, Ascii.ESC, Ascii.ESC, Ascii.DC2, Ascii.EM, -47, -54, -41, -51, -43, -50, -56, -52, -35, -54, 33, Ascii.SUB, 39, Ascii.GS, 37, Ascii.RS, Ascii.CAN, Ascii.US, Ascii.ESC, 43, 47, Ascii.ETB, Ascii.CAN, 19, Ascii.DC4, Ascii.SO, 37, Ascii.CAN, 19, Ascii.DC4, Ascii.RS, -20, -16, -13, -11, -24, -10, -10, -20, -14, -15, 40, Ascii.GS, 49, 42, Ascii.US, 36, Ascii.ESC, Ascii.GS, 32, Ascii.ESC, 46, 33, 44, 43, 46, 48, 37, 42, 35, Ascii.ESC, 34, 40, 43, 51, -44, -41, -49, -35, -27, -28, -43, -49, -26, -39, -44, -43, -33, -40, -49, -31, -55, -48, -33, -40, -40, -49, -42, -37, -36, -47, -38, -53, -40, -43, -38, -41, 69, 54, 74, 72, 58, 52, 75, 62, 57, 58, 68, -14, -18, -29, -5, -31, -8, -21, -26, -25, -15, -32, -30, -43, -29, -43, -34, -28, -49, -42, -27, -36, -36, -29, -45, -30, -43, -43, -34, -39, -52, -56, -53, -58, -38, -37, -39, -48, -43, -50, 69, 56, 74, 52, 69, 55, 50, 54, 66, 64, 67, 63, 56, 71, 56, -45, -53, -55, -48, -65, -42, -55, -60, -59, -49, 57, 52, 43, 54, 39, 33, 53, 54, 52, 43, 48, 41};
    }

    static {
        A02();
    }

    O5(String str) {
        this.A00 = str;
    }

    public static O5 A00(String str) {
        for (O5 o52 : values()) {
            if (o52.A00.equalsIgnoreCase(str)) {
                return o52;
            }
        }
        return A0O;
    }
}
