package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class A3 extends C1342Xj {
    public final /* synthetic */ A2 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.C1342Xj
    public final int A0O(View view, int i10) {
        int i11;
        C4T A08 = A08();
        if (!A08.A24()) {
            return 0;
        }
        C4U c4u = (C4U) view.getLayoutParams();
        int A0N = A0N(A08.A0k(view) - c4u.leftMargin, A08.A0n(view) + c4u.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i10);
        i11 = this.A00.A02;
        return A0N + i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(A2 a22, C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A00 = a22;
    }

    @Override // com.facebook.ads.redexgen.X.C1342Xj
    public final float A0J(DisplayMetrics displayMetrics) {
        float f;
        f = this.A00.A00;
        return f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1342Xj
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.C1342Xj
    public final PointF A0P(int i10) {
        return this.A00.A45(i10);
    }
}
