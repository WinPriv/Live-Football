package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EO implements Runnable {
    public final /* synthetic */ EX A00;
    public final /* synthetic */ InterfaceC0853Ea A01;

    public EO(EX ex, InterfaceC0853Ea interfaceC0853Ea) {
        this.A00 = ex;
        this.A01 = interfaceC0853Ea;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A01.ABP(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
