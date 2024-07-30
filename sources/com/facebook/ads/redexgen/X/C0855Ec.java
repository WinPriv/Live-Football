package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0855Ec extends AbstractC1362Yf {
    public final /* synthetic */ C0854Eb A00;
    public final /* synthetic */ AbstractC1382Yz A01;
    public final /* synthetic */ C1371Yo A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0855Ec(C0854Eb c0854Eb, boolean z10, boolean z11, C1371Yo c1371Yo, AbstractC1382Yz abstractC1382Yz) {
        super(z10);
        this.A00 = c0854Eb;
        this.A03 = z11;
        this.A02 = c1371Yo;
        this.A01 = abstractC1382Yz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1362Yf
    public final void A00() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC9(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1362Yf
    public final void A01(boolean z10) {
        C1316Wj c1316Wj;
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        C1316Wj c1316Wj2;
        c1316Wj = this.A00.A04;
        if (!ID.A1F(c1316Wj) || !this.A03) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            anonymousClass14 = this.A00.A01;
            anonymousClass14.AC6(this.A01);
            return;
        }
        C0854Eb c0854Eb = this.A00;
        c1316Wj2 = c0854Eb.A04;
        c0854Eb.A07 = C1100Nx.A01(c1316Wj2, this.A02, 0, new Z6(this));
    }
}
