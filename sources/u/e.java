package u;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.ads.gl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import v.b;
import v.p;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public final class e extends l {
    public int A0;

    /* renamed from: v0, reason: collision with root package name */
    public int f35672v0;

    /* renamed from: z0, reason: collision with root package name */
    public int f35675z0;

    /* renamed from: t0, reason: collision with root package name */
    public final v.b f35670t0 = new v.b(this);

    /* renamed from: u0, reason: collision with root package name */
    public final v.e f35671u0 = new v.e(this);

    /* renamed from: w0, reason: collision with root package name */
    public b.InterfaceC0495b f35673w0 = null;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f35674x0 = false;
    public final s.c y0 = new s.c();
    public int B0 = 0;
    public int C0 = 0;
    public b[] D0 = new b[4];
    public b[] E0 = new b[4];
    public int F0 = 257;
    public boolean G0 = false;
    public boolean H0 = false;
    public WeakReference<c> I0 = null;
    public WeakReference<c> J0 = null;
    public WeakReference<c> K0 = null;
    public WeakReference<c> L0 = null;
    public final HashSet<d> M0 = new HashSet<>();
    public final b.a N0 = new b.a();

    public static void V(d dVar, b.InterfaceC0495b interfaceC0495b, b.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        if (interfaceC0495b == null) {
            return;
        }
        if (dVar.f35647j0 != 8 && !(dVar instanceof g) && !(dVar instanceof a)) {
            int[] iArr = dVar.V;
            aVar.f35854a = iArr[0];
            boolean z14 = true;
            aVar.f35855b = iArr[1];
            aVar.f35856c = dVar.r();
            aVar.f35857d = dVar.l();
            aVar.f35861i = false;
            aVar.f35862j = 0;
            if (aVar.f35854a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (aVar.f35855b == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && dVar.Z > gl.Code) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && dVar.Z > gl.Code) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z10 && dVar.u(0) && dVar.f35663s == 0 && !z12) {
                aVar.f35854a = 2;
                if (z11 && dVar.f35664t == 0) {
                    aVar.f35854a = 1;
                }
                z10 = false;
            }
            if (z11 && dVar.u(1) && dVar.f35664t == 0 && !z13) {
                aVar.f35855b = 2;
                if (z10 && dVar.f35663s == 0) {
                    aVar.f35855b = 1;
                }
                z11 = false;
            }
            if (dVar.B()) {
                aVar.f35854a = 1;
                z10 = false;
            }
            if (dVar.C()) {
                aVar.f35855b = 1;
                z11 = false;
            }
            int[] iArr2 = dVar.f35665u;
            if (z12) {
                if (iArr2[0] == 4) {
                    aVar.f35854a = 1;
                } else if (!z11) {
                    if (aVar.f35855b == 1) {
                        i11 = aVar.f35857d;
                    } else {
                        aVar.f35854a = 2;
                        ((ConstraintLayout.b) interfaceC0495b).b(dVar, aVar);
                        i11 = aVar.f;
                    }
                    aVar.f35854a = 1;
                    aVar.f35856c = (int) (dVar.Z * i11);
                }
            }
            if (z13) {
                if (iArr2[1] == 4) {
                    aVar.f35855b = 1;
                } else if (!z10) {
                    if (aVar.f35854a == 1) {
                        i10 = aVar.f35856c;
                    } else {
                        aVar.f35855b = 2;
                        ((ConstraintLayout.b) interfaceC0495b).b(dVar, aVar);
                        i10 = aVar.f35858e;
                    }
                    aVar.f35855b = 1;
                    if (dVar.f35630a0 == -1) {
                        aVar.f35857d = (int) (i10 / dVar.Z);
                    } else {
                        aVar.f35857d = (int) (dVar.Z * i10);
                    }
                }
            }
            ((ConstraintLayout.b) interfaceC0495b).b(dVar, aVar);
            dVar.O(aVar.f35858e);
            dVar.L(aVar.f);
            dVar.F = aVar.f35860h;
            int i12 = aVar.f35859g;
            dVar.f35636d0 = i12;
            if (i12 <= 0) {
                z14 = false;
            }
            dVar.F = z14;
            aVar.f35862j = 0;
            return;
        }
        aVar.f35858e = 0;
        aVar.f = 0;
    }

    @Override // u.l, u.d
    public final void D() {
        this.y0.t();
        this.f35675z0 = 0;
        this.A0 = 0;
        super.D();
    }

    @Override // u.d
    public final void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        int size = this.f35709s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f35709s0.get(i10).P(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0683 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0810 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x081c A[LOOP:14: B:301:0x081a->B:302:0x081c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0606 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // u.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 2304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.R():void");
    }

    public final void S(int i10, d dVar) {
        if (i10 == 0) {
            int i11 = this.B0 + 1;
            b[] bVarArr = this.E0;
            if (i11 >= bVarArr.length) {
                this.E0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.E0;
            int i12 = this.B0;
            bVarArr2[i12] = new b(dVar, 0, this.f35674x0);
            this.B0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.C0 + 1;
            b[] bVarArr3 = this.D0;
            if (i13 >= bVarArr3.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.D0;
            int i14 = this.C0;
            bVarArr4[i14] = new b(dVar, 1, this.f35674x0);
            this.C0 = i14 + 1;
        }
    }

    public final void T(s.c cVar) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean W = W(64);
        c(cVar, W);
        int size = this.f35709s0.size();
        boolean z14 = false;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = this.f35709s0.get(i11);
            boolean[] zArr = dVar.U;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z14 = true;
            }
        }
        if (z14) {
            for (int i12 = 0; i12 < size; i12++) {
                d dVar2 = this.f35709s0.get(i12);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i13 = 0; i13 < aVar.f35703t0; i13++) {
                        d dVar3 = aVar.f35702s0[i13];
                        if (aVar.f35596v0 || dVar3.d()) {
                            int i14 = aVar.f35595u0;
                            if (i14 != 0 && i14 != 1) {
                                if (i14 == 2 || i14 == 3) {
                                    dVar3.U[1] = true;
                                }
                            } else {
                                dVar3.U[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<d> hashSet = this.M0;
        hashSet.clear();
        for (int i15 = 0; i15 < size; i15++) {
            d dVar4 = this.f35709s0.get(i15);
            dVar4.getClass();
            if (!(dVar4 instanceof k) && !(dVar4 instanceof g)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                if (dVar4 instanceof k) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.c(cVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<d> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                int i16 = 0;
                while (true) {
                    if (i16 < kVar.f35703t0) {
                        if (hashSet.contains(kVar.f35702s0[i16])) {
                            z12 = true;
                            break;
                        }
                        i16++;
                    } else {
                        z12 = false;
                        break;
                    }
                }
                if (z12) {
                    kVar.c(cVar, W);
                    hashSet.remove(kVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<d> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().c(cVar, W);
                }
                hashSet.clear();
            }
        }
        if (s.c.f35008p) {
            HashSet<d> hashSet2 = new HashSet<>();
            for (int i17 = 0; i17 < size; i17++) {
                d dVar5 = this.f35709s0.get(i17);
                dVar5.getClass();
                if (!(dVar5 instanceof k) && !(dVar5 instanceof g)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    hashSet2.add(dVar5);
                }
            }
            if (this.V[0] == 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            b(this, cVar, hashSet2, i10, false);
            Iterator<d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d next = it3.next();
                q.e.f(this, cVar, next);
                next.c(cVar, W);
            }
        } else {
            for (int i18 = 0; i18 < size; i18++) {
                d dVar6 = this.f35709s0.get(i18);
                if (dVar6 instanceof e) {
                    int[] iArr = dVar6.V;
                    int i19 = iArr[0];
                    int i20 = iArr[1];
                    if (i19 == 2) {
                        dVar6.M(1);
                    }
                    if (i20 == 2) {
                        dVar6.N(1);
                    }
                    dVar6.c(cVar, W);
                    if (i19 == 2) {
                        dVar6.M(i19);
                    }
                    if (i20 == 2) {
                        dVar6.N(i20);
                    }
                } else {
                    q.e.f(this, cVar, dVar6);
                    if (!(dVar6 instanceof k) && !(dVar6 instanceof g)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        dVar6.c(cVar, W);
                    }
                }
            }
        }
        if (this.B0 > 0) {
            q.e.b(this, cVar, null, 0);
        }
        if (this.C0 > 0) {
            q.e.b(this, cVar, null, 1);
        }
    }

    public final boolean U(int i10, boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = z10 & true;
        v.e eVar = this.f35671u0;
        e eVar2 = eVar.f35865a;
        int k10 = eVar2.k(0);
        int k11 = eVar2.k(1);
        int s10 = eVar2.s();
        int t10 = eVar2.t();
        ArrayList<p> arrayList = eVar.f35869e;
        if (z13 && (k10 == 2 || k11 == 2)) {
            Iterator<p> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f == i10 && !next.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && k10 == 2) {
                    eVar2.M(1);
                    eVar2.O(eVar.d(eVar2, 0));
                    eVar2.f35635d.f35899e.d(eVar2.r());
                }
            } else if (z13 && k11 == 2) {
                eVar2.N(1);
                eVar2.L(eVar.d(eVar2, 1));
                eVar2.f35637e.f35899e.d(eVar2.l());
            }
        }
        int[] iArr = eVar2.V;
        if (i10 == 0) {
            int i11 = iArr[0];
            if (i11 == 1 || i11 == 4) {
                int r10 = eVar2.r() + s10;
                eVar2.f35635d.f35902i.d(r10);
                eVar2.f35635d.f35899e.d(r10 - s10);
                z11 = true;
            }
            z11 = false;
        } else {
            int i12 = iArr[1];
            if (i12 == 1 || i12 == 4) {
                int l10 = eVar2.l() + t10;
                eVar2.f35637e.f35902i.d(l10);
                eVar2.f35637e.f35899e.d(l10 - t10);
                z11 = true;
            }
            z11 = false;
        }
        eVar.g();
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f == i10 && (next2.f35896b != eVar2 || next2.f35900g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f == i10 && (z11 || next3.f35896b != eVar2)) {
                if (!next3.f35901h.f35880j || !next3.f35902i.f35880j || (!(next3 instanceof v.c) && !next3.f35899e.f35880j)) {
                    z12 = false;
                    break;
                }
            }
        }
        eVar2.M(k10);
        eVar2.N(k11);
        return z12;
    }

    public final boolean W(int i10) {
        if ((this.F0 & i10) == i10) {
            return true;
        }
        return false;
    }

    @Override // u.d
    public final void o(StringBuilder sb2) {
        sb2.append(this.f35648k + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Y);
        sb2.append("\n");
        Iterator<d> it = this.f35709s0.iterator();
        while (it.hasNext()) {
            it.next().o(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
