package com.google.android.exoplayer2.source.dash;

import a3.l;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import c6.a0;
import c6.c0;
import c6.h0;
import com.anythink.expressad.exoplayer.k.o;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.d;
import j5.e0;
import j5.f0;
import j5.g0;
import j5.m0;
import j5.n0;
import j5.s;
import j5.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.i0;
import k4.m1;
import l4.w;
import l5.g;
import n5.f;
import n5.j;

/* compiled from: DashMediaPeriod.java */
/* loaded from: classes2.dex */
public final class b implements s, g0.a<g<com.google.android.exoplayer2.source.dash.a>>, g.b<com.google.android.exoplayer2.source.dash.a> {
    public static final Pattern Q = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern R = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final c6.b A;
    public final n0 B;
    public final a[] C;
    public final l3.d D;
    public final d E;
    public final x.a G;
    public final e.a H;
    public final w I;
    public s.a J;
    public d0.b M;
    public n5.c N;
    public int O;
    public List<f> P;

    /* renamed from: s, reason: collision with root package name */
    public final int f20146s;

    /* renamed from: t, reason: collision with root package name */
    public final a.InterfaceC0232a f20147t;

    /* renamed from: u, reason: collision with root package name */
    public final h0 f20148u;

    /* renamed from: v, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.f f20149v;

    /* renamed from: w, reason: collision with root package name */
    public final a0 f20150w;

    /* renamed from: x, reason: collision with root package name */
    public final m5.a f20151x;
    public final long y;

    /* renamed from: z, reason: collision with root package name */
    public final c0 f20152z;
    public g<com.google.android.exoplayer2.source.dash.a>[] K = new g[0];
    public m5.f[] L = new m5.f[0];
    public final IdentityHashMap<g<com.google.android.exoplayer2.source.dash.a>, d.c> F = new IdentityHashMap<>();

    /* compiled from: DashMediaPeriod.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f20153a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20154b;

        /* renamed from: c, reason: collision with root package name */
        public final int f20155c;

        /* renamed from: d, reason: collision with root package name */
        public final int f20156d;

        /* renamed from: e, reason: collision with root package name */
        public final int f20157e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f20158g;

