package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.Rk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1191Rk extends AbstractRunnableC0997Ju {
    public final /* synthetic */ NC A00;

    public C1191Rk(NC nc2) {
        this.A00 = nc2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i10;
        this.A00.setPressed(false);
        NC nc2 = this.A00;
        runnable = nc2.A08;
        i10 = this.A00.A07;
        nc2.postOnAnimationDelayed(runnable, i10);
    }
}
