package v;

import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import u.c;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public final f f35888k;

    /* renamed from: l, reason: collision with root package name */
    public a f35889l;

    public n(u.d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.f35888k = fVar;
        this.f35889l = null;
        this.f35901h.f35876e = 6;
        this.f35902i.f35876e = 7;
        fVar.f35876e = 8;
        this.f = 1;
    }

    @Override // v.p, v.d
    public final void a(d dVar) {
        float f;
        float f10;
        float f11;
        int i10;
        if (s.f.c(this.f35903j) != 3) {
            g gVar = this.f35899e;
            if (gVar.f35874c && !gVar.f35880j && this.f35898d == 3) {
                u.d dVar2 = this.f35896b;
                int i11 = dVar2.f35664t;
                if (i11 != 2) {
                    if (i11 == 3) {
                        g gVar2 = dVar2.f35635d.f35899e;
                        if (gVar2.f35880j) {
                            int i12 = dVar2.f35630a0;
                            if (i12 != -1) {
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        i10 = 0;
                                        gVar.d(i10);
                                    } else {
                                        f = gVar2.f35877g;
                                        f10 = dVar2.Z;
                                    }
                                } else {
                                    f11 = gVar2.f35877g * dVar2.Z;
                                    i10 = (int) (f11 + 0.5f);
                                    gVar.d(i10);
                                }
                            } else {
                                f = gVar2.f35877g;
                                f10 = dVar2.Z;
                            }
                            f11 = f / f10;
                            i10 = (int) (f11 + 0.5f);
                            gVar.d(i10);
                        }
                    }
                } else {
                    u.d dVar3 = dVar2.W;
                    if (dVar3 != null) {
                        if (dVar3.f35637e.f35899e.f35880j) {
                            gVar.d((int) ((r5.f35877g * dVar2.A) + 0.5f));
                        }
                    }
                }
            }
            f fVar = this.f35901h;
            if (fVar.f35874c) {
                f fVar2 = this.f35902i;
                if (fVar2.f35874c) {
                    if (fVar.f35880j && fVar2.f35880j && gVar.f35880j) {
                        return;
                    }
                    boolean z10 = gVar.f35880j;
                    ArrayList arrayList = fVar.f35882l;
                    ArrayList arrayList2 = fVar2.f35882l;
                    if (!z10 && this.f35898d == 3) {
                        u.d dVar4 = this.f35896b;
                        if (dVar4.f35663s == 0 && !dVar4.z()) {
                            f fVar3 = (f) arrayList.get(0);
                            f fVar4 = (f) arrayList2.get(0);
                            int i13 = fVar3.f35877g + fVar.f;
                            int i14 = fVar4.f35877g + fVar2.f;
                            fVar.d(i13);
                            fVar2.d(i14);
                            gVar.d(i14 - i13);
                            return;
                        }
                    }
                    if (!gVar.f35880j && this.f35898d == 3 && this.f35895a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        f fVar5 = (f) arrayList.get(0);
                        int i15 = (((f) arrayList2.get(0)).f35877g + fVar2.f) - (fVar5.f35877g + fVar.f);
                        int i16 = gVar.f35883m;
                        if (i15 < i16) {
                            gVar.d(i15);
                        } else {
                            gVar.d(i16);
                        }
                    }
                    if (gVar.f35880j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        f fVar6 = (f) arrayList.get(0);
                        f fVar7 = (f) arrayList2.get(0);
                        int i17 = fVar6.f35877g;
                        int i18 = fVar.f + i17;
                        int i19 = fVar7.f35877g;
                        int i20 = fVar2.f + i19;
                        float f12 = this.f35896b.f35643h0;
                        if (fVar6 == fVar7) {
                            f12 = 0.5f;
                        } else {
                            i17 = i18;
                            i19 = i20;
                        }
                        fVar.d((int) ((((i19 - i17) - gVar.f35877g) * f12) + i17 + 0.5f));
                        fVar2.d(fVar.f35877g + gVar.f35877g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        u.d dVar5 = this.f35896b;
        l(dVar5.L, dVar5.N, 1);
    }

    @Override // v.p
    public final void d() {
        u.d dVar;
        u.d dVar2;
        u.d dVar3;
        u.d dVar4;
        u.d dVar5 = this.f35896b;
        boolean z10 = dVar5.f35629a;
        g gVar = this.f35899e;
        if (z10) {
            gVar.d(dVar5.l());
        }
        boolean z11 = gVar.f35880j;
        f fVar = this.f35902i;
        f fVar2 = this.f35901h;
        if (!z11) {
            u.d dVar6 = this.f35896b;
            this.f35898d = dVar6.V[1];
            if (dVar6.F) {
                this.f35889l = new a(this);
            }
            int i10 = this.f35898d;
            if (i10 != 3) {
                if (i10 == 4 && (dVar4 = this.f35896b.W) != null && dVar4.V[1] == 1) {
                    int l10 = (dVar4.l() - this.f35896b.L.e()) - this.f35896b.N.e();
                    p.b(fVar2, dVar4.f35637e.f35901h, this.f35896b.L.e());
                    p.b(fVar, dVar4.f35637e.f35902i, -this.f35896b.N.e());
                    gVar.d(l10);
                    return;
                }
                if (i10 == 1) {
                    gVar.d(this.f35896b.l());
                }
            }
        } else if (this.f35898d == 4 && (dVar2 = (dVar = this.f35896b).W) != null && dVar2.V[1] == 1) {
            p.b(fVar2, dVar2.f35637e.f35901h, dVar.L.e());
            p.b(fVar, dVar2.f35637e.f35902i, -this.f35896b.N.e());
            return;
        }
        boolean z12 = gVar.f35880j;
        f fVar3 = this.f35888k;
        if (z12) {
            u.d dVar7 = this.f35896b;
            if (dVar7.f35629a) {
                u.c[] cVarArr = dVar7.S;
                u.c cVar = cVarArr[2];
                u.c cVar2 = cVar.f;
                if (cVar2 != null && cVarArr[3].f != null) {
                    if (dVar7.z()) {
                        fVar2.f = this.f35896b.S[2].e();
                        fVar.f = -this.f35896b.S[3].e();
                    } else {
                        f h10 = p.h(this.f35896b.S[2]);
                        if (h10 != null) {
                            p.b(fVar2, h10, this.f35896b.S[2].e());
                        }
                        f h11 = p.h(this.f35896b.S[3]);
                        if (h11 != null) {
                            p.b(fVar, h11, -this.f35896b.S[3].e());
                        }
                        fVar2.f35873b = true;
                        fVar.f35873b = true;
                    }
                    u.d dVar8 = this.f35896b;
                    if (dVar8.F) {
                        p.b(fVar3, fVar2, dVar8.f35636d0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f h12 = p.h(cVar);
                    if (h12 != null) {
                        p.b(fVar2, h12, this.f35896b.S[2].e());
                        p.b(fVar, fVar2, gVar.f35877g);
                        u.d dVar9 = this.f35896b;
                        if (dVar9.F) {
                            p.b(fVar3, fVar2, dVar9.f35636d0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                u.c cVar3 = cVarArr[3];
                if (cVar3.f != null) {
                    f h13 = p.h(cVar3);
                    if (h13 != null) {
                        p.b(fVar, h13, -this.f35896b.S[3].e());
                        p.b(fVar2, fVar, -gVar.f35877g);
                    }
                    u.d dVar10 = this.f35896b;
                    if (dVar10.F) {
                        p.b(fVar3, fVar2, dVar10.f35636d0);
                        return;
                    }
                    return;
                }
                u.c cVar4 = cVarArr[4];
                if (cVar4.f != null) {
                    f h14 = p.h(cVar4);
                    if (h14 != null) {
                        p.b(fVar3, h14, 0);
                        p.b(fVar2, fVar3, -this.f35896b.f35636d0);
                        p.b(fVar, fVar2, gVar.f35877g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof u.h) && dVar7.W != null && dVar7.j(c.a.CENTER).f == null) {
                    u.d dVar11 = this.f35896b;
                    p.b(fVar2, dVar11.W.f35637e.f35901h, dVar11.t());
                    p.b(fVar, fVar2, gVar.f35877g);
                    u.d dVar12 = this.f35896b;
                    if (dVar12.F) {
                        p.b(fVar3, fVar2, dVar12.f35636d0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = gVar.f35882l;
        if (!z12 && this.f35898d == 3) {
            u.d dVar13 = this.f35896b;
            int i11 = dVar13.f35664t;
            ArrayList arrayList2 = gVar.f35881k;
            if (i11 != 2) {
                if (i11 == 3 && !dVar13.z()) {
                    u.d dVar14 = this.f35896b;
                    if (dVar14.f35663s != 3) {
                        g gVar2 = dVar14.f35635d.f35899e;
                        arrayList.add(gVar2);
                        gVar2.f35881k.add(gVar);
                        gVar.f35873b = true;
                        arrayList2.add(fVar2);
                        arrayList2.add(fVar);
                    }
                }
            } else {
                u.d dVar15 = dVar13.W;
                if (dVar15 != null) {
                    g gVar3 = dVar15.f35637e.f35899e;
                    arrayList.add(gVar3);
                    gVar3.f35881k.add(gVar);
                    gVar.f35873b = true;
                    arrayList2.add(fVar2);
                    arrayList2.add(fVar);
                }
            }
        } else {
            gVar.b(this);
        }
        u.d dVar16 = this.f35896b;
        u.c[] cVarArr2 = dVar16.S;
        u.c cVar5 = cVarArr2[2];
        u.c cVar6 = cVar5.f;
        if (cVar6 != null && cVarArr2[3].f != null) {
            if (dVar16.z()) {
                fVar2.f = this.f35896b.S[2].e();
                fVar.f = -this.f35896b.S[3].e();
            } else {
                f h15 = p.h(this.f35896b.S[2]);
                f h16 = p.h(this.f35896b.S[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f35903j = 4;
            }
            if (this.f35896b.F) {
                c(fVar3, fVar2, 1, this.f35889l);
            }
        } else if (cVar6 != null) {
            f h17 = p.h(cVar5);
            if (h17 != null) {
                p.b(fVar2, h17, this.f35896b.S[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f35896b.F) {
                    c(fVar3, fVar2, 1, this.f35889l);
                }
                if (this.f35898d == 3) {
                    u.d dVar17 = this.f35896b;
                    if (dVar17.Z > gl.Code) {
                        l lVar = dVar17.f35635d;
                        if (lVar.f35898d == 3) {
                            lVar.f35899e.f35881k.add(gVar);
                            arrayList.add(this.f35896b.f35635d.f35899e);
                            gVar.f35872a = this;
                        }
                    }
                }
            }
        } else {
            u.c cVar7 = cVarArr2[3];
            if (cVar7.f != null) {
                f h18 = p.h(cVar7);
                if (h18 != null) {
                    p.b(fVar, h18, -this.f35896b.S[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f35896b.F) {
                        c(fVar3, fVar2, 1, this.f35889l);
                    }
                }
            } else {
                u.c cVar8 = cVarArr2[4];
                if (cVar8.f != null) {
                    f h19 = p.h(cVar8);
                    if (h19 != null) {
                        p.b(fVar3, h19, 0);
                        c(fVar2, fVar3, -1, this.f35889l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof u.h) && (dVar3 = dVar16.W) != null) {
                    p.b(fVar2, dVar3.f35637e.f35901h, dVar16.t());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f35896b.F) {
                        c(fVar3, fVar2, 1, this.f35889l);
                    }
                    if (this.f35898d == 3) {
                        u.d dVar18 = this.f35896b;
                        if (dVar18.Z > gl.Code) {
                            l lVar2 = dVar18.f35635d;
                            if (lVar2.f35898d == 3) {
                                lVar2.f35899e.f35881k.add(gVar);
                                arrayList.add(this.f35896b.f35635d.f35899e);
                                gVar.f35872a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            gVar.f35874c = true;
        }
    }

    @Override // v.p
    public final void e() {
        f fVar = this.f35901h;
        if (fVar.f35880j) {
            this.f35896b.f35634c0 = fVar.f35877g;
        }
    }

    @Override // v.p
    public final void f() {
        this.f35897c = null;
        this.f35901h.c();
        this.f35902i.c();
        this.f35888k.c();
        this.f35899e.c();
        this.f35900g = false;
    }

    @Override // v.p
    public final boolean k() {
        if (this.f35898d != 3 || this.f35896b.f35664t == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f35900g = false;
        f fVar = this.f35901h;
        fVar.c();
        fVar.f35880j = false;
        f fVar2 = this.f35902i;
        fVar2.c();
        fVar2.f35880j = false;
        f fVar3 = this.f35888k;
        fVar3.c();
        fVar3.f35880j = false;
        this.f35899e.f35880j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f35896b.f35649k0;
    }
}
