package j5;

import android.os.Handler;
import com.google.android.exoplayer2.drm.e;
import j5.u;
import j5.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import k4.q1;

/* compiled from: CompositeMediaSource.java */
/* loaded from: classes2.dex */
public abstract class g<T> extends j5.a {
    public Handler A;
    public c6.h0 B;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap<T, b<T>> f29743z = new HashMap<>();

    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes2.dex */
    public final class a implements x, com.google.android.exoplayer2.drm.e {

        /* renamed from: s, reason: collision with root package name */
        public final T f29744s;

        /* renamed from: t, reason: collision with root package name */
        public x.a f29745t;

        /* renamed from: u, reason: collision with root package name */
        public e.a f29746u;

        public a(T t10) {
            this.f29745t = g.this.r(null);
            this.f29746u = new e.a(g.this.f29644v.f19979c, 0, null);
            this.f29744s = t10;
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void A(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f29746u.a();
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void B(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f29746u.b();
            }
        }

        @Override // j5.x
        public final void E(int i10, u.b bVar, o oVar, r rVar, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f29745t.l(oVar, h(rVar), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void I(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f29746u.c();
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void K(int i10, u.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f29746u.d(i11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void N(int i10, u.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f29746u.e(exc);
            }
        }

        @Override // j5.x
        public final void O(int i10, u.b bVar, r rVar) {
            if (a(i10, bVar)) {
                this.f29745t.c(h(rVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.e
        public final void P(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f29746u.f();
            }
        }

        @Override // j5.x
        public final void V(int i10, u.b bVar, o oVar, r rVar) {
            if (a(i10, bVar)) {
                this.f29745t.i(oVar, h(rVar));
            }
        }

        @Override // j5.x
        public final void W(int i10, u.b bVar, o oVar, r rVar) {
            if (a(i10, bVar)) {
                this.f29745t.f(oVar, h(rVar));
            }
        }

        public final boolean a(int i10, u.b bVar) {
            u.b bVar2;
            T t10 = this.f29744s;
            g gVar = g.this;
            if (bVar != null) {
                bVar2 = gVar.x(t10, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int z10 = gVar.z(i10, t10);
            x.a aVar = this.f29745t;
            if (aVar.f29851a != z10 || !d6.g0.a(aVar.f29852b, bVar2)) {
                this.f29745t = new x.a(gVar.f29643u.f29853c, z10, bVar2, 0L);
            }
            e.a aVar2 = this.f29746u;
            if (aVar2.f19977a != z10 || !d6.g0.a(aVar2.f19978b, bVar2)) {
                this.f29746u = new e.a(gVar.f29644v.f19979c, z10, bVar2);
                return true;
            }
            return true;
        }

        public final r h(r rVar) {
            long j10 = rVar.f;
            g gVar = g.this;
            T t10 = this.f29744s;
            long y = gVar.y(j10, t10);
            long j11 = rVar.f29834g;
            long y10 = gVar.y(j11, t10);
            if (y == rVar.f && y10 == j11) {
                return rVar;
            }
            return new r(rVar.f29829a, rVar.f29830b, rVar.f29831c, rVar.f29832d, rVar.f29833e, y, y10);
        }

        @Override // j5.x
        public final void h0(int i10, u.b bVar, r rVar) {
            if (a(i10, bVar)) {
                this.f29745t.p(h(rVar));
            }
        }

        @Override // j5.x
        public final void z(int i10, u.b bVar, o oVar, r rVar) {
            if (a(i10, bVar)) {
                this.f29745t.o(oVar, h(rVar));
            }
        }
    }

    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final u f29748a;

        /* renamed from: b, reason: collision with root package name */
        public final u.c f29749b;

        /* renamed from: c, reason: collision with root package name */
        public final g<T>.a f29750c;

        public b(u uVar, f fVar, a aVar) {
            this.f29748a = uVar;
            this.f29749b = fVar;
            this.f29750c = aVar;
        }
    }

    public abstract void A(T t10, u uVar, q1 q1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j5.u$c, j5.f] */
    public final void B(final T t10, u uVar) {
        HashMap<T, b<T>> hashMap = this.f29743z;
        d6.a.a(!hashMap.containsKey(t10));
        ?? r12 = new u.c() { // from class: j5.f
            @Override // j5.u.c
            public final void a(u uVar2, q1 q1Var) {
                g.this.A(t10, uVar2, q1Var);
            }
        };
        a aVar = new a(t10);
        hashMap.put(t10, new b<>(uVar, r12, aVar));
        Handler handler = this.A;
        handler.getClass();
        uVar.a(handler, aVar);
        Handler handler2 = this.A;
        handler2.getClass();
        uVar.e(handler2, aVar);
        c6.h0 h0Var = this.B;
        l4.w wVar = this.y;
        d6.a.e(wVar);
        uVar.l(r12, h0Var, wVar);
        if (!(!this.f29642t.isEmpty())) {
            uVar.b(r12);
        }
    }

    @Override // j5.u
    public void j() throws IOException {
        Iterator<b<T>> it = this.f29743z.values().iterator();
        while (it.hasNext()) {
            it.next().f29748a.j();
        }
    }

    @Override // j5.a
    public final void s() {
        for (b<T> bVar : this.f29743z.values()) {
            bVar.f29748a.b(bVar.f29749b);
        }
    }

    @Override // j5.a
    public final void t() {
        for (b<T> bVar : this.f29743z.values()) {
            bVar.f29748a.i(bVar.f29749b);
        }
    }

    @Override // j5.a
    public void w() {
        HashMap<T, b<T>> hashMap = this.f29743z;
        for (b<T> bVar : hashMap.values()) {
            bVar.f29748a.f(bVar.f29749b);
            u uVar = bVar.f29748a;
            g<T>.a aVar = bVar.f29750c;
            uVar.o(aVar);
            uVar.h(aVar);
        }
        hashMap.clear();
    }

    public abstract u.b x(T t10, u.b bVar);

    public long y(long j10, Object obj) {
        return j10;
    }

    public int z(int i10, Object obj) {
        return i10;
    }
}
