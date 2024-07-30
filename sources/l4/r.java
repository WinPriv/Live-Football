package l4;

import android.os.Looper;
import android.util.SparseArray;
import com.applovin.exoplayer2.a.c0;
import com.applovin.exoplayer2.a.x;
import com.applovin.exoplayer2.a.y;
import com.applovin.exoplayer2.b0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.huawei.hms.ads.br;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;
import d6.o;
import j5.u;
import j7.j0;
import j7.m0;
import j7.v1;
import j7.w1;
import java.io.IOException;
import java.util.List;
import k4.d1;
import k4.e1;
import k4.i0;
import k4.n0;
import k4.o0;
import k4.q1;
import k4.r1;
import l4.b;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: DefaultAnalyticsCollector.java */
/* loaded from: classes2.dex */
public final class r implements l4.a {
    public boolean A;

    /* renamed from: s, reason: collision with root package name */
    public final d6.c f32428s;

    /* renamed from: t, reason: collision with root package name */
    public final q1.b f32429t;

    /* renamed from: u, reason: collision with root package name */
    public final q1.c f32430u;

    /* renamed from: v, reason: collision with root package name */
    public final a f32431v;

    /* renamed from: w, reason: collision with root package name */
    public final SparseArray<b.a> f32432w;

    /* renamed from: x, reason: collision with root package name */
    public d6.o<b> f32433x;
    public e1 y;

    /* renamed from: z, reason: collision with root package name */
    public d6.m f32434z;

    /* compiled from: DefaultAnalyticsCollector.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final q1.b f32435a;

        /* renamed from: b, reason: collision with root package name */
        public j0<u.b> f32436b;

        /* renamed from: c, reason: collision with root package name */
        public w1 f32437c;

        /* renamed from: d, reason: collision with root package name */
        public u.b f32438d;

        /* renamed from: e, reason: collision with root package name */
        public u.b f32439e;
        public u.b f;

        public a(q1.b bVar) {
            this.f32435a = bVar;
            j0.b bVar2 = j0.f30006t;
            this.f32436b = v1.f30113w;
            this.f32437c = w1.y;
        }

