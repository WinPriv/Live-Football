package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d implements n, n.a {

    /* renamed from: a, reason: collision with root package name */
    public final n f15301a;

    /* renamed from: b, reason: collision with root package name */
    long f15302b;

    /* renamed from: c, reason: collision with root package name */
    long f15303c;

    /* renamed from: d, reason: collision with root package name */
    private n.a f15304d;

    /* renamed from: e, reason: collision with root package name */
    private a[] f15305e = new a[0];
    private long f;

    /* loaded from: classes.dex */
    public final class a implements x {

        /* renamed from: a, reason: collision with root package name */
        public final x f15306a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15308c;

        public a(x xVar) {
            this.f15306a = xVar;
        }

        public void a() {
            this.f15308c = false;
        }

        @Override // com.applovin.exoplayer2.h.x
        public boolean b() {
            if (!d.this.g() && this.f15306a.b()) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.h.x
        public void c() throws IOException {
            this.f15306a.c();
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i10) {
            if (d.this.g()) {
                return -3;
            }
            if (this.f15308c) {
                gVar.a_(4);
                return -4;
            }
            int a10 = this.f15306a.a(wVar, gVar, i10);
            if (a10 == -5) {
                com.applovin.exoplayer2.v vVar = (com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(wVar.f16876b);
                int i11 = vVar.B;
                if (i11 != 0 || vVar.C != 0) {
                    d dVar = d.this;
                    if (dVar.f15302b != 0) {
                        i11 = 0;
                    }
                    wVar.f16876b = vVar.a().n(i11).o(dVar.f15303c == Long.MIN_VALUE ? vVar.C : 0).a();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j10 = dVar2.f15303c;
            if (j10 == Long.MIN_VALUE || ((a10 != -4 || gVar.f13647d < j10) && !(a10 == -3 && dVar2.d() == Long.MIN_VALUE && !gVar.f13646c))) {
                return a10;
            }
            gVar.a();
            gVar.a_(4);
            this.f15308c = true;
            return -4;
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(long j10) {
            if (d.this.g()) {
                return -3;
            }
            return this.f15306a.a(j10);
        }
    }

    public d(n nVar, boolean z10, long j10, long j11) {
        long j12;
        this.f15301a = nVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.f = j12;
        this.f15302b = j10;
        this.f15303c = j11;
    }

    @Override // com.applovin.exoplayer2.h.n
    public ad b() {
        return this.f15301a.b();
    }

    @Override // com.applovin.exoplayer2.h.n
    public long c() {
        if (g()) {
            long j10 = this.f;
            this.f = com.anythink.expressad.exoplayer.b.f7291b;
            long c10 = c();
            return c10 != com.anythink.expressad.exoplayer.b.f7291b ? c10 : j10;
        }
        long c11 = this.f15301a.c();
        if (c11 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        boolean z10 = true;
        com.applovin.exoplayer2.l.a.b(c11 >= this.f15302b);
        long j11 = this.f15303c;
        if (j11 != Long.MIN_VALUE && c11 > j11) {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        return c11;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long d() {
        long d10 = this.f15301a.d();
        if (d10 != Long.MIN_VALUE) {
            long j10 = this.f15303c;
            if (j10 == Long.MIN_VALUE || d10 < j10) {
                return d10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long e() {
        long e10 = this.f15301a.e();
        if (e10 != Long.MIN_VALUE) {
            long j10 = this.f15303c;
            if (j10 == Long.MIN_VALUE || e10 < j10) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.exoplayer2.h.n
    public void e_() throws IOException {
        this.f15301a.e_();
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean f() {
        return this.f15301a.f();
    }

    public boolean g() {
        if (this.f != com.anythink.expressad.exoplayer.b.f7291b) {
            return true;
        }
        return false;
    }

    public void a(long j10, long j11) {
        this.f15302b = j10;
        this.f15303c = j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // com.applovin.exoplayer2.h.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f = r0
            com.applovin.exoplayer2.h.d$a[] r0 = r5.f15305e
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
            com.applovin.exoplayer2.h.n r0 = r5.f15301a
            long r0 = r0.b(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f15302b
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f15303c
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.applovin.exoplayer2.l.a.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.d.b(long):long");
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(n.a aVar, long j10) {
        this.f15304d = aVar;
        this.f15301a.a(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // com.applovin.exoplayer2.h.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(com.applovin.exoplayer2.j.d[] r13, boolean[] r14, com.applovin.exoplayer2.h.x[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.applovin.exoplayer2.h.d$a[] r2 = new com.applovin.exoplayer2.h.d.a[r2]
            r0.f15305e = r2
            int r2 = r1.length
            com.applovin.exoplayer2.h.x[] r9 = new com.applovin.exoplayer2.h.x[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            com.applovin.exoplayer2.h.d$a[] r3 = r0.f15305e
            r4 = r1[r2]
            com.applovin.exoplayer2.h.d$a r4 = (com.applovin.exoplayer2.h.d.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            com.applovin.exoplayer2.h.x r11 = r4.f15306a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            com.applovin.exoplayer2.h.n r2 = r0.f15301a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.a(r3, r4, r5, r6, r7)
            boolean r4 = r12.g()
            if (r4 == 0) goto L43
            long r4 = r0.f15302b
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = a(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f15302b
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f15303c
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            com.applovin.exoplayer2.l.a.b(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f15305e
            r4[r10] = r11
            goto L84
        L73:
            com.applovin.exoplayer2.h.d$a[] r5 = r0.f15305e
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            com.applovin.exoplayer2.h.x r6 = r6.f15306a
            if (r6 == r4) goto L84
        L7d:
            com.applovin.exoplayer2.h.d$a r6 = new com.applovin.exoplayer2.h.d$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            com.applovin.exoplayer2.h.d$a[] r4 = r0.f15305e
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.d.a(com.applovin.exoplayer2.j.d[], boolean[], com.applovin.exoplayer2.h.x[], boolean[], long):long");
    }

    @Override // com.applovin.exoplayer2.h.y.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(n nVar) {
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f15304d)).a((n.a) this);
    }

    private av b(long j10, av avVar) {
        long a10 = ai.a(avVar.f, 0L, j10 - this.f15302b);
        long j11 = avVar.f13256g;
        long j12 = this.f15303c;
        long a11 = ai.a(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (a10 == avVar.f && a11 == avVar.f13256g) ? avVar : new av(a10, a11);
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean c(long j10) {
        return this.f15301a.c(j10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10, boolean z10) {
        this.f15301a.a(j10, z10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10) {
        this.f15301a.a(j10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(long j10, av avVar) {
        long j11 = this.f15302b;
        if (j10 == j11) {
            return j11;
        }
        return this.f15301a.a(j10, b(j10, avVar));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.applovin.exoplayer2.h.n.a
    public void a(n nVar) {
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f15304d)).a((n) this);
    }

    private static boolean a(long j10, com.applovin.exoplayer2.j.d[] dVarArr) {
        if (j10 != 0) {
            for (com.applovin.exoplayer2.j.d dVar : dVarArr) {
                if (dVar != null) {
                    com.applovin.exoplayer2.v f = dVar.f();
                    if (!com.applovin.exoplayer2.l.u.a(f.f16838l, f.f16835i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
