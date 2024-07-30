package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.48, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass48 {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<AbstractC06294l> A08 = null;

    private View A00() {
        int size = this.A08.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.A08.get(i10).A0H;
            C4U c4u = (C4U) view.getLayoutParams();
            if (!c4u.A02()) {
                int i11 = this.A01;
                int size2 = c4u.A00();
                if (i11 == size2) {
                    A02(view);
                    return view;
                }
            }
        }
        return null;
    }

    private final View A01(View view) {
        int size = this.A08.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = this.A08.get(i11).A0H;
            C4U c4u = (C4U) view3.getLayoutParams();
            if (view3 != view && !c4u.A02()) {
                int A00 = c4u.A00();
                int size2 = this.A01;
                int i12 = A00 - size2;
                int size3 = this.A03;
                int i13 = i12 * size3;
                if (i13 >= 0 && i13 < i10) {
                    view2 = view3;
                    i10 = i13;
                    if (i13 == 0) {
                        break;
                    }
                }
            }
        }
        return view2;
    }

    private final void A02(View view) {
        View closest = A01(view);
        if (closest == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((C4U) closest.getLayoutParams()).A00();
        }
    }

    public final View A03(C06194b c06194b) {
        if (this.A08 != null) {
            return A00();
        }
        View A0G = c06194b.A0G(this.A01);
        this.A01 += this.A03;
        return A0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(C06264i c06264i) {
        int i10 = this.A01;
        return i10 >= 0 && i10 < c06264i.A03();
    }
}
