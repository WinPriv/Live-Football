package com.facebook.ads.redexgen.X;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Ps, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1147Ps {
    public C1151Pw A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C1147Ps A00(C1151Pw c1151Pw) {
        this.A00 = c1151Pw;
        return this;
    }

    public final C1147Ps A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C1147Ps A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C1147Ps A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C1147Ps A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C1148Pt A05() {
        return new C1148Pt(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
