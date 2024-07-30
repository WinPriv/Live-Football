package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class NM extends C2A {
    public final /* synthetic */ C1063Ml A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NM(C1063Ml c1063Ml, double d10, double d11, double d12, boolean z10) {
        super(d10, d11, d12, z10);
        this.A00 = c1063Ml;
    }

    @Override // com.facebook.ads.redexgen.X.C2A
    public final void A00(boolean z10, boolean z11, C2C c2c) {
        IT it;
        String str;
        Map<String, String> A0J;
        if (z11) {
            it = this.A00.A06;
            str = this.A00.A0B;
            A0J = this.A00.A0J(EnumC1115Om.A03);
            it.A9L(str, A0J);
        }
    }
}
