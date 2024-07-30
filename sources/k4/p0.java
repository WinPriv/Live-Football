package k4;

import android.util.Pair;
import j5.u;
import k4.y0;

/* compiled from: MediaPeriodHolder.java */
/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final j5.s f30725a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30726b;

    /* renamed from: c, reason: collision with root package name */
    public final j5.f0[] f30727c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30728d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30729e;
    public q0 f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30730g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30731h;

    /* renamed from: i, reason: collision with root package name */
    public final j1[] f30732i;

    /* renamed from: j, reason: collision with root package name */
    public final b6.m f30733j;

    /* renamed from: k, reason: collision with root package name */
    public final y0 f30734k;

    /* renamed from: l, reason: collision with root package name */
    public p0 f30735l;

    /* renamed from: m, reason: collision with root package name */
    public j5.n0 f30736m;

    /* renamed from: n, reason: collision with root package name */
    public b6.n f30737n;
    public long o;

    public p0(j1[] j1VarArr, long j10, b6.m mVar, c6.b bVar, y0 y0Var, q0 q0Var, b6.n nVar) {
        this.f30732i = j1VarArr;
        this.o = j10;
        this.f30733j = mVar;
        this.f30734k = y0Var;
        u.b bVar2 = q0Var.f30744a;
        this.f30726b = bVar2.f29835a;
        this.f = q0Var;
        this.f30736m = j5.n0.f29811v;
        this.f30737n = nVar;
        this.f30727c = new j5.f0[j1VarArr.length];
        this.f30731h = new boolean[j1VarArr.length];
        long j11 = q0Var.f30747d;
        y0Var.getClass();
        int i10 = a.f30313w;
        Pair pair = (Pair) bVar2.f29835a;
        Object obj = pair.first;
        u.b b10 = bVar2.b(pair.second);
        y0.c cVar = (y0.c) y0Var.f30837d.get(obj);
        cVar.getClass();
        y0Var.f30839g.add(cVar);
        y0.b bVar3 = y0Var.f.get(cVar);
        if (bVar3 != null) {
            bVar3.f30847a.i(bVar3.f30848b);
        }
        cVar.f30852c.add(b10);
        j5.s p10 = cVar.f30850a.p(b10, bVar, q0Var.f30745b);
        y0Var.f30836c.put(p10, cVar);
        y0Var.c();
        this.f30725a = j11 != com.anythink.expressad.exoplayer.b.f7291b ? new j5.d(p10, true, 0L, j11) : p10;
    }

    public final long a(b6.n nVar, long j10, boolean z10, boolean[] zArr) {
        j1[] j1VarArr;
        j5.f0[] f0VarArr;
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= nVar.f3124a) {
                break;
            }
            if (z10 || !nVar.a(this.f30737n, i10)) {
                z12 = false;
            }
            this.f30731h[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            j1VarArr = this.f30732i;
            int length = j1VarArr.length;
            f0VarArr = this.f30727c;
            if (i11 >= length) {
                break;
            }
            if (((e) j1VarArr[i11]).f30404s == -2) {
                f0VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f30737n = nVar;
        c();
        long o = this.f30725a.o(nVar.f3126c, this.f30731h, this.f30727c, zArr, j10);
        for (int i12 = 0; i12 < j1VarArr.length; i12++) {
            if (((e) j1VarArr[i12]).f30404s == -2 && this.f30737n.b(i12)) {
                f0VarArr[i12] = new j5.l();
            }
        }
        this.f30729e = false;
        for (int i13 = 0; i13 < f0VarArr.length; i13++) {
            if (f0VarArr[i13] != null) {
                d6.a.d(nVar.b(i13));
                if (((e) j1VarArr[i13]).f30404s != -2) {
                    this.f30729e = true;
                }
            } else {
                if (nVar.f3126c[i13] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d6.a.d(z11);
            }
        }
        return o;
    }

    public final void b() {
        boolean z10;
        int i10 = 0;
        if (this.f30735l == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        while (true) {
            b6.n nVar = this.f30737n;
            if (i10 < nVar.f3124a) {
                boolean b10 = nVar.b(i10);
                b6.f fVar = this.f30737n.f3126c[i10];
                if (b10 && fVar != null) {
                    fVar.e();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        boolean z10;
        int i10 = 0;
        if (this.f30735l == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        while (true) {
            b6.n nVar = this.f30737n;
            if (i10 < nVar.f3124a) {
                boolean b10 = nVar.b(i10);
                b6.f fVar = this.f30737n.f3126c[i10];
                if (b10 && fVar != null) {
                    fVar.l();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final long d() {
        long j10;
        if (!this.f30728d) {
            return this.f.f30745b;
        }
        if (this.f30729e) {
            j10 = this.f30725a.e();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f.f30748e;
        }
        return j10;
    }

    public final long e() {
        return this.f.f30745b + this.o;
    }

    public final void f() {
        b();
        j5.s sVar = this.f30725a;
        try {
            boolean z10 = sVar instanceof j5.d;
            y0 y0Var = this.f30734k;
            if (z10) {
                y0Var.f(((j5.d) sVar).f29690s);
            } else {
                y0Var.f(sVar);
            }
        } catch (RuntimeException e10) {
            d6.p.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final b6.n g(float f, q1 q1Var) throws m {
        j5.n0 n0Var = this.f30736m;
        u.b bVar = this.f.f30744a;
        b6.n c10 = this.f30733j.c(this.f30732i, n0Var);
        for (b6.f fVar : c10.f3126c) {
            if (fVar != null) {
                fVar.q(f);
            }
        }
        return c10;
    }

    public final void h() {
        j5.s sVar = this.f30725a;
        if (sVar instanceof j5.d) {
            long j10 = this.f.f30747d;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                j10 = Long.MIN_VALUE;
            }
            j5.d dVar = (j5.d) sVar;
            dVar.f29694w = 0L;
            dVar.f29695x = j10;
        }
    }
}
