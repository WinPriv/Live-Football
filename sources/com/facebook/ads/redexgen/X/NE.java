package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NE implements View.OnClickListener {
    public final /* synthetic */ NG A00;

    public NE(NG ng) {
        this.A00 = ng;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
