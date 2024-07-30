package v;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<p> f35863k;

    /* renamed from: l, reason: collision with root package name */
    public int f35864l;

    public c(int i10, u.d dVar) {
        super(dVar);
        p pVar;
        boolean z10;
        int i11;
        p pVar2;
        this.f35863k = new ArrayList<>();
        this.f = i10;
        u.d dVar2 = this.f35896b;
        u.d n10 = dVar2.n(i10);
        while (n10 != null) {
            dVar2 = n10;
            n10 = n10.n(this.f);
        }
        this.f35896b = dVar2;
        int i12 = this.f;
        if (i12 == 0) {
            pVar = dVar2.f35635d;
        } else if (i12 == 1) {
            pVar = dVar2.f35637e;
        } else {
            pVar = null;
        }
        ArrayList<p> arrayList = this.f35863k;
        arrayList.add(pVar);
        u.d m10 = dVar2.m(this.f);
        while (m10 != null) {
            int i13 = this.f;
            if (i13 == 0) {
                pVar2 = m10.f35635d;
            } else if (i13 == 1) {
                pVar2 = m10.f35637e;
            } else {
                pVar2 = null;
            }
            arrayList.add(pVar2);
            m10 = m10.m(this.f);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i14 = this.f;
            if (i14 == 0) {
                next.f35896b.f35631b = this;
            } else if (i14 == 1) {
                next.f35896b.f35633c = this;
            }
        }
        if (this.f == 0 && ((u.e) this.f35896b.W).f35674x0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && arrayList.size() > 1) {
            this.f35896b = arrayList.get(arrayList.size() - 1).f35896b;
        }
        if (this.f == 0) {
            i11 = this.f35896b.f35651l0;
        } else {
            i11 = this.f35896b.f35653m0;
        }
        this.f35864l = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x03a5, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // v.p, v.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(v.d r27) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.c.a(v.d):void");
    }

    @Override // v.p
    public final void d() {
        ArrayList<p> arrayList = this.f35863k;
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        u.d dVar = arrayList.get(0).f35896b;
        u.d dVar2 = arrayList.get(size - 1).f35896b;
        int i10 = this.f;
        f fVar = this.f35902i;
        f fVar2 = this.f35901h;
        if (i10 == 0) {
            u.c cVar = dVar.K;
            u.c cVar2 = dVar2.M;
            f i11 = p.i(cVar, 0);
            int e10 = cVar.e();
            u.d m10 = m();
            if (m10 != null) {
                e10 = m10.K.e();
            }
            if (i11 != null) {
                p.b(fVar2, i11, e10);
            }
            f i12 = p.i(cVar2, 0);
            int e11 = cVar2.e();
            u.d n10 = n();
            if (n10 != null) {
                e11 = n10.M.e();
            }
            if (i12 != null) {
                p.b(fVar, i12, -e11);
            }
        } else {
            u.c cVar3 = dVar.L;
            u.c cVar4 = dVar2.N;
            f i13 = p.i(cVar3, 1);
            int e12 = cVar3.e();
            u.d m11 = m();
            if (m11 != null) {
                e12 = m11.L.e();
            }
            if (i13 != null) {
                p.b(fVar2, i13, e12);
            }
            f i14 = p.i(cVar4, 1);
            int e13 = cVar4.e();
            u.d n11 = n();
            if (n11 != null) {
                e13 = n11.N.e();
            }
            if (i14 != null) {
                p.b(fVar, i14, -e13);
            }
        }
        fVar2.f35872a = this;
        fVar.f35872a = this;
    }

    @Override // v.p
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f35863k;
            if (i10 < arrayList.size()) {
                arrayList.get(i10).e();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // v.p
    public final void f() {
        this.f35897c = null;
        Iterator<p> it = this.f35863k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // v.p
    public final long j() {
        ArrayList<p> arrayList = this.f35863k;
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = r5.f35902i.f + arrayList.get(i10).j() + j10 + r5.f35901h.f;
        }
        return j10;
    }

    @Override // v.p
    public final boolean k() {
        ArrayList<p> arrayList = this.f35863k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!arrayList.get(i10).k()) {
                return false;
            }
        }
        return true;
    }

    public final u.d m() {
        int i10 = 0;
        while (true) {
            ArrayList<p> arrayList = this.f35863k;
            if (i10 < arrayList.size()) {
                u.d dVar = arrayList.get(i10).f35896b;
                if (dVar.f35647j0 != 8) {
                    return dVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final u.d n() {
        ArrayList<p> arrayList = this.f35863k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u.d dVar = arrayList.get(size).f35896b;
            if (dVar.f35647j0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        Iterator<p> it = this.f35863k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            sb2.append("<");
            sb2.append(next);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
