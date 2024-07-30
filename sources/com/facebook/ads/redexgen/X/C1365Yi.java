package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1365Yi implements InterfaceC06495f {
    public final /* synthetic */ C05461d A00;

    public C1365Yi(C05461d c05461d) {
        this.A00 = c05461d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06495f
    public final void A9v() {
        InterfaceC05451c interfaceC05451c;
        interfaceC05451c = this.A00.A04;
        interfaceC05451c.A9p();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06495f
    public final void A9w() {
        InterfaceC05451c interfaceC05451c;
        interfaceC05451c = this.A00.A04;
        interfaceC05451c.A9o(AdError.CACHE_ERROR);
    }
}
