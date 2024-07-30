package u;

import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.o;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f35615b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35616c;

    /* renamed from: d, reason: collision with root package name */
    public final d f35617d;

    /* renamed from: e, reason: collision with root package name */
    public final a f35618e;
    public c f;

    /* renamed from: i, reason: collision with root package name */
    public s.g f35621i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet<c> f35614a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f35619g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f35620h = Integer.MIN_VALUE;

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.f35617d = dVar;
        this.f35618e = aVar;
    }

    public final void a(c cVar, int i10) {
        b(cVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i10, int i11, boolean z10) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z10 && !i(cVar)) {
            return false;
        }
        this.f = cVar;
        if (cVar.f35614a == null) {
            cVar.f35614a = new HashSet<>();
        }
        HashSet<c> hashSet = this.f.f35614a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f35619g = i10;
        this.f35620h = i11;
        return true;
    }

    public final void c(int i10, o oVar, ArrayList arrayList) {
        HashSet<c> hashSet = this.f35614a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                v.i.a(it.next().f35617d, i10, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (!this.f35616c) {
            return 0;
        }
        return this.f35615b;
    }

    public final int e() {
        c cVar;
        if (this.f35617d.f35647j0 == 8) {
            return 0;
        }
        int i10 = this.f35620h;
        if (i10 != Integer.MIN_VALUE && (cVar = this.f) != null && cVar.f35617d.f35647j0 == 8) {
            return i10;
        }
        return this.f35619g;
    }

    public final c f() {
        a aVar = this.f35618e;
        int ordinal = aVar.ordinal();
        d dVar = this.f35617d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.M;
            case 2:
                return dVar.N;
            case 3:
                return dVar.K;
            case 4:
                return dVar.L;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final boolean g() {
        HashSet<c> hashSet = this.f35614a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final boolean i(c cVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (cVar == null) {
            return false;
        }
        a aVar = a.BASELINE;
        a aVar2 = this.f35618e;
        d dVar = cVar.f35617d;
        a aVar3 = cVar.f35618e;
        if (aVar3 == aVar2) {
            if (aVar2 == aVar && (!dVar.F || !this.f35617d.F)) {
                return false;
            }
            return true;
        }
        int ordinal = aVar2.ordinal();
        a aVar4 = a.CENTER_Y;
        a aVar5 = a.RIGHT;
        a aVar6 = a.CENTER_X;
        a aVar7 = a.LEFT;
        switch (ordinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                if (aVar3 != aVar7 && aVar3 != aVar5) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (dVar instanceof g) {
                    if (z10 || aVar3 == aVar6) {
                        z12 = true;
                    }
                    return z12;
                }
                return z10;
            case 2:
            case 4:
                if (aVar3 != a.TOP && aVar3 != a.BOTTOM) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (dVar instanceof g) {
                    if (z11 || aVar3 == aVar4) {
                        z12 = true;
                    }
                    return z12;
                }
                return z11;
            case 5:
                if (aVar3 == aVar7 || aVar3 == aVar5) {
                    return false;
                }
                return true;
            case 6:
                if (aVar3 == aVar || aVar3 == aVar6 || aVar3 == aVar4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(aVar2.name());
        }
    }

    public final void j() {
        HashSet<c> hashSet;
        c cVar = this.f;
        if (cVar != null && (hashSet = cVar.f35614a) != null) {
            hashSet.remove(this);
            if (this.f.f35614a.size() == 0) {
                this.f.f35614a = null;
            }
        }
        this.f35614a = null;
        this.f = null;
        this.f35619g = 0;
        this.f35620h = Integer.MIN_VALUE;
        this.f35616c = false;
        this.f35615b = 0;
    }

    public final void k() {
        s.g gVar = this.f35621i;
        if (gVar == null) {
            this.f35621i = new s.g(1);
        } else {
            gVar.c();
        }
    }

    public final void l(int i10) {
        this.f35615b = i10;
        this.f35616c = true;
    }

    public final String toString() {
        return this.f35617d.f35649k0 + w.bE + this.f35618e.toString();
    }
}
