package j5;

import j5.u;
import k4.q1;

/* compiled from: WrappingMediaSource.java */
/* loaded from: classes2.dex */
public abstract class p0 extends g<Void> {
    public final u C;

    public p0(u uVar) {
        this.C = uVar;
    }

    @Override // j5.g
    public final void A(Void r12, u uVar, q1 q1Var) {
        D(q1Var);
    }

    public abstract void D(q1 q1Var);

    public void E() {
        B(null, this.C);
    }

    @Override // j5.u
    public final k4.n0 d() {
        return this.C.d();
    }

    @Override // j5.u
    public final boolean k() {
        return this.C.k();
    }

    @Override // j5.u
    public final q1 m() {
        return this.C.m();
    }

    @Override // j5.a
    public final void u(c6.h0 h0Var) {
        this.B = h0Var;
        this.A = d6.g0.k(null);
        E();
    }

    @Override // j5.g
    public final u.b x(Void r12, u.b bVar) {
        return C(bVar);
    }

    @Override // j5.g
    public final long y(long j10, Object obj) {
        return j10;
    }

    @Override // j5.g
    public final int z(int i10, Object obj) {
        return i10;
    }

    public u.b C(u.b bVar) {
        return bVar;
    }
}
