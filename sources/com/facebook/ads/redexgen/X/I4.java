package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class I4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ I8 A02;

    public I4(I8 i82, int i10, long j10) {
        this.A02 = i82;
        this.A00 = i10;
        this.A01 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9 i92;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            i92 = this.A02.A01;
            i92.AAY(this.A00, this.A01);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
