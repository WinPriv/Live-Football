package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class AD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AE A01;

    public AD(AE ae, int i10) {
        this.A01 = ae;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AF af;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            af = this.A01.A01;
            af.AA2(this.A00);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
