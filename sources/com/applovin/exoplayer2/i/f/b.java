package com.applovin.exoplayer2.i.f;

import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.i.a[] f15735a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f15736b;

    public b(com.applovin.exoplayer2.i.a[] aVarArr, long[] jArr) {
        this.f15735a = aVarArr;
        this.f15736b = jArr;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        int b10 = ai.b(this.f15736b, j10, false, false);
        if (b10 < this.f15736b.length) {
            return b10;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        com.applovin.exoplayer2.i.a aVar;
        int a10 = ai.a(this.f15736b, j10, true, false);
        if (a10 != -1 && (aVar = this.f15735a[a10]) != com.applovin.exoplayer2.i.a.f15505a) {
            return Collections.singletonList(aVar);
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.f15736b.length;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0);
        com.applovin.exoplayer2.l.a.a(i10 < this.f15736b.length);
        return this.f15736b[i10];
    }
}
