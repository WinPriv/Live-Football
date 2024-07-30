package com.applovin.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ah;
import com.applovin.exoplayer2.ao;
import com.applovin.exoplayer2.ar;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.common.base.Supplier;
import com.applovin.exoplayer2.d.f;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.j.j;
import com.applovin.exoplayer2.m;
import com.huawei.hms.ads.br;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s implements Handler.Callback, ah.d, ao.a, n.a, j.a, m.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private g K;
    private long L;
    private int M;
    private boolean N;
    private p O;
    private long P;

    /* renamed from: a, reason: collision with root package name */
    private final ar[] f16616a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<ar> f16617b;

    /* renamed from: c, reason: collision with root package name */
    private final as[] f16618c;

    /* renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.j.j f16619d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.j.k f16620e;
    private final aa f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.d f16621g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.o f16622h;

    /* renamed from: i, reason: collision with root package name */
    private final HandlerThread f16623i;

    /* renamed from: j, reason: collision with root package name */
    private final Looper f16624j;

    /* renamed from: k, reason: collision with root package name */
    private final ba.c f16625k;

    /* renamed from: l, reason: collision with root package name */
    private final ba.a f16626l;

    /* renamed from: m, reason: collision with root package name */
    private final long f16627m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f16628n;
    private final m o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<c> f16629p;

    /* renamed from: q, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.d f16630q;

    /* renamed from: r, reason: collision with root package name */
    private final e f16631r;

    /* renamed from: s, reason: collision with root package name */
    private final af f16632s;

    /* renamed from: t, reason: collision with root package name */
    private final ah f16633t;

    /* renamed from: u, reason: collision with root package name */
    private final z f16634u;

    /* renamed from: v, reason: collision with root package name */
    private final long f16635v;

    /* renamed from: w, reason: collision with root package name */
    private av f16636w;

    /* renamed from: x, reason: collision with root package name */
    private al f16637x;
    private d y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f16638z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<ah.c> f16640a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.exoplayer2.h.z f16641b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16642c;

        /* renamed from: d, reason: collision with root package name */
        private final long f16643d;

        private a(List<ah.c> list, com.applovin.exoplayer2.h.z zVar, int i10, long j10) {
            this.f16640a = list;
            this.f16641b = zVar;
            this.f16642c = i10;
            this.f16643d = j10;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16644a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16645b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16646c;

        /* renamed from: d, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.z f16647d;
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public al f16652a;

        /* renamed from: b, reason: collision with root package name */
        public int f16653b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16654c;

        /* renamed from: d, reason: collision with root package name */
        public int f16655d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16656e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f16657g;

        public d(al alVar) {
            this.f16652a = alVar;
        }

        public void b(int i10) {
            boolean z10 = true;
            if (this.f16654c && this.f16655d != 5) {
                if (i10 != 5) {
                    z10 = false;
                }
                com.applovin.exoplayer2.l.a.a(z10);
            } else {
                this.f16657g = true;
                this.f16654c = true;
                this.f16655d = i10;
            }
        }

        public void c(int i10) {
            this.f16657g = true;
            this.f16656e = true;
            this.f = i10;
        }

        public void a(int i10) {
            this.f16657g |= i10 > 0;
            this.f16653b += i10;
        }

        public void a(al alVar) {
            this.f16657g |= this.f16652a != alVar;
            this.f16652a = alVar;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void onPlaybackInfoUpdate(d dVar);
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final p.a f16658a;

        /* renamed from: b, reason: collision with root package name */
        public final long f16659b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16660c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f16661d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f16662e;
        public final boolean f;

        public f(p.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f16658a = aVar;
            this.f16659b = j10;
            this.f16660c = j11;
            this.f16661d = z10;
            this.f16662e = z11;
            this.f = z12;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final ba f16663a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16664b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16665c;

        public g(ba baVar, int i10, long j10) {
            this.f16663a = baVar;
            this.f16664b = i10;
            this.f16665c = j10;
        }
    }

    public s(ar[] arVarArr, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.j.k kVar, aa aaVar, com.applovin.exoplayer2.k.d dVar, int i10, boolean z10, com.applovin.exoplayer2.a.a aVar, av avVar, z zVar, long j10, boolean z11, Looper looper, com.applovin.exoplayer2.l.d dVar2, e eVar) {
        this.f16631r = eVar;
        this.f16616a = arVarArr;
        this.f16619d = jVar;
        this.f16620e = kVar;
        this.f = aaVar;
        this.f16621g = dVar;
        this.E = i10;
        this.F = z10;
        this.f16636w = avVar;
        this.f16634u = zVar;
        this.f16635v = j10;
        this.P = j10;
        this.A = z11;
        this.f16630q = dVar2;
        this.f16627m = aaVar.e();
        this.f16628n = aaVar.f();
        al a10 = al.a(kVar);
        this.f16637x = a10;
        this.y = new d(a10);
        this.f16618c = new as[arVarArr.length];
        for (int i11 = 0; i11 < arVarArr.length; i11++) {
            arVarArr[i11].a(i11);
            this.f16618c[i11] = arVarArr[i11].b();
        }
        this.o = new m(this, dVar2);
        this.f16629p = new ArrayList<>();
        this.f16617b = com.applovin.exoplayer2.common.a.aq.b();
        this.f16625k = new ba.c();
        this.f16626l = new ba.a();
        jVar.a(this, dVar);
        this.N = true;
        Handler handler = new Handler(looper);
        this.f16632s = new af(aVar, handler);
        this.f16633t = new ah(this, aVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f16623i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f16624j = looper2;
        this.f16622h = dVar2.a(looper2, this);
    }

    private void A() {
        boolean z10;
        ad c10 = this.f16632s.c();
        if (c10 != null && c10.f.f13148h && this.A) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.B = z10;
    }

    private boolean B() {
        ad c10;
        ad g6;
        if (!J() || this.B || (c10 = this.f16632s.c()) == null || (g6 = c10.g()) == null || this.L < g6.b() || !g6.f13134g) {
            return false;
        }
        return true;
    }

    private boolean C() {
        ad d10 = this.f16632s.d();
        if (!d10.f13132d) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ar[] arVarArr = this.f16616a;
            if (i10 < arVarArr.length) {
                ar arVar = arVarArr[i10];
                com.applovin.exoplayer2.h.x xVar = d10.f13131c[i10];
                if (arVar.f() != xVar || (xVar != null && !arVar.g() && !a(arVar, d10))) {
                    break;
                }
                i10++;
            } else {
                return true;
            }
        }
        return false;
    }

    private void D() {
        boolean E = E();
        this.D = E;
        if (E) {
            this.f16632s.b().e(this.L);
        }
        G();
    }

    private boolean E() {
        long b10;
        if (!F()) {
            return false;
        }
        ad b11 = this.f16632s.b();
        long d10 = d(b11.e());
        if (b11 == this.f16632s.c()) {
            b10 = b11.b(this.L);
        } else {
            b10 = b11.b(this.L) - b11.f.f13143b;
        }
        return this.f.a(b10, d10, this.o.d().f13211b);
    }

    private boolean F() {
        ad b10 = this.f16632s.b();
        if (b10 == null || b10.e() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private void G() {
        boolean z10;
        ad b10 = this.f16632s.b();
        if (!this.D && (b10 == null || !b10.f13129a.f())) {
            z10 = false;
        } else {
            z10 = true;
        }
        al alVar = this.f16637x;
        if (z10 != alVar.f13197g) {
            this.f16637x = alVar.a(z10);
        }
    }

    private void H() throws p {
        a(new boolean[this.f16616a.length]);
    }

    private long I() {
        return d(this.f16637x.f13206q);
    }

    private boolean J() {
        al alVar = this.f16637x;
        if (alVar.f13202l && alVar.f13203m == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean K() {
        return Boolean.valueOf(this.f16638z);
    }

    private void f() {
        this.y.a(this.f16637x);
        if (this.y.f16657g) {
            this.f16631r.onPlaybackInfoUpdate(this.y);
            this.y = new d(this.f16637x);
        }
    }

    private void g() {
        this.y.a(1);
        a(false, false, false, true);
        this.f.a();
        b(this.f16637x.f13192a.d() ? 4 : 2);
        this.f16633t.a(this.f16621g.a());
        this.f16622h.c(2);
    }

    private void h() throws p {
        a(this.f16633t.d(), true);
    }

    private void i() throws p {
        this.C = false;
        this.o.a();
        for (ar arVar : this.f16616a) {
            if (c(arVar)) {
                arVar.e();
            }
        }
    }

    private void j() throws p {
        this.o.b();
        for (ar arVar : this.f16616a) {
            if (c(arVar)) {
                a(arVar);
            }
        }
    }

    private void k() throws p {
        f(true);
    }

    private void l() throws p {
        long j10;
        boolean z10;
        ad c10 = this.f16632s.c();
        if (c10 == null) {
            return;
        }
        if (c10.f13132d) {
            j10 = c10.f13129a.c();
        } else {
            j10 = -9223372036854775807L;
        }
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            b(j10);
            if (j10 != this.f16637x.f13208s) {
                al alVar = this.f16637x;
                this.f16637x = a(alVar.f13193b, j10, alVar.f13194c, j10, true, 5);
            }
        } else {
            m mVar = this.o;
            if (c10 != this.f16632s.d()) {
                z10 = true;
            } else {
                z10 = false;
            }
            long a10 = mVar.a(z10);
            this.L = a10;
            long b10 = c10.b(a10);
            c(this.f16637x.f13208s, b10);
            this.f16637x.f13208s = b10;
        }
        this.f16637x.f13206q = this.f16632s.b().d();
        this.f16637x.f13207r = I();
        al alVar2 = this.f16637x;
        if (alVar2.f13202l && alVar2.f13196e == 3 && a(alVar2.f13192a, alVar2.f13193b) && this.f16637x.f13204n.f13211b == 1.0f) {
            float a11 = this.f16634u.a(o(), I());
            if (this.o.d().f13211b != a11) {
                this.o.a(this.f16637x.f13204n.a(a11));
                a(this.f16637x.f13204n, this.o.d().f13211b, false, false);
            }
        }
    }

    private void m() {
        for (ad c10 = this.f16632s.c(); c10 != null; c10 = c10.g()) {
            for (com.applovin.exoplayer2.j.d dVar : c10.i().f16023c) {
                if (dVar != null) {
                    dVar.h();
                }
            }
        }
    }

    private void n() throws p, IOException {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long b10 = this.f16630q.b();
        u();
        int i11 = this.f16637x.f13196e;
        if (i11 != 1 && i11 != 4) {
            ad c10 = this.f16632s.c();
            if (c10 == null) {
                a(b10, 10L);
                return;
            }
            com.applovin.exoplayer2.l.ah.a("doSomeWork");
            l();
            if (c10.f13132d) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                c10.f13129a.a(this.f16637x.f13208s - this.f16627m, this.f16628n);
                z10 = true;
                z11 = true;
                int i12 = 0;
                while (true) {
                    ar[] arVarArr = this.f16616a;
                    if (i12 >= arVarArr.length) {
                        break;
                    }
                    ar arVar = arVarArr[i12];
                    if (c(arVar)) {
                        arVar.a(this.L, elapsedRealtime);
                        if (z10 && arVar.A()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c10.f13131c[i12] != arVar.f()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14 && arVar.g()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z14 && !z15 && !arVar.z() && !arVar.A()) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (z11 && z16) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z16) {
                            arVar.k();
                        }
                    }
                    i12++;
                }
            } else {
                c10.f13129a.e_();
                z10 = true;
                z11 = true;
            }
            long j10 = c10.f.f13146e;
            if (z10 && c10.f13132d && (j10 == com.anythink.expressad.exoplayer.b.f7291b || j10 <= this.f16637x.f13208s)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && this.B) {
                this.B = false;
                a(false, this.f16637x.f13203m, false, 5);
            }
            if (z12 && c10.f.f13149i) {
                b(4);
                j();
            } else if (this.f16637x.f13196e == 2 && g(z11)) {
                b(3);
                this.O = null;
                if (J()) {
                    i();
                }
            } else if (this.f16637x.f13196e == 3 && (this.J != 0 ? !z11 : !s())) {
                this.C = J();
                b(2);
                if (this.C) {
                    m();
                    this.f16634u.a();
                }
                j();
            }
            if (this.f16637x.f13196e == 2) {
                int i13 = 0;
                while (true) {
                    ar[] arVarArr2 = this.f16616a;
                    if (i13 >= arVarArr2.length) {
                        break;
                    }
                    if (c(arVarArr2[i13]) && this.f16616a[i13].f() == c10.f13131c[i13]) {
                        this.f16616a[i13].k();
                    }
                    i13++;
                }
                al alVar = this.f16637x;
                if (!alVar.f13197g && alVar.f13207r < 500000 && F()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z17 = this.I;
            al alVar2 = this.f16637x;
            if (z17 != alVar2.o) {
                this.f16637x = alVar2.b(z17);
            }
            if ((J() && this.f16637x.f13196e == 3) || (i10 = this.f16637x.f13196e) == 2) {
                z13 = !b(b10, 10L);
            } else {
                if (this.J != 0 && i10 != 4) {
                    a(b10, 1000L);
                } else {
                    this.f16622h.d(2);
                }
                z13 = false;
            }
            al alVar3 = this.f16637x;
            if (alVar3.f13205p != z13) {
                this.f16637x = alVar3.c(z13);
            }
            this.H = false;
            com.applovin.exoplayer2.l.ah.a();
            return;
        }
        this.f16622h.d(2);
    }

    private long o() {
        al alVar = this.f16637x;
        return a(alVar.f13192a, alVar.f13193b.f15389a, alVar.f13208s);
    }

    private void p() {
        a(true, false, true, false);
        this.f.c();
        b(1);
        this.f16623i.quit();
        synchronized (this) {
            this.f16638z = true;
            notifyAll();
        }
    }

    private void q() throws p {
        boolean z10;
        float f10 = this.o.d().f13211b;
        ad d10 = this.f16632s.d();
        boolean z11 = true;
        for (ad c10 = this.f16632s.c(); c10 != null && c10.f13132d; c10 = c10.g()) {
            com.applovin.exoplayer2.j.k b10 = c10.b(f10, this.f16637x.f13192a);
            if (!b10.a(c10.i())) {
                if (z11) {
                    ad c11 = this.f16632s.c();
                    boolean a10 = this.f16632s.a(c11);
                    boolean[] zArr = new boolean[this.f16616a.length];
                    long a11 = c11.a(b10, this.f16637x.f13208s, a10, zArr);
                    al alVar = this.f16637x;
                    if (alVar.f13196e != 4 && a11 != alVar.f13208s) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    al alVar2 = this.f16637x;
                    this.f16637x = a(alVar2.f13193b, a11, alVar2.f13194c, alVar2.f13195d, z10, 5);
                    if (z10) {
                        b(a11);
                    }
                    boolean[] zArr2 = new boolean[this.f16616a.length];
                    int i10 = 0;
                    while (true) {
                        ar[] arVarArr = this.f16616a;
                        if (i10 >= arVarArr.length) {
                            break;
                        }
                        ar arVar = arVarArr[i10];
                        boolean c12 = c(arVar);
                        zArr2[i10] = c12;
                        com.applovin.exoplayer2.h.x xVar = c11.f13131c[i10];
                        if (c12) {
                            if (xVar != arVar.f()) {
                                b(arVar);
                            } else if (zArr[i10]) {
                                arVar.a(this.L);
                            }
                        }
                        i10++;
                    }
                    a(zArr2);
                } else {
                    this.f16632s.a(c10);
                    if (c10.f13132d) {
                        c10.a(b10, Math.max(c10.f.f13143b, c10.b(this.L)), false);
                    }
                }
                h(true);
                if (this.f16637x.f13196e != 4) {
                    D();
                    l();
                    this.f16622h.c(2);
                    return;
                }
                return;
            }
            if (c10 == d10) {
                z11 = false;
            }
        }
    }

    private void r() {
        for (ad c10 = this.f16632s.c(); c10 != null; c10 = c10.g()) {
            for (com.applovin.exoplayer2.j.d dVar : c10.i().f16023c) {
                if (dVar != null) {
                    dVar.g();
                }
            }
        }
    }

    private boolean s() {
        ad c10 = this.f16632s.c();
        long j10 = c10.f.f13146e;
        if (c10.f13132d && (j10 == com.anythink.expressad.exoplayer.b.f7291b || this.f16637x.f13208s < j10 || !J())) {
            return true;
        }
        return false;
    }

    private long t() {
        ad d10 = this.f16632s.d();
        if (d10 == null) {
            return 0L;
        }
        long a10 = d10.a();
        if (!d10.f13132d) {
            return a10;
        }
        int i10 = 0;
        while (true) {
            ar[] arVarArr = this.f16616a;
            if (i10 < arVarArr.length) {
                if (c(arVarArr[i10]) && this.f16616a[i10].f() == d10.f13131c[i10]) {
                    long h10 = this.f16616a[i10].h();
                    if (h10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    a10 = Math.max(h10, a10);
                }
                i10++;
            } else {
                return a10;
            }
        }
    }

    private void u() throws p, IOException {
        if (!this.f16637x.f13192a.d() && this.f16633t.a()) {
            v();
            w();
            x();
            z();
        }
    }

    private void v() throws p {
        ae a10;
        this.f16632s.a(this.L);
        if (this.f16632s.a() && (a10 = this.f16632s.a(this.L, this.f16637x)) != null) {
            ad a11 = this.f16632s.a(this.f16618c, this.f16619d, this.f.d(), this.f16633t, a10, this.f16620e);
            a11.f13129a.a(this, a10.f13143b);
            if (this.f16632s.c() == a11) {
                b(a11.b());
            }
            h(false);
        }
        if (this.D) {
            this.D = F();
            G();
        } else {
            D();
        }
    }

    private void w() {
        long j10;
        boolean z10;
        ad d10 = this.f16632s.d();
        if (d10 == null) {
            return;
        }
        int i10 = 0;
        if (d10.g() != null && !this.B) {
            if (!C()) {
                return;
            }
            if (!d10.g().f13132d && this.L < d10.g().b()) {
                return;
            }
            com.applovin.exoplayer2.j.k i11 = d10.i();
            ad e10 = this.f16632s.e();
            com.applovin.exoplayer2.j.k i12 = e10.i();
            if (e10.f13132d && e10.f13129a.c() != com.anythink.expressad.exoplayer.b.f7291b) {
                c(e10.b());
                return;
            }
            for (int i13 = 0; i13 < this.f16616a.length; i13++) {
                boolean a10 = i11.a(i13);
                boolean a11 = i12.a(i13);
                if (a10 && !this.f16616a[i13].j()) {
                    if (this.f16618c[i13].a() == -2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    at atVar = i11.f16022b[i13];
                    at atVar2 = i12.f16022b[i13];
                    if (!a11 || !atVar2.equals(atVar) || z10) {
                        a(this.f16616a[i13], e10.b());
                    }
                }
            }
            return;
        }
        if (!d10.f.f13149i && !this.B) {
            return;
        }
        while (true) {
            ar[] arVarArr = this.f16616a;
            if (i10 < arVarArr.length) {
                ar arVar = arVarArr[i10];
                com.applovin.exoplayer2.h.x xVar = d10.f13131c[i10];
                if (xVar != null && arVar.f() == xVar && arVar.g()) {
                    long j11 = d10.f.f13146e;
                    if (j11 != com.anythink.expressad.exoplayer.b.f7291b && j11 != Long.MIN_VALUE) {
                        j10 = d10.a() + d10.f.f13146e;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    a(arVar, j10);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void x() throws p {
        ad d10 = this.f16632s.d();
        if (d10 != null && this.f16632s.c() != d10 && !d10.f13134g && y()) {
            H();
        }
    }

    private boolean y() throws p {
        boolean z10;
        ad d10 = this.f16632s.d();
        com.applovin.exoplayer2.j.k i10 = d10.i();
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            ar[] arVarArr = this.f16616a;
            if (i11 < arVarArr.length) {
                ar arVar = arVarArr[i11];
                if (c(arVar)) {
                    if (arVar.f() != d10.f13131c[i11]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!i10.a(i11) || z10) {
                        if (!arVar.j()) {
                            arVar.a(a(i10.f16023c[i11]), d10.f13131c[i11], d10.b(), d10.a());
                        } else if (arVar.A()) {
                            b(arVar);
                        } else {
                            z11 = true;
                        }
                    }
                }
                i11++;
            } else {
                return !z11;
            }
        }
    }

    private void z() throws p {
        boolean z10 = false;
        while (B()) {
            if (z10) {
                f();
            }
            ad c10 = this.f16632s.c();
            ad f10 = this.f16632s.f();
            ae aeVar = f10.f;
            p.a aVar = aeVar.f13142a;
            long j10 = aeVar.f13143b;
            al a10 = a(aVar, j10, aeVar.f13144c, j10, true, 0);
            this.f16637x = a10;
            ba baVar = a10.f13192a;
            a(baVar, f10.f.f13142a, baVar, c10.f.f13142a, com.anythink.expressad.exoplayer.b.f7291b);
            A();
            l();
            z10 = true;
        }
    }

    public synchronized boolean c() {
        if (!this.f16638z && this.f16623i.isAlive()) {
            this.f16622h.c(7);
            a(new Supplier() { // from class: com.applovin.exoplayer2.v0
                @Override // com.applovin.exoplayer2.common.base.Supplier
                public final Object get() {
                    Boolean K;
                    K = s.this.K();
                    return K;
                }
            }, this.f16635v);
            return this.f16638z;
        }
        return true;
    }

    public Looper d() {
        return this.f16624j;
    }

    @Override // com.applovin.exoplayer2.ah.d
    public void e() {
        this.f16622h.c(22);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        ad d10;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a(z10, message.arg2, true, 1);
                    break;
                case 2:
                    n();
                    break;
                case 3:
                    a((g) message.obj);
                    break;
                case 4:
                    b((am) message.obj);
                    break;
                case 5:
                    a((av) message.obj);
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    p();
                    return true;
                case 8:
                    c((com.applovin.exoplayer2.h.n) message.obj);
                    break;
                case 9:
                    d((com.applovin.exoplayer2.h.n) message.obj);
                    break;
                case 10:
                    q();
                    break;
                case 11:
                    c(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    a(z12, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    b((ao) message.obj);
                    break;
                case 15:
                    d((ao) message.obj);
                    break;
                case 16:
                    a((am) message.obj, false);
                    break;
                case 17:
                    a((a) message.obj);
                    break;
                case 18:
                    a((a) message.obj, message.arg1);
                    break;
                case 19:
                    a((b) message.obj);
                    break;
                case 20:
                    b(message.arg1, message.arg2, (com.applovin.exoplayer2.h.z) message.obj);
                    break;
                case 21:
                    a((com.applovin.exoplayer2.h.z) message.obj);
                    break;
                case 22:
                    h();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c(z13);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    d(z14);
                    break;
                case 25:
                    k();
                    break;
                default:
                    return false;
            }
        } catch (ai e10) {
            int i12 = e10.f13185b;
            if (i12 == 1) {
                if (e10.f13184a) {
                    i10 = 3001;
                } else {
                    i10 = br.f21563e;
                }
            } else {
                if (i12 == 4) {
                    if (e10.f13184a) {
                        i10 = 3002;
                    } else {
                        i10 = br.f;
                    }
                }
                a(e10, i11);
            }
            i11 = i10;
            a(e10, i11);
        } catch (f.a e11) {
            a(e11, e11.f14029a);
        } catch (com.applovin.exoplayer2.h.b e12) {
            a(e12, 1002);
        } catch (com.applovin.exoplayer2.k.j e13) {
            a(e13, e13.f16089a);
        } catch (p e14) {
            e = e14;
            if (e.f16580a == 1 && (d10 = this.f16632s.d()) != null) {
                e = e.a(d10.f.f13142a);
            }
            if (e.f16585g && this.O == null) {
                com.applovin.exoplayer2.l.q.b("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.O = e;
                com.applovin.exoplayer2.l.o oVar = this.f16622h;
                oVar.a(oVar.a(25, e));
            } else {
                p pVar = this.O;
                if (pVar != null) {
                    pVar.addSuppressed(e);
                    e = this.O;
                }
                com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.f16637x = this.f16637x.a(e);
            }
        } catch (IOException e15) {
            a(e15, 2000);
        } catch (RuntimeException e16) {
            if ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) {
                i11 = 1004;
            }
            p a10 = p.a(e16, i11);
            com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Playback error", a10);
            a(true, false);
            this.f16637x = this.f16637x.a(a10);
        }
        f();
        return true;
    }

    private void d(boolean z10) {
        if (z10 == this.I) {
            return;
        }
        this.I = z10;
        al alVar = this.f16637x;
        int i10 = alVar.f13196e;
        if (!z10 && i10 != 4 && i10 != 1) {
            this.f16622h.c(2);
        } else {
            this.f16637x = alVar.b(z10);
        }
    }

    private void e(boolean z10) throws p {
        this.F = z10;
        if (!this.f16632s.a(this.f16637x.f13192a, z10)) {
            f(true);
        }
        h(false);
    }

    public void b() {
        this.f16622h.b(6).a();
    }

    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        public final ao f16648a;

        /* renamed from: b, reason: collision with root package name */
        public int f16649b;

        /* renamed from: c, reason: collision with root package name */
        public long f16650c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16651d;

        public c(ao aoVar) {
            this.f16648a = aoVar;
        }

        public void a(int i10, long j10, Object obj) {
            this.f16649b = i10;
            this.f16650c = j10;
            this.f16651d = obj;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            Object obj = this.f16651d;
            if ((obj == null) != (cVar.f16651d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f16649b - cVar.f16649b;
            return i10 != 0 ? i10 : com.applovin.exoplayer2.l.ai.a(this.f16650c, cVar.f16650c);
        }
    }

    @Override // com.applovin.exoplayer2.h.y.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(com.applovin.exoplayer2.h.n nVar) {
        this.f16622h.a(9, nVar).a();
    }

    private void b(int i10) {
        al alVar = this.f16637x;
        if (alVar.f13196e != i10) {
            this.f16637x = alVar.a(i10);
        }
    }

    private void h(boolean z10) {
        long d10;
        ad b10 = this.f16632s.b();
        p.a aVar = b10 == null ? this.f16637x.f13193b : b10.f.f13142a;
        boolean z11 = !this.f16637x.f13201k.equals(aVar);
        if (z11) {
            this.f16637x = this.f16637x.a(aVar);
        }
        al alVar = this.f16637x;
        if (b10 == null) {
            d10 = alVar.f13208s;
        } else {
            d10 = b10.d();
        }
        alVar.f13206q = d10;
        this.f16637x.f13207r = I();
        if ((z11 || z10) && b10 != null && b10.f13132d) {
            a(b10.h(), b10.i());
        }
    }

    private void f(boolean z10) throws p {
        p.a aVar = this.f16632s.c().f.f13142a;
        long a10 = a(aVar, this.f16637x.f13208s, true, false);
        if (a10 != this.f16637x.f13208s) {
            al alVar = this.f16637x;
            this.f16637x = a(aVar, a10, alVar.f13194c, alVar.f13195d, z10, 5);
        }
    }

    public void a(long j10) {
        this.P = j10;
    }

    private void b(int i10, int i11, com.applovin.exoplayer2.h.z zVar) throws p {
        this.y.a(1);
        a(this.f16633t.a(i10, i11, zVar), false);
    }

    private void c(boolean z10) throws p {
        this.A = z10;
        A();
        if (!this.B || this.f16632s.d() == this.f16632s.c()) {
            return;
        }
        f(true);
        h(false);
    }

    private void e(ao aoVar) throws p {
        if (aoVar.j()) {
            return;
        }
        try {
            aoVar.b().a(aoVar.c(), aoVar.d());
        } finally {
            aoVar.a(true);
        }
    }

    public void a() {
        this.f16622h.b(0).a();
    }

    private void d(final ao aoVar) {
        Looper e10 = aoVar.e();
        if (!e10.getThread().isAlive()) {
            com.applovin.exoplayer2.l.q.c("TAG", "Trying to send message on a dead thread.");
            aoVar.a(false);
        } else {
            this.f16630q.a(e10, null).a(new Runnable() { // from class: com.applovin.exoplayer2.u0
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.f(aoVar);
                }
            });
        }
    }

    private boolean g(boolean z10) {
        if (this.J == 0) {
            return s();
        }
        if (!z10) {
            return false;
        }
        al alVar = this.f16637x;
        if (!alVar.f13197g) {
            return true;
        }
        long b10 = a(alVar.f13192a, this.f16632s.c().f.f13142a) ? this.f16634u.b() : com.anythink.expressad.exoplayer.b.f7291b;
        ad b11 = this.f16632s.b();
        return (b11.c() && b11.f.f13149i) || (b11.f.f13142a.a() && !b11.f13132d) || this.f.a(I(), this.o.d().f13211b, this.C, b10);
    }

    public void a(boolean z10, int i10) {
        this.f16622h.a(1, z10 ? 1 : 0, i10).a();
    }

    private void b(boolean z10) {
        for (ad c10 = this.f16632s.c(); c10 != null; c10 = c10.g()) {
            for (com.applovin.exoplayer2.j.d dVar : c10.i().f16023c) {
                if (dVar != null) {
                    dVar.a(z10);
                }
            }
        }
    }

    public void a(int i10) {
        this.f16622h.a(11, i10, 0).a();
    }

    private void c(int i10) throws p {
        this.E = i10;
        if (!this.f16632s.a(this.f16637x.f13192a, i10)) {
            f(true);
        }
        h(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(ao aoVar) {
        try {
            e(aoVar);
        } catch (p e10) {
            com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    public void a(boolean z10) {
        this.f16622h.a(12, z10 ? 1 : 0, 0).a();
    }

    public void a(ba baVar, int i10, long j10) {
        this.f16622h.a(3, new g(baVar, i10, j10)).a();
    }

    private boolean b(long j10, long j11) {
        if (this.I && this.H) {
            return false;
        }
        a(j10, j11);
        return true;
    }

    private void d(com.applovin.exoplayer2.h.n nVar) {
        if (this.f16632s.a(nVar)) {
            this.f16632s.a(this.L);
            D();
        }
    }

    private void b(long j10) throws p {
        ad c10 = this.f16632s.c();
        if (c10 != null) {
            j10 = c10.a(j10);
        }
        this.L = j10;
        this.o.a(j10);
        for (ar arVar : this.f16616a) {
            if (c(arVar)) {
                arVar.a(this.L);
            }
        }
        r();
    }

    private void c(ao aoVar) throws p {
        if (aoVar.e() == this.f16624j) {
            e(aoVar);
            int i10 = this.f16637x.f13196e;
            if (i10 == 3 || i10 == 2) {
                this.f16622h.c(2);
                return;
            }
            return;
        }
        this.f16622h.a(15, aoVar).a();
    }

    public void a(List<ah.c> list, int i10, long j10, com.applovin.exoplayer2.h.z zVar) {
        this.f16622h.a(17, new a(list, zVar, i10, j10)).a();
    }

    private long d(long j10) {
        ad b10 = this.f16632s.b();
        if (b10 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - b10.b(this.L));
    }

    public void a(int i10, int i11, com.applovin.exoplayer2.h.z zVar) {
        this.f16622h.a(20, i10, i11, zVar).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0074, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0045, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(long r8, long r10) throws com.applovin.exoplayer2.p {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.c(long, long):void");
    }

    @Override // com.applovin.exoplayer2.ao.a
    public synchronized void a(ao aoVar) {
        if (!this.f16638z && this.f16623i.isAlive()) {
            this.f16622h.a(14, aoVar).a();
            return;
        }
        com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        aoVar.a(false);
    }

    private void b(am amVar) throws p {
        this.o.a(amVar);
        a(this.o.d(), true);
    }

    private void b(ao aoVar) throws p {
        if (aoVar.f() == com.anythink.expressad.exoplayer.b.f7291b) {
            c(aoVar);
            return;
        }
        if (this.f16637x.f13192a.d()) {
            this.f16629p.add(new c(aoVar));
            return;
        }
        c cVar = new c(aoVar);
        ba baVar = this.f16637x.f13192a;
        if (a(cVar, baVar, baVar, this.E, this.F, this.f16625k, this.f16626l)) {
            this.f16629p.add(cVar);
            Collections.sort(this.f16629p);
        } else {
            aoVar.a(false);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.applovin.exoplayer2.h.n.a
    public void a(com.applovin.exoplayer2.h.n nVar) {
        this.f16622h.a(8, nVar).a();
    }

    @Override // com.applovin.exoplayer2.m.a
    public void a(am amVar) {
        this.f16622h.a(16, amVar).a();
    }

    private void a(IOException iOException, int i10) {
        p a10 = p.a(iOException, i10);
        ad c10 = this.f16632s.c();
        if (c10 != null) {
            a10 = a10.a(c10.f.f13142a);
        }
        com.applovin.exoplayer2.l.q.c("ExoPlayerImplInternal", "Playback error", a10);
        a(false, false);
        this.f16637x = this.f16637x.a(a10);
    }

    private void b(ar arVar) throws p {
        if (c(arVar)) {
            this.o.b(arVar);
            a(arVar);
            arVar.m();
            this.J--;
        }
    }

    private synchronized void a(Supplier<Boolean> supplier, long j10) {
        long a10 = this.f16630q.a() + j10;
        boolean z10 = false;
        while (!supplier.get().booleanValue() && j10 > 0) {
            try {
                this.f16630q.c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = a10 - this.f16630q.a();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void a(a aVar) throws p {
        this.y.a(1);
        if (aVar.f16642c != -1) {
            this.K = new g(new ap(aVar.f16640a, aVar.f16641b), aVar.f16642c, aVar.f16643d);
        }
        a(this.f16633t.a(aVar.f16640a, aVar.f16641b), false);
    }

    private void c(long j10) {
        for (ar arVar : this.f16616a) {
            if (arVar.f() != null) {
                a(arVar, j10);
            }
        }
    }

    private void c(com.applovin.exoplayer2.h.n nVar) throws p {
        if (this.f16632s.a(nVar)) {
            ad b10 = this.f16632s.b();
            b10.a(this.o.d().f13211b, this.f16637x.f13192a);
            a(b10.h(), b10.i());
            if (b10 == this.f16632s.c()) {
                b(b10.f.f13143b);
                H();
                al alVar = this.f16637x;
                p.a aVar = alVar.f13193b;
                long j10 = b10.f.f13143b;
                this.f16637x = a(aVar, j10, alVar.f13194c, j10, false, 5);
            }
            D();
        }
    }

    private void a(a aVar, int i10) throws p {
        this.y.a(1);
        ah ahVar = this.f16633t;
        if (i10 == -1) {
            i10 = ahVar.b();
        }
        a(ahVar.a(i10, aVar.f16640a, aVar.f16641b), false);
    }

    private static boolean c(ar arVar) {
        return arVar.d_() != 0;
    }

    private void a(b bVar) throws p {
        this.y.a(1);
        a(this.f16633t.a(bVar.f16644a, bVar.f16645b, bVar.f16646c, bVar.f16647d), false);
    }

    private void a(com.applovin.exoplayer2.h.z zVar) throws p {
        this.y.a(1);
        a(this.f16633t.a(zVar), false);
    }

    private void a(boolean z10, int i10, boolean z11, int i11) throws p {
        this.y.a(z11 ? 1 : 0);
        this.y.c(i11);
        this.f16637x = this.f16637x.a(z10, i10);
        this.C = false;
        b(z10);
        if (!J()) {
            j();
            l();
            return;
        }
        int i12 = this.f16637x.f13196e;
        if (i12 == 3) {
            i();
            this.f16622h.c(2);
        } else if (i12 == 2) {
            this.f16622h.c(2);
        }
    }

    private long a(ba baVar, Object obj, long j10) {
        baVar.a(baVar.a(obj, this.f16626l).f13578c, this.f16625k);
        ba.c cVar = this.f16625k;
        if (cVar.f13593g != com.anythink.expressad.exoplayer.b.f7291b && cVar.e()) {
            ba.c cVar2 = this.f16625k;
            if (cVar2.f13596j) {
                return h.b(cVar2.d() - this.f16625k.f13593g) - (this.f16626l.c() + j10);
            }
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    private boolean a(ba baVar, p.a aVar) {
        if (aVar.a() || baVar.d()) {
            return false;
        }
        baVar.a(baVar.a(aVar.f15389a, this.f16626l).f13578c, this.f16625k);
        if (!this.f16625k.e()) {
            return false;
        }
        ba.c cVar = this.f16625k;
        return cVar.f13596j && cVar.f13593g != com.anythink.expressad.exoplayer.b.f7291b;
    }

    private void a(long j10, long j11) {
        this.f16622h.d(2);
        this.f16622h.a(2, j10 + j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac A[Catch: all -> 0x0148, TryCatch #1 {all -> 0x0148, blocks: (B:6:0x00a2, B:8:0x00ac, B:15:0x00b2, B:17:0x00b8, B:18:0x00bb, B:19:0x00c1, B:21:0x00cb, B:23:0x00d3, B:27:0x00db, B:28:0x00e5, B:30:0x00f5, B:34:0x00ff, B:37:0x0111, B:40:0x011a), top: B:5:0x00a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.applovin.exoplayer2.s.g r19) throws com.applovin.exoplayer2.p {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.a(com.applovin.exoplayer2.s$g):void");
    }

    private long a(p.a aVar, long j10, boolean z10) throws p {
        return a(aVar, j10, this.f16632s.c() != this.f16632s.d(), z10);
    }

    private long a(p.a aVar, long j10, boolean z10, boolean z11) throws p {
        j();
        this.C = false;
        if (z11 || this.f16637x.f13196e == 3) {
            b(2);
        }
        ad c10 = this.f16632s.c();
        ad adVar = c10;
        while (adVar != null && !aVar.equals(adVar.f.f13142a)) {
            adVar = adVar.g();
        }
        if (z10 || c10 != adVar || (adVar != null && adVar.a(j10) < 0)) {
            for (ar arVar : this.f16616a) {
                b(arVar);
            }
            if (adVar != null) {
                while (this.f16632s.c() != adVar) {
                    this.f16632s.f();
                }
                this.f16632s.a(adVar);
                adVar.c(0L);
                H();
            }
        }
        if (adVar != null) {
            this.f16632s.a(adVar);
            if (!adVar.f13132d) {
                adVar.f = adVar.f.a(j10);
            } else if (adVar.f13133e) {
                long b10 = adVar.f13129a.b(j10);
                adVar.f13129a.a(b10 - this.f16627m, this.f16628n);
                j10 = b10;
            }
            b(j10);
            D();
        } else {
            this.f16632s.g();
            b(j10);
        }
        h(false);
        this.f16622h.c(2);
        return j10;
    }

    private void a(av avVar) {
        this.f16636w = avVar;
    }

    private void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.G != z10) {
            this.G = z10;
            if (!z10) {
                for (ar arVar : this.f16616a) {
                    if (!c(arVar) && this.f16617b.remove(arVar)) {
                        arVar.n();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(boolean z10, boolean z11) {
        a(z10 || !this.G, false, true, false);
        this.y.a(z11 ? 1 : 0);
        this.f.b();
        b(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.a(boolean, boolean, boolean, boolean):void");
    }

    private Pair<p.a, Long> a(ba baVar) {
        if (baVar.d()) {
            return Pair.create(al.a(), 0L);
        }
        Pair<Object, Long> a10 = baVar.a(this.f16625k, this.f16626l, baVar.b(this.F), com.anythink.expressad.exoplayer.b.f7291b);
        p.a a11 = this.f16632s.a(baVar, a10.first, 0L);
        long longValue = ((Long) a10.second).longValue();
        if (a11.a()) {
            baVar.a(a11.f15389a, this.f16626l);
            longValue = a11.f15391c == this.f16626l.b(a11.f15390b) ? this.f16626l.f() : 0L;
        }
        return Pair.create(a11, Long.valueOf(longValue));
    }

    private void a(ba baVar, ba baVar2) {
        if (baVar.d() && baVar2.d()) {
            return;
        }
        for (int size = this.f16629p.size() - 1; size >= 0; size--) {
            if (!a(this.f16629p.get(size), baVar, baVar2, this.E, this.F, this.f16625k, this.f16626l)) {
                this.f16629p.get(size).f16648a.a(false);
                this.f16629p.remove(size);
            }
        }
        Collections.sort(this.f16629p);
    }

    private void a(ar arVar) throws p {
        if (arVar.d_() == 2) {
            arVar.l();
        }
    }

    private void a(float f10) {
        for (ad c10 = this.f16632s.c(); c10 != null; c10 = c10.g()) {
            for (com.applovin.exoplayer2.j.d dVar : c10.i().f16023c) {
                if (dVar != null) {
                    dVar.a(f10);
                }
            }
        }
    }

    private void a(ba baVar, boolean z10) throws p {
        int i10;
        int i11;
        boolean z11;
        f a10 = a(baVar, this.f16637x, this.K, this.f16632s, this.E, this.F, this.f16625k, this.f16626l);
        p.a aVar = a10.f16658a;
        long j10 = a10.f16660c;
        boolean z12 = a10.f16661d;
        long j11 = a10.f16659b;
        boolean z13 = (this.f16637x.f13193b.equals(aVar) && j11 == this.f16637x.f13208s) ? false : true;
        g gVar = null;
        long j12 = com.anythink.expressad.exoplayer.b.f7291b;
        try {
            if (a10.f16662e) {
                if (this.f16637x.f13196e != 1) {
                    b(4);
                }
                a(false, false, false, true);
            }
            try {
                if (!z13) {
                    try {
                        i11 = 4;
                        z11 = false;
                        if (!this.f16632s.a(baVar, this.L, t())) {
                            f(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        i10 = 4;
                        al alVar = this.f16637x;
                        ba baVar2 = alVar.f13192a;
                        p.a aVar2 = alVar.f13193b;
                        if (a10.f) {
                            j12 = j11;
                        }
                        g gVar2 = gVar;
                        a(baVar, aVar, baVar2, aVar2, j12);
                        if (z13 || j10 != this.f16637x.f13194c) {
                            al alVar2 = this.f16637x;
                            Object obj = alVar2.f13193b.f15389a;
                            ba baVar3 = alVar2.f13192a;
                            this.f16637x = a(aVar, j11, j10, this.f16637x.f13195d, z13 && z10 && !baVar3.d() && !baVar3.a(obj, this.f16626l).f, baVar.c(obj) == -1 ? i10 : 3);
                        }
                        A();
                        a(baVar, this.f16637x.f13192a);
                        this.f16637x = this.f16637x.a(baVar);
                        if (!baVar.d()) {
                            this.K = gVar2;
                        }
                        h(false);
                        throw th;
                    }
                } else {
                    i11 = 4;
                    z11 = false;
                    if (!baVar.d()) {
                        for (ad c10 = this.f16632s.c(); c10 != null; c10 = c10.g()) {
                            if (c10.f.f13142a.equals(aVar)) {
                                c10.f = this.f16632s.a(baVar, c10.f);
                                c10.j();
                            }
                        }
                        j11 = a(aVar, j11, z12);
                    }
                }
                al alVar3 = this.f16637x;
                a(baVar, aVar, alVar3.f13192a, alVar3.f13193b, a10.f ? j11 : -9223372036854775807L);
                if (z13 || j10 != this.f16637x.f13194c) {
                    al alVar4 = this.f16637x;
                    Object obj2 = alVar4.f13193b.f15389a;
                    ba baVar4 = alVar4.f13192a;
                    this.f16637x = a(aVar, j11, j10, this.f16637x.f13195d, (!z13 || !z10 || baVar4.d() || baVar4.a(obj2, this.f16626l).f) ? z11 : true, baVar.c(obj2) == -1 ? i11 : 3);
                }
                A();
                a(baVar, this.f16637x.f13192a);
                this.f16637x = this.f16637x.a(baVar);
                if (!baVar.d()) {
                    this.K = null;
                }
                h(z11);
            } catch (Throwable th2) {
                th = th2;
                gVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            i10 = 4;
        }
    }

    private void a(ba baVar, p.a aVar, ba baVar2, p.a aVar2, long j10) {
        if (!baVar.d() && a(baVar, aVar)) {
            baVar.a(baVar.a(aVar.f15389a, this.f16626l).f13578c, this.f16625k);
            this.f16634u.a((ab.e) com.applovin.exoplayer2.l.ai.a(this.f16625k.f13598l));
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
                this.f16634u.a(a(baVar, aVar.f15389a, j10));
                return;
            }
            if (com.applovin.exoplayer2.l.ai.a(!baVar2.d() ? baVar2.a(baVar2.a(aVar2.f15389a, this.f16626l).f13578c, this.f16625k).f13589b : null, this.f16625k.f13589b)) {
                return;
            }
            this.f16634u.a(com.anythink.expressad.exoplayer.b.f7291b);
            return;
        }
        float f10 = this.o.d().f13211b;
        am amVar = this.f16637x.f13204n;
        if (f10 != amVar.f13211b) {
            this.o.a(amVar);
        }
    }

    private boolean a(ar arVar, ad adVar) {
        ad g6 = adVar.g();
        return adVar.f.f && g6.f13132d && ((arVar instanceof com.applovin.exoplayer2.i.m) || arVar.h() >= g6.b());
    }

    private void a(ar arVar, long j10) {
        arVar.i();
        if (arVar instanceof com.applovin.exoplayer2.i.m) {
            ((com.applovin.exoplayer2.i.m) arVar).c(j10);
        }
    }

    private void a(am amVar, boolean z10) throws p {
        a(amVar, amVar.f13211b, true, z10);
    }

    private void a(am amVar, float f10, boolean z10, boolean z11) throws p {
        if (z10) {
            if (z11) {
                this.y.a(1);
            }
            this.f16637x = this.f16637x.a(amVar);
        }
        a(amVar.f13211b);
        for (ar arVar : this.f16616a) {
            if (arVar != null) {
                arVar.a(f10, amVar.f13211b);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private al a(p.a aVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        com.applovin.exoplayer2.h.ad adVar;
        com.applovin.exoplayer2.j.k kVar;
        com.applovin.exoplayer2.h.ad h10;
        com.applovin.exoplayer2.j.k i11;
        this.N = (!this.N && j10 == this.f16637x.f13208s && aVar.equals(this.f16637x.f13193b)) ? false : true;
        A();
        al alVar = this.f16637x;
        com.applovin.exoplayer2.h.ad adVar2 = alVar.f13198h;
        com.applovin.exoplayer2.j.k kVar2 = alVar.f13199i;
        List list2 = alVar.f13200j;
        if (this.f16633t.a()) {
            ad c10 = this.f16632s.c();
            if (c10 == null) {
                h10 = com.applovin.exoplayer2.h.ad.f15284a;
            } else {
                h10 = c10.h();
            }
            if (c10 == null) {
                i11 = this.f16620e;
            } else {
                i11 = c10.i();
            }
            List a10 = a(i11.f16023c);
            if (c10 != null) {
                ae aeVar = c10.f;
                if (aeVar.f13144c != j11) {
                    c10.f = aeVar.b(j11);
                }
            }
            adVar = h10;
            kVar = i11;
            list = a10;
        } else if (aVar.equals(this.f16637x.f13193b)) {
            list = list2;
            adVar = adVar2;
            kVar = kVar2;
        } else {
            adVar = com.applovin.exoplayer2.h.ad.f15284a;
            kVar = this.f16620e;
            list = com.applovin.exoplayer2.common.a.s.g();
        }
        if (z10) {
            this.y.b(i10);
        }
        return this.f16637x.a(aVar, j10, j11, j12, I(), adVar, kVar, list);
    }

    private com.applovin.exoplayer2.common.a.s<com.applovin.exoplayer2.g.a> a(com.applovin.exoplayer2.j.d[] dVarArr) {
        s.a aVar = new s.a();
        boolean z10 = false;
        for (com.applovin.exoplayer2.j.d dVar : dVarArr) {
            if (dVar != null) {
                com.applovin.exoplayer2.g.a aVar2 = dVar.a(0).f16836j;
                if (aVar2 == null) {
                    aVar.a(new com.applovin.exoplayer2.g.a(new a.InterfaceC0172a[0]));
                } else {
                    aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.a() : com.applovin.exoplayer2.common.a.s.g();
    }

    private void a(boolean[] zArr) throws p {
        ad d10 = this.f16632s.d();
        com.applovin.exoplayer2.j.k i10 = d10.i();
        for (int i11 = 0; i11 < this.f16616a.length; i11++) {
            if (!i10.a(i11) && this.f16617b.remove(this.f16616a[i11])) {
                this.f16616a[i11].n();
            }
        }
        for (int i12 = 0; i12 < this.f16616a.length; i12++) {
            if (i10.a(i12)) {
                a(i12, zArr[i12]);
            }
        }
        d10.f13134g = true;
    }

    private void a(int i10, boolean z10) throws p {
        ar arVar = this.f16616a[i10];
        if (c(arVar)) {
            return;
        }
        ad d10 = this.f16632s.d();
        boolean z11 = d10 == this.f16632s.c();
        com.applovin.exoplayer2.j.k i11 = d10.i();
        at atVar = i11.f16022b[i10];
        v[] a10 = a(i11.f16023c[i10]);
        boolean z12 = J() && this.f16637x.f13196e == 3;
        boolean z13 = !z10 && z12;
        this.J++;
        this.f16617b.add(arVar);
        arVar.a(atVar, a10, d10.f13131c[i10], this.L, z13, z11, d10.b(), d10.a());
        arVar.a(11, new ar.a() { // from class: com.applovin.exoplayer2.s.1
            @Override // com.applovin.exoplayer2.ar.a
            public void a(long j10) {
                if (j10 >= 2000) {
                    s.this.H = true;
                }
            }

            @Override // com.applovin.exoplayer2.ar.a
            public void a() {
                s.this.f16622h.c(2);
            }
        });
        this.o.a(arVar);
        if (z12) {
            arVar.e();
        }
    }

    private void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.k kVar) {
        this.f.a(this.f16616a, adVar, kVar.f16023c);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.exoplayer2.s.f a(com.applovin.exoplayer2.ba r30, com.applovin.exoplayer2.al r31, com.applovin.exoplayer2.s.g r32, com.applovin.exoplayer2.af r33, int r34, boolean r35, com.applovin.exoplayer2.ba.c r36, com.applovin.exoplayer2.ba.a r37) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.s.a(com.applovin.exoplayer2.ba, com.applovin.exoplayer2.al, com.applovin.exoplayer2.s$g, com.applovin.exoplayer2.af, int, boolean, com.applovin.exoplayer2.ba$c, com.applovin.exoplayer2.ba$a):com.applovin.exoplayer2.s$f");
    }

    private static boolean a(al alVar, ba.a aVar) {
        p.a aVar2 = alVar.f13193b;
        ba baVar = alVar.f13192a;
        return baVar.d() || baVar.a(aVar2.f15389a, aVar).f;
    }

    private static boolean a(c cVar, ba baVar, ba baVar2, int i10, boolean z10, ba.c cVar2, ba.a aVar) {
        Object obj = cVar.f16651d;
        if (obj == null) {
            Pair<Object, Long> a10 = a(baVar, new g(cVar.f16648a.a(), cVar.f16648a.g(), cVar.f16648a.f() == Long.MIN_VALUE ? com.anythink.expressad.exoplayer.b.f7291b : h.b(cVar.f16648a.f())), false, i10, z10, cVar2, aVar);
            if (a10 == null) {
                return false;
            }
            cVar.a(baVar.c(a10.first), ((Long) a10.second).longValue(), a10.first);
            if (cVar.f16648a.f() == Long.MIN_VALUE) {
                a(baVar, cVar, cVar2, aVar);
            }
            return true;
        }
        int c10 = baVar.c(obj);
        if (c10 == -1) {
            return false;
        }
        if (cVar.f16648a.f() == Long.MIN_VALUE) {
            a(baVar, cVar, cVar2, aVar);
            return true;
        }
        cVar.f16649b = c10;
        baVar2.a(cVar.f16651d, aVar);
        if (aVar.f && baVar2.a(aVar.f13578c, cVar2).f13601p == baVar2.c(cVar.f16651d)) {
            Pair<Object, Long> a11 = baVar.a(cVar2, aVar, baVar.a(cVar.f16651d, aVar).f13578c, aVar.c() + cVar.f16650c);
            cVar.a(baVar.c(a11.first), ((Long) a11.second).longValue(), a11.first);
        }
        return true;
    }

    private static void a(ba baVar, c cVar, ba.c cVar2, ba.a aVar) {
        int i10 = baVar.a(baVar.a(cVar.f16651d, aVar).f13578c, cVar2).f13602q;
        Object obj = baVar.a(i10, aVar, true).f13577b;
        long j10 = aVar.f13579d;
        cVar.a(i10, j10 != com.anythink.expressad.exoplayer.b.f7291b ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private static Pair<Object, Long> a(ba baVar, g gVar, boolean z10, int i10, boolean z11, ba.c cVar, ba.a aVar) {
        Pair<Object, Long> a10;
        Object a11;
        ba baVar2 = gVar.f16663a;
        if (baVar.d()) {
            return null;
        }
        ba baVar3 = baVar2.d() ? baVar : baVar2;
        try {
            a10 = baVar3.a(cVar, aVar, gVar.f16664b, gVar.f16665c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (baVar.equals(baVar3)) {
            return a10;
        }
        if (baVar.c(a10.first) != -1) {
            return (baVar3.a(a10.first, aVar).f && baVar3.a(aVar.f13578c, cVar).f13601p == baVar3.c(a10.first)) ? baVar.a(cVar, aVar, baVar.a(a10.first, aVar).f13578c, gVar.f16665c) : a10;
        }
        if (z10 && (a11 = a(cVar, aVar, i10, z11, a10.first, baVar3, baVar)) != null) {
            return baVar.a(cVar, aVar, baVar.a(a11, aVar).f13578c, com.anythink.expressad.exoplayer.b.f7291b);
        }
        return null;
    }

    public static Object a(ba.c cVar, ba.a aVar, int i10, boolean z10, Object obj, ba baVar, ba baVar2) {
        int c10 = baVar.c(obj);
        int c11 = baVar.c();
        int i11 = c10;
        int i12 = -1;
        for (int i13 = 0; i13 < c11 && i12 == -1; i13++) {
            i11 = baVar.a(i11, aVar, cVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = baVar2.c(baVar.a(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return baVar2.a(i12);
    }

    private static v[] a(com.applovin.exoplayer2.j.d dVar) {
        int e10 = dVar != null ? dVar.e() : 0;
        v[] vVarArr = new v[e10];
        for (int i10 = 0; i10 < e10; i10++) {
            vVarArr[i10] = dVar.a(i10);
        }
        return vVarArr;
    }
}
