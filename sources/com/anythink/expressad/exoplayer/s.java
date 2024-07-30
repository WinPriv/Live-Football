package com.anythink.expressad.exoplayer;

import android.util.Pair;
import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.h.s;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f9298a = 100;

    /* renamed from: b, reason: collision with root package name */
    private final ae.a f9299b = new ae.a();

    /* renamed from: c, reason: collision with root package name */
    private final ae.b f9300c = new ae.b();

    /* renamed from: d, reason: collision with root package name */
    private long f9301d;

    /* renamed from: e, reason: collision with root package name */
    private ae f9302e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9303g;

    /* renamed from: h, reason: collision with root package name */
    private q f9304h;

    /* renamed from: i, reason: collision with root package name */
    private q f9305i;

    /* renamed from: j, reason: collision with root package name */
    private q f9306j;

    /* renamed from: k, reason: collision with root package name */
    private int f9307k;

    /* renamed from: l, reason: collision with root package name */
    private Object f9308l;

    /* renamed from: m, reason: collision with root package name */
    private long f9309m;

    private boolean i() {
        q qVar;
        q e10 = e();
        if (e10 == null) {
            return true;
        }
        while (true) {
            int a10 = this.f9302e.a(e10.f9285h.f9292a.f8484a, this.f9299b, this.f9300c, this.f, this.f9303g);
            while (true) {
                qVar = e10.f9286i;
                if (qVar == null || e10.f9285h.f) {
                    break;
                }
                e10 = qVar;
            }
            if (a10 == -1 || qVar == null || qVar.f9285h.f9292a.f8484a != a10) {
                break;
            }
            e10 = qVar;
        }
        boolean a11 = a(e10);
        r rVar = e10.f9285h;
        e10.f9285h = a(rVar, rVar.f9292a);
        if (!a11 || !f()) {
            return true;
        }
        return false;
    }

    public final void a(ae aeVar) {
        this.f9302e = aeVar;
    }

    public final q b() {
        return this.f9306j;
    }

    public final q c() {
        return this.f9304h;
    }

    public final q d() {
        return this.f9305i;
    }

    public final q e() {
        if (f()) {
            return this.f9304h;
        }
        return this.f9306j;
    }

    public final boolean f() {
        if (this.f9304h != null) {
            return true;
        }
        return false;
    }

    public final q g() {
        boolean z10;
        q qVar = this.f9305i;
        if (qVar != null && qVar.f9286i != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        q qVar2 = this.f9305i.f9286i;
        this.f9305i = qVar2;
        return qVar2;
    }

    public final q h() {
        q qVar = this.f9304h;
        if (qVar != null) {
            if (qVar == this.f9305i) {
                this.f9305i = qVar.f9286i;
            }
            qVar.c();
            int i10 = this.f9307k - 1;
            this.f9307k = i10;
            if (i10 == 0) {
                this.f9306j = null;
                q qVar2 = this.f9304h;
                this.f9308l = qVar2.f9280b;
                this.f9309m = qVar2.f9285h.f9292a.f8487d;
            }
            this.f9304h = this.f9304h.f9286i;
        } else {
            q qVar3 = this.f9306j;
            this.f9304h = qVar3;
            this.f9305i = qVar3;
        }
        return this.f9304h;
    }

    public final boolean a(int i10) {
        this.f = i10;
        return i();
    }

    public final void b(boolean z10) {
        q e10 = e();
        if (e10 != null) {
            this.f9308l = z10 ? e10.f9280b : null;
            this.f9309m = e10.f9285h.f9292a.f8487d;
            e10.c();
            a(e10);
        } else if (!z10) {
            this.f9308l = null;
        }
        this.f9304h = null;
        this.f9306j = null;
        this.f9305i = null;
        this.f9307k = 0;
    }

    public final boolean a(boolean z10) {
        this.f9303g = z10;
        return i();
    }

    public final boolean a(com.anythink.expressad.exoplayer.h.r rVar) {
        q qVar = this.f9306j;
        return qVar != null && qVar.f9279a == rVar;
    }

    public final void a(long j10) {
        q qVar = this.f9306j;
        if (qVar == null || !qVar.f) {
            return;
        }
        qVar.f9279a.a_(j10 - qVar.f9283e);
    }

    private long b(int i10) {
        int a10;
        Object obj = this.f9302e.a(i10, this.f9299b, true).f7273b;
        int i11 = this.f9299b.f7274c;
        Object obj2 = this.f9308l;
        if (obj2 != null && (a10 = this.f9302e.a(obj2)) != -1 && this.f9302e.a(a10, this.f9299b, false).f7274c == i11) {
            return this.f9309m;
        }
        for (q e10 = e(); e10 != null; e10 = e10.f9286i) {
            if (e10.f9280b.equals(obj)) {
                return e10.f9285h.f9292a.f8487d;
            }
        }
        for (q e11 = e(); e11 != null; e11 = e11.f9286i) {
            int a11 = this.f9302e.a(e11.f9280b);
            if (a11 != -1 && this.f9302e.a(a11, this.f9299b, false).f7274c == i11) {
                return e11.f9285h.f9292a.f8487d;
            }
        }
        long j10 = this.f9301d;
        this.f9301d = 1 + j10;
        return j10;
    }

    public final boolean a() {
        q qVar = this.f9306j;
        if (qVar != null) {
            return !qVar.f9285h.f9297g && qVar.a() && this.f9306j.f9285h.f9296e != b.f7291b && this.f9307k < 100;
        }
        return true;
    }

    public final r a(long j10, u uVar) {
        q qVar = this.f9306j;
        if (qVar == null) {
            return a(uVar.f9337c, uVar.f9339e, uVar.f9338d);
        }
        return a(qVar, j10);
    }

    public final com.anythink.expressad.exoplayer.h.r a(z[] zVarArr, com.anythink.expressad.exoplayer.i.h hVar, com.anythink.expressad.exoplayer.j.b bVar, com.anythink.expressad.exoplayer.h.s sVar, Object obj, r rVar) {
        long j10;
        q qVar = this.f9306j;
        if (qVar == null) {
            j10 = rVar.f9293b;
        } else {
            j10 = qVar.f9283e + qVar.f9285h.f9296e;
        }
        q qVar2 = new q(zVarArr, j10, hVar, bVar, sVar, obj, rVar);
        if (this.f9306j != null) {
            com.anythink.expressad.exoplayer.k.a.b(f());
            this.f9306j.f9286i = qVar2;
        }
        this.f9308l = null;
        this.f9306j = qVar2;
        this.f9307k++;
        return qVar2.f9279a;
    }

    public final boolean a(q qVar) {
        boolean z10 = false;
        com.anythink.expressad.exoplayer.k.a.b(qVar != null);
        this.f9306j = qVar;
        while (true) {
            qVar = qVar.f9286i;
            if (qVar != null) {
                if (qVar == this.f9305i) {
                    this.f9305i = this.f9304h;
                    z10 = true;
                }
                qVar.c();
                this.f9307k--;
            } else {
                this.f9306j.f9286i = null;
                return z10;
            }
        }
    }

    private r b(int i10, long j10, long j11) {
        s.a aVar = new s.a(i10, j11);
        this.f9302e.a(aVar.f8484a, this.f9299b, false);
        int b10 = this.f9299b.b(j10);
        long a10 = b10 == -1 ? Long.MIN_VALUE : this.f9299b.a(b10);
        boolean b11 = b(aVar, a10);
        return new r(aVar, j10, a10, b.f7291b, a10 == Long.MIN_VALUE ? this.f9299b.f7275d : a10, b11, a(aVar, b11));
    }

    public final boolean a(s.a aVar, long j10) {
        int i10 = aVar.f8484a;
        q qVar = null;
        int i11 = i10;
        for (q e10 = e(); e10 != null; e10 = e10.f9286i) {
            if (qVar == null) {
                e10.f9285h = a(e10.f9285h, i11);
            } else {
                if (i11 == -1 || !e10.f9280b.equals(this.f9302e.a(i11, this.f9299b, true).f7273b)) {
                    return !a(qVar);
                }
                r a10 = a(qVar, j10);
                if (a10 == null) {
                    return !a(qVar);
                }
                r a11 = a(e10.f9285h, i11);
                e10.f9285h = a11;
                if (!(a11.f9293b == a10.f9293b && a11.f9294c == a10.f9294c && a11.f9292a.equals(a10.f9292a))) {
                    return !a(qVar);
                }
            }
            if (e10.f9285h.f) {
                i11 = this.f9302e.a(i11, this.f9299b, this.f9300c, this.f, this.f9303g);
            }
            qVar = e10;
        }
        return true;
    }

    private boolean b(s.a aVar, long j10) {
        int c10 = this.f9302e.a(aVar.f8484a, this.f9299b, false).c();
        if (c10 == 0) {
            return true;
        }
        int i10 = c10 - 1;
        boolean a10 = aVar.a();
        if (this.f9299b.a(i10) != Long.MIN_VALUE) {
            return !a10 && j10 == Long.MIN_VALUE;
        }
        int d10 = this.f9299b.d(i10);
        if (d10 == -1) {
            return false;
        }
        return (a10 && aVar.f8485b == i10 && aVar.f8486c == d10 + (-1)) || (!a10 && this.f9299b.b(i10) == d10);
    }

    public final r a(r rVar, int i10) {
        return a(rVar, rVar.f9292a.a(i10));
    }

    private s.a a(int i10, long j10, long j11) {
        this.f9302e.a(i10, this.f9299b, false);
        int a10 = this.f9299b.a(j10);
        if (a10 == -1) {
            return new s.a(i10, j11);
        }
        return new s.a(i10, a10, this.f9299b.b(a10), j11);
    }

    private static boolean a(q qVar, r rVar) {
        r rVar2 = qVar.f9285h;
        return rVar2.f9293b == rVar.f9293b && rVar2.f9294c == rVar.f9294c && rVar2.f9292a.equals(rVar.f9292a);
    }

    private r a(u uVar) {
        return a(uVar.f9337c, uVar.f9339e, uVar.f9338d);
    }

    private r a(q qVar, long j10) {
        int i10;
        long j11;
        long j12;
        r rVar = qVar.f9285h;
        if (rVar.f) {
            int a10 = this.f9302e.a(rVar.f9292a.f8484a, this.f9299b, this.f9300c, this.f, this.f9303g);
            if (a10 == -1) {
                return null;
            }
            int i11 = this.f9302e.a(a10, this.f9299b, true).f7274c;
            Object obj = this.f9299b.f7273b;
            long j13 = rVar.f9292a.f8487d;
            long j14 = 0;
            if (this.f9302e.a(i11, this.f9300c, false).f == a10) {
                Pair<Integer, Long> a11 = this.f9302e.a(this.f9300c, this.f9299b, i11, b.f7291b, Math.max(0L, (qVar.f9283e + rVar.f9296e) - j10));
                if (a11 == null) {
                    return null;
                }
                int intValue = ((Integer) a11.first).intValue();
                long longValue = ((Long) a11.second).longValue();
                q qVar2 = qVar.f9286i;
                if (qVar2 != null && qVar2.f9280b.equals(obj)) {
                    j12 = qVar.f9286i.f9285h.f9292a.f8487d;
                } else {
                    j12 = this.f9301d;
                    this.f9301d = 1 + j12;
                }
                j14 = longValue;
                j11 = j12;
                i10 = intValue;
            } else {
                i10 = a10;
                j11 = j13;
            }
            long j15 = j14;
            return a(a(i10, j15, j11), j15, j14);
        }
        s.a aVar = rVar.f9292a;
        this.f9302e.a(aVar.f8484a, this.f9299b, false);
        if (aVar.a()) {
            int i12 = aVar.f8485b;
            int d10 = this.f9299b.d(i12);
            if (d10 == -1) {
                return null;
            }
            int a12 = this.f9299b.a(i12, aVar.f8486c);
            if (a12 < d10) {
                if (this.f9299b.b(i12, a12)) {
                    return a(aVar.f8484a, i12, a12, rVar.f9295d, aVar.f8487d);
                }
                return null;
            }
            return b(aVar.f8484a, rVar.f9295d, aVar.f8487d);
        }
        long j16 = rVar.f9294c;
        if (j16 != Long.MIN_VALUE) {
            int a13 = this.f9299b.a(j16);
            if (a13 == -1) {
                return b(aVar.f8484a, rVar.f9294c, aVar.f8487d);
            }
            int b10 = this.f9299b.b(a13);
            if (this.f9299b.b(a13, b10)) {
                return a(aVar.f8484a, a13, b10, rVar.f9294c, aVar.f8487d);
            }
            return null;
        }
        int c10 = this.f9299b.c();
        if (c10 == 0) {
            return null;
        }
        int i13 = c10 - 1;
        if (this.f9299b.a(i13) != Long.MIN_VALUE || this.f9299b.c(i13)) {
            return null;
        }
        int b11 = this.f9299b.b(i13);
        if (!this.f9299b.b(i13, b11)) {
            return null;
        }
        return a(aVar.f8484a, i13, b11, this.f9299b.f7275d, aVar.f8487d);
    }

    private r a(r rVar, s.a aVar) {
        long j10;
        long j11;
        long j12 = rVar.f9293b;
        long j13 = rVar.f9294c;
        boolean b10 = b(aVar, j13);
        boolean a10 = a(aVar, b10);
        this.f9302e.a(aVar.f8484a, this.f9299b, false);
        if (aVar.a()) {
            j11 = this.f9299b.c(aVar.f8485b, aVar.f8486c);
        } else if (j13 == Long.MIN_VALUE) {
            j11 = this.f9299b.f7275d;
        } else {
            j10 = j13;
            return new r(aVar, j12, j13, rVar.f9295d, j10, b10, a10);
        }
        j10 = j11;
        return new r(aVar, j12, j13, rVar.f9295d, j10, b10, a10);
    }

    private r a(s.a aVar, long j10, long j11) {
        this.f9302e.a(aVar.f8484a, this.f9299b, false);
        if (aVar.a()) {
            if (this.f9299b.b(aVar.f8485b, aVar.f8486c)) {
                return a(aVar.f8484a, aVar.f8485b, aVar.f8486c, j10, aVar.f8487d);
            }
            return null;
        }
        return b(aVar.f8484a, j11, aVar.f8487d);
    }

    private r a(int i10, int i11, int i12, long j10, long j11) {
        s.a aVar = new s.a(i10, i11, i12, j11);
        boolean b10 = b(aVar, Long.MIN_VALUE);
        boolean a10 = a(aVar, b10);
        return new r(aVar, i12 == this.f9299b.b(i11) ? this.f9299b.d() : 0L, Long.MIN_VALUE, j10, this.f9302e.a(aVar.f8484a, this.f9299b, false).c(aVar.f8485b, aVar.f8486c), b10, a10);
    }

    private boolean a(s.a aVar, boolean z10) {
        return !this.f9302e.a(this.f9302e.a(aVar.f8484a, this.f9299b, false).f7274c, this.f9300c, false).f7281e && this.f9302e.b(aVar.f8484a, this.f9299b, this.f9300c, this.f, this.f9303g) && z10;
    }

    public final s.a a(int i10, long j10) {
        long j11;
        int a10;
        Object obj = this.f9302e.a(i10, this.f9299b, true).f7273b;
        int i11 = this.f9299b.f7274c;
        Object obj2 = this.f9308l;
        if (obj2 != null && (a10 = this.f9302e.a(obj2)) != -1 && this.f9302e.a(a10, this.f9299b, false).f7274c == i11) {
            j11 = this.f9309m;
        } else {
            q e10 = e();
            while (true) {
                if (e10 != null) {
                    if (e10.f9280b.equals(obj)) {
                        j11 = e10.f9285h.f9292a.f8487d;
                        break;
                    }
                    e10 = e10.f9286i;
                } else {
                    q e11 = e();
                    while (true) {
                        if (e11 != null) {
                            int a11 = this.f9302e.a(e11.f9280b);
                            if (a11 != -1 && this.f9302e.a(a11, this.f9299b, false).f7274c == i11) {
                                j11 = e11.f9285h.f9292a.f8487d;
                                break;
                            }
                            e11 = e11.f9286i;
                        } else {
                            j11 = this.f9301d;
                            this.f9301d = 1 + j11;
                            break;
                        }
                    }
                }
            }
        }
        return a(i10, j10, j11);
    }
}
