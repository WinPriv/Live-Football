package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Yj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1366Yj implements InterfaceC05541l {
    public final /* synthetic */ C05461d A00;

    public C1366Yj(C05461d c05461d) {
        this.A00 = c05461d;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05541l
    public final void ABg(AdError adError) {
        InterfaceC05451c interfaceC05451c;
        interfaceC05451c = this.A00.A04;
        interfaceC05451c.A9o(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05541l
    public final void ABh() {
        InterfaceC05451c interfaceC05451c;
        interfaceC05451c = this.A00.A04;
        interfaceC05451c.A9p();
    }
}
