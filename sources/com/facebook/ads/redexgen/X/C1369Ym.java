package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Ym, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1369Ym implements InterfaceC06495f {
    public final /* synthetic */ C05461d A00;
    public final /* synthetic */ C1316Wj A01;
    public final /* synthetic */ boolean A02;

    public C1369Ym(C05461d c05461d, C1316Wj c1316Wj, boolean z10) {
        this.A00 = c05461d;
        this.A01 = c1316Wj;
        this.A02 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06495f
    public final void A9v() {
        InterfaceC05451c interfaceC05451c;
        C1375Ys c1375Ys;
        if (!ID.A1C(this.A01) || !this.A02) {
            interfaceC05451c = this.A00.A04;
            interfaceC05451c.A9p();
        } else {
            C05461d c05461d = this.A00;
            C1316Wj c1316Wj = this.A01;
            c1375Ys = c05461d.A03;
            c05461d.A02 = C1100Nx.A01(c1316Wj, c1375Ys, 1, new C1370Yn(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06495f
    public final void A9w() {
        InterfaceC05451c interfaceC05451c;
        interfaceC05451c = this.A00.A04;
        interfaceC05451c.A9o(AdError.CACHE_ERROR);
    }
}
