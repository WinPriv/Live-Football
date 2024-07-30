package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1284Vd implements InterfaceC0789Ba {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0789Ba
    public final void A5T(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0789Ba
    public final int AE7(BP bp, int i10, boolean z10) throws IOException, InterruptedException {
        int AEh = bp.AEh(i10);
        if (AEh == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return AEh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0789Ba
    public final void AE8(HV hv, int i10) {
        hv.A0Z(i10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0789Ba
    public final void AE9(long j10, int i10, int i11, int i12, BZ bz) {
    }
}
