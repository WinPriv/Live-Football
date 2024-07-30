package com.applovin.exoplayer2.e.j;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    private final b f14905a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14906b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14907c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14908d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14909e;

    public d(b bVar, int i10, long j10, long j11) {
        this.f14905a = bVar;
        this.f14906b = i10;
        this.f14907c = j10;
        long j12 = (j11 - j10) / bVar.f14901e;
        this.f14908d = j12;
        this.f14909e = b(j12);
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f14909e;
    }

    private long b(long j10) {
        return ai.d(j10 * this.f14906b, 1000000L, this.f14905a.f14899c);
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        long a10 = ai.a((this.f14905a.f14899c * j10) / (this.f14906b * 1000000), 0L, this.f14908d - 1);
        long j11 = (this.f14905a.f14901e * a10) + this.f14907c;
        long b10 = b(a10);
        w wVar = new w(b10, j11);
        if (b10 < j10 && a10 != this.f14908d - 1) {
            long j12 = a10 + 1;
            return new v.a(wVar, new w(b(j12), (this.f14905a.f14901e * j12) + this.f14907c));
        }
        return new v.a(wVar);
    }
}
