package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* loaded from: assets/audience_network.dex */
public class I3 implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ I8 A01;

    public I3(I8 i82, Format format) {
        this.A01 = i82;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I9 i92;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            i92 = this.A01.A01;
            i92.ACf(this.A00);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
