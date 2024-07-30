package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EE implements Runnable {
    public final /* synthetic */ B6 A00;

    public EE(B6 b62) {
        this.A00 = b62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
