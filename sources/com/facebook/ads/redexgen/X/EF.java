package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EF implements Runnable {
    public final /* synthetic */ B6 A00;

    public EF(B6 b62) {
        this.A00 = b62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        UI ui;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0G;
            if (!z10) {
                ui = this.A00.A08;
                ui.AAJ(this.A00);
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
