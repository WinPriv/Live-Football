package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;

/* loaded from: classes.dex */
public final class o implements j {

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14784b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14785c;

    /* renamed from: e, reason: collision with root package name */
    private int f14787e;
    private int f;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14783a = new com.applovin.exoplayer2.l.y(10);

    /* renamed from: d, reason: collision with root package name */
    private long f14786d = com.anythink.expressad.exoplayer.b.f7291b;

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f14785c = false;
        this.f14786d = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
        int i10;
        com.applovin.exoplayer2.l.a.a(this.f14784b);
        if (this.f14785c && (i10 = this.f14787e) != 0 && this.f == i10) {
            long j10 = this.f14786d;
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                this.f14784b.a(j10, 1, i10, 0, null);
            }
            this.f14785c = false;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        com.applovin.exoplayer2.e.x a10 = jVar.a(dVar.b(), 5);
        this.f14784b = a10;
        a10.a(new v.a().a(dVar.c()).f(com.anythink.expressad.exoplayer.k.o.V).a());
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f14785c = true;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14786d = j10;
        }
        this.f14787e = 0;
        this.f = 0;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f14784b);
        if (this.f14785c) {
            int a10 = yVar.a();
            int i10 = this.f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(yVar.d(), yVar.c(), this.f14783a.d(), this.f, min);
                if (this.f + min == 10) {
                    this.f14783a.d(0);
                    if (73 == this.f14783a.h() && 68 == this.f14783a.h() && 51 == this.f14783a.h()) {
                        this.f14783a.e(3);
                        this.f14787e = this.f14783a.v() + 10;
                    } else {
                        com.applovin.exoplayer2.l.q.c("Id3Reader", "Discarding invalid ID3 tag");
                        this.f14785c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f14787e - this.f);
            this.f14784b.a(yVar, min2);
            this.f += min2;
        }
    }
}
