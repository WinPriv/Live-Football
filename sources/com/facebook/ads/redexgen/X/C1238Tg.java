package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Tg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1238Tg implements GQ {
    public final int A00;
    public final GQ A01;
    public final HZ A02;

    public C1238Tg(GQ gq, HZ hz, int i10) {
        this.A01 = (GQ) H6.A01(gq);
        this.A02 = (HZ) H6.A01(hz);
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    @Nullable
    public final Uri A7i() {
        return this.A01.A7i();
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final long ACq(GU gu) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ACq(gu);
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.GQ
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i10, i11);
    }
}
