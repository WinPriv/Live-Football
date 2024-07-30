package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MJ implements View.OnClickListener {
    public final /* synthetic */ MD A00;
    public final /* synthetic */ S2 A01;

    public MJ(S2 s22, MD md2) {
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
            this.A01.A0B.ABQ(C2F.A03);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
