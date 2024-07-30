package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Rj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1190Rj implements N1 {
    public final WeakReference<C07368y> A00;

    public C1190Rj(C07368y c07368y) {
        this.A00 = new WeakReference<>(c07368y);
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void AAr(boolean z10) {
        C07368y cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z10;
            cardLayout.A02();
        }
    }
}
