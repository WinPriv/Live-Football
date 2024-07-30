package j5;

import android.net.Uri;
import c6.a0;
import c6.b0;
import c6.j;
import j5.s;
import j5.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import k4.m1;

/* compiled from: SingleSampleMediaPeriod.java */
/* loaded from: classes2.dex */
public final class j0 implements s, b0.a<b> {
    public final k4.i0 B;
    public final boolean C;
    public boolean D;
    public byte[] E;
    public int F;

    /* renamed from: s, reason: collision with root package name */
    public final c6.m f29767s;

    /* renamed from: t, reason: collision with root package name */
    public final j.a f29768t;

    /* renamed from: u, reason: collision with root package name */
    public final c6.h0 f29769u;

    /* renamed from: v, reason: collision with root package name */
    public final c6.a0 f29770v;

    /* renamed from: w, reason: collision with root package name */
    public final x.a f29771w;

    /* renamed from: x, reason: collision with root package name */
    public final n0 f29772x;

    /* renamed from: z, reason: collision with root package name */
    public final long f29773z;
    public final ArrayList<a> y = new ArrayList<>();
    public final c6.b0 A = new c6.b0("SingleSampleMediaPeriod");

    /* compiled from: SingleSampleMediaPeriod.java */
    /* loaded from: classes2.dex */
    public final class a implements f0 {

        /* renamed from: s, reason: collision with root package name */
        public int f29774s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f29775t;

        public a() {
        }

        @Override // j5.f0
        public final void a() throws IOException {
            j0 j0Var = j0.this;
            if (!j0Var.C) {
                j0Var.A.a();
            }
        }

        public final void b() {
            if (!this.f29775t) {
                j0 j0Var = j0.this;
                j0Var.f29771w.b(d6.r.i(j0Var.B.D), j0Var.B, 0, null, 0L);
                this.f29775t = true;
            }
        }

        @Override // j5.f0
        public final int i(long j10) {
            b();
            if (j10 > 0 && this.f29774s != 2) {
                this.f29774s = 2;
                return 1;
            }
            return 0;
        }

        @Override // j5.f0
        public final boolean isReady() {
            return j0.this.D;
        }

        @Override // j5.f0
        public final int m(j1.a aVar, n4.g gVar, int i10) {
            b();
            j0 j0Var = j0.this;
            boolean z10 = j0Var.D;
            if (z10 && j0Var.E == null) {
                this.f29774s = 2;
            }
            int i11 = this.f29774s;
            if (i11 == 2) {
                gVar.e(4);
                return -4;
            }
            if ((i10 & 2) == 0 && i11 != 0) {
                if (!z10) {
                    return -3;
                }
                j0Var.E.getClass();
                gVar.e(1);
                gVar.f33324w = 0L;
                if ((i10 & 4) == 0) {
                    gVar.j(j0Var.F);
                    gVar.f33322u.put(j0Var.E, 0, j0Var.F);
                }
                if ((i10 & 1) == 0) {
                    this.f29774s = 2;
                }
                return -4;
            }
            aVar.f29569u = j0Var.B;
            this.f29774s = 1;
            return -5;
        }
    }

    public j0(c6.m mVar, j.a aVar, c6.h0 h0Var, k4.i0 i0Var, long j10, c6.a0 a0Var, x.a aVar2, boolean z10) {
        this.f29767s = mVar;
        this.f29768t = aVar;
        this.f29769u = h0Var;
        this.B = i0Var;
        this.f29773z = j10;
        this.f29770v = a0Var;
        this.f29771w = aVar2;
        this.C = z10;
        this.f29772x = new n0(new m0("", i0Var));
    }

