package k4;

import android.util.Pair;
import j5.u;
import j7.j0;
import k4.q1;

/* compiled from: MediaPeriodQueue.java */
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final q1.b f30767a = new q1.b();

    /* renamed from: b, reason: collision with root package name */
    public final q1.c f30768b = new q1.c();

    /* renamed from: c, reason: collision with root package name */
    public final l4.a f30769c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.m f30770d;

    /* renamed from: e, reason: collision with root package name */
    public long f30771e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30772g;

    /* renamed from: h, reason: collision with root package name */
    public p0 f30773h;

    /* renamed from: i, reason: collision with root package name */
    public p0 f30774i;

    /* renamed from: j, reason: collision with root package name */
    public p0 f30775j;

    /* renamed from: k, reason: collision with root package name */
    public int f30776k;

    /* renamed from: l, reason: collision with root package name */
    public Object f30777l;

    /* renamed from: m, reason: collision with root package name */
    public long f30778m;

    public r0(l4.a aVar, d6.m mVar) {
        this.f30769c = aVar;
        this.f30770d = mVar;
    }

    public static u.b l(q1 q1Var, Object obj, long j10, long j11, q1.c cVar, q1.b bVar) {
        q1Var.g(obj, bVar);
        q1Var.m(bVar.f30756u, cVar);
        int b10 = q1Var.b(obj);
        Object obj2 = obj;
        while (bVar.f30757v == 0) {
            k5.a aVar = bVar.y;
            if (aVar.f30861t <= 0 || !bVar.g(aVar.f30864w) || bVar.c(0L) != -1) {
                break;
            }
            int i10 = b10 + 1;
            if (b10 >= cVar.H) {
                break;
            }
            q1Var.f(i10, bVar, true);
            obj2 = bVar.f30755t;
            obj2.getClass();
            b10 = i10;
        }
        q1Var.g(obj2, bVar);
        int c10 = bVar.c(j10);
        if (c10 == -1) {
            return new u.b(obj2, j11, bVar.b(j10));
        }
        return new u.b(obj2, c10, bVar.f(c10), j11);
    }

    public final p0 a() {
        p0 p0Var = this.f30773h;
        if (p0Var == null) {
            return null;
        }
        if (p0Var == this.f30774i) {
            this.f30774i = p0Var.f30735l;
        }
        p0Var.f();
        int i10 = this.f30776k - 1;
        this.f30776k = i10;
        if (i10 == 0) {
            this.f30775j = null;
            p0 p0Var2 = this.f30773h;
            this.f30777l = p0Var2.f30726b;
            this.f30778m = p0Var2.f.f30744a.f29838d;
        }
        this.f30773h = this.f30773h.f30735l;
        j();
        return this.f30773h;
    }

    public final void b() {
        if (this.f30776k == 0) {
            return;
        }
        p0 p0Var = this.f30773h;
        d6.a.e(p0Var);
        this.f30777l = p0Var.f30726b;
        this.f30778m = p0Var.f.f30744a.f29838d;
        while (p0Var != null) {
            p0Var.f();
            p0Var = p0Var.f30735l;
        }
        this.f30773h = null;
        this.f30775j = null;
        this.f30774i = null;
        this.f30776k = 0;
        j();
    }

    public final q0 c(q1 q1Var, p0 p0Var, long j10) {
        boolean z10;
        long j11;
        Object obj;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        q0 q0Var = p0Var.f;
        long j18 = (p0Var.o + q0Var.f30748e) - j10;
        boolean z11 = q0Var.f30749g;
        q1.b bVar = this.f30767a;
        long j19 = q0Var.f30746c;
        u.b bVar2 = q0Var.f30744a;
        if (z11) {
            boolean z12 = true;
            int d10 = q1Var.d(q1Var.b(bVar2.f29835a), this.f30767a, this.f30768b, this.f, this.f30772g);
            if (d10 == -1) {
                return null;
            }
            int i10 = q1Var.f(d10, bVar, true).f30756u;
            Object obj2 = bVar.f30755t;
            obj2.getClass();
            if (q1Var.m(i10, this.f30768b).G == d10) {
                Pair<Object, Long> j20 = q1Var.j(this.f30768b, this.f30767a, i10, com.anythink.expressad.exoplayer.b.f7291b, Math.max(0L, j18));
                if (j20 == null) {
                    return null;
                }
                obj2 = j20.first;
                long longValue = ((Long) j20.second).longValue();
                p0 p0Var2 = p0Var.f30735l;
                if (p0Var2 != null && p0Var2.f30726b.equals(obj2)) {
                    j13 = p0Var2.f.f30744a.f29838d;
                } else {
                    j13 = this.f30771e;
                    this.f30771e = 1 + j13;
                }
                j14 = longValue;
                j15 = com.anythink.expressad.exoplayer.b.f7291b;
            } else {
                j13 = bVar2.f29838d;
                j14 = 0;
                j15 = 0;
            }
            u.b l10 = l(q1Var, obj2, j14, j13, this.f30768b, this.f30767a);
            if (j15 != com.anythink.expressad.exoplayer.b.f7291b && j19 != com.anythink.expressad.exoplayer.b.f7291b) {
                if (q1Var.g(bVar2.f29835a, bVar).y.f30861t <= 0 || !bVar.g(bVar.y.f30864w)) {
                    z12 = false;
                }
                if (l10.a() && z12) {
                    j17 = j19;
                    j16 = j14;
                    return d(q1Var, l10, j17, j16);
                }
                if (z12) {
                    j16 = j19;
                    j17 = j15;
                    return d(q1Var, l10, j17, j16);
                }
            }
            j16 = j14;
            j17 = j15;
            return d(q1Var, l10, j17, j16);
        }
        q1Var.g(bVar2.f29835a, bVar);
        boolean a10 = bVar2.a();
        Object obj3 = bVar2.f29835a;
        if (a10) {
            int i11 = bVar2.f29836b;
            int i12 = bVar.y.a(i11).f30867t;
            if (i12 == -1) {
                return null;
            }
            int a11 = bVar.y.a(i11).a(bVar2.f29837c);
            if (a11 < i12) {
                return e(q1Var, bVar2.f29835a, i11, a11, q0Var.f30746c, bVar2.f29838d);
            }
            if (j19 == com.anythink.expressad.exoplayer.b.f7291b) {
                obj = obj3;
                Pair<Object, Long> j21 = q1Var.j(this.f30768b, bVar, bVar.f30756u, com.anythink.expressad.exoplayer.b.f7291b, Math.max(0L, j18));
                if (j21 == null) {
                    return null;
                }
                j19 = ((Long) j21.second).longValue();
            } else {
                obj = obj3;
            }
            q1Var.g(obj, bVar);
            int i13 = bVar2.f29836b;
            long d11 = bVar.d(i13);
            if (d11 == Long.MIN_VALUE) {
                j12 = bVar.f30757v;
            } else {
                j12 = d11 + bVar.y.a(i13).y;
            }
            return f(q1Var, bVar2.f29835a, Math.max(j12, j19), q0Var.f30746c, bVar2.f29838d);
        }
        int i14 = bVar2.f29839e;
        int f = bVar.f(i14);
        if (bVar.g(i14) && bVar.e(i14, f) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f != bVar.y.a(i14).f30867t && !z10) {
            return e(q1Var, bVar2.f29835a, bVar2.f29839e, f, q0Var.f30748e, bVar2.f29838d);
        }
        q1Var.g(obj3, bVar);
        long d12 = bVar.d(i14);
        if (d12 == Long.MIN_VALUE) {
            j11 = bVar.f30757v;
        } else {
            j11 = d12 + bVar.y.a(i14).y;
        }
        return f(q1Var, bVar2.f29835a, j11, q0Var.f30748e, bVar2.f29838d);
    }

    public final q0 d(q1 q1Var, u.b bVar, long j10, long j11) {
        q1Var.g(bVar.f29835a, this.f30767a);
        if (bVar.a()) {
            return e(q1Var, bVar.f29835a, bVar.f29836b, bVar.f29837c, j10, bVar.f29838d);
        }
        return f(q1Var, bVar.f29835a, j11, j10, bVar.f29838d);
    }

    public final q0 e(q1 q1Var, Object obj, int i10, int i11, long j10, long j11) {
        long j12;
        long j13;
        u.b bVar = new u.b(obj, i10, i11, j11);
        q1.b bVar2 = this.f30767a;
        long a10 = q1Var.g(obj, bVar2).a(i10, i11);
        if (i11 == bVar2.f(i10)) {
            j12 = bVar2.y.f30862u;
        } else {
            j12 = 0;
        }
        boolean g6 = bVar2.g(i10);
        if (a10 != com.anythink.expressad.exoplayer.b.f7291b && j12 >= a10) {
            j13 = Math.max(0L, a10 - 1);
        } else {
            j13 = j12;
        }
        return new q0(bVar, j13, j10, com.anythink.expressad.exoplayer.b.f7291b, a10, g6, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r5.g(r10.f30864w) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k4.q0 f(k4.q1 r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.r0.f(k4.q1, java.lang.Object, long, long, long):k4.q0");
    }

    public final q0 g(q1 q1Var, q0 q0Var) {
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        u.b bVar = q0Var.f30744a;
        if (!bVar.a() && bVar.f29839e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean i10 = i(q1Var, bVar);
        boolean h10 = h(q1Var, bVar, z10);
        Object obj = q0Var.f30744a.f29835a;
        q1.b bVar2 = this.f30767a;
        q1Var.g(obj, bVar2);
        boolean a10 = bVar.a();
        int i11 = bVar.f29839e;
        if (!a10 && i11 != -1) {
            j10 = bVar2.d(i11);
        } else {
            j10 = -9223372036854775807L;
        }
        boolean a11 = bVar.a();
        int i12 = bVar.f29836b;
        if (a11) {
            j11 = bVar2.a(i12, bVar.f29837c);
        } else if (j10 != com.anythink.expressad.exoplayer.b.f7291b && j10 != Long.MIN_VALUE) {
            j11 = j10;
        } else {
            j11 = bVar2.f30757v;
        }
        if (bVar.a()) {
            z11 = bVar2.g(i12);
        } else if (i11 != -1 && bVar2.g(i11)) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new q0(bVar, q0Var.f30745b, q0Var.f30746c, j10, j11, z11, z10, i10, h10);
    }

    public final boolean h(q1 q1Var, u.b bVar, boolean z10) {
        boolean z11;
        int b10 = q1Var.b(bVar.f29835a);
        if (q1Var.m(q1Var.f(b10, this.f30767a, false).f30756u, this.f30768b).A) {
            return false;
        }
        if (q1Var.d(b10, this.f30767a, this.f30768b, this.f, this.f30772g) == -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 || !z10) {
            return false;
        }
        return true;
    }

    public final boolean i(q1 q1Var, u.b bVar) {
        boolean z10;
        if (!bVar.a() && bVar.f29839e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Object obj = bVar.f29835a;
        if (q1Var.m(q1Var.g(obj, this.f30767a).f30756u, this.f30768b).H == q1Var.b(obj)) {
            return true;
        }
        return false;
    }

    public final void j() {
        u.b bVar;
        j0.b bVar2 = j7.j0.f30006t;
        j0.a aVar = new j0.a();
        for (p0 p0Var = this.f30773h; p0Var != null; p0Var = p0Var.f30735l) {
            aVar.b(p0Var.f.f30744a);
        }
        p0 p0Var2 = this.f30774i;
        if (p0Var2 == null) {
            bVar = null;
        } else {
            bVar = p0Var2.f.f30744a;
        }
        this.f30770d.c(new com.applovin.exoplayer2.h.f0(this, aVar, bVar, 1));
    }

    public final boolean k(p0 p0Var) {
        boolean z10;
        boolean z11 = false;
        if (p0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        if (p0Var.equals(this.f30775j)) {
            return false;
        }
        this.f30775j = p0Var;
        while (true) {
            p0Var = p0Var.f30735l;
            if (p0Var == null) {
                break;
            }
            if (p0Var == this.f30774i) {
                this.f30774i = this.f30773h;
                z11 = true;
            }
            p0Var.f();
            this.f30776k--;
        }
        p0 p0Var2 = this.f30775j;
        if (p0Var2.f30735l != null) {
            p0Var2.b();
            p0Var2.f30735l = null;
            p0Var2.c();
        }
        j();
        return z11;
    }

    public final u.b m(q1 q1Var, Object obj, long j10) {
        long j11;
        int b10;
        Object obj2 = obj;
        q1.b bVar = this.f30767a;
        int i10 = q1Var.g(obj2, bVar).f30756u;
        Object obj3 = this.f30777l;
        if (obj3 != null && (b10 = q1Var.b(obj3)) != -1 && q1Var.f(b10, bVar, false).f30756u == i10) {
            j11 = this.f30778m;
        } else {
            p0 p0Var = this.f30773h;
            while (true) {
                if (p0Var != null) {
                    if (p0Var.f30726b.equals(obj2)) {
                        j11 = p0Var.f.f30744a.f29838d;
                        break;
                    }
                    p0Var = p0Var.f30735l;
                } else {
                    p0 p0Var2 = this.f30773h;
                    while (true) {
                        if (p0Var2 != null) {
                            int b11 = q1Var.b(p0Var2.f30726b);
                            if (b11 != -1 && q1Var.f(b11, bVar, false).f30756u == i10) {
                                j11 = p0Var2.f.f30744a.f29838d;
                                break;
                            }
                            p0Var2 = p0Var2.f30735l;
                        } else {
                            j11 = this.f30771e;
                            this.f30771e = 1 + j11;
                            if (this.f30773h == null) {
                                this.f30777l = obj2;
                                this.f30778m = j11;
                            }
                        }
                    }
                }
            }
        }
        long j12 = j11;
        q1Var.g(obj2, bVar);
        int i11 = bVar.f30756u;
        q1.c cVar = this.f30768b;
        q1Var.m(i11, cVar);
        boolean z10 = false;
        for (int b12 = q1Var.b(obj); b12 >= cVar.G; b12--) {
            boolean z11 = true;
            q1Var.f(b12, bVar, true);
            if (bVar.y.f30861t <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (bVar.c(bVar.f30757v) != -1) {
                obj2 = bVar.f30755t;
                obj2.getClass();
            }
            if (z10 && (!z11 || bVar.f30757v != 0)) {
                break;
            }
        }
        return l(q1Var, obj2, j10, j12, this.f30768b, this.f30767a);
    }

    public final boolean n(q1 q1Var) {
        p0 p0Var;
        p0 p0Var2 = this.f30773h;
        if (p0Var2 == null) {
            return true;
        }
        int b10 = q1Var.b(p0Var2.f30726b);
        while (true) {
            b10 = q1Var.d(b10, this.f30767a, this.f30768b, this.f, this.f30772g);
            while (true) {
                p0Var = p0Var2.f30735l;
                if (p0Var == null || p0Var2.f.f30749g) {
                    break;
                }
                p0Var2 = p0Var;
            }
            if (b10 == -1 || p0Var == null || q1Var.b(p0Var.f30726b) != b10) {
                break;
            }
            p0Var2 = p0Var;
        }
        boolean k10 = k(p0Var2);
        p0Var2.f = g(q1Var, p0Var2.f);
        return !k10;
    }

    public final boolean o(q1 q1Var, long j10, long j11) {
        boolean k10;
        boolean z10;
        q0 q0Var;
        boolean z11;
        long j12;
        boolean z12;
        p0 p0Var = null;
        for (p0 p0Var2 = this.f30773h; p0Var2 != null; p0Var2 = p0Var2.f30735l) {
            q0 q0Var2 = p0Var2.f;
            if (p0Var == null) {
                q0Var = g(q1Var, q0Var2);
            } else {
                q0 c10 = c(q1Var, p0Var, j10);
                if (c10 == null) {
                    k10 = k(p0Var);
                } else {
                    if (q0Var2.f30745b == c10.f30745b && q0Var2.f30744a.equals(c10.f30744a)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        k10 = k(p0Var);
                    } else {
                        q0Var = c10;
                    }
                }
                return !k10;
            }
            p0Var2.f = q0Var.a(q0Var2.f30746c);
            long j13 = q0Var2.f30748e;
            long j14 = q0Var.f30748e;
            if (j13 != com.anythink.expressad.exoplayer.b.f7291b && j13 != j14) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                p0Var2.h();
                if (j14 == com.anythink.expressad.exoplayer.b.f7291b) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = p0Var2.o + j14;
                }
                if (p0Var2 == this.f30774i && !p0Var2.f.f && (j11 == Long.MIN_VALUE || j11 >= j12)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!k(p0Var2) && !z12) {
                    return true;
                }
                return false;
            }
            p0Var = p0Var2;
        }
        return true;
    }
}
