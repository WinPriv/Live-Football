package com.anythink.expressad.exoplayer.k;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9061a = 32;

    /* renamed from: b, reason: collision with root package name */
    private int f9062b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f9063c;

    public m() {
        this((byte) 0);
    }

    private void a(long j10) {
        int i10 = this.f9062b;
        long[] jArr = this.f9063c;
        if (i10 == jArr.length) {
            this.f9063c = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f9063c;
        int i11 = this.f9062b;
        this.f9062b = i11 + 1;
        jArr2[i11] = j10;
    }

    private long[] b() {
        return Arrays.copyOf(this.f9063c, this.f9062b);
    }

    private m(byte b10) {
        this.f9063c = new long[32];
    }

    private long a(int i10) {
        if (i10 >= 0 && i10 < this.f9062b) {
            return this.f9063c[i10];
        }
        StringBuilder n10 = a3.k.n("Invalid index ", i10, ", size is ");
        n10.append(this.f9062b);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    private int a() {
        return this.f9062b;
    }
}
