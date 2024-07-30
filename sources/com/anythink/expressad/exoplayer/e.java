package com.anythink.expressad.exoplayer;

/* loaded from: classes.dex */
final class e implements com.anythink.expressad.exoplayer.k.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.z f7727a;

    /* renamed from: b, reason: collision with root package name */
    private final a f7728b;

    /* renamed from: c, reason: collision with root package name */
    private y f7729c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.k.n f7730d;

    /* loaded from: classes.dex */
    public interface a {
        void a(v vVar);
    }

    public e(a aVar, com.anythink.expressad.exoplayer.k.c cVar) {
        this.f7728b = aVar;
        this.f7727a = new com.anythink.expressad.exoplayer.k.z(cVar);
    }

    private void f() {
        this.f7727a.a(this.f7730d.d());
        v e10 = this.f7730d.e();
        if (!e10.equals(this.f7727a.e())) {
            this.f7727a.a(e10);
            this.f7728b.a(e10);
        }
    }

    private boolean g() {
        y yVar = this.f7729c;
        if (yVar != null && !yVar.v()) {
            if (this.f7729c.u() || !this.f7729c.g()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a() {
        this.f7727a.a();
    }

    public final void b() {
        this.f7727a.b();
    }

    public final long c() {
        if (g()) {
            f();
            return this.f7730d.d();
        }
        return this.f7727a.d();
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final long d() {
        if (g()) {
            return this.f7730d.d();
        }
        return this.f7727a.d();
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final v e() {
        com.anythink.expressad.exoplayer.k.n nVar = this.f7730d;
        if (nVar != null) {
            return nVar.e();
        }
        return this.f7727a.e();
    }

    public final void a(long j10) {
        this.f7727a.a(j10);
    }

    public final void b(y yVar) {
        if (yVar == this.f7729c) {
            this.f7730d = null;
            this.f7729c = null;
        }
    }

    public final void a(y yVar) {
        com.anythink.expressad.exoplayer.k.n nVar;
        com.anythink.expressad.exoplayer.k.n c10 = yVar.c();
        if (c10 == null || c10 == (nVar = this.f7730d)) {
            return;
        }
        if (nVar == null) {
            this.f7730d = c10;
            this.f7729c = yVar;
            c10.a(this.f7727a.e());
            f();
            return;
        }
        throw g.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final v a(v vVar) {
        com.anythink.expressad.exoplayer.k.n nVar = this.f7730d;
        if (nVar != null) {
            vVar = nVar.a(vVar);
        }
        this.f7727a.a(vVar);
        this.f7728b.a(vVar);
        return vVar;
    }
}
