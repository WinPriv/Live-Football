package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class G9 implements QO {
    @Override // com.facebook.ads.redexgen.X.QO
    public final long A4f() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.X.QO
    public final void AEl(Object obj, long j10) throws InterruptedException {
        obj.wait(j10);
    }
}
