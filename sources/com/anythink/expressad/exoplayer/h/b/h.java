package com.anythink.expressad.exoplayer.h.b;

import com.anythink.expressad.exoplayer.j.k;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.m;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: k, reason: collision with root package name */
    private final int f8312k;

    /* renamed from: l, reason: collision with root package name */
    private final long f8313l;

    /* renamed from: m, reason: collision with root package name */
    private final d f8314m;

    /* renamed from: n, reason: collision with root package name */
    private volatile int f8315n;
    private volatile boolean o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f8316p;

    private h(com.anythink.expressad.exoplayer.j.h hVar, k kVar, m mVar, int i10, Object obj, long j10, long j11, long j12, long j13, int i11, long j14, d dVar) {
        super(hVar, kVar, mVar, i10, obj, j10, j11, j12, j13);
        this.f8312k = i11;
        this.f8313l = j14;
        this.f8314m = dVar;
    }

    @Override // com.anythink.expressad.exoplayer.j.t.c
    public final void a() {
        this.o = true;
    }

    @Override // com.anythink.expressad.exoplayer.j.t.c
    public final void b() {
        long j10;
        k a10 = this.f8266b.a(this.f8315n);
        try {
            com.anythink.expressad.exoplayer.j.h hVar = this.f8272i;
            com.anythink.expressad.exoplayer.e.b bVar = new com.anythink.expressad.exoplayer.e.b(hVar, a10.f8817e, hVar.a(a10));
            if (this.f8315n == 0) {
                b c10 = c();
                c10.a(this.f8313l);
                d dVar = this.f8314m;
                long j11 = this.f8260a;
                if (j11 == com.anythink.expressad.exoplayer.b.f7291b) {
                    j10 = 0;
                } else {
                    j10 = j11 - this.f8313l;
                }
                dVar.a(c10, j10);
            }
            try {
                com.anythink.expressad.exoplayer.e.e eVar = this.f8314m.f8273a;
                boolean z10 = false;
                int i10 = 0;
                while (i10 == 0 && !this.o) {
                    i10 = eVar.a(bVar, (com.anythink.expressad.exoplayer.e.j) null);
                }
                if (i10 != 1) {
                    z10 = true;
                }
                com.anythink.expressad.exoplayer.k.a.b(z10);
                af.a(this.f8272i);
                this.f8316p = true;
            } finally {
                this.f8315n = (int) (bVar.c() - this.f8266b.f8817e);
            }
        } catch (Throwable th) {
            af.a(this.f8272i);
            throw th;
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.b.c
    public final long d() {
        return this.f8315n;
    }

    @Override // com.anythink.expressad.exoplayer.h.b.i
    public final long e() {
        return this.f8317j + this.f8312k;
    }

    @Override // com.anythink.expressad.exoplayer.h.b.i
    public final boolean f() {
        return this.f8316p;
    }
}
