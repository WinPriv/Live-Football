package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ML implements View.OnClickListener {
    public final /* synthetic */ MD A00;
    public final /* synthetic */ S2 A01;

    public ML(S2 s22, MD md2) {
        this.A01 = s22;
        this.A00 = md2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.A8i();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
