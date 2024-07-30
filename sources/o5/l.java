package o5;

import android.net.Uri;
import android.util.SparseArray;
import androidx.transition.t;
import c6.a0;
import c6.b0;
import c6.h0;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.metadata.Metadata;
import d6.r;
import j5.f0;
import j5.g0;
import j5.m0;
import j5.n0;
import j5.s;
import j5.x;
import j7.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k4.i0;
import k4.m1;
import k4.z0;
import l4.w;
import o5.n;
import p5.e;
import p5.j;

/* compiled from: HlsMediaPeriod.java */
/* loaded from: classes2.dex */
public final class l implements s, j.a {
    public final c6.b A;
    public final IdentityHashMap<f0, Integer> B;
    public final t C;
    public final l3.d D;
    public final boolean E;
    public final int F;
    public final boolean G;
    public final w H;
    public final a I = new a();
    public s.a J;
    public int K;
    public n0 L;
    public n[] M;
    public n[] N;
    public int O;
    public d0.b P;

    /* renamed from: s, reason: collision with root package name */
    public final i f33679s;

    /* renamed from: t, reason: collision with root package name */
    public final p5.j f33680t;

    /* renamed from: u, reason: collision with root package name */
    public final h f33681u;

    /* renamed from: v, reason: collision with root package name */
    public final h0 f33682v;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.f f33683w;

    /* renamed from: x, reason: collision with root package name */
    public final e.a f33684x;
    public final a0 y;

    /* renamed from: z, reason: collision with root package name */
    public final x.a f33685z;

    /* compiled from: HlsMediaPeriod.java */
    /* loaded from: classes2.dex */
    public class a implements n.a {
        public a() {
        }

        public final void b() {
            l lVar = l.this;
            int i10 = lVar.K - 1;
            lVar.K = i10;
            if (i10 > 0) {
                return;
            }
            int i11 = 0;
            for (n nVar : lVar.M) {
                nVar.u();
                i11 += nVar.f33691c0.f29814s;
            }
            m0[] m0VarArr = new m0[i11];
            int i12 = 0;
            for (n nVar2 : lVar.M) {
                nVar2.u();
                int i13 = nVar2.f33691c0.f29814s;
                int i14 = 0;
                while (i14 < i13) {
                    nVar2.u();
                    m0VarArr[i12] = nVar2.f33691c0.a(i14);
                    i14++;
                    i12++;
                }
            }
            lVar.L = new n0(m0VarArr);
            lVar.J.a(lVar);
        }

        @Override // j5.g0.a
        public final void g(n nVar) {
            l lVar = l.this;
            lVar.J.g(lVar);
        }
    }

    public l(i iVar, p5.j jVar, h hVar, h0 h0Var, com.google.android.exoplayer2.drm.f fVar, e.a aVar, a0 a0Var, x.a aVar2, c6.b bVar, l3.d dVar, boolean z10, int i10, boolean z11, w wVar) {
        this.f33679s = iVar;
        this.f33680t = jVar;
        this.f33681u = hVar;
        this.f33682v = h0Var;
        this.f33683w = fVar;
        this.f33684x = aVar;
        this.y = a0Var;
        this.f33685z = aVar2;
        this.A = bVar;
        this.D = dVar;
        this.E = z10;
        this.F = i10;
        this.G = z11;
        this.H = wVar;
        dVar.getClass();
        this.P = l3.d.d(new g0[0]);
        this.B = new IdentityHashMap<>();
        this.C = new t(4);
        this.M = new n[0];
        this.N = new n[0];
    }

