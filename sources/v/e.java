package v;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.b;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final u.e f35865a;

    /* renamed from: d, reason: collision with root package name */
    public final u.e f35868d;
    public b.InterfaceC0495b f;

    /* renamed from: g, reason: collision with root package name */
    public final b.a f35870g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<m> f35871h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35866b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35867c = true;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<p> f35869e = new ArrayList<>();

    public e(u.e eVar) {
        new ArrayList();
        this.f = null;
        this.f35870g = new b.a();
        this.f35871h = new ArrayList<>();
        this.f35865a = eVar;
        this.f35868d = eVar;
    }

    public final void a(f fVar, int i10, int i11, ArrayList arrayList, m mVar) {
        p pVar = fVar.f35875d;
        if (pVar.f35897c == null) {
            u.e eVar = this.f35865a;
            if (pVar != eVar.f35635d && pVar != eVar.f35637e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.f35897c = mVar;
                mVar.f35887b.add(pVar);
                f fVar2 = pVar.f35901h;
                Iterator it = fVar2.f35881k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i10, 0, arrayList, mVar);
                    }
                }
                f fVar3 = pVar.f35902i;
                Iterator it2 = fVar3.f35881k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i10, 1, arrayList, mVar);
                    }
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).f35888k.f35881k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i10, 2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = fVar2.f35882l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i10, 0, arrayList, mVar);
                }
                Iterator it5 = fVar3.f35882l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i10, 1, arrayList, mVar);
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).f35888k.f35882l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i10, 2, arrayList, mVar);
                    }
                }
            }
        }
    }

    public final void b(u.e eVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Iterator<u.d> it = eVar.f35709s0.iterator();
        while (it.hasNext()) {
            u.d next = it.next();
            int[] iArr = next.V;
            int i16 = iArr[0];
            int i17 = iArr[1];
            if (next.f35647j0 == 8) {
                next.f35629a = true;
            } else {
                float f = next.f35668x;
                if (f < 1.0f && i16 == 3) {
                    next.f35663s = 2;
                }
                float f10 = next.A;
                if (f10 < 1.0f && i17 == 3) {
                    next.f35664t = 2;
                }
                if (next.Z > gl.Code) {
                    if (i16 == 3 && (i17 == 2 || i17 == 1)) {
                        next.f35663s = 3;
                    } else if (i17 == 3 && (i16 == 2 || i16 == 1)) {
                        next.f35664t = 3;
                    } else if (i16 == 3 && i17 == 3) {
                        if (next.f35663s == 0) {
                            next.f35663s = 3;
                        }
                        if (next.f35664t == 0) {
                            next.f35664t = 3;
                        }
                    }
                }
                u.c cVar = next.M;
                u.c cVar2 = next.K;
                if (i16 == 3 && next.f35663s == 1 && (cVar2.f == null || cVar.f == null)) {
                    i16 = 2;
                }
                u.c cVar3 = next.N;
                u.c cVar4 = next.L;
                if (i17 == 3 && next.f35664t == 1 && (cVar4.f == null || cVar3.f == null)) {
                    i10 = 2;
                } else {
                    i10 = i17;
                }
                l lVar = next.f35635d;
                lVar.f35898d = i16;
                int i18 = next.f35663s;
                lVar.f35895a = i18;
                n nVar = next.f35637e;
                nVar.f35898d = i10;
                int i19 = next.f35664t;
                nVar.f35895a = i19;
                if ((i16 != 4 && i16 != 1 && i16 != 2) || (i10 != 4 && i10 != 1 && i10 != 2)) {
                    int[] iArr2 = eVar.V;
                    u.c[] cVarArr = next.S;
                    if (i16 == 3 && (i10 == 2 || i10 == 1)) {
                        if (i18 == 3) {
                            if (i10 == 2) {
                                f(next, 2, 0, 2, 0);
                            }
                            int l10 = next.l();
                            f(next, 1, (int) ((l10 * next.Z) + 0.5f), 1, l10);
                            next.f35635d.f35899e.d(next.r());
                            next.f35637e.f35899e.d(next.l());
                            next.f35629a = true;
                        } else if (i18 == 1) {
                            f(next, 2, 0, i10, 0);
                            next.f35635d.f35899e.f35883m = next.r();
                        } else if (i18 == 2) {
                            int i20 = iArr2[0];
                            if (i20 == 1 || i20 == 4) {
                                f(next, 1, (int) ((f * eVar.r()) + 0.5f), i10, next.l());
                                next.f35635d.f35899e.d(next.r());
                                next.f35637e.f35899e.d(next.l());
                                next.f35629a = true;
                            } else {
                                i14 = 3;
                            }
                        } else if (cVarArr[0].f != null && cVarArr[1].f != null) {
                            i14 = 3;
                        } else {
                            f(next, 2, 0, i10, 0);
                            next.f35635d.f35899e.d(next.r());
                            next.f35637e.f35899e.d(next.l());
                            next.f35629a = true;
                        }
                    } else {
                        i14 = 3;
                    }
                    if (i10 == i14 && (i16 == 2 || i16 == 1)) {
                        if (i19 == i14) {
                            if (i16 == 2) {
                                f(next, 2, 0, 2, 0);
                            }
                            int r10 = next.r();
                            float f11 = next.Z;
                            if (next.f35630a0 == -1) {
                                f11 = 1.0f / f11;
                            }
                            f(next, 1, r10, 1, (int) ((r10 * f11) + 0.5f));
                            next.f35635d.f35899e.d(next.r());
                            next.f35637e.f35899e.d(next.l());
                            next.f35629a = true;
                        } else if (i19 == 1) {
                            f(next, i16, 0, 2, 0);
                            next.f35637e.f35899e.f35883m = next.l();
                        } else if (i19 == 2) {
                            int i21 = iArr2[1];
                            if (i21 == 1 || i21 == 4) {
                                f(next, i16, next.r(), 1, (int) ((f10 * eVar.l()) + 0.5f));
                                next.f35635d.f35899e.d(next.r());
                                next.f35637e.f35899e.d(next.l());
                                next.f35629a = true;
                            } else {
                                i15 = 3;
                            }
                        } else if (cVarArr[2].f != null && cVarArr[3].f != null) {
                            i15 = 3;
                        } else {
                            f(next, 2, 0, i10, 0);
                            next.f35635d.f35899e.d(next.r());
                            next.f35637e.f35899e.d(next.l());
                            next.f35629a = true;
                        }
                    } else {
                        i15 = i14;
                    }
                    if (i16 == i15 && i10 == i15) {
                        if (i18 != 1 && i19 != 1) {
                            if (i19 == 2 && i18 == 2 && iArr2[0] == 1 && iArr2[1] == 1) {
                                f(next, 1, (int) ((f * eVar.r()) + 0.5f), 1, (int) ((f10 * eVar.l()) + 0.5f));
                                next.f35635d.f35899e.d(next.r());
                                next.f35637e.f35899e.d(next.l());
                                next.f35629a = true;
                            }
                        } else {
                            f(next, 2, 0, 2, 0);
                            next.f35635d.f35899e.f35883m = next.r();
                            next.f35637e.f35899e.f35883m = next.l();
                        }
                    }
                } else {
                    int r11 = next.r();
                    if (i16 == 4) {
                        i11 = (eVar.r() - cVar2.f35619g) - cVar.f35619g;
                        i16 = 1;
                    } else {
                        i11 = r11;
                    }
                    int l11 = next.l();
                    if (i10 == 4) {
                        i12 = (eVar.l() - cVar4.f35619g) - cVar3.f35619g;
                        i13 = 1;
                    } else {
                        i12 = l11;
                        i13 = i10;
                    }
                    f(next, i16, i11, i13, i12);
                    next.f35635d.f35899e.d(next.r());
                    next.f35637e.f35899e.d(next.l());
                    next.f35629a = true;
                }
            }
        }
    }

    public final void c() {
        ArrayList<p> arrayList = this.f35869e;
        arrayList.clear();
        u.e eVar = this.f35868d;
        eVar.f35635d.f();
        eVar.f35637e.f();
        arrayList.add(eVar.f35635d);
        arrayList.add(eVar.f35637e);
        Iterator<u.d> it = eVar.f35709s0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            u.d next = it.next();
            if (next instanceof u.g) {
                arrayList.add(new j(next));
            } else {
                if (next.y()) {
                    if (next.f35631b == null) {
                        next.f35631b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f35631b);
                } else {
                    arrayList.add(next.f35635d);
                }
                if (next.z()) {
                    if (next.f35633c == null) {
                        next.f35633c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f35633c);
                } else {
                    arrayList.add(next.f35637e);
                }
                if (next instanceof u.i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f35896b != eVar) {
                next2.d();
            }
        }
        ArrayList<m> arrayList2 = this.f35871h;
        arrayList2.clear();
        u.e eVar2 = this.f35865a;
        e(eVar2.f35635d, 0, arrayList2);
        e(eVar2.f35637e, 1, arrayList2);
        this.f35866b = false;
    }

    public final int d(u.e eVar, int i10) {
        long j10;
        ArrayList<m> arrayList;
        int i11;
        p pVar;
        p pVar2;
        long max;
        float f;
        long j11;
        u.e eVar2 = eVar;
        int i12 = i10;
        ArrayList<m> arrayList2 = this.f35871h;
        int size = arrayList2.size();
        int i13 = 0;
        long j12 = 0;
        while (i13 < size) {
            p pVar3 = arrayList2.get(i13).f35886a;
            if (!(pVar3 instanceof c) ? !(i12 != 0 ? (pVar3 instanceof n) : (pVar3 instanceof l)) : ((c) pVar3).f != i12) {
                j10 = 0;
                arrayList = arrayList2;
                i11 = size;
            } else {
                if (i12 == 0) {
                    pVar = eVar2.f35635d;
                } else {
                    pVar = eVar2.f35637e;
                }
                f fVar = pVar.f35901h;
                if (i12 == 0) {
                    pVar2 = eVar2.f35635d;
                } else {
                    pVar2 = eVar2.f35637e;
                }
                f fVar2 = pVar2.f35902i;
                boolean contains = pVar3.f35901h.f35882l.contains(fVar);
                f fVar3 = pVar3.f35902i;
                boolean contains2 = fVar3.f35882l.contains(fVar2);
                long j13 = pVar3.j();
                f fVar4 = pVar3.f35901h;
                if (contains && contains2) {
                    long b10 = m.b(fVar4, 0L);
                    long a10 = m.a(fVar3, 0L);
                    long j14 = b10 - j13;
                    int i14 = fVar3.f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j14 >= (-i14)) {
                        j14 += i14;
                    }
                    long j15 = j14;
                    long j16 = (-a10) - j13;
                    long j17 = fVar4.f;
                    long j18 = j16 - j17;
                    if (j18 >= j17) {
                        j18 -= j17;
                    }
                    u.d dVar = pVar3.f35896b;
                    if (i12 == 0) {
                        f = dVar.f35641g0;
                    } else if (i12 == 1) {
                        f = dVar.f35643h0;
                    } else {
                        dVar.getClass();
                        f = -1.0f;
                    }
                    if (f > gl.Code) {
                        j11 = (((float) j15) / (1.0f - f)) + (((float) j18) / f);
                    } else {
                        j11 = 0;
                    }
                    float f10 = (float) j11;
                    j10 = (fVar4.f + ((((f10 * f) + 0.5f) + j13) + a3.k.d(1.0f, f, f10, 0.5f))) - fVar3.f;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    if (contains) {
                        max = Math.max(m.b(fVar4, fVar4.f), fVar4.f + j13);
                    } else if (contains2) {
                        max = Math.max(-m.a(fVar3, fVar3.f), (-fVar3.f) + j13);
                    } else {
                        j10 = (pVar3.j() + fVar4.f) - fVar3.f;
                    }
                    j10 = max;
                }
            }
            j12 = Math.max(j12, j10);
            i13++;
            eVar2 = eVar;
            i12 = i10;
            arrayList2 = arrayList;
            size = i11;
        }
        return (int) j12;
    }

    public final void e(p pVar, int i10, ArrayList<m> arrayList) {
        f fVar;
        Iterator it = pVar.f35901h.f35881k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = pVar.f35902i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f35901h, i10, 0, arrayList, null);
            }
        }
        Iterator it2 = fVar.f35881k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f35902i, i10, 1, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((n) pVar).f35888k.f35881k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, arrayList, null);
                }
            }
        }
    }

    public final void f(u.d dVar, int i10, int i11, int i12, int i13) {
        boolean z10;
        b.a aVar = this.f35870g;
        aVar.f35854a = i10;
        aVar.f35855b = i12;
        aVar.f35856c = i11;
        aVar.f35857d = i13;
        ((ConstraintLayout.b) this.f).b(dVar, aVar);
        dVar.O(aVar.f35858e);
        dVar.L(aVar.f);
        dVar.F = aVar.f35860h;
        int i14 = aVar.f35859g;
        dVar.f35636d0 = i14;
        if (i14 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.F = z10;
    }

    public final void g() {
        boolean z10;
        a aVar;
        Iterator<u.d> it = this.f35865a.f35709s0.iterator();
        while (it.hasNext()) {
            u.d next = it.next();
            if (!next.f35629a) {
                int[] iArr = next.V;
                boolean z11 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = next.f35663s;
                int i13 = next.f35664t;
                if (i10 != 2 && (i10 != 3 || i12 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z11 = true;
                }
                g gVar = next.f35635d.f35899e;
                boolean z12 = gVar.f35880j;
                g gVar2 = next.f35637e.f35899e;
                boolean z13 = gVar2.f35880j;
                if (z12 && z13) {
                    f(next, 1, gVar.f35877g, 1, gVar2.f35877g);
                    next.f35629a = true;
                } else if (z12 && z11) {
                    f(next, 1, gVar.f35877g, 2, gVar2.f35877g);
                    if (i11 == 3) {
                        next.f35637e.f35899e.f35883m = next.l();
                    } else {
                        next.f35637e.f35899e.d(next.l());
                        next.f35629a = true;
                    }
                } else if (z13 && z10) {
                    f(next, 2, gVar.f35877g, 1, gVar2.f35877g);
                    if (i10 == 3) {
                        next.f35635d.f35899e.f35883m = next.r();
                    } else {
                        next.f35635d.f35899e.d(next.r());
                        next.f35629a = true;
                    }
                }
                if (next.f35629a && (aVar = next.f35637e.f35889l) != null) {
                    aVar.d(next.f35636d0);
                }
            }
        }
    }
}
