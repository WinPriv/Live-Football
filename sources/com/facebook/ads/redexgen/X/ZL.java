package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;

/* loaded from: assets/audience_network.dex */
public class ZL extends AbstractRunnableC0997Ju {
    public final /* synthetic */ C05370u A00;

    public ZL(C05370u c05370u) {
        this.A00 = c05370u;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        C05360t c05360t;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c05360t = this.A00.A02;
        c05360t.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
