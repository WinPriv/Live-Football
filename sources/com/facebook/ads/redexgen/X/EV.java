package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EV implements Runnable {
    public final /* synthetic */ EX A00;
    public final /* synthetic */ EZ A01;
    public final /* synthetic */ InterfaceC0853Ea A02;

    public EV(EX ex, InterfaceC0853Ea interfaceC0853Ea, EZ ez) {
        this.A00 = ex;
        this.A02 = interfaceC0853Ea;
        this.A01 = ez;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A02.AAT(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
