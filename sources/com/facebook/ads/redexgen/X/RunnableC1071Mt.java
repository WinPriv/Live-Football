package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1071Mt implements Runnable {
    public final /* synthetic */ C1072Mu A00;
    public final /* synthetic */ InterfaceC1073Mv A01;

    public RunnableC1071Mt(C1072Mu c1072Mu, InterfaceC1073Mv interfaceC1073Mv) {
        this.A00 = c1072Mu;
        this.A01 = interfaceC1073Mv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A01.A9x();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
