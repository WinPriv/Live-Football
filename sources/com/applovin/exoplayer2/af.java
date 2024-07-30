package com.applovin.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    private final ba.a f13150a = new ba.a();

    /* renamed from: b, reason: collision with root package name */
    private final ba.c f13151b = new ba.c();

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.a.a f13152c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f13153d;

    /* renamed from: e, reason: collision with root package name */
    private long f13154e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13155g;

    /* renamed from: h, reason: collision with root package name */
    private ad f13156h;

    /* renamed from: i, reason: collision with root package name */
    private ad f13157i;

    /* renamed from: j, reason: collision with root package name */
    private ad f13158j;

    /* renamed from: k, reason: collision with root package name */
    private int f13159k;

    /* renamed from: l, reason: collision with root package name */
    private Object f13160l;

    /* renamed from: m, reason: collision with root package name */
    private long f13161m;

    public af(com.applovin.exoplayer2.a.a aVar, Handler handler) {
        this.f13152c = aVar;
        this.f13153d = handler;
    }

    private void h() {
        final p.a aVar;
        if (this.f13152c != null) {
            final s.a i10 = com.applovin.exoplayer2.common.a.s.i();
            for (ad adVar = this.f13156h; adVar != null; adVar = adVar.g()) {
                i10.a(adVar.f.f13142a);
            }
            ad adVar2 = this.f13157i;
            if (adVar2 == null) {
                aVar = null;
            } else {
                aVar = adVar2.f.f13142a;
            }
            this.f13153d.post(new Runnable() { // from class: com.applovin.exoplayer2.c0
                @Override // java.lang.Runnable
                public final void run() {
                    af.this.a(i10, aVar);
                }
            });
        }
    }

    public ad b() {
        return this.f13158j;
    }

    public ad c() {
        return this.f13156h;
    }

    public ad d() {
        return this.f13157i;
    }

    public ad e() {
        boolean z10;
        ad adVar = this.f13157i;
        if (adVar != null && adVar.g() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        this.f13157i = this.f13157i.g();
        h();
        return this.f13157i;
    }

    public ad f() {
        ad adVar = this.f13156h;
        if (adVar == null) {
            return null;
        }
        if (adVar == this.f13157i) {
            this.f13157i = adVar.g();
        }
        this.f13156h.f();
        int i10 = this.f13159k - 1;
        this.f13159k = i10;
        if (i10 == 0) {
            this.f13158j = null;
            ad adVar2 = this.f13156h;
            this.f13160l = adVar2.f13130b;
            this.f13161m = adVar2.f.f13142a.f15392d;
        }
        this.f13156h = this.f13156h.g();
        h();
        return this.f13156h;
    }

    public void g() {
        if (this.f13159k == 0) {
            return;
        }
        ad adVar = (ad) com.applovin.exoplayer2.l.a.a(this.f13156h);
        this.f13160l = adVar.f13130b;
        this.f13161m = adVar.f.f13142a.f15392d;
        while (adVar != null) {
            adVar.f();
            adVar = adVar.g();
        }
        this.f13156h = null;
        this.f13158j = null;
        this.f13157i = null;
        this.f13159k = 0;
        h();
    }

    private boolean a(long j10, long j11) {
        return j10 == com.anythink.expressad.exoplayer.b.f7291b || j10 == j11;
    }

    public boolean a(ba baVar, int i10) {
        this.f = i10;
        return a(baVar);
    }

    public boolean a(ba baVar, boolean z10) {
        this.f13155g = z10;
        return a(baVar);
    }

    public boolean a(com.applovin.exoplayer2.h.n nVar) {
        ad adVar = this.f13158j;
        return adVar != null && adVar.f13129a == nVar;
    }

    public void a(long j10) {
        ad adVar = this.f13158j;
        if (adVar != null) {
            adVar.d(j10);
        }
    }

    public boolean a() {
        ad adVar = this.f13158j;
        return adVar == null || (!adVar.f.f13149i && adVar.c() && this.f13158j.f.f13146e != com.anythink.expressad.exoplayer.b.f7291b && this.f13159k < 100);
    }

    public ae a(long j10, al alVar) {
        ad adVar = this.f13158j;
        if (adVar == null) {
            return a(alVar);
        }
        return a(alVar.f13192a, adVar, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 != com.anythink.expressad.exoplayer.b.f7291b) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.exoplayer2.ad a(com.applovin.exoplayer2.as[] r12, com.applovin.exoplayer2.j.j r13, com.applovin.exoplayer2.k.b r14, com.applovin.exoplayer2.ah r15, com.applovin.exoplayer2.ae r16, com.applovin.exoplayer2.j.k r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            com.applovin.exoplayer2.ad r1 = r0.f13158j
            if (r1 != 0) goto L1e
            com.applovin.exoplayer2.h.p$a r1 = r8.f13142a
            boolean r1 = r1.a()
            if (r1 == 0) goto L1b
            long r1 = r8.f13144c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L1b
            goto L2c
        L1b:
            r1 = 0
            goto L2c
        L1e:
            long r1 = r1.a()
            com.applovin.exoplayer2.ad r3 = r0.f13158j
            com.applovin.exoplayer2.ae r3 = r3.f
            long r3 = r3.f13146e
            long r1 = r1 + r3
            long r3 = r8.f13143b
            long r1 = r1 - r3
        L2c:
            r3 = r1
            com.applovin.exoplayer2.ad r10 = new com.applovin.exoplayer2.ad
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            com.applovin.exoplayer2.ad r1 = r0.f13158j
            if (r1 == 0) goto L43
            r1.a(r10)
            goto L47
        L43:
            r0.f13156h = r10
            r0.f13157i = r10
        L47:
            r1 = 0
            r0.f13160l = r1
            r0.f13158j = r10
            int r1 = r0.f13159k
            int r1 = r1 + 1
            r0.f13159k = r1
            r11.h()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.af.a(com.applovin.exoplayer2.as[], com.applovin.exoplayer2.j.j, com.applovin.exoplayer2.k.b, com.applovin.exoplayer2.ah, com.applovin.exoplayer2.ae, com.applovin.exoplayer2.j.k):com.applovin.exoplayer2.ad");
    }

    public boolean a(ad adVar) {
        boolean z10 = false;
        com.applovin.exoplayer2.l.a.b(adVar != null);
        if (adVar.equals(this.f13158j)) {
            return false;
        }
        this.f13158j = adVar;
        while (adVar.g() != null) {
            adVar = adVar.g();
            if (adVar == this.f13157i) {
                this.f13157i = this.f13156h;
                z10 = true;
            }
            adVar.f();
            this.f13159k--;
        }
        this.f13158j.a((ad) null);
        h();
        return z10;
    }

    public boolean a(ba baVar, long j10, long j11) {
        ae aeVar;
        ad adVar = this.f13156h;
        ad adVar2 = null;
        while (adVar != null) {
            ae aeVar2 = adVar.f;
            if (adVar2 == null) {
                aeVar = a(baVar, aeVar2);
            } else {
                ae a10 = a(baVar, adVar2, j10);
                if (a10 == null) {
                    return !a(adVar2);
                }
                if (!a(aeVar2, a10)) {
                    return !a(adVar2);
                }
                aeVar = a10;
            }
            adVar.f = aeVar.b(aeVar2.f13144c);
            if (!a(aeVar2.f13146e, aeVar.f13146e)) {
                adVar.j();
                long j12 = aeVar.f13146e;
                return (a(adVar) || (adVar == this.f13157i && !adVar.f.f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > com.anythink.expressad.exoplayer.b.f7291b ? 1 : (j12 == com.anythink.expressad.exoplayer.b.f7291b ? 0 : -1)) == 0 ? Long.MAX_VALUE : adVar.a(j12)) ? 1 : (j11 == ((j12 > com.anythink.expressad.exoplayer.b.f7291b ? 1 : (j12 == com.anythink.expressad.exoplayer.b.f7291b ? 0 : -1)) == 0 ? Long.MAX_VALUE : adVar.a(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            adVar2 = adVar;
            adVar = adVar.g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.exoplayer2.ae a(com.applovin.exoplayer2.ba r19, com.applovin.exoplayer2.ae r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.applovin.exoplayer2.h.p$a r3 = r2.f13142a
            boolean r12 = r0.a(r3)
            boolean r13 = r0.a(r1, r3)
            boolean r14 = r0.a(r1, r3, r12)
            com.applovin.exoplayer2.h.p$a r4 = r2.f13142a
            java.lang.Object r4 = r4.f15389a
            com.applovin.exoplayer2.ba$a r5 = r0.f13150a
            r1.a(r4, r5)
            boolean r1 = r3.a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f15393e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            com.applovin.exoplayer2.ba$a r7 = r0.f13150a
            long r7 = r7.a(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.a()
            if (r1 == 0) goto L48
            com.applovin.exoplayer2.ba$a r1 = r0.f13150a
            int r5 = r3.f15390b
            int r6 = r3.f15391c
            long r5 = r1.b(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            com.applovin.exoplayer2.ba$a r1 = r0.f13150a
            long r5 = r1.a()
            goto L46
        L5c:
            boolean r1 = r3.a()
            if (r1 == 0) goto L6c
            com.applovin.exoplayer2.ba$a r1 = r0.f13150a
            int r4 = r3.f15390b
            boolean r1 = r1.e(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f15393e
            if (r1 == r4) goto L7a
            com.applovin.exoplayer2.ba$a r4 = r0.f13150a
            boolean r1 = r4.e(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            com.applovin.exoplayer2.ae r15 = new com.applovin.exoplayer2.ae
            long r4 = r2.f13143b
            long r1 = r2.f13144c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.af.a(com.applovin.exoplayer2.ba, com.applovin.exoplayer2.ae):com.applovin.exoplayer2.ae");
    }

    public p.a a(ba baVar, Object obj, long j10) {
        return a(baVar, obj, j10, a(baVar, obj), this.f13150a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(s.a aVar, p.a aVar2) {
        this.f13152c.a(aVar.a(), aVar2);
    }

    private static p.a a(ba baVar, Object obj, long j10, long j11, ba.a aVar) {
        baVar.a(obj, aVar);
        int a10 = aVar.a(j10);
        if (a10 == -1) {
            return new p.a(obj, j11, aVar.b(j10));
        }
        return new p.a(obj, a10, aVar.b(a10), j11);
    }

    private long a(ba baVar, Object obj) {
        int c10;
        int i10 = baVar.a(obj, this.f13150a).f13578c;
        Object obj2 = this.f13160l;
        if (obj2 != null && (c10 = baVar.c(obj2)) != -1 && baVar.a(c10, this.f13150a).f13578c == i10) {
            return this.f13161m;
        }
        for (ad adVar = this.f13156h; adVar != null; adVar = adVar.g()) {
            if (adVar.f13130b.equals(obj)) {
                return adVar.f.f13142a.f15392d;
            }
        }
        for (ad adVar2 = this.f13156h; adVar2 != null; adVar2 = adVar2.g()) {
            int c11 = baVar.c(adVar2.f13130b);
            if (c11 != -1 && baVar.a(c11, this.f13150a).f13578c == i10) {
                return adVar2.f.f13142a.f15392d;
            }
        }
        long j10 = this.f13154e;
        this.f13154e = 1 + j10;
        if (this.f13156h == null) {
            this.f13160l = obj;
            this.f13161m = j10;
        }
        return j10;
    }

    private boolean a(ae aeVar, ae aeVar2) {
        return aeVar.f13143b == aeVar2.f13143b && aeVar.f13142a.equals(aeVar2.f13142a);
    }

    private boolean a(ba baVar) {
        ad adVar = this.f13156h;
        if (adVar == null) {
            return true;
        }
        int c10 = baVar.c(adVar.f13130b);
        while (true) {
            c10 = baVar.a(c10, this.f13150a, this.f13151b, this.f, this.f13155g);
            while (adVar.g() != null && !adVar.f.f13147g) {
                adVar = adVar.g();
            }
            ad g6 = adVar.g();
            if (c10 == -1 || g6 == null || baVar.c(g6.f13130b) != c10) {
                break;
            }
            adVar = g6;
        }
        boolean a10 = a(adVar);
        adVar.f = a(baVar, adVar.f);
        return !a10;
    }

    private ae a(al alVar) {
        return a(alVar.f13192a, alVar.f13193b, alVar.f13194c, alVar.f13208s);
    }

    private ae a(ba baVar, ad adVar, long j10) {
        long j11;
        ae aeVar = adVar.f;
        long a10 = (adVar.a() + aeVar.f13146e) - j10;
        if (aeVar.f13147g) {
            long j12 = 0;
            int a11 = baVar.a(baVar.c(aeVar.f13142a.f15389a), this.f13150a, this.f13151b, this.f, this.f13155g);
            if (a11 == -1) {
                return null;
            }
            int i10 = baVar.a(a11, this.f13150a, true).f13578c;
            Object obj = this.f13150a.f13577b;
            long j13 = aeVar.f13142a.f15392d;
            if (baVar.a(i10, this.f13151b).f13601p == a11) {
                Pair<Object, Long> a12 = baVar.a(this.f13151b, this.f13150a, i10, com.anythink.expressad.exoplayer.b.f7291b, Math.max(0L, a10));
                if (a12 == null) {
                    return null;
                }
                obj = a12.first;
                long longValue = ((Long) a12.second).longValue();
                ad g6 = adVar.g();
                if (g6 != null && g6.f13130b.equals(obj)) {
                    j13 = g6.f.f13142a.f15392d;
                } else {
                    j13 = this.f13154e;
                    this.f13154e = 1 + j13;
                }
                j11 = longValue;
                j12 = com.anythink.expressad.exoplayer.b.f7291b;
            } else {
                j11 = 0;
            }
            return a(baVar, a(baVar, obj, j11, j13, this.f13150a), j12, j11);
        }
        p.a aVar = aeVar.f13142a;
        baVar.a(aVar.f15389a, this.f13150a);
        if (aVar.a()) {
            int i11 = aVar.f15390b;
            int d10 = this.f13150a.d(i11);
            if (d10 == -1) {
                return null;
            }
            int a13 = this.f13150a.a(i11, aVar.f15391c);
            if (a13 < d10) {
                return a(baVar, aVar.f15389a, i11, a13, aeVar.f13144c, aVar.f15392d);
            }
            long j14 = aeVar.f13144c;
            if (j14 == com.anythink.expressad.exoplayer.b.f7291b) {
                ba.c cVar = this.f13151b;
                ba.a aVar2 = this.f13150a;
                Pair<Object, Long> a14 = baVar.a(cVar, aVar2, aVar2.f13578c, com.anythink.expressad.exoplayer.b.f7291b, Math.max(0L, a10));
                if (a14 == null) {
                    return null;
                }
                j14 = ((Long) a14.second).longValue();
            }
            return a(baVar, aVar.f15389a, Math.max(a(baVar, aVar.f15389a, aVar.f15390b), j14), aeVar.f13144c, aVar.f15392d);
        }
        int b10 = this.f13150a.b(aVar.f15393e);
        if (b10 == this.f13150a.d(aVar.f15393e)) {
            return a(baVar, aVar.f15389a, a(baVar, aVar.f15389a, aVar.f15393e), aeVar.f13146e, aVar.f15392d);
        }
        return a(baVar, aVar.f15389a, aVar.f15393e, b10, aeVar.f13146e, aVar.f15392d);
    }

    private ae a(ba baVar, p.a aVar, long j10, long j11) {
        baVar.a(aVar.f15389a, this.f13150a);
        if (aVar.a()) {
            return a(baVar, aVar.f15389a, aVar.f15390b, aVar.f15391c, j10, aVar.f15392d);
        }
        return a(baVar, aVar.f15389a, j11, j10, aVar.f15392d);
    }

    private ae a(ba baVar, Object obj, int i10, int i11, long j10, long j11) {
        p.a aVar = new p.a(obj, i10, i11, j11);
        long b10 = baVar.a(aVar.f15389a, this.f13150a).b(aVar.f15390b, aVar.f15391c);
        long f = i11 == this.f13150a.b(i10) ? this.f13150a.f() : 0L;
        return new ae(aVar, (b10 == com.anythink.expressad.exoplayer.b.f7291b || f < b10) ? f : Math.max(0L, b10 - 1), j10, com.anythink.expressad.exoplayer.b.f7291b, b10, this.f13150a.e(aVar.f15390b), false, false, false);
    }

    private ae a(ba baVar, Object obj, long j10, long j11, long j12) {
        long j13 = j10;
        baVar.a(obj, this.f13150a);
        int b10 = this.f13150a.b(j13);
        p.a aVar = new p.a(obj, j12, b10);
        boolean a10 = a(aVar);
        boolean a11 = a(baVar, aVar);
        boolean a12 = a(baVar, aVar, a10);
        boolean z10 = b10 != -1 && this.f13150a.e(b10);
        long a13 = b10 != -1 ? this.f13150a.a(b10) : -9223372036854775807L;
        long j14 = (a13 == com.anythink.expressad.exoplayer.b.f7291b || a13 == Long.MIN_VALUE) ? this.f13150a.f13579d : a13;
        if (j14 != com.anythink.expressad.exoplayer.b.f7291b && j13 >= j14) {
            j13 = Math.max(0L, j14 - 1);
        }
        return new ae(aVar, j13, j11, a13, j14, z10, a10, a11, a12);
    }

    private boolean a(p.a aVar) {
        return !aVar.a() && aVar.f15393e == -1;
    }

    private boolean a(ba baVar, p.a aVar) {
        if (a(aVar)) {
            return baVar.a(baVar.a(aVar.f15389a, this.f13150a).f13578c, this.f13151b).f13602q == baVar.c(aVar.f15389a);
        }
        return false;
    }

    private boolean a(ba baVar, p.a aVar, boolean z10) {
        int c10 = baVar.c(aVar.f15389a);
        return !baVar.a(baVar.a(c10, this.f13150a).f13578c, this.f13151b).f13596j && baVar.b(c10, this.f13150a, this.f13151b, this.f, this.f13155g) && z10;
    }

    private long a(ba baVar, Object obj, int i10) {
        baVar.a(obj, this.f13150a);
        long a10 = this.f13150a.a(i10);
        if (a10 == Long.MIN_VALUE) {
            return this.f13150a.f13579d;
        }
        return this.f13150a.f(i10) + a10;
    }
}
