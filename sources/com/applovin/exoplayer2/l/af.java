package com.applovin.exoplayer2.l;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class af<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f16266a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f16267b;

    /* renamed from: c, reason: collision with root package name */
    private int f16268c;

    /* renamed from: d, reason: collision with root package name */
    private int f16269d;

    public af() {
        this(10);
    }

    private V d() {
        boolean z10;
        if (this.f16269d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a.b(z10);
        V[] vArr = this.f16267b;
        int i10 = this.f16268c;
        V v3 = vArr[i10];
        vArr[i10] = null;
        this.f16268c = (i10 + 1) % vArr.length;
        this.f16269d--;
        return v3;
    }

    private void e() {
        int length = this.f16267b.length;
        if (this.f16269d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) a(i10);
        int i11 = this.f16268c;
        int i12 = length - i11;
        System.arraycopy(this.f16266a, i11, jArr, 0, i12);
        System.arraycopy(this.f16267b, this.f16268c, vArr, 0, i12);
        int i13 = this.f16268c;
        if (i13 > 0) {
            System.arraycopy(this.f16266a, 0, jArr, i12, i13);
            System.arraycopy(this.f16267b, 0, vArr, i12, this.f16268c);
        }
        this.f16266a = jArr;
        this.f16267b = vArr;
        this.f16268c = 0;
    }

    public synchronized void a(long j10, V v3) {
        b(j10);
        e();
        b(j10, v3);
    }

    public synchronized int b() {
        return this.f16269d;
    }

    public synchronized V c() {
        V d10;
        if (this.f16269d == 0) {
            d10 = null;
        } else {
            d10 = d();
        }
        return d10;
    }

    public af(int i10) {
        this.f16266a = new long[i10];
        this.f16267b = (V[]) a(i10);
    }

    private void b(long j10) {
        if (this.f16269d > 0) {
            if (j10 <= this.f16266a[((this.f16268c + r0) - 1) % this.f16267b.length]) {
                a();
            }
        }
    }

    public synchronized void a() {
        this.f16268c = 0;
        this.f16269d = 0;
        Arrays.fill(this.f16267b, (Object) null);
    }

    private void b(long j10, V v3) {
        int i10 = this.f16268c;
        int i11 = this.f16269d;
        V[] vArr = this.f16267b;
        int length = (i10 + i11) % vArr.length;
        this.f16266a[length] = j10;
        vArr[length] = v3;
        this.f16269d = i11 + 1;
    }

    public synchronized V a(long j10) {
        return a(j10, true);
    }

    private V a(long j10, boolean z10) {
        V v3 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f16269d > 0) {
            long j12 = j10 - this.f16266a[this.f16268c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v3 = d();
            j11 = j12;
        }
        return v3;
    }

    private static <V> V[] a(int i10) {
        return (V[]) new Object[i10];
    }
}
