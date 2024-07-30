package com.applovin.exoplayer2.i.h;

import com.applovin.exoplayer2.i.f;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f15809a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.i.a> f15810b;

    public b(com.applovin.exoplayer2.i.a aVar) {
        this.f15810b = Collections.singletonList(aVar);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        if (j10 >= 0) {
            return this.f15810b;
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return 1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 == 0);
        return 0L;
    }

    private b() {
        this.f15810b = Collections.emptyList();
    }
}
