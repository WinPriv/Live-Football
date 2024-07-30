package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class GG {
    public final int A00;
    public final GD A01;

    @Nullable
    public final Object A02;
    public final C07459h[] A03;

    public GG(C07459h[] c07459hArr, GC[] gcArr, @Nullable Object obj) {
        this.A03 = c07459hArr;
        this.A01 = new GD(gcArr);
        this.A02 = obj;
        this.A00 = c07459hArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(GG gg) {
        if (gg == null || gg.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i10 = 0; i10 < this.A01.A01; i10++) {
            if (!A02(gg, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(GG gg, int i10) {
        return gg != null && C0940Hl.A0g(this.A03[i10], gg.A03[i10]) && C0940Hl.A0g(this.A01.A00(i10), gg.A01.A00(i10));
    }
}
