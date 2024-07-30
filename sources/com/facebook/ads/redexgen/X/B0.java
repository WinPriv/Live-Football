package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class B0 extends UO implements EH {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final BR A05;
    public final GP A06;

    @Nullable
    public final Object A07;
    public final String A08;

    public B0(Uri uri, GP gp, BR br, int i10, @Nullable String str, int i11, @Nullable Object obj) {
        this.A04 = uri;
        this.A06 = gp;
        this.A05 = br;
        this.A03 = i10;
        this.A08 = str;
        this.A02 = i11;
        this.A00 = b.f7291b;
        this.A07 = obj;
    }

    private void A00(long j10, boolean z10) {
        this.A00 = j10;
        this.A01 = z10;
        A01(new UF(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.UO
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.UO
    public final void A03(W2 w22, boolean z10) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final UH A4Q(EK ek, GI gi) {
        H6.A03(ek.A02 == 0);
        return new B6(this.A04, this.A06.A4E(), this.A05.A4I(), this.A03, A00(ek), this, gi, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void A9T() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.EH
    public final void ACF(long j10, boolean z10) {
        if (j10 == b.f7291b) {
            j10 = this.A00;
        }
        if (this.A00 == j10 && this.A01 == z10) {
            return;
        }
        A00(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.EM
    public final void ADk(UH uh) {
        ((B6) uh).A0R();
    }
}
