package com.applovin.exoplayer2.h;

import android.net.Uri;
import android.os.Handler;
import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.h.i;
import com.applovin.exoplayer2.h.n;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.h.w;
import com.applovin.exoplayer2.k.l;
import com.applovin.exoplayer2.k.v;
import com.applovin.exoplayer2.k.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t implements com.applovin.exoplayer2.e.j, n, w.c, w.a<a>, w.e {

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f15400b = t();

    /* renamed from: c, reason: collision with root package name */
    private static final com.applovin.exoplayer2.v f15401c = new v.a().a("icy").f("application/x-icy").a();
    private e A;
    private com.applovin.exoplayer2.e.v B;
    private boolean D;
    private boolean F;
    private boolean G;
    private int H;
    private long J;
    private boolean L;
    private int M;
    private boolean N;
    private boolean O;

    /* renamed from: d, reason: collision with root package name */
    private final Uri f15402d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.i f15403e;
    private final com.applovin.exoplayer2.d.h f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.v f15404g;

    /* renamed from: h, reason: collision with root package name */
    private final q.a f15405h;

    /* renamed from: i, reason: collision with root package name */
    private final g.a f15406i;

    /* renamed from: j, reason: collision with root package name */
    private final b f15407j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.b f15408k;

    /* renamed from: l, reason: collision with root package name */
    private final String f15409l;

    /* renamed from: m, reason: collision with root package name */
    private final long f15410m;
    private final s o;

    /* renamed from: t, reason: collision with root package name */
    private n.a f15416t;

    /* renamed from: u, reason: collision with root package name */
    private com.applovin.exoplayer2.g.d.b f15417u;

    /* renamed from: x, reason: collision with root package name */
    private boolean f15420x;
    private boolean y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f15421z;

    /* renamed from: n, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.w f15411n = new com.applovin.exoplayer2.k.w("ProgressiveMediaPeriod");

    /* renamed from: p, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.g f15412p = new com.applovin.exoplayer2.l.g();

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f15413q = new Runnable() { // from class: com.applovin.exoplayer2.h.i0
        @Override // java.lang.Runnable
        public final void run() {
            t.this.n();
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f15414r = new Runnable() { // from class: com.applovin.exoplayer2.h.j0
        @Override // java.lang.Runnable
        public final void run() {
            t.this.u();
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final Handler f15415s = ai.a();

    /* renamed from: w, reason: collision with root package name */
    private d[] f15419w = new d[0];

    /* renamed from: v, reason: collision with root package name */
    private w[] f15418v = new w[0];
    private long K = com.anythink.expressad.exoplayer.b.f7291b;
    private long I = -1;
    private long C = com.anythink.expressad.exoplayer.b.f7291b;
    private int E = 1;

    /* loaded from: classes.dex */
    public final class a implements i.a, w.d {

        /* renamed from: c, reason: collision with root package name */
        private final Uri f15424c;

        /* renamed from: d, reason: collision with root package name */
        private final com.applovin.exoplayer2.k.z f15425d;

        /* renamed from: e, reason: collision with root package name */
        private final s f15426e;
        private final com.applovin.exoplayer2.e.j f;

        /* renamed from: g, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.g f15427g;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f15429i;

        /* renamed from: k, reason: collision with root package name */
        private long f15431k;

        /* renamed from: n, reason: collision with root package name */
        private com.applovin.exoplayer2.e.x f15434n;
        private boolean o;

        /* renamed from: h, reason: collision with root package name */
        private final com.applovin.exoplayer2.e.u f15428h = new com.applovin.exoplayer2.e.u();

        /* renamed from: j, reason: collision with root package name */
        private boolean f15430j = true;

        /* renamed from: m, reason: collision with root package name */
        private long f15433m = -1;

        /* renamed from: b, reason: collision with root package name */
        private final long f15423b = j.a();

        /* renamed from: l, reason: collision with root package name */
        private com.applovin.exoplayer2.k.l f15432l = a(0);

        public a(Uri uri, com.applovin.exoplayer2.k.i iVar, s sVar, com.applovin.exoplayer2.e.j jVar, com.applovin.exoplayer2.l.g gVar) {
            this.f15424c = uri;
            this.f15425d = new com.applovin.exoplayer2.k.z(iVar);
            this.f15426e = sVar;
            this.f = jVar;
            this.f15427g = gVar;
        }

        @Override // com.applovin.exoplayer2.k.w.d
        public void b() throws IOException {
            int i10 = 0;
            while (i10 == 0 && !this.f15429i) {
                try {
                    long j10 = this.f15428h.f14937a;
                    com.applovin.exoplayer2.k.l a10 = a(j10);
                    this.f15432l = a10;
                    long a11 = this.f15425d.a(a10);
                    this.f15433m = a11;
                    if (a11 != -1) {
                        this.f15433m = a11 + j10;
                    }
                    t.this.f15417u = com.applovin.exoplayer2.g.d.b.a(this.f15425d.b());
                    com.applovin.exoplayer2.k.g gVar = this.f15425d;
                    if (t.this.f15417u != null && t.this.f15417u.f != -1) {
                        gVar = new i(this.f15425d, t.this.f15417u.f, this);
                        com.applovin.exoplayer2.e.x j11 = t.this.j();
                        this.f15434n = j11;
                        j11.a(t.f15401c);
                    }
                    long j12 = j10;
                    this.f15426e.a(gVar, this.f15424c, this.f15425d.b(), j10, this.f15433m, this.f);
                    if (t.this.f15417u != null) {
                        this.f15426e.b();
                    }
                    if (this.f15430j) {
                        this.f15426e.a(j12, this.f15431k);
                        this.f15430j = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f15429i) {
                            try {
                                this.f15427g.c();
                                i10 = this.f15426e.a(this.f15428h);
                                j12 = this.f15426e.c();
                                if (j12 > t.this.f15410m + j13) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f15427g.b();
                        t.this.f15415s.post(t.this.f15414r);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f15426e.c() != -1) {
                        this.f15428h.f14937a = this.f15426e.c();
                    }
                    ai.a((com.applovin.exoplayer2.k.i) this.f15425d);
                } catch (Throwable th) {
                    if (i10 != 1 && this.f15426e.c() != -1) {
                        this.f15428h.f14937a = this.f15426e.c();
                    }
                    ai.a((com.applovin.exoplayer2.k.i) this.f15425d);
                    throw th;
                }
            }
        }

        @Override // com.applovin.exoplayer2.k.w.d
        public void a() {
            this.f15429i = true;
        }

        @Override // com.applovin.exoplayer2.h.i.a
        public void a(com.applovin.exoplayer2.l.y yVar) {
            long max = !this.o ? this.f15431k : Math.max(t.this.q(), this.f15431k);
            int a10 = yVar.a();
            com.applovin.exoplayer2.e.x xVar = (com.applovin.exoplayer2.e.x) com.applovin.exoplayer2.l.a.b(this.f15434n);
            xVar.a(yVar, a10);
            xVar.a(max, 1, a10, 0, null);
            this.o = true;
        }

        private com.applovin.exoplayer2.k.l a(long j10) {
            return new l.a().a(this.f15424c).a(j10).b(t.this.f15409l).b(6).a(t.f15400b).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10, long j11) {
            this.f15428h.f14937a = j10;
            this.f15431k = j11;
            this.f15430j = true;
            this.o = false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(long j10, boolean z10, boolean z11);
    }

    /* loaded from: classes.dex */
    public final class c implements x {

        /* renamed from: b, reason: collision with root package name */
        private final int f15436b;

        public c(int i10) {
            this.f15436b = i10;
        }

        @Override // com.applovin.exoplayer2.h.x
        public boolean b() {
            return t.this.a(this.f15436b);
        }

        @Override // com.applovin.exoplayer2.h.x
        public void c() throws IOException {
            t.this.b(this.f15436b);
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i10) {
            return t.this.a(this.f15436b, wVar, gVar, i10);
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(long j10) {
            return t.this.a(this.f15436b, j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f15437a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15438b;

        public d(int i10, boolean z10) {
            this.f15437a = i10;
            this.f15438b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f15437a == dVar.f15437a && this.f15438b == dVar.f15438b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f15437a * 31) + (this.f15438b ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final ad f15439a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f15440b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f15441c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f15442d;

        public e(ad adVar, boolean[] zArr) {
            this.f15439a = adVar;
            this.f15440b = zArr;
            int i10 = adVar.f15286b;
            this.f15441c = new boolean[i10];
            this.f15442d = new boolean[i10];
        }
    }

    public t(Uri uri, com.applovin.exoplayer2.k.i iVar, s sVar, com.applovin.exoplayer2.d.h hVar, g.a aVar, com.applovin.exoplayer2.k.v vVar, q.a aVar2, b bVar, com.applovin.exoplayer2.k.b bVar2, String str, int i10) {
        this.f15402d = uri;
        this.f15403e = iVar;
        this.f = hVar;
        this.f15406i = aVar;
        this.f15404g = vVar;
        this.f15405h = aVar2;
        this.f15407j = bVar;
        this.f15408k = bVar2;
        this.f15409l = str;
        this.f15410m = i10;
        this.o = sVar;
    }

    private boolean m() {
        if (!this.G && !r()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        boolean z10;
        com.applovin.exoplayer2.g.a a10;
        if (!this.O && !this.y && this.f15420x && this.B != null) {
            for (w wVar : this.f15418v) {
                if (wVar.g() == null) {
                    return;
                }
            }
            this.f15412p.b();
            int length = this.f15418v.length;
            ac[] acVarArr = new ac[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                com.applovin.exoplayer2.v vVar = (com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(this.f15418v[i10].g());
                String str = vVar.f16838l;
                boolean a11 = com.applovin.exoplayer2.l.u.a(str);
                if (!a11 && !com.applovin.exoplayer2.l.u.b(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i10] = z10;
                this.f15421z = z10 | this.f15421z;
                com.applovin.exoplayer2.g.d.b bVar = this.f15417u;
                if (bVar != null) {
                    if (a11 || this.f15419w[i10].f15438b) {
                        com.applovin.exoplayer2.g.a aVar = vVar.f16836j;
                        if (aVar == null) {
                            a10 = new com.applovin.exoplayer2.g.a(bVar);
                        } else {
                            a10 = aVar.a(bVar);
                        }
                        vVar = vVar.a().a(a10).a();
                    }
                    if (a11 && vVar.f == -1 && vVar.f16833g == -1 && bVar.f15126a != -1) {
                        vVar = vVar.a().d(bVar.f15126a).a();
                    }
                }
                acVarArr[i10] = new ac(vVar.a(this.f.a(vVar)));
            }
            this.A = new e(new ad(acVarArr), zArr);
            this.y = true;
            ((n.a) com.applovin.exoplayer2.l.a.b(this.f15416t)).a((n) this);
        }
    }

    private void o() {
        a aVar = new a(this.f15402d, this.f15403e, this.o, this, this.f15412p);
        if (this.y) {
            com.applovin.exoplayer2.l.a.b(r());
            long j10 = this.C;
            if (j10 == com.anythink.expressad.exoplayer.b.f7291b || this.K <= j10) {
                aVar.a(((com.applovin.exoplayer2.e.v) com.applovin.exoplayer2.l.a.b(this.B)).a(this.K).f14938a.f14944c, this.K);
                for (w wVar : this.f15418v) {
                    wVar.a(this.K);
                }
                this.K = com.anythink.expressad.exoplayer.b.f7291b;
            } else {
                this.N = true;
                this.K = com.anythink.expressad.exoplayer.b.f7291b;
                return;
            }
        }
        this.M = p();
        this.f15405h.a(new j(aVar.f15423b, aVar.f15432l, this.f15411n.a(aVar, this, this.f15404g.a(this.E))), 1, -1, null, 0, null, aVar.f15431k, this.C);
    }

    private int p() {
        int i10 = 0;
        for (w wVar : this.f15418v) {
            i10 += wVar.c();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q() {
        long j10 = Long.MIN_VALUE;
        for (w wVar : this.f15418v) {
            j10 = Math.max(j10, wVar.h());
        }
        return j10;
    }

    private boolean r() {
        if (this.K != com.anythink.expressad.exoplayer.b.f7291b) {
            return true;
        }
        return false;
    }

    private void s() {
        com.applovin.exoplayer2.l.a.b(this.y);
        com.applovin.exoplayer2.l.a.b(this.A);
        com.applovin.exoplayer2.l.a.b(this.B);
    }

    private static Map<String, String> t() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        if (!this.O) {
            ((n.a) com.applovin.exoplayer2.l.a.b(this.f15416t)).a((n.a) this);
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public void e_() throws IOException {
        i();
        if (this.N && !this.y) {
            throw com.applovin.exoplayer2.ai.b("Loading finished before preparation is complete.", null);
        }
    }

    public void i() throws IOException {
        this.f15411n.a(this.f15404g.a(this.E));
    }

    public com.applovin.exoplayer2.e.x j() {
        return a(new d(0, true));
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10) {
    }

    @Override // com.applovin.exoplayer2.h.n
    public ad b() {
        s();
        return this.A.f15439a;
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean c(long j10) {
        if (this.N || this.f15411n.a() || this.L) {
            return false;
        }
        if (this.y && this.H == 0) {
            return false;
        }
        boolean a10 = this.f15412p.a();
        if (this.f15411n.c()) {
            return a10;
        }
        o();
        return true;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long d() {
        long j10;
        s();
        boolean[] zArr = this.A.f15440b;
        if (this.N) {
            return Long.MIN_VALUE;
        }
        if (r()) {
            return this.K;
        }
        if (this.f15421z) {
            int length = this.f15418v.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.f15418v[i10].j()) {
                    j10 = Math.min(j10, this.f15418v[i10].h());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = q();
        }
        return j10 == Long.MIN_VALUE ? this.J : j10;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long e() {
        if (this.H == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean f() {
        return this.f15411n.c() && this.f15412p.e();
    }

    public void g() {
        if (this.y) {
            for (w wVar : this.f15418v) {
                wVar.d();
            }
        }
        this.f15411n.a(this);
        this.f15415s.removeCallbacksAndMessages(null);
        this.f15416t = null;
        this.O = true;
    }

    @Override // com.applovin.exoplayer2.k.w.e
    public void h() {
        for (w wVar : this.f15418v) {
            wVar.a();
        }
        this.o.a();
    }

    @Override // com.applovin.exoplayer2.h.n
    public long b(long j10) {
        s();
        boolean[] zArr = this.A.f15440b;
        if (!this.B.a()) {
            j10 = 0;
        }
        int i10 = 0;
        this.G = false;
        this.J = j10;
        if (r()) {
            this.K = j10;
            return j10;
        }
        if (this.E != 7 && a(zArr, j10)) {
            return j10;
        }
        this.L = false;
        this.K = j10;
        this.N = false;
        if (this.f15411n.c()) {
            w[] wVarArr = this.f15418v;
            int length = wVarArr.length;
            while (i10 < length) {
                wVarArr[i10].k();
                i10++;
            }
            this.f15411n.d();
        } else {
            this.f15411n.b();
            w[] wVarArr2 = this.f15418v;
            int length2 = wVarArr2.length;
            while (i10 < length2) {
                wVarArr2[i10].b();
                i10++;
            }
        }
        return j10;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long c() {
        if (!this.G) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        if (!this.N && p() <= this.M) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.G = false;
        return this.J;
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(n.a aVar, long j10) {
        this.f15416t = aVar;
        this.f15412p.a();
        o();
    }

    private void c(int i10) {
        s();
        e eVar = this.A;
        boolean[] zArr = eVar.f15442d;
        if (zArr[i10]) {
            return;
        }
        com.applovin.exoplayer2.v a10 = eVar.f15439a.a(i10).a(0);
        this.f15405h.a(com.applovin.exoplayer2.l.u.e(a10.f16838l), a10, 0, (Object) null, this.J);
        zArr[i10] = true;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(com.applovin.exoplayer2.j.d[] dVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j10) {
        com.applovin.exoplayer2.j.d dVar;
        s();
        e eVar = this.A;
        ad adVar = eVar.f15439a;
        boolean[] zArr3 = eVar.f15441c;
        int i10 = this.H;
        int i11 = 0;
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            x xVar = xVarArr[i12];
            if (xVar != null && (dVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) xVar).f15436b;
                com.applovin.exoplayer2.l.a.b(zArr3[i13]);
                this.H--;
                zArr3[i13] = false;
                xVarArr[i12] = null;
            }
        }
        boolean z10 = !this.F ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < dVarArr.length; i14++) {
            if (xVarArr[i14] == null && (dVar = dVarArr[i14]) != null) {
                com.applovin.exoplayer2.l.a.b(dVar.e() == 1);
                com.applovin.exoplayer2.l.a.b(dVar.b(0) == 0);
                int a10 = adVar.a(dVar.d());
                com.applovin.exoplayer2.l.a.b(!zArr3[a10]);
                this.H++;
                zArr3[a10] = true;
                xVarArr[i14] = new c(a10);
                zArr2[i14] = true;
                if (!z10) {
                    w wVar = this.f15418v[a10];
                    z10 = (wVar.a(j10, true) || wVar.f() == 0) ? false : true;
                }
            }
        }
        if (this.H == 0) {
            this.L = false;
            this.G = false;
            if (this.f15411n.c()) {
                w[] wVarArr = this.f15418v;
                int length = wVarArr.length;
                while (i11 < length) {
                    wVarArr[i11].k();
                    i11++;
                }
                this.f15411n.d();
            } else {
                w[] wVarArr2 = this.f15418v;
                int length2 = wVarArr2.length;
                while (i11 < length2) {
                    wVarArr2[i11].b();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = b(j10);
            while (i11 < xVarArr.length) {
                if (xVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.F = true;
        return j10;
    }

    private void d(int i10) {
        s();
        boolean[] zArr = this.A.f15440b;
        if (this.L && zArr[i10]) {
            if (this.f15418v[i10].b(false)) {
                return;
            }
            this.K = 0L;
            this.L = false;
            this.G = true;
            this.J = 0L;
            this.M = 0;
            for (w wVar : this.f15418v) {
                wVar.b();
            }
            ((n.a) com.applovin.exoplayer2.l.a.b(this.f15416t)).a((n.a) this);
        }
    }

    public void b(int i10) throws IOException {
        this.f15418v[i10].e();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(com.applovin.exoplayer2.e.v vVar) {
        this.B = this.f15417u == null ? vVar : new v.b(com.anythink.expressad.exoplayer.b.f7291b);
        this.C = vVar.b();
        boolean z10 = this.I == -1 && vVar.b() == com.anythink.expressad.exoplayer.b.f7291b;
        this.D = z10;
        this.E = z10 ? 7 : 1;
        this.f15407j.a(this.C, vVar.a(), this.D);
        if (this.y) {
            return;
        }
        n();
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10, boolean z10) {
        s();
        if (r()) {
            return;
        }
        boolean[] zArr = this.A.f15441c;
        int length = this.f15418v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f15418v[i10].a(j10, z10, zArr[i10]);
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(long j10, av avVar) {
        s();
        if (!this.B.a()) {
            return 0L;
        }
        v.a a10 = this.B.a(j10);
        return avVar.a(j10, a10.f14938a.f14943b, a10.f14939b.f14943b);
    }

    public boolean a(int i10) {
        return !m() && this.f15418v[i10].b(this.N);
    }

    public int a(int i10, com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i11) {
        if (m()) {
            return -3;
        }
        c(i10);
        int a10 = this.f15418v[i10].a(wVar, gVar, i11, this.N);
        if (a10 == -3) {
            d(i10);
        }
        return a10;
    }

    public int a(int i10, long j10) {
        if (m()) {
            return 0;
        }
        c(i10);
        w wVar = this.f15418v[i10];
        int b10 = wVar.b(j10, this.N);
        wVar.a(b10);
        if (b10 == 0) {
            d(i10);
        }
        return b10;
    }

    @Override // com.applovin.exoplayer2.k.w.a
    public void a(a aVar, long j10, long j11) {
        com.applovin.exoplayer2.e.v vVar;
        if (this.C == com.anythink.expressad.exoplayer.b.f7291b && (vVar = this.B) != null) {
            boolean a10 = vVar.a();
            long q10 = q();
            long j12 = q10 == Long.MIN_VALUE ? 0L : q10 + 10000;
            this.C = j12;
            this.f15407j.a(j12, a10, this.D);
        }
        com.applovin.exoplayer2.k.z zVar = aVar.f15425d;
        j jVar = new j(aVar.f15423b, aVar.f15432l, zVar.e(), zVar.f(), j10, j11, zVar.d());
        this.f15404g.a(aVar.f15423b);
        this.f15405h.b(jVar, 1, -1, null, 0, null, aVar.f15431k, this.C);
        a(aVar);
        this.N = true;
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f15416t)).a((n.a) this);
    }

    @Override // com.applovin.exoplayer2.k.w.a
    public void a(a aVar, long j10, long j11, boolean z10) {
        com.applovin.exoplayer2.k.z zVar = aVar.f15425d;
        j jVar = new j(aVar.f15423b, aVar.f15432l, zVar.e(), zVar.f(), j10, j11, zVar.d());
        this.f15404g.a(aVar.f15423b);
        this.f15405h.c(jVar, 1, -1, null, 0, null, aVar.f15431k, this.C);
        if (z10) {
            return;
        }
        a(aVar);
        for (w wVar : this.f15418v) {
            wVar.b();
        }
        if (this.H > 0) {
            ((n.a) com.applovin.exoplayer2.l.a.b(this.f15416t)).a((n.a) this);
        }
    }

    @Override // com.applovin.exoplayer2.k.w.a
    public w.b a(a aVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        w.b bVar;
        a(aVar);
        com.applovin.exoplayer2.k.z zVar = aVar.f15425d;
        j jVar = new j(aVar.f15423b, aVar.f15432l, zVar.e(), zVar.f(), j10, j11, zVar.d());
        long a10 = this.f15404g.a(new v.a(jVar, new m(1, -1, null, 0, null, com.applovin.exoplayer2.h.a(aVar.f15431k), com.applovin.exoplayer2.h.a(this.C)), iOException, i10));
        if (a10 == com.anythink.expressad.exoplayer.b.f7291b) {
            bVar = com.applovin.exoplayer2.k.w.f16206d;
        } else {
            int p10 = p();
            if (p10 > this.M) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            if (a(aVar2, p10)) {
                bVar = com.applovin.exoplayer2.k.w.a(z10, a10);
            } else {
                bVar = com.applovin.exoplayer2.k.w.f16205c;
            }
        }
        boolean z11 = !bVar.a();
        this.f15405h.a(jVar, 1, -1, null, 0, null, aVar.f15431k, this.C, iOException, z11);
        if (z11) {
            this.f15404g.a(aVar.f15423b);
        }
        return bVar;
    }

    @Override // com.applovin.exoplayer2.e.j
    public com.applovin.exoplayer2.e.x a(int i10, int i11) {
        return a(new d(i10, false));
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a() {
        this.f15420x = true;
        this.f15415s.post(this.f15413q);
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a(final com.applovin.exoplayer2.e.v vVar) {
        this.f15415s.post(new Runnable() { // from class: com.applovin.exoplayer2.h.h0
            @Override // java.lang.Runnable
            public final void run() {
                t.this.c(vVar);
            }
        });
    }

    @Override // com.applovin.exoplayer2.h.w.c
    public void a(com.applovin.exoplayer2.v vVar) {
        this.f15415s.post(this.f15413q);
    }

    private com.applovin.exoplayer2.e.x a(d dVar) {
        int length = this.f15418v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f15419w[i10])) {
                return this.f15418v[i10];
            }
        }
        w a10 = w.a(this.f15408k, this.f15415s.getLooper(), this.f, this.f15406i);
        a10.a(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f15419w, i11);
        dVarArr[length] = dVar;
        this.f15419w = (d[]) ai.a((Object[]) dVarArr);
        w[] wVarArr = (w[]) Arrays.copyOf(this.f15418v, i11);
        wVarArr[length] = a10;
        this.f15418v = (w[]) ai.a((Object[]) wVarArr);
        return a10;
    }

    private void a(a aVar) {
        if (this.I == -1) {
            this.I = aVar.f15433m;
        }
    }

    private boolean a(a aVar, int i10) {
        com.applovin.exoplayer2.e.v vVar;
        if (this.I == -1 && ((vVar = this.B) == null || vVar.b() == com.anythink.expressad.exoplayer.b.f7291b)) {
            if (this.y && !m()) {
                this.L = true;
                return false;
            }
            this.G = this.y;
            this.J = 0L;
            this.M = 0;
            for (w wVar : this.f15418v) {
                wVar.b();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.M = i10;
        return true;
    }

    private boolean a(boolean[] zArr, long j10) {
        int length = this.f15418v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f15418v[i10].a(j10, false) && (zArr[i10] || !this.f15421z)) {
                return false;
            }
        }
        return true;
    }
}
