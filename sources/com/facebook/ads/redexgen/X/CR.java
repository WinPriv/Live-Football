package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CR {
    public static byte[] A00;
    public static String[] A01 = {"97CkWcXqrjyz7Qw2gcwWTf0UsRxLJkLY", "KmKspjn8yBhlsuKfHc5dD1By4HqwQES7", "tM7dEAyUMmHTAlM7QEv8AsYa9vZW08DW", "cnFzSmdUdmsM2SVrr3BadDXsi4nDpClW", "tMN7ldEkNAphgvj5y1u3W8bdaUauudV5", "yEIP5bnoN3ttum2IDgG23FKNyE9RzpP8", "N0hhc3G9NfQEzjT9vQvNmE", "ceiH1Z9CkPvfm4IJnpqvFzCjzC6OBPie"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static CQ A04(HV hv) throws C9R {
        A0A(1, hv, false);
        long A0K = hv.A0K();
        int A0E = hv.A0E();
        long A0K2 = hv.A0K();
        int A0A = hv.A0A();
        int A0A2 = hv.A0A();
        int A0A3 = hv.A0A();
        int A0E2 = hv.A0E();
        return new CQ(A0K, A0E, A0K2, A0A, A0A2, A0A3, (int) Math.pow(2.0d, A0E2 & 15), (int) Math.pow(2.0d, (A0E2 & 240) >> 4), (hv.A0E() & 1) > 0, Arrays.copyOf(hv.A00, hv.A07()));
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{35, Ascii.SUB, 7, Ascii.ETB, Ascii.FS, 6, 32, 1, Ascii.FS, Ascii.EM, 74, 87, 95, 74, 76, 91, 74, 75, Ascii.SI, 76, 71, 78, 93, 78, 76, 91, 74, 93, 92, Ascii.SI, 8, 89, 64, 93, 77, 70, 92, 8, 100, 121, 113, 100, 98, 117, 100, 101, 33, 98, 110, 101, 100, 33, 99, 110, 110, 106, 33, 117, 110, 33, 114, 117, 96, 115, 117, 33, 118, 104, 117, 105, 33, 90, 49, 121, 52, 55, 45, 33, 49, 121, 53, 50, 45, 33, 49, 121, 53, 51, 92, 33, 96, 117, 33, 88, 69, 77, 88, 94, 73, 88, 89, Ascii.GS, 85, 88, 92, 89, 88, 79, Ascii.GS, 73, 68, 77, 88, Ascii.GS, 47, 37, 38, 38, 59, 105, 61, 48, 57, 44, 105, 46, 59, 44, 40, 61, 44, 59, 105, 61, 33, 40, 39, 105, 120, 105, 39, 38, 61, 105, 45, 44, 42, 38, 45, 40, 43, 37, 44, 115, 105, Ascii.DC4, 0, 19, Ascii.US, Ascii.ESC, Ascii.FS, Ascii.NAK, 82, Ascii.DLE, Ascii.ESC, 6, 82, 19, Ascii.DC4, 6, Ascii.ETB, 0, 82, Ascii.US, Ascii.GS, Ascii.SYN, Ascii.ETB, 1, 82, Ascii.FS, Ascii.GS, 6, 82, 1, Ascii.ETB, 6, 82, 19, 1, 82, Ascii.ETB, 10, 2, Ascii.ETB, 17, 6, Ascii.ETB, Ascii.SYN, 87, 67, 80, 92, 88, 95, 86, 17, 83, 88, 69, 17, 84, 73, 65, 84, 82, 69, 84, 85, 17, 69, 94, 17, 83, 84, 17, 66, 84, 69, 66, 65, 65, 69, 91, 94, Ascii.SO, 90, 87, 94, 75, Ascii.SO, 73, 92, 75, 79, 90, 75, 92, Ascii.SO, 90, 70, 79, 64, Ascii.SO, Ascii.FS, Ascii.SO, 64, 65, 90, Ascii.SO, 74, 75, 77, 65, 74, 79, 76, 66, 75, Ascii.DC4, Ascii.SO, 38, 42, 59, 59, 34, 37, 44, 107, 63, 50, 59, 46, 107, 36, 63, 35, 46, 57, 107, 63, 35, 42, 37, 107, 123, 107, 37, 36, 63, 107, 56, 62, 59, 59, 36, 57, 63, 46, 47, 113, 107, 41, 53, 56, 58, 60, 49, 54, 53, 61, 60, 43, 121, 54, 63, 121, 45, 48, 52, 60, 121, 61, 54, 52, 56, 48, 55, 121, 45, 43, 56, 55, 42, 63, 54, 43, 52, 42, 121, 55, 54, 45, 121, 35, 60, 43, 54, 60, 61, 121, 54, 44, 45, 84, 67, 85, 79, 66, 83, 67, 114, 95, 86, 67, 6, 65, 84, 67, 71, 82, 67, 84, 6, 82, 78, 71, 72, 6, Ascii.DC4, 6, 79, 85, 6, 72, 73, 82, 6, 66, 67, 69, 73, 66, 71, 68, 74, 67, 113, 106, 37, 119, 96, 118, 96, 119, 115, 96, 97, 37, 103, 108, 113, 118, 37, 104, 112, 118, 113, 37, 103, 96, 37, Ascii.DEL, 96, 119, 106, 37, 100, 99, 113, 96, 119, 37, 104, 100, 117, 117, 108, 107, 98, 37, 102, 106, 112, 117, 105, 108, 107, 98, 37, 118, 113, 96, 117, 118, 3, Ascii.CAN, Ascii.CAN, 87, 4, Ascii.US, Ascii.CAN, 5, 3, 87, Ascii.US, Ascii.DC2, Ascii.SYN, 19, Ascii.DC2, 5, 77, 87};
    }

    static {
        A06();
    }

    public static int A00(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            String[] strArr = A01;
            String str = strArr[1];
            String str2 = strArr[0];
            int charAt = str.charAt(17);
            int val = str2.charAt(17);
            if (charAt != val) {
                throw new RuntimeException();
            }
            A01[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            i10 >>>= 1;
        }
        return i11;
    }

    public static long A01(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    /* JADX WARN: Incorrect condition in loop: B:41:0x004f */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0025 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.X.CN A02(com.facebook.ads.redexgen.X.CL r12) throws com.facebook.ads.redexgen.X.C9R {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.CR.A02(com.facebook.ads.redexgen.X.CL):com.facebook.ads.redexgen.X.CN");
    }

    public static CO A03(HV hv) throws C9R {
        A0A(3, hv, false);
        int length = (int) hv.A0K();
        String A0S = hv.A0S(length);
        int length2 = A0S.length();
        int i10 = 7 + 4 + length2;
        long A0K = hv.A0K();
        int length3 = (int) A0K;
        String[] strArr = new String[length3];
        int i11 = i10 + 4;
        for (int i12 = 0; i12 < A0K; i12++) {
            int length4 = (int) hv.A0K();
            strArr[i12] = hv.A0S(length4);
            int length5 = strArr[i12].length();
            i11 = i11 + 4 + length5;
        }
        int length6 = hv.A0E();
        int i13 = length6 & 1;
        if (A01[6].length() != 22) {
            throw new RuntimeException();
        }
        A01[7] = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3";
        if (i13 != 0) {
            return new CO(A0S, strArr, i11 + 1);
        }
        String vendor = A05(198, 30, 6);
        throw new C9R(vendor);
    }

    public static void A07(int i10, CL cl) throws C9R {
        int i11;
        int A02 = cl.A02(6) + 1;
        for (int i12 = 0; i12 < A02; i12++) {
            int A022 = cl.A02(16);
            if (A022 != 0) {
                Log.e(A05(0, 10, 66), A05(270, 41, 124) + A022);
            } else {
                if (cl.A04()) {
                    i11 = cl.A02(4) + 1;
                } else {
                    i11 = 1;
                }
                boolean A04 = cl.A04();
                if (A01[7].charAt(17) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "2d5iZcFzMvct5JxqCcZ0JFUoYSVZwGiZ";
                strArr[0] = "NTut6iZFc5ITOEQfsc6CPFa8BEeWuqD1";
                if (A04) {
                    int j10 = cl.A02(8) + 1;
                    for (int i13 = 0; i13 < j10; i13++) {
                        int mappingsCount = i10 - 1;
                        cl.A03(A00(mappingsCount));
                        int mappingsCount2 = i10 - 1;
                        cl.A03(A00(mappingsCount2));
                    }
                }
                int mappingsCount3 = cl.A02(2);
                if (mappingsCount3 == 0) {
                    if (i11 > 1) {
                        for (int mappingsCount4 = 0; mappingsCount4 < i10; mappingsCount4++) {
                            cl.A03(4);
                        }
                    }
                    for (int mappingsCount5 = 0; mappingsCount5 < i11; mappingsCount5++) {
                        cl.A03(8);
                        cl.A03(8);
                        cl.A03(8);
                    }
                } else {
                    throw new C9R(A05(406, 58, 50));
                }
            }
        }
    }

    public static void A08(CL cl) throws C9R {
        int A02 = cl.A02(6) + 1;
        for (int j10 = 0; j10 < A02; j10++) {
            int A022 = cl.A02(16);
            if (A022 == 0) {
                cl.A03(8);
                cl.A03(16);
                cl.A03(16);
                cl.A03(6);
                cl.A03(8);
                int floorCount = cl.A02(4);
                int floorCount2 = floorCount + 1;
                for (int i10 = 0; i10 < floorCount2; i10++) {
                    cl.A03(8);
                }
            } else {
                if (A022 != 1) {
                    throw new C9R(A05(114, 41, 126) + A022);
                }
                int j11 = cl.A02(5);
                int i11 = -1;
                int[] classDimensions = new int[j11];
                for (int floorCount3 = 0; floorCount3 < j11; floorCount3++) {
                    classDimensions[floorCount3] = cl.A02(4);
                    if (classDimensions[floorCount3] > i11) {
                        i11 = classDimensions[floorCount3];
                    }
                }
                int[] iArr = new int[i11 + 1];
                int partitions = 0;
                while (true) {
                    int length = iArr.length;
                    String[] strArr = A01;
                    String str = strArr[1];
                    String str2 = strArr[0];
                    int floorCount4 = str.charAt(17);
                    if (floorCount4 != str2.charAt(17)) {
                        throw new RuntimeException();
                    }
                    A01[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    if (partitions < length) {
                        iArr[partitions] = cl.A02(3) + 1;
                        int A023 = cl.A02(2);
                        if (A023 > 0) {
                            cl.A03(8);
                        }
                        for (int floorCount5 = 0; floorCount5 < (1 << A023); floorCount5++) {
                            cl.A03(8);
                        }
                        partitions++;
                    } else {
                        cl.A03(2);
                        int partitions2 = cl.A02(4);
                        int i12 = 0;
                        int floorCount6 = 0;
                        for (int i13 = 0; i13 < j11; i13++) {
                            i12 += iArr[classDimensions[i13]];
                            while (floorCount6 < i12) {
                                cl.A03(partitions2);
                                floorCount6++;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A09(CL cl) throws C9R {
        int A02 = cl.A02(6) + 1;
        for (int i10 = 0; i10 < A02; i10++) {
            int residueCount = cl.A02(16);
            if (residueCount <= 2) {
                cl.A03(24);
                cl.A03(24);
                cl.A03(24);
                int A022 = cl.A02(6) + 1;
                cl.A03(8);
                int[] iArr = new int[A022];
                for (int i11 = 0; i11 < A022; i11++) {
                    int i12 = 0;
                    int residueCount2 = cl.A02(3);
                    if (cl.A04()) {
                        i12 = cl.A02(5);
                    }
                    iArr[i11] = (i12 * 8) + residueCount2;
                }
                for (int i13 = 0; i13 < A022; i13++) {
                    for (int i14 = 0; i14 < 8; i14++) {
                        int residueCount3 = iArr[i13];
                        if ((residueCount3 & (1 << i14)) != 0) {
                            cl.A03(8);
                        }
                    }
                }
            } else {
                throw new C9R(A05(363, 43, 17));
            }
        }
    }

    public static boolean A0A(int i10, HV hv, boolean z10) throws C9R {
        if (hv.A04() < 7) {
            if (z10) {
                return false;
            }
            throw new C9R(A05(464, 18, 64) + hv.A04());
        }
        if (hv.A0E() != i10) {
            if (z10) {
                return false;
            }
            throw new C9R(A05(93, 21, 10) + Integer.toHexString(i10));
        }
        if (hv.A0E() != 118 || hv.A0E() != 111 || hv.A0E() != 114 || hv.A0E() != 98 || hv.A0E() != 105 || hv.A0E() != 115) {
            if (z10) {
                return false;
            }
            throw new C9R(A05(10, 28, 24));
        }
        if (A01[6].length() != 22) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "3PFcydRg4Lp36gDWvcJwdxiXGhHOWBjb";
        strArr[0] = "aGBtdcQRGSwkEsynEcaJAL8zRbeII6kr";
        return true;
    }

    public static CP[] A0B(CL cl) {
        int A02 = cl.A02(6) + 1;
        CP[] cpArr = new CP[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = cl.A04();
            int A022 = cl.A02(16);
            int i10 = cl.A02(16);
            cpArr[windowType] = new CP(A04, A022, i10, cl.A02(8));
        }
        return cpArr;
    }

    public static CP[] A0C(HV hv, int i10) throws C9R {
        A0A(5, hv, false);
        int A0E = hv.A0E() + 1;
        CL cl = new CL(hv.A00);
        int numberOfBooks = hv.A06();
        cl.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0E; numberOfBooks2++) {
            A02(cl);
        }
        int numberOfBooks3 = cl.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i11 = 0; i11 < timeCount; i11++) {
            int numberOfBooks4 = cl.A02(16);
            if (numberOfBooks4 != 0) {
                throw new C9R(A05(311, 52, 110));
            }
        }
        A08(cl);
        A09(cl);
        A07(i10, cl);
        CP[] A0B = A0B(cl);
        if (cl.A04()) {
            return A0B;
        }
        throw new C9R(A05(155, 43, 69));
    }
}
