package com.applovin.exoplayer2;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class e implements ar, as {

    /* renamed from: a, reason: collision with root package name */
    private final int f14067a;

    /* renamed from: c, reason: collision with root package name */
    private at f14069c;

    /* renamed from: d, reason: collision with root package name */
    private int f14070d;

    /* renamed from: e, reason: collision with root package name */
    private int f14071e;
    private com.applovin.exoplayer2.h.x f;

    /* renamed from: g, reason: collision with root package name */
    private v[] f14072g;

    /* renamed from: h, reason: collision with root package name */
    private long f14073h;

    /* renamed from: i, reason: collision with root package name */
    private long f14074i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14076k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14077l;

    /* renamed from: b, reason: collision with root package name */
    private final w f14068b = new w();

    /* renamed from: j, reason: collision with root package name */
    private long f14075j = Long.MIN_VALUE;

    public e(int i10) {
        this.f14067a = i10;
    }

    @Override // com.applovin.exoplayer2.ao.b
    public void a(int i10, Object obj) throws p {
    }

    @Override // com.applovin.exoplayer2.ar
    public final as b() {
        return this;
    }

    @Override // com.applovin.exoplayer2.ar
    public com.applovin.exoplayer2.l.s c() {
        return null;
    }

    @Override // com.applovin.exoplayer2.ar
    public final int d_() {
        return this.f14071e;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void e() throws p {
        boolean z10 = true;
        if (this.f14071e != 1) {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        this.f14071e = 2;
        p();
    }

    @Override // com.applovin.exoplayer2.ar
    public final com.applovin.exoplayer2.h.x f() {
        return this.f;
    }

    @Override // com.applovin.exoplayer2.ar
    public final boolean g() {
        if (this.f14075j == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.ar
    public final long h() {
        return this.f14075j;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void i() {
        this.f14076k = true;
    }

    @Override // com.applovin.exoplayer2.ar
    public final boolean j() {
        return this.f14076k;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void k() throws IOException {
        ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f)).c();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void l() {
        boolean z10;
        if (this.f14071e == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        this.f14071e = 1;
        q();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void m() {
        boolean z10 = true;
        if (this.f14071e != 1) {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        this.f14068b.a();
        this.f14071e = 0;
        this.f = null;
        this.f14072g = null;
        this.f14076k = false;
        r();
    }

    @Override // com.applovin.exoplayer2.ar
    public final void n() {
        boolean z10;
        if (this.f14071e == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        this.f14068b.a();
        s();
    }

    @Override // com.applovin.exoplayer2.as
    public int o() throws p {
        return 0;
    }

    public final w t() {
        this.f14068b.a();
        return this.f14068b;
    }

    public final v[] u() {
        return (v[]) com.applovin.exoplayer2.l.a.b(this.f14072g);
    }

    public final at v() {
        return (at) com.applovin.exoplayer2.l.a.b(this.f14069c);
    }

    public final int w() {
        return this.f14070d;
    }

    public final boolean x() {
        if (g()) {
            return this.f14076k;
        }
        return ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f)).b();
    }

    public void a(long j10, boolean z10) throws p {
    }

    public int b(long j10) {
        return ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f)).a(j10 - this.f14073h);
    }

    public void a(boolean z10, boolean z11) throws p {
    }

    public void a(v[] vVarArr, long j10, long j11) throws p {
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public final int a() {
        return this.f14067a;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(int i10) {
        this.f14070d = i10;
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(at atVar, v[] vVarArr, com.applovin.exoplayer2.h.x xVar, long j10, boolean z10, boolean z11, long j11, long j12) throws p {
        com.applovin.exoplayer2.l.a.b(this.f14071e == 0);
        this.f14069c = atVar;
        this.f14071e = 1;
        this.f14074i = j10;
        a(z10, z11);
        a(vVarArr, xVar, j11, j12);
        a(j10, z10);
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(v[] vVarArr, com.applovin.exoplayer2.h.x xVar, long j10, long j11) throws p {
        com.applovin.exoplayer2.l.a.b(!this.f14076k);
        this.f = xVar;
        if (this.f14075j == Long.MIN_VALUE) {
            this.f14075j = j10;
        }
        this.f14072g = vVarArr;
        this.f14073h = j11;
        a(vVarArr, j10, j11);
    }

    @Override // com.applovin.exoplayer2.ar
    public final void a(long j10) throws p {
        this.f14076k = false;
        this.f14074i = j10;
        this.f14075j = j10;
        a(j10, false);
    }

    public void p() throws p {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public final p a(Throwable th, v vVar, int i10) {
        return a(th, vVar, false, i10);
    }

    public final p a(Throwable th, v vVar, boolean z10, int i10) {
        int i11;
        if (vVar != null && !this.f14077l) {
            this.f14077l = true;
            try {
                i11 = as.c(a(vVar));
            } catch (p unused) {
            } finally {
                this.f14077l = false;
            }
            return p.a(th, y(), w(), vVar, i11, z10, i10);
        }
        i11 = 4;
        return p.a(th, y(), w(), vVar, i11, z10, i10);
    }

    public final int a(w wVar, com.applovin.exoplayer2.c.g gVar, int i10) {
        int a10 = ((com.applovin.exoplayer2.h.x) com.applovin.exoplayer2.l.a.b(this.f)).a(wVar, gVar, i10);
        if (a10 == -4) {
            if (gVar.c()) {
                this.f14075j = Long.MIN_VALUE;
                return this.f14076k ? -4 : -3;
            }
            long j10 = gVar.f13647d + this.f14073h;
            gVar.f13647d = j10;
            this.f14075j = Math.max(this.f14075j, j10);
        } else if (a10 == -5) {
            v vVar = (v) com.applovin.exoplayer2.l.a.b(wVar.f16876b);
            if (vVar.f16841p != Long.MAX_VALUE) {
                wVar.f16876b = vVar.a().a(vVar.f16841p + this.f14073h).a();
            }
        }
        return a10;
    }
}
