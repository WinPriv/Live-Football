package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1335Xc implements InterfaceC06324o {
    public final /* synthetic */ C4T A00;

    public C1335Xc(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06324o
    public final View A5x(int i10) {
        return this.A00.A0t(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06324o
    public final int A5z(View view) {
        return this.A00.A0n(view) + ((C4U) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06324o
    public final int A60(View view) {
        return this.A00.A0k(view) - ((C4U) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06324o
    public final int A75() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06324o
    public final int A76() {
        return this.A00.A0e();
    }
}
