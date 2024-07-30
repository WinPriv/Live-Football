package j5;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j5.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import k4.m1;

/* compiled from: MergingMediaPeriod.java */
/* loaded from: classes2.dex */
public final class y implements s, s.a {
    public d0.b A;

    /* renamed from: s, reason: collision with root package name */
    public final s[] f29857s;

    /* renamed from: t, reason: collision with root package name */
    public final IdentityHashMap<f0, Integer> f29858t;

    /* renamed from: u, reason: collision with root package name */
    public final l3.d f29859u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList<s> f29860v = new ArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    public final HashMap<m0, m0> f29861w = new HashMap<>();

    /* renamed from: x, reason: collision with root package name */
    public s.a f29862x;
    public n0 y;

    /* renamed from: z, reason: collision with root package name */
    public s[] f29863z;

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class a implements b6.f {

        /* renamed from: a, reason: collision with root package name */
        public final b6.f f29864a;

        /* renamed from: b, reason: collision with root package name */
        public final m0 f29865b;

        public a(b6.f fVar, m0 m0Var) {
            this.f29864a = fVar;
            this.f29865b = m0Var;
        }

        @Override // b6.i
        public final m0 a() {
            return this.f29865b;
        }

        @Override // b6.i
        public final int b(k4.i0 i0Var) {
            return this.f29864a.b(i0Var);
        }

        @Override // b6.i
        public final k4.i0 c(int i10) {
            return this.f29864a.c(i10);
        }

        @Override // b6.i
        public final int d(int i10) {
            return this.f29864a.d(i10);
        }

        @Override // b6.f
        public final void e() {
            this.f29864a.e();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29864a.equals(aVar.f29864a) && this.f29865b.equals(aVar.f29865b)) {
                return true;
            }
            return false;
        }

        @Override // b6.f
        public final void f(long j10, long j11, long j12, List<? extends l5.l> list, l5.m[] mVarArr) {
            this.f29864a.f(j10, j11, j12, list, mVarArr);
        }

        @Override // b6.f
        public final int g() {
            return this.f29864a.g();
        }

        @Override // b6.f
        public final boolean h(long j10, l5.e eVar, List<? extends l5.l> list) {
            return this.f29864a.h(j10, eVar, list);
        }

