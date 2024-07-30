package j5;

import j5.e;
import j5.s;
import java.io.IOException;
import k4.i0;
import k4.m1;

/* compiled from: ClippingMediaPeriod.java */
/* loaded from: classes2.dex */
public final class d implements s, s.a {

    /* renamed from: s, reason: collision with root package name */
    public final s f29690s;

    /* renamed from: t, reason: collision with root package name */
    public s.a f29691t;

    /* renamed from: u, reason: collision with root package name */
    public a[] f29692u = new a[0];

    /* renamed from: v, reason: collision with root package name */
    public long f29693v;

    /* renamed from: w, reason: collision with root package name */
    public long f29694w;

    /* renamed from: x, reason: collision with root package name */
    public long f29695x;
    public e.b y;

    /* compiled from: ClippingMediaPeriod.java */
    /* loaded from: classes2.dex */
    public final class a implements f0 {

        /* renamed from: s, reason: collision with root package name */
        public final f0 f29696s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f29697t;

        public a(f0 f0Var) {
            this.f29696s = f0Var;
        }

        @Override // j5.f0
        public final void a() throws IOException {
            this.f29696s.a();
        }

        @Override // j5.f0
        public final int i(long j10) {
            if (d.this.h()) {
                return -3;
            }
            return this.f29696s.i(j10);
        }

        @Override // j5.f0
        public final boolean isReady() {
            if (!d.this.h() && this.f29696s.isReady()) {
                return true;
            }
            return false;
        }

        @Override // j5.f0
        public final int m(j1.a aVar, n4.g gVar, int i10) {
            d dVar = d.this;
            if (dVar.h()) {
                return -3;
            }
            if (this.f29697t) {
                gVar.f33298s = 4;
                return -4;
            }
            int m10 = this.f29696s.m(aVar, gVar, i10);
            if (m10 == -5) {
                k4.i0 i0Var = (k4.i0) aVar.f29569u;
                i0Var.getClass();
                int i11 = i0Var.T;
                int i12 = i0Var.U;
                if (i11 != 0 || i12 != 0) {
                    if (dVar.f29694w != 0) {
                        i11 = 0;
                    }
                    if (dVar.f29695x != Long.MIN_VALUE) {
                        i12 = 0;
                    }
                    i0.a aVar2 = new i0.a(i0Var);
                    aVar2.A = i11;
                    aVar2.B = i12;
                    aVar.f29569u = new k4.i0(aVar2);
                }
                return -5;
            }
            long j10 = dVar.f29695x;
            if (j10 != Long.MIN_VALUE && ((m10 == -4 && gVar.f33324w >= j10) || (m10 == -3 && dVar.e() == Long.MIN_VALUE && !gVar.f33323v))) {
                gVar.h();
                gVar.f33298s = 4;
                this.f29697t = true;
                return -4;
            }
            return m10;
        }
    }

    public d(s sVar, boolean z10, long j10, long j11) {
        long j12;
        this.f29690s = sVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.f29693v = j12;
        this.f29694w = j10;
        this.f29695x = j11;
    }

