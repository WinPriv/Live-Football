package com.applovin.exoplayer2.e.f;

import android.util.Pair;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.g.e.j;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f14291a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f14292b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14293c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f14291a = jArr;
        this.f14292b = jArr2;
        this.f14293c = j10 == com.anythink.expressad.exoplayer.b.f7291b ? com.applovin.exoplayer2.h.b(jArr2[jArr2.length - 1]) : j10;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f14293c;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return -1L;
    }

    public static c a(long j10, j jVar, long j11) {
        int length = jVar.f15168d.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += jVar.f15166b + jVar.f15168d[i12];
            j12 += jVar.f15167c + jVar.f15169e[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j10) {
        return com.applovin.exoplayer2.h.b(((Long) a(j10, this.f14291a, this.f14292b).second).longValue());
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        Pair<Long, Long> a10 = a(com.applovin.exoplayer2.h.a(ai.a(j10, 0L, this.f14293c)), this.f14292b, this.f14291a);
        return new v.a(new w(com.applovin.exoplayer2.h.b(((Long) a10.first).longValue()), ((Long) a10.second).longValue()));
    }

    private static Pair<Long, Long> a(long j10, long[] jArr, long[] jArr2) {
        int a10 = ai.a(jArr, j10, true, true);
        long j11 = jArr[a10];
        long j12 = jArr2[a10];
        int i10 = a10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }
}
