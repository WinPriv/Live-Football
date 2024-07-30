package j5;

import android.net.Uri;
import android.os.Handler;
import c6.b0;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import j5.e0;
import j5.n;
import j5.s;
import j5.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k4.i0;
import k4.m1;
import k4.z0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p4.u;

/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes2.dex */
public final class b0 implements s, p4.j, b0.a<a>, b0.e, e0.c {

    /* renamed from: g0, reason: collision with root package name */
    public static final Map<String, String> f29647g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final k4.i0 f29648h0;
    public final String A;
    public final long B;
    public final a0 D;
    public s.a I;
    public IcyHeaders J;
    public boolean M;
    public boolean N;
    public boolean O;
    public e P;
    public p4.u Q;
    public boolean S;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public long Y;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f29649c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f29650d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f29651e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f29652f0;

    /* renamed from: s, reason: collision with root package name */
    public final Uri f29653s;

    /* renamed from: t, reason: collision with root package name */
    public final c6.j f29654t;

    /* renamed from: u, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.f f29655u;

    /* renamed from: v, reason: collision with root package name */
    public final c6.a0 f29656v;

    /* renamed from: w, reason: collision with root package name */
    public final x.a f29657w;

    /* renamed from: x, reason: collision with root package name */
    public final e.a f29658x;
    public final b y;

