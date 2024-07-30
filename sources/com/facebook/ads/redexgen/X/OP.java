package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OP implements View.OnClickListener {
    public final /* synthetic */ OS A00;

    public OP(OS os) {
        this.A00 = os;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OR or;
        OQ oq;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            or = this.A00.A02;
            oq = this.A00.A01;
            or.ACN(oq);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
