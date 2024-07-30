package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final long f14287a;

    /* renamed from: b, reason: collision with root package name */
    private final r f14288b;

    /* renamed from: c, reason: collision with root package name */
    private final r f14289c;

    /* renamed from: d, reason: collision with root package name */
    private long f14290d;

    public b(long j10, long j11, long j12) {
        this.f14290d = j10;
        this.f14287a = j12;
        r rVar = new r();
        this.f14288b = rVar;
        r rVar2 = new r();
        this.f14289c = rVar2;
        rVar.a(0L);
        rVar2.a(j11);
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f14290d;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j10) {
        return this.f14288b.a(ai.a(this.f14289c, j10, true, true));
    }

    public void d(long j10) {
        this.f14290d = j10;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        int a10 = ai.a(this.f14288b, j10, true, true);
        w wVar = new w(this.f14288b.a(a10), this.f14289c.a(a10));
        if (wVar.f14943b != j10 && a10 != this.f14288b.a() - 1) {
            int i10 = a10 + 1;
            return new v.a(wVar, new w(this.f14288b.a(i10), this.f14289c.a(i10)));
        }
        return new v.a(wVar);
    }

    public boolean b(long j10) {
        r rVar = this.f14288b;
        return j10 - rVar.a(rVar.a() - 1) < 100000;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return this.f14287a;
    }

    public void a(long j10, long j11) {
        if (b(j10)) {
            return;
        }
        this.f14288b.a(j10);
        this.f14289c.a(j11);
    }
}
