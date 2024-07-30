package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MQ implements View.OnClickListener {
    public final /* synthetic */ C2H A00;
    public final /* synthetic */ MD A01;
    public final /* synthetic */ MR A02;

    public MQ(MR mr, MD md2, C2H c2h) {
        this.A02 = mr;
        this.A01 = md2;
        this.A00 = c2h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MB mb2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            mb2 = this.A02.A02;
            mb2.ABZ(this.A00);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
