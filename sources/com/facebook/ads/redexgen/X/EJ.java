package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class EJ extends AbstractC1379Yw {
    public final C1316Wj A00;

    public EJ(C1A c1a, List<C1228Sw> list, C1316Wj c1316Wj) {
        super(c1a, list, c1316Wj);
        this.A00 = c1316Wj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SN A06(ViewGroup viewGroup, int i10) {
        return new SN(new C1035Li(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1379Yw, com.facebook.ads.redexgen.X.C4H
    /* renamed from: A0H */
    public final void A0E(SN sn, int i10) {
        super.A0E(sn, i10);
        C1035Li c1035Li = (C1035Li) sn.A0l();
        C1047Lu imageView = (C1047Lu) c1035Li.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i10);
        C1228Sw childAd = ((AbstractC1379Yw) this).A01.get(i10);
        childAd.A11().A0F(this.A00);
        childAd.A1N(c1035Li, c1035Li);
    }
}
