package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class NP {
    public static final int A00 = LE.A00();

    public static void A00(C1316Wj c1316Wj, ViewGroup viewGroup, String str) {
        new AsyncTaskC1195Ro(viewGroup, c1316Wj).A07(str);
        View view = new View(c1316Wj);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LE.A0R(view, c1316Wj);
        viewGroup.addView(view, 0);
    }
}
