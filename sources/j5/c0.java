package j5;

import android.net.Uri;
import android.os.Looper;
import c6.j;
import com.google.android.exoplayer2.drm.e;
import j5.a0;
import j5.b0;
import j5.u;
import k4.n0;
import k4.q1;

/* compiled from: ProgressiveMediaSource.java */
/* loaded from: classes2.dex */
public final class c0 extends j5.a implements b0.b {
    public final n0.g A;
    public final j.a B;
    public final a0.a C;
    public final com.google.android.exoplayer2.drm.f D;
    public final c6.a0 E;
    public final int F;
    public boolean G;
    public long H;
    public boolean I;
    public boolean J;
    public c6.h0 K;

    /* renamed from: z, reason: collision with root package name */
    public final k4.n0 f29684z;

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes2.dex */
    public class a extends m {
        public a(i0 i0Var) {
            super(i0Var);
        }

        @Override // j5.m, k4.q1
        public final q1.b f(int i10, q1.b bVar, boolean z10) {
            super.f(i10, bVar, z10);
            bVar.f30759x = true;
            return bVar;
        }

        @Override // j5.m, k4.q1
        public final q1.c n(int i10, q1.c cVar, long j10) {
            super.n(i10, cVar, j10);
            cVar.D = true;
            return cVar;
        }
    }

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b implements u.a {

        /* renamed from: a, reason: collision with root package name */
        public final j.a f29685a;

        /* renamed from: b, reason: collision with root package name */
        public final a0.a f29686b;

        /* renamed from: c, reason: collision with root package name */
        public o4.c f29687c;

        /* renamed from: d, reason: collision with root package name */
        public c6.a0 f29688d;

        /* renamed from: e, reason: collision with root package name */
        public final int f29689e;

        public b(j.a aVar, p4.l lVar) {
            q0.d dVar = new q0.d(lVar, 10);
            com.google.android.exoplayer2.drm.c cVar = new com.google.android.exoplayer2.drm.c();
            c6.t tVar = new c6.t();
            this.f29685a = aVar;
            this.f29686b = dVar;
            this.f29687c = cVar;
            this.f29688d = tVar;
            this.f29689e = com.anythink.expressad.exoplayer.h.o.f8460d;
        }

        @Override // j5.u.a
        public final u.a a(c6.a0 a0Var) {
            if (a0Var != null) {
                this.f29688d = a0Var;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        @Override // j5.u.a
        public final u.a b(o4.c cVar) {
            if (cVar != null) {
                this.f29687c = cVar;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        @Override // j5.u.a
        public final u c(k4.n0 n0Var) {
            n0Var.f30575t.getClass();
            Object obj = n0Var.f30575t.f30634g;
            return new c0(n0Var, this.f29685a, this.f29686b, this.f29687c.a(n0Var), this.f29688d, this.f29689e);
        }
    }

    public c0(k4.n0 n0Var, j.a aVar, a0.a aVar2, com.google.android.exoplayer2.drm.f fVar, c6.a0 a0Var, int i10) {
        n0.g gVar = n0Var.f30575t;
        gVar.getClass();
        this.A = gVar;
        this.f29684z = n0Var;
        this.B = aVar;
        this.C = aVar2;
        this.D = fVar;
        this.E = a0Var;
        this.F = i10;
        this.G = true;
        this.H = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // j5.u
    public final void c(s sVar) {
        b0 b0Var = (b0) sVar;
        if (b0Var.N) {
            for (e0 e0Var : b0Var.K) {
                e0Var.i();
                com.google.android.exoplayer2.drm.d dVar = e0Var.f29719h;
                if (dVar != null) {
                    dVar.b(e0Var.f29717e);
                    e0Var.f29719h = null;
                    e0Var.f29718g = null;
                }
            }
        }
        b0Var.C.e(b0Var);
        b0Var.H.removeCallbacksAndMessages(null);
        b0Var.I = null;
        b0Var.f29652f0 = true;
    }

    @Override // j5.u
    public final k4.n0 d() {
        return this.f29684z;
    }

    @Override // j5.u
    public final s p(u.b bVar, c6.b bVar2, long j10) {
        c6.j a10 = this.B.a();
        c6.h0 h0Var = this.K;
        if (h0Var != null) {
            a10.b(h0Var);
        }
        n0.g gVar = this.A;
        Uri uri = gVar.f30629a;
        d6.a.e(this.y);
        return new b0(uri, a10, new c((p4.l) ((q0.d) this.C).f34554t), this.D, new e.a(this.f29644v.f19979c, 0, bVar), this.E, r(bVar), this, bVar2, gVar.f30633e, this.F);
    }

    @Override // j5.a
    public final void u(c6.h0 h0Var) {
        this.K = h0Var;
        com.google.android.exoplayer2.drm.f fVar = this.D;
        fVar.b();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        l4.w wVar = this.y;
        d6.a.e(wVar);
        fVar.d(myLooper, wVar);
        x();
    }

    @Override // j5.a
    public final void w() {
        this.D.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [j5.c0$a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [j5.c0, j5.a] */
    public final void x() {
        i0 i0Var = new i0(this.H, this.I, this.J, this.f29684z);
        if (this.G) {
            i0Var = new a(i0Var);
        }
        v(i0Var);
    }

    public final void y(long j10, boolean z10, boolean z11) {
        if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
            j10 = this.H;
        }
        if (!this.G && this.H == j10 && this.I == z10 && this.J == z11) {
            return;
        }
        this.H = j10;
        this.I = z10;
        this.J = z11;
        this.G = false;
        x();
    }

    @Override // j5.u
    public final void j() {
    }
}
