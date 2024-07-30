package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;

@SuppressLint({"DeprecatedMethod"})
/* loaded from: assets/audience_network.dex */
public final class WX implements InterfaceC06967k {
    public final C7G A00;

    public WX(C7G c7g) {
        this.A00 = c7g;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06967k
    public final void A3R(Throwable th) {
        C06917f.A0E(th);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06967k
    public final void A8D(String str) {
        C0957Ie.A08(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06967k
    public final void A8u(String str, int i10, C06987m c06987m) {
        C06917f.A06(this.A00, str, i10, c06987m);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06967k
    public final void A8v(String str, int i10, C06987m c06987m) {
        C06917f.A06(this.A00, str, i10, c06987m);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06967k
    public final void A94(long j10, long j11, long j12, long j13, int i10, @Nullable Exception exc) {
        C07027q.A03(this.A00, j10, j11, j12, j13, i10, exc);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06967k
    public final void A9D(String str, int i10, C06987m c06987m) {
        C06917f.A07(this.A00, str, i10, c06987m);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06967k
    public final void A9K(String str, int i10, C06987m c06987m) {
        C06917f.A08(this.A00, str, i10, c06987m);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06967k
    public final void A9Q() {
        this.A00.A02().A9Q();
    }
}
