package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements n, n.a {

    /* renamed from: a, reason: collision with root package name */
    public final p.a f15362a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15363b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.b f15364c;

    /* renamed from: d, reason: collision with root package name */
    private p f15365d;

    /* renamed from: e, reason: collision with root package name */
    private n f15366e;
    private n.a f;

    /* renamed from: g, reason: collision with root package name */
    private a f15367g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15368h;

    /* renamed from: i, reason: collision with root package name */
    private long f15369i = com.anythink.expressad.exoplayer.b.f7291b;

    /* loaded from: classes.dex */
    public interface a {
        void a(p.a aVar);

        void a(p.a aVar, IOException iOException);
    }

    public k(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j10) {
        this.f15362a = aVar;
        this.f15364c = bVar;
        this.f15363b = j10;
    }

    @Override // com.applovin.exoplayer2.h.n
    public ad b() {
        return ((n) ai.a(this.f15366e)).b();
    }

    @Override // com.applovin.exoplayer2.h.n
    public long c() {
        return ((n) ai.a(this.f15366e)).c();
    }

    public void d(long j10) {
        this.f15369i = j10;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long e() {
        return ((n) ai.a(this.f15366e)).e();
    }

    @Override // com.applovin.exoplayer2.h.n
    public void e_() throws IOException {
        try {
            n nVar = this.f15366e;
            if (nVar != null) {
                nVar.e_();
            } else {
                p pVar = this.f15365d;
                if (pVar != null) {
                    pVar.e();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f15367g;
            if (aVar != null) {
                if (!this.f15368h) {
                    this.f15368h = true;
                    aVar.a(this.f15362a, e10);
                    return;
                }
                return;
            }
            throw e10;
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean f() {
        n nVar = this.f15366e;
        if (nVar != null && nVar.f()) {
            return true;
        }
        return false;
    }

    public long g() {
        return this.f15363b;
    }

    public long h() {
        return this.f15369i;
    }

    public void i() {
        if (this.f15366e != null) {
            ((p) com.applovin.exoplayer2.l.a.b(this.f15365d)).a(this.f15366e);
        }
    }

    private long e(long j10) {
        long j11 = this.f15369i;
        return j11 != com.anythink.expressad.exoplayer.b.f7291b ? j11 : j10;
    }

    public void a(p pVar) {
        com.applovin.exoplayer2.l.a.b(this.f15365d == null);
        this.f15365d = pVar;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long b(long j10) {
        return ((n) ai.a(this.f15366e)).b(j10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean c(long j10) {
        n nVar = this.f15366e;
        return nVar != null && nVar.c(j10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long d() {
        return ((n) ai.a(this.f15366e)).d();
    }

    @Override // com.applovin.exoplayer2.h.y.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(n nVar) {
        ((n.a) ai.a(this.f)).a((n.a) this);
    }

    public void a(p.a aVar) {
        long e10 = e(this.f15363b);
        n b10 = ((p) com.applovin.exoplayer2.l.a.b(this.f15365d)).b(aVar, this.f15364c, e10);
        this.f15366e = b10;
        if (this.f != null) {
            b10.a(this, e10);
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(n.a aVar, long j10) {
        this.f = aVar;
        n nVar = this.f15366e;
        if (nVar != null) {
            nVar.a(this, e(this.f15363b));
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(com.applovin.exoplayer2.j.d[] dVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f15369i;
        if (j12 == com.anythink.expressad.exoplayer.b.f7291b || j10 != this.f15363b) {
            j11 = j10;
        } else {
            this.f15369i = com.anythink.expressad.exoplayer.b.f7291b;
            j11 = j12;
        }
        return ((n) ai.a(this.f15366e)).a(dVarArr, zArr, xVarArr, zArr2, j11);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10, boolean z10) {
        ((n) ai.a(this.f15366e)).a(j10, z10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(long j10, av avVar) {
        return ((n) ai.a(this.f15366e)).a(j10, avVar);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10) {
        ((n) ai.a(this.f15366e)).a(j10);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.applovin.exoplayer2.h.n.a
    public void a(n nVar) {
        ((n.a) ai.a(this.f)).a((n) this);
        a aVar = this.f15367g;
        if (aVar != null) {
            aVar.a(this.f15362a);
        }
    }
}
