package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Rs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1199Rs extends AbstractRunnableC0997Ju {
    public final WeakReference<C1137Pi> A00;

    public C1199Rs(C1137Pi c1137Pi) {
        this.A00 = new WeakReference<>(c1137Pi);
    }

    public C1199Rs(WeakReference<C1137Pi> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C1137Pi viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
