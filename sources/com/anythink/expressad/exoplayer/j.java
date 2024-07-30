package com.anythink.expressad.exoplayer;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.h;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.k.af;
import com.anythink.expressad.exoplayer.w;
import com.anythink.expressad.exoplayer.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: w, reason: collision with root package name */
    private static final String f8691w = "ExoPlayerImpl";
    private final Handler A;
    private final k B;
    private final Handler C;
    private final CopyOnWriteArraySet<w.c> D;
    private final ae.b E;
    private final ae.a F;
    private final ArrayDeque<a> G;
    private boolean H;
    private int I;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;
    private v N;
    private g O;
    private u P;
    private int Q;
    private int R;
    private long S;

    /* renamed from: x, reason: collision with root package name */
    private final y[] f8692x;
    private final com.anythink.expressad.exoplayer.i.h y;

    /* renamed from: z, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.i.i f8693z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final u f8697a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<w.c> f8698b;

        /* renamed from: c, reason: collision with root package name */
        private final com.anythink.expressad.exoplayer.i.h f8699c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8700d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8701e;
        private final int f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f8702g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f8703h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f8704i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f8705j;

        /* renamed from: k, reason: collision with root package name */
        private final boolean f8706k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f8707l;

        public a(u uVar, u uVar2, Set<w.c> set, com.anythink.expressad.exoplayer.i.h hVar, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13) {
            boolean z14;
            boolean z15;
            boolean z16;
            this.f8697a = uVar;
            this.f8698b = set;
            this.f8699c = hVar;
            this.f8700d = z10;
            this.f8701e = i10;
            this.f = i11;
            this.f8702g = z11;
            this.f8703h = z12;
            if (!z13 && uVar2.f == uVar.f) {
                z14 = false;
            } else {
                z14 = true;
            }
            this.f8704i = z14;
            if (uVar2.f9335a == uVar.f9335a && uVar2.f9336b == uVar.f9336b) {
                z15 = false;
            } else {
                z15 = true;
            }
            this.f8705j = z15;
            if (uVar2.f9340g != uVar.f9340g) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.f8706k = z16;
            this.f8707l = uVar2.f9342i != uVar.f9342i;
        }

        public final void a() {
            if (this.f8705j || this.f == 0) {
                for (w.c cVar : this.f8698b) {
                    u uVar = this.f8697a;
                    cVar.onTimelineChanged(uVar.f9335a, uVar.f9336b, this.f);
                }
            }
            if (this.f8700d) {
                Iterator<w.c> it = this.f8698b.iterator();
                while (it.hasNext()) {
                    it.next().onPositionDiscontinuity(this.f8701e);
                }
            }
            if (this.f8707l) {
                this.f8699c.a(this.f8697a.f9342i.f8690d);
                for (w.c cVar2 : this.f8698b) {
                    u uVar2 = this.f8697a;
                    cVar2.onTracksChanged(uVar2.f9341h, uVar2.f9342i.f8689c);
                }
            }
            if (this.f8706k) {
                Iterator<w.c> it2 = this.f8698b.iterator();
                while (it2.hasNext()) {
                    it2.next().onLoadingChanged(this.f8697a.f9340g);
                }
            }
            if (this.f8704i) {
                Iterator<w.c> it3 = this.f8698b.iterator();
                while (it3.hasNext()) {
                    it3.next().onPlayerStateChanged(this.f8703h, this.f8697a.f);
                }
            }
            if (this.f8702g) {
                Iterator<w.c> it4 = this.f8698b.iterator();
                while (it4.hasNext()) {
                    it4.next().onSeekProcessed();
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public j(y[] yVarArr, com.anythink.expressad.exoplayer.i.h hVar, p pVar, com.anythink.expressad.exoplayer.k.c cVar) {
        boolean z10;
        Looper mainLooper;
        Log.i(f8691w, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + af.f8997e + "]");
        if (yVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.anythink.expressad.exoplayer.k.a.b(z10);
        this.f8692x = (y[]) com.anythink.expressad.exoplayer.k.a.a(yVarArr);
        this.y = (com.anythink.expressad.exoplayer.i.h) com.anythink.expressad.exoplayer.k.a.a(hVar);
        this.H = false;
        this.I = 0;
        this.J = false;
        this.D = new CopyOnWriteArraySet<>();
        com.anythink.expressad.exoplayer.i.i iVar = new com.anythink.expressad.exoplayer.i.i(new aa[yVarArr.length], new com.anythink.expressad.exoplayer.i.f[yVarArr.length], null);
        this.f8693z = iVar;
        this.E = new ae.b();
        this.F = new ae.a();
        this.N = v.f9345a;
        if (Looper.myLooper() != null) {
            mainLooper = Looper.myLooper();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(mainLooper) { // from class: com.anythink.expressad.exoplayer.j.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                j.this.a(message);
            }
        };
        this.A = handler;
        this.P = new u(ae.f7271a, 0L, com.anythink.expressad.exoplayer.h.af.f8255a, iVar);
        this.G = new ArrayDeque<>();
        k kVar = new k(yVarArr, hVar, iVar, pVar, this.H, this.I, this.J, handler, this, cVar);
        this.B = kVar;
        this.C = new Handler(kVar.b());
    }

    private boolean H() {
        if (!this.P.f9335a.a() && this.K <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int A() {
        if (y()) {
            return this.P.f9337c.f8486c;
        }
        return -1;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final long B() {
        if (y()) {
            u uVar = this.P;
            uVar.f9335a.a(uVar.f9337c.f8484a, this.F, false);
            return b.a(this.P.f9339e) + this.F.a();
        }
        return t();
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int C() {
        return this.f8692x.length;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final com.anythink.expressad.exoplayer.h.af D() {
        return this.P.f9341h;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final com.anythink.expressad.exoplayer.i.g E() {
        return this.P.f9342i.f8689c;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final ae F() {
        return this.P.f9335a;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final Object G() {
        return this.P.f9336b;
    }

    @Override // com.anythink.expressad.exoplayer.h
    public final Looper a() {
        return this.B.b();
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final w.g b() {
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final w.e c() {
        return null;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int d() {
        return this.P.f;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final g e() {
        return this.O;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final boolean f() {
        return this.H;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int g() {
        return this.I;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final boolean h() {
        return this.J;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final boolean i() {
        return this.P.f9340g;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void j() {
        b(p());
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final v k() {
        return this.N;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final Object l() {
        int p10 = p();
        if (p10 > this.P.f9335a.b()) {
            return null;
        }
        return this.P.f9335a.a(p10, this.E, true).f7277a;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void m() {
        c(false);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void n() {
        Log.i(f8691w, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.8.4] [" + af.f8997e + "] [" + l.a() + "]");
        this.B.a();
        this.A.removeCallbacksAndMessages(null);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int o() {
        if (H()) {
            return this.R;
        }
        return this.P.f9337c.f8484a;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int p() {
        if (H()) {
            return this.Q;
        }
        u uVar = this.P;
        return uVar.f9335a.a(uVar.f9337c.f8484a, this.F, false).f7274c;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int q() {
        ae aeVar = this.P.f9335a;
        if (aeVar.a()) {
            return -1;
        }
        return aeVar.a(p(), this.I, this.J);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int r() {
        ae aeVar = this.P.f9335a;
        if (aeVar.a()) {
            return -1;
        }
        return aeVar.b(p(), this.I, this.J);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final long s() {
        ae aeVar = this.P.f9335a;
        if (aeVar.a()) {
            return b.f7291b;
        }
        if (y()) {
            s.a aVar = this.P.f9337c;
            aeVar.a(aVar.f8484a, this.F, false);
            return b.a(this.F.c(aVar.f8485b, aVar.f8486c));
        }
        return b.a(aeVar.a(p(), this.E, false).f7284i);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final long t() {
        if (H()) {
            return this.S;
        }
        return b(this.P.f9343j);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final long u() {
        if (H()) {
            return this.S;
        }
        return b(this.P.f9344k);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int v() {
        long u2 = u();
        long s10 = s();
        if (u2 == b.f7291b || s10 == b.f7291b) {
            return 0;
        }
        if (s10 == 0) {
            return 100;
        }
        return af.a((int) ((u2 * 100) / s10), 0, 100);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final boolean w() {
        ae aeVar = this.P.f9335a;
        if (aeVar.a() || !aeVar.a(p(), this.E, false).f7281e) {
            return false;
        }
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final boolean x() {
        ae aeVar = this.P.f9335a;
        if (aeVar.a() || !aeVar.a(p(), this.E, false).f7280d) {
            return false;
        }
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final boolean y() {
        if (!H() && this.P.f9337c.a()) {
            return true;
        }
        return false;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int z() {
        if (y()) {
            return this.P.f9337c.f8485b;
        }
        return -1;
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void a(w.c cVar) {
        this.D.add(cVar);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void b(w.c cVar) {
        this.D.remove(cVar);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void c(boolean z10) {
        if (z10) {
            this.O = null;
        }
        u a10 = a(z10, z10, 1);
        this.K++;
        this.B.c(z10);
        a(a10, false, 4, 1, false, false);
    }

    @Override // com.anythink.expressad.exoplayer.h
    public final void a(com.anythink.expressad.exoplayer.h.s sVar) {
        a(sVar, true, true);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void b(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            this.B.b(z10);
            Iterator<w.c> it = this.D.iterator();
            while (it.hasNext()) {
                it.next().onShuffleModeEnabledChanged(z10);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.h
    public final void a(com.anythink.expressad.exoplayer.h.s sVar, boolean z10, boolean z11) {
        this.O = null;
        u a10 = a(z10, z11, 2);
        this.L = true;
        this.K++;
        this.B.a(sVar, z10, z11);
        a(a10, false, 4, 1, false, false);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final int c(int i10) {
        return this.f8692x[i10].a();
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void b(int i10) {
        a(i10, b.f7291b);
    }

    @Override // com.anythink.expressad.exoplayer.h
    public final void b(h.c... cVarArr) {
        ArrayList arrayList = new ArrayList();
        for (h.c cVar : cVarArr) {
            arrayList.add(a(cVar.f8322a).a(cVar.f8323b).a(cVar.f8324c).i());
        }
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            x xVar = (x) it.next();
            boolean z11 = true;
            while (z11) {
                try {
                    xVar.k();
                    z11 = false;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (TimeoutException e10) {
                    com.anythink.expressad.foundation.h.o.d(f8691w, e10.getMessage());
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void a(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.B.a(z10);
            a(this.P, false, 4, 1, false, true);
        }
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void a(int i10) {
        if (this.I != i10) {
            this.I = i10;
            this.B.a(i10);
            Iterator<w.c> it = this.D.iterator();
            while (it.hasNext()) {
                it.next().onRepeatModeChanged(i10);
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void a(long j10) {
        a(p(), j10);
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void a(int i10, long j10) {
        long b10;
        ae aeVar = this.P.f9335a;
        if (i10 >= 0 && (aeVar.a() || i10 < aeVar.b())) {
            this.M = true;
            this.K++;
            if (y()) {
                Log.w(f8691w, "seekTo ignored because an ad is playing");
                this.A.obtainMessage(0, 1, -1, this.P).sendToTarget();
                return;
            }
            this.Q = i10;
            if (aeVar.a()) {
                this.S = j10 == b.f7291b ? 0L : j10;
                this.R = 0;
            } else {
                if (j10 == b.f7291b) {
                    b10 = aeVar.a(i10, this.E, false).f7283h;
                } else {
                    b10 = b.b(j10);
                }
                long j11 = b10;
                Pair<Integer, Long> a10 = aeVar.a(this.E, this.F, i10, j11);
                this.S = b.a(j11);
                this.R = ((Integer) a10.first).intValue();
            }
            this.B.a(aeVar, i10, b.b(j10));
            Iterator<w.c> it = this.D.iterator();
            while (it.hasNext()) {
                it.next().onPositionDiscontinuity(1);
            }
            return;
        }
        throw new o(aeVar, i10, j10);
    }

    private long b(long j10) {
        long a10 = b.a(j10);
        if (this.P.f9337c.a()) {
            return a10;
        }
        u uVar = this.P;
        uVar.f9335a.a(uVar.f9337c.f8484a, this.F, false);
        return a10 + this.F.a();
    }

    @Override // com.anythink.expressad.exoplayer.w
    public final void a(v vVar) {
        if (vVar == null) {
            vVar = v.f9345a;
        }
        this.B.b(vVar);
    }

    @Override // com.anythink.expressad.exoplayer.h
    public final void a(ac acVar) {
        if (acVar == null) {
            acVar = ac.f7265e;
        }
        this.B.a(acVar);
    }

    @Override // com.anythink.expressad.exoplayer.h
    public final void a(h.c... cVarArr) {
        for (h.c cVar : cVarArr) {
            a(cVar.f8322a).a(cVar.f8323b).a(cVar.f8324c).i();
        }
    }

    @Override // com.anythink.expressad.exoplayer.h
    public final x a(x.b bVar) {
        return new x(this.B, bVar, this.P.f9335a, p(), this.C);
    }

    public final void a(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    g gVar = (g) message.obj;
                    this.O = gVar;
                    Iterator<w.c> it = this.D.iterator();
                    while (it.hasNext()) {
                        it.next().onPlayerError(gVar);
                    }
                    return;
                }
                throw new IllegalStateException();
            }
            v vVar = (v) message.obj;
            if (this.N.equals(vVar)) {
                return;
            }
            this.N = vVar;
            Iterator<w.c> it2 = this.D.iterator();
            while (it2.hasNext()) {
                it2.next().onPlaybackParametersChanged(vVar);
            }
            return;
        }
        u uVar = (u) message.obj;
        int i11 = message.arg1;
        int i12 = message.arg2;
        boolean z10 = i12 != -1;
        int i13 = this.K - i11;
        this.K = i13;
        if (i13 == 0) {
            if (uVar.f9338d == b.f7291b) {
                uVar = uVar.a(uVar.f9337c, 0L, uVar.f9339e);
            }
            u uVar2 = uVar;
            if ((!this.P.f9335a.a() || this.L) && uVar2.f9335a.a()) {
                this.R = 0;
                this.Q = 0;
                this.S = 0L;
            }
            int i14 = this.L ? 0 : 2;
            boolean z11 = this.M;
            this.L = false;
            this.M = false;
            a(uVar2, z10, i12, i14, z11, false);
        }
    }

    private void a(u uVar, int i10, boolean z10, int i11) {
        int i12 = this.K - i10;
        this.K = i12;
        if (i12 == 0) {
            if (uVar.f9338d == b.f7291b) {
                uVar = uVar.a(uVar.f9337c, 0L, uVar.f9339e);
            }
            u uVar2 = uVar;
            if ((!this.P.f9335a.a() || this.L) && uVar2.f9335a.a()) {
                this.R = 0;
                this.Q = 0;
                this.S = 0L;
            }
            int i13 = this.L ? 0 : 2;
            boolean z11 = this.M;
            this.L = false;
            this.M = false;
            a(uVar2, z10, i11, i13, z11, false);
        }
    }

    private u a(boolean z10, boolean z11, int i10) {
        if (z10) {
            this.Q = 0;
            this.R = 0;
            this.S = 0L;
        } else {
            this.Q = p();
            this.R = o();
            this.S = t();
        }
        ae aeVar = z11 ? ae.f7271a : this.P.f9335a;
        Object obj = z11 ? null : this.P.f9336b;
        u uVar = this.P;
        return new u(aeVar, obj, uVar.f9337c, uVar.f9338d, uVar.f9339e, i10, false, z11 ? com.anythink.expressad.exoplayer.h.af.f8255a : uVar.f9341h, z11 ? this.f8693z : uVar.f9342i);
    }

    private void a(u uVar, boolean z10, int i10, int i11, boolean z11, boolean z12) {
        boolean z13 = !this.G.isEmpty();
        this.G.addLast(new a(uVar, this.P, this.D, this.y, z10, i10, i11, z11, this.H, z12));
        this.P = uVar;
        if (z13) {
            return;
        }
        while (!this.G.isEmpty()) {
            this.G.peekFirst().a();
            this.G.removeFirst();
        }
    }
}
