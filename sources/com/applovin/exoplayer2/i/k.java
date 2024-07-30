package com.applovin.exoplayer2.i;

import java.util.List;

/* loaded from: classes.dex */
public abstract class k extends com.applovin.exoplayer2.c.i implements f {

    /* renamed from: c, reason: collision with root package name */
    private f f15865c;

    /* renamed from: d, reason: collision with root package name */
    private long f15866d;

    public void a(long j10, f fVar, long j11) {
        ((com.applovin.exoplayer2.c.i) this).f13657a = j10;
        this.f15865c = fVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f15866d = j10;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<a> b(long j10) {
        return ((f) com.applovin.exoplayer2.l.a.b(this.f15865c)).b(j10 - this.f15866d);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return ((f) com.applovin.exoplayer2.l.a.b(this.f15865c)).f_();
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        return ((f) com.applovin.exoplayer2.l.a.b(this.f15865c)).a(i10) + this.f15866d;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        return ((f) com.applovin.exoplayer2.l.a.b(this.f15865c)).a(j10 - this.f15866d);
    }

    @Override // com.applovin.exoplayer2.c.a
    public void a() {
        super.a();
        this.f15865c = null;
    }
}
