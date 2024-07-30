package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HR {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02 = {"Oi30oJFxUMFG0gOFP1qEoKnGUzBDTsvx", "3WD4gW2GQkEI5AwBfxSAXddooip3O", "Ouz028YKvSlJVOERB46zGmLFjnusBt99", "zuSd86snyfkH6Kt688AXpDWJmpjjYjYh", "jm5obH6VrXyDYReHZwz8l0mhz55kc4yf", "71eZjkBm8iWWJxdGvDt2NXp", "W8ZvrObejWqz7a9mktO8s2uWHHxOtI0w", "Nv5C13AVolnSAeqab8n4y7TwRlreXIzh"};
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static HQ A06(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        HW hw = new HW(bArr, i10, i11);
        hw.A07(8);
        int A052 = hw.A05(8);
        hw.A07(16);
        int A042 = hw.A04();
        int i14 = 1;
        if (A052 == 100 || A052 == 110 || A052 == 122 || A052 == 244 || A052 == 44 || A052 == 83 || A052 == 86 || A052 == 118 || A052 == 128 || A052 == 138) {
            i14 = hw.A04();
            r16 = i14 == 3 ? hw.A0A() : false;
            hw.A04();
            hw.A04();
            hw.A06();
            if (hw.A0A()) {
                int i15 = i14 != 3 ? 8 : 12;
                int i16 = 0;
                while (i16 < i15) {
                    if (hw.A0A()) {
                        A09(hw, i16 < 6 ? 16 : 64);
                    }
                    i16++;
                }
            }
        }
        int A043 = hw.A04() + 4;
        int A044 = hw.A04();
        int i17 = 0;
        boolean z10 = false;
        if (A044 == 0) {
            i17 = hw.A04() + 4;
        } else if (A044 == 1) {
            z10 = hw.A0A();
            hw.A03();
            hw.A03();
            long A045 = hw.A04();
            for (int i18 = 0; i18 < A045; i18++) {
                hw.A04();
            }
        } else {
            if (A02[1].length() != 29) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "gg30aCps8xaKqlQpqNwqV8MpUTOLFqGh";
            strArr[2] = "6dq0Mx0u8Kgv53YJdcFQMlotDlRuazjf";
        }
        hw.A04();
        hw.A06();
        int A046 = hw.A04() + 1;
        int A047 = hw.A04() + 1;
        boolean A0A = hw.A0A();
        int i19 = (2 - (A0A ? 1 : 0)) * A047;
        if (!A0A) {
            hw.A06();
        }
        hw.A06();
        int i20 = A046 * 16;
        int i21 = i19 * 16;
        if (hw.A0A()) {
            int A048 = hw.A04();
            int A049 = hw.A04();
            int A0410 = hw.A04();
            int A0411 = hw.A04();
            if (i14 == 0) {
                i12 = 1;
                i13 = 2 - (A0A ? 1 : 0);
            } else {
                i12 = i14 == 3 ? 1 : 2;
                i13 = (2 - (A0A ? 1 : 0)) * (i14 == 1 ? 2 : 1);
            }
            i20 -= (A048 + A049) * i12;
            i21 -= (A0410 + A0411) * i13;
        }
        float f = 1.0f;
        boolean A0A2 = hw.A0A();
        String[] strArr2 = A02;
        if (strArr2[0].charAt(3) == strArr2[2].charAt(3)) {
            String[] strArr3 = A02;
            strArr3[6] = "jcRzMhbBY3Dw1JTLjGKCGc6YaVOjENSo";
            strArr3[3] = "o4pmI9swvtrYdLR0BRHjmVJPNciV1YNp";
            if (A0A2) {
                boolean A0A3 = hw.A0A();
                String[] strArr4 = A02;
                if (strArr4[0].charAt(3) == strArr4[2].charAt(3)) {
                    String[] strArr5 = A02;
                    strArr5[0] = "nxo01JuHYgIdSih3CNMvKr0vsuD4ByKM";
                    strArr5[2] = "Ktm0TZ4NHFdoOw88agihQWJn0ILc0Ki9";
                    if (A0A3) {
                        int A053 = hw.A05(8);
                        if (A053 == 255) {
                            int A054 = hw.A05(16);
                            int A055 = hw.A05(16);
                            if (A054 != 0 && A055 != 0) {
                                f = A054 / A055;
                            }
                        } else {
                            float[] fArr = A04;
                            if (A053 < fArr.length) {
                                f = fArr[A053];
                            } else {
                                Log.w(A07(0, 11, 97), A07(11, 35, 53) + A053);
                            }
                        }
                    }
                }
            }
            return new HQ(A042, i20, i21, f, r16, A0A, A043, A044, i17, z10);
        }
        throw new RuntimeException();
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-4, Ascii.SI, Ascii.SUB, 3, Ascii.FS, Ascii.ETB, 34, 3, 34, Ascii.ETB, Ascii.SUB, -41, -16, -25, -6, -14, -25, -27, -10, -25, -26, -94, -29, -11, -14, -25, -27, -10, -31, -12, -29, -10, -21, -15, -31, -21, -26, -27, -94, -8, -29, -18, -9, -25, -68, -94, -9, -22, -27, -26, -16, -80, -30, -9, -28, 7, -6, -11, -10, 0, -64, -7, -10, 7, -12};
    }

    static {
        A08();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    public static int A02(byte[] bArr, int i10) {
        int i11;
        synchronized (A05) {
            int scratchEscapeCount = 0;
            int i12 = 0;
            while (scratchEscapeCount < i10) {
                scratchEscapeCount = A03(bArr, scratchEscapeCount, i10);
                if (scratchEscapeCount < i10) {
                    if (A01.length <= i12) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[i12] = scratchEscapeCount;
                    scratchEscapeCount += 3;
                    i12++;
                }
            }
            i11 = i10 - i12;
            int unescapedPosition = 0;
            int escapedPosition = 0;
            for (int unescapedLength = 0; unescapedLength < i12; unescapedLength++) {
                int scratchEscapeCount2 = A01[unescapedLength];
                int scratchEscapeCount3 = scratchEscapeCount2 - unescapedPosition;
                System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, scratchEscapeCount3);
                int escapedPosition2 = escapedPosition + scratchEscapeCount3;
                int position = escapedPosition2 + 1;
                bArr[escapedPosition2] = 0;
                escapedPosition = position + 1;
                bArr[position] = 0;
                unescapedPosition += scratchEscapeCount3 + 3;
            }
            System.arraycopy(bArr, unescapedPosition, bArr, escapedPosition, i11 - escapedPosition);
        }
        return i11;
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0002 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(byte[] r2, int r3, int r4) {
        /*
        L0:
            int r0 = r4 + (-2)
            if (r3 >= r0) goto L19
            r0 = r2[r3]
            if (r0 != 0) goto L16
            int r0 = r3 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L16
            int r0 = r3 + 2
            r1 = r2[r0]
            r0 = 3
            if (r1 != r0) goto L16
            return r3
        L16:
            int r3 = r3 + 1
            goto L0
        L19:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HR.A03(byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0169, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x016f, code lost:
    
        if (r11[1] == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0171, code lost:
    
        r0 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0175, code lost:
    
        if (r8[r0] != 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0177, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0179, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0144, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x010b, code lost:
    
        r4 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0064, code lost:
    
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r6 = r11[0];
        r5 = com.facebook.ads.redexgen.X.HR.A02;
        r4 = r5[7];
        r5 = r5[4];
        r4 = r4.charAt(7);
        r0 = r5.charAt(7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r4 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r5 = com.facebook.ads.redexgen.X.HR.A02;
        r5[6] = "55fmxhOEMutKpKC77r4Md8gvEpVf5AJr";
        r5[3] = "C8cbl0pwE6ZZ2ZiTcRq9FxMeDjV9Xwky";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r6 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        A0B(r11);
        r0 = r9 - 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r3 <= 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r11[1] == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r0 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r0 != 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        A0B(r11);
        r0 = r9 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r3 <= 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        if (r11[2] == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        r0 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r0 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        r0 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (r8[r0] != 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        A0B(r11);
        r0 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        r5 = r10 - 1;
        r6 = com.facebook.ads.redexgen.X.HR.A02;
        r4 = r6[6];
        r6 = r6[3];
        r4 = r4.charAt(21);
        r0 = r6.charAt(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r4 == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        r6 = com.facebook.ads.redexgen.X.HR.A02;
        r6[6] = "uktgRDQdtpFh8EbCos18fWUkW81B3r6L";
        r6[3] = "mrDteKziaJnLJGchN7K4iHB0p5nXZEGM";
        r4 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r4 >= r5) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        r0 = r8[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if ((r0 & 254) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        r0 = r4 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (r8[r0] != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        r0 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if (r8[r0] != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        r0 = r8[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (r0 != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
    
        if (r11 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
    
        A0B(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        r3 = r4 - 2;
        r2 = com.facebook.ads.redexgen.X.HR.A02;
        r1 = r2[6];
        r2 = r2[3];
        r1 = r1.charAt(21);
        r0 = r2.charAt(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f9, code lost:
    
        if (r1 == r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
    
        r2 = com.facebook.ads.redexgen.X.HR.A02;
        r2[7] = "R0jBdFAV67GondLg32AWi8zsE1yw1KkW";
        r2[4] = "2wkvt5tVRPNRTL1bJFfqOEJwxkS69Blm";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
    
        r4 = r4 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r4 = r4 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0111, code lost:
    
        if (r11 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0113, code lost:
    
        if (r3 <= 2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0115, code lost:
    
        r0 = r10 - 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0119, code lost:
    
        if (r8[r0] != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011b, code lost:
    
        r0 = r10 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011f, code lost:
    
        if (r8[r0] != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0121, code lost:
    
        r0 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0125, code lost:
    
        if (r8[r0] != 1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0127, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0128, code lost:
    
        r11[0] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012a, code lost:
    
        if (r3 <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012c, code lost:
    
        r0 = r10 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0130, code lost:
    
        if (r8[r0] != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0132, code lost:
    
        r0 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0136, code lost:
    
        if (r8[r0] != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0138, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
    
        r11[1] = r0;
        r0 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013f, code lost:
    
        if (r8[r0] != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0141, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        r11[2] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0145, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0149, code lost:
    
        if (r11[2] == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014b, code lost:
    
        r0 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014f, code lost:
    
        if (r8[r0] != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0151, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0155, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0157, code lost:
    
        if (r3 != 2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015b, code lost:
    
        if (r11[2] == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015d, code lost:
    
        r0 = r10 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0161, code lost:
    
        if (r8[r0] != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0163, code lost:
    
        r0 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0167, code lost:
    
        if (r8[r0] != 1) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HR.A04(byte[], int, int, boolean[]):int");
    }

    public static HP A05(byte[] bArr, int i10, int i11) {
        HW hw = new HW(bArr, i10, i11);
        hw.A07(8);
        int A042 = hw.A04();
        int seqParameterSetId = hw.A04();
        hw.A06();
        return new HP(A042, seqParameterSetId, hw.A0A());
    }

    public static void A09(HW hw, int i10) {
        int i11 = 8;
        int lastScale = 8;
        for (int nextScale = 0; nextScale < i10; nextScale++) {
            if (lastScale != 0) {
                int lastScale2 = hw.A03();
                lastScale = ((lastScale2 + i11) + 256) % 256;
            }
            if (lastScale != 0) {
                i11 = lastScale;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0A(java.nio.ByteBuffer r6) {
        /*
            int r5 = r6.position()
            r4 = 0
            r3 = 0
        L6:
            int r0 = r3 + 1
            if (r0 >= r5) goto L3f
            byte r0 = r6.get(r3)
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = 3
            if (r4 != r0) goto L35
            r0 = 1
            if (r2 != r0) goto L39
            int r0 = r3 + 1
            byte r0 = r6.get(r0)
            r1 = r0 & 31
            r0 = 7
            if (r1 != r0) goto L39
            java.nio.ByteBuffer r1 = r6.duplicate()
            int r0 = r3 + (-3)
            r1.position(r0)
            r1.limit(r5)
            r0 = 0
            r6.position(r0)
            r6.put(r1)
            return
        L35:
            if (r2 != 0) goto L39
            int r4 = r4 + 1
        L39:
            if (r2 == 0) goto L3c
            r4 = 0
        L3c:
            int r3 = r3 + 1
            goto L6
        L3f:
            r6.clear()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.HR.A02
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 29
            if (r1 == r0) goto L55
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L55:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.HR.A02
            java.lang.String r1 = "LhexrLoV7v0KAfJEyFTOZZKZaNSS1gs0"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "gpIVcqUVkpQz0S61taD9WNDesiV6owqm"
            r0 = 4
            r2[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HR.A0A(java.nio.ByteBuffer):void");
    }

    public static void A0B(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0C(String str, byte b10) {
        if (A07(46, 9, 52).equals(str) && (b10 & Ascii.US) == 6) {
            return true;
        }
        return A07(55, 10, 68).equals(str) && ((b10 & 126) >> 1) == 39;
    }
}
