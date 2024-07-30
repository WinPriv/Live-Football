package k4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import b6.m;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.metadata.Metadata;
import com.huawei.hms.ads.br;
import com.huawei.hms.ads.gl;
import j5.s;
import j5.u;
import j7.j0;
import j7.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.f1;
import k4.j;
import k4.n0;
import k4.q1;
import k4.y0;

/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: classes2.dex */
public final class f0 implements Handler.Callback, s.a, m.a, y0.d, j.a, f1.a {
    public final HandlerThread A;
    public final Looper B;
    public final q1.c C;
    public final q1.b D;
    public final long E;
    public final boolean F;
    public final j G;
    public final ArrayList<c> H;
    public final d6.c I;
    public final e J;
    public final r0 K;
    public final y0 L;
    public final l0 M;
    public final long N;
    public m1 O;
    public c1 P;
    public d Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f30422c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f30423d0;

    /* renamed from: e0, reason: collision with root package name */
    public g f30424e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f30425f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f30426g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f30427h0;

    /* renamed from: i0, reason: collision with root package name */
    public m f30428i0;

    /* renamed from: j0, reason: collision with root package name */
    public long f30429j0 = com.anythink.expressad.exoplayer.b.f7291b;

    /* renamed from: s, reason: collision with root package name */
    public final i1[] f30430s;

    /* renamed from: t, reason: collision with root package name */
    public final Set<i1> f30431t;

    /* renamed from: u, reason: collision with root package name */
    public final j1[] f30432u;

    /* renamed from: v, reason: collision with root package name */
    public final b6.m f30433v;

    /* renamed from: w, reason: collision with root package name */
    public final b6.n f30434w;

    /* renamed from: x, reason: collision with root package name */
    public final m0 f30435x;
    public final c6.e y;

    /* renamed from: z, reason: collision with root package name */
    public final d6.m f30436z;

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<y0.c> f30437a;

        /* renamed from: b, reason: collision with root package name */
        public final j5.h0 f30438b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30439c;

        /* renamed from: d, reason: collision with root package name */
        public final long f30440d;

