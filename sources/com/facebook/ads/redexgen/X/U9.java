package com.facebook.ads.redexgen.X;

import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class U9 implements FK {
    public final List<FJ> A00;

    public U9(List<FJ> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final List<FJ> A69(long j10) {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final long A6Z(int i10) {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6a() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.FK
    public final int A6y(long j10) {
        return -1;
    }
}
