package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public class AA implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ AE A01;

    public AA(AE ae, Format format) {
        this.A01 = ae;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AF af;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            af = this.A01.A01;
            af.AA1(this.A00);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
