package com.applovin.exoplayer2.d;

import android.os.Handler;
import com.applovin.exoplayer2.h.p;
import com.applovin.exoplayer2.l.ai;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f14030a;

        /* renamed from: b */
        public final p.a f14031b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C0162a> f14032c;

        /* renamed from: com.applovin.exoplayer2.d.g$a$a */
        /* loaded from: classes.dex */
        public static final class C0162a {

            /* renamed from: a */
            public Handler f14033a;

            /* renamed from: b */
            public g f14034b;

            public C0162a(Handler handler, g gVar) {
                this.f14033a = handler;
                this.f14034b = gVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0162a> copyOnWriteArrayList, int i10, p.a aVar) {
            this.f14032c = copyOnWriteArrayList;
            this.f14030a = i10;
            this.f14031b = aVar;
        }

        public /* synthetic */ void d(g gVar) {
            gVar.b(this.f14030a, this.f14031b);
        }

        public /* synthetic */ void e(g gVar) {
            gVar.a(this.f14030a, this.f14031b);
        }

        public a a(int i10, p.a aVar) {
            return new a(this.f14032c, i10, aVar);
        }

        public void b() {
            Iterator<C0162a> it = this.f14032c.iterator();
            while (it.hasNext()) {
                C0162a next = it.next();
                ai.a(next.f14033a, (Runnable) new b0(this, next.f14034b, 0));
            }
        }

        public void c() {
            Iterator<C0162a> it = this.f14032c.iterator();
            while (it.hasNext()) {
                C0162a next = it.next();
                ai.a(next.f14033a, (Runnable) new b0(this, next.f14034b, 1));
            }
        }

        public void a(Handler handler, g gVar) {
            com.applovin.exoplayer2.l.a.b(handler);
            com.applovin.exoplayer2.l.a.b(gVar);
            this.f14032c.add(new C0162a(handler, gVar));
        }

        public void d() {
            Iterator<C0162a> it = this.f14032c.iterator();
            while (it.hasNext()) {
                C0162a next = it.next();
                ai.a(next.f14033a, (Runnable) new androidx.appcompat.app.p(1, this, next.f14034b));
            }
        }

        public /* synthetic */ void b(g gVar) {
            gVar.d(this.f14030a, this.f14031b);
        }

        public /* synthetic */ void c(g gVar) {
            gVar.c(this.f14030a, this.f14031b);
        }

        public void a(g gVar) {
            Iterator<C0162a> it = this.f14032c.iterator();
            while (it.hasNext()) {
                C0162a next = it.next();
                if (next.f14034b == gVar) {
                    this.f14032c.remove(next);
                }
            }
        }

        public void a(int i10) {
            Iterator<C0162a> it = this.f14032c.iterator();
            while (it.hasNext()) {
                C0162a next = it.next();
                ai.a(next.f14033a, (Runnable) new c0(i10, this, next.f14034b, 0));
            }
        }

        public /* synthetic */ void a(g gVar, int i10) {
            gVar.e(this.f14030a, this.f14031b);
            gVar.a(this.f14030a, this.f14031b, i10);
        }

        public void a() {
            Iterator<C0162a> it = this.f14032c.iterator();
            while (it.hasNext()) {
                C0162a next = it.next();
                ai.a(next.f14033a, (Runnable) new com.applovin.exoplayer2.b.e0(1, this, next.f14034b));
            }
        }

        public void a(Exception exc) {
            Iterator<C0162a> it = this.f14032c.iterator();
            while (it.hasNext()) {
                C0162a next = it.next();
                ai.a(next.f14033a, (Runnable) new androidx.emoji2.text.g(this, next.f14034b, exc, 2));
            }
        }

        public /* synthetic */ void a(g gVar, Exception exc) {
            gVar.a(this.f14030a, this.f14031b, exc);
        }
    }

    default void a(int i10, p.a aVar) {
    }

    default void a(int i10, p.a aVar, int i11) {
    }

    default void a(int i10, p.a aVar, Exception exc) {
    }

    default void b(int i10, p.a aVar) {
    }

    default void c(int i10, p.a aVar) {
    }

    default void d(int i10, p.a aVar) {
    }

    @Deprecated
    default void e(int i10, p.a aVar) {
    }
}
