package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class EC extends AbstractC1358Yb {
    public EC(C1316Wj c1316Wj, C05581p c05581p) {
        super(c1316Wj, c05581p);
    }

    private InterfaceC05400x A00(Runnable runnable) {
        return new YZ(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1358Yb
    public final void A0J() {
        ZB interstitialAdapter = (ZB) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1358Yb
    public final void A0L(InterfaceC05300n interfaceC05300n, AnonymousClass83 anonymousClass83, AnonymousClass81 anonymousClass81, C05591q c05591q) {
        ZB zb2 = (ZB) interfaceC05300n;
        C1357Ya c1357Ya = new C1357Ya(this, c05591q, zb2);
        A0C().postDelayed(c1357Ya, anonymousClass83.A05().A05());
        zb2.A0A(this.A0B, A00(c1357Ya), c05591q, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }

    public final AnonymousClass18 A0T() {
        return ((ZB) this.A01).A09();
    }
}
