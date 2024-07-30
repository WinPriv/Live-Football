package com.applovin.exoplayer2;

import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;

/* loaded from: classes.dex */
public abstract class d implements an {

    /* renamed from: a, reason: collision with root package name */
    protected final ba.c f13938a = new ba.c();

    private int q() {
        int y = y();
        if (y == 1) {
            return 0;
        }
        return y;
    }

    @Override // com.applovin.exoplayer2.an
    public final boolean a(int i10) {
        return s().a(i10);
    }

    public final boolean a_() {
        if (l() != -1) {
            return true;
        }
        return false;
    }

    public final void b(int i10) {
        a(i10, com.anythink.expressad.exoplayer.b.f7291b);
    }

    public final void b_() {
        b(G());
    }

    @Override // com.applovin.exoplayer2.an
    public final void c() {
        b(-A());
    }

    @Override // com.applovin.exoplayer2.an
    public final void d() {
        b(B());
    }

    public final void f() {
        int l10 = l();
        if (l10 != -1) {
            b(l10);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public final void g() {
        if (!S().d() && !K()) {
            boolean a_ = a_();
            if (n() && !o()) {
                if (a_) {
                    f();
                }
            } else if (a_ && I() <= C()) {
                f();
            } else {
                a(0L);
            }
        }
    }

    public final boolean h() {
        if (k() != -1) {
            return true;
        }
        return false;
    }

    public final void i() {
        int k10 = k();
        if (k10 != -1) {
            b(k10);
        }
    }

    @Override // com.applovin.exoplayer2.an
    public final void j() {
        if (!S().d() && !K()) {
            if (h()) {
                i();
            } else if (n() && m()) {
                b_();
            }
        }
    }

    public final int k() {
        ba S = S();
        if (S.d()) {
            return -1;
        }
        return S.a(G(), q(), z());
    }

    public final int l() {
        ba S = S();
        if (S.d()) {
            return -1;
        }
        return S.b(G(), q(), z());
    }

    public final boolean m() {
        ba S = S();
        if (!S.d() && S.a(G(), this.f13938a).f13596j) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        ba S = S();
        if (!S.d() && S.a(G(), this.f13938a).e()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.an
    public final boolean o() {
        ba S = S();
        if (!S.d() && S.a(G(), this.f13938a).f13595i) {
            return true;
        }
        return false;
    }

    public final long p() {
        ba S = S();
        if (S.d()) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        return S.a(G(), this.f13938a).c();
    }

    private void b(long j10) {
        long I = I() + j10;
        long H = H();
        if (H != com.anythink.expressad.exoplayer.b.f7291b) {
            I = Math.min(I, H);
        }
        a(Math.max(I, 0L));
    }

    @Override // com.applovin.exoplayer2.an
    public final boolean a() {
        return t() == 3 && x() && u() == 0;
    }

    @Override // com.applovin.exoplayer2.an
    public final void a(long j10) {
        a(G(), j10);
    }

    public an.a a(an.a aVar) {
        return new an.a.C0151a().a(aVar).a(3, !K()).a(4, o() && !K()).a(5, a_() && !K()).a(6, !S().d() && (a_() || !n() || o()) && !K()).a(7, h() && !K()).a(8, !S().d() && (h() || (n() && m())) && !K()).a(9, !K()).a(10, o() && !K()).a(11, o() && !K()).a();
    }
}
