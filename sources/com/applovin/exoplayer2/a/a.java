package com.applovin.exoplayer2.a;

import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.a.b;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.k.d;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.p;
import com.huawei.hms.ads.br;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class a implements an.d, com.applovin.exoplayer2.b.g, com.applovin.exoplayer2.d.g, com.applovin.exoplayer2.h.q, d.a, com.applovin.exoplayer2.m.n {

    /* renamed from: a */
    private final com.applovin.exoplayer2.l.d f12898a;

    /* renamed from: b */
    private final ba.a f12899b;

    /* renamed from: c */
    private final ba.c f12900c;

    /* renamed from: d */
    private final C0149a f12901d;

    /* renamed from: e */
    private final SparseArray<b.a> f12902e;
    private com.applovin.exoplayer2.l.p<b> f;

    /* renamed from: g */
    private an f12903g;

    /* renamed from: h */
    private com.applovin.exoplayer2.l.o f12904h;

    /* renamed from: i */
    private boolean f12905i;

    /* renamed from: com.applovin.exoplayer2.a.a$a */
    /* loaded from: classes.dex */
    public static final class C0149a {

        /* renamed from: a */
        private final ba.a f12906a;

        /* renamed from: b */
        private com.applovin.exoplayer2.common.a.s<p.a> f12907b = com.applovin.exoplayer2.common.a.s.g();

        /* renamed from: c */
        private com.applovin.exoplayer2.common.a.u<p.a, ba> f12908c = com.applovin.exoplayer2.common.a.u.a();

        /* renamed from: d */
        private p.a f12909d;

        /* renamed from: e */
        private p.a f12910e;
        private p.a f;

        public C0149a(ba.a aVar) {
            this.f12906a = aVar;
        }

        public p.a b() {
            return this.f12910e;
        }

        public p.a c() {
            return this.f;
        }

        public p.a d() {
            if (this.f12907b.isEmpty()) {
                return null;
            }
            return (p.a) com.applovin.exoplayer2.common.a.x.c(this.f12907b);
        }

        public p.a a() {
            return this.f12909d;
        }

        public void b(an anVar) {
            this.f12909d = a(anVar, this.f12907b, this.f12910e, this.f12906a);
            a(anVar.S());
        }

        public ba a(p.a aVar) {
            return this.f12908c.get(aVar);
        }

        public void a(an anVar) {
            this.f12909d = a(anVar, this.f12907b, this.f12910e, this.f12906a);
        }

        public void a(List<p.a> list, p.a aVar, an anVar) {
            this.f12907b = com.applovin.exoplayer2.common.a.s.a((Collection) list);
            if (!list.isEmpty()) {
                this.f12910e = list.get(0);
                this.f = (p.a) com.applovin.exoplayer2.l.a.b(aVar);
            }
            if (this.f12909d == null) {
                this.f12909d = a(anVar, this.f12907b, this.f12910e, this.f12906a);
            }
            a(anVar.S());
        }

        private void a(ba baVar) {
            u.a<p.a, ba> b10 = com.applovin.exoplayer2.common.a.u.b();
            if (this.f12907b.isEmpty()) {
                a(b10, this.f12910e, baVar);
                if (!Objects.equal(this.f, this.f12910e)) {
                    a(b10, this.f, baVar);
                }
                if (!Objects.equal(this.f12909d, this.f12910e) && !Objects.equal(this.f12909d, this.f)) {
                    a(b10, this.f12909d, baVar);
                }
            } else {
                for (int i10 = 0; i10 < this.f12907b.size(); i10++) {
                    a(b10, this.f12907b.get(i10), baVar);
                }
                if (!this.f12907b.contains(this.f12909d)) {
                    a(b10, this.f12909d, baVar);
                }
            }
            this.f12908c = b10.a();
        }

        private void a(u.a<p.a, ba> aVar, p.a aVar2, ba baVar) {
            if (aVar2 == null) {
                return;
            }
            if (baVar.c(aVar2.f15389a) != -1) {
                aVar.a(aVar2, baVar);
                return;
            }
            ba baVar2 = this.f12908c.get(aVar2);
            if (baVar2 != null) {
                aVar.a(aVar2, baVar2);
            }
        }

        private static p.a a(an anVar, com.applovin.exoplayer2.common.a.s<p.a> sVar, p.a aVar, ba.a aVar2) {
            ba S = anVar.S();
            int F = anVar.F();
            Object a10 = S.d() ? null : S.a(F);
            int b10 = (anVar.K() || S.d()) ? -1 : S.a(F, aVar2).b(com.applovin.exoplayer2.h.b(anVar.I()) - aVar2.c());
            for (int i10 = 0; i10 < sVar.size(); i10++) {
                p.a aVar3 = sVar.get(i10);
                if (a(aVar3, a10, anVar.K(), anVar.L(), anVar.M(), b10)) {
                    return aVar3;
                }
            }
            if (sVar.isEmpty() && aVar != null) {
                if (a(aVar, a10, anVar.K(), anVar.L(), anVar.M(), b10)) {
                    return aVar;
                }
            }
            return null;
        }

        private static boolean a(p.a aVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (aVar.f15389a.equals(obj)) {
                return (z10 && aVar.f15390b == i10 && aVar.f15391c == i11) || (!z10 && aVar.f15390b == -1 && aVar.f15393e == i12);
            }
            return false;
        }
    }

    public a(com.applovin.exoplayer2.l.d dVar) {
        this.f12898a = (com.applovin.exoplayer2.l.d) com.applovin.exoplayer2.l.a.b(dVar);
        this.f = new com.applovin.exoplayer2.l.p<>(ai.c(), dVar, new l(0));
        ba.a aVar = new ba.a();
        this.f12899b = aVar;
        this.f12900c = new ba.c();
        this.f12901d = new C0149a(aVar);
        this.f12902e = new SparseArray<>();
    }

    public static /* synthetic */ void a(b bVar, com.applovin.exoplayer2.l.m mVar) {
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.b.g
    public final void a_(boolean z10) {
        b.a g6 = g();
        a(g6, 1017, new i(g6, z10, 0));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(String str, long j10, long j11) {
        b.a g6 = g();
        a(g6, br.L, new l4.k(g6, str, j11, j10, 2));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void b_(boolean z10) {
        b.a e10 = e();
        a(e10, 3, new i(e10, z10, 1));
    }

    private b.a f() {
        return a(this.f12901d.b());
    }

    private b.a g() {
        return a(this.f12901d.c());
    }

    private b.a h() {
        return a(this.f12901d.d());
    }

    public /* synthetic */ void i() {
        this.f.b();
    }

    public void a(an anVar, Looper looper) {
        int i10 = 0;
        com.applovin.exoplayer2.l.a.b(this.f12903g == null || this.f12901d.f12907b.isEmpty());
        this.f12903g = (an) com.applovin.exoplayer2.l.a.b(anVar);
        this.f12904h = this.f12898a.a(looper, null);
        this.f = this.f.a(looper, new y(i10, this, anVar));
    }

    public void c() {
        b.a e10 = e();
        this.f12902e.put(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, e10);
        a(e10, IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, new g0(e10, 0));
        ((com.applovin.exoplayer2.l.o) com.applovin.exoplayer2.l.a.a(this.f12904h)).a((Runnable) new androidx.activity.b(this, 4));
    }

    public final void d() {
        if (this.f12905i) {
            return;
        }
        b.a e10 = e();
        this.f12905i = true;
        a(e10, -1, new q0.d(e10, 1));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void e(boolean z10) {
        b.a e10 = e();
        a(e10, 9, new k(e10, z10, 0));
    }

    public static /* synthetic */ void b(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.a(aVar, str, j10);
        bVar.a(aVar, str, j11, j10);
        bVar.a(aVar, 1, str, j10);
    }

    private b.a f(int i10, p.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f12903g);
        if (aVar != null) {
            if (this.f12901d.a(aVar) != null) {
                return a(aVar);
            }
            return a(ba.f13573a, i10, aVar);
        }
        ba S = this.f12903g.S();
        if (!(i10 < S.b())) {
            S = ba.f13573a;
        }
        return a(S, i10, (p.a) null);
    }

    public final b.a e() {
        return a(this.f12901d.a());
    }

    public static /* synthetic */ void d(b.a aVar, com.applovin.exoplayer2.c.e eVar, b bVar) {
        bVar.a(aVar, eVar);
        bVar.a(aVar, 1, eVar);
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
        b.a g6 = g();
        a(g6, 1010, new d(g6, vVar, hVar, 1));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void c(com.applovin.exoplayer2.c.e eVar) {
        b.a g6 = g();
        a(g6, 1008, new b0(g6, 1, eVar));
    }

    public static /* synthetic */ void b(b.a aVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar, b bVar) {
        bVar.a(aVar, vVar);
        bVar.a(aVar, vVar, hVar);
        bVar.a(aVar, 1, vVar);
    }

    public static /* synthetic */ void c(b.a aVar, com.applovin.exoplayer2.c.e eVar, b bVar) {
        bVar.b(aVar, eVar);
        bVar.b(aVar, 1, eVar);
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void d(com.applovin.exoplayer2.c.e eVar) {
        b.a f = f();
        a(f, 1014, new b0(f, 2, eVar));
    }

    public /* synthetic */ void a(an anVar, b bVar, com.applovin.exoplayer2.l.m mVar) {
        bVar.a(anVar, new b.C0150b(mVar, this.f12902e));
    }

    public final void a(List<p.a> list, p.a aVar) {
        this.f12901d.a(list, aVar, (an) com.applovin.exoplayer2.l.a.b(this.f12903g));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void c(Exception exc) {
        b.a g6 = g();
        a(g6, IronSourceError.ERROR_IS_LOAD_DURING_SHOW, new e0(g6, exc, 0));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void a(long j10) {
        b.a g6 = g();
        a(g6, 1011, new q(g6, j10, 0));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(String str) {
        b.a g6 = g();
        a(g6, 1013, new n(2, g6, str));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public void d(boolean z10) {
        b.a e10 = e();
        a(e10, 7, new k(e10, z10, 1));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void a(final int i10, final long j10, final long j11) {
        final b.a g6 = g();
        a(g6, 1012, new p.a() { // from class: com.applovin.exoplayer2.a.j
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void c(int i10, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
        b.a f = f(i10, aVar);
        a(f, 1002, new m(f, jVar, mVar, 0));
    }

    @Override // com.applovin.exoplayer2.b.g
    public final void b(Exception exc) {
        b.a g6 = g();
        a(g6, 1018, new n(1, g6, exc));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void d(int i10) {
        b.a e10 = e();
        a(e10, 8, new c0(i10, 0, e10));
    }

    public static /* synthetic */ void c(b.a aVar, boolean z10, b bVar) {
        bVar.d(aVar, z10);
        bVar.c(aVar, z10);
    }

    @Override // com.applovin.exoplayer2.an.d
    public final void a(final float f) {
        final b.a g6 = g();
        a(g6, 1019, new p.a() { // from class: com.applovin.exoplayer2.a.h
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, f);
            }
        });
    }

    public static /* synthetic */ void b(b.a aVar, com.applovin.exoplayer2.c.e eVar, b bVar) {
        bVar.c(aVar, eVar);
        bVar.a(aVar, 2, eVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void c(int i10) {
        b.a e10 = e();
        a(e10, 6, new e(i10, 0, e10));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void d(int i10, p.a aVar) {
        b.a f = f(i10, aVar);
        a(f, IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, new g0(f, 2));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(com.applovin.exoplayer2.c.e eVar) {
        b.a g6 = g();
        a(g6, 1020, new y(2, g6, eVar));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void b(com.applovin.exoplayer2.c.e eVar) {
        b.a f = f();
        a(f, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new b0(f, 0, eVar));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final String str, final long j10, final long j11) {
        final b.a g6 = g();
        a(g6, 1021, new p.a() { // from class: com.applovin.exoplayer2.a.g
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                a.a(b.a.this, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void b(int i10, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
        b.a f = f(i10, aVar);
        a(f, 1001, new d(f, jVar, mVar, 2));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void c(int i10, p.a aVar) {
        b.a f = f(i10, aVar);
        a(f, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new x(f, 0));
    }

    public static /* synthetic */ void a(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.b(aVar, str, j10);
        bVar.b(aVar, str, j11, j10);
        bVar.a(aVar, 2, str, j10);
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
        b.a g6 = g();
        a(g6, 1022, new m(g6, vVar, hVar, 1));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void b(int i10) {
        b.a e10 = e();
        a(e10, 4, new f0(i10, 0, e10));
    }

    public static /* synthetic */ void a(b.a aVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar, b bVar) {
        bVar.b(aVar, vVar);
        bVar.b(aVar, vVar, hVar);
        bVar.a(aVar, 2, vVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void b(boolean z10, int i10) {
        b.a e10 = e();
        a(e10, 5, new t(e10, z10, i10, 0));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final int i10, final long j10) {
        final b.a f = f();
        a(f, 1023, new p.a() { // from class: com.applovin.exoplayer2.a.r
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, i10, j10);
            }
        });
    }

    @Override // com.applovin.exoplayer2.an.b
    public final void b() {
        b.a e10 = e();
        a(e10, -1, new g0(e10, 1));
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(String str) {
        b.a g6 = g();
        a(g6, 1024, new o(0, g6, str));
    }

    @Override // com.applovin.exoplayer2.k.d.a
    public final void b(final int i10, final long j10, final long j11) {
        final b.a h10 = h();
        a(h10, 1006, new p.a() { // from class: com.applovin.exoplayer2.a.a0
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void b(int i10, p.a aVar) {
        b.a f = f(i10, aVar);
        a(f, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new d0(f, 0));
    }

    public static /* synthetic */ void a(b.a aVar, com.applovin.exoplayer2.c.e eVar, b bVar) {
        bVar.d(aVar, eVar);
        bVar.b(aVar, 2, eVar);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.m.n
    public final void a(com.applovin.exoplayer2.m.o oVar) {
        b.a g6 = g();
        a(g6, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new o(1, g6, oVar));
    }

    public static /* synthetic */ void a(b.a aVar, com.applovin.exoplayer2.m.o oVar, b bVar) {
        bVar.a(aVar, oVar);
        bVar.a(aVar, oVar.f16539b, oVar.f16540c, oVar.f16541d, oVar.f16542e);
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final Object obj, final long j10) {
        final b.a g6 = g();
        a(g6, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new p.a() { // from class: com.applovin.exoplayer2.a.f
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj2) {
                ((b) obj2).a(b.a.this, obj, j10);
            }
        });
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(final long j10, final int i10) {
        final b.a f = f();
        a(f, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new p.a() { // from class: com.applovin.exoplayer2.a.h0
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, j10, i10);
            }
        });
    }

    @Override // com.applovin.exoplayer2.m.n
    public final void a(Exception exc) {
        b.a g6 = g();
        a(g6, IronSourceError.ERROR_RV_SHOW_EXCEPTION, new c(0, g6, exc));
    }

    @Override // com.applovin.exoplayer2.an.d
    public void a(final int i10, final int i11) {
        final b.a g6 = g();
        a(g6, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new p.a() { // from class: com.applovin.exoplayer2.a.u
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, i10, i11);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void a(int i10, p.a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
        b.a f = f(i10, aVar);
        a(f, 1000, new z(f, jVar, mVar));
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void a(int i10, p.a aVar, final com.applovin.exoplayer2.h.j jVar, final com.applovin.exoplayer2.h.m mVar, final IOException iOException, final boolean z10) {
        final b.a f = f(i10, aVar);
        a(f, 1003, new p.a() { // from class: com.applovin.exoplayer2.a.w
            @Override // com.applovin.exoplayer2.l.p.a
            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, jVar, mVar, iOException, z10);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.q
    public final void a(int i10, p.a aVar, com.applovin.exoplayer2.h.m mVar) {
        b.a f = f(i10, aVar);
        a(f, 1004, new c(4, f, mVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(ba baVar, int i10) {
        this.f12901d.b((an) com.applovin.exoplayer2.l.a.b(this.f12903g));
        b.a e10 = e();
        a(e10, 0, new v(i10, 0, e10));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(ab abVar, int i10) {
        b.a e10 = e();
        a(e10, 1, new s(i10, e10, abVar, 0));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(ad adVar, com.applovin.exoplayer2.j.h hVar) {
        b.a e10 = e();
        a(e10, 2, new d(e10, adVar, hVar, 0));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public void a(an.a aVar) {
        b.a e10 = e();
        a(e10, 13, new c(3, e10, aVar));
    }

    @Override // com.applovin.exoplayer2.an.b
    public final void a(boolean z10, int i10) {
        b.a e10 = e();
        a(e10, -1, new t(e10, z10, i10, 1));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(ak akVar) {
        com.applovin.exoplayer2.h.o oVar;
        b.a a10 = (!(akVar instanceof com.applovin.exoplayer2.p) || (oVar = ((com.applovin.exoplayer2.p) akVar).f) == null) ? null : a(new p.a(oVar));
        if (a10 == null) {
            a10 = e();
        }
        a(a10, 10, new n(0, a10, akVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(an.e eVar, an.e eVar2, int i10) {
        if (i10 == 1) {
            this.f12905i = false;
        }
        this.f12901d.a((an) com.applovin.exoplayer2.l.a.b(this.f12903g));
        b.a e10 = e();
        a(e10, 11, new p(e10, i10, eVar, eVar2, 0));
    }

    public static /* synthetic */ void a(b.a aVar, int i10, an.e eVar, an.e eVar2, b bVar) {
        bVar.d(aVar, i10);
        bVar.a(aVar, eVar, eVar2, i10);
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public final void a(am amVar) {
        b.a e10 = e();
        a(e10, 12, new c(2, e10, amVar));
    }

    @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
    public void a(ac acVar) {
        b.a e10 = e();
        a(e10, 14, new y(1, e10, acVar));
    }

    @Override // com.applovin.exoplayer2.an.d
    public final void a(com.applovin.exoplayer2.g.a aVar) {
        b.a e10 = e();
        a(e10, 1007, new c(1, e10, aVar));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void a(int i10, p.a aVar, int i11) {
        b.a f = f(i10, aVar);
        a(f, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new v(i11, 1, f));
    }

    public static /* synthetic */ void a(b.a aVar, int i10, b bVar) {
        bVar.c(aVar);
        bVar.f(aVar, i10);
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void a(int i10, p.a aVar) {
        b.a f = f(i10, aVar);
        a(f, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new d0(f, 1));
    }

    @Override // com.applovin.exoplayer2.d.g
    public final void a(int i10, p.a aVar, Exception exc) {
        b.a f = f(i10, aVar);
        a(f, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new e0(f, exc, 1));
    }

    public final void a(b.a aVar, int i10, p.a<b> aVar2) {
        this.f12902e.put(i10, aVar);
        this.f.b(i10, aVar2);
    }

    public final b.a a(ba baVar, int i10, p.a aVar) {
        long N;
        p.a aVar2 = baVar.d() ? null : aVar;
        long a10 = this.f12898a.a();
        boolean z10 = baVar.equals(this.f12903g.S()) && i10 == this.f12903g.G();
        long j10 = 0;
        if (aVar2 != null && aVar2.a()) {
            if (z10 && this.f12903g.L() == aVar2.f15390b && this.f12903g.M() == aVar2.f15391c) {
                j10 = this.f12903g.I();
            }
        } else {
            if (z10) {
                N = this.f12903g.N();
                return new b.a(a10, baVar, i10, aVar2, N, this.f12903g.S(), this.f12903g.G(), this.f12901d.a(), this.f12903g.I(), this.f12903g.J());
            }
            if (!baVar.d()) {
                j10 = baVar.a(i10, this.f12900c).a();
            }
        }
        N = j10;
        return new b.a(a10, baVar, i10, aVar2, N, this.f12903g.S(), this.f12903g.G(), this.f12901d.a(), this.f12903g.I(), this.f12903g.J());
    }

    private b.a a(p.a aVar) {
        com.applovin.exoplayer2.l.a.b(this.f12903g);
        ba a10 = aVar == null ? null : this.f12901d.a(aVar);
        if (aVar != null && a10 != null) {
            return a(a10, a10.a(aVar.f15389a, this.f12899b).f13578c, aVar);
        }
        int G = this.f12903g.G();
        ba S = this.f12903g.S();
        if (!(G < S.b())) {
            S = ba.f13573a;
        }
        return a(S, G, (p.a) null);
    }
}
