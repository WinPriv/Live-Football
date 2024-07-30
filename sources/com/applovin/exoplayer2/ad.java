package com.applovin.exoplayer2;

import com.applovin.exoplayer2.h.p;

/* loaded from: classes.dex */
final class ad {

    /* renamed from: a, reason: collision with root package name */
    public final com.applovin.exoplayer2.h.n f13129a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13130b;

    /* renamed from: c, reason: collision with root package name */
    public final com.applovin.exoplayer2.h.x[] f13131c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13132d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13133e;
    public ae f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13134g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f13135h;

    /* renamed from: i, reason: collision with root package name */
    private final as[] f13136i;

    /* renamed from: j, reason: collision with root package name */
    private final com.applovin.exoplayer2.j.j f13137j;

    /* renamed from: k, reason: collision with root package name */
    private final ah f13138k;

    /* renamed from: l, reason: collision with root package name */
    private ad f13139l;

    /* renamed from: m, reason: collision with root package name */
    private com.applovin.exoplayer2.h.ad f13140m;

    /* renamed from: n, reason: collision with root package name */
    private com.applovin.exoplayer2.j.k f13141n;
    private long o;

    public ad(as[] asVarArr, long j10, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.k.b bVar, ah ahVar, ae aeVar, com.applovin.exoplayer2.j.k kVar) {
        this.f13136i = asVarArr;
        this.o = j10;
        this.f13137j = jVar;
        this.f13138k = ahVar;
        p.a aVar = aeVar.f13142a;
        this.f13130b = aVar.f15389a;
        this.f = aeVar;
        this.f13140m = com.applovin.exoplayer2.h.ad.f15284a;
        this.f13141n = kVar;
        this.f13131c = new com.applovin.exoplayer2.h.x[asVarArr.length];
        this.f13135h = new boolean[asVarArr.length];
        this.f13129a = a(aVar, ahVar, bVar, aeVar.f13143b, aeVar.f13145d);
    }

