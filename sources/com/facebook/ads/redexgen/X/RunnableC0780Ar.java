package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0780Ar implements Runnable {
    public final /* synthetic */ C0784Av A00;
    public final /* synthetic */ InterfaceC0785Aw A01;
    public final /* synthetic */ Exception A02;

    public RunnableC0780Ar(C0784Av c0784Av, InterfaceC0785Aw interfaceC0785Aw, Exception exc) {
        this.A00 = c0784Av;
        this.A01 = interfaceC0785Aw;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A01.AAX(this.A02);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
