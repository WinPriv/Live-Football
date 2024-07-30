package com.anythink.expressad.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.expressad.exoplayer.e.k;
import com.anythink.expressad.exoplayer.h.r;
import com.anythink.expressad.exoplayer.h.t;
import com.anythink.expressad.exoplayer.h.x;
import com.anythink.expressad.exoplayer.j.t;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class n implements com.anythink.expressad.exoplayer.e.g, r, x.b, t.a<a>, t.d {

    /* renamed from: a, reason: collision with root package name */
    private static final long f8416a = 10000;
    private af A;
    private boolean[] C;
    private boolean[] D;
    private boolean[] E;
    private boolean F;
    private long H;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f8417b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.h f8418c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8419d;

    /* renamed from: e, reason: collision with root package name */
    private final t.a f8420e;
    private final c f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.b f8421g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8422h;

    /* renamed from: i, reason: collision with root package name */
    private final long f8423i;

    /* renamed from: k, reason: collision with root package name */
    private final b f8425k;

    /* renamed from: p, reason: collision with root package name */
    private r.a f8429p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.expressad.exoplayer.e.k f8430q;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8433t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f8434u;

    /* renamed from: v, reason: collision with root package name */
    private int f8435v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8436w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f8437x;
    private boolean y;

    /* renamed from: z, reason: collision with root package name */
    private int f8438z;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.j.t f8424j = new com.anythink.expressad.exoplayer.j.t("Loader:ExtractorMediaPeriod");

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.k.f f8426l = new com.anythink.expressad.exoplayer.k.f();

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f8427m = new Runnable() { // from class: com.anythink.expressad.exoplayer.h.n.1
        @Override // java.lang.Runnable
        public final void run() {
            n.a(n.this);
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f8428n = new Runnable() { // from class: com.anythink.expressad.exoplayer.h.n.2
        @Override // java.lang.Runnable
        public final void run() {
            if (!n.this.M) {
                n.this.f8429p.a((r.a) n.this);
            }
        }
    };
    private final Handler o = new Handler();

    /* renamed from: s, reason: collision with root package name */
    private int[] f8432s = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private x[] f8431r = new x[0];
    private long I = com.anythink.expressad.exoplayer.b.f7291b;
    private long G = -1;
    private long B = com.anythink.expressad.exoplayer.b.f7291b;

    /* loaded from: classes.dex */
    public final class a implements t.c {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f8442b;

        /* renamed from: c, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.j.h f8443c;

        /* renamed from: d, reason: collision with root package name */
        private final b f8444d;

        /* renamed from: e, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.k.f f8445e;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f8446g;

        /* renamed from: i, reason: collision with root package name */
        private long f8448i;

        /* renamed from: j, reason: collision with root package name */
        private com.anythink.expressad.exoplayer.j.k f8449j;

        /* renamed from: l, reason: collision with root package name */
        private long f8451l;
        private final com.anythink.expressad.exoplayer.e.j f = new com.anythink.expressad.exoplayer.e.j();

        /* renamed from: h, reason: collision with root package name */
        private boolean f8447h = true;

        /* renamed from: k, reason: collision with root package name */
        private long f8450k = -1;

        public a(Uri uri, com.anythink.expressad.exoplayer.j.h hVar, b bVar, com.anythink.expressad.exoplayer.k.f fVar) {
            this.f8442b = (Uri) com.anythink.expressad.exoplayer.k.a.a(uri);
            this.f8443c = (com.anythink.expressad.exoplayer.j.h) com.anythink.expressad.exoplayer.k.a.a(hVar);
            this.f8444d = (b) com.anythink.expressad.exoplayer.k.a.a(bVar);
            this.f8445e = fVar;
        }

        public final void a(long j10, long j11) {
            this.f.f7950a = j10;
            this.f8448i = j11;
            this.f8447h = true;
        }

        @Override // com.anythink.expressad.exoplayer.j.t.c
        public final void b() {
            int i10 = 0;
            while (i10 == 0 && !this.f8446g) {
                com.anythink.expressad.exoplayer.e.b bVar = null;
                try {
                    long j10 = this.f.f7950a;
                    com.anythink.expressad.exoplayer.j.k kVar = new com.anythink.expressad.exoplayer.j.k(this.f8442b, j10, n.this.f8422h);
                    this.f8449j = kVar;
                    long a10 = this.f8443c.a(kVar);
                    this.f8450k = a10;
                    if (a10 != -1) {
                        this.f8450k = a10 + j10;
                    }
                    com.anythink.expressad.exoplayer.e.b bVar2 = new com.anythink.expressad.exoplayer.e.b(this.f8443c, j10, this.f8450k);
                    try {
                        com.anythink.expressad.exoplayer.e.e a11 = this.f8444d.a(bVar2, this.f8443c.a());
                        if (this.f8447h) {
                            a11.a(j10, this.f8448i);
                            this.f8447h = false;
                        }
                        while (i10 == 0 && !this.f8446g) {
                            this.f8445e.c();
                            i10 = a11.a(bVar2, this.f);
                            if (bVar2.c() > n.this.f8423i + j10) {
                                j10 = bVar2.c();
                                this.f8445e.b();
                                n.this.o.post(n.this.f8428n);
                            }
                        }
                        if (i10 == 1) {
                            i10 = 0;
                        } else {
                            this.f.f7950a = bVar2.c();
                            this.f8451l = this.f.f7950a - this.f8449j.f8817e;
                        }
                        com.anythink.expressad.exoplayer.k.af.a(this.f8443c);
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        if (i10 != 1 && bVar != null) {
                            this.f.f7950a = bVar.c();
                            this.f8451l = this.f.f7950a - this.f8449j.f8817e;
                        }
                        com.anythink.expressad.exoplayer.k.af.a(this.f8443c);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // com.anythink.expressad.exoplayer.j.t.c
        public final void a() {
            this.f8446g = true;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(long j10, boolean z10);
    }

    /* loaded from: classes.dex */
    public final class d implements y {

        /* renamed from: b, reason: collision with root package name */
        private final int f8456b;

        public d(int i10) {
            this.f8456b = i10;
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final boolean b() {
            return n.this.a(this.f8456b);
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final void c() {
            n.this.h();
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final int a(com.anythink.expressad.exoplayer.n nVar, com.anythink.expressad.exoplayer.c.e eVar, boolean z10) {
            return n.this.a(this.f8456b, nVar, eVar, z10);
        }

        @Override // com.anythink.expressad.exoplayer.h.y
        public final int a(long j10) {
            return n.this.a(this.f8456b, j10);
        }
    }

    public n(Uri uri, com.anythink.expressad.exoplayer.j.h hVar, com.anythink.expressad.exoplayer.e.e[] eVarArr, int i10, t.a aVar, c cVar, com.anythink.expressad.exoplayer.j.b bVar, String str, int i11) {
        this.f8417b = uri;
        this.f8418c = hVar;
        this.f8419d = i10;
        this.f8420e = aVar;
        this.f = cVar;
        this.f8421g = bVar;
        this.f8422h = str;
        this.f8423i = i11;
        this.f8425k = new b(eVarArr, this);
        this.f8435v = i10 == -1 ? 3 : i10;
        aVar.a();
    }

    private boolean j() {
        if (!this.f8437x && !o()) {
            return false;
        }
        return true;
    }

    private void k() {
        if (!this.M && !this.f8434u && this.f8430q != null && this.f8433t) {
            for (x xVar : this.f8431r) {
                if (xVar.f() == null) {
                    return;
                }
            }
            this.f8426l.b();
            int length = this.f8431r.length;
            ae[] aeVarArr = new ae[length];
            this.D = new boolean[length];
            this.C = new boolean[length];
            this.E = new boolean[length];
            this.B = this.f8430q.b();
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (i10 >= length) {
                    break;
                }
                com.anythink.expressad.exoplayer.m f = this.f8431r[i10].f();
                aeVarArr[i10] = new ae(f);
                String str = f.f9257h;
                if (!com.anythink.expressad.exoplayer.k.o.b(str) && !com.anythink.expressad.exoplayer.k.o.a(str)) {
                    z10 = false;
                }
                this.D[i10] = z10;
                this.F = z10 | this.F;
                i10++;
            }
            this.A = new af(aeVarArr);
            if (this.f8419d == -1 && this.G == -1 && this.f8430q.b() == com.anythink.expressad.exoplayer.b.f7291b) {
                this.f8435v = 6;
            }
            this.f8434u = true;
            this.f.a(this.B, this.f8430q.a());
            this.f8429p.a((r) this);
        }
    }

    private void l() {
        a aVar = new a(this.f8417b, this.f8418c, this.f8425k, this.f8426l);
        if (this.f8434u) {
            com.anythink.expressad.exoplayer.k.a.b(o());
            long j10 = this.B;
            if (j10 != com.anythink.expressad.exoplayer.b.f7291b && this.I >= j10) {
                this.L = true;
                this.I = com.anythink.expressad.exoplayer.b.f7291b;
                return;
            } else {
                aVar.a(this.f8430q.a(this.I).f7951a.f7957c, this.I);
                this.I = com.anythink.expressad.exoplayer.b.f7291b;
            }
        }
        this.K = m();
        this.f8420e.a(aVar.f8449j, 1, -1, null, 0, null, aVar.f8448i, this.B, this.f8424j.a(aVar, this, this.f8435v));
    }

    private int m() {
        int i10 = 0;
        for (x xVar : this.f8431r) {
            i10 += xVar.b();
        }
        return i10;
    }

    private long n() {
        long j10 = Long.MIN_VALUE;
        for (x xVar : this.f8431r) {
            j10 = Math.max(j10, xVar.g());
        }
        return j10;
    }

    private boolean o() {
        if (this.I != com.anythink.expressad.exoplayer.b.f7291b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[RETURN] */
    @Override // com.anythink.expressad.exoplayer.j.t.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ int a(com.anythink.expressad.exoplayer.h.n.a r22, long r23, long r25, java.io.IOException r27) {
        /*
            r21 = this;
            r0 = r21
            r12 = r23
            r14 = r25
            r18 = r27
            r10 = r22
            com.anythink.expressad.exoplayer.h.n$a r10 = (com.anythink.expressad.exoplayer.h.n.a) r10
            r1 = r27
            boolean r11 = r1 instanceof com.anythink.expressad.exoplayer.h.ag
            r19 = r11
            com.anythink.expressad.exoplayer.h.t$a r1 = r0.f8420e
            com.anythink.expressad.exoplayer.j.k r2 = com.anythink.expressad.exoplayer.h.n.a.a(r10)
            r3 = 1
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            long r8 = com.anythink.expressad.exoplayer.h.n.a.b(r10)
            long r3 = r0.B
            r24 = r10
            r20 = r11
            r10 = r3
            long r16 = com.anythink.expressad.exoplayer.h.n.a.c(r24)
            r3 = 1
            r4 = -1
            r1.a(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r19)
            r1 = r24
            r0.a(r1)
            if (r20 == 0) goto L3a
            r1 = 3
            return r1
        L3a:
            int r2 = r21.m()
            int r3 = r0.K
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L46
            r3 = r5
            goto L47
        L46:
            r3 = r4
        L47:
            long r6 = r0.G
            r8 = -1
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L8b
            com.anythink.expressad.exoplayer.e.k r6 = r0.f8430q
            if (r6 == 0) goto L61
            long r6 = r6.b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L61
            goto L8b
        L61:
            boolean r2 = r0.f8434u
            if (r2 == 0) goto L6f
            boolean r2 = r21.j()
            if (r2 != 0) goto L6f
            r0.J = r5
            r1 = r4
            goto L8e
        L6f:
            boolean r2 = r0.f8434u
            r0.f8437x = r2
            r6 = 0
            r0.H = r6
            r0.K = r4
            com.anythink.expressad.exoplayer.h.x[] r2 = r0.f8431r
            int r8 = r2.length
            r9 = r4
        L7d:
            if (r9 >= r8) goto L87
            r10 = r2[r9]
            r10.a()
            int r9 = r9 + 1
            goto L7d
        L87:
            r1.a(r6, r6)
            goto L8d
        L8b:
            r0.K = r2
        L8d:
            r1 = r5
        L8e:
            if (r1 == 0) goto L94
            if (r3 == 0) goto L93
            return r5
        L93:
            return r4
        L94:
            r1 = 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.h.n.a(com.anythink.expressad.exoplayer.j.t$c, long, long, java.io.IOException):int");
    }

    @Override // com.anythink.expressad.exoplayer.e.g
    public final void c_() {
        this.f8433t = true;
        this.o.post(this.f8427m);
    }

    public final void h() {
        this.f8424j.a(this.f8435v);
    }

    @Override // com.anythink.expressad.exoplayer.h.x.b
    public final void i() {
        this.o.post(this.f8427m);
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final af b() {
        return this.A;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final boolean c(long j10) {
        if (this.L || this.J) {
            return false;
        }
        if (this.f8434u && this.f8438z == 0) {
            return false;
        }
        boolean a10 = this.f8426l.a();
        if (this.f8424j.a()) {
            return a10;
        }
        l();
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long d() {
        long n10;
        if (this.L) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.I;
        }
        if (this.F) {
            int length = this.f8431r.length;
            n10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.D[i10]) {
                    n10 = Math.min(n10, this.f8431r[i10].g());
                }
            }
        } else {
            n10 = n();
        }
        return n10 == Long.MIN_VALUE ? this.H : n10;
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final long e() {
        if (this.f8438z == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    public final void f() {
        if (this.f8434u) {
            for (x xVar : this.f8431r) {
                xVar.j();
            }
        }
        this.f8424j.a(this);
        this.o.removeCallbacksAndMessages(null);
        this.f8429p = null;
        this.M = true;
        this.f8420e.b();
    }

    @Override // com.anythink.expressad.exoplayer.j.t.d
    public final void g() {
        for (x xVar : this.f8431r) {
            xVar.a();
        }
        this.f8425k.a();
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long b(long j10) {
        if (!this.f8430q.a()) {
            j10 = 0;
        }
        this.H = j10;
        this.f8437x = false;
        if (!o() && d(j10)) {
            return j10;
        }
        this.J = false;
        this.I = j10;
        this.L = false;
        if (this.f8424j.a()) {
            this.f8424j.b();
        } else {
            for (x xVar : this.f8431r) {
                xVar.a();
            }
        }
        return j10;
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long c() {
        if (!this.y) {
            this.f8420e.c();
            this.y = true;
        }
        if (!this.f8437x) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        if (!this.L && m() <= this.K) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        this.f8437x = false;
        return this.H;
    }

    private void c(int i10) {
        if (this.J && this.D[i10] && !this.f8431r[i10].c()) {
            this.I = 0L;
            this.J = false;
            this.f8437x = true;
            this.H = 0L;
            this.K = 0;
            for (x xVar : this.f8431r) {
                xVar.a();
            }
            this.f8429p.a((r.a) this);
        }
    }

    private boolean d(long j10) {
        int length = this.f8431r.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                return true;
            }
            x xVar = this.f8431r[i10];
            xVar.i();
            if ((xVar.a(j10, false) != -1) || (!this.D[i10] && this.F)) {
                i10++;
            }
        }
        return false;
    }

    private void b(int i10) {
        if (this.E[i10]) {
            return;
        }
        com.anythink.expressad.exoplayer.m a10 = this.A.a(i10).a(0);
        this.f8420e.a(com.anythink.expressad.exoplayer.k.o.d(a10.f9257h), a10, 0, (Object) null, this.H);
        this.E[i10] = true;
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.e.e[] f8452a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.e.g f8453b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.expressad.exoplayer.e.e f8454c;

        public b(com.anythink.expressad.exoplayer.e.e[] eVarArr, com.anythink.expressad.exoplayer.e.g gVar) {
            this.f8452a = eVarArr;
            this.f8453b = gVar;
        }

        public final com.anythink.expressad.exoplayer.e.e a(com.anythink.expressad.exoplayer.e.f fVar, Uri uri) {
            com.anythink.expressad.exoplayer.e.e eVar = this.f8454c;
            if (eVar != null) {
                return eVar;
            }
            com.anythink.expressad.exoplayer.e.e[] eVarArr = this.f8452a;
            int length = eVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                com.anythink.expressad.exoplayer.e.e eVar2 = eVarArr[i10];
                try {
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    fVar.a();
                    throw th;
                }
                if (eVar2.a(fVar)) {
                    this.f8454c = eVar2;
                    fVar.a();
                    break;
                }
                continue;
                fVar.a();
                i10++;
            }
            com.anythink.expressad.exoplayer.e.e eVar3 = this.f8454c;
            if (eVar3 != null) {
                eVar3.a(this.f8453b);
                return this.f8454c;
            }
            throw new ag(a3.l.p(new StringBuilder("None of the available extractors ("), com.anythink.expressad.exoplayer.k.af.a(this.f8452a), ") could read the stream."), uri);
        }

        public final void a() {
            if (this.f8454c != null) {
                this.f8454c = null;
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.j.t.a
    public final /* synthetic */ void a(a aVar, long j10, long j11) {
        a aVar2 = aVar;
        if (this.B == com.anythink.expressad.exoplayer.b.f7291b) {
            long n10 = n();
            long j12 = n10 == Long.MIN_VALUE ? 0L : n10 + f8416a;
            this.B = j12;
            this.f.a(j12, this.f8430q.a());
        }
        this.f8420e.a(aVar2.f8449j, 1, -1, null, 0, null, aVar2.f8448i, this.B, j10, j11, aVar2.f8451l);
        a(aVar2);
        this.L = true;
        this.f8429p.a((r.a) this);
    }

    @Override // com.anythink.expressad.exoplayer.h.r, com.anythink.expressad.exoplayer.h.z
    public final void a_(long j10) {
    }

    @Override // com.anythink.expressad.exoplayer.j.t.a
    public final /* synthetic */ void a(a aVar, long j10, long j11, boolean z10) {
        a aVar2 = aVar;
        this.f8420e.b(aVar2.f8449j, 1, -1, null, 0, null, aVar2.f8448i, this.B, j10, j11, aVar2.f8451l);
        if (z10) {
            return;
        }
        a(aVar2);
        for (x xVar : this.f8431r) {
            xVar.a();
        }
        if (this.f8438z > 0) {
            this.f8429p.a((r.a) this);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(r.a aVar, long j10) {
        this.f8429p = aVar;
        this.f8426l.a();
        l();
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a() {
        h();
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long a(com.anythink.expressad.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j10) {
        com.anythink.expressad.exoplayer.i.f fVar;
        com.anythink.expressad.exoplayer.k.a.b(this.f8434u);
        int i10 = this.f8438z;
        int i11 = 0;
        for (int i12 = 0; i12 < fVarArr.length; i12++) {
            y yVar = yVarArr[i12];
            if (yVar != null && (fVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) yVar).f8456b;
                com.anythink.expressad.exoplayer.k.a.b(this.C[i13]);
                this.f8438z--;
                this.C[i13] = false;
                yVarArr[i12] = null;
            }
        }
        boolean z10 = !this.f8436w ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < fVarArr.length; i14++) {
            if (yVarArr[i14] == null && (fVar = fVarArr[i14]) != null) {
                com.anythink.expressad.exoplayer.k.a.b(fVar.g() == 1);
                com.anythink.expressad.exoplayer.k.a.b(fVar.b(0) == 0);
                int a10 = this.A.a(fVar.f());
                com.anythink.expressad.exoplayer.k.a.b(!this.C[a10]);
                this.f8438z++;
                this.C[a10] = true;
                yVarArr[i14] = new d(a10);
                zArr2[i14] = true;
                if (!z10) {
                    x xVar = this.f8431r[a10];
                    xVar.i();
                    z10 = xVar.a(j10, true) == -1 && xVar.e() != 0;
                }
            }
        }
        if (this.f8438z == 0) {
            this.J = false;
            this.f8437x = false;
            if (this.f8424j.a()) {
                x[] xVarArr = this.f8431r;
                int length = xVarArr.length;
                while (i11 < length) {
                    xVarArr[i11].j();
                    i11++;
                }
                this.f8424j.b();
            } else {
                x[] xVarArr2 = this.f8431r;
                int length2 = xVarArr2.length;
                while (i11 < length2) {
                    xVarArr2[i11].a();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = b(j10);
            while (i11 < yVarArr.length) {
                if (yVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f8436w = true;
        return j10;
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final void a(long j10, boolean z10) {
        int length = this.f8431r.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f8431r[i10].a(j10, z10, this.C[i10]);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.r
    public final long a(long j10, com.anythink.expressad.exoplayer.ac acVar) {
        if (!this.f8430q.a()) {
            return 0L;
        }
        k.a a10 = this.f8430q.a(j10);
        return com.anythink.expressad.exoplayer.k.af.a(j10, acVar, a10.f7951a.f7956b, a10.f7952b.f7956b);
    }

    public final boolean a(int i10) {
        if (j()) {
            return false;
        }
        return this.L || this.f8431r[i10].c();
    }

    public final int a(int i10, com.anythink.expressad.exoplayer.n nVar, com.anythink.expressad.exoplayer.c.e eVar, boolean z10) {
        if (j()) {
            return -3;
        }
        int a10 = this.f8431r[i10].a(nVar, eVar, z10, this.L, this.H);
        if (a10 == -4) {
            b(i10);
        } else if (a10 == -3) {
            c(i10);
        }
        return a10;
    }

    public final int a(int i10, long j10) {
        int i11 = 0;
        if (j()) {
            return 0;
        }
        x xVar = this.f8431r[i10];
        if (this.L && j10 > xVar.g()) {
            i11 = xVar.k();
        } else {
            int a10 = xVar.a(j10, true);
            if (a10 != -1) {
                i11 = a10;
            }
        }
        if (i11 > 0) {
            b(i10);
        } else {
            c(i10);
        }
        return i11;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(a aVar, long j10, long j11) {
        if (this.B == com.anythink.expressad.exoplayer.b.f7291b) {
            long n10 = n();
            long j12 = n10 == Long.MIN_VALUE ? 0L : n10 + f8416a;
            this.B = j12;
            this.f.a(j12, this.f8430q.a());
        }
        this.f8420e.a(aVar.f8449j, 1, -1, null, 0, null, aVar.f8448i, this.B, j10, j11, aVar.f8451l);
        a(aVar);
        this.L = true;
        this.f8429p.a((r.a) this);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(a aVar, long j10, long j11, boolean z10) {
        this.f8420e.b(aVar.f8449j, 1, -1, null, 0, null, aVar.f8448i, this.B, j10, j11, aVar.f8451l);
        if (z10) {
            return;
        }
        a(aVar);
        for (x xVar : this.f8431r) {
            xVar.a();
        }
        if (this.f8438z > 0) {
            this.f8429p.a((r.a) this);
        }
    }

    @Override // com.anythink.expressad.exoplayer.e.g
    public final com.anythink.expressad.exoplayer.e.m a(int i10, int i11) {
        int length = this.f8431r.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.f8432s[i12] == i10) {
                return this.f8431r[i12];
            }
        }
        x xVar = new x(this.f8421g);
        xVar.a(this);
        int i13 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f8432s, i13);
        this.f8432s = copyOf;
        copyOf[length] = i10;
        x[] xVarArr = (x[]) Arrays.copyOf(this.f8431r, i13);
        this.f8431r = xVarArr;
        xVarArr[length] = xVar;
        return xVar;
    }

    @Override // com.anythink.expressad.exoplayer.e.g
    public final void a(com.anythink.expressad.exoplayer.e.k kVar) {
        this.f8430q = kVar;
        this.o.post(this.f8427m);
    }

    private void a(a aVar) {
        if (this.G == -1) {
            this.G = aVar.f8450k;
        }
    }

    private boolean a(a aVar, int i10) {
        com.anythink.expressad.exoplayer.e.k kVar;
        if (this.G == -1 && ((kVar = this.f8430q) == null || kVar.b() == com.anythink.expressad.exoplayer.b.f7291b)) {
            if (this.f8434u && !j()) {
                this.J = true;
                return false;
            }
            this.f8437x = this.f8434u;
            this.H = 0L;
            this.K = 0;
            for (x xVar : this.f8431r) {
                xVar.a();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.K = i10;
        return true;
    }

    private static boolean a(IOException iOException) {
        return iOException instanceof ag;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[RETURN] */
    /* renamed from: a, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a2(com.anythink.expressad.exoplayer.h.n.a r22, long r23, long r25, java.io.IOException r27) {
        /*
            r21 = this;
            r0 = r21
            r12 = r23
            r14 = r25
            r18 = r27
            r1 = r27
            boolean r10 = r1 instanceof com.anythink.expressad.exoplayer.h.ag
            r19 = r10
            com.anythink.expressad.exoplayer.h.t$a r1 = r0.f8420e
            com.anythink.expressad.exoplayer.j.k r2 = com.anythink.expressad.exoplayer.h.n.a.a(r22)
            r3 = 1
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            long r8 = com.anythink.expressad.exoplayer.h.n.a.b(r22)
            long r3 = r0.B
            r20 = r10
            r10 = r3
            long r16 = com.anythink.expressad.exoplayer.h.n.a.c(r22)
            r3 = 1
            r4 = -1
            r1.a(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r19)
            r21.a(r22)
            if (r20 == 0) goto L32
            r1 = 3
            return r1
        L32:
            int r1 = r21.m()
            int r2 = r0.K
            r3 = 0
            r4 = 1
            if (r1 <= r2) goto L3e
            r2 = r4
            goto L3f
        L3e:
            r2 = r3
        L3f:
            long r5 = r0.G
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L85
            com.anythink.expressad.exoplayer.e.k r5 = r0.f8430q
            if (r5 == 0) goto L59
            long r5 = r5.b()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L59
            goto L85
        L59:
            boolean r1 = r0.f8434u
            if (r1 == 0) goto L67
            boolean r1 = r21.j()
            if (r1 != 0) goto L67
            r0.J = r4
            r1 = r3
            goto L88
        L67:
            boolean r1 = r0.f8434u
            r0.f8437x = r1
            r5 = 0
            r0.H = r5
            r0.K = r3
            com.anythink.expressad.exoplayer.h.x[] r1 = r0.f8431r
            int r7 = r1.length
            r8 = r3
        L75:
            if (r8 >= r7) goto L7f
            r9 = r1[r8]
            r9.a()
            int r8 = r8 + 1
            goto L75
        L7f:
            r8 = r22
            r8.a(r5, r5)
            goto L87
        L85:
            r0.K = r1
        L87:
            r1 = r4
        L88:
            if (r1 == 0) goto L8e
            if (r2 == 0) goto L8d
            return r4
        L8d:
            return r3
        L8e:
            r1 = 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.h.n.a2(com.anythink.expressad.exoplayer.h.n$a, long, long, java.io.IOException):int");
    }

    public static /* synthetic */ void a(n nVar) {
        if (nVar.M || nVar.f8434u || nVar.f8430q == null || !nVar.f8433t) {
            return;
        }
        for (x xVar : nVar.f8431r) {
            if (xVar.f() == null) {
                return;
            }
        }
        nVar.f8426l.b();
        int length = nVar.f8431r.length;
        ae[] aeVarArr = new ae[length];
        nVar.D = new boolean[length];
        nVar.C = new boolean[length];
        nVar.E = new boolean[length];
        nVar.B = nVar.f8430q.b();
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                break;
            }
            com.anythink.expressad.exoplayer.m f = nVar.f8431r[i10].f();
            aeVarArr[i10] = new ae(f);
            String str = f.f9257h;
            if (!com.anythink.expressad.exoplayer.k.o.b(str) && !com.anythink.expressad.exoplayer.k.o.a(str)) {
                z10 = false;
            }
            nVar.D[i10] = z10;
            nVar.F = z10 | nVar.F;
            i10++;
        }
        nVar.A = new af(aeVarArr);
        if (nVar.f8419d == -1 && nVar.G == -1 && nVar.f8430q.b() == com.anythink.expressad.exoplayer.b.f7291b) {
            nVar.f8435v = 6;
        }
        nVar.f8434u = true;
        nVar.f.a(nVar.B, nVar.f8430q.a());
        nVar.f8429p.a((r) nVar);
    }
}
