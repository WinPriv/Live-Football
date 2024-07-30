package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0925Gw {
    public static String[] A00 = {"v79OOCD3rFDrBH3Sw8ccat0nkfR9Jk8K", "zaqJSCMgPr8q8xIyOc2JWspWFv3JOD4h", "Sqp2xVCvxFHsc", "s8GBWRpegr", "t6Y6wcH7Q091ZQl7CdWm1Bgnnklpnco", "XVr0n", "MY0M4GS8ICKTpGygoaRzgsCYiOraPhWK", "Pkt85Yo8hwIimoTAGZdJTyJAkZ2fE06T"};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        return r9;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0088: INVOKE (r3 I:com.facebook.ads.redexgen.X.GQ) STATIC call: com.facebook.ads.redexgen.X.Hl.A0W(com.facebook.ads.redexgen.X.GQ):void A[MD:(com.facebook.ads.redexgen.X.GQ):void (m)], block:B:38:0x0088 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0092: INVOKE (r3 I:com.facebook.ads.redexgen.X.GQ) STATIC call: com.facebook.ads.redexgen.X.Hl.A0W(com.facebook.ads.redexgen.X.GQ):void A[MD:(com.facebook.ads.redexgen.X.GQ):void (m)], block:B:40:0x0092 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long A00(com.facebook.ads.redexgen.X.GU r14, long r15, long r17, com.facebook.ads.redexgen.X.GQ r19, byte[] r20, @androidx.annotation.Nullable com.facebook.ads.redexgen.X.HZ r21, int r22, com.facebook.ads.redexgen.X.C0924Gv r23) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r2 = r14
        L1:
            r1 = r21
            if (r1 == 0) goto La
            r0 = r22
            r1.A01(r0)
        La:
            r3 = r19
            boolean r0 = java.lang.Thread.interrupted()     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            if (r0 != 0) goto L82
            com.facebook.ads.redexgen.X.GU r4 = new com.facebook.ads.redexgen.X.GU     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            android.net.Uri r5 = r2.A04     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            byte[] r6 = r2.A06     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            long r9 = r2.A03     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            r7 = r15
            long r9 = r9 + r7
            long r0 = r2.A01     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            long r9 = r9 - r0
            r11 = -1
            java.lang.String r13 = r2.A05     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            int r0 = r2.A00     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            r14 = r0 | 2
            r4.<init>(r5, r6, r7, r9, r11, r13, r14)     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            r2 = r4
            long r7 = r3.ACq(r2)     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            r6 = r23
            long r4 = r6.A01     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            r11 = -1
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L42
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto L42
            long r0 = r2.A01     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            long r0 = r0 + r7
            r6.A01 = r0     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
        L42:
            r9 = 0
        L44:
            int r0 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r0 == 0) goto L8d
            boolean r0 = java.lang.Thread.interrupted()     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            if (r0 != 0) goto L7c
            r7 = 0
            int r0 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            r8 = r20
            if (r0 == 0) goto L5f
            int r0 = r8.length     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            long r4 = (long) r0     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            long r0 = r17 - r9
            long r4 = java.lang.Math.min(r4, r0)     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            int r0 = (int) r4     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            goto L60
        L5f:
            int r0 = r8.length     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
        L60:
            int r7 = r3.read(r8, r7, r0)     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            r0 = -1
            if (r7 != r0) goto L73
            long r4 = r6.A01     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L8d
            long r0 = r2.A01     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            long r0 = r0 + r9
            r6.A01 = r0     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            goto L8d
        L73:
            long r0 = (long) r7     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            long r9 = r9 + r0
            long r4 = r6.A02     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            long r0 = (long) r7     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            long r4 = r4 + r0
            r6.A02 = r4     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            goto L44
        L7c:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            r0.<init>()     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            throw r0     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
        L82:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            r0.<init>()     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
            throw r0     // Catch: com.facebook.ads.redexgen.X.HY -> L88 java.lang.Throwable -> L91
        L88:
            com.facebook.ads.redexgen.X.C0940Hl.A0W(r3)
            goto L1
        L8d:
            com.facebook.ads.redexgen.X.C0940Hl.A0W(r3)
            return r9
        L91:
            r0 = move-exception
            com.facebook.ads.redexgen.X.C0940Hl.A0W(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0925Gw.A00(com.facebook.ads.redexgen.X.GU, long, long, com.facebook.ads.redexgen.X.GQ, byte[], com.facebook.ads.redexgen.X.HZ, int, com.facebook.ads.redexgen.X.Gv):long");
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(GU gu) {
        return gu.A05 != null ? gu.A05 : A01(gu.A04);
    }

    public static void A03(GU gu, InterfaceC0919Gq interfaceC0919Gq, C1233Tb c1233Tb, byte[] bArr, @Nullable HZ hz, int i10, @Nullable C0924Gv c0924Gv, @Nullable AtomicBoolean atomicBoolean, boolean z10) throws IOException, InterruptedException {
        long start;
        C0924Gv c0924Gv2 = c0924Gv;
        H6.A01(c1233Tb);
        H6.A01(bArr);
        if (c0924Gv2 != null) {
            A04(gu, interfaceC0919Gq, c0924Gv2);
        } else {
            c0924Gv2 = new C0924Gv();
        }
        String A02 = A02(gu);
        long j10 = gu.A01;
        long start2 = gu.A02;
        if (start2 != -1) {
            start = gu.A02;
        } else {
            start = interfaceC0919Gq.A66(A02);
        }
        while (true) {
            long j11 = 0;
            if (start != 0) {
                if (atomicBoolean != null) {
                    boolean z11 = atomicBoolean.get();
                    if (A00[5].length() == 1) {
                        break;
                    }
                    A00[5] = "EAlW89nW7uOIImzUc5SW8CQaYz84C";
                    if (z11) {
                        throw new InterruptedException();
                    }
                }
                long A5u = interfaceC0919Gq.A5u(A02, j10, start != -1 ? start : Long.MAX_VALUE);
                if (A5u <= 0) {
                    long j12 = -A5u;
                    String[] strArr = A00;
                    if (strArr[6].length() != strArr[1].length()) {
                        break;
                    }
                    A00[2] = "OFDha7Ysfl6kB";
                    A5u = j12;
                    if (A00(gu, j10, j12, c1233Tb, bArr, hz, i10, c0924Gv2) < A5u) {
                        if (!z10 || start == -1) {
                            return;
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                j10 += A5u;
                if (start != -1) {
                    j11 = A5u;
                }
                start -= j11;
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public static void A04(GU gu, InterfaceC0919Gq interfaceC0919Gq, C0924Gv c0924Gv) {
        long left;
        String A02 = A02(gu);
        long j10 = gu.A01;
        if (gu.A02 != -1) {
            left = gu.A02;
        } else {
            left = interfaceC0919Gq.A66(A02);
        }
        c0924Gv.A01 = left;
        if (A00[5].length() == 1) {
            throw new RuntimeException();
        }
        A00[4] = "nu";
        c0924Gv.A00 = 0L;
        c0924Gv.A02 = 0L;
        while (left != 0) {
            long A5u = interfaceC0919Gq.A5u(A02, j10, left != -1 ? left : Long.MAX_VALUE);
            if (A5u > 0) {
                c0924Gv.A00 += A5u;
            } else {
                A5u = -A5u;
                if (A5u == Long.MAX_VALUE) {
                    return;
                }
            }
            j10 += A5u;
            if (left == -1) {
                A5u = 0;
            }
            left -= A5u;
        }
    }

    public static void A05(InterfaceC0919Gq interfaceC0919Gq, String str) {
        for (C0923Gu c0923Gu : interfaceC0919Gq.A5v(str)) {
            if (A00[2].length() != 13) {
                throw new RuntimeException();
            }
            A00[4] = "R4HmvLUlpWi57h";
            try {
                interfaceC0919Gq.ADq(c0923Gu);
            } catch (C0917Go unused) {
            }
        }
    }
}
