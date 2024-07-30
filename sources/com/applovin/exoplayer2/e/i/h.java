package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: b, reason: collision with root package name */
    private final String f14658b;

    /* renamed from: c, reason: collision with root package name */
    private String f14659c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14660d;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f14662g;

    /* renamed from: h, reason: collision with root package name */
    private long f14663h;

    /* renamed from: i, reason: collision with root package name */
    private com.applovin.exoplayer2.v f14664i;

    /* renamed from: j, reason: collision with root package name */
    private int f14665j;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14657a = new com.applovin.exoplayer2.l.y(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    private int f14661e = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f14666k = com.anythink.expressad.exoplayer.b.f7291b;

    public h(String str) {
        this.f14658b = str;
    }

    private void c() {
        byte[] d10 = this.f14657a.d();
        if (this.f14664i == null) {
            com.applovin.exoplayer2.v a10 = com.applovin.exoplayer2.b.o.a(d10, this.f14659c, this.f14658b, null);
            this.f14664i = a10;
            this.f14660d.a(a10);
        }
        this.f14665j = com.applovin.exoplayer2.b.o.b(d10);
        this.f14663h = (int) ((com.applovin.exoplayer2.b.o.a(d10) * 1000000) / this.f14664i.f16850z);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f14661e = 0;
        this.f = 0;
        this.f14662g = 0;
        this.f14666k = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar) {
        while (yVar.a() > 0) {
            int i10 = this.f14662g << 8;
            this.f14662g = i10;
            int h10 = i10 | yVar.h();
            this.f14662g = h10;
            if (com.applovin.exoplayer2.b.o.a(h10)) {
                byte[] d10 = this.f14657a.d();
                int i11 = this.f14662g;
                d10[0] = (byte) ((i11 >> 24) & com.anythink.expressad.exoplayer.k.p.f9095b);
                d10[1] = (byte) ((i11 >> 16) & com.anythink.expressad.exoplayer.k.p.f9095b);
                d10[2] = (byte) ((i11 >> 8) & com.anythink.expressad.exoplayer.k.p.f9095b);
                d10[3] = (byte) (i11 & com.anythink.expressad.exoplayer.k.p.f9095b);
                this.f = 4;
                this.f14662g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f14659c = dVar.c();
        this.f14660d = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14666k = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f14660d);
        while (yVar.a() > 0) {
            int i10 = this.f14661e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(yVar.a(), this.f14665j - this.f);
                        this.f14660d.a(yVar, min);
                        int i11 = this.f + min;
                        this.f = i11;
                        int i12 = this.f14665j;
                        if (i11 == i12) {
                            long j10 = this.f14666k;
                            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                                this.f14660d.a(j10, 1, i12, 0, null);
                                this.f14666k += this.f14663h;
                            }
                            this.f14661e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(yVar, this.f14657a.d(), 18)) {
                    c();
                    this.f14657a.d(0);
                    this.f14660d.a(this.f14657a, 18);
                    this.f14661e = 2;
                }
            } else if (b(yVar)) {
                this.f14661e = 1;
            }
        }
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int min = Math.min(yVar.a(), i10 - this.f);
        yVar.a(bArr, this.f, min);
        int i11 = this.f + min;
        this.f = i11;
        return i11 == i10;
    }
}
