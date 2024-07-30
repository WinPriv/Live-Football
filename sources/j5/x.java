package j5;

import android.os.Handler;
import j5.u;
import j5.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.w0;

/* compiled from: MediaSourceEventListener.java */
/* loaded from: classes2.dex */
public interface x {

    /* compiled from: MediaSourceEventListener.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f29851a;

        /* renamed from: b, reason: collision with root package name */
        public final u.b f29852b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0406a> f29853c;

        /* renamed from: d, reason: collision with root package name */
        public final long f29854d;

        /* compiled from: MediaSourceEventListener.java */
        /* renamed from: j5.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0406a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f29855a;

            /* renamed from: b, reason: collision with root package name */
            public final x f29856b;

            public C0406a(Handler handler, x xVar) {
                this.f29855a = handler;
                this.f29856b = xVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public final long a(long j10) {
            long S = d6.g0.S(j10);
            if (S == com.anythink.expressad.exoplayer.b.f7291b) {
                return com.anythink.expressad.exoplayer.b.f7291b;
            }
            return this.f29854d + S;
        }

        public final void b(int i10, k4.i0 i0Var, int i11, Object obj, long j10) {
            c(new r(1, i10, i0Var, i11, obj, a(j10), com.anythink.expressad.exoplayer.b.f7291b));
        }

        public final void c(r rVar) {
            Iterator<C0406a> it = this.f29853c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                d6.g0.N(next.f29855a, new w0(this, next.f29856b, rVar, 1));
            }
        }

        public final void d(o oVar, int i10) {
            e(oVar, i10, -1, null, 0, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b);
        }

        public final void e(o oVar, int i10, int i11, k4.i0 i0Var, int i12, Object obj, long j10, long j11) {
            f(oVar, new r(i10, i11, i0Var, i12, obj, a(j10), a(j11)));
        }

        public final void f(o oVar, r rVar) {
            Iterator<C0406a> it = this.f29853c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                d6.g0.N(next.f29855a, new v(this, next.f29856b, oVar, rVar, 1));
            }
        }

        public final void g(o oVar, int i10) {
            h(oVar, i10, -1, null, 0, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b);
        }

        public final void h(o oVar, int i10, int i11, k4.i0 i0Var, int i12, Object obj, long j10, long j11) {
            i(oVar, new r(i10, i11, i0Var, i12, obj, a(j10), a(j11)));
        }

        public final void i(o oVar, r rVar) {
            Iterator<C0406a> it = this.f29853c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                d6.g0.N(next.f29855a, new com.applovin.exoplayer2.h.g0(this, next.f29856b, oVar, rVar, 2));
            }
        }

        public final void j(o oVar, int i10, int i11, k4.i0 i0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            l(oVar, new r(i10, i11, i0Var, i12, obj, a(j10), a(j11)), iOException, z10);
        }

        public final void k(o oVar, int i10, IOException iOException, boolean z10) {
            j(oVar, i10, -1, null, 0, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, iOException, z10);
        }

        public final void l(final o oVar, final r rVar, final IOException iOException, final boolean z10) {
            Iterator<C0406a> it = this.f29853c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                final x xVar = next.f29856b;
                d6.g0.N(next.f29855a, new Runnable() { // from class: j5.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        x xVar2 = xVar;
                        o oVar2 = oVar;
                        r rVar2 = rVar;
                        IOException iOException2 = iOException;
                        boolean z11 = z10;
                        x.a aVar = x.a.this;
                        xVar2.E(aVar.f29851a, aVar.f29852b, oVar2, rVar2, iOException2, z11);
                    }
                });
            }
        }

        public final void m(o oVar, int i10) {
            n(oVar, i10, -1, null, 0, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b);
        }

        public final void n(o oVar, int i10, int i11, k4.i0 i0Var, int i12, Object obj, long j10, long j11) {
            o(oVar, new r(i10, i11, i0Var, i12, obj, a(j10), a(j11)));
        }

        public final void o(o oVar, r rVar) {
            Iterator<C0406a> it = this.f29853c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                d6.g0.N(next.f29855a, new v(this, next.f29856b, oVar, rVar, 0));
            }
        }

        public final void p(r rVar) {
            u.b bVar = this.f29852b;
            bVar.getClass();
            Iterator<C0406a> it = this.f29853c.iterator();
            while (it.hasNext()) {
                C0406a next = it.next();
                d6.g0.N(next.f29855a, new com.applovin.exoplayer2.h.e0(this, next.f29856b, bVar, rVar, 1));
            }
        }

        public a(CopyOnWriteArrayList<C0406a> copyOnWriteArrayList, int i10, u.b bVar, long j10) {
            this.f29853c = copyOnWriteArrayList;
            this.f29851a = i10;
            this.f29852b = bVar;
            this.f29854d = j10;
        }
    }

    default void O(int i10, u.b bVar, r rVar) {
    }

    default void h0(int i10, u.b bVar, r rVar) {
    }

    default void V(int i10, u.b bVar, o oVar, r rVar) {
    }

    default void W(int i10, u.b bVar, o oVar, r rVar) {
    }

    default void z(int i10, u.b bVar, o oVar, r rVar) {
    }

    default void E(int i10, u.b bVar, o oVar, r rVar, IOException iOException, boolean z10) {
    }
}
