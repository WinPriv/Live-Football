package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class AB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AE A03;

    public AB(AE ae, int i10, long j10, long j11) {
        this.A03 = ae;
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AF af;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            af = this.A03.A01;
            af.AA3(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
