package com.applovin.exoplayer2.i.g;

import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class h implements com.applovin.exoplayer2.i.f {

    /* renamed from: a, reason: collision with root package name */
    private final d f15798a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f15799b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, g> f15800c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, e> f15801d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f15802e;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        Map<String, g> emptyMap;
        this.f15798a = dVar;
        this.f15801d = map2;
        this.f15802e = map3;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.f15800c = emptyMap;
        this.f15799b = dVar.b();
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        int b10 = ai.b(this.f15799b, j10, false, false);
        if (b10 < this.f15799b.length) {
            return b10;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        return this.f15798a.a(j10, this.f15800c, this.f15801d, this.f15802e);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.f15799b.length;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        return this.f15799b[i10];
    }
}
