package k4;

import b5.q;
import java.io.IOException;
import k4.i0;

/* compiled from: BaseRenderer.java */
/* loaded from: classes2.dex */
public abstract class e implements i1, j1 {
    public long A;
    public boolean C;
    public boolean D;

    /* renamed from: s, reason: collision with root package name */
    public final int f30404s;

    /* renamed from: u, reason: collision with root package name */
    public k1 f30406u;

    /* renamed from: v, reason: collision with root package name */
    public int f30407v;

    /* renamed from: w, reason: collision with root package name */
    public l4.w f30408w;

    /* renamed from: x, reason: collision with root package name */
    public int f30409x;
    public j5.f0 y;

    /* renamed from: z, reason: collision with root package name */
    public i0[] f30410z;

    /* renamed from: t, reason: collision with root package name */
    public final j1.a f30405t = new j1.a(4, 0);
    public long B = Long.MIN_VALUE;

    public e(int i10) {
        this.f30404s = i10;
    }

    public abstract void A();

    public abstract void C(long j10, boolean z10) throws m;

    public abstract void G(i0[] i0VarArr, long j10, long j11) throws m;

    public final int H(j1.a aVar, n4.g gVar, int i10) {
        j5.f0 f0Var = this.y;
        f0Var.getClass();
        int m10 = f0Var.m(aVar, gVar, i10);
        if (m10 == -4) {
            if (gVar.f(4)) {
                this.B = Long.MIN_VALUE;
                if (this.C) {
                    return -4;
                }
                return -3;
            }
            long j10 = gVar.f33324w + this.A;
            gVar.f33324w = j10;
            this.B = Math.max(this.B, j10);
        } else if (m10 == -5) {
            i0 i0Var = (i0) aVar.f29569u;
            i0Var.getClass();
            long j11 = i0Var.H;
            if (j11 != Long.MAX_VALUE) {
                i0.a aVar2 = new i0.a(i0Var);
                aVar2.o = j11 + this.A;
                aVar.f29569u = new i0(aVar2);
            }
        }
        return m10;
    }

    @Override // k4.i1
    public final void e() {
        boolean z10 = true;
        if (this.f30409x != 1) {
            z10 = false;
        }
        d6.a.d(z10);
        this.f30405t.n();
        this.f30409x = 0;
        this.y = null;
        this.f30410z = null;
        this.C = false;
        A();
    }

    @Override // k4.i1
    public final boolean f() {
        if (this.B == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // k4.i1
    public final void g() {
        this.C = true;
    }

    @Override // k4.i1
    public final int getState() {
        return this.f30409x;
    }

    @Override // k4.i1
    public final void h(i0[] i0VarArr, j5.f0 f0Var, long j10, long j11) throws m {
        d6.a.d(!this.C);
        this.y = f0Var;
        if (this.B == Long.MIN_VALUE) {
            this.B = j10;
        }
        this.f30410z = i0VarArr;
        this.A = j11;
        G(i0VarArr, j10, j11);
    }

    @Override // k4.i1
    public final void i(int i10, l4.w wVar) {
        this.f30407v = i10;
        this.f30408w = wVar;
    }

    public int n() throws m {
        return 0;
    }

    @Override // k4.i1
    public final j5.f0 q() {
        return this.y;
    }

    @Override // k4.i1
    public final void r(k1 k1Var, i0[] i0VarArr, j5.f0 f0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws m {
        boolean z12;
        if (this.f30409x == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        d6.a.d(z12);
        this.f30406u = k1Var;
        this.f30409x = 1;
        B(z10, z11);
        h(i0VarArr, f0Var, j11, j12);
        this.C = false;
        this.B = j10;
        C(j10, z10);
    }

    @Override // k4.i1
    public final void reset() {
        boolean z10;
        if (this.f30409x == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        this.f30405t.n();
        D();
    }

    @Override // k4.i1
    public final void s() throws IOException {
        j5.f0 f0Var = this.y;
        f0Var.getClass();
        f0Var.a();
    }

    @Override // k4.i1
    public final void start() throws m {
        boolean z10 = true;
        if (this.f30409x != 1) {
            z10 = false;
        }
        d6.a.d(z10);
        this.f30409x = 2;
        E();
    }

    @Override // k4.i1
    public final void stop() {
        boolean z10;
        if (this.f30409x == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        this.f30409x = 1;
        F();
    }

    @Override // k4.i1
    public final long t() {
        return this.B;
    }

    @Override // k4.i1
    public final void u(long j10) throws m {
        this.C = false;
        this.B = j10;
        C(j10, false);
    }

    @Override // k4.i1
    public final boolean v() {
        return this.C;
    }

    @Override // k4.i1
    public d6.q w() {
        return null;
    }

    @Override // k4.i1
    public final int x() {
        return this.f30404s;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k4.m y(int r13, k4.i0 r14, java.lang.Exception r15, boolean r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.D
            if (r3 != 0) goto L1d
            r3 = 1
            r1.D = r3
            r3 = 0
            int r4 = r12.c(r14)     // Catch: java.lang.Throwable -> L16 k4.m -> L1b
            r4 = r4 & 7
            r1.D = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.D = r3
            throw r2
        L1b:
            r1.D = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.getName()
            int r7 = r1.f30407v
            k4.m r11 = new k4.m
            r3 = 1
            if (r0 != 0) goto L2b
            r9 = r2
            goto L2c
        L2b:
            r9 = r4
        L2c:
            r2 = r11
            r4 = r15
            r5 = r13
            r8 = r14
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.e.y(int, k4.i0, java.lang.Exception, boolean):k4.m");
    }

    public final m z(q.b bVar, i0 i0Var) {
        return y(4002, i0Var, bVar, false);
    }

    public void D() {
    }

    public void E() throws m {
    }

    public void F() {
    }

    @Override // k4.i1
    public final e j() {
        return this;
    }

    public void B(boolean z10, boolean z11) throws m {
    }

    @Override // k4.f1.b
    public void p(int i10, Object obj) throws m {
    }
}
