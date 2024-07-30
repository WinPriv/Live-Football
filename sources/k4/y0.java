package k4;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import j5.h0;
import j5.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaSourceList.java */
/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final l4.w f30834a;

    /* renamed from: e, reason: collision with root package name */
    public final d f30838e;

    /* renamed from: h, reason: collision with root package name */
    public final l4.a f30840h;

    /* renamed from: i, reason: collision with root package name */
    public final d6.m f30841i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30843k;

    /* renamed from: l, reason: collision with root package name */
    public c6.h0 f30844l;

    /* renamed from: j, reason: collision with root package name */
    public j5.h0 f30842j = new h0.a();

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<j5.s, c> f30836c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f30837d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f30835b = new ArrayList();
    public final HashMap<c, b> f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f30839g = new HashSet();

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes2.dex */
    public final class a implements j5.x, com.google.android.exoplayer2.drm.e {

        /* renamed from: s, reason: collision with root package name */
        public final c f30845s;

        public a(c cVar) {
            this.f30845s = cVar;
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void A(int i10, u.b bVar) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new x0(this, a10, 1));
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void B(int i10, u.b bVar) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new com.applovin.exoplayer2.b.e0(4, this, a10));
            }
        }

        @Override // j5.x
        public final void E(int i10, u.b bVar, final j5.o oVar, final j5.r rVar, final IOException iOException, final boolean z10) {
            final Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new Runnable() { // from class: k4.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j5.o oVar2 = oVar;
                        j5.r rVar2 = rVar;
                        IOException iOException2 = iOException;
                        boolean z11 = z10;
                        l4.a aVar = y0.this.f30840h;
                        Pair pair = a10;
                        aVar.E(((Integer) pair.first).intValue(), (u.b) pair.second, oVar2, rVar2, iOException2, z11);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void I(int i10, u.b bVar) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new androidx.appcompat.app.p(5, this, a10));
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void K(int i10, u.b bVar, int i11) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new com.applovin.exoplayer2.d.c0(i11, this, a10, 1));
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void N(int i10, u.b bVar, Exception exc) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new androidx.emoji2.text.g(this, a10, exc, 3));
            }
        }

        @Override // j5.x
        public final void O(int i10, u.b bVar, j5.r rVar) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new com.applovin.exoplayer2.h.f0(this, a10, rVar, 2));
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void P(int i10, u.b bVar) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new x0(this, a10, 0));
            }
        }

        @Override // j5.x
        public final void V(int i10, u.b bVar, j5.o oVar, j5.r rVar) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new u0(this, a10, oVar, rVar, 1));
            }
        }

        @Override // j5.x
        public final void W(int i10, u.b bVar, j5.o oVar, j5.r rVar) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new com.applovin.exoplayer2.h.g0(this, a10, oVar, rVar, 1));
            }
        }

        public final Pair<Integer, u.b> a(int i10, u.b bVar) {
            u.b bVar2;
            c cVar = this.f30845s;
            u.b bVar3 = null;
            if (bVar != null) {
                int i11 = 0;
                while (true) {
                    if (i11 < cVar.f30852c.size()) {
                        if (((u.b) cVar.f30852c.get(i11)).f29838d == bVar.f29838d) {
                            Object obj = cVar.f30851b;
                            int i12 = k4.a.f30313w;
                            bVar2 = bVar.b(Pair.create(obj, bVar.f29835a));
                            break;
                        }
                        i11++;
                    } else {
                        bVar2 = null;
                        break;
                    }
                }
                if (bVar2 == null) {
                    return null;
                }
                bVar3 = bVar2;
            }
            return Pair.create(Integer.valueOf(i10 + cVar.f30853d), bVar3);
        }

        @Override // j5.x
        public final void h0(int i10, u.b bVar, j5.r rVar) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new w0(this, a10, rVar, 0));
            }
        }

        @Override // j5.x
        public final void z(int i10, u.b bVar, j5.o oVar, j5.r rVar) {
            Pair<Integer, u.b> a10 = a(i10, bVar);
            if (a10 != null) {
                y0.this.f30841i.c(new u0(this, a10, oVar, rVar, 0));
            }
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final j5.u f30847a;

        /* renamed from: b, reason: collision with root package name */
        public final u.c f30848b;

        /* renamed from: c, reason: collision with root package name */
        public final a f30849c;

        public b(j5.q qVar, t0 t0Var, a aVar) {
            this.f30847a = qVar;
            this.f30848b = t0Var;
            this.f30849c = aVar;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes2.dex */
    public static final class c implements s0 {

        /* renamed from: a, reason: collision with root package name */
        public final j5.q f30850a;

        /* renamed from: d, reason: collision with root package name */
        public int f30853d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f30854e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f30852c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f30851b = new Object();

        public c(j5.u uVar, boolean z10) {
            this.f30850a = new j5.q(uVar, z10);
        }

        @Override // k4.s0
        public final Object a() {
            return this.f30851b;
        }

        @Override // k4.s0
        public final q1 b() {
            return this.f30850a.G;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes2.dex */
    public interface d {
    }

    public y0(d dVar, l4.a aVar, d6.m mVar, l4.w wVar) {
        this.f30834a = wVar;
        this.f30838e = dVar;
        this.f30840h = aVar;
        this.f30841i = mVar;
    }

    public final q1 a(int i10, List<c> list, j5.h0 h0Var) {
        if (!list.isEmpty()) {
            this.f30842j = h0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                ArrayList arrayList = this.f30835b;
                if (i11 > 0) {
                    c cVar2 = (c) arrayList.get(i11 - 1);
                    cVar.f30853d = cVar2.f30850a.G.o() + cVar2.f30853d;
                    cVar.f30854e = false;
                    cVar.f30852c.clear();
                } else {
                    cVar.f30853d = 0;
                    cVar.f30854e = false;
                    cVar.f30852c.clear();
                }
                int o = cVar.f30850a.G.o();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((c) arrayList.get(i12)).f30853d += o;
                }
                arrayList.add(i11, cVar);
                this.f30837d.put(cVar.f30851b, cVar);
                if (this.f30843k) {
                    e(cVar);
                    if (this.f30836c.isEmpty()) {
                        this.f30839g.add(cVar);
                    } else {
                        b bVar = this.f.get(cVar);
                        if (bVar != null) {
                            bVar.f30847a.b(bVar.f30848b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final q1 b() {
        ArrayList arrayList = this.f30835b;
        if (arrayList.isEmpty()) {
            return q1.f30752s;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c cVar = (c) arrayList.get(i11);
            cVar.f30853d = i10;
            i10 += cVar.f30850a.G.o();
        }
        return new g1(arrayList, this.f30842j);
    }

    public final void c() {
        Iterator it = this.f30839g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f30852c.isEmpty()) {
                b bVar = this.f.get(cVar);
                if (bVar != null) {
                    bVar.f30847a.b(bVar.f30848b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.f30854e && cVar.f30852c.isEmpty()) {
            b remove = this.f.remove(cVar);
            remove.getClass();
            u.c cVar2 = remove.f30848b;
            j5.u uVar = remove.f30847a;
            uVar.f(cVar2);
            a aVar = remove.f30849c;
            uVar.o(aVar);
            uVar.h(aVar);
            this.f30839g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [j5.u$c, k4.t0] */
    public final void e(c cVar) {
        j5.q qVar = cVar.f30850a;
        ?? r12 = new u.c() { // from class: k4.t0
            @Override // j5.u.c
            public final void a(j5.u uVar, q1 q1Var) {
                ((f0) y0.this.f30838e).f30436z.g(22);
            }
        };
        a aVar = new a(cVar);
        this.f.put(cVar, new b(qVar, r12, aVar));
        int i10 = d6.g0.f27302a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        qVar.a(new Handler(myLooper, null), aVar);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        qVar.e(new Handler(myLooper2, null), aVar);
        qVar.l(r12, this.f30844l, this.f30834a);
    }

    public final void f(j5.s sVar) {
        IdentityHashMap<j5.s, c> identityHashMap = this.f30836c;
        c remove = identityHashMap.remove(sVar);
        remove.getClass();
        remove.f30850a.c(sVar);
        remove.f30852c.remove(((j5.p) sVar).f29819s);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(remove);
    }

    public final void g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f30835b;
            c cVar = (c) arrayList.remove(i12);
            this.f30837d.remove(cVar.f30851b);
            int i13 = -cVar.f30850a.G.o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f30853d += i13;
            }
            cVar.f30854e = true;
            if (this.f30843k) {
                d(cVar);
            }
        }
    }
}