        public final int hashCode() {
            return this.f29864a.hashCode() + ((this.f29865b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        }

        @Override // b6.f
        public final boolean i(int i10, long j10) {
            return this.f29864a.i(i10, j10);
        }

        @Override // b6.f
        public final boolean j(int i10, long j10) {
            return this.f29864a.j(i10, j10);
        }

        @Override // b6.f
        public final void k(boolean z10) {
            this.f29864a.k(z10);
        }

        @Override // b6.f
        public final void l() {
            this.f29864a.l();
        }

        @Override // b6.i
        public final int length() {
            return this.f29864a.length();
        }

        @Override // b6.f
        public final int m(long j10, List<? extends l5.l> list) {
            return this.f29864a.m(j10, list);
        }

        @Override // b6.f
        public final int n() {
            return this.f29864a.n();
        }

        @Override // b6.f
        public final k4.i0 o() {
            return this.f29864a.o();
        }

        @Override // b6.f
        public final int p() {
            return this.f29864a.p();
        }

        @Override // b6.f
        public final void q(float f) {
            this.f29864a.q(f);
        }

        @Override // b6.f
        public final Object r() {
            return this.f29864a.r();
        }

        @Override // b6.f
        public final void s() {
            this.f29864a.s();
        }

        @Override // b6.f
        public final void t() {
            this.f29864a.t();
        }

        @Override // b6.i
        public final int u(int i10) {
            return this.f29864a.u(i10);
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class b implements s, s.a {

        /* renamed from: s, reason: collision with root package name */
        public final s f29866s;

        /* renamed from: t, reason: collision with root package name */
        public final long f29867t;

        /* renamed from: u, reason: collision with root package name */
        public s.a f29868u;

        public b(s sVar, long j10) {
            this.f29866s = sVar;
            this.f29867t = j10;
        }

        @Override // j5.s.a
        public final void a(s sVar) {
            s.a aVar = this.f29868u;
            aVar.getClass();
            aVar.a(this);
        }

        @Override // j5.s, j5.g0
        public final long b() {
            long b10 = this.f29866s.b();
            if (b10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f29867t + b10;
        }

        @Override // j5.s, j5.g0
        public final boolean c(long j10) {
            return this.f29866s.c(j10 - this.f29867t);
        }

        @Override // j5.s
        public final long d(long j10, m1 m1Var) {
            long j11 = this.f29867t;
            return this.f29866s.d(j10 - j11, m1Var) + j11;
        }

        @Override // j5.s, j5.g0
        public final long e() {
            long e10 = this.f29866s.e();
            if (e10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f29867t + e10;
        }

        @Override // j5.s, j5.g0
        public final void f(long j10) {
            this.f29866s.f(j10 - this.f29867t);
        }

        @Override // j5.g0.a
        public final void g(s sVar) {
            s.a aVar = this.f29868u;
            aVar.getClass();
            aVar.g(this);
        }

        @Override // j5.s, j5.g0
        public final boolean isLoading() {
            return this.f29866s.isLoading();
        }

        @Override // j5.s
        public final void j() throws IOException {
            this.f29866s.j();
        }

        @Override // j5.s
        public final void k(s.a aVar, long j10) {
            this.f29868u = aVar;
            this.f29866s.k(this, j10 - this.f29867t);
        }

        @Override // j5.s
        public final long l(long j10) {
            long j11 = this.f29867t;
            return this.f29866s.l(j10 - j11) + j11;
        }

        @Override // j5.s
        public final long o(b6.f[] fVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j10) {
            f0[] f0VarArr2 = new f0[f0VarArr.length];
            int i10 = 0;
            while (true) {
                f0 f0Var = null;
                if (i10 >= f0VarArr.length) {
                    break;
                }
                c cVar = (c) f0VarArr[i10];
                if (cVar != null) {
                    f0Var = cVar.f29869s;
                }
                f0VarArr2[i10] = f0Var;
                i10++;
            }
            s sVar = this.f29866s;
            long j11 = this.f29867t;
            long o = sVar.o(fVarArr, zArr, f0VarArr2, zArr2, j10 - j11);
            for (int i11 = 0; i11 < f0VarArr.length; i11++) {
                f0 f0Var2 = f0VarArr2[i11];
                if (f0Var2 == null) {
                    f0VarArr[i11] = null;
                } else {
                    f0 f0Var3 = f0VarArr[i11];
                    if (f0Var3 == null || ((c) f0Var3).f29869s != f0Var2) {
                        f0VarArr[i11] = new c(f0Var2, j11);
                    }
                }
            }
            return o + j11;
        }

        @Override // j5.s
        public final long p() {
            long p10 = this.f29866s.p();
            if (p10 == com.anythink.expressad.exoplayer.b.f7291b) {
                return com.anythink.expressad.exoplayer.b.f7291b;
            }
            return this.f29867t + p10;
        }

        @Override // j5.s
        public final n0 r() {
            return this.f29866s.r();
        }

        @Override // j5.s
        public final void t(long j10, boolean z10) {
            this.f29866s.t(j10 - this.f29867t, z10);
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class c implements f0 {

        /* renamed from: s, reason: collision with root package name */
        public final f0 f29869s;

        /* renamed from: t, reason: collision with root package name */
        public final long f29870t;

        public c(f0 f0Var, long j10) {
            this.f29869s = f0Var;
            this.f29870t = j10;
        }

        @Override // j5.f0
        public final void a() throws IOException {
            this.f29869s.a();
        }

        @Override // j5.f0
        public final int i(long j10) {
            return this.f29869s.i(j10 - this.f29870t);
        }

        @Override // j5.f0
        public final boolean isReady() {
            return this.f29869s.isReady();
        }

        @Override // j5.f0
        public final int m(j1.a aVar, n4.g gVar, int i10) {
            int m10 = this.f29869s.m(aVar, gVar, i10);
            if (m10 == -4) {
                gVar.f33324w = Math.max(0L, gVar.f33324w + this.f29870t);
            }
            return m10;
        }
    }

    public y(l3.d dVar, long[] jArr, s... sVarArr) {
        this.f29859u = dVar;
        this.f29857s = sVarArr;
        dVar.getClass();
        this.A = l3.d.d(new g0[0]);
        this.f29858t = new IdentityHashMap<>();
        this.f29863z = new s[0];
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f29857s[i10] = new b(sVarArr[i10], j10);
            }
        }
    }

    @Override // j5.s.a
    public final void a(s sVar) {
        ArrayList<s> arrayList = this.f29860v;
        arrayList.remove(sVar);
        if (!arrayList.isEmpty()) {
            return;
        }
        s[] sVarArr = this.f29857s;
        int i10 = 0;
        for (s sVar2 : sVarArr) {
            i10 += sVar2.r().f29814s;
        }
        m0[] m0VarArr = new m0[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            n0 r10 = sVarArr[i12].r();
            int i13 = r10.f29814s;
            int i14 = 0;
            while (i14 < i13) {
                m0 a10 = r10.a(i14);
                m0 m0Var = new m0(i12 + com.huawei.openalliance.ad.constant.w.bE + a10.f29802t, a10.f29804v);
                this.f29861w.put(m0Var, a10);
                m0VarArr[i11] = m0Var;
                i14++;
                i11++;
            }
        }
        this.y = new n0(m0VarArr);
        s.a aVar = this.f29862x;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // j5.s, j5.g0
    public final long b() {
        return this.A.b();
    }

    @Override // j5.s, j5.g0
    public final boolean c(long j10) {
        ArrayList<s> arrayList = this.f29860v;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).c(j10);
            }
            return false;
        }
        return this.A.c(j10);
    }

    @Override // j5.s
    public final long d(long j10, m1 m1Var) {
        s sVar;
        s[] sVarArr = this.f29863z;
        if (sVarArr.length > 0) {
            sVar = sVarArr[0];
        } else {
            sVar = this.f29857s[0];
        }
        return sVar.d(j10, m1Var);
    }

    @Override // j5.s, j5.g0
    public final long e() {
        return this.A.e();
    }

    @Override // j5.s, j5.g0
    public final void f(long j10) {
        this.A.f(j10);
    }

    @Override // j5.g0.a
    public final void g(s sVar) {
        s.a aVar = this.f29862x;
        aVar.getClass();
        aVar.g(this);
    }

    @Override // j5.s, j5.g0
    public final boolean isLoading() {
        return this.A.isLoading();
    }

    @Override // j5.s
    public final void j() throws IOException {
        for (s sVar : this.f29857s) {
            sVar.j();
        }
    }

    @Override // j5.s
    public final void k(s.a aVar, long j10) {
        this.f29862x = aVar;
        ArrayList<s> arrayList = this.f29860v;
        s[] sVarArr = this.f29857s;
        Collections.addAll(arrayList, sVarArr);
        for (s sVar : sVarArr) {
            sVar.k(this, j10);
        }
    }

    @Override // j5.s
    public final long l(long j10) {
        long l10 = this.f29863z[0].l(j10);
        int i10 = 1;
        while (true) {
            s[] sVarArr = this.f29863z;
            if (i10 < sVarArr.length) {
                if (sVarArr[i10].l(l10) == l10) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return l10;
            }
        }
    }

    @Override // j5.s
    public final long o(b6.f[] fVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap<f0, Integer> identityHashMap;
        f0 f0Var;
        ArrayList arrayList;
        Integer num;
        int intValue;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = fVarArr.length;
            identityHashMap = this.f29858t;
            if (i11 >= length) {
                break;
            }
            f0 f0Var2 = f0VarArr[i11];
            if (f0Var2 == null) {
                num = null;
            } else {
                num = identityHashMap.get(f0Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i11] = intValue;
            b6.f fVar = fVarArr[i11];
            if (fVar != null) {
                String str = fVar.a().f29802t;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(com.huawei.openalliance.ad.constant.w.bE)));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = fVarArr.length;
        f0[] f0VarArr2 = new f0[length2];
        f0[] f0VarArr3 = new f0[fVarArr.length];
        b6.f[] fVarArr2 = new b6.f[fVarArr.length];
        s[] sVarArr = this.f29857s;
        ArrayList arrayList2 = new ArrayList(sVarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < sVarArr.length) {
            int i13 = i10;
            while (i13 < fVarArr.length) {
                if (iArr[i13] == i12) {
                    f0Var = f0VarArr[i13];
                } else {
                    f0Var = null;
                }
                f0VarArr3[i13] = f0Var;
                if (iArr2[i13] == i12) {
                    b6.f fVar2 = fVarArr[i13];
                    fVar2.getClass();
                    arrayList = arrayList2;
                    m0 m0Var = this.f29861w.get(fVar2.a());
                    m0Var.getClass();
                    fVarArr2[i13] = new a(fVar2, m0Var);
                } else {
                    arrayList = arrayList2;
                    fVarArr2[i13] = null;
                }
                i13++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i14 = i12;
            s[] sVarArr2 = sVarArr;
            b6.f[] fVarArr3 = fVarArr2;
            long o = sVarArr[i12].o(fVarArr2, zArr, f0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = o;
            } else if (o != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < fVarArr.length; i15++) {
                boolean z11 = true;
                if (iArr2[i15] == i14) {
                    f0 f0Var3 = f0VarArr3[i15];
                    f0Var3.getClass();
                    f0VarArr2[i15] = f0VarArr3[i15];
                    identityHashMap.put(f0Var3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    if (f0VarArr3[i15] != null) {
                        z11 = false;
                    }
                    d6.a.d(z11);
                }
            }
            if (z10) {
                arrayList3.add(sVarArr2[i14]);
            }
            i12 = i14 + 1;
            arrayList2 = arrayList3;
            sVarArr = sVarArr2;
            fVarArr2 = fVarArr3;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(f0VarArr2, i16, f0VarArr, i16, length2);
        s[] sVarArr3 = (s[]) arrayList2.toArray(new s[i16]);
        this.f29863z = sVarArr3;
        this.f29859u.getClass();
        this.A = l3.d.d(sVarArr3);
        return j11;
    }

    @Override // j5.s
    public final long p() {
        long j10 = -9223372036854775807L;
        for (s sVar : this.f29863z) {
            long p10 = sVar.p();
            if (p10 != com.anythink.expressad.exoplayer.b.f7291b) {
                if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                    for (s sVar2 : this.f29863z) {
                        if (sVar2 == sVar) {
                            break;
                        }
                        if (sVar2.l(p10) != p10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = p10;
                } else if (p10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != com.anythink.expressad.exoplayer.b.f7291b && sVar.l(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // j5.s
    public final n0 r() {
        n0 n0Var = this.y;
        n0Var.getClass();
        return n0Var;
    }

    @Override // j5.s
    public final void t(long j10, boolean z10) {
        for (s sVar : this.f29863z) {
            sVar.t(j10, z10);
        }
    }
}
