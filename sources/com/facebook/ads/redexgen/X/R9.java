package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class R9 implements N1 {
    public final /* synthetic */ AnonymousClass80 A00;

    public R9(AnonymousClass80 anonymousClass80) {
        this.A00 = anonymousClass80;
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void AAr(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z10);
        this.A00.A05();
    }
}
