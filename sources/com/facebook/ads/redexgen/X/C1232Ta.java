package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ta, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1232Ta implements GP {
    public final int A00;

    @Nullable
    public final GN A01;
    public final GP A02;
    public final GP A03;
    public final InterfaceC0919Gq A04;

    @Nullable
    public final InterfaceC0921Gs A05;

    public C1232Ta(InterfaceC0919Gq interfaceC0919Gq, GP gp, GP gp2, GN gn, int i10, InterfaceC0921Gs interfaceC0921Gs) {
        this.A04 = interfaceC0919Gq;
        this.A03 = gp;
        this.A02 = gp2;
        this.A01 = gn;
        this.A00 = i10;
        this.A05 = interfaceC0921Gs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.GP
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1233Tb A4E() {
        InterfaceC0919Gq interfaceC0919Gq = this.A04;
        GQ A4E = this.A03.A4E();
        GQ A4E2 = this.A02.A4E();
        GN gn = this.A01;
        return new C1233Tb(interfaceC0919Gq, A4E, A4E2, gn != null ? gn.createDataSink() : null, this.A00, this.A05);
    }
}
