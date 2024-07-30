package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
public final class o implements v {

    /* renamed from: a, reason: collision with root package name */
    private final p f14913a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14914b;

    public o(p pVar, long j10) {
        this.f14913a = pVar;
        this.f14914b = j10;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f14913a.a();
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        com.applovin.exoplayer2.l.a.a(this.f14913a.f14924k);
        p pVar = this.f14913a;
        p.a aVar = pVar.f14924k;
        long[] jArr = aVar.f14926a;
        long[] jArr2 = aVar.f14927b;
        int a10 = ai.a(jArr, pVar.a(j10), true, false);
        w a11 = a(a10 == -1 ? 0L : jArr[a10], a10 != -1 ? jArr2[a10] : 0L);
        if (a11.f14943b != j10 && a10 != jArr.length - 1) {
            int i10 = a10 + 1;
            return new v.a(a11, a(jArr[i10], jArr2[i10]));
        }
        return new v.a(a11);
    }

    private w a(long j10, long j11) {
        return new w((j10 * 1000000) / this.f14913a.f14919e, this.f14914b + j11);
    }
}
