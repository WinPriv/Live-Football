package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1178Qx implements InterfaceC1084Ng {
    public final /* synthetic */ C1176Qv A00;

    public C1178Qx(C1176Qv c1176Qv) {
        this.A00 = c1176Qv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1084Ng
    public final void ACg(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1084Ng
    public final void ACi(View view) {
        RW rw = (RW) view;
        rw.A0g();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) rw.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
