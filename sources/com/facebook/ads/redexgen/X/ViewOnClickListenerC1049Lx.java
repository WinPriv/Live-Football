package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Lx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1049Lx implements View.OnClickListener {
    public final /* synthetic */ S7 A00;

    public ViewOnClickListenerC1049Lx(S7 s72) {
        this.A00 = s72;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1051Lz interfaceC1051Lz;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            interfaceC1051Lz = this.A00.A06;
            interfaceC1051Lz.AAi();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
