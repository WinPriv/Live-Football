package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import c6.a0;
import c6.b0;
import c6.c0;
import c6.d0;
import c6.h0;
import c6.j;
import c6.t;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import j5.i0;
import j5.o;
import j5.s;
import j5.u;
import j5.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import k4.g0;
import k4.n0;
import l3.d;
import l4.w;
import l5.g;
import q5.a;

/* loaded from: classes2.dex */
public final class SsMediaSource extends j5.a implements b0.a<d0<q5.a>> {
    public static final /* synthetic */ int S = 0;
    public final Uri A;
    public final n0 B;
    public final j.a C;
    public final b.a D;
    public final d E;
    public final f F;
    public final a0 G;
    public final long H;
    public final x.a I;
    public final d0.a<? extends q5.a> J;
    public final ArrayList<c> K;
    public j L;
    public b0 M;
    public c0 N;
    public h0 O;
    public long P;
    public q5.a Q;
    public Handler R;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f20211z;

    /* loaded from: classes2.dex */
    public static final class Factory implements u.a {

        /* renamed from: a, reason: collision with root package name */
        public final b.a f20212a;

        /* renamed from: b, reason: collision with root package name */
        public final j.a f20213b;

        /* renamed from: d, reason: collision with root package name */
        public o4.c f20215d = new com.google.android.exoplayer2.drm.c();

        /* renamed from: e, reason: collision with root package name */
        public a0 f20216e = new t();
        public final long f = 30000;

        /* renamed from: c, reason: collision with root package name */
        public final d f20214c = new d(0);

        public Factory(j.a aVar) {
            this.f20212a = new a.C0234a(aVar);
            this.f20213b = aVar;
        }

