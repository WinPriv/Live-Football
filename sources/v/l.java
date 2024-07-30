package v;

import java.util.ArrayList;
import u.c;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f35885k = new int[2];

    public l(u.d dVar) {
        super(dVar);
        this.f35901h.f35876e = 4;
        this.f35902i.f35876e = 5;
        this.f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    iArr[0] = i15;
                    iArr[1] = (int) ((i15 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i16 * f) + 0.5f);
            iArr[1] = i16;
            return;
        }
        int i17 = (int) ((i16 * f) + 0.5f);
        int i18 = (int) ((i15 / f) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0243, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // v.p, v.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(v.d r24) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.l.a(v.d):void");
    }

    @Override // v.p
    public final void d() {
        u.d dVar;
        u.d dVar2;
        int i10;
        u.d dVar3;
        u.d dVar4;
        int i11;
        u.d dVar5 = this.f35896b;
        boolean z10 = dVar5.f35629a;
        g gVar = this.f35899e;
        if (z10) {
            gVar.d(dVar5.r());
        }
        boolean z11 = gVar.f35880j;
        f fVar = this.f35902i;
        f fVar2 = this.f35901h;
        if (!z11) {
            u.d dVar6 = this.f35896b;
            int i12 = dVar6.V[0];
            this.f35898d = i12;
            if (i12 != 3) {
                if (i12 == 4 && (dVar4 = dVar6.W) != null && ((i11 = dVar4.V[0]) == 1 || i11 == 4)) {
                    int r10 = (dVar4.r() - this.f35896b.K.e()) - this.f35896b.M.e();
                    p.b(fVar2, dVar4.f35635d.f35901h, this.f35896b.K.e());
                    p.b(fVar, dVar4.f35635d.f35902i, -this.f35896b.M.e());
                    gVar.d(r10);
                    return;
                }
                if (i12 == 1) {
                    gVar.d(dVar6.r());
                }
            }
        } else if (this.f35898d == 4 && (dVar2 = (dVar = this.f35896b).W) != null && ((i10 = dVar2.V[0]) == 1 || i10 == 4)) {
            p.b(fVar2, dVar2.f35635d.f35901h, dVar.K.e());
            p.b(fVar, dVar2.f35635d.f35902i, -this.f35896b.M.e());
            return;
        }
        if (gVar.f35880j) {
            u.d dVar7 = this.f35896b;
            if (dVar7.f35629a) {
                u.c[] cVarArr = dVar7.S;
                u.c cVar = cVarArr[0];
                u.c cVar2 = cVar.f;
                if (cVar2 != null && cVarArr[1].f != null) {
                    if (dVar7.y()) {
                        fVar2.f = this.f35896b.S[0].e();
                        fVar.f = -this.f35896b.S[1].e();
                        return;
                    }
                    f h10 = p.h(this.f35896b.S[0]);
                    if (h10 != null) {
                        p.b(fVar2, h10, this.f35896b.S[0].e());
                    }
                    f h11 = p.h(this.f35896b.S[1]);
                    if (h11 != null) {
                        p.b(fVar, h11, -this.f35896b.S[1].e());
                    }
                    fVar2.f35873b = true;
                    fVar.f35873b = true;
                    return;
                }
                if (cVar2 != null) {
                    f h12 = p.h(cVar);
                    if (h12 != null) {
                        p.b(fVar2, h12, this.f35896b.S[0].e());
                        p.b(fVar, fVar2, gVar.f35877g);
                        return;
                    }
                    return;
                }
                u.c cVar3 = cVarArr[1];
                if (cVar3.f != null) {
                    f h13 = p.h(cVar3);
                    if (h13 != null) {
                        p.b(fVar, h13, -this.f35896b.S[1].e());
                        p.b(fVar2, fVar, -gVar.f35877g);
                        return;
                    }
                    return;
                }
                if (!(dVar7 instanceof u.h) && dVar7.W != null && dVar7.j(c.a.CENTER).f == null) {
                    u.d dVar8 = this.f35896b;
                    p.b(fVar2, dVar8.W.f35635d.f35901h, dVar8.s());
                    p.b(fVar, fVar2, gVar.f35877g);
                    return;
                }
                return;
            }
        }
        if (this.f35898d == 3) {
            u.d dVar9 = this.f35896b;
            int i13 = dVar9.f35663s;
            ArrayList arrayList = gVar.f35881k;
            ArrayList arrayList2 = gVar.f35882l;
            if (i13 != 2) {
                if (i13 == 3) {
                    if (dVar9.f35664t == 3) {
                        fVar2.f35872a = this;
                        fVar.f35872a = this;
                        n nVar = dVar9.f35637e;
                        nVar.f35901h.f35872a = this;
                        nVar.f35902i.f35872a = this;
                        gVar.f35872a = this;
                        if (dVar9.z()) {
                            arrayList2.add(this.f35896b.f35637e.f35899e);
                            this.f35896b.f35637e.f35899e.f35881k.add(gVar);
                            n nVar2 = this.f35896b.f35637e;
                            nVar2.f35899e.f35872a = this;
                            arrayList2.add(nVar2.f35901h);
                            arrayList2.add(this.f35896b.f35637e.f35902i);
                            this.f35896b.f35637e.f35901h.f35881k.add(gVar);
                            this.f35896b.f35637e.f35902i.f35881k.add(gVar);
                        } else if (this.f35896b.y()) {
                            this.f35896b.f35637e.f35899e.f35882l.add(gVar);
                            arrayList.add(this.f35896b.f35637e.f35899e);
                        } else {
                            this.f35896b.f35637e.f35899e.f35882l.add(gVar);
                        }
                    } else {
                        g gVar2 = dVar9.f35637e.f35899e;
                        arrayList2.add(gVar2);
                        gVar2.f35881k.add(gVar);
                        this.f35896b.f35637e.f35901h.f35881k.add(gVar);
                        this.f35896b.f35637e.f35902i.f35881k.add(gVar);
                        gVar.f35873b = true;
                        arrayList.add(fVar2);
                        arrayList.add(fVar);
                        fVar2.f35882l.add(gVar);
                        fVar.f35882l.add(gVar);
                    }
                }
            } else {
                u.d dVar10 = dVar9.W;
                if (dVar10 != null) {
                    g gVar3 = dVar10.f35637e.f35899e;
                    arrayList2.add(gVar3);
                    gVar3.f35881k.add(gVar);
                    gVar.f35873b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            }
        }
        u.d dVar11 = this.f35896b;
        u.c[] cVarArr2 = dVar11.S;
        u.c cVar4 = cVarArr2[0];
        u.c cVar5 = cVar4.f;
        if (cVar5 != null && cVarArr2[1].f != null) {
            if (dVar11.y()) {
                fVar2.f = this.f35896b.S[0].e();
                fVar.f = -this.f35896b.S[1].e();
                return;
            }
            f h14 = p.h(this.f35896b.S[0]);
            f h15 = p.h(this.f35896b.S[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f35903j = 4;
            return;
        }
        if (cVar5 != null) {
            f h16 = p.h(cVar4);
            if (h16 != null) {
                p.b(fVar2, h16, this.f35896b.S[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        u.c cVar6 = cVarArr2[1];
        if (cVar6.f != null) {
            f h17 = p.h(cVar6);
            if (h17 != null) {
                p.b(fVar, h17, -this.f35896b.S[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if (!(dVar11 instanceof u.h) && (dVar3 = dVar11.W) != null) {
            p.b(fVar2, dVar3.f35635d.f35901h, dVar11.s());
            c(fVar, fVar2, 1, gVar);
        }
    }

    @Override // v.p
    public final void e() {
        f fVar = this.f35901h;
        if (fVar.f35880j) {
            this.f35896b.f35632b0 = fVar.f35877g;
        }
    }

    @Override // v.p
    public final void f() {
        this.f35897c = null;
        this.f35901h.c();
        this.f35902i.c();
        this.f35899e.c();
        this.f35900g = false;
    }

    @Override // v.p
    public final boolean k() {
        if (this.f35898d != 3 || this.f35896b.f35663s == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f35900g = false;
        f fVar = this.f35901h;
        fVar.c();
        fVar.f35880j = false;
        f fVar2 = this.f35902i;
        fVar2.c();
        fVar2.f35880j = false;
        this.f35899e.f35880j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f35896b.f35649k0;
    }
}
