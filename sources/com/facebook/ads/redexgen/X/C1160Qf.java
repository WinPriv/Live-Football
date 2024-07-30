package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Qf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1160Qf extends NJ {
    public final ImageView A00;
    public final C1316Wj A01;

    public C1160Qf(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A01 = c1316Wj;
        this.A00 = new ImageView(c1316Wj);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC1195Ro downloadImageTask = new AsyncTaskC1195Ro(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
