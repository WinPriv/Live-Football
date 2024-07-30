package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1362Yf implements AnonymousClass68 {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z10);

    public AbstractC1362Yf(boolean z10) {
        this.A00 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAB() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass68
    public final void AAI() {
        A01(true);
    }
}
