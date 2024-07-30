package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public class NU {

    @Nullable
    public View A02;

    @Nullable
    public C1228Sw A03;

    @Nullable
    public AbstractC1028Lb A04;

    @Nullable
    public IX A05;

    @Nullable
    public final View A06;
    public final AnonymousClass18 A07;
    public final C1316Wj A08;
    public final IT A09;
    public final L6 A0A;
    public final InterfaceC1029Lc A0B;
    public final C1137Pi A0C;
    public int A01 = 0;
    public int A00 = 1;

    public NU(C1316Wj c1316Wj, IT it, InterfaceC1029Lc interfaceC1029Lc, AnonymousClass18 anonymousClass18, @Nullable View view, C1137Pi c1137Pi, L6 l62) {
        this.A08 = c1316Wj;
        this.A09 = it;
        this.A0B = interfaceC1029Lc;
        this.A07 = anonymousClass18;
        this.A06 = view;
        this.A0C = c1137Pi;
        this.A0A = l62;
    }

    public final NU A0D(int i10) {
        this.A00 = i10;
        return this;
    }

    public final NU A0E(int i10) {
        this.A01 = i10;
        return this;
    }

    public final NU A0F(View view) {
        this.A02 = view;
        return this;
    }

    public final NU A0G(C1228Sw c1228Sw) {
        this.A03 = c1228Sw;
        return this;
    }

    public final NU A0H(AbstractC1028Lb abstractC1028Lb) {
        this.A04 = abstractC1028Lb;
        return this;
    }

    public final NU A0I(IX ix) {
        this.A05 = ix;
        return this;
    }

    public final NV A0J() {
        return new NV(this);
    }
}
