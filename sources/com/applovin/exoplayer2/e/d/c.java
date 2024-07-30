package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.q;

/* loaded from: classes.dex */
final class c extends q {

    /* renamed from: a, reason: collision with root package name */
    private final long f14190a;

    public c(i iVar, long j10) {
        super(iVar);
        boolean z10;
        if (iVar.c() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.f14190a = j10;
    }

    @Override // com.applovin.exoplayer2.e.q, com.applovin.exoplayer2.e.i
    public long b() {
        return super.b() - this.f14190a;
    }

    @Override // com.applovin.exoplayer2.e.q, com.applovin.exoplayer2.e.i
    public long c() {
        return super.c() - this.f14190a;
    }

    @Override // com.applovin.exoplayer2.e.q, com.applovin.exoplayer2.e.i
    public long d() {
        return super.d() - this.f14190a;
    }
}
