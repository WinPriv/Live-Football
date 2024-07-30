package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f14933a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f14934b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14935c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14936d;

    public t(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14936d = z11;
        if (z11 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f14933a = jArr3;
            long[] jArr4 = new long[i10];
            this.f14934b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f14933a = jArr;
            this.f14934b = jArr2;
        }
        this.f14935c = j10;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return this.f14936d;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f14935c;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        if (!this.f14936d) {
            return new v.a(w.f14942a);
        }
        int a10 = ai.a(this.f14934b, j10, true, true);
        w wVar = new w(this.f14934b[a10], this.f14933a[a10]);
        if (wVar.f14943b != j10 && a10 != this.f14934b.length - 1) {
            int i10 = a10 + 1;
            return new v.a(wVar, new w(this.f14934b[i10], this.f14933a[i10]));
        }
        return new v.a(wVar);
    }
}
