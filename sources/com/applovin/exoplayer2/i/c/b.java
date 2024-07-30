package com.applovin.exoplayer2.i.c;

import com.applovin.exoplayer2.i.f;
import java.util.List;

/* loaded from: classes.dex */
final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.i.a> f15691a;

    public b(List<com.applovin.exoplayer2.i.a> list) {
        this.f15691a = list;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        return this.f15691a;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return 1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        return 0L;
    }
}
