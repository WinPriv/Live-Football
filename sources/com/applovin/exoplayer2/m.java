package com.applovin.exoplayer2;

/* loaded from: classes.dex */
final class m implements com.applovin.exoplayer2.l.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.ac f16376a;

    /* renamed from: b, reason: collision with root package name */
    private final a f16377b;

    /* renamed from: c, reason: collision with root package name */
    private ar f16378c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.l.s f16379d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16380e = true;
    private boolean f;

    /* loaded from: classes.dex */
    public interface a {
        void a(am amVar);
    }

    public m(a aVar, com.applovin.exoplayer2.l.d dVar) {
        this.f16377b = aVar;
        this.f16376a = new com.applovin.exoplayer2.l.ac(dVar);
    }

    private boolean c(boolean z10) {
        ar arVar = this.f16378c;
        if (arVar != null && !arVar.A() && (this.f16378c.z() || (!z10 && !this.f16378c.g()))) {
            return false;
        }
        return true;
    }

    public void a() {
        this.f = true;
        this.f16376a.a();
    }

    public void b() {
        this.f = false;
        this.f16376a.b();
    }

    @Override // com.applovin.exoplayer2.l.s
    public long c_() {
        if (this.f16380e) {
            return this.f16376a.c_();
        }
        return ((com.applovin.exoplayer2.l.s) com.applovin.exoplayer2.l.a.b(this.f16379d)).c_();
    }

    @Override // com.applovin.exoplayer2.l.s
    public am d() {
        com.applovin.exoplayer2.l.s sVar = this.f16379d;
        if (sVar != null) {
            return sVar.d();
        }
        return this.f16376a.d();
    }

    public void a(long j10) {
        this.f16376a.a(j10);
    }

    public void b(ar arVar) {
        if (arVar == this.f16378c) {
            this.f16379d = null;
            this.f16378c = null;
            this.f16380e = true;
        }
    }

    public void a(ar arVar) throws p {
        com.applovin.exoplayer2.l.s sVar;
        com.applovin.exoplayer2.l.s c10 = arVar.c();
        if (c10 == null || c10 == (sVar = this.f16379d)) {
            return;
        }
        if (sVar == null) {
            this.f16379d = c10;
            this.f16378c = arVar;
            c10.a(this.f16376a.d());
            return;
        }
        throw p.a(new IllegalStateException("Multiple renderer media clocks enabled."));
    }

    private void b(boolean z10) {
        if (c(z10)) {
            this.f16380e = true;
            if (this.f) {
                this.f16376a.a();
                return;
            }
            return;
        }
        com.applovin.exoplayer2.l.s sVar = (com.applovin.exoplayer2.l.s) com.applovin.exoplayer2.l.a.b(this.f16379d);
        long c_ = sVar.c_();
        if (this.f16380e) {
            if (c_ < this.f16376a.c_()) {
                this.f16376a.b();
                return;
            } else {
                this.f16380e = false;
                if (this.f) {
                    this.f16376a.a();
                }
            }
        }
        this.f16376a.a(c_);
        am d10 = sVar.d();
        if (d10.equals(this.f16376a.d())) {
            return;
        }
        this.f16376a.a(d10);
        this.f16377b.a(d10);
    }

    public long a(boolean z10) {
        b(z10);
        return c_();
    }

    @Override // com.applovin.exoplayer2.l.s
    public void a(am amVar) {
        com.applovin.exoplayer2.l.s sVar = this.f16379d;
        if (sVar != null) {
            sVar.a(amVar);
            amVar = this.f16379d.d();
        }
        this.f16376a.a(amVar);
    }
}