    public static i0 i(i0 i0Var, i0 i0Var2, boolean z10) {
        String p10;
        Metadata metadata;
        int i10;
        String str;
        int i11;
        int i12;
        String str2;
        int i13;
        int i14 = -1;
        if (i0Var2 != null) {
            p10 = i0Var2.A;
            metadata = i0Var2.B;
            i11 = i0Var2.Q;
            i10 = i0Var2.f30521v;
            i12 = i0Var2.f30522w;
            str = i0Var2.f30520u;
            str2 = i0Var2.f30519t;
        } else {
            p10 = d6.g0.p(1, i0Var.A);
            metadata = i0Var.B;
            if (z10) {
                i11 = i0Var.Q;
                i10 = i0Var.f30521v;
                i12 = i0Var.f30522w;
                str = i0Var.f30520u;
                str2 = i0Var.f30519t;
            } else {
                i10 = 0;
                str = null;
                i11 = -1;
                i12 = 0;
                str2 = null;
            }
        }
        String e10 = r.e(p10);
        if (z10) {
            i13 = i0Var.f30523x;
        } else {
            i13 = -1;
        }
        if (z10) {
            i14 = i0Var.y;
        }
        i0.a aVar = new i0.a();
        aVar.f30525a = i0Var.f30518s;
        aVar.f30526b = str2;
        aVar.f30533j = i0Var.C;
        aVar.f30534k = e10;
        aVar.f30531h = p10;
        aVar.f30532i = metadata;
        aVar.f = i13;
        aVar.f30530g = i14;
        aVar.f30546x = i11;
        aVar.f30528d = i10;
        aVar.f30529e = i12;
        aVar.f30527c = str;
        return aVar.a();
    }

    @Override // p5.j.a
    public final void a() {
        for (n nVar : this.M) {
            ArrayList<j> arrayList = nVar.F;
            if (!arrayList.isEmpty()) {
                j jVar = (j) j7.r.B(arrayList);
                int b10 = nVar.f33710v.b(jVar);
                if (b10 == 1) {
                    jVar.K = true;
                } else if (b10 == 2 && !nVar.f33702n0) {
                    b0 b0Var = nVar.B;
                    if (b0Var.d()) {
                        b0Var.b();
                    }
                }
            }
        }
        this.J.g(this);
    }

    @Override // j5.s, j5.g0
    public final long b() {
        return this.P.b();
    }

