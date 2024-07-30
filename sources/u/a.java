package u;

import u.c;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: u0, reason: collision with root package name */
    public int f35595u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f35596v0 = true;

    /* renamed from: w0, reason: collision with root package name */
    public int f35597w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f35598x0 = false;

    @Override // u.d
    public final boolean B() {
        return this.f35598x0;
    }

    @Override // u.d
    public final boolean C() {
        return this.f35598x0;
    }

    public final boolean S() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f35703t0;
            if (i13 >= i10) {
                break;
            }
            d dVar = this.f35702s0[i13];
            if ((this.f35596v0 || dVar.d()) && ((((i11 = this.f35595u0) == 0 || i11 == 1) && !dVar.B()) || (((i12 = this.f35595u0) == 2 || i12 == 3) && !dVar.C()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f35703t0; i15++) {
            d dVar2 = this.f35702s0[i15];
            if (this.f35596v0 || dVar2.d()) {
                c.a aVar = c.a.BOTTOM;
                c.a aVar2 = c.a.TOP;
                c.a aVar3 = c.a.RIGHT;
                c.a aVar4 = c.a.LEFT;
                if (!z11) {
                    int i16 = this.f35595u0;
                    if (i16 == 0) {
                        i14 = dVar2.j(aVar4).d();
                    } else if (i16 == 1) {
                        i14 = dVar2.j(aVar3).d();
                    } else if (i16 == 2) {
                        i14 = dVar2.j(aVar2).d();
                    } else if (i16 == 3) {
                        i14 = dVar2.j(aVar).d();
                    }
                    z11 = true;
                }
                int i17 = this.f35595u0;
                if (i17 == 0) {
                    i14 = Math.min(i14, dVar2.j(aVar4).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, dVar2.j(aVar3).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, dVar2.j(aVar2).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, dVar2.j(aVar).d());
                }
            }
        }
        int i18 = i14 + this.f35597w0;
        int i19 = this.f35595u0;
        if (i19 != 0 && i19 != 1) {
            K(i18, i18);
        } else {
            J(i18, i18);
        }
        this.f35598x0 = true;
        return true;
    }

    public final int T() {
        int i10 = this.f35595u0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // u.d
    public final void c(s.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        c[] cVarArr = this.S;
        c cVar2 = this.K;
        cVarArr[0] = cVar2;
        int i14 = 2;
        c cVar3 = this.L;
        cVarArr[2] = cVar3;
        c cVar4 = this.M;
        cVarArr[1] = cVar4;
        c cVar5 = this.N;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f35621i = cVar.k(cVar6);
        }
        int i15 = this.f35595u0;
        if (i15 >= 0 && i15 < 4) {
            c cVar7 = cVarArr[i15];
            if (!this.f35598x0) {
                S();
            }
            if (this.f35598x0) {
                this.f35598x0 = false;
                int i16 = this.f35595u0;
                if (i16 != 0 && i16 != 1) {
                    if (i16 == 2 || i16 == 3) {
                        cVar.d(cVar3.f35621i, this.f35634c0);
                        cVar.d(cVar5.f35621i, this.f35634c0);
                        return;
                    }
                    return;
                }
                cVar.d(cVar2.f35621i, this.f35632b0);
                cVar.d(cVar4.f35621i, this.f35632b0);
                return;
            }
            for (int i17 = 0; i17 < this.f35703t0; i17++) {
                d dVar = this.f35702s0[i17];
                if ((this.f35596v0 || dVar.d()) && ((((i13 = this.f35595u0) == 0 || i13 == 1) && dVar.V[0] == 3 && dVar.K.f != null && dVar.M.f != null) || ((i13 == 2 || i13 == 3) && dVar.V[1] == 3 && dVar.L.f != null && dVar.N.f != null))) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            if (!cVar2.g() && !cVar4.g()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!cVar3.g() && !cVar5.g()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z11 && (((i12 = this.f35595u0) == 0 && z12) || ((i12 == 2 && z13) || ((i12 == 1 && z12) || (i12 == 3 && z13))))) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i10 = 4;
            } else {
                i10 = 5;
            }
            int i18 = 0;
            while (i18 < this.f35703t0) {
                d dVar2 = this.f35702s0[i18];
                if (this.f35596v0 || dVar2.d()) {
                    s.g k10 = cVar.k(dVar2.S[this.f35595u0]);
                    int i19 = this.f35595u0;
                    c cVar8 = dVar2.S[i19];
                    cVar8.f35621i = k10;
                    c cVar9 = cVar8.f;
                    if (cVar9 != null && cVar9.f35617d == this) {
                        i11 = cVar8.f35619g + 0;
                    } else {
                        i11 = 0;
                    }
                    if (i19 != 0 && i19 != i14) {
                        s.g gVar = cVar7.f35621i;
                        int i20 = this.f35597w0 + i11;
                        s.b l10 = cVar.l();
                        s.g m10 = cVar.m();
                        m10.f35035v = 0;
                        l10.c(gVar, k10, m10, i20);
                        cVar.c(l10);
                    } else {
                        s.g gVar2 = cVar7.f35621i;
                        int i21 = this.f35597w0 - i11;
                        s.b l11 = cVar.l();
                        s.g m11 = cVar.m();
                        m11.f35035v = 0;
                        l11.d(gVar2, k10, m11, i21);
                        cVar.c(l11);
                    }
                    cVar.e(cVar7.f35621i, k10, this.f35597w0 + i11, i10);
                }
                i18++;
                i14 = 2;
            }
            int i22 = this.f35595u0;
            if (i22 == 0) {
                cVar.e(cVar4.f35621i, cVar2.f35621i, 0, 8);
                cVar.e(cVar2.f35621i, this.W.M.f35621i, 0, 4);
                cVar.e(cVar2.f35621i, this.W.K.f35621i, 0, 0);
                return;
            }
            if (i22 == 1) {
                cVar.e(cVar2.f35621i, cVar4.f35621i, 0, 8);
                cVar.e(cVar2.f35621i, this.W.K.f35621i, 0, 4);
                cVar.e(cVar2.f35621i, this.W.M.f35621i, 0, 0);
            } else if (i22 == 2) {
                cVar.e(cVar5.f35621i, cVar3.f35621i, 0, 8);
                cVar.e(cVar3.f35621i, this.W.N.f35621i, 0, 4);
                cVar.e(cVar3.f35621i, this.W.L.f35621i, 0, 0);
            } else if (i22 == 3) {
                cVar.e(cVar3.f35621i, cVar5.f35621i, 0, 8);
                cVar.e(cVar3.f35621i, this.W.L.f35621i, 0, 4);
                cVar.e(cVar3.f35621i, this.W.N.f35621i, 0, 0);
            }
        }
    }

    @Override // u.d
    public final boolean d() {
        return true;
    }

    @Override // u.d
    public final String toString() {
        String p10 = a3.l.p(new StringBuilder("[Barrier] "), this.f35649k0, " {");
        for (int i10 = 0; i10 < this.f35703t0; i10++) {
            d dVar = this.f35702s0[i10];
            if (i10 > 0) {
                p10 = com.ironsource.adapters.facebook.a.h(p10, ", ");
            }
            StringBuilder j10 = com.ironsource.adapters.facebook.a.j(p10);
            j10.append(dVar.f35649k0);
            p10 = j10.toString();
        }
        return com.ironsource.adapters.facebook.a.h(p10, "}");
    }
}
