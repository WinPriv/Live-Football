package com.facebook.ads.redexgen.X;

import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: assets/audience_network.dex */
public class TM extends AbstractRunnableC0997Ju {
    public final /* synthetic */ TL A00;

    public TM(TL tl) {
        this.A00 = tl;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0997Ju
    public final void A06() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (threadPoolExecutor.getQueue().isEmpty()) {
            threadPoolExecutor2 = this.A00.A0B;
            runnable = this.A00.A0A;
            threadPoolExecutor2.execute(runnable);
        }
    }
}
