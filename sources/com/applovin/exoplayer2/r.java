package com.applovin.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.ah;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ao;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.z;
import com.applovin.exoplayer2.l.p;
import com.applovin.exoplayer2.q;
import com.applovin.exoplayer2.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class r extends d {
    private av A;
    private com.applovin.exoplayer2.h.z B;
    private boolean C;
    private an.a D;
    private ac E;
    private ac F;
    private al G;
    private int H;
    private int I;
    private long J;

    /* renamed from: b */
    final com.applovin.exoplayer2.j.k f16590b;

    /* renamed from: c */
    final an.a f16591c;

    /* renamed from: d */
    private final ar[] f16592d;

    /* renamed from: e */
    private final com.applovin.exoplayer2.j.j f16593e;
    private final com.applovin.exoplayer2.l.o f;

    /* renamed from: g */
    private final s.e f16594g;

    /* renamed from: h */
    private final s f16595h;

    /* renamed from: i */
    private final com.applovin.exoplayer2.l.p<an.b> f16596i;

    /* renamed from: j */
    private final CopyOnWriteArraySet<q.a> f16597j;

    /* renamed from: k */
    private final ba.a f16598k;

    /* renamed from: l */
    private final List<a> f16599l;

    /* renamed from: m */
    private final boolean f16600m;

    /* renamed from: n */
    private final com.applovin.exoplayer2.h.r f16601n;
    private final com.applovin.exoplayer2.a.a o;

    /* renamed from: p */
    private final Looper f16602p;

    /* renamed from: q */
    private final com.applovin.exoplayer2.k.d f16603q;

    /* renamed from: r */
    private final long f16604r;

    /* renamed from: s */
    private final long f16605s;

    /* renamed from: t */
    private final com.applovin.exoplayer2.l.d f16606t;

    /* renamed from: u */
    private int f16607u;

    /* renamed from: v */
    private boolean f16608v;

    /* renamed from: w */
    private int f16609w;

    /* renamed from: x */
    private int f16610x;
    private boolean y;

    /* renamed from: z */
    private int f16611z;

    /* loaded from: classes.dex */
    public static final class a implements ag {

        /* renamed from: a */
        private final Object f16612a;

        /* renamed from: b */
        private ba f16613b;

        public a(Object obj, ba baVar) {
            this.f16612a = obj;
            this.f16613b = baVar;
        }

        @Override // com.applovin.exoplayer2.ag
        public ba b() {
            return this.f16613b;
        }

        @Override // com.applovin.exoplayer2.ag
        public Object a() {
            return this.f16612a;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public r(ar[] arVarArr, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.h.r rVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, com.applovin.exoplayer2.a.a aVar, boolean z10, av avVar, long j10, long j11, z zVar, long j12, boolean z11, com.applovin.exoplayer2.l.d dVar2, Looper looper, an anVar, an.a aVar2) {
        com.applovin.exoplayer2.l.q.b("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + com.applovin.exoplayer2.l.ai.f16278e + "]");
        com.applovin.exoplayer2.l.a.b(arVarArr.length > 0);
        this.f16592d = (ar[]) com.applovin.exoplayer2.l.a.b(arVarArr);
        this.f16593e = (com.applovin.exoplayer2.j.j) com.applovin.exoplayer2.l.a.b(jVar);
        this.f16601n = rVar;
        this.f16603q = dVar;
        this.o = aVar;
        this.f16600m = z10;
        this.A = avVar;
        this.f16604r = j10;
        this.f16605s = j11;
        this.C = z11;
        this.f16602p = looper;
        this.f16606t = dVar2;
        this.f16607u = 0;
        an anVar2 = anVar != null ? anVar : this;
        this.f16596i = new com.applovin.exoplayer2.l.p<>(looper, dVar2, new p0(anVar2, 2));
        this.f16597j = new CopyOnWriteArraySet<>();
        this.f16599l = new ArrayList();
        this.B = new z.a(0);
        com.applovin.exoplayer2.j.k kVar = new com.applovin.exoplayer2.j.k(new at[arVarArr.length], new com.applovin.exoplayer2.j.d[arVarArr.length], null);
        this.f16590b = kVar;
        this.f16598k = new ba.a();
        an.a a10 = new an.a.C0151a().a(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).a(28, jVar.a()).a(aVar2).a();
        this.f16591c = a10;
        this.D = new an.a.C0151a().a(a10).a(3).a(9).a();
        ac acVar = ac.f13083a;
        this.E = acVar;
        this.F = acVar;
        this.H = -1;
        this.f = dVar2.a(looper, null);
        m0 m0Var = new m0(this);
        this.f16594g = m0Var;
        this.G = al.a(kVar);
        if (aVar != null) {
            aVar.a(anVar2, looper);
            a((an.d) aVar);
            dVar.a(new Handler(looper), aVar);
        }
        this.f16595h = new s(arVarArr, jVar, kVar, aaVar, dVar, this.f16607u, this.f16608v, aVar, avVar, zVar, j12, z11, looper, dVar2, m0Var);
    }

    private int W() {
        if (this.G.f13192a.d()) {
            return this.H;
        }
        al alVar = this.G;
        return alVar.f13192a.a(alVar.f13193b.f15389a, this.f16598k).f13578c;
    }

    private void X() {
        an.a aVar = this.D;
        an.a a10 = a(this.f16591c);
        this.D = a10;
        if (!a10.equals(aVar)) {
            this.f16596i.a(13, new m0(this));
        }
    }

    private ba Y() {
        return new ap(this.f16599l, this.B);
    }

    public /* synthetic */ void d(an.b bVar) {
        bVar.a(this.E);
    }

    public static /* synthetic */ void f(al alVar, an.b bVar) {
        bVar.c(alVar.f13197g);
        bVar.b_(alVar.f13197g);
    }

    public static /* synthetic */ void g(al alVar, an.b bVar) {
        bVar.a(alVar.f);
    }

    public static /* synthetic */ void h(al alVar, an.b bVar) {
        bVar.b(alVar.f);
    }

    @Override // com.applovin.exoplayer2.an
    public int M() {
        if (K()) {
            return this.G.f13193b.f15391c;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.an
    public long N() {
        if (K()) {
            al alVar = this.G;
            alVar.f13192a.a(alVar.f13193b.f15389a, this.f16598k);
            al alVar2 = this.G;
            if (alVar2.f13194c == com.anythink.expressad.exoplayer.b.f7291b) {
                return alVar2.f13192a.a(G(), this.f13938a).a();
            }
            return this.f16598k.b() + h.a(this.G.f13194c);
        }
        return I();
    }

    @Override // com.applovin.exoplayer2.an
    public long O() {
        if (this.G.f13192a.d()) {
            return this.J;
        }
        al alVar = this.G;
        if (alVar.f13201k.f15392d != alVar.f13193b.f15392d) {
            return alVar.f13192a.a(G(), this.f13938a).c();
        }
        long j10 = alVar.f13206q;
        if (this.G.f13201k.a()) {
            al alVar2 = this.G;
            ba.a a10 = alVar2.f13192a.a(alVar2.f13201k.f15389a, this.f16598k);
            long a11 = a10.a(this.G.f13201k.f15390b);
            if (a11 == Long.MIN_VALUE) {
                j10 = a10.f13579d;
            } else {
                j10 = a11;
            }
        }
        al alVar3 = this.G;
        return h.a(a(alVar3.f13192a, alVar3.f13201k, j10));
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.h.ad P() {
        return this.G.f13198h;
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.j.h Q() {
        return new com.applovin.exoplayer2.j.h(this.G.f13199i.f16023c);
    }

    @Override // com.applovin.exoplayer2.an
    public ac R() {
        return this.E;
    }

    @Override // com.applovin.exoplayer2.an
    public ba S() {
        return this.G.f13192a;
    }

    @Override // com.applovin.exoplayer2.an
    public com.applovin.exoplayer2.m.o T() {
        return com.applovin.exoplayer2.m.o.f16538a;
    }

    @Override // com.applovin.exoplayer2.an
    /* renamed from: U */
    public com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.i.a> V() {
        return com.applovin.exoplayer2.common.a.s.g();
    }

    @Override // com.applovin.exoplayer2.an
    public void a(SurfaceView surfaceView) {
    }

    @Override // com.applovin.exoplayer2.an
    public void b(SurfaceView surfaceView) {
    }

    public boolean q() {
        return this.G.f13205p;
    }

    public static /* synthetic */ void d(al alVar, an.b bVar) {
        bVar.b(alVar.f13196e);
    }

    @Override // com.applovin.exoplayer2.an
    public long A() {
        return this.f16604r;
    }

    @Override // com.applovin.exoplayer2.an
    public long B() {
        return this.f16605s;
    }

    @Override // com.applovin.exoplayer2.an
    public long C() {
        return com.anythink.expressad.video.module.a.a.m.ag;
    }

    @Override // com.applovin.exoplayer2.an
    public am D() {
        return this.G.f13204n;
    }

    public void E() {
        com.applovin.exoplayer2.l.q.b("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.1] [" + com.applovin.exoplayer2.l.ai.f16278e + "] [" + t.a() + "]");
        if (!this.f16595h.c()) {
            this.f16596i.b(10, new k0(0));
        }
        this.f16596i.b();
        this.f.a((Object) null);
        com.applovin.exoplayer2.a.a aVar = this.o;
        if (aVar != null) {
            this.f16603q.a(aVar);
        }
        al a10 = this.G.a(1);
        this.G = a10;
        al a11 = a10.a(a10.f13193b);
        this.G = a11;
        a11.f13206q = a11.f13208s;
        this.G.f13207r = 0L;
    }

    @Override // com.applovin.exoplayer2.an
    public int F() {
        if (this.G.f13192a.d()) {
            return this.I;
        }
        al alVar = this.G;
        return alVar.f13192a.c(alVar.f13193b.f15389a);
    }

    @Override // com.applovin.exoplayer2.an
    public int G() {
        int W = W();
        if (W == -1) {
            return 0;
        }
        return W;
    }

    @Override // com.applovin.exoplayer2.an
    public long H() {
        if (K()) {
            al alVar = this.G;
            p.a aVar = alVar.f13193b;
            alVar.f13192a.a(aVar.f15389a, this.f16598k);
            return h.a(this.f16598k.b(aVar.f15390b, aVar.f15391c));
        }
        return p();
    }

    @Override // com.applovin.exoplayer2.an
    public long I() {
        return h.a(a(this.G));
    }

    @Override // com.applovin.exoplayer2.an
    public long J() {
        return h.a(this.G.f13207r);
    }

    @Override // com.applovin.exoplayer2.an
    public boolean K() {
        return this.G.f13193b.a();
    }

    @Override // com.applovin.exoplayer2.an
    public int L() {
        if (K()) {
            return this.G.f13193b.f15390b;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.an
    public void a(TextureView textureView) {
    }

    @Override // com.applovin.exoplayer2.an
    public void b(TextureView textureView) {
    }

    @Override // com.applovin.exoplayer2.an
    public void c(final int i10) {
        if (this.f16607u != i10) {
            this.f16607u = i10;
            this.f16595h.a(i10);
            this.f16596i.a(8, new p.a() { // from class: com.applovin.exoplayer2.j0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).d(i10);
                }
            });
            X();
            this.f16596i.a();
        }
    }

    @Override // com.applovin.exoplayer2.an
    public Looper r() {
        return this.f16602p;
    }

    @Override // com.applovin.exoplayer2.an
    public an.a s() {
        return this.D;
    }

    @Override // com.applovin.exoplayer2.an
    public int t() {
        return this.G.f13196e;
    }

    @Override // com.applovin.exoplayer2.an
    public int u() {
        return this.G.f13203m;
    }

    @Override // com.applovin.exoplayer2.an, com.applovin.exoplayer2.q
    /* renamed from: v */
    public p e() {
        return this.G.f;
    }

    @Override // com.applovin.exoplayer2.an
    public void w() {
        al alVar = this.G;
        if (alVar.f13196e != 1) {
            return;
        }
        al a10 = alVar.a((p) null);
        al a11 = a10.a(a10.f13192a.d() ? 4 : 2);
        this.f16609w++;
        this.f16595h.a();
        a(a11, 1, 1, false, false, 5, com.anythink.expressad.exoplayer.b.f7291b, -1);
    }

    @Override // com.applovin.exoplayer2.an
    public boolean x() {
        return this.G.f13202l;
    }

    @Override // com.applovin.exoplayer2.an
    public int y() {
        return this.f16607u;
    }

    @Override // com.applovin.exoplayer2.an
    public boolean z() {
        return this.f16608v;
    }

    public static /* synthetic */ void a(an anVar, an.b bVar, com.applovin.exoplayer2.l.m mVar) {
        bVar.a(anVar, new an.c(mVar));
    }

    public /* synthetic */ void b(final s.d dVar) {
        this.f.a(new Runnable() { // from class: com.applovin.exoplayer2.l0
            @Override // java.lang.Runnable
            public final void run() {
                r.this.c(dVar);
            }
        });
    }

    public static /* synthetic */ void e(an.b bVar) {
        bVar.a(p.a(new u(1), 1003));
    }

    @Override // com.applovin.exoplayer2.an
    public void a(an.d dVar) {
        a((an.b) dVar);
    }

    public void b(long j10) {
        this.f16595h.a(j10);
    }

    public void a(an.b bVar) {
        this.f16596i.a((com.applovin.exoplayer2.l.p<an.b>) bVar);
    }

    @Override // com.applovin.exoplayer2.an
    public void b(an.d dVar) {
        b((an.b) dVar);
    }

    public static /* synthetic */ void e(al alVar, an.b bVar) {
        bVar.a(alVar.f13202l, alVar.f13196e);
    }

    public void a(q.a aVar) {
        this.f16597j.add(aVar);
    }

    public void b(an.b bVar) {
        this.f16596i.b(bVar);
    }

    public void a(com.applovin.exoplayer2.h.p pVar) {
        a(Collections.singletonList(pVar));
    }

    @Override // com.applovin.exoplayer2.an
    public void b(final boolean z10) {
        if (this.f16608v != z10) {
            this.f16608v = z10;
            this.f16595h.a(z10);
            this.f16596i.a(9, new p.a() { // from class: com.applovin.exoplayer2.g0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).e(z10);
                }
            });
            X();
            this.f16596i.a();
        }
    }

    public static /* synthetic */ void c(al alVar, an.b bVar) {
        bVar.c(alVar.f13203m);
    }

    public void a(List<com.applovin.exoplayer2.h.p> list) {
        a(list, true);
    }

    private an.e c(long j10) {
        ab abVar;
        Object obj;
        int i10;
        Object obj2;
        int G = G();
        if (this.G.f13192a.d()) {
            abVar = null;
            obj = null;
            i10 = -1;
            obj2 = null;
        } else {
            al alVar = this.G;
            Object obj3 = alVar.f13193b.f15389a;
            alVar.f13192a.a(obj3, this.f16598k);
            i10 = this.G.f13192a.c(obj3);
            obj = obj3;
            obj2 = this.G.f13192a.a(G, this.f13938a).f13589b;
            abVar = this.f13938a.f13591d;
        }
        long a10 = h.a(j10);
        long a11 = this.G.f13193b.a() ? h.a(b(this.G)) : a10;
        p.a aVar = this.G.f13193b;
        return new an.e(obj2, G, abVar, obj, i10, a10, a11, aVar.f15390b, aVar.f15391c);
    }

    public void a(List<com.applovin.exoplayer2.h.p> list, boolean z10) {
        a(list, -1, com.anythink.expressad.exoplayer.b.f7291b, z10);
    }

    @Override // com.applovin.exoplayer2.an
    public void a(boolean z10) {
        a(z10, 0, 1);
    }

    public void a(boolean z10, int i10, int i11) {
        al alVar = this.G;
        if (alVar.f13202l == z10 && alVar.f13203m == i10) {
            return;
        }
        this.f16609w++;
        al a10 = alVar.a(z10, i10);
        this.f16595h.a(z10, i10);
        a(a10, 0, i11, false, false, 5, com.anythink.expressad.exoplayer.b.f7291b, -1);
    }

    public static /* synthetic */ void b(al alVar, int i10, an.b bVar) {
        bVar.a(alVar.f13192a, i10);
    }

    public static /* synthetic */ void b(al alVar, an.b bVar) {
        bVar.d(c(alVar));
    }

    private static long b(al alVar) {
        ba.c cVar = new ba.c();
        ba.a aVar = new ba.a();
        alVar.f13192a.a(alVar.f13193b.f15389a, aVar);
        if (alVar.f13194c == com.anythink.expressad.exoplayer.b.f7291b) {
            return alVar.f13192a.a(aVar.f13578c, cVar).b();
        }
        return aVar.c() + alVar.f13194c;
    }

    @Override // com.applovin.exoplayer2.an
    public void a(int i10, long j10) {
        ba baVar = this.G.f13192a;
        if (i10 >= 0 && (baVar.d() || i10 < baVar.b())) {
            this.f16609w++;
            if (K()) {
                com.applovin.exoplayer2.l.q.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                s.d dVar = new s.d(this.G);
                dVar.a(1);
                this.f16594g.onPlaybackInfoUpdate(dVar);
                return;
            }
            int i11 = t() != 1 ? 2 : 1;
            int G = G();
            al a10 = a(this.G.a(i11), baVar, a(baVar, i10, j10));
            this.f16595h.a(baVar, i10, h.b(j10));
            a(a10, 0, 1, true, true, 1, a(a10), G);
            return;
        }
        throw new y(baVar, i10, j10);
    }

    private void b(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f16599l.remove(i12);
        }
        this.B = this.B.b(i10, i11);
    }

    public /* synthetic */ void c(an.b bVar) {
        bVar.a(this.D);
    }

    private static boolean c(al alVar) {
        return alVar.f13196e == 3 && alVar.f13202l && alVar.f13203m == 0;
    }

    public void a(boolean z10, p pVar) {
        al a10;
        if (z10) {
            a10 = a(0, this.f16599l.size()).a((p) null);
        } else {
            al alVar = this.G;
            a10 = alVar.a(alVar.f13193b);
            a10.f13206q = a10.f13208s;
            a10.f13207r = 0L;
        }
        al a11 = a10.a(1);
        if (pVar != null) {
            a11 = a11.a(pVar);
        }
        al alVar2 = a11;
        this.f16609w++;
        this.f16595h.b();
        a(alVar2, 0, 1, false, alVar2.f13192a.d() && !this.G.f13192a.d(), 4, a(alVar2), -1);
    }

    public ao a(ao.b bVar) {
        return new ao(this.f16595h, bVar, this.G.f13192a, G(), this.f16606t, this.f16595h.d());
    }

    public void a(com.applovin.exoplayer2.g.a aVar) {
        ac a10 = this.E.a().a(aVar).a();
        if (a10.equals(this.E)) {
            return;
        }
        this.E = a10;
        this.f16596i.b(14, new r0(this, 3));
    }

    private long a(al alVar) {
        if (alVar.f13192a.d()) {
            return h.b(this.J);
        }
        if (alVar.f13193b.a()) {
            return alVar.f13208s;
        }
        return a(alVar.f13192a, alVar.f13193b, alVar.f13208s);
    }

    /* renamed from: a */
    public void c(s.d dVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.f16609w - dVar.f16653b;
        this.f16609w = i10;
        boolean z11 = true;
        if (dVar.f16654c) {
            this.f16610x = dVar.f16655d;
            this.y = true;
        }
        if (dVar.f16656e) {
            this.f16611z = dVar.f;
        }
        if (i10 == 0) {
            ba baVar = dVar.f16652a.f13192a;
            if (!this.G.f13192a.d() && baVar.d()) {
                this.H = -1;
                this.J = 0L;
                this.I = 0;
            }
            if (!baVar.d()) {
                List<ba> a10 = ((ap) baVar).a();
                com.applovin.exoplayer2.l.a.b(a10.size() == this.f16599l.size());
                for (int i11 = 0; i11 < a10.size(); i11++) {
                    this.f16599l.get(i11).f16613b = a10.get(i11);
                }
            }
            if (this.y) {
                if (dVar.f16652a.f13193b.equals(this.G.f13193b) && dVar.f16652a.f13195d == this.G.f13208s) {
                    z11 = false;
                }
                if (z11) {
                    if (!baVar.d() && !dVar.f16652a.f13193b.a()) {
                        al alVar = dVar.f16652a;
                        j11 = a(baVar, alVar.f13193b, alVar.f13195d);
                    } else {
                        j11 = dVar.f16652a.f13195d;
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.y = false;
            a(dVar.f16652a, 1, this.f16611z, false, z10, this.f16610x, j10, -1);
        }
    }

    private void a(final al alVar, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13) {
        al alVar2 = this.G;
        this.G = alVar;
        final int i14 = 1;
        Pair<Boolean, Integer> a10 = a(alVar, alVar2, z11, i12, !alVar2.f13192a.equals(alVar.f13192a));
        boolean booleanValue = ((Boolean) a10.first).booleanValue();
        final int intValue = ((Integer) a10.second).intValue();
        ac acVar = this.E;
        if (booleanValue) {
            r3 = alVar.f13192a.d() ? null : alVar.f13192a.a(alVar.f13192a.a(alVar.f13193b.f15389a, this.f16598k).f13578c, this.f13938a).f13591d;
            acVar = r3 != null ? r3.f13029e : ac.f13083a;
        }
        if (!alVar2.f13200j.equals(alVar.f13200j)) {
            acVar = acVar.a().a(alVar.f13200j).a();
        }
        boolean z12 = !acVar.equals(this.E);
        this.E = acVar;
        final int i15 = 0;
        if (!alVar2.f13192a.equals(alVar.f13192a)) {
            this.f16596i.a(0, new p.a() { // from class: com.applovin.exoplayer2.n0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.b(al.this, i10, (an.b) obj);
                }
            });
        }
        if (z11) {
            final an.e a11 = a(i12, alVar2, i13);
            final an.e c10 = c(j10);
            this.f16596i.a(11, new p.a() { // from class: com.applovin.exoplayer2.s0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.a(i12, a11, c10, (an.b) obj);
                }
            });
        }
        if (booleanValue) {
            this.f16596i.a(1, new p.a() { // from class: com.applovin.exoplayer2.t0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    ((an.b) obj).a(ab.this, intValue);
                }
            });
        }
        if (alVar2.f != alVar.f) {
            this.f16596i.a(10, new r0(alVar, 1));
            if (alVar.f != null) {
                this.f16596i.a(10, new p.a() { // from class: com.applovin.exoplayer2.h0
                    @Override // com.applovin.exoplayer2.l.p.a
                    public final void invoke(Object obj) {
                        int i16 = i15;
                        al alVar3 = alVar;
                        switch (i16) {
                            case 0:
                                r.g(alVar3, (an.b) obj);
                                return;
                            default:
                                r.e(alVar3, (an.b) obj);
                                return;
                        }
                    }
                });
            }
        }
        com.applovin.exoplayer2.j.k kVar = alVar2.f13199i;
        com.applovin.exoplayer2.j.k kVar2 = alVar.f13199i;
        if (kVar != kVar2) {
            this.f16593e.a(kVar2.f16024d);
            final com.applovin.exoplayer2.j.h hVar = new com.applovin.exoplayer2.j.h(alVar.f13199i.f16023c);
            this.f16596i.a(2, new p.a() { // from class: com.applovin.exoplayer2.i0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.a(al.this, hVar, (an.b) obj);
                }
            });
        }
        if (z12) {
            final ac acVar2 = this.E;
            this.f16596i.a(14, new p.a() { // from class: com.applovin.exoplayer2.q0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    int i16 = i14;
                    Object obj2 = acVar2;
                    switch (i16) {
                        case 0:
                            r.b((al) obj2, (an.b) obj);
                            return;
                        default:
                            ((an.b) obj).a((ac) obj2);
                            return;
                    }
                }
            });
        }
        if (alVar2.f13197g != alVar.f13197g) {
            this.f16596i.a(3, new r0(alVar, 2));
        }
        if (alVar2.f13196e != alVar.f13196e || alVar2.f13202l != alVar.f13202l) {
            this.f16596i.a(-1, new p.a() { // from class: com.applovin.exoplayer2.h0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    int i16 = i14;
                    al alVar3 = alVar;
                    switch (i16) {
                        case 0:
                            r.g(alVar3, (an.b) obj);
                            return;
                        default:
                            r.e(alVar3, (an.b) obj);
                            return;
                    }
                }
            });
        }
        if (alVar2.f13196e != alVar.f13196e) {
            this.f16596i.a(4, new p0(alVar, 1));
        }
        if (alVar2.f13202l != alVar.f13202l) {
            this.f16596i.a(5, new p.a() { // from class: com.applovin.exoplayer2.o0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    r.a(al.this, i11, (an.b) obj);
                }
            });
        }
        if (alVar2.f13203m != alVar.f13203m) {
            this.f16596i.a(6, new p0(alVar, 0));
        }
        if (c(alVar2) != c(alVar)) {
            this.f16596i.a(7, new p.a() { // from class: com.applovin.exoplayer2.q0
                @Override // com.applovin.exoplayer2.l.p.a
                public final void invoke(Object obj) {
                    int i16 = i15;
                    Object obj2 = alVar;
                    switch (i16) {
                        case 0:
                            r.b((al) obj2, (an.b) obj);
                            return;
                        default:
                            ((an.b) obj).a((ac) obj2);
                            return;
                    }
                }
            });
        }
        if (!alVar2.f13204n.equals(alVar.f13204n)) {
            this.f16596i.a(12, new r0(alVar, 0));
        }
        if (z10) {
            this.f16596i.a(-1, new k0(5));
        }
        X();
        this.f16596i.a();
        if (alVar2.o != alVar.o) {
            Iterator<q.a> it = this.f16597j.iterator();
            while (it.hasNext()) {
                it.next().a(alVar.o);
            }
        }
        if (alVar2.f13205p != alVar.f13205p) {
            Iterator<q.a> it2 = this.f16597j.iterator();
            while (it2.hasNext()) {
                it2.next().b(alVar.f13205p);
            }
        }
    }

    public static /* synthetic */ void a(int i10, an.e eVar, an.e eVar2, an.b bVar) {
        bVar.e(i10);
        bVar.a(eVar, eVar2, i10);
    }

    public static /* synthetic */ void a(al alVar, com.applovin.exoplayer2.j.h hVar, an.b bVar) {
        bVar.a(alVar.f13198h, hVar);
    }

    public static /* synthetic */ void a(al alVar, int i10, an.b bVar) {
        bVar.b(alVar.f13202l, i10);
    }

    public static /* synthetic */ void a(al alVar, an.b bVar) {
        bVar.a(alVar.f13204n);
    }

    private an.e a(int i10, al alVar, int i11) {
        int i12;
        Object obj;
        ab abVar;
        Object obj2;
        int i13;
        long j10;
        long b10;
        ba.a aVar = new ba.a();
        if (alVar.f13192a.d()) {
            i12 = i11;
            obj = null;
            abVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = alVar.f13193b.f15389a;
            alVar.f13192a.a(obj3, aVar);
            int i14 = aVar.f13578c;
            int c10 = alVar.f13192a.c(obj3);
            Object obj4 = alVar.f13192a.a(i14, this.f13938a).f13589b;
            abVar = this.f13938a.f13591d;
            obj2 = obj3;
            i13 = c10;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            j10 = aVar.f13580e + aVar.f13579d;
            if (alVar.f13193b.a()) {
                p.a aVar2 = alVar.f13193b;
                j10 = aVar.b(aVar2.f15390b, aVar2.f15391c);
                b10 = b(alVar);
            } else {
                if (alVar.f13193b.f15393e != -1 && this.G.f13193b.a()) {
                    j10 = b(this.G);
                }
                b10 = j10;
            }
        } else if (alVar.f13193b.a()) {
            j10 = alVar.f13208s;
            b10 = b(alVar);
        } else {
            j10 = aVar.f13580e + alVar.f13208s;
            b10 = j10;
        }
        long a10 = h.a(j10);
        long a11 = h.a(b10);
        p.a aVar3 = alVar.f13193b;
        return new an.e(obj, i12, abVar, obj2, i13, a10, a11, aVar3.f15390b, aVar3.f15391c);
    }

    private Pair<Boolean, Integer> a(al alVar, al alVar2, boolean z10, int i10, boolean z11) {
        ba baVar = alVar2.f13192a;
        ba baVar2 = alVar.f13192a;
        if (baVar2.d() && baVar.d()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (baVar2.d() != baVar.d()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (baVar.a(baVar.a(alVar2.f13193b.f15389a, this.f16598k).f13578c, this.f13938a).f13589b.equals(baVar2.a(baVar2.a(alVar.f13193b.f15389a, this.f16598k).f13578c, this.f13938a).f13589b)) {
            if (z10 && i10 == 0 && alVar2.f13193b.f15392d < alVar.f13193b.f15392d) {
                return new Pair<>(Boolean.TRUE, 0);
            }
            return new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private void a(List<com.applovin.exoplayer2.h.p> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int W = W();
        long I = I();
        this.f16609w++;
        if (!this.f16599l.isEmpty()) {
            b(0, this.f16599l.size());
        }
        List<ah.c> a10 = a(0, list);
        ba Y = Y();
        if (!Y.d() && i10 >= Y.b()) {
            throw new y(Y, i10, j10);
        }
        if (z10) {
            int b10 = Y.b(this.f16608v);
            j11 = com.anythink.expressad.exoplayer.b.f7291b;
            i11 = b10;
        } else if (i10 == -1) {
            i11 = W;
            j11 = I;
        } else {
            i11 = i10;
            j11 = j10;
        }
        al a11 = a(this.G, Y, a(Y, i11, j11));
        int i12 = a11.f13196e;
        if (i11 != -1 && i12 != 1) {
            i12 = (Y.d() || i11 >= Y.b()) ? 4 : 2;
        }
        al a12 = a11.a(i12);
        this.f16595h.a(a10, i11, h.b(j11), this.B);
        a(a12, 0, 1, false, (this.G.f13193b.f15389a.equals(a12.f13193b.f15389a) || this.G.f13192a.d()) ? false : true, 4, a(a12), -1);
    }

    private List<ah.c> a(int i10, List<com.applovin.exoplayer2.h.p> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            ah.c cVar = new ah.c(list.get(i11), this.f16600m);
            arrayList.add(cVar);
            this.f16599l.add(i11 + i10, new a(cVar.f13180b, cVar.f13179a.f()));
        }
        this.B = this.B.a(i10, arrayList.size());
        return arrayList;
    }

    private al a(int i10, int i11) {
        boolean z10 = false;
        com.applovin.exoplayer2.l.a.a(i10 >= 0 && i11 >= i10 && i11 <= this.f16599l.size());
        int G = G();
        ba S = S();
        int size = this.f16599l.size();
        this.f16609w++;
        b(i10, i11);
        ba Y = Y();
        al a10 = a(this.G, Y, a(S, Y));
        int i12 = a10.f13196e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && G >= a10.f13192a.b()) {
            z10 = true;
        }
        if (z10) {
            a10 = a10.a(4);
        }
        this.f16595h.a(i10, i11, this.B);
        return a10;
    }

    private al a(al alVar, ba baVar, Pair<Object, Long> pair) {
        long j10;
        com.applovin.exoplayer2.l.a.a(baVar.d() || pair != null);
        ba baVar2 = alVar.f13192a;
        al a10 = alVar.a(baVar);
        if (baVar.d()) {
            p.a a11 = al.a();
            long b10 = h.b(this.J);
            al a12 = a10.a(a11, b10, b10, b10, 0L, com.applovin.exoplayer2.h.ad.f15284a, this.f16590b, com.applovin.exoplayer2.common.a.s.g()).a(a11);
            a12.f13206q = a12.f13208s;
            return a12;
        }
        Object obj = a10.f13193b.f15389a;
        boolean z10 = !obj.equals(((Pair) com.applovin.exoplayer2.l.ai.a(pair)).first);
        p.a aVar = z10 ? new p.a(pair.first) : a10.f13193b;
        long longValue = ((Long) pair.second).longValue();
        long b11 = h.b(N());
        if (!baVar2.d()) {
            b11 -= baVar2.a(obj, this.f16598k).c();
        }
        if (z10 || longValue < b11) {
            com.applovin.exoplayer2.l.a.b(!aVar.a());
            al a13 = a10.a(aVar, longValue, longValue, longValue, 0L, z10 ? com.applovin.exoplayer2.h.ad.f15284a : a10.f13198h, z10 ? this.f16590b : a10.f13199i, z10 ? com.applovin.exoplayer2.common.a.s.g() : a10.f13200j).a(aVar);
            a13.f13206q = longValue;
            return a13;
        }
        if (longValue == b11) {
            int c10 = baVar.c(a10.f13201k.f15389a);
            if (c10 == -1 || baVar.a(c10, this.f16598k).f13578c != baVar.a(aVar.f15389a, this.f16598k).f13578c) {
                baVar.a(aVar.f15389a, this.f16598k);
                if (aVar.a()) {
                    j10 = this.f16598k.b(aVar.f15390b, aVar.f15391c);
                } else {
                    j10 = this.f16598k.f13579d;
                }
                a10 = a10.a(aVar, a10.f13208s, a10.f13208s, a10.f13195d, j10 - a10.f13208s, a10.f13198h, a10.f13199i, a10.f13200j).a(aVar);
                a10.f13206q = j10;
            }
        } else {
            com.applovin.exoplayer2.l.a.b(!aVar.a());
            long max = Math.max(0L, a10.f13207r - (longValue - b11));
            long j11 = a10.f13206q;
            if (a10.f13201k.equals(a10.f13193b)) {
                j11 = longValue + max;
            }
            a10 = a10.a(aVar, longValue, longValue, longValue, max, a10.f13198h, a10.f13199i, a10.f13200j);
            a10.f13206q = j11;
        }
        return a10;
    }

    private Pair<Object, Long> a(ba baVar, ba baVar2) {
        long N = N();
        if (!baVar.d() && !baVar2.d()) {
            Pair<Object, Long> a10 = baVar.a(this.f13938a, this.f16598k, G(), h.b(N));
            Object obj = ((Pair) com.applovin.exoplayer2.l.ai.a(a10)).first;
            if (baVar2.c(obj) != -1) {
                return a10;
            }
            Object a11 = s.a(this.f13938a, this.f16598k, this.f16607u, this.f16608v, obj, baVar, baVar2);
            if (a11 != null) {
                baVar2.a(a11, this.f16598k);
                int i10 = this.f16598k.f13578c;
                return a(baVar2, i10, baVar2.a(i10, this.f13938a).a());
            }
            return a(baVar2, -1, com.anythink.expressad.exoplayer.b.f7291b);
        }
        boolean z10 = !baVar.d() && baVar2.d();
        int W = z10 ? -1 : W();
        if (z10) {
            N = -9223372036854775807L;
        }
        return a(baVar2, W, N);
    }

    private Pair<Object, Long> a(ba baVar, int i10, long j10) {
        if (baVar.d()) {
            this.H = i10;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                j10 = 0;
            }
            this.J = j10;
            this.I = 0;
            return null;
        }
        if (i10 == -1 || i10 >= baVar.b()) {
            i10 = baVar.b(this.f16608v);
            j10 = baVar.a(i10, this.f13938a).a();
        }
        return baVar.a(this.f13938a, this.f16598k, i10, h.b(j10));
    }

    private long a(ba baVar, p.a aVar, long j10) {
        baVar.a(aVar.f15389a, this.f16598k);
        return this.f16598k.c() + j10;
    }
}
