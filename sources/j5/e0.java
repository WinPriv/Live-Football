package j5;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import j5.d0;
import java.io.EOFException;
import java.io.IOException;
import k4.i0;
import p4.w;

/* compiled from: SampleQueue.java */
/* loaded from: classes2.dex */
public class e0 implements p4.w {
    public k4.i0 A;
    public k4.i0 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f29713a;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.f f29716d;

    /* renamed from: e, reason: collision with root package name */
    public final e.a f29717e;
    public c f;

    /* renamed from: g, reason: collision with root package name */
    public k4.i0 f29718g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.exoplayer2.drm.d f29719h;

    /* renamed from: p, reason: collision with root package name */
    public int f29726p;

    /* renamed from: q, reason: collision with root package name */
    public int f29727q;

    /* renamed from: r, reason: collision with root package name */
    public int f29728r;

    /* renamed from: s, reason: collision with root package name */
    public int f29729s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f29733w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f29735z;

    /* renamed from: b, reason: collision with root package name */
    public final a f29714b = new a();

    /* renamed from: i, reason: collision with root package name */
    public int f29720i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public int[] f29721j = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f29722k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f29725n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f29724m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f29723l = new int[1000];
    public w.a[] o = new w.a[1000];

    /* renamed from: c, reason: collision with root package name */
    public final l0<b> f29715c = new l0<>(new com.applovin.exoplayer2.d.w(15));

    /* renamed from: t, reason: collision with root package name */
    public long f29730t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f29731u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f29732v = Long.MIN_VALUE;
    public boolean y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29734x = true;

    /* compiled from: SampleQueue.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f29736a;

        /* renamed from: b, reason: collision with root package name */
        public long f29737b;

        /* renamed from: c, reason: collision with root package name */
        public w.a f29738c;
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final k4.i0 f29739a;

        /* renamed from: b, reason: collision with root package name */
        public final f.b f29740b;

        public b(k4.i0 i0Var, f.b bVar) {
            this.f29739a = i0Var;
            this.f29740b = bVar;
        }
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    public e0(c6.b bVar, com.google.android.exoplayer2.drm.f fVar, e.a aVar) {
        this.f29716d = fVar;
        this.f29717e = aVar;
        this.f29713a = new d0(bVar);
    }

