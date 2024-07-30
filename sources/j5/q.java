package j5;

import j5.u;
import k4.q1;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: MaskingMediaSource.java */
/* loaded from: classes2.dex */
public final class q extends p0 {
    public final boolean D;
    public final q1.c E;
    public final q1.b F;
    public a G;
    public p H;
    public boolean I;
    public boolean J;
    public boolean K;

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends m {

        /* renamed from: w, reason: collision with root package name */
        public static final Object f29825w = new Object();

        /* renamed from: u, reason: collision with root package name */
        public final Object f29826u;

        /* renamed from: v, reason: collision with root package name */
        public final Object f29827v;

        public a(q1 q1Var, Object obj, Object obj2) {
            super(q1Var);
            this.f29826u = obj;
            this.f29827v = obj2;
        }

        @Override // j5.m, k4.q1
        public final int b(Object obj) {
            Object obj2;
            if (f29825w.equals(obj) && (obj2 = this.f29827v) != null) {
                obj = obj2;
            }
            return this.f29798t.b(obj);
        }

        @Override // j5.m, k4.q1
        public final q1.b f(int i10, q1.b bVar, boolean z10) {
            this.f29798t.f(i10, bVar, z10);
            if (d6.g0.a(bVar.f30755t, this.f29827v) && z10) {
                bVar.f30755t = f29825w;
            }
            return bVar;
        }

        @Override // j5.m, k4.q1
        public final Object l(int i10) {
            Object l10 = this.f29798t.l(i10);
            if (d6.g0.a(l10, this.f29827v)) {
                return f29825w;
            }
            return l10;
        }

        @Override // j5.m, k4.q1
        public final q1.c n(int i10, q1.c cVar, long j10) {
            this.f29798t.n(i10, cVar, j10);
            if (d6.g0.a(cVar.f30760s, this.f29826u)) {
                cVar.f30760s = q1.c.J;
            }
            return cVar;
        }
    }

    /* compiled from: MaskingMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b extends q1 {

        /* renamed from: t, reason: collision with root package name */
        public final k4.n0 f29828t;

        public b(k4.n0 n0Var) {
            this.f29828t = n0Var;
        }

        @Override // k4.q1
        public final int b(Object obj) {
            if (obj == a.f29825w) {
                return 0;
            }
            return -1;
        }

        @Override // k4.q1
        public final q1.b f(int i10, q1.b bVar, boolean z10) {
            Integer num;
            Object obj = null;
            if (z10) {
                num = 0;
            } else {
                num = null;
            }
            if (z10) {
                obj = a.f29825w;
            }
            bVar.h(num, obj, 0, com.anythink.expressad.exoplayer.b.f7291b, 0L, k5.a.y, true);
            return bVar;
        }

        @Override // k4.q1
        public final int h() {
            return 1;
        }

        @Override // k4.q1
        public final Object l(int i10) {
            return a.f29825w;
        }

        @Override // k4.q1
        public final q1.c n(int i10, q1.c cVar, long j10) {
            cVar.b(q1.c.J, this.f29828t, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, false, true, null, 0L, com.anythink.expressad.exoplayer.b.f7291b, 0, 0, 0L);
            cVar.D = true;
            return cVar;
        }

