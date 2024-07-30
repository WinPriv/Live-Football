package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public class ZH implements InterfaceC06495f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ZC A01;
    public final /* synthetic */ ZC A02;
    public final /* synthetic */ AnonymousClass84 A03;

    public ZH(ZC zc2, int i10, AnonymousClass84 anonymousClass84, ZC zc3) {
        this.A01 = zc2;
        this.A00 = i10;
        this.A03 = anonymousClass84;
        this.A02 = zc3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06495f
    public final void A9v() {
        this.A01.A0B(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06495f
    public final void A9w() {
        InterfaceC05380v interfaceC05380v;
        interfaceC05380v = this.A01.A00;
        interfaceC05380v.AB6(this.A02, J3.A00(AdErrorType.NO_FILL));
    }
}