        public a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f20154b = i10;
            this.f20153a = iArr;
            this.f20155c = i11;
            this.f20157e = i12;
            this.f = i13;
            this.f20158g = i14;
            this.f20156d = i15;
        }
    }

    public b(int i10, n5.c cVar, m5.a aVar, int i11, a.InterfaceC0232a interfaceC0232a, h0 h0Var, com.google.android.exoplayer2.drm.f fVar, e.a aVar2, a0 a0Var, x.a aVar3, long j10, c0 c0Var, c6.b bVar, l3.d dVar, DashMediaSource.c cVar2, w wVar) {
        String i12;
        int i13;
        int i14;
        boolean[] zArr;
        boolean z10;
        i0[] i0VarArr;
        n5.e eVar;
        n5.e eVar2;
        com.google.android.exoplayer2.drm.f fVar2 = fVar;
        this.f20146s = i10;
        this.N = cVar;
        this.f20151x = aVar;
        this.O = i11;
        this.f20147t = interfaceC0232a;
        this.f20148u = h0Var;
        this.f20149v = fVar2;
        this.H = aVar2;
        this.f20150w = a0Var;
        this.G = aVar3;
        this.y = j10;
        this.f20152z = c0Var;
        this.A = bVar;
        this.D = dVar;
        this.I = wVar;
        this.E = new d(cVar, cVar2, bVar);
        int i15 = 0;
        g<com.google.android.exoplayer2.source.dash.a>[] gVarArr = this.K;
        dVar.getClass();
        this.M = l3.d.d(gVarArr);
        n5.g b10 = cVar.b(i11);
        List<f> list = b10.f33389d;
        this.P = list;
        List<n5.a> list2 = b10.f33388c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i16 = 0; i16 < size; i16++) {
            sparseIntArray.put(list2.get(i16).f33345a, i16);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i16));
            arrayList.add(arrayList2);
            sparseArray.put(i16, arrayList2);
        }
        int i17 = 0;
        while (i15 < size) {
            n5.a aVar4 = list2.get(i15);
            List<n5.e> list3 = aVar4.f33349e;
            while (true) {
                if (i17 >= list3.size()) {
                    eVar = null;
                    break;
                }
                eVar = list3.get(i17);
                if ("http://dashif.org/guidelines/trickmode".equals(eVar.f33379a)) {
                    break;
                } else {
                    i17++;
                }
            }
            List<n5.e> list4 = aVar4.f;
            if (eVar == null) {
                int i18 = 0;
                while (true) {
                    if (i18 >= list4.size()) {
                        eVar = null;
                        break;
                    }
                    eVar = list4.get(i18);
                    if ("http://dashif.org/guidelines/trickmode".equals(eVar.f33379a)) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int i19 = (eVar == null || (i19 = sparseIntArray.get(Integer.parseInt(eVar.f33380b), -1)) == -1) ? i15 : i19;
            if (i19 == i15) {
                int i20 = 0;
                while (true) {
                    if (i20 >= list4.size()) {
                        eVar2 = null;
                        break;
                    }
                    n5.e eVar3 = list4.get(i20);
                    if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(eVar3.f33379a)) {
                        eVar2 = eVar3;
                        break;
                    }
                    i20++;
                }
                if (eVar2 != null) {
                    int i21 = d6.g0.f27302a;
                    for (String str : eVar2.f33380b.split(",", -1)) {
                        int i22 = sparseIntArray.get(Integer.parseInt(str), -1);
                        if (i22 != -1) {
                            i19 = Math.min(i19, i22);
                        }
                    }
                }
            }
            if (i19 != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(i19);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
            i15++;
            i17 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i23 = 0; i23 < size2; i23++) {
            int[] j02 = l7.a.j0((Collection) arrayList.get(i23));
            iArr[i23] = j02;
            Arrays.sort(j02);
        }
        boolean[] zArr2 = new boolean[size2];
        i0[][] i0VarArr2 = new i0[size2];
        int i24 = 0;
        for (int i25 = 0; i25 < size2; i25++) {
            int[] iArr2 = iArr[i25];
            int length = iArr2.length;
            int i26 = 0;
            while (true) {
                if (i26 >= length) {
                    z10 = false;
                    break;
                }
                List<j> list7 = list2.get(iArr2[i26]).f33347c;
                for (int i27 = 0; i27 < list7.size(); i27++) {
                    if (!list7.get(i27).f33402v.isEmpty()) {
                        z10 = true;
                        break;
                    }
                }
                i26++;
            }
            if (z10) {
                zArr2[i25] = true;
                i24++;
            }
            int[] iArr3 = iArr[i25];
            int length2 = iArr3.length;
            int i28 = 0;
            while (true) {
                if (i28 >= length2) {
                    i0VarArr = new i0[0];
                    break;
                }
                int i29 = iArr3[i28];
                n5.a aVar5 = list2.get(i29);
                List<n5.e> list8 = list2.get(i29).f33348d;
                int i30 = 0;
                int[] iArr4 = iArr3;
                while (i30 < list8.size()) {
                    n5.e eVar4 = list8.get(i30);
                    int i31 = length2;
                    List<n5.e> list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(eVar4.f33379a)) {
                        i0.a aVar6 = new i0.a();
                        aVar6.f30534k = o.W;
                        aVar6.f30525a = com.ironsource.adapters.facebook.a.i(new StringBuilder(), aVar5.f33345a, ":cea608");
                        i0VarArr = i(eVar4, Q, new i0(aVar6));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(eVar4.f33379a)) {
                        i0.a aVar7 = new i0.a();
                        aVar7.f30534k = o.X;
                        aVar7.f30525a = com.ironsource.adapters.facebook.a.i(new StringBuilder(), aVar5.f33345a, ":cea708");
                        i0VarArr = i(eVar4, R, new i0(aVar7));
                        break;
                    }
                    i30++;
                    length2 = i31;
                    list8 = list9;
                }
                i28++;
                iArr3 = iArr4;
            }
            i0VarArr2[i25] = i0VarArr;
            if (i0VarArr.length != 0) {
                i24++;
            }
        }
        int size3 = list.size() + i24 + size2;
        m0[] m0VarArr = new m0[size3];
        a[] aVarArr = new a[size3];
        int i32 = 0;
        int i33 = 0;
        while (i32 < size2) {
            int[] iArr5 = iArr[i32];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i34 = size2;
            int i35 = 0;
            while (i35 < length3) {
                arrayList3.addAll(list2.get(iArr5[i35]).f33347c);
                i35++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            i0[] i0VarArr3 = new i0[size4];
            int i36 = 0;
            while (i36 < size4) {
                int i37 = size4;
                i0 i0Var = ((j) arrayList3.get(i36)).f33399s;
                i0VarArr3[i36] = i0Var.b(fVar2.f(i0Var));
                i36++;
                size4 = i37;
                arrayList3 = arrayList3;
            }
            n5.a aVar8 = list2.get(iArr5[0]);
            int i38 = aVar8.f33345a;
            if (i38 != -1) {
                i12 = Integer.toString(i38);
            } else {
                i12 = l.i("unset:", i32);
            }
            int i39 = i33 + 1;
            if (zArr2[i32]) {
                i13 = i39;
                i39++;
            } else {
                i13 = -1;
            }
            List<n5.a> list10 = list2;
            if (i0VarArr2[i32].length != 0) {
                int i40 = i39;
                i39++;
                i14 = i40;
            } else {
                i14 = -1;
            }
            m0VarArr[i33] = new m0(i12, i0VarArr3);
            aVarArr[i33] = new a(aVar8.f33346b, 0, iArr5, i33, i13, i14, -1);
            int i41 = -1;
            int i42 = i13;
            if (i42 != -1) {
                String h10 = com.ironsource.adapters.facebook.a.h(i12, ":emsg");
                i0.a aVar9 = new i0.a();
                aVar9.f30525a = h10;
                aVar9.f30534k = o.ai;
                zArr = zArr2;
                m0VarArr[i42] = new m0(h10, new i0(aVar9));
                aVarArr[i42] = new a(5, 1, iArr5, i33, -1, -1, -1);
                i41 = -1;
            } else {
                zArr = zArr2;
            }
            if (i14 != i41) {
                m0VarArr[i14] = new m0(com.ironsource.adapters.facebook.a.h(i12, ":cc"), i0VarArr2[i32]);
                aVarArr[i14] = new a(3, 1, iArr5, i33, -1, -1, -1);
            }
            i32++;
            size2 = i34;
            fVar2 = fVar;
            i33 = i39;
            iArr = iArr6;
            list2 = list10;
            zArr2 = zArr;
        }
        int i43 = 0;
        while (i43 < list.size()) {
            f fVar3 = list.get(i43);
            i0.a aVar10 = new i0.a();
            aVar10.f30525a = fVar3.a();
            aVar10.f30534k = o.ai;
            m0VarArr[i33] = new m0(fVar3.a() + com.huawei.openalliance.ad.constant.w.bE + i43, new i0(aVar10));
            aVarArr[i33] = new a(5, 2, new int[0], -1, -1, -1, i43);
            i43++;
            i33++;
        }
        Pair create = Pair.create(new n0(m0VarArr), aVarArr);
        this.B = (n0) create.first;
        this.C = (a[]) create.second;
    }

    public static i0[] i(n5.e eVar, Pattern pattern, i0 i0Var) {
        String str = eVar.f33380b;
        if (str == null) {
            return new i0[]{i0Var};
        }
        int i10 = d6.g0.f27302a;
        String[] split = str.split(com.huawei.openalliance.ad.constant.w.aG, -1);
        i0[] i0VarArr = new i0[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new i0[]{i0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            i0.a aVar = new i0.a(i0Var);
            aVar.f30525a = i0Var.f30518s + com.huawei.openalliance.ad.constant.w.bE + parseInt;
            aVar.C = parseInt;
            aVar.f30527c = matcher.group(2);
            i0VarArr[i11] = new i0(aVar);
        }
        return i0VarArr;
    }

    @Override // j5.s, j5.g0
    public final long b() {
        return this.M.b();
    }

    @Override // j5.s, j5.g0
    public final boolean c(long j10) {
        return this.M.c(j10);
    }

    @Override // j5.s
    public final long d(long j10, m1 m1Var) {
        for (g<com.google.android.exoplayer2.source.dash.a> gVar : this.K) {
            if (gVar.f32513s == 2) {
                return gVar.f32517w.d(j10, m1Var);
            }
        }
        return j10;
    }

    @Override // j5.s, j5.g0
    public final long e() {
        return this.M.e();
    }

    @Override // j5.s, j5.g0
    public final void f(long j10) {
        this.M.f(j10);
    }

    @Override // j5.g0.a
    public final void g(g<com.google.android.exoplayer2.source.dash.a> gVar) {
        this.J.g(this);
    }

    public final int h(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        a[] aVarArr = this.C;
        int i12 = aVarArr[i11].f20157e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && aVarArr[i14].f20155c == 0) {
                return i13;
            }
        }
        return -1;
    }

    @Override // j5.s, j5.g0
    public final boolean isLoading() {
        return this.M.isLoading();
    }

    @Override // j5.s
    public final void j() throws IOException {
        this.f20152z.a();
    }

    @Override // j5.s
    public final void k(s.a aVar, long j10) {
        this.J = aVar;
        aVar.a(this);
    }

    @Override // j5.s
    public final long l(long j10) {
        for (g<com.google.android.exoplayer2.source.dash.a> gVar : this.K) {
            gVar.A(j10);
        }
        for (m5.f fVar : this.L) {
            fVar.b(j10);
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j5.s
    public final long o(b6.f[] fVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z10;
        int[] iArr;
        int i11;
        int[] iArr2;
        boolean z11;
        int i12;
        m0 m0Var;
        Object[] objArr;
        m0 m0Var2;
        int i13;
        d.c cVar;
        b6.f[] fVarArr2 = fVarArr;
        int[] iArr3 = new int[fVarArr2.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= fVarArr2.length) {
                break;
            }
            b6.f fVar = fVarArr2[i14];
            if (fVar != null) {
                iArr3[i14] = this.B.b(fVar.a());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < fVarArr2.length; i15++) {
            if (fVarArr2[i15] == null || !zArr[i15]) {
                f0 f0Var = f0VarArr[i15];
                if (f0Var instanceof g) {
                    ((g) f0Var).z(this);
                } else if (f0Var instanceof g.a) {
                    g.a aVar = (g.a) f0Var;
                    g gVar = g.this;
                    boolean[] zArr3 = gVar.f32516v;
                    int i16 = aVar.f32522u;
                    d6.a.d(zArr3[i16]);
                    gVar.f32516v[i16] = false;
                }
                f0VarArr[i15] = null;
            }
        }
        int i17 = 0;
        while (true) {
            z10 = true;
            boolean z12 = true;
            if (i17 >= fVarArr2.length) {
                break;
            }
            f0 f0Var2 = f0VarArr[i17];
            if ((f0Var2 instanceof j5.l) || (f0Var2 instanceof g.a)) {
                int h10 = h(i17, iArr3);
                if (h10 == -1) {
                    z12 = f0VarArr[i17] instanceof j5.l;
                } else {
                    f0 f0Var3 = f0VarArr[i17];
                    if (!(f0Var3 instanceof g.a) || ((g.a) f0Var3).f32520s != f0VarArr[h10]) {
                        z12 = false;
                    }
                }
                if (!z12) {
                    f0 f0Var4 = f0VarArr[i17];
                    if (f0Var4 instanceof g.a) {
                        g.a aVar2 = (g.a) f0Var4;
                        g gVar2 = g.this;
                        boolean[] zArr4 = gVar2.f32516v;
                        int i18 = aVar2.f32522u;
                        d6.a.d(zArr4[i18]);
                        gVar2.f32516v[i18] = false;
                    }
                    f0VarArr[i17] = null;
                }
            }
            i17++;
        }
        f0[] f0VarArr2 = f0VarArr;
        int i19 = 0;
        while (i19 < fVarArr2.length) {
            b6.f fVar2 = fVarArr2[i19];
            if (fVar2 == null) {
                i11 = i19;
                iArr2 = iArr3;
            } else {
                f0 f0Var5 = f0VarArr2[i19];
                if (f0Var5 == null) {
                    zArr2[i19] = z10;
                    a aVar3 = this.C[iArr3[i19]];
                    int i20 = aVar3.f20155c;
                    if (i20 == 0) {
                        int i21 = aVar3.f;
                        if (i21 != i10) {
                            z11 = z10 ? 1 : 0;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            m0Var = this.B.a(i21);
                            i12 = z10 ? 1 : 0;
                        } else {
                            i12 = 0;
                            m0Var = null;
                        }
                        int i22 = aVar3.f20158g;
                        if (i22 != i10) {
                            objArr = z10 ? 1 : 0;
                        } else {
                            objArr = false;
                        }
                        if (objArr != false) {
                            m0Var2 = this.B.a(i22);
                            i12 += m0Var2.f29801s;
                        } else {
                            m0Var2 = null;
                        }
                        i0[] i0VarArr = new i0[i12];
                        int[] iArr4 = new int[i12];
                        if (z11) {
                            i0VarArr[0] = m0Var.f29804v[0];
                            iArr4[0] = 5;
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (objArr != false) {
                            for (int i23 = 0; i23 < m0Var2.f29801s; i23++) {
                                i0 i0Var = m0Var2.f29804v[i23];
                                i0VarArr[i13] = i0Var;
                                iArr4[i13] = 3;
                                arrayList.add(i0Var);
                                i13 += z10 ? 1 : 0;
                            }
                        }
                        if (this.N.f33357d && z11) {
                            d dVar = this.E;
                            cVar = new d.c(dVar.f20178s);
                        } else {
                            cVar = null;
                        }
                        iArr2 = iArr3;
                        i11 = i19;
                        d.c cVar2 = cVar;
                        g<com.google.android.exoplayer2.source.dash.a> gVar3 = new g<>(aVar3.f20154b, iArr4, i0VarArr, this.f20147t.a(this.f20152z, this.N, this.f20151x, this.O, aVar3.f20153a, fVar2, aVar3.f20154b, this.y, z11, arrayList, cVar, this.f20148u, this.I), this, this.A, j10, this.f20149v, this.H, this.f20150w, this.G);
                        synchronized (this) {
                            this.F.put(gVar3, cVar2);
                        }
                        f0VarArr[i11] = gVar3;
                        f0VarArr2 = f0VarArr;
                    } else {
                        i11 = i19;
                        iArr2 = iArr3;
                        if (i20 == 2) {
                            f0VarArr2[i11] = new m5.f(this.P.get(aVar3.f20156d), fVar2.a().f29804v[0], this.N.f33357d);
                        }
                    }
                } else {
                    i11 = i19;
                    iArr2 = iArr3;
                    if (f0Var5 instanceof g) {
                        ((com.google.android.exoplayer2.source.dash.a) ((g) f0Var5).f32517w).b(fVar2);
                    }
                }
            }
            i19 = i11 + 1;
            fVarArr2 = fVarArr;
            iArr3 = iArr2;
            z10 = true;
            i10 = -1;
        }
        int[] iArr5 = iArr3;
        int i24 = 0;
        while (i24 < fVarArr.length) {
            if (f0VarArr2[i24] == null && fVarArr[i24] != null) {
                a aVar4 = this.C[iArr5[i24]];
                if (aVar4.f20155c == 1) {
                    iArr = iArr5;
                    int h11 = h(i24, iArr);
                    if (h11 == -1) {
                        f0VarArr2[i24] = new j5.l();
                    } else {
                        g gVar4 = (g) f0VarArr2[h11];
                        int i25 = aVar4.f20154b;
                        int i26 = 0;
                        while (true) {
                            e0[] e0VarArr = gVar4.F;
                            if (i26 < e0VarArr.length) {
                                if (gVar4.f32514t[i26] == i25) {
                                    boolean[] zArr5 = gVar4.f32516v;
                                    d6.a.d(!zArr5[i26]);
                                    zArr5[i26] = true;
                                    e0VarArr[i26].x(j10, true);
                                    f0VarArr2[i24] = new g.a(gVar4, e0VarArr[i26], i26);
                                    break;
                                }
                                i26++;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    i24++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            } else {
                iArr = iArr5;
            }
            i24++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (f0 f0Var6 : f0VarArr2) {
            if (f0Var6 instanceof g) {
                arrayList2.add((g) f0Var6);
            } else if (f0Var6 instanceof m5.f) {
                arrayList3.add((m5.f) f0Var6);
            }
        }
        g<com.google.android.exoplayer2.source.dash.a>[] gVarArr = new g[arrayList2.size()];
        this.K = gVarArr;
        arrayList2.toArray(gVarArr);
        m5.f[] fVarArr3 = new m5.f[arrayList3.size()];
        this.L = fVarArr3;
        arrayList3.toArray(fVarArr3);
        l3.d dVar2 = this.D;
        g<com.google.android.exoplayer2.source.dash.a>[] gVarArr2 = this.K;
        dVar2.getClass();
        this.M = l3.d.d(gVarArr2);
        return j10;
    }

    @Override // j5.s
    public final long p() {
        return com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // j5.s
    public final n0 r() {
        return this.B;
    }

    @Override // j5.s
    public final void t(long j10, boolean z10) {
        for (g<com.google.android.exoplayer2.source.dash.a> gVar : this.K) {
            gVar.t(j10, z10);
        }
    }
}
