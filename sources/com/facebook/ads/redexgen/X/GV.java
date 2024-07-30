package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class GV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C1251Tt A03;

    public GV(C1251Tt c1251Tt, int i10, long j10, long j11) {
        this.A03 = c1251Tt;
        this.A00 = i10;
        this.A02 = j10;
        this.A01 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GK gk;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            gk = this.A03.A07;
            gk.AA5(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
