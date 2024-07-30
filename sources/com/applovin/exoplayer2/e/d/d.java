package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.e.x;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: b, reason: collision with root package name */
    private final long f14191b;

    /* renamed from: c, reason: collision with root package name */
    private final j f14192c;

    public d(long j10, j jVar) {
        this.f14191b = j10;
        this.f14192c = jVar;
    }

    @Override // com.applovin.exoplayer2.e.j
    public x a(int i10, int i11) {
        return this.f14192c.a(i10, i11);
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a() {
        this.f14192c.a();
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a(final v vVar) {
        this.f14192c.a(new v() { // from class: com.applovin.exoplayer2.e.d.d.1
            @Override // com.applovin.exoplayer2.e.v
            public boolean a() {
                return vVar.a();
            }

            @Override // com.applovin.exoplayer2.e.v
            public long b() {
                return vVar.b();
            }

            @Override // com.applovin.exoplayer2.e.v
            public v.a a(long j10) {
                v.a a10 = vVar.a(j10);
                w wVar = a10.f14938a;
                w wVar2 = new w(wVar.f14943b, d.this.f14191b + wVar.f14944c);
                w wVar3 = a10.f14939b;
                return new v.a(wVar2, new w(wVar3.f14943b, d.this.f14191b + wVar3.f14944c));
            }
        });
    }
}
