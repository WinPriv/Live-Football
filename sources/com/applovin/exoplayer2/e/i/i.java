package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    private final List<ad.a> f14667a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.x[] f14668b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14669c;

    /* renamed from: d, reason: collision with root package name */
    private int f14670d;

    /* renamed from: e, reason: collision with root package name */
    private int f14671e;
    private long f = com.anythink.expressad.exoplayer.b.f7291b;

    public i(List<ad.a> list) {
        this.f14667a = list;
        this.f14668b = new com.applovin.exoplayer2.e.x[list.size()];
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f14669c = false;
        this.f = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
        if (this.f14669c) {
            if (this.f != com.anythink.expressad.exoplayer.b.f7291b) {
                for (com.applovin.exoplayer2.e.x xVar : this.f14668b) {
                    xVar.a(this.f, 1, this.f14671e, 0, null);
                }
            }
            this.f14669c = false;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        for (int i10 = 0; i10 < this.f14668b.length; i10++) {
            ad.a aVar = this.f14667a.get(i10);
            dVar.a();
            com.applovin.exoplayer2.e.x a10 = jVar.a(dVar.b(), 3);
            a10.a(new v.a().a(dVar.c()).f(com.anythink.expressad.exoplayer.k.o.aj).a(Collections.singletonList(aVar.f14584c)).c(aVar.f14582a).a());
            this.f14668b[i10] = a10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f14669c = true;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f = j10;
        }
        this.f14671e = 0;
        this.f14670d = 2;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        if (this.f14669c) {
            if (this.f14670d != 2 || a(yVar, 32)) {
                if (this.f14670d != 1 || a(yVar, 0)) {
                    int c10 = yVar.c();
                    int a10 = yVar.a();
                    for (com.applovin.exoplayer2.e.x xVar : this.f14668b) {
                        yVar.d(c10);
                        xVar.a(yVar, a10);
                    }
                    this.f14671e += a10;
                }
            }
        }
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, int i10) {
        if (yVar.a() == 0) {
            return false;
        }
        if (yVar.h() != i10) {
            this.f14669c = false;
        }
        this.f14670d--;
        return this.f14669c;
    }
}