        public a(ArrayList arrayList, j5.h0 h0Var, int i10, long j10) {
            this.f30437a = arrayList;
            this.f30438b = h0Var;
            this.f30439c = i10;
            this.f30440d = j10;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static class b {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class c implements Comparable<c> {
        public c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            cVar.getClass();
            return 0;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f30441a;

        /* renamed from: b, reason: collision with root package name */
        public c1 f30442b;

        /* renamed from: c, reason: collision with root package name */
        public int f30443c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f30444d;

        /* renamed from: e, reason: collision with root package name */
        public int f30445e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public int f30446g;

        public d(c1 c1Var) {
            this.f30442b = c1Var;
        }

        public final void a(int i10) {
            boolean z10;
            boolean z11 = this.f30441a;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f30441a = z11 | z10;
            this.f30443c += i10;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public interface e {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final u.b f30447a;

        /* renamed from: b, reason: collision with root package name */
        public final long f30448b;

        /* renamed from: c, reason: collision with root package name */
        public final long f30449c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f30450d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f30451e;
        public final boolean f;

        public f(u.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f30447a = bVar;
            this.f30448b = j10;
            this.f30449c = j11;
            this.f30450d = z10;
            this.f30451e = z11;
            this.f = z12;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final q1 f30452a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30453b;

        /* renamed from: c, reason: collision with root package name */
        public final long f30454c;

        public g(q1 q1Var, int i10, long j10) {
            this.f30452a = q1Var;
            this.f30453b = i10;
            this.f30454c = j10;
        }
    }

    public f0(i1[] i1VarArr, b6.m mVar, b6.n nVar, m0 m0Var, c6.e eVar, int i10, boolean z10, l4.a aVar, m1 m1Var, h hVar, long j10, boolean z11, Looper looper, d6.c cVar, u uVar, l4.w wVar) {
        this.J = uVar;
        this.f30430s = i1VarArr;
        this.f30433v = mVar;
        this.f30434w = nVar;
        this.f30435x = m0Var;
        this.y = eVar;
        this.W = i10;
        this.X = z10;
        this.O = m1Var;
        this.M = hVar;
        this.N = j10;
        this.S = z11;
        this.I = cVar;
        this.E = m0Var.b();
        this.F = m0Var.a();
        c1 h10 = c1.h(nVar);
        this.P = h10;
        this.Q = new d(h10);
        this.f30432u = new j1[i1VarArr.length];
        for (int i11 = 0; i11 < i1VarArr.length; i11++) {
            i1VarArr[i11].i(i11, wVar);
            this.f30432u[i11] = i1VarArr[i11].j();
        }
        this.G = new j(this, cVar);
        this.H = new ArrayList<>();
        this.f30431t = Collections.newSetFromMap(new IdentityHashMap());
        this.C = new q1.c();
        this.D = new q1.b();
        mVar.f3122a = this;
        mVar.f3123b = eVar;
        this.f30427h0 = true;
        d6.b0 b10 = cVar.b(looper, null);
        this.K = new r0(aVar, b10);
        this.L = new y0(this, aVar, b10, wVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.A = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.B = looper2;
        this.f30436z = cVar.b(looper2, this);
    }

    public static Pair<Object, Long> F(q1 q1Var, g gVar, boolean z10, int i10, boolean z11, q1.c cVar, q1.b bVar) {
        q1 q1Var2;
        Pair<Object, Long> i11;
        Object G;
        q1 q1Var3 = gVar.f30452a;
        if (q1Var.p()) {
            return null;
        }
        if (q1Var3.p()) {
            q1Var2 = q1Var;
        } else {
            q1Var2 = q1Var3;
        }
        try {
            i11 = q1Var2.i(cVar, bVar, gVar.f30453b, gVar.f30454c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (q1Var.equals(q1Var2)) {
            return i11;
        }
        if (q1Var.b(i11.first) != -1) {
            if (q1Var2.g(i11.first, bVar).f30759x && q1Var2.m(bVar.f30756u, cVar).G == q1Var2.b(i11.first)) {
                return q1Var.i(cVar, bVar, q1Var.g(i11.first, bVar).f30756u, gVar.f30454c);
            }
            return i11;
        }
        if (z10 && (G = G(cVar, bVar, i10, z11, i11.first, q1Var2, q1Var)) != null) {
            return q1Var.i(cVar, bVar, q1Var.g(G, bVar).f30756u, com.anythink.expressad.exoplayer.b.f7291b);
        }
        return null;
    }

    public static Object G(q1.c cVar, q1.b bVar, int i10, boolean z10, Object obj, q1 q1Var, q1 q1Var2) {
        int b10 = q1Var.b(obj);
        int h10 = q1Var.h();
        int i11 = b10;
        int i12 = -1;
        for (int i13 = 0; i13 < h10 && i12 == -1; i13++) {
            i11 = q1Var.d(i11, bVar, cVar, i10, z10);
            if (i11 == -1) {
                break;
            }
            i12 = q1Var2.b(q1Var.l(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return q1Var2.l(i12);
    }

    public static void M(i1 i1Var, long j10) {
        i1Var.g();
        if (i1Var instanceof r5.n) {
            r5.n nVar = (r5.n) i1Var;
            d6.a.d(nVar.C);
            nVar.S = j10;
        }
    }

    public static boolean r(i1 i1Var) {
        if (i1Var.getState() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A() throws k4.m {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.f0.A():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (r0 == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.f0.B(boolean, boolean, boolean, boolean):void");
    }

    public final void C() {
        boolean z10;
        p0 p0Var = this.K.f30773h;
        if (p0Var != null && p0Var.f.f30750h && this.S) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T = z10;
    }

    public final void D(long j10) throws m {
        long j11;
        p0 p0Var = this.K.f30773h;
        if (p0Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = p0Var.o;
        }
        long j12 = j10 + j11;
        this.f30425f0 = j12;
        this.G.f30548s.b(j12);
        for (i1 i1Var : this.f30430s) {
            if (r(i1Var)) {
                i1Var.u(this.f30425f0);
            }
        }
        for (p0 p0Var2 = r0.f30773h; p0Var2 != null; p0Var2 = p0Var2.f30735l) {
            for (b6.f fVar : p0Var2.f30737n.f3126c) {
                if (fVar != null) {
                    fVar.s();
                }
            }
        }
    }

    public final void E(q1 q1Var, q1 q1Var2) {
        if (q1Var.p() && q1Var2.p()) {
            return;
        }
        ArrayList<c> arrayList = this.H;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void H(boolean z10) throws m {
        u.b bVar = this.K.f30773h.f.f30744a;
        long J = J(bVar, this.P.f30397r, true, false);
        if (J != this.P.f30397r) {
            c1 c1Var = this.P;
            this.P = p(bVar, J, c1Var.f30384c, c1Var.f30385d, z10, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7 A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:6:0x009d, B:8:0x00a7, B:15:0x00ad, B:17:0x00b3, B:18:0x00b6, B:19:0x00bb, B:21:0x00c5, B:23:0x00cb, B:27:0x00d3, B:28:0x00dd, B:30:0x00ed, B:34:0x00f7, B:36:0x010b, B:39:0x0114, B:42:0x011f), top: B:5:0x009d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(k4.f0.g r20) throws k4.m {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.f0.I(k4.f0$g):void");
    }

    public final long J(u.b bVar, long j10, boolean z10, boolean z11) throws m {
        b0();
        this.U = false;
        if (z11 || this.P.f30386e == 3) {
            W(2);
        }
        r0 r0Var = this.K;
        p0 p0Var = r0Var.f30773h;
        p0 p0Var2 = p0Var;
        while (p0Var2 != null && !bVar.equals(p0Var2.f.f30744a)) {
            p0Var2 = p0Var2.f30735l;
        }
        if (z10 || p0Var != p0Var2 || (p0Var2 != null && p0Var2.o + j10 < 0)) {
            i1[] i1VarArr = this.f30430s;
            for (i1 i1Var : i1VarArr) {
                c(i1Var);
            }
            if (p0Var2 != null) {
                while (r0Var.f30773h != p0Var2) {
                    r0Var.a();
                }
                r0Var.k(p0Var2);
                p0Var2.o = 1000000000000L;
                e(new boolean[i1VarArr.length]);
            }
        }
        if (p0Var2 != null) {
            r0Var.k(p0Var2);
            if (!p0Var2.f30728d) {
                p0Var2.f = p0Var2.f.b(j10);
            } else if (p0Var2.f30729e) {
                j5.s sVar = p0Var2.f30725a;
                j10 = sVar.l(j10);
                sVar.t(j10 - this.E, this.F);
            }
            D(j10);
            t();
        } else {
            r0Var.b();
            D(j10);
        }
        l(false);
        this.f30436z.g(2);
        return j10;
    }

    public final void K(f1 f1Var) throws m {
        Looper looper = f1Var.f;
        Looper looper2 = this.B;
        d6.m mVar = this.f30436z;
        if (looper == looper2) {
            synchronized (f1Var) {
            }
            try {
                f1Var.f30455a.p(f1Var.f30458d, f1Var.f30459e);
                f1Var.b(true);
                int i10 = this.P.f30386e;
                if (i10 == 3 || i10 == 2) {
                    mVar.g(2);
                    return;
                }
                return;
            } catch (Throwable th) {
                f1Var.b(true);
                throw th;
            }
        }
        mVar.j(15, f1Var).a();
    }

    public final void L(f1 f1Var) {
        Looper looper = f1Var.f;
        if (!looper.getThread().isAlive()) {
            d6.p.f("TAG", "Trying to send message on a dead thread.");
            f1Var.b(false);
        } else {
            this.I.b(looper, null).c(new androidx.appcompat.app.p(4, this, f1Var));
        }
    }

    public final void N(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.Y != z10) {
            this.Y = z10;
            if (!z10) {
                for (i1 i1Var : this.f30430s) {
                    if (!r(i1Var) && this.f30431t.remove(i1Var)) {
                        i1Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(a aVar) throws m {
        this.Q.a(1);
        int i10 = aVar.f30439c;
        j5.h0 h0Var = aVar.f30438b;
        List<y0.c> list = aVar.f30437a;
        if (i10 != -1) {
            this.f30424e0 = new g(new g1(list, h0Var), aVar.f30439c, aVar.f30440d);
        }
        y0 y0Var = this.L;
        ArrayList arrayList = y0Var.f30835b;
        y0Var.g(0, arrayList.size());
        m(y0Var.a(arrayList.size(), list, h0Var), false);
    }

    public final void P(boolean z10) {
        if (z10 == this.f30422c0) {
            return;
        }
        this.f30422c0 = z10;
        if (!z10 && this.P.o) {
            this.f30436z.g(2);
        }
    }

    public final void Q(boolean z10) throws m {
        this.S = z10;
        C();
        if (this.T) {
            r0 r0Var = this.K;
            if (r0Var.f30774i != r0Var.f30773h) {
                H(true);
                l(false);
            }
        }
    }

    public final void R(int i10, int i11, boolean z10, boolean z11) throws m {
        int i12;
        d dVar = this.Q;
        if (z11) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        dVar.a(i12);
        d dVar2 = this.Q;
        dVar2.f30441a = true;
        dVar2.f = true;
        dVar2.f30446g = i11;
        this.P = this.P.c(i10, z10);
        this.U = false;
        for (p0 p0Var = this.K.f30773h; p0Var != null; p0Var = p0Var.f30735l) {
            for (b6.f fVar : p0Var.f30737n.f3126c) {
                if (fVar != null) {
                    fVar.k(z10);
                }
            }
        }
        if (!X()) {
            b0();
            d0();
            return;
        }
        int i13 = this.P.f30386e;
        d6.m mVar = this.f30436z;
        if (i13 == 3) {
            Z();
            mVar.g(2);
        } else if (i13 == 2) {
            mVar.g(2);
        }
    }

    public final void S(d1 d1Var) throws m {
        this.f30436z.i(16);
        j jVar = this.G;
        jVar.a(d1Var);
        d1 d10 = jVar.d();
        o(d10, d10.f30401s, true, true);
    }

    public final void T(int i10) throws m {
        this.W = i10;
        q1 q1Var = this.P.f30382a;
        r0 r0Var = this.K;
        r0Var.f = i10;
        if (!r0Var.n(q1Var)) {
            H(true);
        }
        l(false);
    }

    public final void U(boolean z10) throws m {
        this.X = z10;
        q1 q1Var = this.P.f30382a;
        r0 r0Var = this.K;
        r0Var.f30772g = z10;
        if (!r0Var.n(q1Var)) {
            H(true);
        }
        l(false);
    }

    public final void V(j5.h0 h0Var) throws m {
        this.Q.a(1);
        y0 y0Var = this.L;
        int size = y0Var.f30835b.size();
        if (h0Var.getLength() != size) {
            h0Var = h0Var.g().e(size);
        }
        y0Var.f30842j = h0Var;
        m(y0Var.b(), false);
    }

    public final void W(int i10) {
        c1 c1Var = this.P;
        if (c1Var.f30386e != i10) {
            if (i10 != 2) {
                this.f30429j0 = com.anythink.expressad.exoplayer.b.f7291b;
            }
            this.P = c1Var.f(i10);
        }
    }

    public final boolean X() {
        c1 c1Var = this.P;
        if (c1Var.f30392l && c1Var.f30393m == 0) {
            return true;
        }
        return false;
    }

    public final boolean Y(q1 q1Var, u.b bVar) {
        if (bVar.a() || q1Var.p()) {
            return false;
        }
        int i10 = q1Var.g(bVar.f29835a, this.D).f30756u;
        q1.c cVar = this.C;
        q1Var.m(i10, cVar);
        if (!cVar.a() || !cVar.A || cVar.f30765x == com.anythink.expressad.exoplayer.b.f7291b) {
            return false;
        }
        return true;
    }

    public final void Z() throws m {
        this.U = false;
        j jVar = this.G;
        jVar.f30553x = true;
        d6.z zVar = jVar.f30548s;
        if (!zVar.f27396t) {
            zVar.f27398v = zVar.f27395s.elapsedRealtime();
            zVar.f27396t = true;
        }
        for (i1 i1Var : this.f30430s) {
            if (r(i1Var)) {
                i1Var.start();
            }
        }
    }

    @Override // j5.s.a
    public final void a(j5.s sVar) {
        this.f30436z.j(8, sVar).a();
    }

    public final void a0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.Y) {
            z12 = false;
        } else {
            z12 = true;
        }
        B(z12, false, true, false);
        this.Q.a(z11 ? 1 : 0);
        this.f30435x.g();
        W(1);
    }

    public final void b(a aVar, int i10) throws m {
        this.Q.a(1);
        y0 y0Var = this.L;
        if (i10 == -1) {
            i10 = y0Var.f30835b.size();
        }
        m(y0Var.a(i10, aVar.f30437a, aVar.f30438b), false);
    }

    public final void b0() throws m {
        j jVar = this.G;
        jVar.f30553x = false;
        d6.z zVar = jVar.f30548s;
        if (zVar.f27396t) {
            zVar.b(zVar.l());
            zVar.f27396t = false;
        }
        for (i1 i1Var : this.f30430s) {
            if (r(i1Var) && i1Var.getState() == 2) {
                i1Var.stop();
            }
        }
    }

    public final void c(i1 i1Var) throws m {
        boolean z10;
        if (i1Var.getState() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        j jVar = this.G;
        if (i1Var == jVar.f30550u) {
            jVar.f30551v = null;
            jVar.f30550u = null;
            jVar.f30552w = true;
        }
        if (i1Var.getState() == 2) {
            i1Var.stop();
        }
        i1Var.e();
        this.f30423d0--;
    }

    public final void c0() {
        boolean z10;
        p0 p0Var = this.K.f30775j;
        if (!this.V && (p0Var == null || !p0Var.f30725a.isLoading())) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        c1 c1Var = this.P;
        if (z11 != c1Var.f30387g) {
            this.P = new c1(c1Var.f30382a, c1Var.f30383b, c1Var.f30384c, c1Var.f30385d, c1Var.f30386e, c1Var.f, z11, c1Var.f30388h, c1Var.f30389i, c1Var.f30390j, c1Var.f30391k, c1Var.f30392l, c1Var.f30393m, c1Var.f30394n, c1Var.f30395p, c1Var.f30396q, c1Var.f30397r, c1Var.o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r0.f30776k < 100) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x052d, code lost:
    
        if (r4.e(r29, r50.G.d().f30401s, r50.U, r33) != false) goto L346;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0399 A[EDGE_INSN: B:128:0x0399->B:129:0x0399 BREAK  A[LOOP:2: B:99:0x030c->B:125:0x036e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() throws k4.m, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.f0.d():void");
    }

    public final void d0() throws m {
        long j10;
        boolean z10;
        boolean z11;
        f0 f0Var;
        long j11;
        f0 f0Var2;
        f0 f0Var3;
        c cVar;
        long max;
        float f10;
        p0 p0Var = this.K.f30773h;
        if (p0Var == null) {
            return;
        }
        if (p0Var.f30728d) {
            j10 = p0Var.f30725a.p();
        } else {
            j10 = -9223372036854775807L;
        }
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            D(j10);
            if (j10 != this.P.f30397r) {
                c1 c1Var = this.P;
                this.P = p(c1Var.f30383b, j10, c1Var.f30384c, j10, true, 5);
            }
            f0Var = this;
            j11 = -9223372036854775807L;
            f0Var2 = f0Var;
        } else {
            j jVar = this.G;
            if (p0Var != this.K.f30774i) {
                z10 = true;
            } else {
                z10 = false;
            }
            i1 i1Var = jVar.f30550u;
            if (i1Var != null && !i1Var.b() && (jVar.f30550u.isReady() || (!z10 && !jVar.f30550u.f()))) {
                z11 = false;
            } else {
                z11 = true;
            }
            d6.z zVar = jVar.f30548s;
            if (z11) {
                jVar.f30552w = true;
                if (jVar.f30553x && !zVar.f27396t) {
                    zVar.f27398v = zVar.f27395s.elapsedRealtime();
                    zVar.f27396t = true;
                }
            } else {
                d6.q qVar = jVar.f30551v;
                qVar.getClass();
                long l10 = qVar.l();
                if (jVar.f30552w) {
                    if (l10 < zVar.l()) {
                        if (zVar.f27396t) {
                            zVar.b(zVar.l());
                            zVar.f27396t = false;
                        }
                    } else {
                        jVar.f30552w = false;
                        if (jVar.f30553x && !zVar.f27396t) {
                            zVar.f27398v = zVar.f27395s.elapsedRealtime();
                            zVar.f27396t = true;
                        }
                    }
                }
                zVar.b(l10);
                d1 d10 = qVar.d();
                if (!d10.equals(zVar.f27399w)) {
                    zVar.a(d10);
                    ((f0) jVar.f30549t).f30436z.j(16, d10).a();
                }
            }
            long l11 = jVar.l();
            this.f30425f0 = l11;
            long j12 = l11 - p0Var.o;
            long j13 = this.P.f30397r;
            if (!this.H.isEmpty() && !this.P.f30383b.a()) {
                if (this.f30427h0) {
                    j13--;
                    this.f30427h0 = false;
                }
                c1 c1Var2 = this.P;
                int b10 = c1Var2.f30382a.b(c1Var2.f30383b.f29835a);
                int min = Math.min(this.f30426g0, this.H.size());
                c cVar2 = null;
                if (min > 0) {
                    cVar = this.H.get(min - 1);
                    f0Var3 = this;
                    f0Var = f0Var3;
                    j11 = -9223372036854775807L;
                    f0Var2 = f0Var;
                } else {
                    j11 = -9223372036854775807L;
                    f0Var2 = this;
                    f0Var = this;
                    f0Var3 = this;
                    cVar = null;
                }
                while (cVar != null) {
                    cVar.getClass();
                    if (b10 >= 0) {
                        if (b10 != 0) {
                            break;
                        }
                        cVar.getClass();
                        if (0 <= j13) {
                            break;
                        }
                    }
                    min--;
                    if (min <= 0) {
                        j11 = j11;
                        f0Var2 = f0Var2;
                        f0Var = f0Var;
                        f0Var3 = f0Var3;
                        cVar = null;
                    } else {
                        cVar = f0Var3.H.get(min - 1);
                    }
                }
                if (min < f0Var3.H.size()) {
                    cVar2 = f0Var3.H.get(min);
                }
                if (cVar2 != null) {
                    cVar2.getClass();
                }
                if (cVar2 != null) {
                    cVar2.getClass();
                }
                f0Var3.f30426g0 = min;
            } else {
                f0Var = this;
                j11 = -9223372036854775807L;
                f0Var2 = f0Var;
            }
            f0Var.P.f30397r = j12;
        }
        f0Var.P.f30395p = f0Var.K.f30775j.d();
        c1 c1Var3 = f0Var.P;
        long j14 = f0Var2.P.f30395p;
        p0 p0Var2 = f0Var2.K.f30775j;
        long j15 = 0;
        if (p0Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j14 - (f0Var2.f30425f0 - p0Var2.o));
        }
        c1Var3.f30396q = max;
        c1 c1Var4 = f0Var.P;
        if (c1Var4.f30392l && c1Var4.f30386e == 3 && f0Var.Y(c1Var4.f30382a, c1Var4.f30383b)) {
            c1 c1Var5 = f0Var.P;
            if (c1Var5.f30394n.f30401s == 1.0f) {
                l0 l0Var = f0Var.M;
                long f11 = f0Var.f(c1Var5.f30382a, c1Var5.f30383b.f29835a, c1Var5.f30397r);
                long j16 = f0Var2.P.f30395p;
                p0 p0Var3 = f0Var2.K.f30775j;
                if (p0Var3 != null) {
                    j15 = Math.max(0L, j16 - (f0Var2.f30425f0 - p0Var3.o));
                }
                h hVar = (h) l0Var;
                if (hVar.f30475d == j11) {
                    f10 = 1.0f;
                } else {
                    long j17 = f11 - j15;
                    if (hVar.f30484n == j11) {
                        hVar.f30484n = j17;
                        hVar.o = 0L;
                    } else {
                        float f12 = 1.0f - hVar.f30474c;
                        hVar.f30484n = Math.max(j17, (((float) j17) * f12) + (((float) r6) * r0));
                        hVar.o = (f12 * ((float) Math.abs(j17 - r14))) + (((float) hVar.o) * r0);
                    }
                    if (hVar.f30483m != j11 && SystemClock.elapsedRealtime() - hVar.f30483m < 1000) {
                        f10 = hVar.f30482l;
                    } else {
                        hVar.f30483m = SystemClock.elapsedRealtime();
                        long j18 = (hVar.o * 3) + hVar.f30484n;
                        if (hVar.f30479i > j18) {
                            float J = (float) d6.g0.J(1000L);
                            long[] jArr = {j18, hVar.f, hVar.f30479i - (((hVar.f30482l - 1.0f) * J) + ((hVar.f30480j - 1.0f) * J))};
                            long j19 = j18;
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j20 = jArr[i10];
                                if (j20 > j19) {
                                    j19 = j20;
                                }
                            }
                            hVar.f30479i = j19;
                        } else {
                            long i11 = d6.g0.i(f11 - (Math.max(gl.Code, hVar.f30482l - 1.0f) / 1.0E-7f), hVar.f30479i, j18);
                            hVar.f30479i = i11;
                            long j21 = hVar.f30478h;
                            if (j21 != j11 && i11 > j21) {
                                hVar.f30479i = j21;
                            }
                        }
                        long j22 = f11 - hVar.f30479i;
                        if (Math.abs(j22) < hVar.f30472a) {
                            hVar.f30482l = 1.0f;
                        } else {
                            hVar.f30482l = d6.g0.g((1.0E-7f * ((float) j22)) + 1.0f, hVar.f30481k, hVar.f30480j);
                        }
                        f10 = hVar.f30482l;
                    }
                }
                if (f0Var.G.d().f30401s != f10) {
                    d1 d1Var = new d1(f10, f0Var.P.f30394n.f30402t);
                    f0Var.f30436z.i(16);
                    f0Var.G.a(d1Var);
                    f0Var.o(f0Var.P.f30394n, f0Var.G.d().f30401s, false, false);
                }
            }
        }
    }

    public final void e(boolean[] zArr) throws m {
        i1[] i1VarArr;
        Set<i1> set;
        i1[] i1VarArr2;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        d6.q qVar;
        r0 r0Var = this.K;
        p0 p0Var = r0Var.f30774i;
        b6.n nVar = p0Var.f30737n;
        int i11 = 0;
        while (true) {
            i1VarArr = this.f30430s;
            int length = i1VarArr.length;
            set = this.f30431t;
            if (i11 >= length) {
                break;
            }
            if (!nVar.b(i11) && set.remove(i1VarArr[i11])) {
                i1VarArr[i11].reset();
            }
            i11++;
        }
        int i12 = 0;
        while (i12 < i1VarArr.length) {
            if (nVar.b(i12)) {
                boolean z13 = zArr[i12];
                i1 i1Var = i1VarArr[i12];
                if (!r(i1Var)) {
                    p0 p0Var2 = r0Var.f30774i;
                    if (p0Var2 == r0Var.f30773h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    b6.n nVar2 = p0Var2.f30737n;
                    k1 k1Var = nVar2.f3125b[i12];
                    b6.f fVar = nVar2.f3126c[i12];
                    if (fVar != null) {
                        i10 = fVar.length();
                    } else {
                        i10 = 0;
                    }
                    i0[] i0VarArr = new i0[i10];
                    for (int i13 = 0; i13 < i10; i13++) {
                        i0VarArr[i13] = fVar.c(i13);
                    }
                    if (X() && this.P.f30386e == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z13 && z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f30423d0++;
                    set.add(i1Var);
                    i1VarArr2 = i1VarArr;
                    i1Var.r(k1Var, i0VarArr, p0Var2.f30727c[i12], this.f30425f0, z12, z10, p0Var2.e(), p0Var2.o);
                    i1Var.p(11, new e0(this));
                    j jVar = this.G;
                    jVar.getClass();
                    d6.q w10 = i1Var.w();
                    if (w10 != null && w10 != (qVar = jVar.f30551v)) {
                        if (qVar == null) {
                            jVar.f30551v = w10;
                            jVar.f30550u = i1Var;
                            w10.a(jVar.f30548s.f27399w);
                        } else {
                            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z11) {
                        i1Var.start();
                    }
                    i12++;
                    i1VarArr = i1VarArr2;
                }
            }
            i1VarArr2 = i1VarArr;
            i12++;
            i1VarArr = i1VarArr2;
        }
        p0Var.f30730g = true;
    }

    public final void e0(q1 q1Var, u.b bVar, q1 q1Var2, u.b bVar2, long j10) throws m {
        Object obj;
        d1 d1Var;
        if (!Y(q1Var, bVar)) {
            if (bVar.a()) {
                d1Var = d1.f30400v;
            } else {
                d1Var = this.P.f30394n;
            }
            j jVar = this.G;
            if (!jVar.d().equals(d1Var)) {
                this.f30436z.i(16);
                jVar.a(d1Var);
                o(this.P.f30394n, d1Var.f30401s, false, false);
                return;
            }
            return;
        }
        Object obj2 = bVar.f29835a;
        q1.b bVar3 = this.D;
        int i10 = q1Var.g(obj2, bVar3).f30756u;
        q1.c cVar = this.C;
        q1Var.m(i10, cVar);
        n0.e eVar = cVar.C;
        h hVar = (h) this.M;
        hVar.getClass();
        hVar.f30475d = d6.g0.J(eVar.f30619s);
        hVar.f30477g = d6.g0.J(eVar.f30620t);
        hVar.f30478h = d6.g0.J(eVar.f30621u);
        float f10 = eVar.f30622v;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        hVar.f30481k = f10;
        float f11 = eVar.f30623w;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        hVar.f30480j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            hVar.f30475d = com.anythink.expressad.exoplayer.b.f7291b;
        }
        hVar.a();
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            hVar.f30476e = f(q1Var, obj2, j10);
            hVar.a();
            return;
        }
        Object obj3 = cVar.f30760s;
        if (!q1Var2.p()) {
            obj = q1Var2.m(q1Var2.g(bVar2.f29835a, bVar3).f30756u, cVar).f30760s;
        } else {
            obj = null;
        }
        if (!d6.g0.a(obj, obj3)) {
            hVar.f30476e = com.anythink.expressad.exoplayer.b.f7291b;
            hVar.a();
        }
    }

    public final long f(q1 q1Var, Object obj, long j10) {
        q1.b bVar = this.D;
        int i10 = q1Var.g(obj, bVar).f30756u;
        q1.c cVar = this.C;
        q1Var.m(i10, cVar);
        if (cVar.f30765x == com.anythink.expressad.exoplayer.b.f7291b || !cVar.a() || !cVar.A) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        return d6.g0.J(d6.g0.u(cVar.y) - cVar.f30765x) - (j10 + bVar.f30758w);
    }

    public final synchronized void f0(d0 d0Var, long j10) {
        long elapsedRealtime = this.I.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) d0Var.get()).booleanValue() && j10 > 0) {
            try {
                this.I.c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = elapsedRealtime - this.I.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // j5.g0.a
    public final void g(j5.s sVar) {
        this.f30436z.j(9, sVar).a();
    }

    public final long h() {
        p0 p0Var = this.K.f30774i;
        if (p0Var == null) {
            return 0L;
        }
        long j10 = p0Var.o;
        if (!p0Var.f30728d) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            i1[] i1VarArr = this.f30430s;
            if (i10 < i1VarArr.length) {
                if (r(i1VarArr[i10]) && i1VarArr[i10].q() == p0Var.f30727c[i10]) {
                    long t10 = i1VarArr[i10].t();
                    if (t10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j10 = Math.max(t10, j10);
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        p0 p0Var;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 0:
                    x();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    R(message.arg2, 1, z10, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    I((g) message.obj);
                    break;
                case 4:
                    S((d1) message.obj);
                    break;
                case 5:
                    this.O = (m1) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    y();
                    return true;
                case 8:
                    n((j5.s) message.obj);
                    break;
                case 9:
                    j((j5.s) message.obj);
                    break;
                case 10:
                    A();
                    break;
                case 11:
                    T(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    U(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    N(z12, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    f1 f1Var = (f1) message.obj;
                    f1Var.getClass();
                    K(f1Var);
                    break;
                case 15:
                    L((f1) message.obj);
                    break;
                case 16:
                    d1 d1Var = (d1) message.obj;
                    o(d1Var, d1Var.f30401s, true, false);
                    break;
                case 17:
                    O((a) message.obj);
                    break;
                case 18:
                    b((a) message.obj, message.arg1);
                    break;
                case 19:
                    w((b) message.obj);
                    break;
                case 20:
                    z(message.arg1, message.arg2, (j5.h0) message.obj);
                    break;
                case 21:
                    V((j5.h0) message.obj);
                    break;
                case 22:
                    v();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Q(z13);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    P(z14);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (c6.k e10) {
            k(e10, e10.f3370s);
        } catch (d.a e11) {
            k(e11, e11.f19976s);
        } catch (j5.b e12) {
            k(e12, 1002);
        } catch (RuntimeException e13) {
            if ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) {
                i11 = 1004;
            }
            m mVar = new m(2, e13, i11);
            d6.p.d("ExoPlayerImplInternal", "Playback error", mVar);
            a0(true, false);
            this.P = this.P.d(mVar);
        } catch (z0 e14) {
            boolean z15 = e14.f30857s;
            int i12 = e14.f30858t;
            if (i12 == 1) {
                if (z15) {
                    i10 = 3001;
                } else {
                    i10 = br.f21563e;
                }
            } else {
                if (i12 == 4) {
                    if (z15) {
                        i10 = 3002;
                    } else {
                        i10 = br.f;
                    }
                }
                k(e14, i11);
            }
            i11 = i10;
            k(e14, i11);
        } catch (IOException e15) {
            k(e15, 2000);
        } catch (m e16) {
            e = e16;
            if (e.f30565u == 1 && (p0Var = this.K.f30774i) != null) {
                e = e.a(p0Var.f.f30744a);
            }
            if (e.A && this.f30428i0 == null) {
                d6.p.g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f30428i0 = e;
                d6.m mVar2 = this.f30436z;
                mVar2.h(mVar2.j(25, e));
            } else {
                m mVar3 = this.f30428i0;
                if (mVar3 != null) {
                    mVar3.addSuppressed(e);
                    e = this.f30428i0;
                }
                d6.p.d("ExoPlayerImplInternal", "Playback error", e);
                a0(true, false);
                this.P = this.P.d(e);
            }
        }
        u();
        return true;
    }

    public final Pair<u.b, Long> i(q1 q1Var) {
        long j10 = 0;
        if (q1Var.p()) {
            return Pair.create(c1.f30381s, 0L);
        }
        Pair<Object, Long> i10 = q1Var.i(this.C, this.D, q1Var.a(this.X), com.anythink.expressad.exoplayer.b.f7291b);
        u.b m10 = this.K.m(q1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (m10.a()) {
            Object obj = m10.f29835a;
            q1.b bVar = this.D;
            q1Var.g(obj, bVar);
            if (m10.f29837c == bVar.f(m10.f29836b)) {
                j10 = bVar.y.f30862u;
            }
            longValue = j10;
        }
        return Pair.create(m10, Long.valueOf(longValue));
    }

    public final void j(j5.s sVar) {
        boolean z10;
        p0 p0Var = this.K.f30775j;
        boolean z11 = true;
        if (p0Var != null && p0Var.f30725a == sVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        long j10 = this.f30425f0;
        if (p0Var != null) {
            if (p0Var.f30735l != null) {
                z11 = false;
            }
            d6.a.d(z11);
            if (p0Var.f30728d) {
                p0Var.f30725a.f(j10 - p0Var.o);
            }
        }
        t();
    }

    public final void k(IOException iOException, int i10) {
        m mVar = new m(0, iOException, i10);
        p0 p0Var = this.K.f30773h;
        if (p0Var != null) {
            mVar = mVar.a(p0Var.f.f30744a);
        }
        d6.p.d("ExoPlayerImplInternal", "Playback error", mVar);
        a0(false, false);
        this.P = this.P.d(mVar);
    }

    public final void l(boolean z10) {
        u.b bVar;
        long d10;
        p0 p0Var = this.K.f30775j;
        if (p0Var == null) {
            bVar = this.P.f30383b;
        } else {
            bVar = p0Var.f.f30744a;
        }
        boolean z11 = !this.P.f30391k.equals(bVar);
        if (z11) {
            this.P = this.P.a(bVar);
        }
        c1 c1Var = this.P;
        if (p0Var == null) {
            d10 = c1Var.f30397r;
        } else {
            d10 = p0Var.d();
        }
        c1Var.f30395p = d10;
        c1 c1Var2 = this.P;
        long j10 = c1Var2.f30395p;
        p0 p0Var2 = this.K.f30775j;
        long j11 = 0;
        if (p0Var2 != null) {
            j11 = Math.max(0L, j10 - (this.f30425f0 - p0Var2.o));
        }
        c1Var2.f30396q = j11;
        if ((z11 || z10) && p0Var != null && p0Var.f30728d) {
            this.f30435x.h(this.f30430s, p0Var.f30737n.f3126c);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v47 ??, still in use, count: 1, list:
          (r0v47 ?? I:??[OBJECT, ARRAY]) from 0x0034: MOVE (r7v26 ?? I:??[OBJECT, ARRAY]) = (r0v47 ?? I:??[OBJECT, ARRAY]) (LINE:53)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final void m(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v47 ??, still in use, count: 1, list:
          (r0v47 ?? I:??[OBJECT, ARRAY]) from 0x0034: MOVE (r7v26 ?? I:??[OBJECT, ARRAY]) = (r0v47 ?? I:??[OBJECT, ARRAY]) (LINE:53)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final void n(j5.s sVar) throws m {
        boolean z10;
        r0 r0Var = this.K;
        p0 p0Var = r0Var.f30775j;
        if (p0Var != null && p0Var.f30725a == sVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        float f10 = this.G.d().f30401s;
        q1 q1Var = this.P.f30382a;
        p0Var.f30728d = true;
        p0Var.f30736m = p0Var.f30725a.r();
        b6.n g6 = p0Var.g(f10, q1Var);
        q0 q0Var = p0Var.f;
        long j10 = q0Var.f30745b;
        long j11 = q0Var.f30748e;
        if (j11 != com.anythink.expressad.exoplayer.b.f7291b && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = p0Var.a(g6, j10, false, new boolean[p0Var.f30732i.length]);
        long j12 = p0Var.o;
        q0 q0Var2 = p0Var.f;
        p0Var.o = (q0Var2.f30745b - a10) + j12;
        p0Var.f = q0Var2.b(a10);
        b6.f[] fVarArr = p0Var.f30737n.f3126c;
        m0 m0Var = this.f30435x;
        i1[] i1VarArr = this.f30430s;
        m0Var.h(i1VarArr, fVarArr);
        if (p0Var == r0Var.f30773h) {
            D(p0Var.f.f30745b);
            e(new boolean[i1VarArr.length]);
            c1 c1Var = this.P;
            u.b bVar = c1Var.f30383b;
            long j13 = p0Var.f.f30745b;
            this.P = p(bVar, j13, c1Var.f30384c, j13, false, 5);
        }
        t();
    }

    public final void o(d1 d1Var, float f10, boolean z10, boolean z11) throws m {
        int i10;
        if (z10) {
            if (z11) {
                this.Q.a(1);
            }
            this.P = this.P.e(d1Var);
        }
        float f11 = d1Var.f30401s;
        p0 p0Var = this.K.f30773h;
        while (true) {
            i10 = 0;
            if (p0Var == null) {
                break;
            }
            b6.f[] fVarArr = p0Var.f30737n.f3126c;
            int length = fVarArr.length;
            while (i10 < length) {
                b6.f fVar = fVarArr[i10];
                if (fVar != null) {
                    fVar.q(f11);
                }
                i10++;
            }
            p0Var = p0Var.f30735l;
        }
        i1[] i1VarArr = this.f30430s;
        int length2 = i1VarArr.length;
        while (i10 < length2) {
            i1 i1Var = i1VarArr[i10];
            if (i1Var != null) {
                i1Var.m(f10, d1Var.f30401s);
            }
            i10++;
        }
    }

    public final c1 p(u.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        j5.n0 n0Var;
        b6.n nVar;
        List<Metadata> list;
        long max;
        boolean z12;
        j5.n0 n0Var2;
        b6.n nVar2;
        v1 v1Var;
        if (!this.f30427h0 && j10 == this.P.f30397r && bVar.equals(this.P.f30383b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f30427h0 = z11;
        C();
        c1 c1Var = this.P;
        j5.n0 n0Var3 = c1Var.f30388h;
        b6.n nVar3 = c1Var.f30389i;
        List<Metadata> list2 = c1Var.f30390j;
        if (this.L.f30843k) {
            p0 p0Var = this.K.f30773h;
            if (p0Var == null) {
                n0Var2 = j5.n0.f29811v;
            } else {
                n0Var2 = p0Var.f30736m;
            }
            if (p0Var == null) {
                nVar2 = this.f30434w;
            } else {
                nVar2 = p0Var.f30737n;
            }
            b6.f[] fVarArr = nVar2.f3126c;
            j0.a aVar = new j0.a();
            boolean z13 = false;
            for (b6.f fVar : fVarArr) {
                if (fVar != null) {
                    Metadata metadata = fVar.c(0).B;
                    if (metadata == null) {
                        aVar.b(new Metadata(new Metadata.Entry[0]));
                    } else {
                        aVar.b(metadata);
                        z13 = true;
                    }
                }
            }
            if (z13) {
                v1Var = aVar.e();
            } else {
                j0.b bVar2 = j7.j0.f30006t;
                v1Var = v1.f30113w;
            }
            if (p0Var != null) {
                q0 q0Var = p0Var.f;
                if (q0Var.f30746c != j11) {
                    p0Var.f = q0Var.a(j11);
                }
            }
            list = v1Var;
            n0Var = n0Var2;
            nVar = nVar2;
        } else if (!bVar.equals(c1Var.f30383b)) {
            n0Var = j5.n0.f29811v;
            nVar = this.f30434w;
            list = v1.f30113w;
        } else {
            n0Var = n0Var3;
            nVar = nVar3;
            list = list2;
        }
        if (z10) {
            d dVar = this.Q;
            if (dVar.f30444d && dVar.f30445e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d6.a.a(z12);
            } else {
                dVar.f30441a = true;
                dVar.f30444d = true;
                dVar.f30445e = i10;
            }
        }
        c1 c1Var2 = this.P;
        long j13 = c1Var2.f30395p;
        p0 p0Var2 = this.K.f30775j;
        if (p0Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j13 - (this.f30425f0 - p0Var2.o));
        }
        return c1Var2.b(bVar, j10, j11, j12, max, n0Var, nVar, list);
    }

    public final boolean q() {
        long b10;
        p0 p0Var = this.K.f30775j;
        if (p0Var == null) {
            return false;
        }
        if (!p0Var.f30728d) {
            b10 = 0;
        } else {
            b10 = p0Var.f30725a.b();
        }
        if (b10 == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean s() {
        p0 p0Var = this.K.f30773h;
        long j10 = p0Var.f.f30748e;
        if (p0Var.f30728d && (j10 == com.anythink.expressad.exoplayer.b.f7291b || this.P.f30397r < j10 || !X())) {
            return true;
        }
        return false;
    }

    public final void t() {
        long b10;
        long max;
        boolean c10;
        boolean z10 = false;
        if (!q()) {
            c10 = false;
        } else {
            p0 p0Var = this.K.f30775j;
            if (!p0Var.f30728d) {
                b10 = 0;
            } else {
                b10 = p0Var.f30725a.b();
            }
            p0 p0Var2 = this.K.f30775j;
            if (p0Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, b10 - (this.f30425f0 - p0Var2.o));
            }
            if (p0Var != this.K.f30773h) {
                long j10 = p0Var.f.f30745b;
            }
            c10 = this.f30435x.c(max, this.G.d().f30401s);
            if (!c10 && max < 500000 && (this.E > 0 || this.F)) {
                this.K.f30773h.f30725a.t(this.P.f30397r, false);
                c10 = this.f30435x.c(max, this.G.d().f30401s);
            }
        }
        this.V = c10;
        if (c10) {
            p0 p0Var3 = this.K.f30775j;
            long j11 = this.f30425f0;
            if (p0Var3.f30735l == null) {
                z10 = true;
            }
            d6.a.d(z10);
            p0Var3.f30725a.c(j11 - p0Var3.o);
        }
        c0();
    }

    public final void u() {
        boolean z10;
        d dVar = this.Q;
        c1 c1Var = this.P;
        boolean z11 = dVar.f30441a;
        if (dVar.f30442b != c1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        dVar.f30441a = z12;
        dVar.f30442b = c1Var;
        if (z12) {
            a0 a0Var = ((u) this.J).f30809s;
            a0Var.getClass();
            a0Var.f30332i.c(new e0.g(4, a0Var, dVar));
            this.Q = new d(this.P);
        }
    }

    public final void v() throws m {
        m(this.L.b(), true);
    }

    public final void w(b bVar) throws m {
        boolean z10 = true;
        this.Q.a(1);
        bVar.getClass();
        y0 y0Var = this.L;
        y0Var.getClass();
        if (y0Var.f30835b.size() < 0) {
            z10 = false;
        }
        d6.a.a(z10);
        y0Var.f30842j = null;
        m(y0Var.b(), false);
    }

    public final void x() {
        int i10;
        this.Q.a(1);
        int i11 = 0;
        B(false, false, false, true);
        this.f30435x.onPrepared();
        if (this.P.f30382a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        W(i10);
        c6.p e10 = this.y.e();
        y0 y0Var = this.L;
        d6.a.d(!y0Var.f30843k);
        y0Var.f30844l = e10;
        while (true) {
            ArrayList arrayList = y0Var.f30835b;
            if (i11 < arrayList.size()) {
                y0.c cVar = (y0.c) arrayList.get(i11);
                y0Var.e(cVar);
                y0Var.f30839g.add(cVar);
                i11++;
            } else {
                y0Var.f30843k = true;
                this.f30436z.g(2);
                return;
            }
        }
    }

    public final void y() {
        B(true, false, true, false);
        this.f30435x.d();
        W(1);
        HandlerThread handlerThread = this.A;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.R = true;
            notifyAll();
        }
    }

    public final void z(int i10, int i11, j5.h0 h0Var) throws m {
        boolean z10 = true;
        this.Q.a(1);
        y0 y0Var = this.L;
        y0Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > y0Var.f30835b.size()) {
            z10 = false;
        }
        d6.a.a(z10);
        y0Var.f30842j = h0Var;
        y0Var.g(i10, i11);
        m(y0Var.b(), false);
    }
}
