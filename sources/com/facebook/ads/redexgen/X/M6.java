package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class M6 implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public M6(M8 m82) {
        this.A00 = m82;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MB mb2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            mb2 = this.A00.A04;
            mb2.A8h();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
