package l5;

import android.net.Uri;
import c6.a0;
import c6.b0;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.source.dash.d;
import j5.d0;
import j5.e0;
import j5.f0;
import j5.g0;
import j5.o;
import j5.r;
import j5.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.i0;
import l5.h;

/* compiled from: ChunkSampleStream.java */
/* loaded from: classes2.dex */
public final class g<T extends h> implements f0, g0, b0.a<e>, b0.e {
    public final b0 A;
    public final b0.j B;
    public final ArrayList<l5.a> C;
    public final List<l5.a> D;
    public final e0 E;
    public final e0[] F;
    public final c G;
    public e H;
    public i0 I;
    public b<T> J;
    public long K;
    public long L;
    public int M;
    public l5.a N;
    public boolean O;

    /* renamed from: s, reason: collision with root package name */
    public final int f32513s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f32514t;

    /* renamed from: u, reason: collision with root package name */
    public final i0[] f32515u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f32516v;

    /* renamed from: w, reason: collision with root package name */
    public final T f32517w;

    /* renamed from: x, reason: collision with root package name */
    public final g0.a<g<T>> f32518x;
    public final x.a y;

    /* renamed from: z, reason: collision with root package name */
    public final a0 f32519z;

    /* compiled from: ChunkSampleStream.java */
    /* loaded from: classes2.dex */
    public interface b<T extends h> {
    }

    public g(int i10, int[] iArr, i0[] i0VarArr, T t10, g0.a<g<T>> aVar, c6.b bVar, long j10, com.google.android.exoplayer2.drm.f fVar, e.a aVar2, a0 a0Var, x.a aVar3) {
        this.f32513s = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f32514t = iArr;
        this.f32515u = i0VarArr == null ? new i0[0] : i0VarArr;
        this.f32517w = t10;
        this.f32518x = aVar;
        this.y = aVar3;
        this.f32519z = a0Var;
        this.A = new b0("ChunkSampleStream");
        this.B = new b0.j();
        ArrayList<l5.a> arrayList = new ArrayList<>();
        this.C = arrayList;
        this.D = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.F = new e0[length];
        this.f32516v = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        e0[] e0VarArr = new e0[i12];
        fVar.getClass();
        aVar2.getClass();
        e0 e0Var = new e0(bVar, fVar, aVar2);
        this.E = e0Var;
        iArr2[0] = i10;
        e0VarArr[0] = e0Var;
        while (i11 < length) {
            e0 e0Var2 = new e0(bVar, null, null);
            this.F[i11] = e0Var2;
            int i13 = i11 + 1;
            e0VarArr[i13] = e0Var2;
            iArr2[i13] = this.f32514t[i11];
            i11 = i13;
        }
        this.G = new c(iArr2, e0VarArr);
        this.K = j10;
        this.L = j10;
    }

