package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class HI {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public HI(byte[] bArr, int i10) {
        HU hu = new HU(bArr);
        hu.A07(i10 * 8);
        this.A04 = hu.A04(16);
        this.A02 = hu.A04(16);
        this.A05 = hu.A04(24);
        this.A03 = hu.A04(24);
        this.A06 = hu.A04(20);
        this.A01 = hu.A04(3) + 1;
        this.A00 = hu.A04(5) + 1;
        this.A07 = ((hu.A04(4) & 15) << 32) | (hu.A04(32) & 4294967295L);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / this.A06;
    }
}
