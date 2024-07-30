package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class T9 implements InterfaceC0963Ik {
    public WeakReference<C1228Sw> A00;

    public T9(C1228Sw c1228Sw) {
        this.A00 = new WeakReference<>(c1228Sw);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0963Ik
    public final void ABe(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z10, false);
        }
    }
}
