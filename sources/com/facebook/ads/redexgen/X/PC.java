package com.facebook.ads.redexgen.X;

import android.graphics.Paint;

/* loaded from: assets/audience_network.dex */
public class PC extends Paint {
    public final /* synthetic */ PD A00;
    public final /* synthetic */ boolean A01;

    public PC(PD pd, boolean z10) {
        this.A00 = pd;
        this.A01 = z10;
        setStyle(Paint.Style.FILL_AND_STROKE);
        setStrokeCap(Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}
