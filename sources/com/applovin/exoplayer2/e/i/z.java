package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.v> f14869a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.x[] f14870b;

    public z(List<com.applovin.exoplayer2.v> list) {
        this.f14869a = list;
        this.f14870b = new com.applovin.exoplayer2.e.x[list.size()];
    }

    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        for (int i10 = 0; i10 < this.f14870b.length; i10++) {
            dVar.a();
            com.applovin.exoplayer2.e.x a10 = jVar.a(dVar.b(), 3);
            com.applovin.exoplayer2.v vVar = this.f14869a.get(i10);
            String str = vVar.f16838l;
            com.applovin.exoplayer2.l.a.a(com.anythink.expressad.exoplayer.k.o.W.equals(str) || com.anythink.expressad.exoplayer.k.o.X.equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = vVar.f16828a;
            if (str2 == null) {
                str2 = dVar.c();
            }
            a10.a(new v.a().a(str2).f(str).b(vVar.f16831d).c(vVar.f16830c).p(vVar.D).a(vVar.f16840n).a());
            this.f14870b[i10] = a10;
        }
    }

    public void a(long j10, com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.e.b.a(j10, yVar, this.f14870b);
    }
}
