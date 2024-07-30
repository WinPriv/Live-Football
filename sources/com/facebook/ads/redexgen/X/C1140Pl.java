package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Pl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1140Pl extends AbstractRunnableC0997Ju {
    public final /* synthetic */ P1 A00;

    public C1140Pl(P1 p12) {
        this.A00 = p12;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        boolean z10;
        C8N c8n;
        Handler handler;
        int i10;
        z10 = this.A00.A03;
        if (!z10) {
            c8n = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c8n.A02(new AbstractC1045Ls(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.6r
            });
            handler = this.A00.A07;
            i10 = this.A00.A00;
            handler.postDelayed(this, i10);
        }
    }
}
