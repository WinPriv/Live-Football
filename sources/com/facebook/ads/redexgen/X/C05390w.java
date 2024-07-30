package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05390w extends C2M implements InterfaceC0968Ip {
    public AnonymousClass96 A00;

    @Nullable
    public List<OM> A01;

    public C05390w(C1316Wj c1316Wj) {
        super(c1316Wj);
        this.A00 = new AnonymousClass96(this, 1, null, null, null);
    }

    public final void A22(C1137Pi c1137Pi) {
        AnonymousClass96 anonymousClass96 = this.A00;
        if (anonymousClass96 != null) {
            anonymousClass96.A0d(c1137Pi);
        }
    }

    public AnonymousClass96 getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0e(this.A01);
    }
}
