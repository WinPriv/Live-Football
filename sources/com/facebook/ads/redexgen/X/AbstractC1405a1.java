package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.a1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1405a1 {

    @Nullable
    public InterfaceC1406a2 A00;

    public final void A00() {
        InterfaceC1406a2 interfaceC1406a2 = this.A00;
        if (interfaceC1406a2 != null) {
            interfaceC1406a2.onStart();
        }
    }

    public final void A01() {
        InterfaceC1406a2 interfaceC1406a2 = this.A00;
        if (interfaceC1406a2 != null) {
            interfaceC1406a2.onStop();
        }
    }

    public final void A02(InterfaceC1406a2 interfaceC1406a2) {
        this.A00 = interfaceC1406a2;
    }
}