        @Override // k4.q1
        public final int o() {
            return 1;
        }
    }

    public q(u uVar, boolean z10) {
        super(uVar);
        boolean z11;
        if (z10 && uVar.k()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.D = z11;
        this.E = new q1.c();
        this.F = new q1.b();
        q1 m10 = uVar.m();
        if (m10 != null) {
            this.G = new a(m10, null, null);
            this.K = true;
        } else {
            this.G = new a(new b(uVar.d()), q1.c.J, a.f29825w);
        }
    }

    @Override // j5.p0
    public final u.b C(u.b bVar) {
        Object obj = bVar.f29835a;
        Object obj2 = this.G.f29827v;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f29825w;
        }
        return bVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c8  */
    @Override // j5.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(k4.q1 r15) {
        /*
            r14 = this;
            boolean r0 = r14.J
            if (r0 == 0) goto L1c
            j5.q$a r0 = r14.G
            j5.q$a r1 = new j5.q$a
            java.lang.Object r2 = r0.f29826u
            java.lang.Object r0 = r0.f29827v
            r1.<init>(r15, r2, r0)
            r14.G = r1
            j5.p r15 = r14.H
            if (r15 == 0) goto Lbb
            long r0 = r15.y
            r14.G(r0)
            goto Lbb
        L1c:
            boolean r0 = r15.p()
            if (r0 == 0) goto L40
            boolean r0 = r14.K
            if (r0 == 0) goto L32
            j5.q$a r0 = r14.G
            j5.q$a r1 = new j5.q$a
            java.lang.Object r2 = r0.f29826u
            java.lang.Object r0 = r0.f29827v
            r1.<init>(r15, r2, r0)
            goto L3c
        L32:
            java.lang.Object r0 = k4.q1.c.J
            java.lang.Object r1 = j5.q.a.f29825w
            j5.q$a r2 = new j5.q$a
            r2.<init>(r15, r0, r1)
            r1 = r2
        L3c:
            r14.G = r1
            goto Lbb
        L40:
            r0 = 0
            k4.q1$c r1 = r14.E
            r15.m(r0, r1)
            long r2 = r1.E
            java.lang.Object r4 = r1.f30760s
            j5.p r5 = r14.H
            if (r5 == 0) goto L6c
            j5.q$a r6 = r14.G
            j5.u$b r7 = r5.f29819s
            java.lang.Object r7 = r7.f29835a
            k4.q1$b r8 = r14.F
            r6.g(r7, r8)
            long r6 = r8.f30758w
            long r8 = r5.f29820t
            long r6 = r6 + r8
            j5.q$a r5 = r14.G
            k4.q1$c r0 = r5.m(r0, r1)
            long r0 = r0.E
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L6c
            r12 = r6
            goto L6d
        L6c:
            r12 = r2
        L6d:
            k4.q1$c r9 = r14.E
            k4.q1$b r10 = r14.F
            r11 = 0
            r8 = r15
            android.util.Pair r0 = r8.i(r9, r10, r11, r12)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r14.K
            if (r0 == 0) goto L91
            j5.q$a r0 = r14.G
            j5.q$a r1 = new j5.q$a
            java.lang.Object r4 = r0.f29826u
            java.lang.Object r0 = r0.f29827v
            r1.<init>(r15, r4, r0)
            goto L97
        L91:
            j5.q$a r0 = new j5.q$a
            r0.<init>(r15, r4, r1)
            r1 = r0
        L97:
            r14.G = r1
            j5.p r15 = r14.H
            if (r15 == 0) goto Lbb
            r14.G(r2)
            j5.u$b r15 = r15.f29819s
            java.lang.Object r0 = r15.f29835a
            j5.q$a r1 = r14.G
            java.lang.Object r1 = r1.f29827v
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = j5.q.a.f29825w
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lb6
            j5.q$a r0 = r14.G
            java.lang.Object r0 = r0.f29827v
        Lb6:
            j5.u$b r15 = r15.b(r0)
            goto Lbc
        Lbb:
            r15 = 0
        Lbc:
            r0 = 1
            r14.K = r0
            r14.J = r0
            j5.q$a r0 = r14.G
            r14.v(r0)
            if (r15 == 0) goto Ld0
            j5.p r0 = r14.H
            r0.getClass()
            r0.h(r15)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.q.D(k4.q1):void");
    }

    @Override // j5.p0
    public final void E() {
        if (!this.D) {
            this.I = true;
            B(null, this.C);
        }
    }

    @Override // j5.u
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final p p(u.b bVar, c6.b bVar2, long j10) {
        boolean z10;
        p pVar = new p(bVar, bVar2, j10);
        if (pVar.f29822v == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        u uVar = this.C;
        pVar.f29822v = uVar;
        if (this.J) {
            Object obj = this.G.f29827v;
            Object obj2 = bVar.f29835a;
            if (obj != null && obj2.equals(a.f29825w)) {
                obj2 = this.G.f29827v;
            }
            pVar.h(bVar.b(obj2));
        } else {
            this.H = pVar;
            if (!this.I) {
                this.I = true;
                B(null, uVar);
            }
        }
        return pVar;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void G(long j10) {
        p pVar = this.H;
        int b10 = this.G.b(pVar.f29819s.f29835a);
        if (b10 == -1) {
            return;
        }
        a aVar = this.G;
        q1.b bVar = this.F;
        aVar.f(b10, bVar, false);
        long j11 = bVar.f30757v;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        pVar.y = j10;
    }

    @Override // j5.u
    public final void c(s sVar) {
        ((p) sVar).i();
        if (sVar == this.H) {
            this.H = null;
        }
    }

    @Override // j5.g, j5.a
    public final void w() {
        this.J = false;
        this.I = false;
        super.w();
    }

    @Override // j5.g, j5.u
    public final void j() {
    }
}
