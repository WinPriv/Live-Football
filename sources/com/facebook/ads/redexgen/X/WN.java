package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class WN implements C7J {
    public final C7G A00;

    public WN(C7G c7g) {
        this.A00 = c7g;
    }

    @Override // com.facebook.ads.redexgen.X.C7J
    public final Map<String, String> A4T() {
        return C8C.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C7J
    public final Map<String, String> A5g() {
        return C07067u.A02();
    }

    @Override // com.facebook.ads.redexgen.X.C7J
    @Nullable
    public final String A6o() {
        return C07067u.A00();
    }

    @Override // com.facebook.ads.redexgen.X.C7J
    public final String A6q() {
        return C06625s.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.X.C7J
    public final boolean A8S() {
        return KF.A00().A03();
    }
}
