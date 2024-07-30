package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* loaded from: assets/audience_network.dex */
public class AS extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1301Vu A01;

    public AS(C1301Vu c1301Vu, AudioTrack audioTrack) {
        this.A01 = c1301Vu;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
