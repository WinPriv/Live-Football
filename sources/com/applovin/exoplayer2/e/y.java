package com.applovin.exoplayer2.e;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14949a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14950b;

    /* renamed from: c, reason: collision with root package name */
    private int f14951c;

    /* renamed from: d, reason: collision with root package name */
    private int f14952d;

    public y(byte[] bArr) {
        this.f14949a = bArr;
        this.f14950b = bArr.length;
    }

    private void c() {
        boolean z10;
        int i10;
        int i11 = this.f14951c;
        if (i11 >= 0 && (i11 < (i10 = this.f14950b) || (i11 == i10 && this.f14952d == 0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
    }

    public boolean a() {
        boolean z10 = (((this.f14949a[this.f14951c] & DefaultClassResolver.NAME) >> this.f14952d) & 1) == 1;
        b(1);
        return z10;
    }

    public void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f14951c + i11;
        this.f14951c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f14952d;
        this.f14952d = i13;
        if (i13 > 7) {
            this.f14951c = i12 + 1;
            this.f14952d = i13 - 8;
        }
        c();
    }

    public int a(int i10) {
        int i11 = this.f14951c;
        int min = Math.min(i10, 8 - this.f14952d);
        int i12 = i11 + 1;
        int i13 = ((this.f14949a[i11] & DefaultClassResolver.NAME) >> this.f14952d) & (com.anythink.expressad.exoplayer.k.p.f9095b >> (8 - min));
        while (min < i10) {
            i13 |= (this.f14949a[i12] & DefaultClassResolver.NAME) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }

    public int b() {
        return (this.f14951c * 8) + this.f14952d;
    }
}
