package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class ED extends AbstractC1358Yb {

    @Nullable
    public View A00;
    public DY A01;

    public ED(DY dy, C05581p c05581p) {
        super(dy, c05581p);
        this.A01 = dy;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1358Yb
    public final void A0J() {
        if (this.A00 != null) {
            this.A01.A0D().A3n();
            this.A06.A0E(this.A00);
        } else {
            this.A01.A0D().A3o();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1358Yb
    public final void A0L(InterfaceC05300n interfaceC05300n, AnonymousClass83 anonymousClass83, AnonymousClass81 anonymousClass81, C05591q c05591q) {
        this.A01.A0D().A3h();
        ZC zc2 = (ZC) interfaceC05300n;
        C1361Ye c1361Ye = new C1361Ye(this, c05591q, zc2);
        A0C().postDelayed(c1361Ye, anonymousClass83.A05().A05());
        zc2.A0I(this.A01, this.A08, this.A07.A07, new C1360Yd(this, c1361Ye), c05591q);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1358Yb
    public final void A0O(String str) {
        this.A01.A0D().A3m(str != null);
        super.A0O(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1358Yb
    public final void A0R(boolean z10) {
        super.A0R(z10);
        this.A00 = null;
    }
}
