package com.anythink.expressad.exoplayer;

/* loaded from: classes.dex */
public abstract class a implements y, z {

    /* renamed from: n, reason: collision with root package name */
    private final int f7233n;
    private aa o;

    /* renamed from: p, reason: collision with root package name */
    private int f7234p;

    /* renamed from: q, reason: collision with root package name */
    private int f7235q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.h.y f7236r;

    /* renamed from: s, reason: collision with root package name */
    private m[] f7237s;

    /* renamed from: t, reason: collision with root package name */
    private long f7238t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7239u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7240v;

    public a(int i10) {
        this.f7233n = i10;
    }

    @Override // com.anythink.expressad.exoplayer.x.b
    public void a(int i10, Object obj) {
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final int a_() {
        return this.f7235q;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final z b() {
        return this;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void b_() {
        boolean z10 = true;
        if (this.f7235q != 1) {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        this.f7235q = 2;
        n();
    }

    @Override // com.anythink.expressad.exoplayer.y
    public com.anythink.expressad.exoplayer.k.n c() {
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final com.anythink.expressad.exoplayer.h.y f() {
        return this.f7236r;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final boolean g() {
        return this.f7239u;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void h() {
        this.f7240v = true;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final boolean i() {
        return this.f7240v;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void j() {
        this.f7236r.c();
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void k() {
        boolean z10;
        if (this.f7235q == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        this.f7235q = 1;
        o();
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void l() {
        boolean z10 = true;
        if (this.f7235q != 1) {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        this.f7235q = 0;
        this.f7236r = null;
        this.f7237s = null;
        this.f7240v = false;
        p();
    }

    @Override // com.anythink.expressad.exoplayer.z
    public int m() {
        return 0;
    }

    public final m[] q() {
        return this.f7237s;
    }

    public final aa r() {
        return this.o;
    }

    public final int s() {
        return this.f7234p;
    }

    public final boolean t() {
        if (this.f7239u) {
            return this.f7240v;
        }
        return this.f7236r.b();
    }

    public void a(long j10, boolean z10) {
    }

    public final int b(long j10) {
        return this.f7236r.a(j10 - this.f7238t);
    }

    public void a(boolean z10) {
    }

    public void a(m[] mVarArr, long j10) {
    }

    @Override // com.anythink.expressad.exoplayer.y, com.anythink.expressad.exoplayer.z
    public final int a() {
        return this.f7233n;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void a(int i10) {
        this.f7234p = i10;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void a(aa aaVar, m[] mVarArr, com.anythink.expressad.exoplayer.h.y yVar, long j10, boolean z10, long j11) {
        com.anythink.expressad.exoplayer.k.a.b(this.f7235q == 0);
        this.o = aaVar;
        this.f7235q = 1;
        a(z10);
        a(mVarArr, yVar, j11);
        a(j10, z10);
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void a(m[] mVarArr, com.anythink.expressad.exoplayer.h.y yVar, long j10) {
        com.anythink.expressad.exoplayer.k.a.b(!this.f7240v);
        this.f7236r = yVar;
        this.f7239u = false;
        this.f7237s = mVarArr;
        this.f7238t = j10;
        a(mVarArr, j10);
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void a(long j10) {
        this.f7240v = false;
        this.f7239u = false;
        a(j10, false);
    }

    public final int a(n nVar, com.anythink.expressad.exoplayer.c.e eVar, boolean z10) {
        int a10 = this.f7236r.a(nVar, eVar, z10);
        if (a10 == -4) {
            if (eVar.c()) {
                this.f7239u = true;
                return this.f7240v ? -4 : -3;
            }
            eVar.f += this.f7238t;
        } else if (a10 == -5) {
            m mVar = nVar.f9274a;
            long j10 = mVar.f9261l;
            if (j10 != Long.MAX_VALUE) {
                nVar.f9274a = mVar.a(j10 + this.f7238t);
            }
        }
        return a10;
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public static boolean a(com.anythink.expressad.exoplayer.d.g<?> gVar, com.anythink.expressad.exoplayer.d.e eVar) {
        if (eVar == null) {
            return true;
        }
        if (gVar == null) {
            return false;
        }
        return gVar.a(eVar);
    }
}
