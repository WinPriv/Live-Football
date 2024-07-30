package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class I1 implements Runnable {
    public final /* synthetic */ C0771Ai A00;
    public final /* synthetic */ I8 A01;

    public I1(I8 i82, C0771Ai c0771Ai) {
        this.A01 = i82;
        this.A00 = c0771Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9 i92;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            i92 = this.A01.A01;
            i92.ACc(this.A00);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
