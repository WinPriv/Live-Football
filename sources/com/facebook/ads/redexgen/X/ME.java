package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class ME implements View.OnClickListener {
    public final /* synthetic */ S3 A00;

    public ME(S3 s32) {
        this.A00 = s32;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A43();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
