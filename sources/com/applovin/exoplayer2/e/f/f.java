package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f14314a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f14315b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14316c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14317d;

    private f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f14314a = jArr;
        this.f14315b = jArr2;
        this.f14316c = j10;
        this.f14317d = j11;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f14316c;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j10) {
        return this.f14314a[ai.a(this.f14315b, j10, true, true)];
    }

    public static f a(long j10, long j11, r.a aVar, y yVar) {
        int h10;
        yVar.e(10);
        int q10 = yVar.q();
        if (q10 <= 0) {
            return null;
        }
        int i10 = aVar.f13517d;
        long d10 = ai.d(q10, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int i11 = yVar.i();
        int i12 = yVar.i();
        int i13 = yVar.i();
        yVar.e(2);
        long j12 = j11 + aVar.f13516c;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        long j13 = j11;
        for (int i14 = 0; i14 < i11; i14++) {
            jArr[i14] = (i14 * d10) / i11;
            jArr2[i14] = Math.max(j13, j12);
            if (i13 == 1) {
                h10 = yVar.h();
            } else if (i13 == 2) {
                h10 = yVar.i();
            } else if (i13 != 3) {
                if (i13 != 4) {
                    return null;
                }
                h10 = yVar.w();
            } else {
                h10 = yVar.m();
            }
            j13 += h10 * i12;
        }
        if (j10 != -1 && j10 != j13) {
            StringBuilder k10 = com.ironsource.adapters.facebook.a.k("VBRI data size mismatch: ", j10, ", ");
            k10.append(j13);
            q.c("VbriSeeker", k10.toString());
        }
        return new f(jArr, jArr2, d10, j13);
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return this.f14317d;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        int a10 = ai.a(this.f14314a, j10, true, true);
        w wVar = new w(this.f14314a[a10], this.f14315b[a10]);
        if (wVar.f14943b < j10 && a10 != this.f14314a.length - 1) {
            int i10 = a10 + 1;
            return new v.a(wVar, new w(this.f14314a[i10], this.f14315b[i10]));
        }
        return new v.a(wVar);
    }
}
