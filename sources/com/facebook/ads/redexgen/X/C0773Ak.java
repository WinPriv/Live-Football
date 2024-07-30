package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ak, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0773Ak extends Thread {
    public final /* synthetic */ AbstractC1292Vl A00;

    public C0773Ak(AbstractC1292Vl abstractC1292Vl) {
        this.A00 = abstractC1292Vl;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
