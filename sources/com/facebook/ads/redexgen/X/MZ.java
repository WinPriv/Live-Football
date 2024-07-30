package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MZ implements View.OnClickListener {
    public final /* synthetic */ C1056Me A00;

    public MZ(C1056Me c1056Me) {
        this.A00 = c1056Me;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1055Md interfaceC1055Md;
        InterfaceC1055Md interfaceC1055Md2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            interfaceC1055Md = this.A00.A04;
            if (interfaceC1055Md == null) {
                return;
            }
            interfaceC1055Md2 = this.A00.A04;
            interfaceC1055Md2.AAE();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
