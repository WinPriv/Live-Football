package com.applovin.exoplayer2.i.e;

import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private final List<List<com.applovin.exoplayer2.i.a>> f15729a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Long> f15730b;

    public d(List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        this.f15729a = list;
        this.f15730b = list2;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        int b10 = ai.b((List<? extends Comparable<? super Long>>) this.f15730b, Long.valueOf(j10), false, false);
        if (b10 < this.f15730b.size()) {
            return b10;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        int a10 = ai.a((List<? extends Comparable<? super Long>>) this.f15730b, Long.valueOf(j10), true, false);
        if (a10 == -1) {
            return Collections.emptyList();
        }
        return this.f15729a.get(a10);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.f15730b.size();
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0);
        com.applovin.exoplayer2.l.a.a(i10 < this.f15730b.size());
        return this.f15730b.get(i10).longValue();
    }
}
