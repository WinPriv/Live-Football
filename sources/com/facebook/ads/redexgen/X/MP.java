package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MP implements View.OnClickListener {
    public final /* synthetic */ MR A00;

    public MP(MR mr) {
        this.A00 = mr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MB mb2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            mb2 = this.A00.A02;
            mb2.A7r();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