    @Override // p4.w
    public final void b(k4.i0 i0Var) {
        boolean z10;
        k4.i0 m10 = m(i0Var);
        boolean z11 = false;
        this.f29735z = false;
        this.A = i0Var;
        synchronized (this) {
            this.y = false;
            if (!d6.g0.a(m10, this.B)) {
                if (this.f29715c.f29796b.size() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (this.f29715c.f29796b.valueAt(r5.size() - 1).f29739a.equals(m10)) {
                        this.B = this.f29715c.f29796b.valueAt(r5.size() - 1).f29739a;
                        k4.i0 i0Var2 = this.B;
                        this.D = d6.r.a(i0Var2.D, i0Var2.A);
                        this.E = false;
                        z11 = true;
                    }
                }
                this.B = m10;
                k4.i0 i0Var22 = this.B;
                this.D = d6.r.a(i0Var22.D, i0Var22.A);
                this.E = false;
                z11 = true;
            }
        }
        c cVar = this.f;
        if (cVar != null && z11) {
            cVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0132, code lost:
    
        if (r16.f29715c.f29796b.valueAt(r0.size() - 1).f29739a.equals(r16.B) == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p4.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r17, int r19, int r20, int r21, p4.w.a r22) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.e0.c(long, int, int, int, p4.w$a):void");
    }

    @Override // p4.w
    public final int d(c6.h hVar, int i10, boolean z10) throws IOException {
        d0 d0Var = this.f29713a;
        int c10 = d0Var.c(i10);
        d0.a aVar = d0Var.f;
        c6.a aVar2 = aVar.f29707c;
        int read = hVar.read(aVar2.f3286a, ((int) (d0Var.f29704g - aVar.f29705a)) + aVar2.f3287b, c10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = d0Var.f29704g + read;
        d0Var.f29704g = j10;
        d0.a aVar3 = d0Var.f;
        if (j10 == aVar3.f29706b) {
            d0Var.f = aVar3.f29708d;
            return read;
        }
        return read;
    }

    @Override // p4.w
    public final void e(int i10, d6.w wVar) {
        while (true) {
            d0 d0Var = this.f29713a;
            if (i10 > 0) {
                int c10 = d0Var.c(i10);
                d0.a aVar = d0Var.f;
                c6.a aVar2 = aVar.f29707c;
                wVar.b(aVar2.f3286a, ((int) (d0Var.f29704g - aVar.f29705a)) + aVar2.f3287b, c10);
                i10 -= c10;
                long j10 = d0Var.f29704g + c10;
                d0Var.f29704g = j10;
                d0.a aVar3 = d0Var.f;
                if (j10 == aVar3.f29706b) {
                    d0Var.f = aVar3.f29708d;
                }
            } else {
                d0Var.getClass();
                return;
            }
        }
    }

    public final long g(int i10) {
        this.f29731u = Math.max(this.f29731u, n(i10));
        this.f29726p -= i10;
        int i11 = this.f29727q + i10;
        this.f29727q = i11;
        int i12 = this.f29728r + i10;
        this.f29728r = i12;
        int i13 = this.f29720i;
        if (i12 >= i13) {
            this.f29728r = i12 - i13;
        }
        int i14 = this.f29729s - i10;
        this.f29729s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f29729s = 0;
        }
        while (true) {
            l0<b> l0Var = this.f29715c;
            SparseArray<b> sparseArray = l0Var.f29796b;
            if (i15 >= sparseArray.size() - 1) {
                break;
            }
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            l0Var.f29797c.accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = l0Var.f29795a;
            if (i17 > 0) {
                l0Var.f29795a = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f29726p == 0) {
            int i18 = this.f29728r;
            if (i18 == 0) {
                i18 = this.f29720i;
            }
            return this.f29722k[i18 - 1] + this.f29723l[r7];
        }
        return this.f29722k[this.f29728r];
    }

    public final void h(long j10, boolean z10, boolean z11) {
        long j11;
        int i10;
        d0 d0Var = this.f29713a;
        synchronized (this) {
            int i11 = this.f29726p;
            if (i11 != 0) {
                long[] jArr = this.f29725n;
                int i12 = this.f29728r;
                if (j10 >= jArr[i12]) {
                    if (z11 && (i10 = this.f29729s) != i11) {
                        i11 = i10 + 1;
                    }
                    int l10 = l(i12, i11, j10, z10);
                    if (l10 != -1) {
                        j11 = g(l10);
                    } else {
                        j11 = -1;
                    }
                }
            }
            j11 = -1;
        }
        d0Var.b(j11);
    }

    public final void i() {
        long g6;
        d0 d0Var = this.f29713a;
        synchronized (this) {
            int i10 = this.f29726p;
            if (i10 == 0) {
                g6 = -1;
            } else {
                g6 = g(i10);
            }
        }
        d0Var.b(g6);
    }

    public final long j(int i10) {
        boolean z10;
        int i11 = this.f29727q;
        int i12 = this.f29726p;
        int i13 = (i11 + i12) - i10;
        boolean z11 = false;
        if (i13 >= 0 && i13 <= i12 - this.f29729s) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        int i14 = this.f29726p - i13;
        this.f29726p = i14;
        this.f29732v = Math.max(this.f29731u, n(i14));
        if (i13 == 0 && this.f29733w) {
            z11 = true;
        }
        this.f29733w = z11;
        l0<b> l0Var = this.f29715c;
        SparseArray<b> sparseArray = l0Var.f29796b;
        int i15 = -1;
        for (int size = sparseArray.size() - 1; size >= 0 && i10 < sparseArray.keyAt(size); size--) {
            l0Var.f29797c.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i15 = Math.min(l0Var.f29795a, sparseArray.size() - 1);
        }
        l0Var.f29795a = i15;
        int i16 = this.f29726p;
        if (i16 != 0) {
            return this.f29722k[o(i16 - 1)] + this.f29723l[r9];
        }
        return 0L;
    }

    public final void k(int i10) {
        boolean z10;
        long j10 = j(i10);
        d0 d0Var = this.f29713a;
        if (j10 <= d0Var.f29704g) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        d0Var.f29704g = j10;
        int i11 = d0Var.f29700b;
        if (j10 != 0) {
            d0.a aVar = d0Var.f29702d;
            if (j10 != aVar.f29705a) {
                while (d0Var.f29704g > aVar.f29706b) {
                    aVar = aVar.f29708d;
                }
                d0.a aVar2 = aVar.f29708d;
                aVar2.getClass();
                d0Var.a(aVar2);
                d0.a aVar3 = new d0.a(aVar.f29706b, i11);
                aVar.f29708d = aVar3;
                if (d0Var.f29704g == aVar.f29706b) {
                    aVar = aVar3;
                }
                d0Var.f = aVar;
                if (d0Var.f29703e == aVar2) {
                    d0Var.f29703e = aVar3;
                    return;
                }
                return;
            }
        }
        d0Var.a(d0Var.f29702d);
        d0.a aVar4 = new d0.a(d0Var.f29704g, i11);
        d0Var.f29702d = aVar4;
        d0Var.f29703e = aVar4;
        d0Var.f = aVar4;
    }

    public final int l(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f29725n[i10];
            if (j11 <= j10) {
                if (!z10 || (this.f29724m[i10] & 1) != 0) {
                    if (j11 == j10) {
                        return i13;
                    }
                    i12 = i13;
                }
                i10++;
                if (i10 == this.f29720i) {
                    i10 = 0;
                }
            } else {
                return i12;
            }
        }
        return i12;
    }

    public k4.i0 m(k4.i0 i0Var) {
        if (this.F != 0 && i0Var.H != Long.MAX_VALUE) {
            i0.a a10 = i0Var.a();
            a10.o = i0Var.H + this.F;
            return a10.a();
        }
        return i0Var;
    }

    public final long n(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int o = o(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f29725n[o]);
            if ((this.f29724m[o] & 1) != 0) {
                break;
            }
            o--;
            if (o == -1) {
                o = this.f29720i - 1;
            }
        }
        return j10;
    }