        @Override // j5.u.a
        public final u.a a(a0 a0Var) {
            if (a0Var != null) {
                this.f20216e = a0Var;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        @Override // j5.u.a
        public final u.a b(o4.c cVar) {
            if (cVar != null) {
                this.f20215d = cVar;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        @Override // j5.u.a
        public final u c(n0 n0Var) {
            d0.a aVar;
            n0Var.f30575t.getClass();
            d0.a bVar = new q5.b();
            List<StreamKey> list = n0Var.f30575t.f30632d;
            if (!list.isEmpty()) {
                aVar = new i5.c(bVar, list);
            } else {
                aVar = bVar;
            }
            return new SsMediaSource(n0Var, this.f20213b, aVar, this.f20212a, this.f20214c, this.f20215d.a(n0Var), this.f20216e, this.f);
        }
    }

    static {
        g0.a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(n0 n0Var, j.a aVar, d0.a aVar2, b.a aVar3, d dVar, f fVar, a0 a0Var, long j10) {
        this.B = n0Var;
        n0.g gVar = n0Var.f30575t;
        gVar.getClass();
        this.Q = null;
        Uri uri = Uri.EMPTY;
        Uri uri2 = gVar.f30629a;
        if (uri2.equals(uri)) {
            uri2 = null;
        } else {
            int i10 = d6.g0.f27302a;
            String path = uri2.getPath();
            if (path != null) {
                Matcher matcher = d6.g0.f27309i.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri2 = Uri.withAppendedPath(uri2, "Manifest");
                }
            }
        }
        this.A = uri2;
        this.C = aVar;
        this.J = aVar2;
        this.D = aVar3;
        this.E = dVar;
        this.F = fVar;
        this.G = a0Var;
        this.H = j10;
        this.I = r(null);
        this.f20211z = false;
        this.K = new ArrayList<>();
    }

    @Override // j5.u
    public final void c(s sVar) {
        c cVar = (c) sVar;
        for (g<b> gVar : cVar.E) {
            gVar.z(null);
        }
        cVar.C = null;
        this.K.remove(sVar);
    }

    @Override // j5.u
    public final n0 d() {
        return this.B;
    }

    @Override // c6.b0.a
    public final void g(d0<q5.a> d0Var, long j10, long j11) {
        d0<q5.a> d0Var2 = d0Var;
        long j12 = d0Var2.f3319a;
        c6.g0 g0Var = d0Var2.f3322d;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.G.getClass();
        this.I.g(oVar, d0Var2.f3321c);
        this.Q = d0Var2.f;
        this.P = j10 - j11;
        x();
        if (this.Q.f34656d) {
            this.R.postDelayed(new androidx.activity.b(this, 10), Math.max(0L, (this.P + com.anythink.expressad.exoplayer.f.f7962a) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // j5.u
    public final void j() throws IOException {
        this.N.a();
    }

    @Override // c6.b0.a
    public final b0.b n(d0<q5.a> d0Var, long j10, long j11, IOException iOException, int i10) {
        b0.b bVar;
        d0<q5.a> d0Var2 = d0Var;
        long j12 = d0Var2.f3319a;
        c6.g0 g0Var = d0Var2.f3322d;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        long a10 = this.G.a(new a0.c(iOException, i10));
        if (a10 == com.anythink.expressad.exoplayer.b.f7291b) {
            bVar = b0.f;
        } else {
            bVar = new b0.b(0, a10);
        }
        this.I.k(oVar, d0Var2.f3321c, iOException, !bVar.a());
        return bVar;
    }

    @Override // j5.u
    public final s p(u.b bVar, c6.b bVar2, long j10) {
        x.a r10 = r(bVar);
        c cVar = new c(this.Q, this.D, this.O, this.E, this.F, new e.a(this.f29644v.f19979c, 0, bVar), this.G, r10, this.N, bVar2);
        this.K.add(cVar);
        return cVar;
    }

    @Override // c6.b0.a
    public final void q(d0<q5.a> d0Var, long j10, long j11, boolean z10) {
        d0<q5.a> d0Var2 = d0Var;
        long j12 = d0Var2.f3319a;
        c6.g0 g0Var = d0Var2.f3322d;
        Uri uri = g0Var.f3356c;
        o oVar = new o(g0Var.f3357d);
        this.G.getClass();
        this.I.d(oVar, d0Var2.f3321c);
    }

    @Override // j5.a
    public final void u(h0 h0Var) {
        this.O = h0Var;
        f fVar = this.F;
        fVar.b();
        Looper myLooper = Looper.myLooper();
        w wVar = this.y;
        d6.a.e(wVar);
        fVar.d(myLooper, wVar);
        if (this.f20211z) {
            this.N = new c0.a();
            x();
            return;
        }
        this.L = this.C.a();
        b0 b0Var = new b0("SsMediaSource");
        this.M = b0Var;
        this.N = b0Var;
        this.R = d6.g0.k(null);
        y();
    }

    @Override // j5.a
    public final void w() {
        q5.a aVar;
        if (this.f20211z) {
            aVar = this.Q;
        } else {
            aVar = null;
        }
        this.Q = aVar;
        this.L = null;
        this.P = 0L;
        b0 b0Var = this.M;
        if (b0Var != null) {
            b0Var.e(null);
            this.M = null;
        }
        Handler handler = this.R;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.R = null;
        }
        this.F.release();
    }

    public final void x() {
        long j10;
        i0 i0Var;
        long j11;
        int i10 = 0;
        while (true) {
            ArrayList<c> arrayList = this.K;
            if (i10 >= arrayList.size()) {
                break;
            }
            c cVar = arrayList.get(i10);
            q5.a aVar = this.Q;
            cVar.D = aVar;
            for (g<b> gVar : cVar.E) {
                gVar.f32517w.i(aVar);
            }
            cVar.C.g(cVar);
            i10++;
        }
        long j12 = Long.MIN_VALUE;
        long j13 = Long.MAX_VALUE;
        for (a.b bVar : this.Q.f) {
            if (bVar.f34672k > 0) {
                long[] jArr = bVar.o;
                j13 = Math.min(j13, jArr[0]);
                int i11 = bVar.f34672k - 1;
                j12 = Math.max(j12, bVar.b(i11) + jArr[i11]);
            }
        }
        if (j13 == Long.MAX_VALUE) {
            if (this.Q.f34656d) {
                j11 = -9223372036854775807L;
            } else {
                j11 = 0;
            }
            q5.a aVar2 = this.Q;
            boolean z10 = aVar2.f34656d;
            i0Var = new i0(j11, 0L, 0L, 0L, true, z10, z10, aVar2, this.B);
        } else {
            q5.a aVar3 = this.Q;
            if (aVar3.f34656d) {
                long j14 = aVar3.f34659h;
                if (j14 != com.anythink.expressad.exoplayer.b.f7291b && j14 > 0) {
                    j13 = Math.max(j13, j12 - j14);
                }
                long j15 = j13;
                long j16 = j12 - j15;
                long J = j16 - d6.g0.J(this.H);
                if (J < 5000000) {
                    J = Math.min(5000000L, j16 / 2);
                }
                i0Var = new i0(com.anythink.expressad.exoplayer.b.f7291b, j16, j15, J, true, true, true, this.Q, this.B);
            } else {
                long j17 = aVar3.f34658g;
                if (j17 != com.anythink.expressad.exoplayer.b.f7291b) {
                    j10 = j17;
                } else {
                    j10 = j12 - j13;
                }
                i0Var = new i0(j13 + j10, j10, j13, 0L, true, false, false, this.Q, this.B);
            }
        }
        v(i0Var);
    }

    public final void y() {
        if (this.M.c()) {
            return;
        }
        d0 d0Var = new d0(this.L, this.A, 4, this.J);
        b0 b0Var = this.M;
        a0 a0Var = this.G;
        int i10 = d0Var.f3321c;
        this.I.m(new o(d0Var.f3319a, d0Var.f3320b, b0Var.f(d0Var, this, a0Var.c(i10))), i10);
    }
}
