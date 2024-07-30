package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;

/* loaded from: classes.dex */
public class d implements v {

    /* renamed from: a, reason: collision with root package name */
    private final long f14169a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14170b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14171c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14172d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14173e;
    private final long f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f14174g;

    public d(long j10, long j11, int i10, int i11, boolean z10) {
        this.f14169a = j10;
        this.f14170b = j11;
        this.f14171c = i11 == -1 ? 1 : i11;
        this.f14173e = i10;
        this.f14174g = z10;
        if (j10 == -1) {
            this.f14172d = -1L;
            this.f = com.anythink.expressad.exoplayer.b.f7291b;
        } else {
            this.f14172d = j10 - j11;
            this.f = a(j10, j11, i10);
        }
    }

    private long c(long j10) {
        int i10 = this.f14171c;
        long j11 = (((j10 * this.f14173e) / 8000000) / i10) * i10;
        long j12 = this.f14172d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - i10);
        }
        return this.f14170b + Math.max(j11, 0L);
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return this.f14172d != -1 || this.f14174g;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        if (this.f14172d == -1 && !this.f14174g) {
            return new v.a(new w(0L, this.f14170b));
        }
        long c10 = c(j10);
        long b10 = b(c10);
        w wVar = new w(b10, c10);
        if (this.f14172d != -1 && b10 < j10) {
            int i10 = this.f14171c;
            if (i10 + c10 < this.f14169a) {
                long j11 = c10 + i10;
                return new v.a(wVar, new w(b(j11), j11));
            }
        }
        return new v.a(wVar);
    }

    public long b(long j10) {
        return a(j10, this.f14170b, this.f14173e);
    }

    private static long a(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }
}