    public final int o(int i10) {
        int i11 = this.f29728r + i10;
        int i12 = this.f29720i;
        if (i11 >= i12) {
            return i11 - i12;
        }
        return i11;
    }

    public final synchronized int p(long j10, boolean z10) {
        boolean z11;
        int o = o(this.f29729s);
        int i10 = this.f29729s;
        int i11 = this.f29726p;
        if (i10 != i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && j10 >= this.f29725n[o]) {
            if (j10 > this.f29732v && z10) {
                return i11 - i10;
            }
            int l10 = l(o, i11 - i10, j10, true);
            if (l10 == -1) {
                return 0;
            }
            return l10;
        }
        return 0;
    }

    public final synchronized k4.i0 q() {
        k4.i0 i0Var;
        if (this.y) {
            i0Var = null;
        } else {
            i0Var = this.B;
        }
        return i0Var;
    }

    public final synchronized boolean r(boolean z10) {
        boolean z11;
        k4.i0 i0Var;
        int i10 = this.f29729s;
        boolean z12 = true;
        if (i10 != this.f29726p) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f29733w && ((i0Var = this.B) == null || i0Var == this.f29718g)) {
                z12 = false;
            }
            return z12;
        }
        if (this.f29715c.a(this.f29727q + i10).f29739a != this.f29718g) {
            return true;
        }
        return s(o(this.f29729s));
    }

    public final boolean s(int i10) {
        com.google.android.exoplayer2.drm.d dVar = this.f29719h;
        if (dVar != null && dVar.getState() != 4 && ((this.f29724m[i10] & 1073741824) != 0 || !this.f29719h.e())) {
            return false;
        }
        return true;
    }

    public final void t() throws IOException {
        com.google.android.exoplayer2.drm.d dVar = this.f29719h;
        if (dVar != null && dVar.getState() == 1) {
            d.a error = this.f29719h.getError();
            error.getClass();
            throw error;
        }
    }

    public final void u(k4.i0 i0Var, j1.a aVar) {
        boolean z10;
        DrmInitData drmInitData;
        k4.i0 i0Var2;
        k4.i0 i0Var3 = this.f29718g;
        if (i0Var3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            drmInitData = null;
        } else {
            drmInitData = i0Var3.G;
        }
        this.f29718g = i0Var;
        DrmInitData drmInitData2 = i0Var.G;
        com.google.android.exoplayer2.drm.f fVar = this.f29716d;
        if (fVar != null) {
            i0Var2 = i0Var.b(fVar.f(i0Var));
        } else {
            i0Var2 = i0Var;
        }
        aVar.f29569u = i0Var2;
        aVar.f29568t = this.f29719h;
        if (fVar == null) {
            return;
        }
        if (!z10 && d6.g0.a(drmInitData, drmInitData2)) {
            return;
        }
        com.google.android.exoplayer2.drm.d dVar = this.f29719h;
        e.a aVar2 = this.f29717e;
        com.google.android.exoplayer2.drm.d e10 = fVar.e(aVar2, i0Var);
        this.f29719h = e10;
        aVar.f29568t = e10;
        if (dVar != null) {
            dVar.b(aVar2);
        }
    }

    public final int v(j1.a aVar, n4.g gVar, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13 = false;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a aVar2 = this.f29714b;
        synchronized (this) {
            gVar.f33323v = false;
            int i12 = this.f29729s;
            if (i12 != this.f29726p) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                if (!z10 && !this.f29733w) {
                    k4.i0 i0Var = this.B;
                    if (i0Var != null && (z11 || i0Var != this.f29718g)) {
                        u(i0Var, aVar);
                        i11 = -5;
                    } else {
                        i11 = -3;
                    }
                }
                gVar.f33298s = 4;
                i11 = -4;
            } else {
                k4.i0 i0Var2 = this.f29715c.a(this.f29727q + i12).f29739a;
                if (!z11 && i0Var2 == this.f29718g) {
                    int o = o(this.f29729s);
                    if (!s(o)) {
                        gVar.f33323v = true;
                        i11 = -3;
                    } else {
                        gVar.f33298s = this.f29724m[o];
                        long j10 = this.f29725n[o];
                        gVar.f33324w = j10;
                        if (j10 < this.f29730t) {
                            gVar.e(Integer.MIN_VALUE);
                        }
                        aVar2.f29736a = this.f29723l[o];
                        aVar2.f29737b = this.f29722k[o];
                        aVar2.f29738c = this.o[o];
                        i11 = -4;
                    }
                }
                u(i0Var2, aVar);
                i11 = -5;
            }
        }
        if (i11 == -4 && !gVar.f(4)) {
            if ((i10 & 1) != 0) {
                z13 = true;
            }
            if ((i10 & 4) == 0) {
                if (z13) {
                    d0 d0Var = this.f29713a;
                    d0.f(d0Var.f29703e, gVar, this.f29714b, d0Var.f29701c);
                } else {
                    d0 d0Var2 = this.f29713a;
                    d0Var2.f29703e = d0.f(d0Var2.f29703e, gVar, this.f29714b, d0Var2.f29701c);
                }
            }
            if (!z13) {
                this.f29729s++;
            }
        }
        return i11;
    }

    public final void w(boolean z10) {
        boolean z11;
        l0<b> l0Var;
        SparseArray<b> sparseArray;
        d0 d0Var = this.f29713a;
        d0Var.a(d0Var.f29702d);
        d0.a aVar = d0Var.f29702d;
        int i10 = 0;
        if (aVar.f29707c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        d6.a.d(z11);
        aVar.f29705a = 0L;
        aVar.f29706b = d0Var.f29700b + 0;
        d0.a aVar2 = d0Var.f29702d;
        d0Var.f29703e = aVar2;
        d0Var.f = aVar2;
        d0Var.f29704g = 0L;
        ((c6.n) d0Var.f29699a).a();
        this.f29726p = 0;
        this.f29727q = 0;
        this.f29728r = 0;
        this.f29729s = 0;
        this.f29734x = true;
        this.f29730t = Long.MIN_VALUE;
        this.f29731u = Long.MIN_VALUE;
        this.f29732v = Long.MIN_VALUE;
        this.f29733w = false;
        while (true) {
            l0Var = this.f29715c;
            sparseArray = l0Var.f29796b;
            if (i10 >= sparseArray.size()) {
                break;
            }
            l0Var.f29797c.accept(sparseArray.valueAt(i10));
            i10++;
        }
        l0Var.f29795a = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }

    public final synchronized boolean x(long j10, boolean z10) {
        boolean z11;
        synchronized (this) {
            this.f29729s = 0;
            d0 d0Var = this.f29713a;
            d0Var.f29703e = d0Var.f29702d;
        }
        int o = o(0);
        int i10 = this.f29729s;
        int i11 = this.f29726p;
        if (i10 != i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && j10 >= this.f29725n[o] && (j10 <= this.f29732v || z10)) {
            int l10 = l(o, i11 - i10, j10, true);
            if (l10 == -1) {
                return false;
            }
            this.f29730t = j10;
            this.f29729s += l10;
            return true;
        }
        return false;
    }

    public final synchronized void y(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f29729s + i10 <= this.f29726p) {
                    z10 = true;
                    d6.a.a(z10);
                    this.f29729s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        d6.a.a(z10);
        this.f29729s += i10;
    }
}
