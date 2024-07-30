package u;

import u.c;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public final class j extends k {
    @Override // u.k
    public final void S(int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        int i14 = this.y0 + this.f35708z0 + 0;
        int i15 = this.f35704u0 + this.f35705v0 + 0;
        if (this.f35703t0 > 0) {
            i14 += this.f35702s0[0].r();
            i15 += this.f35702s0[0].l();
        }
        int max = Math.max(this.f35638e0, i14);
        int max2 = Math.max(this.f35639f0, i15);
        if (i10 != 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                i11 = Math.min(max, i11);
            } else if (i10 == 0) {
                i11 = max;
            } else {
                i11 = 0;
            }
        }
        if (i12 != 1073741824) {
            if (i12 == Integer.MIN_VALUE) {
                i13 = Math.min(max2, i13);
            } else if (i12 == 0) {
                i13 = max2;
            } else {
                i13 = 0;
            }
        }
        this.B0 = i11;
        this.C0 = i13;
        O(i11);
        L(i13);
        if (this.f35703t0 > 0) {
            z10 = true;
        }
        this.A0 = z10;
    }

    @Override // u.d
    public final void c(s.c cVar, boolean z10) {
        super.c(cVar, z10);
        if (this.f35703t0 > 0) {
            d dVar = this.f35702s0[0];
            dVar.E();
            dVar.f35643h0 = 0.5f;
            dVar.f35641g0 = 0.5f;
            c.a aVar = c.a.LEFT;
            dVar.f(aVar, this, aVar, 0);
            c.a aVar2 = c.a.RIGHT;
            dVar.f(aVar2, this, aVar2, 0);
            c.a aVar3 = c.a.TOP;
            dVar.f(aVar3, this, aVar3, 0);
            c.a aVar4 = c.a.BOTTOM;
            dVar.f(aVar4, this, aVar4, 0);
        }
    }
}
