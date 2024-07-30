package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class Z7 implements InterfaceC06495f {
    public final /* synthetic */ C0854Eb A00;
    public final /* synthetic */ boolean A01;

    public Z7(C0854Eb c0854Eb, boolean z10) {
        this.A00 = c0854Eb;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06495f
    public final void A9v() {
        C1316Wj c1316Wj;
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        C1316Wj c1316Wj2;
        AnonymousClass18 anonymousClass18;
        c1316Wj = this.A00.A04;
        if (!ID.A1F(c1316Wj) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass14 = this.A00.A01;
            anonymousClass14.AC6(this.A00);
            return;
        }
        C0854Eb c0854Eb = this.A00;
        c1316Wj2 = c0854Eb.A04;
        anonymousClass18 = this.A00.A03;
        c0854Eb.A07 = C1100Nx.A01(c1316Wj2, (C1371Yo) anonymousClass18, 0, new Z8(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06495f
    public final void A9w() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC9(this.A00, AdError.CACHE_ERROR);
    }
}
