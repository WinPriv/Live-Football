package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class IP {
    public double A00;
    public IV A01;
    public IW A02;
    public String A03;
    public String A04;

    @Nullable
    public Map<String, String> A05;
    public boolean A06;

    public final IP A00(double d10) {
        this.A00 = d10;
        return this;
    }

    public final IP A01(IV iv) {
        this.A01 = iv;
        return this;
    }

    public final IP A02(IW iw) {
        this.A02 = iw;
        return this;
    }

    public final IP A03(String str) {
        this.A03 = str;
        return this;
    }

    public final IP A04(String str) {
        this.A04 = str;
        return this;
    }

    public final IP A05(@Nullable Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final IP A06(boolean z10) {
        this.A06 = z10;
        return this;
    }

    public final IQ A07(C7G c7g) {
        return new IQ(c7g, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
