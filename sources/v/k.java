package v;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public final class k extends p {
    public k(u.d dVar) {
        super(dVar);
    }

    @Override // v.p, v.d
    public final void a(d dVar) {
        u.a aVar = (u.a) this.f35896b;
        int i10 = aVar.f35595u0;
        f fVar = this.f35901h;
        Iterator it = fVar.f35882l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f35877g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 != 0 && i10 != 2) {
            fVar.d(i11 + aVar.f35597w0);
        } else {
            fVar.d(i12 + aVar.f35597w0);
        }
    }

    @Override // v.p
    public final void d() {
        u.d dVar = this.f35896b;
        if (dVar instanceof u.a) {
            f fVar = this.f35901h;
            fVar.f35873b = true;
            u.a aVar = (u.a) dVar;
            int i10 = aVar.f35595u0;
            boolean z10 = aVar.f35596v0;
            ArrayList arrayList = fVar.f35882l;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            fVar.f35876e = 7;
                            while (i11 < aVar.f35703t0) {
                                u.d dVar2 = aVar.f35702s0[i11];
                                if (z10 || dVar2.f35647j0 != 8) {
                                    f fVar2 = dVar2.f35637e.f35902i;
                                    fVar2.f35881k.add(fVar);
                                    arrayList.add(fVar2);
                                }
                                i11++;
                            }
                            m(this.f35896b.f35637e.f35901h);
                            m(this.f35896b.f35637e.f35902i);
                            return;
                        }
                        return;
                    }
                    fVar.f35876e = 6;
                    while (i11 < aVar.f35703t0) {
                        u.d dVar3 = aVar.f35702s0[i11];
                        if (z10 || dVar3.f35647j0 != 8) {
                            f fVar3 = dVar3.f35637e.f35901h;
                            fVar3.f35881k.add(fVar);
                            arrayList.add(fVar3);
                        }
                        i11++;
                    }
                    m(this.f35896b.f35637e.f35901h);
                    m(this.f35896b.f35637e.f35902i);
                    return;
                }
                fVar.f35876e = 5;
                while (i11 < aVar.f35703t0) {
                    u.d dVar4 = aVar.f35702s0[i11];
                    if (z10 || dVar4.f35647j0 != 8) {
                        f fVar4 = dVar4.f35635d.f35902i;
                        fVar4.f35881k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i11++;
                }
                m(this.f35896b.f35635d.f35901h);
                m(this.f35896b.f35635d.f35902i);
                return;
            }
            fVar.f35876e = 4;
            while (i11 < aVar.f35703t0) {
                u.d dVar5 = aVar.f35702s0[i11];
                if (z10 || dVar5.f35647j0 != 8) {
                    f fVar5 = dVar5.f35635d.f35901h;
                    fVar5.f35881k.add(fVar);
                    arrayList.add(fVar5);
                }
                i11++;
            }
            m(this.f35896b.f35635d.f35901h);
            m(this.f35896b.f35635d.f35902i);
        }
    }

    @Override // v.p
    public final void e() {
        u.d dVar = this.f35896b;
        if (dVar instanceof u.a) {
            int i10 = ((u.a) dVar).f35595u0;
            f fVar = this.f35901h;
            if (i10 != 0 && i10 != 1) {
                dVar.f35634c0 = fVar.f35877g;
            } else {
                dVar.f35632b0 = fVar.f35877g;
            }
        }
    }

    @Override // v.p
    public final void f() {
        this.f35897c = null;
        this.f35901h.c();
    }

    @Override // v.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f35901h;
        fVar2.f35881k.add(fVar);
        fVar.f35882l.add(fVar2);
    }
}
