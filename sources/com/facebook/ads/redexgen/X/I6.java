package com.facebook.ads.redexgen.X;

import android.view.Surface;

/* loaded from: assets/audience_network.dex */
public class I6 implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ I8 A01;

    public I6(I8 i82, Surface surface) {
        this.A01 = i82;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9 i92;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            i92 = this.A01.A01;
            i92.AC1(this.A00);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
