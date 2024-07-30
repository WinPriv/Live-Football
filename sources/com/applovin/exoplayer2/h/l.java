package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;

/* loaded from: classes.dex */
public final class l extends e<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final p f15372a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15373b;

    /* renamed from: c, reason: collision with root package name */
    private final ba.c f15374c;

    /* renamed from: d, reason: collision with root package name */
    private final ba.a f15375d;

    /* renamed from: e, reason: collision with root package name */
    private a f15376e;
    private k f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15377g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15378h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15379i;

    /* loaded from: classes.dex */
    public static final class a extends h {

        /* renamed from: d, reason: collision with root package name */
        public static final Object f15380d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private final Object f15381e;
        private final Object f;

        private a(ba baVar, Object obj, Object obj2) {
            super(baVar);
            this.f15381e = obj;
            this.f = obj2;
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public int c(Object obj) {
            Object obj2;
            ba baVar = this.f15345c;
            if (f15380d.equals(obj) && (obj2 = this.f) != null) {
                obj = obj2;
            }
            return baVar.c(obj);
        }

        public static a a(com.applovin.exoplayer2.ab abVar) {
            return new a(new b(abVar), ba.c.f13585a, f15380d);
        }

        public static a a(ba baVar, Object obj, Object obj2) {
            return new a(baVar, obj, obj2);
        }

        public a a(ba baVar) {
            return new a(baVar, this.f15381e, this.f);
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public ba.c a(int i10, ba.c cVar, long j10) {
            this.f15345c.a(i10, cVar, j10);
            if (ai.a(cVar.f13589b, this.f15381e)) {
                cVar.f13589b = ba.c.f13585a;
            }
            return cVar;
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public ba.a a(int i10, ba.a aVar, boolean z10) {
            this.f15345c.a(i10, aVar, z10);
            if (ai.a(aVar.f13577b, this.f) && z10) {
                aVar.f13577b = f15380d;
            }
            return aVar;
        }

        @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
        public Object a(int i10) {
            Object a10 = this.f15345c.a(i10);
            return ai.a(a10, this.f) ? f15380d : a10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ba {

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.exoplayer2.ab f15382c;

        public b(com.applovin.exoplayer2.ab abVar) {
            this.f15382c = abVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public ba.c a(int i10, ba.c cVar, long j10) {
            cVar.a(ba.c.f13585a, this.f15382c, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, false, true, null, 0L, com.anythink.expressad.exoplayer.b.f7291b, 0, 0, 0L);
            cVar.f13599m = true;
            return cVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public int b() {
            return 1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c() {
            return 1;
        }

        @Override // com.applovin.exoplayer2.ba
        public int c(Object obj) {
            return obj == a.f15380d ? 0 : -1;
        }

        @Override // com.applovin.exoplayer2.ba
        public ba.a a(int i10, ba.a aVar, boolean z10) {
            aVar.a(z10 ? 0 : null, z10 ? a.f15380d : null, 0, com.anythink.expressad.exoplayer.b.f7291b, 0L, com.applovin.exoplayer2.h.a.a.f15249a, true);
            return aVar;
        }

        @Override // com.applovin.exoplayer2.ba
        public Object a(int i10) {
            return a.f15380d;
        }
    }

    public l(p pVar, boolean z10) {
        boolean z11;
        this.f15372a = pVar;
        if (z10 && pVar.i()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f15373b = z11;
        this.f15374c = new ba.c();
        this.f15375d = new ba.a();
        ba h10 = pVar.h();
        if (h10 != null) {
            this.f15376e = a.a(h10, (Object) null, (Object) null);
            this.f15379i = true;
        } else {
            this.f15376e = a.a(pVar.g());
        }
    }

    @Override // com.applovin.exoplayer2.h.e, com.applovin.exoplayer2.h.a
    public void c() {
        this.f15378h = false;
        this.f15377g = false;
        super.c();
    }

    public ba f() {
        return this.f15376e;
    }

    @Override // com.applovin.exoplayer2.h.p
    public com.applovin.exoplayer2.ab g() {
        return this.f15372a.g();
    }

    private Object b(Object obj) {
        return (this.f15376e.f == null || !this.f15376e.f.equals(obj)) ? obj : a.f15380d;
    }

    @Override // com.applovin.exoplayer2.h.e, com.applovin.exoplayer2.h.a
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        super.a(aaVar);
        if (this.f15373b) {
            return;
        }
        this.f15377g = true;
        a((l) null, this.f15372a);
    }

    @Override // com.applovin.exoplayer2.h.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public k b(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j10) {
        k kVar = new k(aVar, bVar, j10);
        kVar.a(this.f15372a);
        if (this.f15378h) {
            kVar.a(aVar.a(a(aVar.f15389a)));
        } else {
            this.f = kVar;
            if (!this.f15377g) {
                this.f15377g = true;
                a((l) null, this.f15372a);
            }
        }
        return kVar;
    }

    @Override // com.applovin.exoplayer2.h.p
    public void a(n nVar) {
        ((k) nVar).i();
        if (nVar == this.f) {
            this.f = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    @Override // com.applovin.exoplayer2.h.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Void r13, com.applovin.exoplayer2.h.p r14, com.applovin.exoplayer2.ba r15) {
        /*
            r12 = this;
            boolean r13 = r12.f15378h
            if (r13 == 0) goto L19
            com.applovin.exoplayer2.h.l$a r13 = r12.f15376e
            com.applovin.exoplayer2.h.l$a r13 = r13.a(r15)
            r12.f15376e = r13
            com.applovin.exoplayer2.h.k r13 = r12.f
            if (r13 == 0) goto Lae
            long r13 = r13.h()
            r12.a(r13)
            goto Lae
        L19:
            boolean r13 = r15.d()
            if (r13 == 0) goto L36
            boolean r13 = r12.f15379i
            if (r13 == 0) goto L2a
            com.applovin.exoplayer2.h.l$a r13 = r12.f15376e
            com.applovin.exoplayer2.h.l$a r13 = r13.a(r15)
            goto L32
        L2a:
            java.lang.Object r13 = com.applovin.exoplayer2.ba.c.f13585a
            java.lang.Object r14 = com.applovin.exoplayer2.h.l.a.f15380d
            com.applovin.exoplayer2.h.l$a r13 = com.applovin.exoplayer2.h.l.a.a(r15, r13, r14)
        L32:
            r12.f15376e = r13
            goto Lae
        L36:
            com.applovin.exoplayer2.ba$c r13 = r12.f15374c
            r14 = 0
            r15.a(r14, r13)
            com.applovin.exoplayer2.ba$c r13 = r12.f15374c
            long r0 = r13.b()
            com.applovin.exoplayer2.ba$c r13 = r12.f15374c
            java.lang.Object r13 = r13.f13589b
            com.applovin.exoplayer2.h.k r2 = r12.f
            if (r2 == 0) goto L74
            long r2 = r2.g()
            com.applovin.exoplayer2.h.l$a r4 = r12.f15376e
            com.applovin.exoplayer2.h.k r5 = r12.f
            com.applovin.exoplayer2.h.p$a r5 = r5.f15362a
            java.lang.Object r5 = r5.f15389a
            com.applovin.exoplayer2.ba$a r6 = r12.f15375d
            r4.a(r5, r6)
            com.applovin.exoplayer2.ba$a r4 = r12.f15375d
            long r4 = r4.c()
            long r4 = r4 + r2
            com.applovin.exoplayer2.h.l$a r2 = r12.f15376e
            com.applovin.exoplayer2.ba$c r3 = r12.f15374c
            com.applovin.exoplayer2.ba$c r14 = r2.a(r14, r3)
            long r2 = r14.b()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            com.applovin.exoplayer2.ba$c r7 = r12.f15374c
            com.applovin.exoplayer2.ba$a r8 = r12.f15375d
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.a(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f15379i
            if (r14 == 0) goto L94
            com.applovin.exoplayer2.h.l$a r13 = r12.f15376e
            com.applovin.exoplayer2.h.l$a r13 = r13.a(r15)
            goto L98
        L94:
            com.applovin.exoplayer2.h.l$a r13 = com.applovin.exoplayer2.h.l.a.a(r15, r13, r0)
        L98:
            r12.f15376e = r13
            com.applovin.exoplayer2.h.k r13 = r12.f
            if (r13 == 0) goto Lae
            r12.a(r1)
            com.applovin.exoplayer2.h.p$a r13 = r13.f15362a
            java.lang.Object r14 = r13.f15389a
            java.lang.Object r14 = r12.a(r14)
            com.applovin.exoplayer2.h.p$a r13 = r13.a(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.f15379i = r14
            r12.f15378h = r14
            com.applovin.exoplayer2.h.l$a r14 = r12.f15376e
            r12.a(r14)
            if (r13 == 0) goto Lc6
            com.applovin.exoplayer2.h.k r14 = r12.f
            java.lang.Object r14 = com.applovin.exoplayer2.l.a.b(r14)
            com.applovin.exoplayer2.h.k r14 = (com.applovin.exoplayer2.h.k) r14
            r14.a(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.l.a(java.lang.Void, com.applovin.exoplayer2.h.p, com.applovin.exoplayer2.ba):void");
    }

    @Override // com.applovin.exoplayer2.h.e, com.applovin.exoplayer2.h.p
    public void e() {
    }

    @Override // com.applovin.exoplayer2.h.e
    public p.a a(Void r12, p.a aVar) {
        return aVar.a(b(aVar.f15389a));
    }

    private Object a(Object obj) {
        return (this.f15376e.f == null || !obj.equals(a.f15380d)) ? obj : this.f15376e.f;
    }

    private void a(long j10) {
        k kVar = this.f;
        int c10 = this.f15376e.c(kVar.f15362a.f15389a);
        if (c10 == -1) {
            return;
        }
        long j11 = this.f15376e.a(c10, this.f15375d).f13579d;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        kVar.d(j10);
    }
}
