package com.facebook.ads.redexgen.X;

import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.m;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BU {
    public static byte[] A07;
    public static String[] A08 = {"nifcRfbON53gzILOru2Jo77QmnI", "", "YclbigHQdqatdiMMFtmKc8uyfonoIz5d", "Fd6hY4xBxF4WCtFqE3EitLo6QTPCTd6g", "7NOpBqgVdvht54TmD9wxn6mxDDhXMYkr", "z0qKCLYmn7ETA7vnAfdm8yGWNV", "FyibQKYxxp5WU6WV5DKbmcaitux", "b6Jzn18op"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-25, -5, -22, -17, -11, -75, -13, -10, -21, -19, Ascii.DC4, 40, Ascii.ETB, Ascii.FS, 34, -30, 32, 35, Ascii.CAN, Ascii.SUB, -32, -1, -28, 0, Ascii.DC4, 3, 8, Ascii.SO, -50, Ascii.FF, Ascii.SI, 4, 6, -52, -21, -47};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A04(int i10, BU bu) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i18 = A0E[i14];
        if (i11 == 2) {
            i18 /= 2;
        } else if (i11 == 0) {
            i18 /= 4;
        }
        int i19 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                int[] iArr = A09;
                int i20 = i13 - 1;
                if (A08[1].length() != 0) {
                    throw new RuntimeException();
                }
                A08[1] = "";
                i15 = iArr[i20];
            } else {
                i15 = A0D[i13 - 1];
            }
            i17 = (((i15 * 12000) / i18) + i19) * 4;
            i16 = 384;
        } else {
            if (i11 == 3) {
                i15 = i12 == 2 ? A0A[i13 - 1] : A0B[i13 - 1];
                i16 = 1152;
                i17 = ((144000 * i15) / i18) + i19;
            } else {
                i15 = A0C[i13 - 1];
                i16 = i12 == 1 ? 576 : 1152;
                i17 = (((i12 == 1 ? 72000 : 144000) * i15) / i18) + i19;
            }
        }
        bu.A03(i11, A0F[3 - i12], i17, i18, ((i10 >> 6) & 3) == 3 ? 1 : 2, i15 * 1000, i16);
        return true;
    }

    static {
        A02();
        A0F = new String[]{A01(10, 13, 78), A01(23, 13, 58), A01(0, 10, 33)};
        A0E = new int[]{44100, 48000, 32000};
        A09 = new int[]{32, 64, 96, 128, 160, 192, 224, 256, a.aW, 320, 352, 384, 416, m.a.f10162a};
        A0D = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};
        A0A = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    }

    public static int A00(int i10) {
        int samplingRateIndex;
        int i11;
        int i12;
        int padding;
        int version;
        if ((i10 & (-2097152)) != -2097152 || (samplingRateIndex = (i10 >>> 19) & 3) == 1 || (i11 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = i10 >>> 12;
        if (A08[1].length() == 0) {
            A08[3] = "b2l2aaEsQdCjJRobZM3AI6pzp0fCTcXg";
            int i14 = i13 & 15;
            if (i14 == 0 || i14 == 15 || (i12 = (i10 >>> 10) & 3) == 3) {
                return -1;
            }
            int i15 = A0E[i12];
            if (samplingRateIndex == 2) {
                i15 /= 2;
            } else if (samplingRateIndex == 0) {
                i15 /= 4;
            }
            int i16 = (i10 >>> 9) & 1;
            if (i11 == 3) {
                if (samplingRateIndex == 3) {
                    int version2 = i14 - 1;
                    version = A09[version2];
                } else {
                    int version3 = i14 - 1;
                    version = A0D[version3];
                }
                int i17 = version * 12000;
                String[] strArr = A08;
                String str = strArr[6];
                String str2 = strArr[0];
                int bitrate = str.length();
                int version4 = str2.length();
                if (bitrate != version4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[4] = "oe92MVCyaQQCtYlB63NB1CxE35U7HQE5";
                strArr2[2] = "cgh7vNrWE365WSGkm1qsPTYGoGRnPBar";
                int version5 = ((i17 / i15) + i16) * 4;
                return version5;
            }
            if (samplingRateIndex == 3) {
                if (i11 == 2) {
                    int version6 = i14 - 1;
                    padding = A0A[version6];
                } else {
                    int version7 = i14 - 1;
                    padding = A0B[version7];
                }
            } else {
                int[] iArr = A0C;
                String[] strArr3 = A08;
                String str3 = strArr3[6];
                String str4 = strArr3[0];
                int length = str3.length();
                int version8 = str4.length();
                if (length != version8) {
                    String[] strArr4 = A08;
                    strArr4[7] = "UFIEXEz4g";
                    strArr4[5] = "u6DSTaNAwdJldo1ZeFLEjMNQPO";
                    int version9 = i14 - 1;
                    padding = iArr[version9];
                } else {
                    A08[3] = "uh43YA7kDZkFV42L4FFbPgJOsOuCYlNO";
                    int version10 = i14 - 1;
                    padding = iArr[version10];
                }
            }
            String[] strArr5 = A08;
            String str5 = strArr5[4];
            String str6 = strArr5[2];
            int charAt = str5.charAt(29);
            int version11 = str6.charAt(29);
            if (charAt != version11) {
                String[] strArr6 = A08;
                strArr6[7] = "EFM751Hfm";
                strArr6[5] = "lrmHfueLLigjg4doS9Ay4icuU4";
                if (samplingRateIndex == 3) {
                    return ((144000 * padding) / i15) + i16;
                }
                return (((i11 == 1 ? 72000 : 144000) * padding) / i15) + i16;
            }
        }
        throw new RuntimeException();
    }

    private void A03(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        this.A05 = i10;
        this.A06 = str;
        this.A02 = i11;
        this.A03 = i12;
        this.A01 = i13;
        this.A00 = i14;
        this.A04 = i15;
    }
}
