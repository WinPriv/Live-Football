package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class RV implements N1 {
    public final WeakReference<AbstractC07288q> A00;

    public RV(AbstractC07288q abstractC07288q) {
        this.A00 = new WeakReference<>(abstractC07288q);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void AAr(boolean z10) {
        AbstractC07288q cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z10;
            cardLayout.A01();
        }
    }
}
