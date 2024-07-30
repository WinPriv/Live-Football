package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.v;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* loaded from: classes.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f14807a;

    /* renamed from: b, reason: collision with root package name */
    private final r.a f14808b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14809c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f14810d;

    /* renamed from: e, reason: collision with root package name */
    private String f14811e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f14812g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14813h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14814i;

    /* renamed from: j, reason: collision with root package name */
    private long f14815j;

    /* renamed from: k, reason: collision with root package name */
    private int f14816k;

    /* renamed from: l, reason: collision with root package name */
    private long f14817l;

    public q() {
        this(null);
    }

    private void c(com.applovin.exoplayer2.l.y yVar) {
        int min = Math.min(yVar.a(), 4 - this.f14812g);
        yVar.a(this.f14807a.d(), this.f14812g, min);
        int i10 = this.f14812g + min;
        this.f14812g = i10;
        if (i10 < 4) {
            return;
        }
        this.f14807a.d(0);
        if (!this.f14808b.a(this.f14807a.q())) {
            this.f14812g = 0;
            this.f = 1;
            return;
        }
        this.f14816k = this.f14808b.f13516c;
        if (!this.f14813h) {
            this.f14815j = (r8.f13519g * 1000000) / r8.f13517d;
            this.f14810d.a(new v.a().a(this.f14811e).f(this.f14808b.f13515b).f(4096).k(this.f14808b.f13518e).l(this.f14808b.f13517d).c(this.f14809c).a());
            this.f14813h = true;
        }
        this.f14807a.d(0);
        this.f14810d.a(this.f14807a, 4);
        this.f = 2;
    }

    private void d(com.applovin.exoplayer2.l.y yVar) {
        int min = Math.min(yVar.a(), this.f14816k - this.f14812g);
        this.f14810d.a(yVar, min);
        int i10 = this.f14812g + min;
        this.f14812g = i10;
        int i11 = this.f14816k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f14817l;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14810d.a(j10, 1, i11, 0, null);
            this.f14817l += this.f14815j;
        }
        this.f14812g = 0;
        this.f = 0;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f = 0;
        this.f14812g = 0;
        this.f14814i = false;
        this.f14817l = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public q(String str) {
        this.f = 0;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(4);
        this.f14807a = yVar;
        yVar.d()[0] = -1;
        this.f14808b = new r.a();
        this.f14817l = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14809c = str;
    }

    private void b(com.applovin.exoplayer2.l.y yVar) {
        byte[] d10 = yVar.d();
        int b10 = yVar.b();
        for (int c10 = yVar.c(); c10 < b10; c10++) {
            byte b11 = d10[c10];
            boolean z10 = (b11 & DefaultClassResolver.NAME) == 255;
            boolean z11 = this.f14814i && (b11 & 224) == 224;
            this.f14814i = z10;
            if (z11) {
                yVar.d(c10 + 1);
                this.f14814i = false;
                this.f14807a.d()[1] = d10[c10];
                this.f14812g = 2;
                this.f = 1;
                return;
            }
        }
        yVar.d(b10);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f14811e = dVar.c();
        this.f14810d = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            this.f14817l = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f14810d);
        while (yVar.a() > 0) {
            int i10 = this.f;
            if (i10 == 0) {
                b(yVar);
            } else if (i10 == 1) {
                c(yVar);
            } else if (i10 == 2) {
                d(yVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
