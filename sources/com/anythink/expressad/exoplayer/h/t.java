package com.anythink.expressad.exoplayer.h;

import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.exoplayer.h.s;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface t {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8488a;

        /* renamed from: b, reason: collision with root package name */
        public final s.a f8489b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0109a> f8490c;

        /* renamed from: d, reason: collision with root package name */
        private final long f8491d;

        /* renamed from: com.anythink.expressad.exoplayer.h.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0109a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f8521a;

            /* renamed from: b, reason: collision with root package name */
            public final t f8522b;

            public C0109a(Handler handler, t tVar) {
                this.f8521a = handler;
                this.f8522b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public final a a(int i10, s.a aVar, long j10) {
            return new a(this.f8490c, i10, aVar, j10);
        }

        public final void b() {
            com.anythink.expressad.exoplayer.k.a.b(this.f8489b != null);
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                final t tVar = next.f8522b;
                a(next.f8521a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f8488a, aVar.f8489b);
                    }
                });
            }
        }

        public final void c(final b bVar, final c cVar) {
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                final t tVar = next.f8522b;
                a(next.f8521a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.c(aVar.f8488a, aVar.f8489b, bVar, cVar);
                    }
                });
            }
        }

        private a(CopyOnWriteArrayList<C0109a> copyOnWriteArrayList, int i10, s.a aVar, long j10) {
            this.f8490c = copyOnWriteArrayList;
            this.f8488a = i10;
            this.f8489b = aVar;
            this.f8491d = j10;
        }

        public final void a(Handler handler, t tVar) {
            com.anythink.expressad.exoplayer.k.a.a((handler == null || tVar == null) ? false : true);
            this.f8490c.add(new C0109a(handler, tVar));
        }

        public final void a(t tVar) {
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                if (next.f8522b == tVar) {
                    this.f8490c.remove(next);
                }
            }
        }

        public final void c() {
            com.anythink.expressad.exoplayer.k.a.b(this.f8489b != null);
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                final t tVar = next.f8522b;
                a(next.f8521a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.c(aVar.f8488a, aVar.f8489b);
                    }
                });
            }
        }

        public final void b(final b bVar, final c cVar) {
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                final t tVar = next.f8522b;
                a(next.f8521a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f8488a, aVar.f8489b, bVar, cVar);
                    }
                });
            }
        }

        public final void a() {
            com.anythink.expressad.exoplayer.k.a.b(this.f8489b != null);
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                final t tVar = next.f8522b;
                a(next.f8521a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f8488a, aVar.f8489b);
                    }
                });
            }
        }

        private void b(com.anythink.expressad.exoplayer.j.k kVar, int i10, long j10, long j11, long j12) {
            b(kVar, i10, -1, null, 0, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, j10, j11, j12);
        }

        public final void b(com.anythink.expressad.exoplayer.j.k kVar, int i10, int i11, com.anythink.expressad.exoplayer.m mVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
            c(new b(kVar, j12, j13, j14), new c(i10, i11, mVar, i12, obj, a(j10), a(j11)));
        }

        private void a(com.anythink.expressad.exoplayer.j.k kVar, int i10, long j10) {
            a(kVar, i10, -1, null, 0, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, j10);
        }

        public final void a(com.anythink.expressad.exoplayer.j.k kVar, int i10, int i11, com.anythink.expressad.exoplayer.m mVar, int i12, Object obj, long j10, long j11, long j12) {
            a(new b(kVar, j12, 0L, 0L), new c(i10, i11, mVar, i12, obj, a(j10), a(j11)));
        }

        public final void b(final c cVar) {
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                final t tVar = next.f8522b;
                a(next.f8521a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f8488a, aVar.f8489b, cVar);
                    }
                });
            }
        }

        public final void a(final b bVar, final c cVar) {
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                final t tVar = next.f8522b;
                a(next.f8521a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f8488a, aVar.f8489b, bVar, cVar);
                    }
                });
            }
        }

        private void a(com.anythink.expressad.exoplayer.j.k kVar, int i10, long j10, long j11, long j12) {
            a(kVar, i10, -1, null, 0, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, j10, j11, j12);
        }

        public final void a(com.anythink.expressad.exoplayer.j.k kVar, int i10, int i11, com.anythink.expressad.exoplayer.m mVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
            b(new b(kVar, j12, j13, j14), new c(i10, i11, mVar, i12, obj, a(j10), a(j11)));
        }

        public final void a(com.anythink.expressad.exoplayer.j.k kVar, IOException iOException) {
            a(kVar, 6, -1, null, 0, null, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b, -1L, 0L, 0L, iOException, true);
        }

        public final void a(com.anythink.expressad.exoplayer.j.k kVar, int i10, int i11, com.anythink.expressad.exoplayer.m mVar, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
            a(new b(kVar, j12, j13, j14), new c(i10, i11, mVar, i12, obj, a(j10), a(j11)), iOException, z10);
        }

        public final void a(final b bVar, final c cVar, final IOException iOException, final boolean z10) {
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                final t tVar = next.f8522b;
                a(next.f8521a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f8488a, aVar.f8489b, bVar, cVar, iOException, z10);
                    }
                });
            }
        }

        public final void a(int i10, long j10, long j11) {
            a(new c(1, i10, null, 3, null, a(j10), a(j11)));
        }

        public final void a(final c cVar) {
            Iterator<C0109a> it = this.f8490c.iterator();
            while (it.hasNext()) {
                C0109a next = it.next();
                final t tVar = next.f8522b;
                a(next.f8521a, new Runnable() { // from class: com.anythink.expressad.exoplayer.h.t.a.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f8488a, aVar.f8489b, cVar);
                    }
                });
            }
        }

        public final void a(int i10, com.anythink.expressad.exoplayer.m mVar, int i11, Object obj, long j10) {
            b(new c(1, i10, mVar, i11, obj, a(j10), com.anythink.expressad.exoplayer.b.f7291b));
        }

        private long a(long j10) {
            long a10 = com.anythink.expressad.exoplayer.b.a(j10);
            return a10 == com.anythink.expressad.exoplayer.b.f7291b ? com.anythink.expressad.exoplayer.b.f7291b : this.f8491d + a10;
        }

        private static void a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.expressad.exoplayer.j.k f8523a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8524b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8525c;

        /* renamed from: d, reason: collision with root package name */
        public final long f8526d;

        public b(com.anythink.expressad.exoplayer.j.k kVar, long j10, long j11, long j12) {
            this.f8523a = kVar;
            this.f8524b = j10;
            this.f8525c = j11;
            this.f8526d = j12;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f8527a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8528b;

        /* renamed from: c, reason: collision with root package name */
        public final com.anythink.expressad.exoplayer.m f8529c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8530d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f8531e;
        public final long f;

        /* renamed from: g, reason: collision with root package name */
        public final long f8532g;

        public c(int i10, int i11, com.anythink.expressad.exoplayer.m mVar, int i12, Object obj, long j10, long j11) {
            this.f8527a = i10;
            this.f8528b = i11;
            this.f8529c = mVar;
            this.f8530d = i12;
            this.f8531e = obj;
            this.f = j10;
            this.f8532g = j11;
        }
    }

    void a(int i10, s.a aVar);

    void a(int i10, s.a aVar, b bVar, c cVar);

    void a(int i10, s.a aVar, b bVar, c cVar, IOException iOException, boolean z10);

    void a(int i10, s.a aVar, c cVar);

    void b(int i10, s.a aVar);

    void b(int i10, s.a aVar, b bVar, c cVar);

    void b(int i10, s.a aVar, c cVar);

    void c(int i10, s.a aVar);

    void c(int i10, s.a aVar, b bVar, c cVar);
}
