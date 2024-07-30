package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* loaded from: assets/audience_network.dex */
public class XP extends AbstractRunnableC0985Jh {
    public final /* synthetic */ XL A00;
    public final /* synthetic */ J3 A01;

    public XP(XL xl, J3 j32) {
        this.A00 = xl;
        this.A01 = j32;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0985Jh
    public final void A01() {
        AnonymousClass54 anonymousClass54;
        AnonymousClass54 anonymousClass542;
        AnonymousClass54 anonymousClass543;
        anonymousClass54 = this.A00.A01;
        if (anonymousClass54.A06() != null) {
            anonymousClass542 = this.A00.A01;
            AdListener A06 = anonymousClass542.A06();
            anonymousClass543 = this.A00.A01;
            A06.onError(anonymousClass543.A07(), KP.A00(this.A01));
        }
    }
}
