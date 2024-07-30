package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MS implements View.OnClickListener {
    public final /* synthetic */ S1 A00;

    public MS(S1 s12) {
        this.A00 = s12;
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
