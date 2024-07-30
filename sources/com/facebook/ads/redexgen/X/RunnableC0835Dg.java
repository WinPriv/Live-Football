package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Dg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0835Dg implements Runnable {
    public final /* synthetic */ RunnableC0838Dj A00;

    public RunnableC0835Dg(RunnableC0838Dj runnableC0838Dj) {
        this.A00 = runnableC0838Dj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A0F(5, 3);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