    @Override // j5.s, j5.g0
    public final long b() {
        if (!this.D && !this.A.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // j5.s, j5.g0
    public final boolean c(long j10) {
        if (!this.D) {
            c6.b0 b0Var = this.A;
            if (!b0Var.d() && !b0Var.c()) {
                c6.j a10 = this.f29768t.a();
                c6.h0 h0Var = this.f29769u;
                if (h0Var != null) {
                    a10.b(h0Var);
                }
                b bVar = new b(a10, this.f29767s);
                this.f29771w.n(new o(bVar.f29777a, this.f29767s, b0Var.f(bVar, this, this.f29770v.c(1))), 1, -1, this.B, 0, null, 0L, this.f29773z);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // j5.s, j5.g0
    public final long e() {
        if (this.D) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // c6.b0.a
    public final void g(b bVar, long j10, long j11) {
        b bVar2 = bVar;
        this.F = (int) bVar2.f29779c.f3355b;
        byte[] bArr = bVar2.f29780d;
        bArr.getClass();
        this.E = bArr;
        this.D = true;
        c6.g0 g0Var = bVar2.f29779c;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.f29770v.getClass();
        this.f29771w.h(oVar, 1, -1, this.B, 0, null, 0L, this.f29773z);
    }

    @Override // j5.s, j5.g0
    public final boolean isLoading() {
        return this.A.d();
    }

    @Override // j5.s
    public final void k(s.a aVar, long j10) {
        aVar.a(this);
    }

    @Override // j5.s
    public final long l(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList<a> arrayList = this.y;
            if (i10 < arrayList.size()) {
                a aVar = arrayList.get(i10);
                if (aVar.f29774s == 2) {
                    aVar.f29774s = 1;
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override // c6.b0.a
    public final b0.b n(b bVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        b0.b bVar2;
        c6.g0 g0Var = bVar.f29779c;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        d6.g0.S(this.f29773z);
        a0.c cVar = new a0.c(iOException, i10);
        c6.a0 a0Var = this.f29770v;
        long a10 = a0Var.a(cVar);
        if (a10 != com.anythink.expressad.exoplayer.b.f7291b && i10 < a0Var.c(1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.C && z10) {
            d6.p.g("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.D = true;
            bVar2 = c6.b0.f3297e;
        } else if (a10 != com.anythink.expressad.exoplayer.b.f7291b) {
            bVar2 = new b0.b(0, a10);
        } else {
            bVar2 = c6.b0.f;
        }
        b0.b bVar3 = bVar2;
        this.f29771w.j(oVar, 1, -1, this.B, 0, null, 0L, this.f29773z, iOException, !bVar3.a());
        return bVar3;
    }

    @Override // j5.s
    public final long o(b6.f[] fVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            f0 f0Var = f0VarArr[i10];
            ArrayList<a> arrayList = this.y;
            if (f0Var != null && (fVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(f0Var);
                f0VarArr[i10] = null;
            }
            if (f0VarArr[i10] == null && fVarArr[i10] != null) {
                a aVar = new a();
                arrayList.add(aVar);
                f0VarArr[i10] = aVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // j5.s
    public final long p() {
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // c6.b0.a
    public final void q(b bVar, long j10, long j11, boolean z10) {
        c6.g0 g0Var = bVar.f29779c;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.f29770v.getClass();
        this.f29771w.e(oVar, 1, -1, null, 0, null, 0L, this.f29773z);
    }

    @Override // j5.s
    public final n0 r() {
        return this.f29772x;
    }

    /* compiled from: SingleSampleMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class b implements b0.d {

        /* renamed from: a, reason: collision with root package name */
        public final long f29777a = o.f29817b.getAndIncrement();

        /* renamed from: b, reason: collision with root package name */
        public final c6.m f29778b;

        /* renamed from: c, reason: collision with root package name */
        public final c6.g0 f29779c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f29780d;

        public b(c6.j jVar, c6.m mVar) {
            this.f29778b = mVar;
            this.f29779c = new c6.g0(jVar);
        }

        @Override // c6.b0.d
        public final void load() throws IOException {
            c6.g0 g0Var = this.f29779c;
            g0Var.f3355b = 0L;
            try {
                g0Var.f(this.f29778b);
                int i10 = 0;
                while (i10 != -1) {
                    int i11 = (int) g0Var.f3355b;
                    byte[] bArr = this.f29780d;
                    if (bArr == null) {
                        this.f29780d = new byte[1024];
                    } else if (i11 == bArr.length) {
                        this.f29780d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f29780d;
                    i10 = g0Var.read(bArr2, i11, bArr2.length - i11);
                }
            } finally {
                androidx.activity.n.o0(g0Var);
            }
        }

        @Override // c6.b0.d
        public final void a() {
        }
    }

    @Override // j5.s
    public final void j() {
    }

    @Override // j5.s, j5.g0
    public final void f(long j10) {
    }

    @Override // j5.s
    public final long d(long j10, m1 m1Var) {
        return j10;
    }

    @Override // j5.s
    public final void t(long j10, boolean z10) {
    }
}
