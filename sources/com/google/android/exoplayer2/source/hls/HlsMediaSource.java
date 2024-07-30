package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import c6.a0;
import c6.h0;
import c6.j;
import c6.t;
import com.applovin.exoplayer2.b0;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.offline.StreamKey;
import j5.a;
import j5.s;
import j5.u;
import j5.x;
import j7.j0;
import java.io.IOException;
import java.util.List;
import k4.g0;
import k4.n0;
import l3.d;
import l4.w;
import o4.c;
import o5.h;
import o5.i;
import o5.l;
import o5.n;
import p5.b;
import p5.e;
import p5.j;

/* loaded from: classes2.dex */
public final class HlsMediaSource extends a implements j.d {
    public final n0.g A;
    public final h B;
    public final d C;
    public final f D;
    public final a0 E;
    public final boolean F;
    public final int G;
    public final boolean H;
    public final j I;
    public final long J;
    public final n0 K;
    public n0.e L;
    public h0 M;

    /* renamed from: z, reason: collision with root package name */
    public final i f20192z;

    /* loaded from: classes2.dex */
    public static final class Factory implements u.a {

        /* renamed from: a, reason: collision with root package name */
        public final h f20193a;
        public c f = new com.google.android.exoplayer2.drm.c();

        /* renamed from: c, reason: collision with root package name */
        public final p5.a f20195c = new p5.a();

        /* renamed from: d, reason: collision with root package name */
        public final b0 f20196d = b.G;

        /* renamed from: b, reason: collision with root package name */
        public final o5.d f20194b = i.f33664a;

        /* renamed from: g, reason: collision with root package name */
        public a0 f20198g = new t();

        /* renamed from: e, reason: collision with root package name */
        public final d f20197e = new d(0);

        /* renamed from: i, reason: collision with root package name */
        public final int f20200i = 1;

        /* renamed from: j, reason: collision with root package name */
        public final long f20201j = com.anythink.expressad.exoplayer.b.f7291b;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f20199h = true;

        public Factory(j.a aVar) {
            this.f20193a = new o5.c(aVar);
        }

        @Override // j5.u.a
        public final u.a a(a0 a0Var) {
            if (a0Var != null) {
                this.f20198g = a0Var;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        @Override // j5.u.a
        public final u.a b(c cVar) {
            if (cVar != null) {
                this.f = cVar;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [p5.c] */
        @Override // j5.u.a
        public final u c(n0 n0Var) {
            n0Var.f30575t.getClass();
            List<StreamKey> list = n0Var.f30575t.f30632d;
            boolean isEmpty = list.isEmpty();
            p5.a aVar = this.f20195c;
            if (!isEmpty) {
                aVar = new p5.c(aVar, list);
            }
            h hVar = this.f20193a;
            o5.d dVar = this.f20194b;
            d dVar2 = this.f20197e;
            f a10 = this.f.a(n0Var);
            a0 a0Var = this.f20198g;
            this.f20196d.getClass();
            return new HlsMediaSource(n0Var, hVar, dVar, dVar2, a10, a0Var, new b(this.f20193a, a0Var, aVar), this.f20201j, this.f20199h, this.f20200i);
        }
    }

    static {
        g0.a("goog.exo.hls");
    }

    public HlsMediaSource(n0 n0Var, h hVar, o5.d dVar, d dVar2, f fVar, a0 a0Var, b bVar, long j10, boolean z10, int i10) {
        n0.g gVar = n0Var.f30575t;
        gVar.getClass();
        this.A = gVar;
        this.K = n0Var;
        this.L = n0Var.f30576u;
        this.B = hVar;
        this.f20192z = dVar;
        this.C = dVar2;
        this.D = fVar;
        this.E = a0Var;
        this.I = bVar;
        this.J = j10;
        this.F = z10;
        this.G = i10;
        this.H = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e.a x(long j10, j0 j0Var) {
        e.a aVar = null;
        for (int i10 = 0; i10 < j0Var.size(); i10++) {
            e.a aVar2 = (e.a) j0Var.get(i10);
            long j11 = aVar2.f34421w;
            if (j11 <= j10 && aVar2.D) {
                aVar = aVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return aVar;
    }

    @Override // j5.u
    public final void c(s sVar) {
        l lVar = (l) sVar;
        lVar.f33680t.e(lVar);
        for (n nVar : lVar.M) {
            if (nVar.V) {
                for (n.c cVar : nVar.N) {
                    cVar.i();
                    com.google.android.exoplayer2.drm.d dVar = cVar.f29719h;
                    if (dVar != null) {
                        dVar.b(cVar.f29717e);
                        cVar.f29719h = null;
                        cVar.f29718g = null;
                    }
                }
            }
            nVar.B.e(nVar);
            nVar.J.removeCallbacksAndMessages(null);
            nVar.Z = true;
            nVar.K.clear();
        }
        lVar.J = null;
    }

    @Override // j5.u
    public final n0 d() {
        return this.K;
    }

    @Override // j5.u
    public final void j() throws IOException {
        this.I.k();
    }

    @Override // j5.u
    public final s p(u.b bVar, c6.b bVar2, long j10) {
        x.a r10 = r(bVar);
        e.a aVar = new e.a(this.f29644v.f19979c, 0, bVar);
        i iVar = this.f20192z;
        p5.j jVar = this.I;
        h hVar = this.B;
        h0 h0Var = this.M;
        f fVar = this.D;
        a0 a0Var = this.E;
        d dVar = this.C;
        boolean z10 = this.F;
        int i10 = this.G;
        boolean z11 = this.H;
        w wVar = this.y;
        d6.a.e(wVar);
        return new l(iVar, jVar, hVar, h0Var, fVar, aVar, a0Var, r10, bVar2, dVar, z10, i10, z11, wVar);
    }

    @Override // j5.a
    public final void u(h0 h0Var) {
        this.M = h0Var;
        f fVar = this.D;
        fVar.b();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        w wVar = this.y;
        d6.a.e(wVar);
        fVar.d(myLooper, wVar);
        x.a r10 = r(null);
        this.I.d(this.A.f30629a, r10, this);
    }

    @Override // j5.a
    public final void w() {
        this.I.stop();
        this.D.release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a8, code lost:
    
        if (r51.f34406n != com.anythink.expressad.exoplayer.b.f7291b) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(p5.e r51) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.y(p5.e):void");
    }
}
