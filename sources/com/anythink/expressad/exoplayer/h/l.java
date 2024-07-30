package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.h.r;
import com.anythink.expressad.exoplayer.h.s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f8408a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f8409b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.b f8410c;

    /* renamed from: d, reason: collision with root package name */
    private r f8411d;

    /* renamed from: e, reason: collision with root package name */
    private r.a f8412e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private a f8413g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8414h;

    /* renamed from: i, reason: collision with root package name */
    private long f8415i = com.anythink.expressad.exoplayer.b.f7291b;

    /* loaded from: classes.dex */
    public interface a {
        void a(s.a aVar, IOException iOException);
    }

    public l(s sVar, s.a aVar, com.anythink.expressad.exoplayer.j.b bVar) {
        this.f8409b = aVar;
        this.f8410c = bVar;
        this.f8408a = sVar;
    }

    private void h() {
        this.f8412e.a((r.a) this);
    }

    public final void a(a aVar) {
        this.f8413g = aVar;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final void a_(long j10) {
        this.f8411d.a_(j10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final af b() {
        return this.f8411d.b();
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long c() {
        return this.f8411d.c();
    }

    public final void d(long j10) {
        if (this.f != 0 || j10 == 0) {
            return;
        }
        this.f8415i = j10;
        this.f = j10;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long e() {
        return this.f8411d.e();
    }

    public final void f() {
        r a10 = this.f8408a.a(this.f8409b, this.f8410c);
        this.f8411d = a10;
        if (this.f8412e != null) {
            a10.a(this, this.f);
        }
    }

    public final void g() {
        r rVar = this.f8411d;
        if (rVar != null) {
            this.f8408a.a(rVar);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(r.a aVar, long j10) {
        this.f8412e = aVar;
        this.f = j10;
        r rVar = this.f8411d;
        if (rVar != null) {
            rVar.a(this, j10);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long b(long j10) {
        return this.f8411d.b(j10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final boolean c(long j10) {
        r rVar = this.f8411d;
        return rVar != null && rVar.c(j10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long d() {
        return this.f8411d.d();
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a() {
        try {
            r rVar = this.f8411d;
            if (rVar != null) {
                rVar.a();
            } else {
                this.f8408a.b();
            }
        } catch (IOException e10) {
            a aVar = this.f8413g;
            if (aVar != null) {
                if (this.f8414h) {
                    return;
                }
                this.f8414h = true;
                aVar.a(this.f8409b, e10);
                return;
            }
            throw e10;
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long a(com.anythink.expressad.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f8415i;
        if (j12 == com.anythink.expressad.exoplayer.b.f7291b || j10 != 0) {
            j11 = j10;
        } else {
            this.f8415i = com.anythink.expressad.exoplayer.b.f7291b;
            j11 = j12;
        }
        return this.f8411d.a(fVarArr, zArr, yVarArr, zArr2, j11);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(long j10, boolean z10) {
        this.f8411d.a(j10, z10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long a(long j10, com.anythink.expressad.exoplayer.ac acVar) {
        return this.f8411d.a(j10, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.expressad.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f8412e.a((r) this);
    }

    @Override // com.anythink.expressad.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f8412e.a((r.a) this);
    }
}
