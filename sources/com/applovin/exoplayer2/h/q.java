package com.applovin.exoplayer2.h;

import android.os.Handler;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.h.q;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface q {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f15394a;

        /* renamed from: b */
        public final p.a f15395b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0174a> f15396c;

        /* renamed from: d */
        private final long f15397d;

        /* renamed from: com.applovin.exoplayer2.h.q$a$a */
        /* loaded from: classes.dex */
        public static final class C0174a {

            /* renamed from: a */
            public Handler f15398a;

            /* renamed from: b */
            public q f15399b;

            public C0174a(Handler handler, q qVar) {
                this.f15398a = handler;
                this.f15399b = qVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C0174a> copyOnWriteArrayList, int i10, p.a aVar, long j10) {
            this.f15396c = copyOnWriteArrayList;
            this.f15394a = i10;
            this.f15395b = aVar;
            this.f15397d = j10;
        }

        public /* synthetic */ void c(q qVar, j jVar, m mVar) {
            qVar.a(this.f15394a, this.f15395b, jVar, mVar);
        }

        public a a(int i10, p.a aVar, long j10) {
            return new a(this.f15396c, i10, aVar, j10);
        }

        public void b(j jVar, int i10, int i11, com.applovin.exoplayer2.v vVar, int i12, Object obj, long j10, long j11) {
            b(jVar, new m(i10, i11, vVar, i12, obj, a(j10), a(j11)));
        }

        public void a(Handler handler, q qVar) {
            com.applovin.exoplayer2.l.a.b(handler);
            com.applovin.exoplayer2.l.a.b(qVar);
            this.f15396c.add(new C0174a(handler, qVar));
        }

        public void c(j jVar, int i10, int i11, com.applovin.exoplayer2.v vVar, int i12, Object obj, long j10, long j11) {
            c(jVar, new m(i10, i11, vVar, i12, obj, a(j10), a(j11)));
        }

        public void a(q qVar) {
            Iterator<C0174a> it = this.f15396c.iterator();
            while (it.hasNext()) {
                C0174a next = it.next();
                if (next.f15399b == qVar) {
                    this.f15396c.remove(next);
                }
            }
        }

        public void b(j jVar, m mVar) {
            Iterator<C0174a> it = this.f15396c.iterator();
            while (it.hasNext()) {
                C0174a next = it.next();
                ai.a(next.f15398a, (Runnable) new g0(this, next.f15399b, jVar, mVar, 0));
            }
        }

        public void c(j jVar, m mVar) {
            Iterator<C0174a> it = this.f15396c.iterator();
            while (it.hasNext()) {
                C0174a next = it.next();
                ai.a(next.f15398a, (Runnable) new e0(this, next.f15399b, jVar, mVar, 0));
            }
        }

        public /* synthetic */ void b(q qVar, j jVar, m mVar) {
            qVar.b(this.f15394a, this.f15395b, jVar, mVar);
        }

        public void a(j jVar, int i10, int i11, com.applovin.exoplayer2.v vVar, int i12, Object obj, long j10, long j11) {
            a(jVar, new m(i10, i11, vVar, i12, obj, a(j10), a(j11)));
        }

        public void a(j jVar, m mVar) {
            Iterator<C0174a> it = this.f15396c.iterator();
            while (it.hasNext()) {
                C0174a next = it.next();
                ai.a(next.f15398a, (Runnable) new d0(this, next.f15399b, jVar, mVar, 0));
            }
        }

        public /* synthetic */ void a(q qVar, j jVar, m mVar) {
            qVar.c(this.f15394a, this.f15395b, jVar, mVar);
        }

        public void a(j jVar, int i10, int i11, com.applovin.exoplayer2.v vVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            a(jVar, new m(i10, i11, vVar, i12, obj, a(j10), a(j11)), iOException, z10);
        }

        public void a(final j jVar, final m mVar, final IOException iOException, final boolean z10) {
            Iterator<C0174a> it = this.f15396c.iterator();
            while (it.hasNext()) {
                C0174a next = it.next();
                final q qVar = next.f15399b;
                ai.a(next.f15398a, new Runnable() { // from class: com.applovin.exoplayer2.h.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.a.this.a(qVar, jVar, mVar, iOException, z10);
                    }
                });
            }
        }

        public /* synthetic */ void a(q qVar, j jVar, m mVar, IOException iOException, boolean z10) {
            qVar.a(this.f15394a, this.f15395b, jVar, mVar, iOException, z10);
        }

        public void a(int i10, com.applovin.exoplayer2.v vVar, int i11, Object obj, long j10) {
            a(new m(1, i10, vVar, i11, obj, a(j10), com.anythink.expressad.exoplayer.b.f7291b));
        }

        public void a(m mVar) {
            Iterator<C0174a> it = this.f15396c.iterator();
            while (it.hasNext()) {
                C0174a next = it.next();
                ai.a(next.f15398a, (Runnable) new f0(this, next.f15399b, mVar, 0));
            }
        }

        public /* synthetic */ void a(q qVar, m mVar) {
            qVar.a(this.f15394a, this.f15395b, mVar);
        }

        private long a(long j10) {
            long a10 = com.applovin.exoplayer2.h.a(j10);
            return a10 == com.anythink.expressad.exoplayer.b.f7291b ? com.anythink.expressad.exoplayer.b.f7291b : this.f15397d + a10;
        }
    }

    default void a(int i10, p.a aVar, j jVar, m mVar) {
    }

    default void a(int i10, p.a aVar, j jVar, m mVar, IOException iOException, boolean z10) {
    }

    default void a(int i10, p.a aVar, m mVar) {
    }

    default void b(int i10, p.a aVar, j jVar, m mVar) {
    }

    default void c(int i10, p.a aVar, j jVar, m mVar) {
    }
}
