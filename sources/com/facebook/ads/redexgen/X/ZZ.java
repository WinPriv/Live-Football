package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* loaded from: assets/audience_network.dex */
public final class ZZ implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public ZZ(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void ACr(int i10) throws ZY {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws ZY {
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int length() throws ZY {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws ZY {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
