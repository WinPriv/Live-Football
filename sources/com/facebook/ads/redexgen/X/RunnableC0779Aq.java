package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Aq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0779Aq implements Runnable {
    public final /* synthetic */ C0784Av A00;
    public final /* synthetic */ InterfaceC0785Aw A01;

    public RunnableC0779Aq(C0784Av c0784Av, InterfaceC0785Aw interfaceC0785Aw) {
        this.A00 = c0784Av;
        this.A01 = interfaceC0785Aw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A01.AAU();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
