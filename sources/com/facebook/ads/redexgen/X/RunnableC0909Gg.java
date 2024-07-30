package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Gg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0909Gg implements Runnable {
    public final InterfaceC0908Gf A00;

    public RunnableC0909Gg(InterfaceC0908Gf interfaceC0908Gf) {
        this.A00 = interfaceC0908Gf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.ABG();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
