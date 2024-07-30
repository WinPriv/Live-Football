package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class RA implements AnonymousClass57 {
    public final /* synthetic */ AnonymousClass80 A00;

    public RA(AnonymousClass80 anonymousClass80) {
        this.A00 = anonymousClass80;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass57
    public final boolean A8K() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        return !atomicBoolean.get() || this.A00.A0T();
    }
}
