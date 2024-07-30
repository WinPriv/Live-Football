package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06344q {
    public C06314n A00 = new C06314n();
    public final InterfaceC06324o A01;

    public C06344q(InterfaceC06324o interfaceC06324o) {
        this.A01 = interfaceC06324o;
    }

    public final View A00(int i10, int i11, int i12, int i13) {
        int A76 = this.A01.A76();
        int next = this.A01.A75();
        int childEnd = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View A5x = this.A01.A5x(i10);
            int A60 = this.A01.A60(A5x);
            int i14 = this.A01.A5z(A5x);
            this.A00.A03(A76, next, A60, i14);
            if (i12 != 0) {
                this.A00.A01();
                this.A00.A02(i12);
                if (this.A00.A04()) {
                    return A5x;
                }
            }
            if (i13 != 0) {
                this.A00.A01();
                this.A00.A02(i13);
                if (this.A00.A04()) {
                    view = A5x;
                }
            }
            i10 += childEnd;
        }
        return view;
    }
}
