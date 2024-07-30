package com.applovin.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ap extends a {

    /* renamed from: c, reason: collision with root package name */
    private final int f13242c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13243d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f13244e;
    private final int[] f;

    /* renamed from: g, reason: collision with root package name */
    private final ba[] f13245g;

    /* renamed from: h, reason: collision with root package name */
    private final Object[] f13246h;

    /* renamed from: i, reason: collision with root package name */
    private final HashMap<Object, Integer> f13247i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(Collection<? extends ag> collection, com.applovin.exoplayer2.h.z zVar) {
        super(false, zVar);
        int i10 = 0;
        int size = collection.size();
        this.f13244e = new int[size];
        this.f = new int[size];
        this.f13245g = new ba[size];
        this.f13246h = new Object[size];
        this.f13247i = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (ag agVar : collection) {
            this.f13245g[i12] = agVar.b();
            this.f[i12] = i10;
            this.f13244e[i12] = i11;
            i10 += this.f13245g[i12].b();
            i11 += this.f13245g[i12].c();
            this.f13246h[i12] = agVar.a();
            this.f13247i.put(this.f13246h[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f13242c = i10;
        this.f13243d = i11;
    }

    public List<ba> a() {
        return Arrays.asList(this.f13245g);
    }

    @Override // com.applovin.exoplayer2.a
    public int b(int i10) {
        return com.applovin.exoplayer2.l.ai.a(this.f13244e, i10 + 1, false, false);
    }

    @Override // com.applovin.exoplayer2.a
    public int c(int i10) {
        return com.applovin.exoplayer2.l.ai.a(this.f, i10 + 1, false, false);
    }

    @Override // com.applovin.exoplayer2.a
    public int d(Object obj) {
        Integer num = this.f13247i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.applovin.exoplayer2.a
    public int e(int i10) {
        return this.f13244e[i10];
    }

    @Override // com.applovin.exoplayer2.a
    public int f(int i10) {
        return this.f[i10];
    }

    @Override // com.applovin.exoplayer2.a
    public Object g(int i10) {
        return this.f13246h[i10];
    }

    @Override // com.applovin.exoplayer2.ba
    public int b() {
        return this.f13242c;
    }

    @Override // com.applovin.exoplayer2.ba
    public int c() {
        return this.f13243d;
    }

    @Override // com.applovin.exoplayer2.a
    public ba d(int i10) {
        return this.f13245g[i10];
    }
}
