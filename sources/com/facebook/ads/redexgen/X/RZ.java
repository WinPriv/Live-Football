package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* loaded from: assets/audience_network.dex */
public class RZ implements InterfaceC1064Mm {
    public final /* synthetic */ RX A00;

    public RZ(RX rx) {
        this.A00 = rx;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    public final void ABa(String str) {
        C1057Mf c1057Mf;
        C1057Mf c1057Mf2;
        this.A00.A0I = false;
        c1057Mf = this.A00.A0C;
        c1057Mf.setProgress(100);
        c1057Mf2 = this.A00.A0C;
        LE.A0N(c1057Mf2, 8);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    public final void ABc(String str) {
        C1057Mf c1057Mf;
        C1056Me c1056Me;
        this.A00.A0I = true;
        c1057Mf = this.A00.A0C;
        LE.A0N(c1057Mf, 0);
        c1056Me = this.A00.A0B;
        c1056Me.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    public final void ABt(int i10) {
        boolean z10;
        C1057Mf c1057Mf;
        z10 = this.A00.A0I;
        if (z10) {
            c1057Mf = this.A00.A0C;
            c1057Mf.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    public final void ABy(String str) {
        C1056Me c1056Me;
        c1056Me = this.A00.A0B;
        c1056Me.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1064Mm
    @RequiresApi(api = 26)
    public final void AC0() {
        NV nv;
        nv = this.A00.A0E;
        nv.A09().AA9(14);
    }
}
