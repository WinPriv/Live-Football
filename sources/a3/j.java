package a3;

import a3.h;
import a3.o;
import a3.p;
import a3.s;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import u3.a;
import u3.d;

/* compiled from: DecodeJob.java */
/* loaded from: classes.dex */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public y2.e A;
    public com.bumptech.glide.j B;
    public r C;
    public int D;
    public int E;
    public n F;
    public y2.g G;
    public a<R> H;
    public int I;
    public int J;
    public int K;
    public long L;
    public boolean M;
    public Object N;
    public Thread O;
    public y2.e P;
    public y2.e Q;
    public Object R;
    public y2.a S;
    public com.bumptech.glide.load.data.d<?> T;
    public volatile h U;
    public volatile boolean V;
    public volatile boolean W;
    public boolean X;

    /* renamed from: v, reason: collision with root package name */
    public final d f137v;

    /* renamed from: w, reason: collision with root package name */
    public final m0.d<j<?>> f138w;

    /* renamed from: z, reason: collision with root package name */
    public com.bumptech.glide.h f140z;

    /* renamed from: s, reason: collision with root package name */
    public final i<R> f134s = new i<>();

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f135t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final d.a f136u = new d.a();

    /* renamed from: x, reason: collision with root package name */
    public final c<?> f139x = new c<>();
    public final e y = new e();

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface a<R> {
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public final class b<Z> {

        /* renamed from: a, reason: collision with root package name */
        public final y2.a f141a;

        public b(y2.a aVar) {
            this.f141a = aVar;
        }
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class c<Z> {

        /* renamed from: a, reason: collision with root package name */
        public y2.e f143a;

        /* renamed from: b, reason: collision with root package name */
        public y2.j<Z> f144b;

        /* renamed from: c, reason: collision with root package name */
        public w<Z> f145c;
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* compiled from: DecodeJob.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f146a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f147b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f148c;

        public final boolean a() {
            if ((this.f148c || this.f147b) && this.f146a) {
                return true;
            }
            return false;
        }
    }

    public j(d dVar, a.c cVar) {
        this.f137v = dVar;
        this.f138w = cVar;
    }

    @Override // a3.h.a
    public final void a(y2.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, y2.a aVar) {
        dVar.b();
        t tVar = new t("Fetching data failed", Collections.singletonList(exc));
        Class<?> a10 = dVar.a();
        tVar.f210t = eVar;
        tVar.f211u = aVar;
        tVar.f212v = a10;
        this.f135t.add(tVar);
        if (Thread.currentThread() != this.O) {
            n(2);
        } else {
            o();
        }
    }

    @Override // u3.a.d
    public final d.a b() {
        return this.f136u;
    }

    @Override // a3.h.a
    public final void c(y2.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, y2.a aVar, y2.e eVar2) {
        this.P = eVar;
        this.R = obj;
        this.T = dVar;
        this.S = aVar;
        this.Q = eVar2;
        boolean z10 = false;
        if (eVar != this.f134s.a().get(0)) {
            z10 = true;
        }
        this.X = z10;
        if (Thread.currentThread() != this.O) {
            n(3);
        } else {
            g();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(j<?> jVar) {
        j<?> jVar2 = jVar;
        int ordinal = this.B.ordinal() - jVar2.B.ordinal();
        if (ordinal == 0) {
            return this.I - jVar2.I;
        }
        return ordinal;
    }

    @Override // a3.h.a
    public final void d() {
        n(2);
    }

    public final <Data> x<R> e(com.bumptech.glide.load.data.d<?> dVar, Data data, y2.a aVar) throws t {
        if (data == null) {
            return null;
        }
        try {
            int i10 = t3.h.f35419b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            x<R> f = f(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Decoded result " + f, null, elapsedRealtimeNanos);
            }
            return f;
        } finally {
            dVar.b();
        }
    }

    public final <Data> x<R> f(Data data, y2.a aVar) throws t {
        boolean z10;
        Class<?> cls = data.getClass();
        i<R> iVar = this.f134s;
        v<Data, ?, R> c10 = iVar.c(cls);
        y2.g gVar = this.G;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar != y2.a.RESOURCE_DISK_CACHE && !iVar.f133r) {
                z10 = false;
            } else {
                z10 = true;
            }
            y2.f<Boolean> fVar = h3.m.f28710i;
            Boolean bool = (Boolean) gVar.c(fVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                gVar = new y2.g();
                t3.b bVar = this.G.f36567b;
                t3.b bVar2 = gVar.f36567b;
                bVar2.i(bVar);
                bVar2.put(fVar, Boolean.valueOf(z10));
            }
        }
        y2.g gVar2 = gVar;
        com.bumptech.glide.load.data.e f = this.f140z.a().f(data);
        try {
            return c10.a(this.D, this.E, gVar2, f, new b(aVar));
        } finally {
            f.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [a3.x] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a3.j<R>, a3.j] */
    public final void g() {
        w wVar;
        boolean z10;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Retrieved data", "data: " + this.R + ", cache key: " + this.P + ", fetcher: " + this.T, this.L);
        }
        w wVar2 = null;
        try {
            wVar = e(this.T, this.R, this.S);
        } catch (t e10) {
            y2.e eVar = this.Q;
            y2.a aVar = this.S;
            e10.f210t = eVar;
            e10.f211u = aVar;
            e10.f212v = null;
            this.f135t.add(e10);
            wVar = null;
        }
        if (wVar != null) {
            y2.a aVar2 = this.S;
            boolean z11 = this.X;
            if (wVar instanceof u) {
                ((u) wVar).initialize();
            }
            boolean z12 = false;
            if (this.f139x.f145c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                wVar2 = (w) w.f219w.b();
                androidx.activity.n.n0(wVar2);
                wVar2.f223v = false;
                wVar2.f222u = true;
                wVar2.f221t = wVar;
                wVar = wVar2;
            }
            k(wVar, aVar2, z11);
            this.J = 5;
            try {
                c<?> cVar = this.f139x;
                if (cVar.f145c != null) {
                    z12 = true;
                }
                if (z12) {
                    d dVar = this.f137v;
                    y2.g gVar = this.G;
                    cVar.getClass();
                    try {
                        ((o.c) dVar).a().c(cVar.f143a, new g(cVar.f144b, cVar.f145c, gVar));
                        cVar.f145c.d();
                    } catch (Throwable th) {
                        cVar.f145c.d();
                        throw th;
                    }
                }
                e eVar2 = this.y;
                synchronized (eVar2) {
                    eVar2.f147b = true;
                    a10 = eVar2.a();
                }
                if (a10) {
                    m();
                    return;
                }
                return;
            } finally {
                if (wVar2 != null) {
                    wVar2.d();
                }
            }
        }
        o();
    }

    public final h h() {
        int c10 = s.f.c(this.J);
        i<R> iVar = this.f134s;
        if (c10 != 1) {
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 == 5) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: ".concat(l.E(this.J)));
                }
                return new c0(iVar, this);
            }
            return new a3.e(iVar.a(), iVar, this);
        }
        return new y(iVar, this);
    }

    public final int i(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3 || i11 == 5) {
                            return 6;
                        }
                        throw new IllegalArgumentException("Unrecognized stage: ".concat(l.E(i10)));
                    }
                    if (this.M) {
                        return 6;
                    }
                    return 4;
                }
                if (this.F.a()) {
                    return 3;
                }
                return i(3);
            }
            if (this.F.b()) {
                return 2;
            }
            return i(2);
        }
        throw null;
    }

    public final void j(String str, String str2, long j10) {
        String str3;
        StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, " in ");
        l10.append(t3.h.a(j10));
        l10.append(", load key: ");
        l10.append(this.C);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = "";
        }
        l10.append(str3);
        l10.append(", thread: ");
        l10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", l10.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(x<R> xVar, y2.a aVar, boolean z10) {
        Object obj;
        q();
        p pVar = (p) this.H;
        synchronized (pVar) {
            pVar.I = xVar;
            pVar.J = aVar;
            pVar.Q = z10;
        }
        synchronized (pVar) {
            pVar.f181t.a();
            if (pVar.P) {
                pVar.I.a();
                pVar.g();
                return;
            }
            if (!pVar.f180s.f193s.isEmpty()) {
                if (!pVar.K) {
                    p.c cVar = pVar.f184w;
                    x<?> xVar2 = pVar.I;
                    boolean z11 = pVar.E;
                    y2.e eVar = pVar.D;
                    s.a aVar2 = pVar.f182u;
                    cVar.getClass();
                    pVar.N = new s<>(xVar2, z11, true, eVar, aVar2);
                    pVar.K = true;
                    p.e eVar2 = pVar.f180s;
                    eVar2.getClass();
                    ArrayList<p.d> arrayList = new ArrayList(eVar2.f193s);
                    pVar.e(arrayList.size() + 1);
                    y2.e eVar3 = pVar.D;
                    s<?> sVar = pVar.N;
                    o oVar = (o) pVar.f185x;
                    synchronized (oVar) {
                        if (sVar != null) {
                            if (sVar.f202s) {
                                oVar.f163g.a(eVar3, sVar);
                            }
                        }
                        j1.a aVar3 = oVar.f158a;
                        aVar3.getClass();
                        if (pVar.H) {
                            obj = aVar3.f29569u;
                        } else {
                            obj = aVar3.f29568t;
                        }
                        Map map = (Map) obj;
                        if (pVar.equals(map.get(eVar3))) {
                            map.remove(eVar3);
                        }
                    }
                    for (p.d dVar : arrayList) {
                        dVar.f192b.execute(new p.b(dVar.f191a));
                    }
                    pVar.d();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            }
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
    }

    public final void l() {
        Object obj;
        boolean a10;
        q();
        t tVar = new t("Failed to load resource", new ArrayList(this.f135t));
        p pVar = (p) this.H;
        synchronized (pVar) {
            pVar.L = tVar;
        }
        synchronized (pVar) {
            pVar.f181t.a();
            if (pVar.P) {
                pVar.g();
            } else if (!pVar.f180s.f193s.isEmpty()) {
                if (!pVar.M) {
                    pVar.M = true;
                    y2.e eVar = pVar.D;
                    p.e eVar2 = pVar.f180s;
                    eVar2.getClass();
                    ArrayList<p.d> arrayList = new ArrayList(eVar2.f193s);
                    pVar.e(arrayList.size() + 1);
                    o oVar = (o) pVar.f185x;
                    synchronized (oVar) {
                        j1.a aVar = oVar.f158a;
                        aVar.getClass();
                        if (pVar.H) {
                            obj = aVar.f29569u;
                        } else {
                            obj = aVar.f29568t;
                        }
                        Map map = (Map) obj;
                        if (pVar.equals(map.get(eVar))) {
                            map.remove(eVar);
                        }
                    }
                    for (p.d dVar : arrayList) {
                        dVar.f192b.execute(new p.a(dVar.f191a));
                    }
                    pVar.d();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        e eVar3 = this.y;
        synchronized (eVar3) {
            eVar3.f148c = true;
            a10 = eVar3.a();
        }
        if (a10) {
            m();
        }
    }

    public final void m() {
        e eVar = this.y;
        synchronized (eVar) {
            eVar.f147b = false;
            eVar.f146a = false;
            eVar.f148c = false;
        }
        c<?> cVar = this.f139x;
        cVar.f143a = null;
        cVar.f144b = null;
        cVar.f145c = null;
        i<R> iVar = this.f134s;
        iVar.f120c = null;
        iVar.f121d = null;
        iVar.f130n = null;
        iVar.f123g = null;
        iVar.f127k = null;
        iVar.f125i = null;
        iVar.o = null;
        iVar.f126j = null;
        iVar.f131p = null;
        iVar.f118a.clear();
        iVar.f128l = false;
        iVar.f119b.clear();
        iVar.f129m = false;
        this.V = false;
        this.f140z = null;
        this.A = null;
        this.G = null;
        this.B = null;
        this.C = null;
        this.H = null;
        this.J = 0;
        this.U = null;
        this.O = null;
        this.P = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.L = 0L;
        this.W = false;
        this.N = null;
        this.f135t.clear();
        this.f138w.a(this);
    }

    public final void n(int i10) {
        d3.a aVar;
        this.K = i10;
        p pVar = (p) this.H;
        if (pVar.F) {
            aVar = pVar.A;
        } else if (pVar.G) {
            aVar = pVar.B;
        } else {
            aVar = pVar.f186z;
        }
        aVar.execute(this);
    }

    public final void o() {
        this.O = Thread.currentThread();
        int i10 = t3.h.f35419b;
        this.L = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.W && this.U != null && !(z10 = this.U.b())) {
            this.J = i(this.J);
            this.U = h();
            if (this.J == 4) {
                n(2);
                return;
            }
        }
        if ((this.J == 6 || this.W) && !z10) {
            l();
        }
    }

    public final void p() {
        int c10 = s.f.c(this.K);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    g();
                    return;
                }
                throw new IllegalStateException("Unrecognized run reason: ".concat(k.A(this.K)));
            }
            o();
            return;
        }
        this.J = i(1);
        this.U = h();
        o();
    }

    public final void q() {
        Throwable th;
        this.f136u.a();
        if (this.V) {
            if (this.f135t.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f135t;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.V = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.T;
        try {
            try {
                if (this.W) {
                    l();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                p();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th;
            }
        } catch (a3.d e10) {
            throw e10;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.W + ", stage: " + l.E(this.J), th2);
            }
            if (this.J != 5) {
                this.f135t.add(th2);
                l();
            }
            if (!this.W) {
                throw th2;
            }
            throw th2;
        }
    }
}
