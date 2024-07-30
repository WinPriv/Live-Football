package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6B implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C6G A01;

    public C6B(C6G c6g, C6C c6c) {
        this.A01 = c6g;
        new Handler(Looper.getMainLooper()).post(new C1318Wl(this, c6g, c6c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C6C c6c) {
        C7G c7g;
        C7G c7g2;
        long currentTimeMillis = System.currentTimeMillis();
        c7g = this.A01.A04;
        PW A05 = PW.A05(c7g.A00());
        Uri A00 = KM.A00(c6c.A08);
        long j10 = c6c.A00;
        if (j10 == -1) {
            c7g2 = this.A01.A04;
            j10 = ID.A0N(c7g2);
        }
        A05.A0G(A00, new C1317Wk(this, c6c, j10, currentTimeMillis), j10);
    }
}
