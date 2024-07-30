package com.applovin.exoplayer2.k;

import android.os.Handler;
import com.applovin.exoplayer2.k.d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface d {
    aa a();

    void a(Handler handler, a aVar);

    void a(a aVar);

    /* loaded from: classes.dex */
    public interface a {
        void b(int i10, long j10, long j11);

        /* renamed from: com.applovin.exoplayer2.k.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0184a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0185a> f16072a = new CopyOnWriteArrayList<>();

            /* renamed from: com.applovin.exoplayer2.k.d$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0185a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f16073a;

                /* renamed from: b, reason: collision with root package name */
                private final a f16074b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f16075c;

                public C0185a(Handler handler, a aVar) {
                    this.f16073a = handler;
                    this.f16074b = aVar;
                }

                public void a() {
                    this.f16075c = true;
                }
            }

            public void a(Handler handler, a aVar) {
                com.applovin.exoplayer2.l.a.b(handler);
                com.applovin.exoplayer2.l.a.b(aVar);
                a(aVar);
                this.f16072a.add(new C0185a(handler, aVar));
            }

            public void a(a aVar) {
                Iterator<C0185a> it = this.f16072a.iterator();
                while (it.hasNext()) {
                    C0185a next = it.next();
                    if (next.f16074b == aVar) {
                        next.a();
                        this.f16072a.remove(next);
                    }
                }
            }

            public void a(final int i10, final long j10, final long j11) {
                Iterator<C0185a> it = this.f16072a.iterator();
                while (it.hasNext()) {
                    final C0185a next = it.next();
                    if (!next.f16075c) {
                        next.f16073a.post(new Runnable() { // from class: com.applovin.exoplayer2.k.a0
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0184a.a(d.a.C0184a.C0185a.this, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C0185a c0185a, int i10, long j10, long j11) {
                c0185a.f16074b.b(i10, j10, j11);
            }
        }
    }
}