        public static u.b b(e1 e1Var, j0<u.b> j0Var, u.b bVar, q1.b bVar2) {
            Object l10;
            int i10;
            q1 I = e1Var.I();
            int j10 = e1Var.j();
            if (I.p()) {
                l10 = null;
            } else {
                l10 = I.l(j10);
            }
            if (!e1Var.c() && !I.p()) {
                i10 = I.f(j10, bVar2, false).b(g0.J(e1Var.getCurrentPosition()) - bVar2.f30758w);
            } else {
                i10 = -1;
            }
            for (int i11 = 0; i11 < j0Var.size(); i11++) {
                u.b bVar3 = j0Var.get(i11);
                if (c(bVar3, l10, e1Var.c(), e1Var.A(), e1Var.o(), i10)) {
                    return bVar3;
                }
            }
            if (j0Var.isEmpty() && bVar != null) {
                if (c(bVar, l10, e1Var.c(), e1Var.A(), e1Var.o(), i10)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean c(u.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f29835a.equals(obj)) {
                return false;
            }
            int i13 = bVar.f29836b;
            if ((!z10 || i13 != i10 || bVar.f29837c != i11) && (z10 || i13 != -1 || bVar.f29839e != i12)) {
                return false;
            }
            return true;
        }

        public final void a(m0.a<u.b, q1> aVar, u.b bVar, q1 q1Var) {
            if (bVar == null) {
                return;
            }
            if (q1Var.b(bVar.f29835a) != -1) {
                aVar.a(bVar, q1Var);
                return;
            }
            q1 q1Var2 = (q1) this.f32437c.get(bVar);
            if (q1Var2 != null) {
                aVar.a(bVar, q1Var2);
            }
        }

        public final void d(q1 q1Var) {
            m0.a<u.b, q1> aVar = new m0.a<>(0);
            if (this.f32436b.isEmpty()) {
                a(aVar, this.f32439e, q1Var);
                if (!i7.g.a(this.f, this.f32439e)) {
                    a(aVar, this.f, q1Var);
                }
                if (!i7.g.a(this.f32438d, this.f32439e) && !i7.g.a(this.f32438d, this.f)) {
                    a(aVar, this.f32438d, q1Var);
                }
            } else {
                for (int i10 = 0; i10 < this.f32436b.size(); i10++) {
                    a(aVar, this.f32436b.get(i10), q1Var);
                }
                if (!this.f32436b.contains(this.f32438d)) {
                    a(aVar, this.f32438d, q1Var);
                }
            }
            this.f32437c = w1.y(aVar.f30040b, aVar.f30039a);
        }
    }

    public r(d6.c cVar) {
        cVar.getClass();
        this.f32428s = cVar;
        int i10 = g0.f27302a;
        Looper myLooper = Looper.myLooper();
        this.f32433x = new d6.o<>(myLooper == null ? Looper.getMainLooper() : myLooper, cVar, new b0(14));
        q1.b bVar = new q1.b();
        this.f32429t = bVar;
        this.f32430u = new q1.c();
        this.f32431v = new a(bVar);
        this.f32432w = new SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void A(int i10, u.b bVar) {
        b.a m02 = m0(i10, bVar);
        o0(m02, 1023, new j(m02, 1));
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void B(int i10, u.b bVar) {
        b.a m02 = m0(i10, bVar);
        o0(m02, IronSourceError.ERROR_RV_LOAD_DURING_LOAD, new x(m02, 6));
    }

    @Override // k4.e1.c
    public final void C(boolean z10) {
        b.a j02 = j0();
        o0(j02, 3, new g(j02, z10, 0));
    }

    @Override // k4.e1.c
    public final void D(int i10, boolean z10) {
        b.a j02 = j0();
        o0(j02, 5, new m(j02, z10, i10));
    }

    @Override // j5.x
    public final void E(int i10, u.b bVar, final j5.o oVar, final j5.r rVar, final IOException iOException, final boolean z10) {
        final b.a m02 = m0(i10, bVar);
        o0(m02, 1003, new o.a(m02, oVar, rVar, iOException, z10) { // from class: l4.f

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ j5.r f32407s;

            {
                this.f32407s = rVar;
            }

            @Override // d6.o.a
            public final void invoke(Object obj) {
                ((b) obj).e(this.f32407s);
            }
        });
    }

    @Override // k4.e1.c
    public final void F(int i10) {
        b.a j02 = j0();
        o0(j02, 4, new c(j02, i10, 0));
    }

    @Override // c6.e.a
    public final void G(int i10, long j10, long j11) {
        u.b bVar;
        a aVar = this.f32431v;
        if (aVar.f32436b.isEmpty()) {
            bVar = null;
        } else {
            bVar = (u.b) j7.r.B(aVar.f32436b);
        }
        b.a k02 = k0(bVar);
        o0(k02, 1006, new h(k02, i10, j10, j11, 1));
    }

    @Override // l4.a
    public final void H() {
        if (!this.A) {
            b.a j02 = j0();
            this.A = true;
            o0(j02, -1, new j(j02, 0));
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void I(int i10, u.b bVar) {
        b.a m02 = m0(i10, bVar);
        o0(m02, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new j(m02, 2));
    }

    @Override // l4.a
    public final void J(u uVar) {
        this.f32433x.a(uVar);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void K(int i10, u.b bVar, int i11) {
        b.a m02 = m0(i10, bVar);
        o0(m02, 1022, new c(m02, i11, 1));
    }

    @Override // k4.e1.c
    public final void L(d1 d1Var) {
        b.a j02 = j0();
        o0(j02, 12, new com.applovin.exoplayer2.a.n(8, j02, d1Var));
    }

    @Override // k4.e1.c
    public final void M(r1 r1Var) {
        b.a j02 = j0();
        o0(j02, 2, new y(6, j02, r1Var));
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void N(int i10, u.b bVar, Exception exc) {
        b.a m02 = m0(i10, bVar);
        o0(m02, 1024, new com.applovin.exoplayer2.a.o(6, m02, exc));
    }

    @Override // j5.x
    public final void O(int i10, u.b bVar, j5.r rVar) {
        b.a m02 = m0(i10, bVar);
        o0(m02, 1004, new com.applovin.exoplayer2.a.n(6, m02, rVar));
    }

    @Override // com.google.android.exoplayer2.drm.e
    public final void P(int i10, u.b bVar) {
        b.a m02 = m0(i10, bVar);
        o0(m02, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new p(m02, 0));
    }

    @Override // k4.e1.c
    public final void Q(o0 o0Var) {
        b.a j02 = j0();
        o0(j02, 14, new com.applovin.exoplayer2.a.c(8, j02, o0Var));
    }

    @Override // k4.e1.c
    public final void R(int i10, boolean z10) {
        b.a j02 = j0();
        o0(j02, 30, new m(j02, i10, z10));
    }

    @Override // k4.e1.c
    public final void S(int i10) {
        e1 e1Var = this.y;
        e1Var.getClass();
        a aVar = this.f32431v;
        aVar.f32438d = a.b(e1Var, aVar.f32436b, aVar.f32439e, aVar.f32435a);
        aVar.d(e1Var.I());
        b.a j02 = j0();
        o0(j02, 0, new c0(i10, 2, j02));
    }

    @Override // k4.e1.c
    public final void U(e1.a aVar) {
        b.a j02 = j0();
        o0(j02, 13, new y(7, j02, aVar));
    }

    @Override // j5.x
    public final void V(int i10, u.b bVar, j5.o oVar, j5.r rVar) {
        b.a m02 = m0(i10, bVar);
        o0(m02, 1001, new com.applovin.exoplayer2.a.d(m02, oVar, rVar, 5));
    }

    @Override // j5.x
    public final void W(int i10, u.b bVar, final j5.o oVar, final j5.r rVar) {
        final b.a m02 = m0(i10, bVar);
        o0(m02, 1002, new o.a() { // from class: l4.o
            @Override // d6.o.a
            public final void invoke(Object obj) {
                ((b) obj).getClass();
            }
        });
    }

    @Override // k4.e1.c
    public final void Z(List<r5.a> list) {
        b.a j02 = j0();
        o0(j02, 27, new y(8, j02, list));
    }

    @Override // k4.e1.c
    public final void a(e6.n nVar) {
        b.a n02 = n0();
        o0(n02, 25, new com.applovin.exoplayer2.a.c(10, n02, nVar));
    }

    @Override // l4.a
    public final void b(n4.e eVar) {
        b.a k02 = k0(this.f32431v.f32439e);
        o0(k02, 1020, new n(1, k02, eVar));
    }

    @Override // l4.a
    public final void b0(v1 v1Var, u.b bVar) {
        e1 e1Var = this.y;
        e1Var.getClass();
        a aVar = this.f32431v;
        aVar.getClass();
        aVar.f32436b = j0.C(v1Var);
        if (!v1Var.isEmpty()) {
            aVar.f32439e = (u.b) v1Var.get(0);
            bVar.getClass();
            aVar.f = bVar;
        }
        if (aVar.f32438d == null) {
            aVar.f32438d = a.b(e1Var, aVar.f32436b, aVar.f32439e, aVar.f32435a);
        }
        aVar.d(e1Var.I());
    }

    @Override // l4.a
    public final void c(String str) {
        b.a n02 = n0();
        o0(n02, 1019, new y(4, n02, str));
    }

    @Override // k4.e1.c
    public final void c0(k4.m mVar) {
        b.a j02;
        j5.t tVar;
        if ((mVar instanceof k4.m) && (tVar = mVar.f30569z) != null) {
            j02 = k0(new u.b(tVar));
        } else {
            j02 = j0();
        }
        o0(j02, 10, new com.applovin.exoplayer2.a.n(5, j02, mVar));
    }

    @Override // l4.a
    public final void d(final int i10, final long j10) {
        final b.a k02 = k0(this.f32431v.f32439e);
        o0(k02, 1021, new o.a(i10, j10, k02) { // from class: l4.i
            @Override // d6.o.a
            public final void invoke(Object obj) {
                ((b) obj).getClass();
            }
        });
    }

    @Override // k4.e1.c
    public final void d0(k4.l lVar) {
        b.a j02 = j0();
        o0(j02, 29, new com.applovin.exoplayer2.a.n(3, j02, lVar));
    }

    @Override // l4.a
    public final void e(i0 i0Var, n4.i iVar) {
        b.a n02 = n0();
        o0(n02, br.L, new d(n02, i0Var, iVar, 0));
    }

    @Override // k4.e1.c
    public final void e0(int i10, int i11) {
        b.a n02 = n0();
        o0(n02, 24, new e(n02, i10, i11));
    }

    @Override // l4.a
    public final void f(n4.e eVar) {
        b.a n02 = n0();
        o0(n02, IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE, new n(0, n02, eVar));
    }

    @Override // k4.e1.c
    public final void f0(int i10, e1.d dVar, e1.d dVar2) {
        if (i10 == 1) {
            this.A = false;
        }
        e1 e1Var = this.y;
        e1Var.getClass();
        a aVar = this.f32431v;
        aVar.f32438d = a.b(e1Var, aVar.f32436b, aVar.f32439e, aVar.f32435a);
        b.a j02 = j0();
        o0(j02, 11, new com.applovin.exoplayer2.a.p(j02, i10, dVar, dVar2, 1));
    }

    @Override // l4.a
    public final void g(String str) {
        b.a n02 = n0();
        o0(n02, 1012, new com.applovin.exoplayer2.a.o(4, n02, str));
    }

    @Override // k4.e1.c
    public final void g0(n0 n0Var, int i10) {
        b.a j02 = j0();
        o0(j02, 1, new com.applovin.exoplayer2.a.s(i10, j02, n0Var, 3));
    }

    @Override // k4.e1.c
    public final void h(Metadata metadata) {
        b.a j02 = j0();
        o0(j02, 28, new com.applovin.exoplayer2.a.c(7, j02, metadata));
    }

    @Override // j5.x
    public final void h0(int i10, u.b bVar, j5.r rVar) {
        b.a m02 = m0(i10, bVar);
        o0(m02, 1005, new com.applovin.exoplayer2.a.o(5, m02, rVar));
    }

    @Override // l4.a
    public final void i(int i10, long j10) {
        b.a k02 = k0(this.f32431v.f32439e);
        o0(k02, 1018, new com.ironsource.adapters.facebook.a(i10, j10, k02));
    }

    @Override // k4.e1.c
    public final void i0(boolean z10) {
        b.a j02 = j0();
        o0(j02, 7, new l(j02, z10, 1));
    }

    @Override // l4.a
    public final void j(long j10, String str, long j11) {
        b.a n02 = n0();
        o0(n02, 1016, new k(n02, str, j11, j10, 0));
    }

    public final b.a j0() {
        return k0(this.f32431v.f32438d);
    }

    @Override // l4.a
    public final void k(long j10, String str, long j11) {
        b.a n02 = n0();
        o0(n02, 1008, new k(n02, str, j11, j10, 1));
    }

    public final b.a k0(u.b bVar) {
        q1 q1Var;
        boolean z10;
        this.y.getClass();
        if (bVar == null) {
            q1Var = null;
        } else {
            q1Var = (q1) this.f32431v.f32437c.get(bVar);
        }
        if (bVar != null && q1Var != null) {
            return l0(q1Var, q1Var.g(bVar.f29835a, this.f32429t).f30756u, bVar);
        }
        int B = this.y.B();
        q1 I = this.y.I();
        if (B < I.o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            I = q1.f30752s;
        }
        return l0(I, B, null);
    }

    @Override // k4.e1.c
    public final void l(boolean z10) {
        b.a n02 = n0();
        o0(n02, 23, new g(n02, z10, 1));
    }

    @RequiresNonNull({"player"})
    public final b.a l0(q1 q1Var, int i10, u.b bVar) {
        u.b bVar2;
        boolean z10;
        long S;
        if (q1Var.p()) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        long elapsedRealtime = this.f32428s.elapsedRealtime();
        boolean z11 = true;
        if (q1Var.equals(this.y.I()) && i10 == this.y.B()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bVar2 != null && bVar2.a()) {
            if (!z10 || this.y.A() != bVar2.f29836b || this.y.o() != bVar2.f29837c) {
                z11 = false;
            }
            if (z11) {
                S = this.y.getCurrentPosition();
            }
            S = 0;
        } else if (z10) {
            S = this.y.t();
        } else {
            if (!q1Var.p()) {
                S = g0.S(q1Var.m(i10, this.f32430u).E);
            }
            S = 0;
        }
        return new b.a(elapsedRealtime, q1Var, i10, bVar2, S, this.y.I(), this.y.B(), this.f32431v.f32438d, this.y.getCurrentPosition(), this.y.e());
    }

    @Override // l4.a
    public final void m(Exception exc) {
        b.a n02 = n0();
        o0(n02, 1014, new q(n02, exc, 0));
    }

    public final b.a m0(int i10, u.b bVar) {
        this.y.getClass();
        boolean z10 = true;
        if (bVar != null) {
            if (((q1) this.f32431v.f32437c.get(bVar)) == null) {
                z10 = false;
            }
            if (z10) {
                return k0(bVar);
            }
            return l0(q1.f30752s, i10, bVar);
        }
        q1 I = this.y.I();
        if (i10 >= I.o()) {
            z10 = false;
        }
        if (!z10) {
            I = q1.f30752s;
        }
        return l0(I, i10, null);
    }

    @Override // l4.a
    public final void n(long j10) {
        b.a n02 = n0();
        o0(n02, 1010, new com.applovin.exoplayer2.a.q(n02, j10, 1));
    }

    public final b.a n0() {
        return k0(this.f32431v.f);
    }

    @Override // l4.a
    public final void o(n4.e eVar) {
        b.a n02 = n0();
        o0(n02, 1007, new com.applovin.exoplayer2.a.c(9, n02, eVar));
    }

    public final void o0(b.a aVar, int i10, o.a<b> aVar2) {
        this.f32432w.put(i10, aVar);
        this.f32433x.e(i10, aVar2);
    }

    @Override // k4.e1.c
    public final void onPlayerStateChanged(boolean z10, int i10) {
        b.a j02 = j0();
        o0(j02, -1, new e0.i(j02, z10, i10));
    }

    @Override // k4.e1.c
    public final void onRepeatModeChanged(int i10) {
        b.a j02 = j0();
        o0(j02, 8, new com.applovin.exoplayer2.a.e(i10, 2, j02));
    }

    @Override // k4.e1.c
    public final void onSeekProcessed() {
        b.a j02 = j0();
        o0(j02, -1, new p(j02, 1));
    }

    @Override // k4.e1.c
    public final void onShuffleModeEnabledChanged(boolean z10) {
        b.a j02 = j0();
        o0(j02, 9, new l(j02, z10, 0));
    }

    @Override // l4.a
    public final void p(n4.e eVar) {
        b.a k02 = k0(this.f32431v.f32439e);
        o0(k02, 1013, new n(2, k02, eVar));
    }

    @Override // l4.a
    public final void q(Exception exc) {
        b.a n02 = n0();
        o0(n02, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new q(n02, exc, 1));
    }

    @Override // l4.a
    public final void r(Exception exc) {
        b.a n02 = n0();
        o0(n02, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new com.applovin.exoplayer2.a.n(4, n02, exc));
    }

    @Override // l4.a
    public final void release() {
        d6.m mVar = this.f32434z;
        d6.a.e(mVar);
        mVar.c(new androidx.appcompat.widget.n0(this, 5));
    }

    @Override // l4.a
    public final void s(long j10, Object obj) {
        b.a n02 = n0();
        o0(n02, 26, new g4.l(n02, obj, j10));
    }

    @Override // l4.a
    public final void t(i0 i0Var, n4.i iVar) {
        b.a n02 = n0();
        o0(n02, 1017, new d(n02, i0Var, iVar, 1));
    }

    @Override // k4.e1.c
    public final void u(r5.c cVar) {
        b.a j02 = j0();
        o0(j02, 27, new com.applovin.exoplayer2.a.n(7, j02, cVar));
    }

    @Override // l4.a
    public final void v(int i10, long j10, long j11) {
        b.a n02 = n0();
        o0(n02, 1011, new h(n02, i10, j10, j11, 0));
    }

    @Override // k4.e1.c
    public final void w(int i10) {
        b.a j02 = j0();
        o0(j02, 6, new com.applovin.exoplayer2.a.v(i10, 2, j02));
    }

    @Override // k4.e1.c
    public final void x(k4.m mVar) {
        b.a j02;
        j5.t tVar;
        if ((mVar instanceof k4.m) && (tVar = mVar.f30569z) != null) {
            j02 = k0(new u.b(tVar));
        } else {
            j02 = j0();
        }
        o0(j02, 10, new com.applovin.exoplayer2.a.o(3, j02, mVar));
    }

    @Override // l4.a
    public final void y(e1 e1Var, Looper looper) {
        boolean z10;
        if (this.y != null && !this.f32431v.f32436b.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        d6.a.d(z10);
        e1Var.getClass();
        this.y = e1Var;
        this.f32434z = this.f32428s.b(looper, null);
        d6.o<b> oVar = this.f32433x;
        this.f32433x = new d6.o<>(oVar.f27333d, looper, oVar.f27330a, new y(5, this, e1Var));
    }

    @Override // j5.x
    public final void z(int i10, u.b bVar, j5.o oVar, j5.r rVar) {
        b.a m02 = m0(i10, bVar);
        o0(m02, 1000, new com.applovin.exoplayer2.a.m(m02, oVar, rVar, 4));
    }

    @Override // k4.e1.c
    public final void T() {
    }

    @Override // k4.e1.c
    public final void X() {
    }

    @Override // k4.e1.c
    public final void a0() {
    }

    @Override // k4.e1.c
    public final void Y(e1.b bVar) {
    }
}
