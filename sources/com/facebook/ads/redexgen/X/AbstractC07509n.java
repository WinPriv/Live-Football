package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.anythink.expressad.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC07509n {
    public static String[] A00 = {"jU13W9NSebta1ZmimveRwiImSwvynw8G", "bR9yhpeYgYLfxjGn405sIF1CLUaNKRNv", "y6GS60dgSiOKDJGhj3wt9T6pcdF3KRzS", "kAdv6lw0fV2hZ8Ef8nLl5eDcrpXJ", "gDoO0sRHxUPo6SrSL989dqr7yWBZykVP", "xoqdGlgoaRmw7wZuwViSR5WxyeJjGGpo", "tn8QhSSQsmhaZqBgPW05rXLjjsf9pF2E", "LT5aPkpwV7"};
    public static final AbstractC07509n A01 = new C1306Vz();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract C07489l A0A(int i10, C07489l c07489l, boolean z10);

    public abstract C07499m A0D(int i10, C07499m c07499m, boolean z10, long j10);

    public int A02(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == A06(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            if (i10 == A06(z10)) {
                return A05(z10);
            }
            return i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final int A03(int i10, C07489l c07489l, C07499m c07499m, int i11, boolean z10) {
        int i12 = A09(i10, c07489l).A00;
        int windowIndex = A0B(i12, c07499m).A01;
        if (windowIndex == i10) {
            int nextWindowIndex = A02(i12, i11, z10);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0B(nextWindowIndex, c07499m).A00;
            return windowIndex2;
        }
        int windowIndex3 = i10 + 1;
        return windowIndex3;
    }

    public int A05(boolean z10) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z10) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(C07499m c07499m, C07489l c07489l, int i10, long j10) {
        return A08(c07499m, c07489l, i10, j10, 0L);
    }

    public final Pair<Integer, Long> A08(C07499m c07499m, C07489l c07489l, int i10, long j10, long j11) {
        H6.A00(i10, 0, A01());
        A0D(i10, c07499m, false, j11);
        if (j10 == b.f7291b) {
            j10 = c07499m.A01();
            if (j10 == b.f7291b) {
                return null;
            }
        }
        int i11 = c07499m.A00;
        long A03 = c07499m.A03() + j10;
        long A07 = A09(i11, c07489l).A07();
        while (A07 != b.f7291b) {
            if (A00[7].length() == 24) {
                throw new RuntimeException();
            }
            A00[7] = "t4u2YUU8OEdoMFYJ2jQWzxX4wha";
            if (A03 < A07 || i11 >= c07499m.A01) {
                break;
            }
            A03 -= A07;
            i11++;
            A07 = A09(i11, c07489l).A07();
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(A03));
    }

    public final C07489l A09(int i10, C07489l c07489l) {
        return A0A(i10, c07489l, false);
    }

    public final C07499m A0B(int i10, C07499m c07499m) {
        return A0C(i10, c07499m, false);
    }

    public final C07499m A0C(int i10, C07499m c07499m, boolean z10) {
        return A0D(i10, c07499m, z10, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i10, C07489l c07489l, C07499m c07499m, int i11, boolean z10) {
        return A03(i10, c07489l, c07499m, i11, z10) == -1;
    }
}
