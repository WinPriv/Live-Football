package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class AR extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1301Vu A01;

    public AR(C1301Vu c1301Vu, AudioTrack audioTrack) {
        this.A01 = c1301Vu;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                conditionVariable = this.A01.A0f;
                conditionVariable.open();
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
