package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class U3 implements FK {
    public final List<FJ> A00;

    public U3(List<FJ> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final List<FJ> A69(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final long A6Z(int i10) {
        H6.A03(i10 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6a() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6y(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
