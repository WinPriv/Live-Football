package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MI implements View.OnClickListener {
    public final /* synthetic */ S2 A00;

    public MI(S2 s22) {
        this.A00 = s22;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A7r();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
