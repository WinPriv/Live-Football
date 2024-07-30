package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class I2 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ I8 A02;
    public final /* synthetic */ String A03;

    public I2(I8 i82, String str, long j10, long j11) {
        this.A02 = i82;
        this.A03 = str;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9 i92;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            i92 = this.A02.A01;
            i92.ACa(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
