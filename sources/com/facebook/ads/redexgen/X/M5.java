package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class M5 implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public M5(M8 m82) {
        this.A00 = m82;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        MB mb2;
        MB mb3;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A05;
            if (z10) {
                mb3 = this.A00.A04;
                mb3.A42();
            } else {
                mb2 = this.A00.A04;
                mb2.A43();
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
