package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    private final long f14318a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14319b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14320c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14321d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14322e;
    private final long[] f;

    private g(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public static g a(long j10, long j11, r.a aVar, y yVar) {
        int w10;
        int i10 = aVar.f13519g;
        int i11 = aVar.f13517d;
        int q10 = yVar.q();
        if ((q10 & 1) != 1 || (w10 = yVar.w()) == 0) {
            return null;
        }
        long d10 = ai.d(w10, i10 * 1000000, i11);
        if ((q10 & 6) != 6) {
            return new g(j11, aVar.f13516c, d10);
        }
        long o = yVar.o();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = yVar.h();
        }
        if (j10 != -1) {
            long j12 = j11 + o;
            if (j10 != j12) {
                StringBuilder k10 = com.ironsource.adapters.facebook.a.k("XING data size mismatch: ", j10, ", ");
                k10.append(j12);
                q.c("XingSeeker", k10.toString());
            }
        }
        return new g(j11, aVar.f13516c, d10, o, jArr);
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f14320c;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j10) {
        long j11 = j10 - this.f14318a;
        if (!a() || j11 <= this.f14319b) {
            return 0L;
        }
        long[] jArr = (long[]) com.applovin.exoplayer2.l.a.a(this.f);
        double d10 = (j11 * 256.0d) / this.f14321d;
        int a10 = ai.a(jArr, (long) d10, true, true);
        long a11 = a(a10);
        long j12 = jArr[a10];
        int i10 = a10 + 1;
        long a12 = a(i10);
        return Math.round((j12 == (a10 == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (a12 - a11)) + a11;
    }

    private g(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f14318a = j10;
        this.f14319b = i10;
        this.f14320c = j11;
        this.f = jArr;
        this.f14321d = j12;
        this.f14322e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return this.f14322e;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return this.f != null;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        if (!a()) {
            return new v.a(new w(0L, this.f14318a + this.f14319b));
        }
        long a10 = ai.a(j10, 0L, this.f14320c);
        double d10 = (a10 * 100.0d) / this.f14320c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) com.applovin.exoplayer2.l.a.a(this.f))[i10];
                d11 = d12 + (((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12) * (d10 - i10));
            }
        }
        return new v.a(new w(a10, this.f14318a + ai.a(Math.round((d11 / 256.0d) * this.f14321d), this.f14319b, this.f14321d - 1)));
    }

    private long a(int i10) {
        return (this.f14320c * i10) / 100;
    }
}
