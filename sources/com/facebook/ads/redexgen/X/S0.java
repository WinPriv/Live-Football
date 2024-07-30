package com.facebook.ads.redexgen.X;

import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public class S0 implements InterfaceC1065Mn {
    public final /* synthetic */ C1056Me A00;

    public S0(C1056Me c1056Me) {
        this.A00 = c1056Me;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1065Mn
    public final void AA4(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z11 = this.A00.A07;
        if (z11) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1065Mn
    public final void AAj(boolean z10) {
        boolean z11;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z11 = this.A00.A07;
        if (z11) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z10);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z10 ? 1.0f : 0.3f);
            }
        }
    }
}
