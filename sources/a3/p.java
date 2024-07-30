package a3;

import a3.j;
import a3.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import u3.a;
import u3.d;

/* compiled from: EngineJob.java */
/* loaded from: classes.dex */
public final class p<R> implements j.a<R>, a.d {
    public static final c R = new c();
    public final d3.a A;
    public final d3.a B;
    public final AtomicInteger C;
    public y2.e D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public x<?> I;
    public y2.a J;
    public boolean K;
    public t L;
    public boolean M;
    public s<?> N;
    public j<R> O;
    public volatile boolean P;
    public boolean Q;

    /* renamed from: s, reason: collision with root package name */
    public final e f180s;

    /* renamed from: t, reason: collision with root package name */
    public final d.a f181t;

    /* renamed from: u, reason: collision with root package name */
    public final s.a f182u;

    /* renamed from: v, reason: collision with root package name */
    public final m0.d<p<?>> f183v;

    /* renamed from: w, reason: collision with root package name */
    public final c f184w;

    /* renamed from: x, reason: collision with root package name */
    public final q f185x;
    public final d3.a y;

    /* renamed from: z, reason: collision with root package name */
    public final d3.a f186z;

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final p3.h f187s;

        public a(p3.h hVar) {
            this.f187s = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p3.i iVar = (p3.i) this.f187s;
            iVar.f34251b.a();
            synchronized (iVar.f34252c) {
                synchronized (p.this) {
                    e eVar = p.this.f180s;
                    p3.h hVar = this.f187s;
                    eVar.getClass();
                    if (eVar.f193s.contains(new d(hVar, t3.e.f35415b))) {
                        p pVar = p.this;
                        p3.h hVar2 = this.f187s;
                        pVar.getClass();
                        try {
                            ((p3.i) hVar2).l(pVar.L, 5);
                        } catch (Throwable th) {
                            throw new a3.d(th);
                        }
                    }
                    p.this.d();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final p3.h f189s;

        public b(p3.h hVar) {
            this.f189s = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p3.i iVar = (p3.i) this.f189s;
            iVar.f34251b.a();
            synchronized (iVar.f34252c) {
                synchronized (p.this) {
                    e eVar = p.this.f180s;
                    p3.h hVar = this.f189s;
                    eVar.getClass();
                    if (eVar.f193s.contains(new d(hVar, t3.e.f35415b))) {
                        p.this.N.b();
                        p pVar = p.this;
                        p3.h hVar2 = this.f189s;
                        pVar.getClass();
                        try {
                            ((p3.i) hVar2).n(pVar.N, pVar.J, pVar.Q);
                            p.this.h(this.f189s);
                        } catch (Throwable th) {
                            throw new a3.d(th);
                        }
                    }
                    p.this.d();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final p3.h f191a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f192b;

        public d(p3.h hVar, Executor executor) {
            this.f191a = hVar;
            this.f192b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f191a.equals(((d) obj).f191a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f191a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: s, reason: collision with root package name */
        public final List<d> f193s;

        public e(ArrayList arrayList) {
            this.f193s = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.f193s.iterator();
        }
    }

    public p() {
        throw null;
    }

    public p(d3.a aVar, d3.a aVar2, d3.a aVar3, d3.a aVar4, q qVar, s.a aVar5, a.c cVar) {
        c cVar2 = R;
        this.f180s = new e(new ArrayList(2));
        this.f181t = new d.a();
        this.C = new AtomicInteger();
        this.y = aVar;
        this.f186z = aVar2;
        this.A = aVar3;
        this.B = aVar4;
        this.f185x = qVar;
        this.f182u = aVar5;
        this.f183v = cVar;
        this.f184w = cVar2;
    }

    public final synchronized void a(p3.h hVar, Executor executor) {
        this.f181t.a();
        e eVar = this.f180s;
        eVar.getClass();
        eVar.f193s.add(new d(hVar, executor));
        boolean z10 = true;
        if (this.K) {
            e(1);
            executor.execute(new b(hVar));
        } else if (this.M) {
            e(1);
            executor.execute(new a(hVar));
        } else {
            if (this.P) {
                z10 = false;
            }
            androidx.activity.n.m0("Cannot add callbacks to a cancelled EngineJob", z10);
        }
    }

    @Override // u3.a.d
    public final d.a b() {
        return this.f181t;
    }

    public final void c() {
        Object obj;
        if (f()) {
            return;
        }
        this.P = true;
        j<R> jVar = this.O;
        jVar.W = true;
        h hVar = jVar.U;
        if (hVar != null) {
            hVar.cancel();
        }
        q qVar = this.f185x;
        y2.e eVar = this.D;
        o oVar = (o) qVar;
        synchronized (oVar) {
            j1.a aVar = oVar.f158a;
            aVar.getClass();
            if (this.H) {
                obj = aVar.f29569u;
            } else {
                obj = aVar.f29568t;
            }
            Map map = (Map) obj;
            if (equals(map.get(eVar))) {
                map.remove(eVar);
            }
        }
    }

    public final void d() {
        boolean z10;
        s<?> sVar;
        synchronized (this) {
            this.f181t.a();
            androidx.activity.n.m0("Not yet complete!", f());
            int decrementAndGet = this.C.decrementAndGet();
            if (decrementAndGet >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            androidx.activity.n.m0("Can't decrement below 0", z10);
            if (decrementAndGet == 0) {
                sVar = this.N;
                g();
            } else {
                sVar = null;
            }
        }
        if (sVar != null) {
            sVar.d();
        }
    }

    public final synchronized void e(int i10) {
        s<?> sVar;
        androidx.activity.n.m0("Not yet complete!", f());
        if (this.C.getAndAdd(i10) == 0 && (sVar = this.N) != null) {
            sVar.b();
        }
    }

    public final boolean f() {
        if (!this.M && !this.K && !this.P) {
            return false;
        }
        return true;
    }

    public final synchronized void g() {
        boolean a10;
        if (this.D != null) {
            this.f180s.f193s.clear();
            this.D = null;
            this.N = null;
            this.I = null;
            this.M = false;
            this.P = false;
            this.K = false;
            this.Q = false;
            j<R> jVar = this.O;
            j.e eVar = jVar.y;
            synchronized (eVar) {
                eVar.f146a = true;
                a10 = eVar.a();
            }
            if (a10) {
                jVar.m();
            }
            this.O = null;
            this.L = null;
            this.J = null;
            this.f183v.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void h(p3.h hVar) {
        boolean z10;
        this.f181t.a();
        e eVar = this.f180s;
        eVar.f193s.remove(new d(hVar, t3.e.f35415b));
        if (this.f180s.f193s.isEmpty()) {
            c();
            if (!this.K && !this.M) {
                z10 = false;
                if (z10 && this.C.get() == 0) {
                    g();
                }
            }
            z10 = true;
            if (z10) {
                g();
            }
        }
    }
}
