package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ef, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0858Ef {

    @Nullable
    public C0858Ef A00;

    @Nullable
    public GH A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C0858Ef(long j10, int i10) {
        this.A04 = j10;
        this.A03 = i10 + j10;
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A04)) + this.A01.A00;
    }

    public final C0858Ef A01() {
        this.A01 = null;
        C0858Ef c0858Ef = this.A00;
        this.A00 = null;
        return c0858Ef;
    }

    public final void A02(GH gh, C0858Ef c0858Ef) {
        this.A01 = gh;
        this.A00 = c0858Ef;
        this.A02 = true;
    }
}
