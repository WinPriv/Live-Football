package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.44, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass44 implements Runnable {
    public static Comparator<AnonymousClass43> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<AnonymousClass44> A07;
    public long A00;
    public long A01;
    public ArrayList<C0849Dw> A02 = new ArrayList<>();
    public ArrayList<AnonymousClass43> A03 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<AnonymousClass43>() { // from class: com.facebook.ads.redexgen.X.42
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(AnonymousClass43 anonymousClass43, AnonymousClass43 anonymousClass432) {
                if ((anonymousClass43.A03 == null) != (anonymousClass432.A03 == null)) {
                    return anonymousClass43.A03 == null ? 1 : -1;
                }
                if (anonymousClass43.A04 != anonymousClass432.A04) {
                    return anonymousClass43.A04 ? -1 : 1;
                }
                int i10 = anonymousClass432.A02 - anonymousClass43.A02;
                if (i10 != 0) {
                    return i10;
                }
                int i11 = anonymousClass43.A00;
                int deltaViewVelocity = anonymousClass432.A00;
                int i12 = i11 - deltaViewVelocity;
                if (i12 != 0) {
                    return i12;
                }
                return 0;
            }
        };
    }

    private AbstractC06294l A00(C0849Dw c0849Dw, int i10, long j10) {
        if (A08(c0849Dw, i10)) {
            return null;
        }
        C06194b c06194b = c0849Dw.A0r;
        try {
            c0849Dw.A1L();
            AbstractC06294l A0I = c06194b.A0I(i10, false, j10);
            if (A0I != null) {
                if (A0I.A0a() && !A0I.A0b()) {
                    c06194b.A0X(A0I.A0H);
                } else {
                    c06194b.A0d(A0I, false);
                }
            }
            return A0I;
        } finally {
            c0849Dw.A1q(false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0078 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r10 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dw> r0 = r10.A02
            int r9 = r0.size()
            r4 = 0
            r3 = 0
        L8:
            r2 = 0
            if (r3 >= r9) goto L26
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dw> r0 = r10.A02
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.Dw r1 = (com.facebook.ads.redexgen.X.C0849Dw) r1
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L23
            com.facebook.ads.redexgen.X.Xl r0 = r1.A02
            r0.A04(r1, r2)
            com.facebook.ads.redexgen.X.Xl r0 = r1.A02
            int r0 = r0.A00
            int r4 = r4 + r0
        L23:
            int r3 = r3 + 1
            goto L8
        L26:
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r10.A03
            r0.ensureCapacity(r4)
            r8 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass44.A06
            r0 = 3
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L44
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L44:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass44.A06
            java.lang.String r1 = "OH"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "7S"
            r0 = 7
            r2[r0] = r1
            r7 = 0
        L51:
            if (r7 >= r9) goto Lb3
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dw> r0 = r10.A02
            java.lang.Object r6 = r0.get(r7)
            com.facebook.ads.redexgen.X.Dw r6 = (com.facebook.ads.redexgen.X.C0849Dw) r6
            int r0 = r6.getWindowVisibility()
            if (r0 == 0) goto L64
        L61:
            int r7 = r7 + 1
            goto L51
        L64:
            com.facebook.ads.redexgen.X.Xl r5 = r6.A02
            int r0 = r5.A01
            int r4 = java.lang.Math.abs(r0)
            int r0 = r5.A02
            int r0 = java.lang.Math.abs(r0)
            int r4 = r4 + r0
            r3 = 0
        L74:
            int r0 = r5.A00
            int r0 = r0 * 2
            if (r3 >= r0) goto L61
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r10.A03
            int r0 = r0.size()
            if (r8 < r0) goto Laa
            com.facebook.ads.redexgen.X.43 r0 = new com.facebook.ads.redexgen.X.43
            r0.<init>()
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r1 = r10.A03
            r1.add(r0)
        L8c:
            int[] r2 = r5.A03
            int r1 = r3 + 1
            r2 = r2[r1]
            if (r2 > r4) goto La8
            r1 = 1
        L95:
            r0.A04 = r1
            r0.A02 = r4
            r0.A00 = r2
            r0.A03 = r6
            int[] r1 = r5.A03
            r1 = r1[r3]
            r0.A01 = r1
            int r8 = r8 + 1
            int r3 = r3 + 2
            goto L74
        La8:
            r1 = 0
            goto L95
        Laa:
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r10.A03
            java.lang.Object r0 = r0.get(r8)
            com.facebook.ads.redexgen.X.43 r0 = (com.facebook.ads.redexgen.X.AnonymousClass43) r0
            goto L8c
        Lb3:
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r1 = r10.A03
            java.util.Comparator<com.facebook.ads.redexgen.X.43> r0 = com.facebook.ads.redexgen.X.AnonymousClass44.A04
            java.util.Collections.sort(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass44.A02():void");
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A04(long r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r3.A03
            int r0 = r0.size()
            if (r2 >= r0) goto L15
            java.util.ArrayList<com.facebook.ads.redexgen.X.43> r0 = r3.A03
            java.lang.Object r1 = r0.get(r2)
            com.facebook.ads.redexgen.X.43 r1 = (com.facebook.ads.redexgen.X.AnonymousClass43) r1
            com.facebook.ads.redexgen.X.Dw r0 = r1.A03
            if (r0 != 0) goto L16
        L15:
            return
        L16:
            r3.A06(r1, r4)
            r1.A00()
            int r2 = r2 + 1
            goto L1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass44.A04(long):void");
    }

    private final void A05(long j10) {
        A02();
        A04(j10);
    }

    private void A06(AnonymousClass43 anonymousClass43, long j10) {
        AbstractC06294l A00 = A00(anonymousClass43.A03, anonymousClass43.A01, anonymousClass43.A04 ? Long.MAX_VALUE : j10);
        if (A00 != null && A00.A09 != null && A00.A0a() && !A00.A0b()) {
            A07(A00.A09.get(), j10);
        }
    }

    private void A07(@Nullable C0849Dw c0849Dw, long j10) {
        if (c0849Dw == null) {
            return;
        }
        if (c0849Dw.A0C) {
            C06103r c06103r = c0849Dw.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c06103r.A06() != 0) {
                    c0849Dw.A1O();
                }
            }
            throw new RuntimeException();
        }
        C1344Xl c1344Xl = c0849Dw.A02;
        c1344Xl.A04(c0849Dw, true);
        if (c1344Xl.A00 != 0) {
            try {
                C2V.A01(A01(0, 18, 7));
                c0849Dw.A0s.A05(c0849Dw.A04);
                int i10 = 0;
                while (true) {
                    int i11 = c1344Xl.A00 * 2;
                    int i12 = A06[6].charAt(8);
                    if (i12 == 73) {
                        break;
                    }
                    String[] strArr = A06;
                    strArr[3] = "nG";
                    strArr[7] = "TD";
                    if (i10 < i11) {
                        A00(c0849Dw, c1344Xl.A03[i10], j10);
                        i10 += 2;
                    } else {
                        return;
                    }
                }
                throw new RuntimeException();
            } finally {
                C2V.A00();
            }
        }
    }

    public static boolean A08(C0849Dw c0849Dw, int i10) {
        int A062 = c0849Dw.A01.A06();
        for (int i11 = 0; i11 < A062; i11++) {
            AbstractC06294l A0G = C0849Dw.A0G(c0849Dw.A01.A0A(i11));
            int childCount = A0G.A03;
            if (childCount == i10 && !A0G.A0b()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C0849Dw c0849Dw) {
        this.A02.add(c0849Dw);
    }

    public final void A0A(C0849Dw c0849Dw) {
        this.A02.remove(c0849Dw);
    }

    public final void A0B(C0849Dw c0849Dw, int i10, int i11) {
        if (c0849Dw.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = c0849Dw.getNanoTime();
            c0849Dw.post(this);
        }
        c0849Dw.A02.A03(i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2V.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long j10 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C0849Dw c0849Dw = this.A02.get(i10);
                if (c0849Dw.getWindowVisibility() == 0) {
                    j10 = Math.max(c0849Dw.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                C2V.A00();
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(j10) + this.A00);
        } finally {
            this.A01 = 0L;
            C2V.A00();
        }
    }
}
