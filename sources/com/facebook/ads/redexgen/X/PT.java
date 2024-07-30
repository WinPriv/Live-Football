package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class PT implements Runnable {
    public final /* synthetic */ PW A00;

    public PT(PW pw) {
        this.A00 = pw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
            handler = this.A00.A04;
            handler.removeCallbacks(this);
            handler2 = this.A00.A04;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
