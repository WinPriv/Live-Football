package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1339Xg implements InterfaceC06364s {
    public final /* synthetic */ C0849Dw A00;

    public C1339Xg(C0849Dw c0849Dw) {
        this.A00 = c0849Dw;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06364s
    public final void ADE(AbstractC06294l abstractC06294l, C4O c4o, C4O c4o2) {
        this.A00.A1n(abstractC06294l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06364s
    public final void ADG(AbstractC06294l abstractC06294l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        this.A00.A0r.A0c(abstractC06294l);
        this.A00.A1o(abstractC06294l, c4o, c4o2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06364s
    public final void ADI(AbstractC06294l abstractC06294l, @NonNull C4O c4o, @NonNull C4O c4o2) {
        abstractC06294l.A0Z(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0H(abstractC06294l, abstractC06294l, c4o, c4o2)) {
                this.A00.A1N();
            }
        } else {
            if (!this.A00.A05.A0G(abstractC06294l, c4o, c4o2)) {
                return;
            }
            this.A00.A1N();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06364s
    public final void AF8(AbstractC06294l abstractC06294l) {
        this.A00.A06.A1D(abstractC06294l.A0H, this.A00.A0r);
    }
}
