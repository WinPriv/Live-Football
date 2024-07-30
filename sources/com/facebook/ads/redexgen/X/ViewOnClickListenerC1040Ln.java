package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ln, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1040Ln implements View.OnClickListener {
    public final /* synthetic */ S9 A00;

    public ViewOnClickListenerC1040Ln(S9 s92) {
        this.A00 = s92;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A0X(false);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
