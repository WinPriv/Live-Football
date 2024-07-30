package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1196Rp extends AbstractRunnableC0997Ju {
    public final /* synthetic */ N0 A00;

    public C1196Rp(N0 n02) {
        this.A00 = n02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        boolean z10;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z10 = this.A00.A08;
        if (z10) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
