package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.h.o;

/* loaded from: assets/audience_network.dex */
public final class UJ implements F8 {

    @Nullable
    public BR A02;

    @Nullable
    public Object A03;

    @Nullable
    public String A04;
    public boolean A05;
    public final GP A06;
    public int A01 = -1;
    public int A00 = o.f8460d;

    public UJ(GP gp) {
        this.A06 = gp;
    }

    public final UJ A00(String str) {
        H6.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final B0 A01(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new C1285Ve();
        }
        return new B0(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