    public final void A(long j10) {
        l5.a aVar;
        boolean z10;
        boolean x10;
        this.L = j10;
        if (w()) {
            this.K = j10;
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.C.size(); i11++) {
            aVar = this.C.get(i11);
            long j11 = aVar.f32510g;
            if (j11 == j10 && aVar.f32484k == com.anythink.expressad.exoplayer.b.f7291b) {
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null) {
            e0 e0Var = this.E;
            int d10 = aVar.d(0);
            synchronized (e0Var) {
                synchronized (e0Var) {
                    e0Var.f29729s = 0;
                    d0 d0Var = e0Var.f29713a;
                    d0Var.f29703e = d0Var.f29702d;
                }
            }
            int i12 = e0Var.f29727q;
            if (d10 >= i12 && d10 <= e0Var.f29726p + i12) {
                e0Var.f29730t = Long.MIN_VALUE;
                e0Var.f29729s = d10 - i12;
                x10 = true;
            }
            x10 = false;
        } else {
            e0 e0Var2 = this.E;
            if (j10 < b()) {
                z10 = true;
            } else {
                z10 = false;
            }
            x10 = e0Var2.x(j10, z10);
        }
        if (x10) {
            e0 e0Var3 = this.E;
            this.M = y(e0Var3.f29727q + e0Var3.f29729s, 0);
            e0[] e0VarArr = this.F;
            int length = e0VarArr.length;
            while (i10 < length) {
                e0VarArr[i10].x(j10, true);
                i10++;
            }
            return;
        }
        this.K = j10;
        this.O = false;
        this.C.clear();
        this.M = 0;
        if (this.A.d()) {
            this.E.i();
            e0[] e0VarArr2 = this.F;
            int length2 = e0VarArr2.length;
            while (i10 < length2) {
                e0VarArr2[i10].i();
                i10++;
            }
            this.A.b();
            return;
        }
        this.A.f3300c = null;
        this.E.w(false);
        for (e0 e0Var4 : this.F) {
            e0Var4.w(false);
        }
    }

    @Override // j5.f0
    public final void a() throws IOException {
        b0 b0Var = this.A;
        b0Var.a();
        this.E.t();
        if (!b0Var.d()) {
            this.f32517w.a();
        }
    }

    @Override // j5.g0
    public final long b() {
        if (w()) {
            return this.K;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return u().f32511h;
    }

    @Override // j5.g0
    public final boolean c(long j10) {
        long j11;
        List<l5.a> list;
        if (!this.O) {
            b0 b0Var = this.A;
            if (!b0Var.d() && !b0Var.c()) {
                boolean w10 = w();
                if (w10) {
                    list = Collections.emptyList();
                    j11 = this.K;
                } else {
                    j11 = u().f32511h;
                    list = this.D;
                }
                this.f32517w.c(j10, j11, list, this.B);
                b0.j jVar = this.B;
                boolean z10 = jVar.f2719a;
                e eVar = (e) jVar.f2720b;
                jVar.f2720b = null;
                jVar.f2719a = false;
                if (z10) {
                    this.K = com.anythink.expressad.exoplayer.b.f7291b;
                    this.O = true;
                    return true;
                }
                if (eVar == null) {
                    return false;
                }
                this.H = eVar;
                boolean z11 = eVar instanceof l5.a;
                c cVar = this.G;
                if (z11) {
                    l5.a aVar = (l5.a) eVar;
                    if (w10) {
                        long j12 = this.K;
                        if (aVar.f32510g != j12) {
                            this.E.f29730t = j12;
                            for (e0 e0Var : this.F) {
                                e0Var.f29730t = this.K;
                            }
                        }
                        this.K = com.anythink.expressad.exoplayer.b.f7291b;
                    }
                    aVar.f32486m = cVar;
                    e0[] e0VarArr = cVar.f32492b;
                    int[] iArr = new int[e0VarArr.length];
                    for (int i10 = 0; i10 < e0VarArr.length; i10++) {
                        e0 e0Var2 = e0VarArr[i10];
                        iArr[i10] = e0Var2.f29727q + e0Var2.f29726p;
                    }
                    aVar.f32487n = iArr;
                    this.C.add(aVar);
                } else if (eVar instanceof k) {
                    ((k) eVar).f32533k = cVar;
                }
                this.y.n(new o(eVar.f32505a, eVar.f32506b, b0Var.f(eVar, this, this.f32519z.c(eVar.f32507c))), eVar.f32507c, this.f32513s, eVar.f32508d, eVar.f32509e, eVar.f, eVar.f32510g, eVar.f32511h);
                return true;
            }
        }
        return false;
    }

    @Override // j5.g0
    public final long e() {
        long j10;
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.K;
        }
        long j11 = this.L;
        l5.a u2 = u();
        if (!u2.c()) {
            ArrayList<l5.a> arrayList = this.C;
            if (arrayList.size() > 1) {
                u2 = arrayList.get(arrayList.size() - 2);
            } else {
                u2 = null;
            }
        }
        if (u2 != null) {
            j11 = Math.max(j11, u2.f32511h);
        }
        e0 e0Var = this.E;
        synchronized (e0Var) {
            j10 = e0Var.f29732v;
        }
        return Math.max(j11, j10);
    }

    @Override // j5.g0
    public final void f(long j10) {
        b0 b0Var = this.A;
        if (!b0Var.c() && !w()) {
            boolean d10 = b0Var.d();
            ArrayList<l5.a> arrayList = this.C;
            List<l5.a> list = this.D;
            T t10 = this.f32517w;
            if (d10) {
                e eVar = this.H;
                eVar.getClass();
                boolean z10 = eVar instanceof l5.a;
                if ((!z10 || !v(arrayList.size() - 1)) && t10.j(j10, eVar, list)) {
                    b0Var.b();
                    if (z10) {
                        this.N = (l5.a) eVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int g6 = t10.g(j10, list);
            if (g6 < arrayList.size()) {
                d6.a.d(!b0Var.d());
                int size = arrayList.size();
                while (true) {
                    if (g6 < size) {
                        if (!v(g6)) {
                            break;
                        } else {
                            g6++;
                        }
                    } else {
                        g6 = -1;
                        break;
                    }
                }
                if (g6 != -1) {
                    long j11 = u().f32511h;
                    l5.a s10 = s(g6);
                    if (arrayList.isEmpty()) {
                        this.K = this.L;
                    }
                    this.O = false;
                    int i10 = this.f32513s;
                    x.a aVar = this.y;
                    aVar.p(new r(1, i10, null, 3, null, aVar.a(s10.f32510g), aVar.a(j11)));
                }
            }
        }
    }

    @Override // c6.b0.a
    public final void g(e eVar, long j10, long j11) {
        e eVar2 = eVar;
        this.H = null;
        this.f32517w.f(eVar2);
        long j12 = eVar2.f32505a;
        c6.g0 g0Var = eVar2.f32512i;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.f32519z.getClass();
        this.y.h(oVar, eVar2.f32507c, this.f32513s, eVar2.f32508d, eVar2.f32509e, eVar2.f, eVar2.f32510g, eVar2.f32511h);
        this.f32518x.g(this);
    }

    @Override // c6.b0.e
    public final void h() {
        e0 e0Var = this.E;
        e0Var.w(true);
        com.google.android.exoplayer2.drm.d dVar = e0Var.f29719h;
        if (dVar != null) {
            dVar.b(e0Var.f29717e);
            e0Var.f29719h = null;
            e0Var.f29718g = null;
        }
        for (e0 e0Var2 : this.F) {
            e0Var2.w(true);
            com.google.android.exoplayer2.drm.d dVar2 = e0Var2.f29719h;
            if (dVar2 != null) {
                dVar2.b(e0Var2.f29717e);
                e0Var2.f29719h = null;
                e0Var2.f29718g = null;
            }
        }
        this.f32517w.release();
        b<T> bVar = this.J;
        if (bVar != null) {
            com.google.android.exoplayer2.source.dash.b bVar2 = (com.google.android.exoplayer2.source.dash.b) bVar;
            synchronized (bVar2) {
                d.c remove = bVar2.F.remove(this);
                if (remove != null) {
                    e0 e0Var3 = remove.f20187a;
                    e0Var3.w(true);
                    com.google.android.exoplayer2.drm.d dVar3 = e0Var3.f29719h;
                    if (dVar3 != null) {
                        dVar3.b(e0Var3.f29717e);
                        e0Var3.f29719h = null;
                        e0Var3.f29718g = null;
                    }
                }
            }
        }
    }

    @Override // j5.f0
    public final int i(long j10) {
        if (w()) {
            return 0;
        }
        e0 e0Var = this.E;
        int p10 = e0Var.p(j10, this.O);
        l5.a aVar = this.N;
        if (aVar != null) {
            p10 = Math.min(p10, aVar.d(0) - (e0Var.f29727q + e0Var.f29729s));
        }
        e0Var.y(p10);
        x();
        return p10;
    }

    @Override // j5.g0
    public final boolean isLoading() {
        return this.A.d();
    }

    @Override // j5.f0
    public final boolean isReady() {
        if (!w() && this.E.r(this.O)) {
            return true;
        }
        return false;
    }

    @Override // j5.f0
    public final int m(j1.a aVar, n4.g gVar, int i10) {
        if (w()) {
            return -3;
        }
        l5.a aVar2 = this.N;
        e0 e0Var = this.E;
        if (aVar2 != null && aVar2.d(0) <= e0Var.f29727q + e0Var.f29729s) {
            return -3;
        }
        x();
        return e0Var.v(aVar, gVar, i10, this.O);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    @Override // c6.b0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c6.b0.b n(l5.e r22, long r23, long r25, java.io.IOException r27, int r28) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            l5.e r1 = (l5.e) r1
            c6.g0 r2 = r1.f32512i
            long r2 = r2.f3355b
            boolean r4 = r1 instanceof l5.a
            java.util.ArrayList<l5.a> r5 = r0.C
            int r6 = r5.size()
            int r6 = r6 + (-1)
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r3 = 1
            r7 = 0
            if (r2 == 0) goto L27
            if (r4 == 0) goto L27
            boolean r2 = r0.v(r6)
            if (r2 != 0) goto L25
            goto L27
        L25:
            r2 = r7
            goto L28
        L27:
            r2 = r3
        L28:
            j5.o r9 = new j5.o
            c6.g0 r8 = r1.f32512i
            android.net.Uri r10 = r8.f3356c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8 = r8.f3357d
            r9.<init>(r8)
            long r10 = r1.f32510g
            d6.g0.S(r10)
            long r10 = r1.f32511h
            d6.g0.S(r10)
            c6.a0$c r8 = new c6.a0$c
            r15 = r27
            r10 = r28
            r8.<init>(r15, r10)
            T extends l5.h r10 = r0.f32517w
            c6.a0 r14 = r0.f32519z
            boolean r10 = r10.h(r1, r2, r8, r14)
            r13 = 0
            if (r10 == 0) goto L75
            if (r2 == 0) goto L6e
            if (r4 == 0) goto L6b
            l5.a r2 = r0.s(r6)
            if (r2 != r1) goto L5d
            r2 = r3
            goto L5e
        L5d:
            r2 = r7
        L5e:
            d6.a.d(r2)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L6b
            long r4 = r0.L
            r0.K = r4
        L6b:
            c6.b0$b r2 = c6.b0.f3297e
            goto L76
        L6e:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r4 = "Ignoring attempt to cancel non-cancelable load."
            d6.p.f(r2, r4)
        L75:
            r2 = r13
        L76:
            if (r2 != 0) goto L8d
            long r4 = r14.a(r8)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 == 0) goto L8b
            c6.b0$b r2 = new c6.b0$b
            r2.<init>(r7, r4)
            goto L8d
        L8b:
            c6.b0$b r2 = c6.b0.f
        L8d:
            boolean r4 = r2.a()
            r3 = r3 ^ r4
            j5.x$a r8 = r0.y
            int r10 = r1.f32507c
            int r11 = r0.f32513s
            k4.i0 r12 = r1.f32508d
            int r4 = r1.f32509e
            java.lang.Object r5 = r1.f
            long r6 = r1.f32510g
            r22 = r2
            long r1 = r1.f32511h
            r13 = r4
            r4 = r14
            r14 = r5
            r15 = r6
            r17 = r1
            r19 = r27
            r20 = r3
            r8.j(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            if (r3 == 0) goto Lbe
            r1 = 0
            r0.H = r1
            r4.getClass()
            j5.g0$a<l5.g<T extends l5.h>> r1 = r0.f32518x
            r1.g(r0)
        Lbe:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.g.n(c6.b0$d, long, long, java.io.IOException, int):c6.b0$b");
    }

    @Override // c6.b0.a
    public final void q(e eVar, long j10, long j11, boolean z10) {
        e eVar2 = eVar;
        this.H = null;
        this.N = null;
        long j12 = eVar2.f32505a;
        c6.g0 g0Var = eVar2.f32512i;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.f32519z.getClass();
        this.y.e(oVar, eVar2.f32507c, this.f32513s, eVar2.f32508d, eVar2.f32509e, eVar2.f, eVar2.f32510g, eVar2.f32511h);
        if (!z10) {
            if (w()) {
                this.E.w(false);
                for (e0 e0Var : this.F) {
                    e0Var.w(false);
                }
            } else if (eVar2 instanceof l5.a) {
                ArrayList<l5.a> arrayList = this.C;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.K = this.L;
                }
            }
            this.f32518x.g(this);
        }
    }

    public final l5.a s(int i10) {
        ArrayList<l5.a> arrayList = this.C;
        l5.a aVar = arrayList.get(i10);
        d6.g0.O(i10, arrayList.size(), arrayList);
        this.M = Math.max(this.M, arrayList.size());
        int i11 = 0;
        this.E.k(aVar.d(0));
        while (true) {
            e0[] e0VarArr = this.F;
            if (i11 < e0VarArr.length) {
                e0 e0Var = e0VarArr[i11];
                i11++;
                e0Var.k(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final void t(long j10, boolean z10) {
        long j11;
        if (w()) {
            return;
        }
        e0 e0Var = this.E;
        int i10 = e0Var.f29727q;
        e0Var.h(j10, z10, true);
        e0 e0Var2 = this.E;
        int i11 = e0Var2.f29727q;
        if (i11 > i10) {
            synchronized (e0Var2) {
                if (e0Var2.f29726p == 0) {
                    j11 = Long.MIN_VALUE;
                } else {
                    j11 = e0Var2.f29725n[e0Var2.f29728r];
                }
            }
            int i12 = 0;
            while (true) {
                e0[] e0VarArr = this.F;
                if (i12 >= e0VarArr.length) {
                    break;
                }
                e0VarArr[i12].h(j11, z10, this.f32516v[i12]);
                i12++;
            }
        }
        int min = Math.min(y(i11, 0), this.M);
        if (min > 0) {
            d6.g0.O(0, min, this.C);
            this.M -= min;
        }
    }

    public final l5.a u() {
        return this.C.get(r0.size() - 1);
    }

    public final boolean v(int i10) {
        e0 e0Var;
        l5.a aVar = this.C.get(i10);
        e0 e0Var2 = this.E;
        if (e0Var2.f29727q + e0Var2.f29729s > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            e0[] e0VarArr = this.F;
            if (i11 >= e0VarArr.length) {
                return false;
            }
            e0Var = e0VarArr[i11];
            i11++;
        } while (e0Var.f29727q + e0Var.f29729s <= aVar.d(i11));
        return true;
    }

    public final boolean w() {
        if (this.K != com.anythink.expressad.exoplayer.b.f7291b) {
            return true;
        }
        return false;
    }

    public final void x() {
        e0 e0Var = this.E;
        int y = y(e0Var.f29727q + e0Var.f29729s, this.M - 1);
        while (true) {
            int i10 = this.M;
            if (i10 <= y) {
                this.M = i10 + 1;
                l5.a aVar = this.C.get(i10);
                i0 i0Var = aVar.f32508d;
                if (!i0Var.equals(this.I)) {
                    this.y.b(this.f32513s, i0Var, aVar.f32509e, aVar.f, aVar.f32510g);
                }
                this.I = i0Var;
            } else {
                return;
            }
        }
    }

    public final int y(int i10, int i11) {
        ArrayList<l5.a> arrayList;
        do {
            i11++;
            arrayList = this.C;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (arrayList.get(i11).d(0) <= i10);
        return i11 - 1;
    }

    public final void z(b<T> bVar) {
        this.J = bVar;
        e0 e0Var = this.E;
        e0Var.i();
        com.google.android.exoplayer2.drm.d dVar = e0Var.f29719h;
        if (dVar != null) {
            dVar.b(e0Var.f29717e);
            e0Var.f29719h = null;
            e0Var.f29718g = null;
        }
        for (e0 e0Var2 : this.F) {
            e0Var2.i();
            com.google.android.exoplayer2.drm.d dVar2 = e0Var2.f29719h;
            if (dVar2 != null) {
                dVar2.b(e0Var2.f29717e);
                e0Var2.f29719h = null;
                e0Var2.f29718g = null;
            }
        }
        this.A.e(this);
    }

    /* compiled from: ChunkSampleStream.java */
    /* loaded from: classes2.dex */
    public final class a implements f0 {

        /* renamed from: s, reason: collision with root package name */
        public final g<T> f32520s;

        /* renamed from: t, reason: collision with root package name */
        public final e0 f32521t;

        /* renamed from: u, reason: collision with root package name */
        public final int f32522u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f32523v;

        public a(g<T> gVar, e0 e0Var, int i10) {
            this.f32520s = gVar;
            this.f32521t = e0Var;
            this.f32522u = i10;
        }

        public final void b() {
            if (!this.f32523v) {
                g gVar = g.this;
                x.a aVar = gVar.y;
                int[] iArr = gVar.f32514t;
                int i10 = this.f32522u;
                aVar.b(iArr[i10], gVar.f32515u[i10], 0, null, gVar.L);
                this.f32523v = true;
            }
        }

        @Override // j5.f0
        public final int i(long j10) {
            g gVar = g.this;
            if (gVar.w()) {
                return 0;
            }
            boolean z10 = gVar.O;
            e0 e0Var = this.f32521t;
            int p10 = e0Var.p(j10, z10);
            l5.a aVar = gVar.N;
            if (aVar != null) {
                p10 = Math.min(p10, aVar.d(this.f32522u + 1) - (e0Var.f29727q + e0Var.f29729s));
            }
            e0Var.y(p10);
            if (p10 > 0) {
                b();
            }
            return p10;
        }

        @Override // j5.f0
        public final boolean isReady() {
            g gVar = g.this;
            if (!gVar.w() && this.f32521t.r(gVar.O)) {
                return true;
            }
            return false;
        }

        @Override // j5.f0
        public final int m(j1.a aVar, n4.g gVar, int i10) {
            g gVar2 = g.this;
            if (gVar2.w()) {
                return -3;
            }
            l5.a aVar2 = gVar2.N;
            e0 e0Var = this.f32521t;
            if (aVar2 != null && aVar2.d(this.f32522u + 1) <= e0Var.f29727q + e0Var.f29729s) {
                return -3;
            }
            b();
            return e0Var.v(aVar, gVar, i10, gVar2.O);
        }

        @Override // j5.f0
        public final void a() {
        }
    }
}