    @Override // j5.s.a
    public final void a(s sVar) {
        if (this.y != null) {
            return;
        }
        s.a aVar = this.f29691t;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // j5.s, j5.g0
    public final long b() {
        long b10 = this.f29690s.b();
        if (b10 != Long.MIN_VALUE) {
            long j10 = this.f29695x;
            if (j10 == Long.MIN_VALUE || b10 < j10) {
                return b10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // j5.s, j5.g0
    public final boolean c(long j10) {
        return this.f29690s.c(j10);
    }

    @Override // j5.s
    public final long d(long j10, m1 m1Var) {
        long j11;
        long j12 = this.f29694w;
        if (j10 == j12) {
            return j12;
        }
        long i10 = d6.g0.i(m1Var.f30571a, 0L, j10 - j12);
        long j13 = m1Var.f30572b;
        long j14 = this.f29695x;
        if (j14 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j14 - j10;
        }
        long i11 = d6.g0.i(j13, 0L, j11);
        if (i10 != m1Var.f30571a || i11 != m1Var.f30572b) {
            m1Var = new m1(i10, i11);
        }
        return this.f29690s.d(j10, m1Var);
    }

    @Override // j5.s, j5.g0
    public final long e() {
        long e10 = this.f29690s.e();
        if (e10 != Long.MIN_VALUE) {
            long j10 = this.f29695x;
            if (j10 == Long.MIN_VALUE || e10 < j10) {
                return e10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // j5.s, j5.g0
    public final void f(long j10) {
        this.f29690s.f(j10);
    }

    @Override // j5.g0.a
    public final void g(s sVar) {
        s.a aVar = this.f29691t;
        aVar.getClass();
        aVar.g(this);
    }

    public final boolean h() {
        if (this.f29693v != com.anythink.expressad.exoplayer.b.f7291b) {
            return true;
        }
        return false;
    }

    @Override // j5.s, j5.g0
    public final boolean isLoading() {
        return this.f29690s.isLoading();
    }

    @Override // j5.s
    public final void j() throws IOException {
        e.b bVar = this.y;
        if (bVar == null) {
            this.f29690s.j();
            return;
        }
        throw bVar;
    }

    @Override // j5.s
    public final void k(s.a aVar, long j10) {
        this.f29691t = aVar;
        this.f29690s.k(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // j5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f29693v = r0
            j5.d$a[] r0 = r5.f29692u
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f29697t = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            j5.s r0 = r5.f29690s
            long r0 = r0.l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f29694w
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f29695x
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            d6.a.d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.d.l(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r1 > r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // j5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(b6.f[] r16, boolean[] r17, j5.f0[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            j5.d$a[] r1 = new j5.d.a[r1]
            r0.f29692u = r1
            int r1 = r9.length
            j5.f0[] r10 = new j5.f0[r1]
            r11 = 0
            r1 = r11
        Lf:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L24
            j5.d$a[] r2 = r0.f29692u
            r3 = r9[r1]
            j5.d$a r3 = (j5.d.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1f
            j5.f0 r12 = r3.f29696s
        L1f:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Lf
        L24:
            j5.s r1 = r0.f29690s
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.o(r2, r3, r4, r5, r6)
            boolean r3 = r15.h()
            r4 = 1
            if (r3 == 0) goto L66
            long r5 = r0.f29694w
            int r3 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r3 != 0) goto L66
            r13 = 0
            int r3 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r3 == 0) goto L61
            int r3 = r8.length
            r5 = r11
        L48:
            if (r5 >= r3) goto L61
            r6 = r8[r5]
            if (r6 == 0) goto L5e
            k4.i0 r6 = r6.o()
            java.lang.String r7 = r6.D
            java.lang.String r6 = r6.A
            boolean r6 = d6.r.a(r7, r6)
            if (r6 != 0) goto L5e
            r3 = r4
            goto L62
        L5e:
            int r5 = r5 + 1
            goto L48
        L61:
            r3 = r11
        L62:
            if (r3 == 0) goto L66
            r5 = r1
            goto L6b
        L66:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6b:
            r0.f29693v = r5
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 == 0) goto L85
            long r5 = r0.f29694w
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L84
            long r5 = r0.f29695x
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L85
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L84
            goto L85
        L84:
            r4 = r11
        L85:
            d6.a.d(r4)
        L88:
            int r3 = r9.length
            if (r11 >= r3) goto Lae
            r3 = r10[r11]
            if (r3 != 0) goto L94
            j5.d$a[] r3 = r0.f29692u
            r3[r11] = r12
            goto La5
        L94:
            j5.d$a[] r4 = r0.f29692u
            r5 = r4[r11]
            if (r5 == 0) goto L9e
            j5.f0 r5 = r5.f29696s
            if (r5 == r3) goto La5
        L9e:
            j5.d$a r5 = new j5.d$a
            r5.<init>(r3)
            r4[r11] = r5
        La5:
            j5.d$a[] r3 = r0.f29692u
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L88
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.d.o(b6.f[], boolean[], j5.f0[], boolean[], long):long");
    }

    @Override // j5.s
    public final long p() {
        boolean z10;
        if (h()) {
            long j10 = this.f29693v;
            this.f29693v = com.anythink.expressad.exoplayer.b.f7291b;
            long p10 = p();
            if (p10 != com.anythink.expressad.exoplayer.b.f7291b) {
                return p10;
            }
            return j10;
        }
        long p11 = this.f29690s.p();
        if (p11 == com.anythink.expressad.exoplayer.b.f7291b) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        boolean z11 = true;
        if (p11 >= this.f29694w) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        long j11 = this.f29695x;
        if (j11 != Long.MIN_VALUE && p11 > j11) {
            z11 = false;
        }
        d6.a.d(z11);
        return p11;
    }

    @Override // j5.s
    public final n0 r() {
        return this.f29690s.r();
    }

    @Override // j5.s
    public final void t(long j10, boolean z10) {
        this.f29690s.t(j10, z10);
    }
}
