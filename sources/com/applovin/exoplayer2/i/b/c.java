package com.applovin.exoplayer2.i.b;

import com.applovin.exoplayer2.i.f;
import java.util.List;

/* loaded from: classes.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.i.a> f15671a;

    public c(List<com.applovin.exoplayer2.i.a> list) {
        this.f15671a = list;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        return this.f15671a;
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
