package com.ironsource.lifecycle;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final g f24702a;

    /* renamed from: b, reason: collision with root package name */
    public long f24703b;

    public a(g gVar) {
        zc.d.d(gVar, "task");
        this.f24702a = gVar;
        d.a().a(this);
        this.f24703b = System.currentTimeMillis();
    }

    @Override // com.ironsource.lifecycle.c
    public final void a() {
        this.f24703b = System.currentTimeMillis();
    }

    @Override // com.ironsource.lifecycle.c
    public final void b() {
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.f24703b);
        g gVar = this.f24702a;
        gVar.f24734s = valueOf;
        gVar.run();
    }
}
