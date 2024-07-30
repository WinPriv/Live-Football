package k4;

import android.util.Pair;
import k4.q1;

/* compiled from: AbstractConcatenatedTimeline.java */
/* loaded from: classes2.dex */
public abstract class a extends q1 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f30313w = 0;

    /* renamed from: t, reason: collision with root package name */
    public final int f30314t;

    /* renamed from: u, reason: collision with root package name */
    public final j5.h0 f30315u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f30316v = false;

    public a(j5.h0 h0Var) {
        this.f30315u = h0Var;
        this.f30314t = h0Var.getLength();
    }

    @Override // k4.q1
    public final int a(boolean z10) {
        if (this.f30314t == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f30316v) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f30315u.a();
        }
        do {
            g1 g1Var = (g1) this;
            q1[] q1VarArr = g1Var.B;
            if (q1VarArr[i10].p()) {
                i10 = q(i10, z10);
            } else {
                return q1VarArr[i10].a(z10) + g1Var.A[i10];
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // k4.q1
    public final int b(Object obj) {
        int intValue;
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        g1 g1Var = (g1) this;
        Integer num = g1Var.D.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (b10 = g1Var.B[intValue].b(obj3)) == -1) {
            return -1;
        }
        return g1Var.f30471z[intValue] + b10;
    }

    @Override // k4.q1
    public final int c(boolean z10) {
        int i10;
        int i11 = this.f30314t;
        if (i11 == 0) {
            return -1;
        }
        if (this.f30316v) {
            z10 = false;
        }
        j5.h0 h0Var = this.f30315u;
        if (z10) {
            i10 = h0Var.f();
        } else {
            i10 = i11 - 1;
        }
        do {
            g1 g1Var = (g1) this;
            q1[] q1VarArr = g1Var.B;
            if (q1VarArr[i10].p()) {
                if (z10) {
                    i10 = h0Var.c(i10);
                } else if (i10 > 0) {
                    i10--;
                } else {
                    i10 = -1;
                }
            } else {
                return q1VarArr[i10].c(z10) + g1Var.A[i10];
            }
        } while (i10 != -1);
        return -1;
    }

    @Override // k4.q1
    public final int e(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f30316v) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        g1 g1Var = (g1) this;
        int[] iArr = g1Var.A;
        int e10 = d6.g0.e(iArr, i10 + 1, false, false);
        int i13 = iArr[e10];
        q1[] q1VarArr = g1Var.B;
        q1 q1Var = q1VarArr[e10];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int e11 = q1Var.e(i14, i12, z10);
        if (e11 != -1) {
            return i13 + e11;
        }
        int q10 = q(e10, z10);
        while (q10 != -1 && q1VarArr[q10].p()) {
            q10 = q(q10, z10);
        }
        if (q10 != -1) {
            return q1VarArr[q10].a(z10) + iArr[q10];
        }
        if (i11 != 2) {
            return -1;
        }
        return a(z10);
    }

    @Override // k4.q1
    public final q1.b f(int i10, q1.b bVar, boolean z10) {
        g1 g1Var = (g1) this;
        int[] iArr = g1Var.f30471z;
        int e10 = d6.g0.e(iArr, i10 + 1, false, false);
        int i11 = g1Var.A[e10];
        g1Var.B[e10].f(i10 - iArr[e10], bVar, z10);
        bVar.f30756u += i11;
        if (z10) {
            Object obj = g1Var.C[e10];
            Object obj2 = bVar.f30755t;
            obj2.getClass();
            bVar.f30755t = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // k4.q1
    public final q1.b g(Object obj, q1.b bVar) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        g1 g1Var = (g1) this;
        Integer num = g1Var.D.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i10 = g1Var.A[intValue];
        g1Var.B[intValue].g(obj3, bVar);
        bVar.f30756u += i10;
        bVar.f30755t = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0038, code lost:
    
        r3 = -1;
     */
    @Override // k4.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r7.f30316v
            r1 = 0
            r2 = 2
            if (r0 == 0) goto Lb
            r10 = 1
            if (r9 != r10) goto La
            r9 = r2
        La:
            r10 = r1
        Lb:
            r0 = r7
            k4.g1 r0 = (k4.g1) r0
            int r3 = r8 + 1
            int[] r4 = r0.A
            int r3 = d6.g0.e(r4, r3, r1, r1)
            r5 = r4[r3]
            k4.q1[] r0 = r0.B
            r6 = r0[r3]
            int r8 = r8 - r5
            if (r9 != r2) goto L20
            goto L21
        L20:
            r1 = r9
        L21:
            int r8 = r6.k(r8, r1, r10)
            r1 = -1
            if (r8 == r1) goto L2a
            int r5 = r5 + r8
            return r5
        L2a:
            j5.h0 r8 = r7.f30315u
            if (r10 == 0) goto L33
            int r3 = r8.c(r3)
            goto L38
        L33:
            if (r3 <= 0) goto L37
            int r3 = r3 + r1
            goto L38
        L37:
            r3 = r1
        L38:
            if (r3 == r1) goto L4e
            r5 = r0[r3]
            boolean r5 = r5.p()
            if (r5 == 0) goto L4e
            if (r10 == 0) goto L49
            int r3 = r8.c(r3)
            goto L38
        L49:
            if (r3 <= 0) goto L37
            int r3 = r3 + (-1)
            goto L38
        L4e:
            if (r3 == r1) goto L5a
            r8 = r4[r3]
            r9 = r0[r3]
            int r9 = r9.c(r10)
            int r9 = r9 + r8
            return r9
        L5a:
            if (r9 != r2) goto L61
            int r8 = r7.c(r10)
            return r8
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.a.k(int, int, boolean):int");
    }

    @Override // k4.q1
    public final Object l(int i10) {
        g1 g1Var = (g1) this;
        int[] iArr = g1Var.f30471z;
        int e10 = d6.g0.e(iArr, i10 + 1, false, false);
        return Pair.create(g1Var.C[e10], g1Var.B[e10].l(i10 - iArr[e10]));
    }

    @Override // k4.q1
    public final q1.c n(int i10, q1.c cVar, long j10) {
        g1 g1Var = (g1) this;
        int[] iArr = g1Var.A;
        int e10 = d6.g0.e(iArr, i10 + 1, false, false);
        int i11 = iArr[e10];
        int i12 = g1Var.f30471z[e10];
        g1Var.B[e10].n(i10 - i11, cVar, j10);
        Object obj = g1Var.C[e10];
        if (!q1.c.J.equals(cVar.f30760s)) {
            obj = Pair.create(obj, cVar.f30760s);
        }
        cVar.f30760s = obj;
        cVar.G += i12;
        cVar.H += i12;
        return cVar;
    }

    public final int q(int i10, boolean z10) {
        if (z10) {
            return this.f30315u.d(i10);
        }
        if (i10 < this.f30314t - 1) {
            return i10 + 1;
        }
        return -1;
    }
}
