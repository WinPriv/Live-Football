package u;

import java.util.ArrayList;
import u.c;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: s0, reason: collision with root package name */
    public float f35696s0 = -1.0f;

    /* renamed from: t0, reason: collision with root package name */
    public int f35697t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public int f35698u0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    public c f35699v0 = this.L;

    /* renamed from: w0, reason: collision with root package name */
    public int f35700w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f35701x0;

    public g() {
        this.T.clear();
        this.T.add(this.f35699v0);
        int length = this.S.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.S[i10] = this.f35699v0;
        }
    }

    @Override // u.d
    public final boolean B() {
        return this.f35701x0;
    }

    @Override // u.d
    public final boolean C() {
        return this.f35701x0;
    }

    @Override // u.d
    public final void Q(s.c cVar, boolean z10) {
        if (this.W == null) {
            return;
        }
        c cVar2 = this.f35699v0;
        cVar.getClass();
        int n10 = s.c.n(cVar2);
        if (this.f35700w0 == 1) {
            this.f35632b0 = n10;
            this.f35634c0 = 0;
            L(this.W.l());
            O(0);
            return;
        }
        this.f35632b0 = 0;
        this.f35634c0 = n10;
        O(this.W.r());
        L(0);
    }

    public final void R(int i10) {
        this.f35699v0.l(i10);
        this.f35701x0 = true;
    }

    public final void S(int i10) {
        if (this.f35700w0 == i10) {
            return;
        }
        this.f35700w0 = i10;
        ArrayList<c> arrayList = this.T;
        arrayList.clear();
        if (this.f35700w0 == 1) {
            this.f35699v0 = this.K;
        } else {
            this.f35699v0 = this.L;
        }
        arrayList.add(this.f35699v0);
        c[] cVarArr = this.S;
        int length = cVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            cVarArr[i11] = this.f35699v0;
        }
    }

    @Override // u.d
    public final void c(s.c cVar, boolean z10) {
        boolean z11;
        e eVar = (e) this.W;
        if (eVar == null) {
            return;
        }
        Object j10 = eVar.j(c.a.LEFT);
        Object j11 = eVar.j(c.a.RIGHT);
        d dVar = this.W;
        boolean z12 = true;
        if (dVar != null && dVar.V[0] == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f35700w0 == 0) {
            j10 = eVar.j(c.a.TOP);
            j11 = eVar.j(c.a.BOTTOM);
            d dVar2 = this.W;
            if (dVar2 == null || dVar2.V[1] != 2) {
                z12 = false;
            }
            z11 = z12;
        }
        if (this.f35701x0) {
            c cVar2 = this.f35699v0;
            if (cVar2.f35616c) {
                s.g k10 = cVar.k(cVar2);
                cVar.d(k10, this.f35699v0.d());
                if (this.f35697t0 != -1) {
                    if (z11) {
                        cVar.f(cVar.k(j11), k10, 0, 5);
                    }
                } else if (this.f35698u0 != -1 && z11) {
                    s.g k11 = cVar.k(j11);
                    cVar.f(k10, cVar.k(j10), 0, 5);
                    cVar.f(k11, k10, 0, 5);
                }
                this.f35701x0 = false;
                return;
            }
        }
        if (this.f35697t0 != -1) {
            s.g k12 = cVar.k(this.f35699v0);
            cVar.e(k12, cVar.k(j10), this.f35697t0, 8);
            if (z11) {
                cVar.f(cVar.k(j11), k12, 0, 5);
                return;
            }
            return;
        }
        if (this.f35698u0 != -1) {
            s.g k13 = cVar.k(this.f35699v0);
            s.g k14 = cVar.k(j11);
            cVar.e(k13, k14, -this.f35698u0, 8);
            if (z11) {
                cVar.f(k13, cVar.k(j10), 0, 5);
                cVar.f(k14, k13, 0, 5);
                return;
            }
            return;
        }
        if (this.f35696s0 != -1.0f) {
            s.g k15 = cVar.k(this.f35699v0);
            s.g k16 = cVar.k(j11);
            float f = this.f35696s0;
            s.b l10 = cVar.l();
            l10.f35006d.a(k15, -1.0f);
            l10.f35006d.a(k16, f);
            cVar.c(l10);
        }
    }

    @Override // u.d
    public final boolean d() {
        return true;
    }

    @Override // u.d
    public final c j(c.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f35700w0 == 0) {
                return this.f35699v0;
            }
            return null;
        }
        if (this.f35700w0 == 1) {
            return this.f35699v0;
        }
        return null;
    }
}
