package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4a, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4a {
    public static String[] A02 = {"hO0SXlIn7n5HXEBLx", "jESNVpuYnHPlnh4DZ", "CDLwN7DwmtArlNd144q1QIOvLDqs4yZF", "JntNhgZ58kYFXbwiJ6hzeVdvPNGn00kF", "yTsWpbzmHeCmcQEDkb0QkT5J3TV6CkfD", "Lh9pded4Clz2", "gnDNjs3GBImfOnnM5uEQWokXBd1c", "C4tnEN178k9sL9bIxtVolUttiI5dEdE5"};
    public SparseArray<C4Z> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j10, long j11) {
        if (j10 == 0) {
            return j11;
        }
        long j12 = j10 / 4;
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        A02[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        return (j12 * 3) + (j11 / 4);
    }

    private C4Z A01(int i10) {
        C4Z c4z = this.A00.get(i10);
        if (c4z == null) {
            C4Z c4z2 = new C4Z();
            this.A00.put(i10, c4z2);
            return c4z2;
        }
        return c4z;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            r2 = this;
            r1 = 0
        L1:
            android.util.SparseArray<com.facebook.ads.redexgen.X.4Z> r0 = r2.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L19
            android.util.SparseArray<com.facebook.ads.redexgen.X.4Z> r0 = r2.A00
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.4Z r0 = (com.facebook.ads.redexgen.X.C4Z) r0
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r0.A03
            r0.clear()
            int r1 = r1 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C4a.A02():void");
    }

    public final AbstractC06294l A03(int i10) {
        C4Z c4z = this.A00.get(i10);
        if (c4z != null && !c4z.A03.isEmpty()) {
            ArrayList<AbstractC06294l> arrayList = c4z.A03;
            if (A02[4].charAt(1) != 'T') {
                throw new RuntimeException();
            }
            A02[6] = "6zOEmNGiTAHU1v9SGa3";
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i10, long j10) {
        C4Z A01 = A01(i10);
        A01.A01 = A00(A01.A01, j10);
    }

    public final void A06(int i10, long j10) {
        C4Z A01 = A01(i10);
        A01.A02 = A00(A01.A02, j10);
    }

    public final void A07(C4H c4h) {
        this.A01++;
    }

    public final void A08(C4H c4h, C4H c4h2, boolean z10) {
        if (c4h != null) {
            A04();
        }
        if (!z10 && this.A01 == 0) {
            A02();
        }
        if (c4h2 != null) {
            A07(c4h2);
        }
    }

    public final void A09(AbstractC06294l abstractC06294l) {
        int A0H = abstractC06294l.A0H();
        ArrayList<AbstractC06294l> arrayList = A01(A0H).A03;
        int i10 = this.A00.get(A0H).A00;
        int viewType = arrayList.size();
        if (i10 <= viewType) {
            return;
        }
        abstractC06294l.A0Q();
        String[] strArr = A02;
        String str = strArr[3];
        String str2 = strArr[7];
        int charAt = str.charAt(9);
        int viewType2 = str2.charAt(9);
        if (charAt != viewType2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "TnDeXYrDbfmyODeGX";
        strArr2[5] = "ziritv0xfrad";
        arrayList.add(abstractC06294l);
    }

    public final boolean A0A(int i10, long j10, long j11) {
        long j12 = A01(i10).A01;
        return j12 == 0 || j10 + j12 < j11;
    }

    public final boolean A0B(int i10, long j10, long j11) {
        long j12 = A01(i10).A02;
        return j12 == 0 || j10 + j12 < j11;
    }
}
