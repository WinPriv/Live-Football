package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SR implements AnonymousClass57 {
    public final /* synthetic */ SO A00;

    public SR(SO so) {
        this.A00 = so;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass57
    public final boolean A8K() {
        C1206Rz c1206Rz;
        C1206Rz c1206Rz2;
        c1206Rz = this.A00.A0B;
        if (c1206Rz.canGoBack()) {
            c1206Rz2 = this.A00.A0B;
            c1206Rz2.goBack();
            return true;
        }
        return false;
    }
}
