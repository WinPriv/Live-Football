package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.v;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f14438a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14439b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14440c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14441d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14442e;
    public final v f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14443g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f14444h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f14445i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14446j;

    /* renamed from: k, reason: collision with root package name */
    private final l[] f14447k;

    public k(int i10, int i11, long j10, long j11, long j12, v vVar, int i12, l[] lVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f14438a = i10;
        this.f14439b = i11;
        this.f14440c = j10;
        this.f14441d = j11;
        this.f14442e = j12;
        this.f = vVar;
        this.f14443g = i12;
        this.f14447k = lVarArr;
        this.f14446j = i13;
        this.f14444h = jArr;
        this.f14445i = jArr2;
    }

    public l a(int i10) {
        l[] lVarArr = this.f14447k;
        if (lVarArr == null) {
            return null;
        }
        return lVarArr[i10];
    }
}
