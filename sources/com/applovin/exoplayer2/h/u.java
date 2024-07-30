package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.s;
import com.applovin.exoplayer2.h.t;
import com.applovin.exoplayer2.k.i;

/* loaded from: classes.dex */
public final class u extends com.applovin.exoplayer2.h.a implements t.b {

    /* renamed from: a */
    private final com.applovin.exoplayer2.ab f15443a;

    /* renamed from: b */
    private final ab.f f15444b;

    /* renamed from: c */
    private final i.a f15445c;

    /* renamed from: d */
    private final s.a f15446d;

    /* renamed from: e */
    private final com.applovin.exoplayer2.d.h f15447e;
    private final com.applovin.exoplayer2.k.v f;

    /* renamed from: g */
    private final int f15448g;

    /* renamed from: h */
    private boolean f15449h;

    /* renamed from: i */
    private long f15450i;

    /* renamed from: j */
    private boolean f15451j;

    /* renamed from: k */
    private boolean f15452k;

    /* renamed from: l */
    private com.applovin.exoplayer2.k.aa f15453l;

    /* loaded from: classes.dex */
    public static final class a implements r {

        /* renamed from: a */
        private final i.a f15455a;

        /* renamed from: b */
        private s.a f15456b;

        /* renamed from: c */
        private com.applovin.exoplayer2.d.i f15457c;

        /* renamed from: d */
        private com.applovin.exoplayer2.k.v f15458d;

        /* renamed from: e */
        private int f15459e;
        private String f;

        /* renamed from: g */
        private Object f15460g;

        public a(i.a aVar) {
            this(aVar, new com.applovin.exoplayer2.e.f());
        }

        public static /* synthetic */ s a(com.applovin.exoplayer2.e.l lVar) {
            return new c(lVar);
        }

        public static /* synthetic */ s b(com.applovin.exoplayer2.e.l lVar) {
            return a(lVar);
        }

        public a(i.a aVar, com.applovin.exoplayer2.e.l lVar) {
            this(aVar, new k0(lVar, 0));
        }

        public u a(com.applovin.exoplayer2.ab abVar) {
            com.applovin.exoplayer2.l.a.b(abVar.f13027c);
            ab.f fVar = abVar.f13027c;
            boolean z10 = fVar.f13082h == null && this.f15460g != null;
            boolean z11 = fVar.f == null && this.f != null;
            if (z10 && z11) {
                abVar = abVar.a().a(this.f15460g).b(this.f).a();
            } else if (z10) {
                abVar = abVar.a().a(this.f15460g).a();
            } else if (z11) {
                abVar = abVar.a().b(this.f).a();
            }
            com.applovin.exoplayer2.ab abVar2 = abVar;
            return new u(abVar2, this.f15455a, this.f15456b, this.f15457c.a(abVar2), this.f15458d, this.f15459e);
        }

        public a(i.a aVar, s.a aVar2) {
            this.f15455a = aVar;
            this.f15456b = aVar2;
            this.f15457c = new com.applovin.exoplayer2.d.d();
            this.f15458d = new com.applovin.exoplayer2.k.r();
            this.f15459e = com.anythink.expressad.exoplayer.h.o.f8460d;
        }
    }

    public /* synthetic */ u(com.applovin.exoplayer2.ab abVar, i.a aVar, s.a aVar2, com.applovin.exoplayer2.d.h hVar, com.applovin.exoplayer2.k.v vVar, int i10, AnonymousClass1 anonymousClass1) {
        this(abVar, aVar, aVar2, hVar, vVar, i10);
    }

    private void f() {
        ba aaVar = new aa(this.f15450i, this.f15451j, false, this.f15452k, null, this.f15443a);
        if (this.f15449h) {
            aaVar = new h(aaVar) { // from class: com.applovin.exoplayer2.h.u.1
                public AnonymousClass1(ba aaVar2) {
                    super(aaVar2);
                }

                @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
                public ba.c a(int i10, ba.c cVar, long j10) {
                    super.a(i10, cVar, j10);
                    cVar.f13599m = true;
                    return cVar;
                }

                @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
                public ba.a a(int i10, ba.a aVar, boolean z10) {
                    super.a(i10, aVar, z10);
                    aVar.f = true;
                    return aVar;
                }
            };
        }
        a(aaVar2);
    }

    @Override // com.applovin.exoplayer2.h.a
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        this.f15453l = aaVar;
        this.f15447e.a();
        f();
    }

    @Override // com.applovin.exoplayer2.h.p
    public n b(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j10) {
        com.applovin.exoplayer2.k.i a10 = this.f15445c.a();
        com.applovin.exoplayer2.k.aa aaVar = this.f15453l;
        if (aaVar != null) {
            a10.a(aaVar);
        }
        return new t(this.f15444b.f13076a, a10, this.f15446d.createProgressiveMediaExtractor(), this.f15447e, b(aVar), this.f, a(aVar), this, bVar, this.f15444b.f, this.f15448g);
    }

    @Override // com.applovin.exoplayer2.h.a
    public void c() {
        this.f15447e.b();
    }

    @Override // com.applovin.exoplayer2.h.p
    public com.applovin.exoplayer2.ab g() {
        return this.f15443a;
    }

    /* renamed from: com.applovin.exoplayer2.h.u$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends h {
        public AnonymousClass1(ba aaVar2) {
            super(aaVar2);
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public ba.c a(int i10, ba.c cVar, long j10) {
            super.a(i10, cVar, j10);
            cVar.f13599m = true;
            return cVar;
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public ba.a a(int i10, ba.a aVar, boolean z10) {
            super.a(i10, aVar, z10);
            aVar.f = true;
            return aVar;
        }
    }

    private u(com.applovin.exoplayer2.ab abVar, i.a aVar, s.a aVar2, com.applovin.exoplayer2.d.h hVar, com.applovin.exoplayer2.k.v vVar, int i10) {
        this.f15444b = (ab.f) com.applovin.exoplayer2.l.a.b(abVar.f13027c);
        this.f15443a = abVar;
        this.f15445c = aVar;
        this.f15446d = aVar2;
        this.f15447e = hVar;
        this.f = vVar;
        this.f15448g = i10;
        this.f15449h = true;
        this.f15450i = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.h.p
    public void a(n nVar) {
        ((t) nVar).g();
    }

    @Override // com.applovin.exoplayer2.h.t.b
    public void a(long j10, boolean z10, boolean z11) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = this.f15450i;
        }
        if (!this.f15449h && this.f15450i == j10 && this.f15451j == z10 && this.f15452k == z11) {
            return;
        }
        this.f15450i = j10;
        this.f15451j = z10;
        this.f15452k = z11;
        this.f15449h = false;
        f();
    }

    @Override // com.applovin.exoplayer2.h.p
    public void e() {
    }
}
