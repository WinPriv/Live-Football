package com.anythink.expressad.exoplayer.h;

import com.anythink.expressad.exoplayer.h.r;

/* loaded from: classes.dex */
public final class d implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final r f8330a;

    /* renamed from: b, reason: collision with root package name */
    long f8331b;

    /* renamed from: c, reason: collision with root package name */
    long f8332c;

    /* renamed from: d, reason: collision with root package name */
    private r.a f8333d;

    /* renamed from: e, reason: collision with root package name */
    private a[] f8334e = new a[0];
    private long f;

    /* loaded from: classes.dex */
    public final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final y f8335a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8337c;

        public a(y yVar) {
            this.f8335a = yVar;
        }

        public final void a() {
            this.f8337c = false;
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final boolean b() {
            if (!d.this.f() && this.f8335a.b()) {
                return true;
            }
            return false;
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final void c() {
            this.f8335a.c();
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final int a(com.anythink.expressad.exoplayer.n nVar, com.anythink.expressad.exoplayer.c.e eVar, boolean z10) {
            if (d.this.f()) {
                return -3;
            }
            if (this.f8337c) {
                eVar.a(4);
                return -4;
            }
            int a10 = this.f8335a.a(nVar, eVar, z10);
            if (a10 == -5) {
                com.anythink.expressad.exoplayer.m mVar = nVar.f9274a;
                int i10 = mVar.f9272x;
                if (i10 != 0 || mVar.y != 0) {
                    d dVar = d.this;
                    if (dVar.f8331b != 0) {
                        i10 = 0;
                    }
                    nVar.f9274a = mVar.a(i10, dVar.f8332c == Long.MIN_VALUE ? mVar.y : 0);
                }
                return -5;
            }
            d dVar2 = d.this;
            long j10 = dVar2.f8332c;
            if (j10 == Long.MIN_VALUE || ((a10 != -4 || eVar.f < j10) && !(a10 == -3 && dVar2.d() == Long.MIN_VALUE))) {
                return a10;
            }
            eVar.a();
            eVar.a(4);
            this.f8337c = true;
            return -4;
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final int a(long j10) {
            if (d.this.f()) {
                return -3;
            }
            return this.f8335a.a(j10);
        }
    }

    public d(r rVar, boolean z10, long j10, long j11) {
        long j12;
        this.f8330a = rVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.f = j12;
        this.f8331b = j10;
        this.f8332c = j11;
    }

    private void g() {
        this.f8333d.a((r.a) this);
    }

    public final void a(long j10, long j11) {
        this.f8331b = j10;
        this.f8332c = j11;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final void a_(long j10) {
        this.f8330a.a_(j10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final af b() {
        return this.f8330a.b();
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long c() {
        if (f()) {
            long j10 = this.f;
            this.f = com.anythink.expressad.exoplayer.b.f7291b;
            long c10 = c();
            return c10 != com.anythink.expressad.exoplayer.b.f7291b ? c10 : j10;
        }
        long c11 = this.f8330a.c();
        if (c11 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        boolean z10 = true;
        com.anythink.expressad.exoplayer.k.a.b(c11 >= this.f8331b);
        long j11 = this.f8332c;
        if (j11 != Long.MIN_VALUE && c11 > j11) {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        return c11;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long d() {
        long d10 = this.f8330a.d();
        if (d10 != Long.MIN_VALUE) {
            long j10 = this.f8332c;
            if (j10 == Long.MIN_VALUE || d10 < j10) {
                return d10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long e() {
        long e10 = this.f8330a.e();
        if (e10 != Long.MIN_VALUE) {
            long j10 = this.f8332c;
            if (j10 == Long.MIN_VALUE || e10 < j10) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean f() {
        if (this.f != com.anythink.expressad.exoplayer.b.f7291b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // com.anythink.expressad.exoplayer.h.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f = r0
            com.anythink.expressad.exoplayer.h.d$a[] r0 = r5.f8334e
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.a()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.anythink.expressad.exoplayer.h.r r0 = r5.f8330a
            long r0 = r0.b(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f8331b
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f8332c
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.anythink.expressad.exoplayer.k.a.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.h.d.b(long):long");
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(r.a aVar, long j10) {
        this.f8333d = aVar;
        this.f8330a.a(this, j10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a() {
        this.f8330a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r1 > r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // com.anythink.expressad.exoplayer.h.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.anythink.expressad.exoplayer.i.f[] r16, boolean[] r17, com.anythink.expressad.exoplayer.h.y[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            com.anythink.expressad.exoplayer.h.d$a[] r1 = new com.anythink.expressad.exoplayer.h.d.a[r1]
            r0.f8334e = r1
            int r1 = r9.length
            com.anythink.expressad.exoplayer.h.y[] r10 = new com.anythink.expressad.exoplayer.h.y[r1]
            r11 = 0
            r1 = r11
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            com.anythink.expressad.exoplayer.h.d$a[] r2 = r0.f8334e
            r3 = r9[r1]
            com.anythink.expressad.exoplayer.h.d$a r3 = (com.anythink.expressad.exoplayer.h.d.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            com.anythink.expressad.exoplayer.h.y r12 = r3.f8335a
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            com.anythink.expressad.exoplayer.h.r r1 = r0.f8330a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.a(r2, r3, r4, r5, r6)
            boolean r3 = r15.f()
            r4 = 1
            if (r3 == 0) goto L64
            long r5 = r0.f8331b
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L64
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L5f
            int r3 = r8.length
            r5 = r11
        L48:
            if (r5 >= r3) goto L5f
            r6 = r8[r5]
            if (r6 == 0) goto L5c
            com.anythink.expressad.exoplayer.m r6 = r6.h()
            java.lang.String r6 = r6.f9257h
            boolean r6 = com.anythink.expressad.exoplayer.k.o.a(r6)
            if (r6 != 0) goto L5c
            r3 = r4
            goto L60
        L5c:
            int r5 = r5 + 1
            goto L48
        L5f:
            r3 = r11
        L60:
            if (r3 == 0) goto L64
            r5 = r1
            goto L69
        L64:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L69:
            r0.f = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L83
            long r5 = r0.f8331b
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L82
            long r5 = r0.f8332c
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L83
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L82
            goto L83
        L82:
            r4 = r11
        L83:
            com.anythink.expressad.exoplayer.k.a.b(r4)
        L86:
            int r3 = r9.length
            if (r11 >= r3) goto Lb0
            r3 = r10[r11]
            if (r3 != 0) goto L92
            com.anythink.expressad.exoplayer.h.d$a[] r3 = r0.f8334e
            r3[r11] = r12
            goto La7
        L92:
            r4 = r9[r11]
            if (r4 == 0) goto L9e
            com.anythink.expressad.exoplayer.h.d$a[] r4 = r0.f8334e
            r4 = r4[r11]
            com.anythink.expressad.exoplayer.h.y r4 = r4.f8335a
            if (r4 == r3) goto La7
        L9e:
            com.anythink.expressad.exoplayer.h.d$a[] r4 = r0.f8334e
            com.anythink.expressad.exoplayer.h.d$a r5 = new com.anythink.expressad.exoplayer.h.d$a
            r5.<init>(r3)
            r4[r11] = r5
        La7:
            com.anythink.expressad.exoplayer.h.d$a[] r3 = r0.f8334e
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L86
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.h.d.a(com.anythink.expressad.exoplayer.i.f[], boolean[], com.anythink.expressad.exoplayer.h.y[], boolean[], long):long");
    }

    private com.anythink.expressad.exoplayer.ac b(long j10, com.anythink.expressad.exoplayer.ac acVar) {
        long a10 = com.anythink.expressad.exoplayer.k.af.a(acVar.f, j10 - this.f8331b);
        long j11 = acVar.f7266g;
        long j12 = this.f8332c;
        long a11 = com.anythink.expressad.exoplayer.k.af.a(j11, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (a10 == acVar.f && a11 == acVar.f7266g) ? acVar : new com.anythink.expressad.exoplayer.ac(a10, a11);
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final boolean c(long j10) {
        return this.f8330a.c(j10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(long j10, boolean z10) {
        this.f8330a.a(j10, z10);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long a(long j10, com.anythink.expressad.exoplayer.ac acVar) {
        long j11 = this.f8331b;
        if (j10 == j11) {
            return j11;
        }
        long a10 = com.anythink.expressad.exoplayer.k.af.a(acVar.f, j10 - j11);
        long j12 = acVar.f7266g;
        long j13 = this.f8332c;
        long a11 = com.anythink.expressad.exoplayer.k.af.a(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (a10 != acVar.f || a11 != acVar.f7266g) {
            acVar = new com.anythink.expressad.exoplayer.ac(a10, a11);
        }
        return this.f8330a.a(j10, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.expressad.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f8333d.a((r) this);
    }

    private static boolean a(long j10, com.anythink.expressad.exoplayer.i.f[] fVarArr) {
        if (j10 != 0) {
            for (com.anythink.expressad.exoplayer.i.f fVar : fVarArr) {
                if (fVar != null && !com.anythink.expressad.exoplayer.k.o.a(fVar.h().f9257h)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f8333d.a((r.a) this);
    }
}
