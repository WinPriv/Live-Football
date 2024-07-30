package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1033Lg implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC1033Lg(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1027La interfaceC1027La;
        C1048Lw c1048Lw;
        InterfaceC1027La interfaceC1027La2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            interfaceC1027La = this.A00.A00;
            if (interfaceC1027La != null) {
                c1048Lw = this.A00.A05;
                if (c1048Lw.A03()) {
                    interfaceC1027La2 = this.A00.A00;
                    interfaceC1027La2.AAE();
                }
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
