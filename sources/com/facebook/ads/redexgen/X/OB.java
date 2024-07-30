package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class OB {

    @Nullable
    public String A02;

    @Nullable
    public String A03;
    public final C1I A04;
    public final C1U A05;
    public final C1316Wj A06;
    public C1K A01 = C1K.A01(null);
    public int A00 = 1000;

    public OB(C1316Wj c1316Wj, C1I c1i, C1U c1u) {
        this.A06 = c1316Wj;
        this.A04 = c1i;
        this.A05 = c1u;
    }

    public static /* synthetic */ int A00(OB ob2) {
        return ob2.A00;
    }

    public static /* synthetic */ C1I A01(OB ob2) {
        return ob2.A04;
    }

    public static /* synthetic */ C1K A02(OB ob2) {
        return ob2.A01;
    }

    public static /* synthetic */ C1U A03(OB ob2) {
        return ob2.A05;
    }

    public static /* synthetic */ C1316Wj A04(OB ob2) {
        return ob2.A06;
    }

    public static /* synthetic */ String A05(OB ob2) {
        return ob2.A03;
    }

    public static /* synthetic */ String A06(OB ob2) {
        return ob2.A02;
    }

    public final OB A07(int i10) {
        this.A00 = i10;
        return this;
    }

    public final OB A08(C1K c1k) {
        this.A01 = c1k;
        return this;
    }

    public final OB A09(String str) {
        this.A02 = str;
        return this;
    }

    public final OB A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final OD A0B() {
        return new OD(this, null);
    }
}