    @Override // j5.s, j5.g0
    public final boolean c(long j10) {
        if (this.L == null) {
            for (n nVar : this.M) {
                if (!nVar.V) {
                    nVar.c(nVar.f33698j0);
                }
            }
            return false;
        }
        return this.P.c(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j5.s
    public final long d(long j10, m1 m1Var) {
        boolean z10;
        p5.e eVar;
        long j11;
        n[] nVarArr = this.N;
        int length = nVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            n nVar = nVarArr[i10];
            if (nVar.S == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g gVar = nVar.f33710v;
                int g6 = gVar.f33651q.g();
                Uri[] uriArr = gVar.f33641e;
                int length2 = uriArr.length;
                p5.j jVar = gVar.f33642g;
                if (g6 < length2 && g6 != -1) {
                    eVar = jVar.m(uriArr[gVar.f33651q.n()], true);
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    j0 j0Var = eVar.f34409r;
                    if (!j0Var.isEmpty() && eVar.f34449c) {
                        long f = eVar.f34400h - jVar.f();
                        long j12 = j10 - f;
                        int c10 = d6.g0.c(j0Var, Long.valueOf(j12), true);
                        long j13 = ((e.c) j0Var.get(c10)).f34421w;
                        if (c10 != j0Var.size() - 1) {
                            j11 = ((e.c) j0Var.get(c10 + 1)).f34421w;
                        } else {
                            j11 = j13;
                        }
                        return m1Var.a(j12, j13, j11) + f;
                    }
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override // j5.s, j5.g0
    public final long e() {
        return this.P.e();
    }

    @Override // j5.s, j5.g0
    public final void f(long j10) {
        this.P.f(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0050 A[SYNTHETIC] */
    @Override // p5.j.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.net.Uri r17, c6.a0.c r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            o5.n[] r2 = r0.M
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L8e
            r8 = r2[r6]
            o5.g r9 = r8.f33710v
            android.net.Uri[] r10 = r9.f33641e
            boolean r10 = d6.g0.j(r10, r1)
            if (r10 != 0) goto L1b
            r13 = r18
            goto L86
        L1b:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3a
            b6.f r12 = r9.f33651q
            c6.a0$a r12 = b6.l.a(r12)
            c6.a0 r8 = r8.A
            r13 = r18
            c6.a0$b r8 = r8.b(r12, r13)
            if (r8 == 0) goto L3c
            int r12 = r8.f3292a
            r14 = 2
            if (r12 != r14) goto L3c
            long r14 = r8.f3293b
            goto L3d
        L3a:
            r13 = r18
        L3c:
            r14 = r10
        L3d:
            r8 = 0
        L3e:
            android.net.Uri[] r12 = r9.f33641e
            int r4 = r12.length
            r5 = -1
            if (r8 >= r4) goto L50
            r4 = r12[r8]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L4d
            goto L51
        L4d:
            int r8 = r8 + 1
            goto L3e
        L50:
            r8 = r5
        L51:
            if (r8 != r5) goto L54
            goto L7f
        L54:
            b6.f r4 = r9.f33651q
            int r4 = r4.u(r8)
            if (r4 != r5) goto L5d
            goto L7f
        L5d:
            boolean r5 = r9.f33653s
            android.net.Uri r8 = r9.o
            boolean r8 = r1.equals(r8)
            r5 = r5 | r8
            r9.f33653s = r5
            int r5 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r5 == 0) goto L7f
            b6.f r5 = r9.f33651q
            boolean r4 = r5.i(r4, r14)
            if (r4 == 0) goto L7d
            p5.j r4 = r9.f33642g
            boolean r4 = r4.j(r1, r14)
            if (r4 == 0) goto L7d
            goto L7f
        L7d:
            r4 = 0
            goto L80
        L7f:
            r4 = 1
        L80:
            if (r4 == 0) goto L88
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 == 0) goto L88
        L86:
            r4 = 1
            goto L89
        L88:
            r4 = 0
        L89:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L8e:
            j5.s$a r1 = r0.J
            r1.g(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.l.g(android.net.Uri, c6.a0$c, boolean):boolean");
    }

    public final n h(String str, int i10, Uri[] uriArr, i0[] i0VarArr, i0 i0Var, List<i0> list, Map<String, DrmInitData> map, long j10) {
        return new n(str, i10, this.I, new g(this.f33679s, this.f33680t, uriArr, i0VarArr, this.f33681u, this.f33682v, this.C, list, this.H), map, this.A, j10, i0Var, this.f33683w, this.f33684x, this.y, this.f33685z, this.F);
    }

    @Override // j5.s, j5.g0
    public final boolean isLoading() {
        return this.P.isLoading();
    }

    @Override // j5.s
    public final void j() throws IOException {
        for (n nVar : this.M) {
            nVar.D();
            if (nVar.f33702n0 && !nVar.V) {
                throw z0.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.HashMap] */
    @Override // j5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(j5.s.a r25, long r26) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.l.k(j5.s$a, long):void");
    }

    @Override // j5.s
    public final long l(long j10) {
        n[] nVarArr = this.N;
        if (nVarArr.length > 0) {
            boolean G = nVarArr[0].G(j10, false);
            int i10 = 1;
            while (true) {
                n[] nVarArr2 = this.N;
                if (i10 >= nVarArr2.length) {
                    break;
                }
                nVarArr2[i10].G(j10, G);
                i10++;
            }
            if (G) {
                ((SparseArray) this.C.f2495s).clear();
            }
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025a  */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // j5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(b6.f[] r37, boolean[] r38, j5.f0[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.l.o(b6.f[], boolean[], j5.f0[], boolean[], long):long");
    }

    @Override // j5.s
    public final long p() {
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // j5.s
    public final n0 r() {
        n0 n0Var = this.L;
        n0Var.getClass();
        return n0Var;
    }

    @Override // j5.s
    public final void t(long j10, boolean z10) {
        for (n nVar : this.N) {
            if (nVar.U && !nVar.B()) {
                int length = nVar.N.length;
                for (int i10 = 0; i10 < length; i10++) {
                    nVar.N[i10].h(j10, z10, nVar.f33696h0[i10]);
                }
            }
        }
    }
}
