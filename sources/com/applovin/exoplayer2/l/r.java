package com.applovin.exoplayer2.l;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private int f16327a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f16328b;

    public r() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f16327a;
        long[] jArr = this.f16328b;
        if (i10 == jArr.length) {
            this.f16328b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f16328b;
        int i11 = this.f16327a;
        this.f16327a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long[] b() {
        return Arrays.copyOf(this.f16328b, this.f16327a);
    }

    public r(int i10) {
        this.f16328b = new long[i10];
    }

    public long a(int i10) {
        if (i10 >= 0 && i10 < this.f16327a) {
            return this.f16328b[i10];
        }
        StringBuilder n10 = a3.k.n("Invalid index ", i10, ", size is ");
        n10.append(this.f16327a);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public int a() {
        return this.f16327a;
    }
}
