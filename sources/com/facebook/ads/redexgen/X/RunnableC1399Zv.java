package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1399Zv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1398Zu A01;

    public RunnableC1399Zv(C1398Zu c1398Zu, int i10) {
        this.A01 = c1398Zu;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        InterfaceC1177Qw interfaceC1177Qw;
        Handler handler;
        Runnable runnable;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            z10 = this.A01.A01;
            if (z10) {
                C1398Zu c1398Zu = this.A01;
                interfaceC1177Qw = this.A01.A05;
                c1398Zu.A06(interfaceC1177Qw.A9d());
                handler = this.A01.A04;
                runnable = this.A01.A09;
                handler.postDelayed(runnable, this.A00);
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
