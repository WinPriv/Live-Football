package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public abstract class M1 extends RelativeLayout implements InterfaceC1122Ot {

    @Nullable
    public P1 A00;

    public M1(C1316Wj c1316Wj) {
        super(c1316Wj);
    }

    public M1(C1316Wj c1316Wj, AttributeSet attributeSet, int i10) {
        super(c1316Wj, attributeSet, i10);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1122Ot
    public final void A8l(P1 p12) {
        this.A00 = p12;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1122Ot
    public final void AF5(P1 p12) {
        A08();
        this.A00 = null;
    }

    @Nullable
    public P1 getVideoView() {
        return this.A00;
    }
}
