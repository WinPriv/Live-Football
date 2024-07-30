package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* loaded from: assets/audience_network.dex */
public final class A4 implements InterfaceC1227Sv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public A4(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0960Ih
    public final void A9m() {
        C0989Jl.A00(new C1223Sr(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0960Ih
    public final void A9q() {
        C0989Jl.A00(new C1224Ss(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0960Ih
    public final void AAc(J3 j32) {
        C0989Jl.A00(new C1226Su(this, j32));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0960Ih
    public final void ABI() {
        C0989Jl.A00(new C1222Sq(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1227Sv
    public final void ABN() {
        C0989Jl.A00(new C1225St(this));
    }
}
