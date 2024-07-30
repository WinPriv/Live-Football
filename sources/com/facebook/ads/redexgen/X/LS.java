package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class LS {

    @Nullable
    public static LS A02;
    public final SS A00;
    public final LU A01;

    public LS(C1316Wj c1316Wj, Executor executor, AnonymousClass83 anonymousClass83) {
        this.A01 = new LU(c1316Wj);
        this.A00 = new SS(executor, anonymousClass83, c1316Wj);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1316Wj c1316Wj, Executor executor, AnonymousClass83 anonymousClass83) {
        if (!ID.A12(c1316Wj)) {
            return;
        }
        LS ls = A02;
        if (ls == null) {
            A02 = new LS(c1316Wj, executor, anonymousClass83);
            A02.A00();
        } else {
            ls.A02(anonymousClass83);
        }
    }

    private void A02(AnonymousClass83 anonymousClass83) {
        this.A00.A07(anonymousClass83);
    }
}
