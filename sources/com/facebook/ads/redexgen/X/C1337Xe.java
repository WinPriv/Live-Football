package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1337Xe implements InterfaceC06063n {
    public final /* synthetic */ C0849Dw A00;

    public C1337Xe(C0849Dw c0849Dw) {
        this.A00 = c0849Dw;
    }

    private final void A00(C06073o c06073o) {
        int i10 = c06073o.A00;
        if (i10 == 1) {
            this.A00.A06.A1Q(this.A00, c06073o.A02, c06073o.A01);
            return;
        }
        if (i10 == 2) {
            this.A00.A06.A1R(this.A00, c06073o.A02, c06073o.A01);
        } else if (i10 == 4) {
            this.A00.A06.A1T(this.A00, c06073o.A02, c06073o.A01, c06073o.A03);
        } else {
            if (i10 != 8) {
                return;
            }
            this.A00.A06.A1S(this.A00, c06073o.A02, c06073o.A01, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06063n
    public final AbstractC06294l A5O(int i10) {
        AbstractC06294l A1G = this.A00.A1G(i10, true);
        if (A1G == null || this.A00.A01.A0K(A1G.A0H)) {
            return null;
        }
        return A1G;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06063n
    public final void A9O(int i10, int i11, Object obj) {
        this.A00.A1f(i10, i11, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06063n
    public final void A9i(int i10, int i11) {
        this.A00.A1c(i10, i11);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06063n
    public final void A9j(int i10, int i11) {
        this.A00.A1d(i10, i11);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06063n
    public final void A9k(int i10, int i11) {
        this.A00.A1g(i10, i11, true);
        C0849Dw c0849Dw = this.A00;
        c0849Dw.A0G = true;
        c0849Dw.A0s.A00 += i11;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06063n
    public final void A9l(int i10, int i11) {
        this.A00.A1g(i10, i11, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06063n
    public final void AAP(C06073o c06073o) {
        A00(c06073o);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06063n
    public final void AAR(C06073o c06073o) {
        A00(c06073o);
    }
}
