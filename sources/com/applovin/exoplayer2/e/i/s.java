package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;

/* loaded from: classes.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.exoplayer2.v f14823a;

    /* renamed from: b, reason: collision with root package name */
    private ag f14824b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14825c;

    public s(String str) {
        this.f14823a = new v.a().f(str).a();
    }

    @Override // com.applovin.exoplayer2.e.i.x
    public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        this.f14824b = agVar;
        dVar.a();
        com.applovin.exoplayer2.e.x a10 = jVar.a(dVar.b(), 5);
        this.f14825c = a10;
        a10.a(this.f14823a);
    }

    @Override // com.applovin.exoplayer2.e.i.x
    public void a(com.applovin.exoplayer2.l.y yVar) {
        a();
        long b10 = this.f14824b.b();
        long c10 = this.f14824b.c();
        if (b10 == com.anythink.expressad.exoplayer.b.f7291b || c10 == com.anythink.expressad.exoplayer.b.f7291b) {
            return;
        }
        com.applovin.exoplayer2.v vVar = this.f14823a;
        if (c10 != vVar.f16841p) {
            com.applovin.exoplayer2.v a10 = vVar.a().a(c10).a();
            this.f14823a = a10;
            this.f14825c.a(a10);
        }
        int a11 = yVar.a();
        this.f14825c.a(yVar, a11);
        this.f14825c.a(b10, 1, a11, 0, null);
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.f14824b);
        ai.a(this.f14825c);
    }
}
