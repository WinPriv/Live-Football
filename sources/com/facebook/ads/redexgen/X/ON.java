package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ON implements View.OnClickListener {
    public final /* synthetic */ OO A00;

    public ON(OO oo) {
        this.A00 = oo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6A c6a;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            c6a = this.A00.A05;
            c6a.performClick();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