    /* renamed from: z, reason: collision with root package name */
    public final c6.b f29659z;
    public final c6.b0 C = new c6.b0("ProgressiveMediaPeriod");
    public final d6.e E = new d6.e();
    public final androidx.activity.k F = new androidx.activity.k(this, 5);
    public final androidx.activity.g G = new androidx.activity.g(this, 4);
    public final Handler H = d6.g0.k(null);
    public d[] L = new d[0];
    public e0[] K = new e0[0];
    public long Z = com.anythink.expressad.exoplayer.b.f7291b;
    public long R = com.anythink.expressad.exoplayer.b.f7291b;
    public int T = 1;

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    public final class a implements b0.d, n.a {

        /* renamed from: b, reason: collision with root package name */
        public final Uri f29661b;

        /* renamed from: c, reason: collision with root package name */
        public final c6.g0 f29662c;

        /* renamed from: d, reason: collision with root package name */
        public final a0 f29663d;

        /* renamed from: e, reason: collision with root package name */
        public final p4.j f29664e;
        public final d6.e f;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f29666h;

        /* renamed from: j, reason: collision with root package name */
        public long f29668j;

        /* renamed from: l, reason: collision with root package name */
        public e0 f29670l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f29671m;

        /* renamed from: g, reason: collision with root package name */
        public final p4.t f29665g = new p4.t();

        /* renamed from: i, reason: collision with root package name */
        public boolean f29667i = true;

        /* renamed from: a, reason: collision with root package name */
        public final long f29660a = o.f29817b.getAndIncrement();

        /* renamed from: k, reason: collision with root package name */
        public c6.m f29669k = b(0);

        public a(Uri uri, c6.j jVar, a0 a0Var, p4.j jVar2, d6.e eVar) {
            this.f29661b = uri;
            this.f29662c = new c6.g0(jVar);
            this.f29663d = a0Var;
            this.f29664e = jVar2;
            this.f = eVar;
        }

        @Override // c6.b0.d
        public final void a() {
            this.f29666h = true;
        }

        public final c6.m b(long j10) {
            Collections.emptyMap();
            String str = b0.this.A;
            Map<String, String> map = b0.f29647g0;
            Uri uri = this.f29661b;
            d6.a.f(uri, "The uri must be set.");
            return new c6.m(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
        }

        @Override // c6.b0.d
        public final void load() throws IOException {
            c6.j jVar;
            int i10;
            int i11 = 0;
            while (i11 == 0 && !this.f29666h) {
                try {
                    long j10 = this.f29665g.f34349a;
                    c6.m b10 = b(j10);
                    this.f29669k = b10;
                    long f = this.f29662c.f(b10);
                    if (f != -1) {
                        f += j10;
                        b0 b0Var = b0.this;
                        b0Var.H.post(new androidx.activity.b(b0Var, 9));
                    }
                    long j11 = f;
                    b0.this.J = IcyHeaders.a(this.f29662c.g());
                    c6.g0 g0Var = this.f29662c;
                    IcyHeaders icyHeaders = b0.this.J;
                    if (icyHeaders != null && (i10 = icyHeaders.f20022x) != -1) {
                        jVar = new n(g0Var, i10, this);
                        b0 b0Var2 = b0.this;
                        b0Var2.getClass();
                        e0 B = b0Var2.B(new d(0, true));
                        this.f29670l = B;
                        B.b(b0.f29648h0);
                    } else {
                        jVar = g0Var;
                    }
                    long j12 = j10;
                    ((j5.c) this.f29663d).b(jVar, this.f29661b, this.f29662c.g(), j10, j11, this.f29664e);
                    if (b0.this.J != null) {
                        p4.h hVar = ((j5.c) this.f29663d).f29682b;
                        if (hVar instanceof w4.d) {
                            ((w4.d) hVar).f36099r = true;
                        }
                    }
                    if (this.f29667i) {
                        a0 a0Var = this.f29663d;
                        long j13 = this.f29668j;
                        p4.h hVar2 = ((j5.c) a0Var).f29682b;
                        hVar2.getClass();
                        hVar2.g(j12, j13);
                        this.f29667i = false;
                    }
                    while (true) {
                        long j14 = j12;
                        while (i11 == 0 && !this.f29666h) {
                            try {
                                d6.e eVar = this.f;
                                synchronized (eVar) {
                                    while (!eVar.f27296a) {
                                        eVar.wait();
                                    }
                                }
                                a0 a0Var2 = this.f29663d;
                                p4.t tVar = this.f29665g;
                                j5.c cVar = (j5.c) a0Var2;
                                p4.h hVar3 = cVar.f29682b;
                                hVar3.getClass();
                                p4.e eVar2 = cVar.f29683c;
                                eVar2.getClass();
                                i11 = hVar3.c(eVar2, tVar);
                                j12 = ((j5.c) this.f29663d).a();
                                if (j12 > b0.this.B + j14) {
                                    d6.e eVar3 = this.f;
                                    synchronized (eVar3) {
                                        eVar3.f27296a = false;
                                    }
                                    b0 b0Var3 = b0.this;
                                    b0Var3.H.post(b0Var3.G);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (((j5.c) this.f29663d).a() != -1) {
                        this.f29665g.f34349a = ((j5.c) this.f29663d).a();
                    }
                    androidx.activity.n.o0(this.f29662c);
                } catch (Throwable th) {
                    if (i11 != 1 && ((j5.c) this.f29663d).a() != -1) {
                        this.f29665g.f34349a = ((j5.c) this.f29663d).a();
                    }
                    androidx.activity.n.o0(this.f29662c);
                    throw th;
                }
            }
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    public final class c implements f0 {

        /* renamed from: s, reason: collision with root package name */
        public final int f29673s;

        public c(int i10) {
            this.f29673s = i10;
        }

        @Override // j5.f0
        public final void a() throws IOException {
            b0 b0Var = b0.this;
            b0Var.K[this.f29673s].t();
            int c10 = b0Var.f29656v.c(b0Var.T);
            c6.b0 b0Var2 = b0Var.C;
            IOException iOException = b0Var2.f3300c;
            if (iOException == null) {
                b0.c<? extends b0.d> cVar = b0Var2.f3299b;
                if (cVar != null) {
                    if (c10 == Integer.MIN_VALUE) {
                        c10 = cVar.f3303s;
                    }
                    IOException iOException2 = cVar.f3307w;
                    if (iOException2 != null && cVar.f3308x > c10) {
                        throw iOException2;
                    }
                    return;
                }
                return;
            }
            throw iOException;
        }

        @Override // j5.f0
        public final int i(long j10) {
            b0 b0Var = b0.this;
            if (b0Var.D()) {
                return 0;
            }
            int i10 = this.f29673s;
            b0Var.z(i10);
            e0 e0Var = b0Var.K[i10];
            int p10 = e0Var.p(j10, b0Var.f29651e0);
            e0Var.y(p10);
            if (p10 == 0) {
                b0Var.A(i10);
                return p10;
            }
            return p10;
        }

        @Override // j5.f0
        public final boolean isReady() {
            b0 b0Var = b0.this;
            if (!b0Var.D() && b0Var.K[this.f29673s].r(b0Var.f29651e0)) {
                return true;
            }
            return false;
        }

        @Override // j5.f0
        public final int m(j1.a aVar, n4.g gVar, int i10) {
            b0 b0Var = b0.this;
            if (b0Var.D()) {
                return -3;
            }
            int i11 = this.f29673s;
            b0Var.z(i11);
            int v3 = b0Var.K[i11].v(aVar, gVar, i10, b0Var.f29651e0);
            if (v3 == -3) {
                b0Var.A(i11);
            }
            return v3;
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f29675a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f29676b;

        public d(int i10, boolean z10) {
            this.f29675a = i10;
            this.f29676b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f29675a == dVar.f29675a && this.f29676b == dVar.f29676b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f29675a * 31) + (this.f29676b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final n0 f29677a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f29678b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f29679c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f29680d;

        public e(n0 n0Var, boolean[] zArr) {
            this.f29677a = n0Var;
            this.f29678b = zArr;
            int i10 = n0Var.f29814s;
            this.f29679c = new boolean[i10];
            this.f29680d = new boolean[i10];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f29647g0 = Collections.unmodifiableMap(hashMap);
        i0.a aVar = new i0.a();
        aVar.f30525a = "icy";
        aVar.f30534k = "application/x-icy";
        f29648h0 = aVar.a();
    }

    public b0(Uri uri, c6.j jVar, j5.c cVar, com.google.android.exoplayer2.drm.f fVar, e.a aVar, c6.a0 a0Var, x.a aVar2, b bVar, c6.b bVar2, String str, int i10) {
        this.f29653s = uri;
        this.f29654t = jVar;
        this.f29655u = fVar;
        this.f29658x = aVar;
        this.f29656v = a0Var;
        this.f29657w = aVar2;
        this.y = bVar;
        this.f29659z = bVar2;
        this.A = str;
        this.B = i10;
        this.D = cVar;
    }

    public final void A(int i10) {
        u();
        boolean[] zArr = this.P.f29678b;
        if (this.f29649c0 && zArr[i10] && !this.K[i10].r(false)) {
            this.Z = 0L;
            this.f29649c0 = false;
            this.V = true;
            this.Y = 0L;
            this.f29650d0 = 0;
            for (e0 e0Var : this.K) {
                e0Var.w(false);
            }
            s.a aVar = this.I;
            aVar.getClass();
            aVar.g(this);
        }
    }

    public final e0 B(d dVar) {
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.L[i10])) {
                return this.K[i10];
            }
        }
        com.google.android.exoplayer2.drm.f fVar = this.f29655u;
        fVar.getClass();
        e.a aVar = this.f29658x;
        aVar.getClass();
        e0 e0Var = new e0(this.f29659z, fVar, aVar);
        e0Var.f = this;
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.L, i11);
        dVarArr[length] = dVar;
        this.L = dVarArr;
        e0[] e0VarArr = (e0[]) Arrays.copyOf(this.K, i11);
        e0VarArr[length] = e0Var;
        this.K = e0VarArr;
        return e0Var;
    }

    public final void C() {
        a aVar = new a(this.f29653s, this.f29654t, this.D, this, this.E);
        if (this.N) {
            d6.a.d(x());
            long j10 = this.R;
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b && this.Z > j10) {
                this.f29651e0 = true;
                this.Z = com.anythink.expressad.exoplayer.b.f7291b;
                return;
            }
            p4.u uVar = this.Q;
            uVar.getClass();
            long j11 = uVar.h(this.Z).f34350a.f34356b;
            long j12 = this.Z;
            aVar.f29665g.f34349a = j11;
            aVar.f29668j = j12;
            aVar.f29667i = true;
            aVar.f29671m = false;
            for (e0 e0Var : this.K) {
                e0Var.f29730t = this.Z;
            }
            this.Z = com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.f29650d0 = v();
        this.f29657w.n(new o(aVar.f29660a, aVar.f29669k, this.C.f(aVar, this, this.f29656v.c(this.T))), 1, -1, null, 0, null, aVar.f29668j, this.R);
    }

    public final boolean D() {
        if (!this.V && !x()) {
            return false;
        }
        return true;
    }

    @Override // j5.e0.c
    public final void a() {
        this.H.post(this.F);
    }

    @Override // j5.s, j5.g0
    public final long b() {
        return e();
    }

    @Override // j5.s, j5.g0
    public final boolean c(long j10) {
        if (!this.f29651e0) {
            c6.b0 b0Var = this.C;
            if (!b0Var.c() && !this.f29649c0) {
                if (!this.N || this.W != 0) {
                    boolean a10 = this.E.a();
                    if (!b0Var.d()) {
                        C();
                        return true;
                    }
                    return a10;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // j5.s
    public final long d(long j10, m1 m1Var) {
        u();
        if (!this.Q.e()) {
            return 0L;
        }
        u.a h10 = this.Q.h(j10);
        return m1Var.a(j10, h10.f34350a.f34355a, h10.f34351b.f34355a);
    }

    @Override // j5.s, j5.g0
    public final long e() {
        long j10;
        boolean z10;
        long j11;
        u();
        if (this.f29651e0 || this.W == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.Z;
        }
        if (this.O) {
            int length = this.K.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.P;
                if (eVar.f29678b[i10] && eVar.f29679c[i10]) {
                    e0 e0Var = this.K[i10];
                    synchronized (e0Var) {
                        z10 = e0Var.f29733w;
                    }
                    if (z10) {
                        continue;
                    } else {
                        e0 e0Var2 = this.K[i10];
                        synchronized (e0Var2) {
                            j11 = e0Var2.f29732v;
                        }
                        j10 = Math.min(j10, j11);
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = w(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.Y;
        }
        return j10;
    }

    @Override // c6.b0.a
    public final void g(a aVar, long j10, long j11) {
        p4.u uVar;
        long j12;
        a aVar2 = aVar;
        if (this.R == com.anythink.expressad.exoplayer.b.f7291b && (uVar = this.Q) != null) {
            boolean e10 = uVar.e();
            long w10 = w(true);
            if (w10 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = w10 + 10000;
            }
            this.R = j12;
            ((c0) this.y).y(j12, e10, this.S);
        }
        c6.g0 g0Var = aVar2.f29662c;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.f29656v.getClass();
        this.f29657w.h(oVar, 1, -1, null, 0, null, aVar2.f29668j, this.R);
        this.f29651e0 = true;
        s.a aVar3 = this.I;
        aVar3.getClass();
        aVar3.g(this);
    }

    @Override // c6.b0.e
    public final void h() {
        for (e0 e0Var : this.K) {
            e0Var.w(true);
            com.google.android.exoplayer2.drm.d dVar = e0Var.f29719h;
            if (dVar != null) {
                dVar.b(e0Var.f29717e);
                e0Var.f29719h = null;
                e0Var.f29718g = null;
            }
        }
        j5.c cVar = (j5.c) this.D;
        p4.h hVar = cVar.f29682b;
        if (hVar != null) {
            hVar.release();
            cVar.f29682b = null;
        }
        cVar.f29683c = null;
    }

    @Override // p4.j
    public final void i(p4.u uVar) {
        this.H.post(new com.applovin.exoplayer2.b.e0(7, this, uVar));
    }

    @Override // j5.s, j5.g0
    public final boolean isLoading() {
        boolean z10;
        if (this.C.d()) {
            d6.e eVar = this.E;
            synchronized (eVar) {
                z10 = eVar.f27296a;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // j5.s
    public final void j() throws IOException {
        int c10 = this.f29656v.c(this.T);
        c6.b0 b0Var = this.C;
        IOException iOException = b0Var.f3300c;
        if (iOException == null) {
            b0.c<? extends b0.d> cVar = b0Var.f3299b;
            if (cVar != null) {
                if (c10 == Integer.MIN_VALUE) {
                    c10 = cVar.f3303s;
                }
                IOException iOException2 = cVar.f3307w;
                if (iOException2 != null && cVar.f3308x > c10) {
                    throw iOException2;
                }
            }
            if (this.f29651e0 && !this.N) {
                throw z0.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override // j5.s
    public final void k(s.a aVar, long j10) {
        this.I = aVar;
        this.E.a();
        C();
    }

    @Override // j5.s
    public final long l(long j10) {
        boolean z10;
        u();
        boolean[] zArr = this.P.f29678b;
        if (!this.Q.e()) {
            j10 = 0;
        }
        this.V = false;
        this.Y = j10;
        if (x()) {
            this.Z = j10;
            return j10;
        }
        if (this.T != 7) {
            int length = this.K.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.K[i10].x(j10, false) && (zArr[i10] || !this.O)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return j10;
            }
        }
        this.f29649c0 = false;
        this.Z = j10;
        this.f29651e0 = false;
        c6.b0 b0Var = this.C;
        if (b0Var.d()) {
            for (e0 e0Var : this.K) {
                e0Var.i();
            }
            b0Var.b();
        } else {
            b0Var.f3300c = null;
            for (e0 e0Var2 : this.K) {
                e0Var2.w(false);
            }
        }
        return j10;
    }

    @Override // p4.j
    public final void m() {
        this.M = true;
        this.H.post(this.F);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    @Override // c6.b0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c6.b0.b n(j5.b0.a r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            j5.b0$a r1 = (j5.b0.a) r1
            c6.g0 r2 = r1.f29662c
            j5.o r4 = new j5.o
            android.net.Uri r3 = r2.f3356c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r2.f3357d
            r4.<init>(r2)
            long r2 = r1.f29668j
            d6.g0.S(r2)
            long r2 = r0.R
            d6.g0.S(r2)
            c6.a0$c r2 = new c6.a0$c
            r14 = r22
            r3 = r23
            r2.<init>(r14, r3)
            c6.a0 r3 = r0.f29656v
            long r2 = r3.a(r2)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r8 = 1
            if (r7 != 0) goto L37
            c6.b0$b r2 = c6.b0.f
            goto L92
        L37:
            int r7 = r16.v()
            int r9 = r0.f29650d0
            r10 = 0
            if (r7 <= r9) goto L42
            r9 = r8
            goto L43
        L42:
            r9 = r10
        L43:
            boolean r11 = r0.X
            if (r11 != 0) goto L84
            p4.u r11 = r0.Q
            if (r11 == 0) goto L54
            long r11 = r11.i()
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 == 0) goto L54
            goto L84
        L54:
            boolean r5 = r0.N
            if (r5 == 0) goto L61
            boolean r5 = r16.D()
            if (r5 != 0) goto L61
            r0.f29649c0 = r8
            goto L87
        L61:
            boolean r5 = r0.N
            r0.V = r5
            r5 = 0
            r0.Y = r5
            r0.f29650d0 = r10
            j5.e0[] r7 = r0.K
            int r11 = r7.length
            r12 = r10
        L6f:
            if (r12 >= r11) goto L79
            r13 = r7[r12]
            r13.w(r10)
            int r12 = r12 + 1
            goto L6f
        L79:
            p4.t r7 = r1.f29665g
            r7.f34349a = r5
            r1.f29668j = r5
            r1.f29667i = r8
            r1.f29671m = r10
            goto L86
        L84:
            r0.f29650d0 = r7
        L86:
            r10 = r8
        L87:
            if (r10 == 0) goto L90
            c6.b0$b r5 = new c6.b0$b
            r5.<init>(r9, r2)
            r2 = r5
            goto L92
        L90:
            c6.b0$b r2 = c6.b0.f3297e
        L92:
            boolean r3 = r2.a()
            r15 = r3 ^ 1
            j5.x$a r3 = r0.f29657w
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r1.f29668j
            long r12 = r0.R
            r14 = r22
            r3.j(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b0.n(c6.b0$d, long, long, java.io.IOException, int):c6.b0$b");
    }

    @Override // j5.s
    public final long o(b6.f[] fVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j10) {
        boolean[] zArr3;
        boolean z10;
        b6.f fVar;
        boolean z11;
        boolean z12;
        u();
        e eVar = this.P;
        n0 n0Var = eVar.f29677a;
        int i10 = this.W;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int length = fVarArr.length;
            zArr3 = eVar.f29679c;
            if (i12 >= length) {
                break;
            }
            f0 f0Var = f0VarArr[i12];
            if (f0Var != null && (fVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) f0Var).f29673s;
                d6.a.d(zArr3[i13]);
                this.W--;
                zArr3[i13] = false;
                f0VarArr[i12] = null;
            }
            i12++;
        }
        if (!this.U ? j10 != 0 : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < fVarArr.length; i14++) {
            if (f0VarArr[i14] == null && (fVar = fVarArr[i14]) != null) {
                if (fVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d6.a.d(z11);
                if (fVar.d(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d6.a.d(z12);
                int b10 = n0Var.b(fVar.a());
                d6.a.d(!zArr3[b10]);
                this.W++;
                zArr3[b10] = true;
                f0VarArr[i14] = new c(b10);
                zArr2[i14] = true;
                if (!z10) {
                    e0 e0Var = this.K[b10];
                    if (!e0Var.x(j10, true) && e0Var.f29727q + e0Var.f29729s != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.W == 0) {
            this.f29649c0 = false;
            this.V = false;
            c6.b0 b0Var = this.C;
            if (b0Var.d()) {
                e0[] e0VarArr = this.K;
                int length2 = e0VarArr.length;
                while (i11 < length2) {
                    e0VarArr[i11].i();
                    i11++;
                }
                b0Var.b();
            } else {
                for (e0 e0Var2 : this.K) {
                    e0Var2.w(false);
                }
            }
        } else if (z10) {
            j10 = l(j10);
            while (i11 < f0VarArr.length) {
                if (f0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.U = true;
        return j10;
    }

    @Override // j5.s
    public final long p() {
        if (this.V) {
            if (this.f29651e0 || v() > this.f29650d0) {
                this.V = false;
                return this.Y;
            }
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // c6.b0.a
    public final void q(a aVar, long j10, long j11, boolean z10) {
        a aVar2 = aVar;
        c6.g0 g0Var = aVar2.f29662c;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.f29656v.getClass();
        this.f29657w.e(oVar, 1, -1, null, 0, null, aVar2.f29668j, this.R);
        if (!z10) {
            for (e0 e0Var : this.K) {
                e0Var.w(false);
            }
            if (this.W > 0) {
                s.a aVar3 = this.I;
                aVar3.getClass();
                aVar3.g(this);
            }
        }
    }

    @Override // j5.s
    public final n0 r() {
        u();
        return this.P.f29677a;
    }

    @Override // p4.j
    public final p4.w s(int i10, int i11) {
        return B(new d(i10, false));
    }

    @Override // j5.s
    public final void t(long j10, boolean z10) {
        u();
        if (x()) {
            return;
        }
        boolean[] zArr = this.P.f29679c;
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.K[i10].h(j10, z10, zArr[i10]);
        }
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void u() {
        d6.a.d(this.N);
        this.P.getClass();
        this.Q.getClass();
    }

    public final int v() {
        int i10 = 0;
        for (e0 e0Var : this.K) {
            i10 += e0Var.f29727q + e0Var.f29726p;
        }
        return i10;
    }

    public final long w(boolean z10) {
        long j10;
        long j11 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.K.length; i10++) {
            if (!z10) {
                e eVar = this.P;
                eVar.getClass();
                if (!eVar.f29679c[i10]) {
                    continue;
                }
            }
            e0 e0Var = this.K[i10];
            synchronized (e0Var) {
                j10 = e0Var.f29732v;
            }
            j11 = Math.max(j11, j10);
        }
        return j11;
    }

    public final boolean x() {
        if (this.Z != com.anythink.expressad.exoplayer.b.f7291b) {
            return true;
        }
        return false;
    }

    public final void y() {
        boolean z10;
        Metadata metadata;
        int i10;
        if (!this.f29652f0 && !this.N && this.M && this.Q != null) {
            for (e0 e0Var : this.K) {
                if (e0Var.q() == null) {
                    return;
                }
            }
            d6.e eVar = this.E;
            synchronized (eVar) {
                eVar.f27296a = false;
            }
            int length = this.K.length;
            m0[] m0VarArr = new m0[length];
            boolean[] zArr = new boolean[length];
            for (int i11 = 0; i11 < length; i11++) {
                k4.i0 q10 = this.K[i11].q();
                q10.getClass();
                String str = q10.D;
                boolean k10 = d6.r.k(str);
                if (!k10 && !d6.r.m(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i11] = z10;
                this.O = z10 | this.O;
                IcyHeaders icyHeaders = this.J;
                if (icyHeaders != null) {
                    if (k10 || this.L[i11].f29676b) {
                        Metadata metadata2 = q10.B;
                        if (metadata2 == null) {
                            metadata = new Metadata(icyHeaders);
                        } else {
                            int i12 = d6.g0.f27302a;
                            Metadata.Entry[] entryArr = metadata2.f19997s;
                            Object[] copyOf = Arrays.copyOf(entryArr, entryArr.length + 1);
                            System.arraycopy(new Metadata.Entry[]{icyHeaders}, 0, copyOf, entryArr.length, 1);
                            metadata = new Metadata(metadata2.f19998t, (Metadata.Entry[]) copyOf);
                        }
                        i0.a aVar = new i0.a(q10);
                        aVar.f30532i = metadata;
                        q10 = new k4.i0(aVar);
                    }
                    if (k10 && q10.f30523x == -1 && q10.y == -1 && (i10 = icyHeaders.f20017s) != -1) {
                        i0.a aVar2 = new i0.a(q10);
                        aVar2.f = i10;
                        q10 = new k4.i0(aVar2);
                    }
                }
                m0VarArr[i11] = new m0(Integer.toString(i11), q10.b(this.f29655u.f(q10)));
            }
            this.P = new e(new n0(m0VarArr), zArr);
            this.N = true;
            s.a aVar3 = this.I;
            aVar3.getClass();
            aVar3.a(this);
        }
    }

    public final void z(int i10) {
        u();
        e eVar = this.P;
        boolean[] zArr = eVar.f29680d;
        if (!zArr[i10]) {
            k4.i0 i0Var = eVar.f29677a.a(i10).f29804v[0];
            this.f29657w.b(d6.r.i(i0Var.D), i0Var, 0, null, this.Y);
            zArr[i10] = true;
        }
    }

    @Override // j5.s, j5.g0
    public final void f(long j10) {
    }
}
