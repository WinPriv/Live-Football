package k4;

import j5.u;
import k4.q1;

/* compiled from: BasePlayer.java */
/* loaded from: classes2.dex */
public abstract class d implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final q1.c f30398a = new q1.c();

    @Override // k4.e1
    public final boolean C(int i10) {
        a0 a0Var = (a0) this;
        a0Var.t0();
        return a0Var.N.f30412s.f27321a.get(i10);
    }

    @Override // k4.e1
    public final boolean F() {
        a0 a0Var = (a0) this;
        q1 I = a0Var.I();
        if (!I.p() && I.m(a0Var.B(), this.f30398a).A) {
            return true;
        }
        return false;
    }

    @Override // k4.e1
    public final void M() {
        a0 a0Var = (a0) this;
        if (!a0Var.I().p() && !a0Var.c()) {
            if (x()) {
                int S = S();
                if (S != -1) {
                    if (S == a0Var.B()) {
                        U(a0Var.B(), com.anythink.expressad.exoplayer.b.f7291b, true);
                        return;
                    } else {
                        W(S, 9);
                        return;
                    }
                }
                return;
            }
            if (R() && F()) {
                W(a0Var.B(), 9);
            }
        }
    }

    @Override // k4.e1
    public final void N() {
        a0 a0Var = (a0) this;
        a0Var.t0();
        X(12, a0Var.f30347v);
    }

    @Override // k4.e1
    public final void P() {
        a0 a0Var = (a0) this;
        a0Var.t0();
        X(11, -a0Var.f30346u);
    }

    @Override // k4.e1
    public final boolean R() {
        a0 a0Var = (a0) this;
        q1 I = a0Var.I();
        if (!I.p() && I.m(a0Var.B(), this.f30398a).a()) {
            return true;
        }
        return false;
    }

    public final int S() {
        a0 a0Var = (a0) this;
        q1 I = a0Var.I();
        if (I.p()) {
            return -1;
        }
        int B = a0Var.B();
        a0Var.t0();
        int i10 = a0Var.F;
        if (i10 == 1) {
            i10 = 0;
        }
        a0Var.t0();
        return I.e(B, i10, a0Var.G);
    }

    public final int T() {
        a0 a0Var = (a0) this;
        q1 I = a0Var.I();
        if (I.p()) {
            return -1;
        }
        int B = a0Var.B();
        a0Var.t0();
        int i10 = a0Var.F;
        if (i10 == 1) {
            i10 = 0;
        }
        a0Var.t0();
        return I.k(B, i10, a0Var.G);
    }

    public abstract void U(int i10, long j10, boolean z10);

    public final void V(int i10, long j10) {
        U(((a0) this).B(), j10, false);
    }

    public final void W(int i10, int i11) {
        U(i10, com.anythink.expressad.exoplayer.b.f7291b, false);
    }

    public final void X(int i10, long j10) {
        long i11;
        a0 a0Var = (a0) this;
        long currentPosition = a0Var.getCurrentPosition() + j10;
        a0Var.t0();
        if (a0Var.c()) {
            c1 c1Var = a0Var.f30333i0;
            u.b bVar = c1Var.f30383b;
            Object obj = bVar.f29835a;
            q1 q1Var = c1Var.f30382a;
            q1.b bVar2 = a0Var.f30340n;
            q1Var.g(obj, bVar2);
            i11 = d6.g0.S(bVar2.a(bVar.f29836b, bVar.f29837c));
        } else {
            i11 = a0Var.i();
        }
        if (i11 != com.anythink.expressad.exoplayer.b.f7291b) {
            currentPosition = Math.min(currentPosition, i11);
        }
        V(i10, Math.max(currentPosition, 0L));
    }

    @Override // k4.e1
    public final void f(int i10, long j10) {
        U(i10, j10, false);
    }

    @Override // k4.e1
    public final long i() {
        a0 a0Var = (a0) this;
        q1 I = a0Var.I();
        if (I.p()) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        return d6.g0.S(I.m(a0Var.B(), this.f30398a).F);
    }

    @Override // k4.e1
    public final boolean isPlaying() {
        a0 a0Var = (a0) this;
        if (a0Var.v() == 3 && a0Var.g() && a0Var.G() == 0) {
            return true;
        }
        return false;
    }

    @Override // k4.e1
    public final void m() {
        W(((a0) this).B(), 4);
    }

    @Override // k4.e1
    public final boolean n() {
        if (T() != -1) {
            return true;
        }
        return false;
    }

    @Override // k4.e1
    public final void pause() {
        ((a0) this).m0(false);
    }

    @Override // k4.e1
    public final void play() {
        ((a0) this).m0(true);
    }

    @Override // k4.e1
    public final void r() {
        int T;
        a0 a0Var = (a0) this;
        if (!a0Var.I().p() && !a0Var.c()) {
            boolean n10 = n();
            if (R() && !u()) {
                if (n10 && (T = T()) != -1) {
                    if (T == a0Var.B()) {
                        U(a0Var.B(), com.anythink.expressad.exoplayer.b.f7291b, true);
                        return;
                    } else {
                        W(T, 7);
                        return;
                    }
                }
                return;
            }
            if (n10) {
                long currentPosition = a0Var.getCurrentPosition();
                a0Var.t0();
                if (currentPosition <= com.anythink.expressad.video.module.a.a.m.ag) {
                    int T2 = T();
                    if (T2 != -1) {
                        if (T2 == a0Var.B()) {
                            U(a0Var.B(), com.anythink.expressad.exoplayer.b.f7291b, true);
                            return;
                        } else {
                            W(T2, 7);
                            return;
                        }
                    }
                    return;
                }
            }
            V(7, 0L);
        }
    }

    @Override // k4.e1
    public final boolean u() {
        a0 a0Var = (a0) this;
        q1 I = a0Var.I();
        if (!I.p() && I.m(a0Var.B(), this.f30398a).f30766z) {
            return true;
        }
        return false;
    }

    @Override // k4.e1
    public final boolean x() {
        if (S() != -1) {
            return true;
        }
        return false;
    }
}
