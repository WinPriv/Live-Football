package com.anythink.expressad.exoplayer.k;

/* loaded from: classes.dex */
public final class z implements n {

    /* renamed from: a, reason: collision with root package name */
    private final c f9152a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9153b;

    /* renamed from: c, reason: collision with root package name */
    private long f9154c;

    /* renamed from: d, reason: collision with root package name */
    private long f9155d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.v f9156e = com.anythink.expressad.exoplayer.v.f9345a;

    public z(c cVar) {
        this.f9152a = cVar;
    }

    public final void a() {
        if (this.f9153b) {
            return;
        }
        this.f9155d = this.f9152a.a();
        this.f9153b = true;
    }

    public final void b() {
        if (this.f9153b) {
            a(d());
            this.f9153b = false;
        }
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final long d() {
        long a10;
        long j10 = this.f9154c;
        if (this.f9153b) {
            long a11 = this.f9152a.a() - this.f9155d;
            com.anythink.expressad.exoplayer.v vVar = this.f9156e;
            if (vVar.f9346b == 1.0f) {
                a10 = com.anythink.expressad.exoplayer.b.b(a11);
            } else {
                a10 = vVar.a(a11);
            }
            return j10 + a10;
        }
        return j10;
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final com.anythink.expressad.exoplayer.v e() {
        return this.f9156e;
    }

    public final void a(long j10) {
        this.f9154c = j10;
        if (this.f9153b) {
            this.f9155d = this.f9152a.a();
        }
    }

    @Override // com.anythink.expressad.exoplayer.k.n
    public final com.anythink.expressad.exoplayer.v a(com.anythink.expressad.exoplayer.v vVar) {
        if (this.f9153b) {
            a(d());
        }
        this.f9156e = vVar;
        return vVar;
    }
}
