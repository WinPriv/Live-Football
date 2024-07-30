package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class RM extends FrameLayout implements InterfaceC1030Ld {
    public final InterfaceC1029Lc A00;
    public final C1099Nw A01;

    public RM(C1316Wj c1316Wj, InterfaceC1029Lc interfaceC1029Lc, C1099Nw c1099Nw) {
        super(c1316Wj);
        this.A01 = c1099Nw;
        this.A00 = interfaceC1029Lc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void A8k(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        C1099Nw.A0B().incrementAndGet();
        this.A01.A0V();
        LE.A0J(this.A01.A0O());
        addView(this.A01.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A00.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void ABd(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AC2(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void AEA(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1030Ld
    public final void onDestroy() {
        this.A01.A0U();
        if (this.A01.A0N() != null) {
            this.A01.A0N().AAn();
        }
        C1099Nw.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC1029Lc interfaceC1029Lc) {
    }
}