    private void k() {
        if (!m()) {
            return;
        }
        int i10 = 0;
        while (true) {
            com.applovin.exoplayer2.j.k kVar = this.f13141n;
            if (i10 < kVar.f16021a) {
                boolean a10 = kVar.a(i10);
                com.applovin.exoplayer2.j.d dVar = this.f13141n.f16023c[i10];
                if (a10 && dVar != null) {
                    dVar.a();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void l() {
        if (!m()) {
            return;
        }
        int i10 = 0;
        while (true) {
            com.applovin.exoplayer2.j.k kVar = this.f13141n;
            if (i10 < kVar.f16021a) {
                boolean a10 = kVar.a(i10);
                com.applovin.exoplayer2.j.d dVar = this.f13141n.f16023c[i10];
                if (a10 && dVar != null) {
                    dVar.b();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private boolean m() {
        if (this.f13139l == null) {
            return true;
        }
        return false;
    }

    public long a(long j10) {
        return j10 + a();
    }

    public long b(long j10) {
        return j10 - a();
    }

    public void c(long j10) {
        this.o = j10;
    }

    public long d() {
        if (!this.f13132d) {
            return this.f.f13143b;
        }
        long d10 = this.f13133e ? this.f13129a.d() : Long.MIN_VALUE;
        return d10 == Long.MIN_VALUE ? this.f.f13146e : d10;
    }

    public long e() {
        if (this.f13132d) {
            return this.f13129a.e();
        }
        return 0L;
    }

    public void f() {
        l();
        a(this.f13138k, this.f13129a);
    }

    public ad g() {
        return this.f13139l;
    }

    public com.applovin.exoplayer2.h.ad h() {
        return this.f13140m;
    }

    public com.applovin.exoplayer2.j.k i() {
        return this.f13141n;
    }

    public void j() {
        com.applovin.exoplayer2.h.n nVar = this.f13129a;
        if (nVar instanceof com.applovin.exoplayer2.h.d) {
            long j10 = this.f.f13145d;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                j10 = Long.MIN_VALUE;
            }
            ((com.applovin.exoplayer2.h.d) nVar).a(0L, j10);
        }
    }

    public long a() {
        return this.o;
    }

    public long b() {
        return this.f.f13143b + this.o;
    }

    public boolean c() {
        return this.f13132d && (!this.f13133e || this.f13129a.d() == Long.MIN_VALUE);
    }

    public void e(long j10) {
        com.applovin.exoplayer2.l.a.b(m());
        this.f13129a.c(b(j10));
    }

    public void a(float f, ba baVar) throws p {
        this.f13132d = true;
        this.f13140m = this.f13129a.b();
        com.applovin.exoplayer2.j.k b10 = b(f, baVar);
        ae aeVar = this.f;
        long j10 = aeVar.f13143b;
        long j11 = aeVar.f13146e;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(b10, j10, false);
        long j12 = this.o;
        ae aeVar2 = this.f;
        this.o = (aeVar2.f13143b - a10) + j12;
        this.f = aeVar2.a(a10);
    }

    public com.applovin.exoplayer2.j.k b(float f, ba baVar) throws p {
        com.applovin.exoplayer2.j.k a10 = this.f13137j.a(this.f13136i, h(), this.f.f13142a, baVar);
        for (com.applovin.exoplayer2.j.d dVar : a10.f16023c) {
            if (dVar != null) {
                dVar.a(f);
            }
        }
        return a10;
    }

    public void d(long j10) {
        com.applovin.exoplayer2.l.a.b(m());
        if (this.f13132d) {
            this.f13129a.a(b(j10));
        }
    }

    private void b(com.applovin.exoplayer2.h.x[] xVarArr) {
        int i10 = 0;
        while (true) {
            as[] asVarArr = this.f13136i;
            if (i10 >= asVarArr.length) {
                return;
            }
            if (asVarArr[i10].a() == -2 && this.f13141n.a(i10)) {
                xVarArr[i10] = new com.applovin.exoplayer2.h.g();
            }
            i10++;
        }
    }

    public long a(com.applovin.exoplayer2.j.k kVar, long j10, boolean z10) {
        return a(kVar, j10, z10, new boolean[this.f13136i.length]);
    }

    public long a(com.applovin.exoplayer2.j.k kVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= kVar.f16021a) {
                break;
            }
            boolean[] zArr2 = this.f13135h;
            if (z10 || !kVar.a(this.f13141n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        a(this.f13131c);
        l();
        this.f13141n = kVar;
        k();
        long a10 = this.f13129a.a(kVar.f16023c, this.f13135h, this.f13131c, zArr, j10);
        b(this.f13131c);
        this.f13133e = false;
        int i11 = 0;
        while (true) {
            com.applovin.exoplayer2.h.x[] xVarArr = this.f13131c;
            if (i11 >= xVarArr.length) {
                return a10;
            }
            if (xVarArr[i11] != null) {
                com.applovin.exoplayer2.l.a.b(kVar.a(i11));
                if (this.f13136i[i11].a() != -2) {
                    this.f13133e = true;
                }
            } else {
                com.applovin.exoplayer2.l.a.b(kVar.f16023c[i11] == null);
            }
            i11++;
        }
    }

    public void a(ad adVar) {
        if (adVar == this.f13139l) {
            return;
        }
        l();
        this.f13139l = adVar;
        k();
    }

    private void a(com.applovin.exoplayer2.h.x[] xVarArr) {
        int i10 = 0;
        while (true) {
            as[] asVarArr = this.f13136i;
            if (i10 >= asVarArr.length) {
                return;
            }
            if (asVarArr[i10].a() == -2) {
                xVarArr[i10] = null;
            }
            i10++;
        }
    }

    private static com.applovin.exoplayer2.h.n a(p.a aVar, ah ahVar, com.applovin.exoplayer2.k.b bVar, long j10, long j11) {
        com.applovin.exoplayer2.h.n a10 = ahVar.a(aVar, bVar, j10);
        return j11 != com.anythink.expressad.exoplayer.b.f7291b ? new com.applovin.exoplayer2.h.d(a10, true, 0L, j11) : a10;
    }

    private static void a(ah ahVar, com.applovin.exoplayer2.h.n nVar) {
        try {
            if (nVar instanceof com.applovin.exoplayer2.h.d) {
                ahVar.a(((com.applovin.exoplayer2.h.d) nVar).f15301a);
            } else {
                ahVar.a(nVar);
            }
        } catch (RuntimeException e10) {
            com.applovin.exoplayer2.l.q.c("MediaPeriodHolder", "Period release failed.", e10);
        }
    }
}
