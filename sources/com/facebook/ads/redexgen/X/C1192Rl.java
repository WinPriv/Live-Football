package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1192Rl extends AbstractRunnableC0997Ju {
    public final /* synthetic */ NC A00;

    public C1192Rl(NC nc2) {
        this.A00 = nc2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    @RequiresApi(api = 16)
    public final void A06() {
        Runnable runnable;
        int i10;
        if (this.A00.isPressed()) {
            NC nc2 = this.A00;
            i10 = nc2.A07;
            nc2.postDelayed(this, i10);
        } else {
            this.A00.setPressed(true);
            NC nc3 = this.A00;
            runnable = nc3.A09;
            nc3.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
