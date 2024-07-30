package com.anythink.expressad.exoplayer.d;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface c {
    void a(Exception exc);

    void d();

    void e();

    void f();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0099a> f7656a = new CopyOnWriteArrayList<>();

        /* renamed from: com.anythink.expressad.exoplayer.d.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0099a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f7666a;

            /* renamed from: b, reason: collision with root package name */
            public final c f7667b;

            public C0099a(Handler handler, c cVar) {
                this.f7666a = handler;
                this.f7667b = cVar;
            }
        }

        public final void a(Handler handler, c cVar) {
            com.anythink.expressad.exoplayer.k.a.a((handler == null || cVar == null) ? false : true);
            this.f7656a.add(new C0099a(handler, cVar));
        }

        public final void b() {
            Iterator<C0099a> it = this.f7656a.iterator();
            while (it.hasNext()) {
                C0099a next = it.next();
                final c cVar = next.f7667b;
                next.f7666a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.d.c.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.e();
                    }
                });
            }
        }

        public final void c() {
            Iterator<C0099a> it = this.f7656a.iterator();
            while (it.hasNext()) {
                C0099a next = it.next();
                final c cVar = next.f7667b;
                next.f7666a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.d.c.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.f();
                    }
                });
            }
        }

        public final void a(c cVar) {
            Iterator<C0099a> it = this.f7656a.iterator();
            while (it.hasNext()) {
                C0099a next = it.next();
                if (next.f7667b == cVar) {
                    this.f7656a.remove(next);
                }
            }
        }

        public final void a() {
            Iterator<C0099a> it = this.f7656a.iterator();
            while (it.hasNext()) {
                C0099a next = it.next();
                final c cVar = next.f7667b;
                next.f7666a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.d.c.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.d();
                    }
                });
            }
        }

        public final void a(final Exception exc) {
            Iterator<C0099a> it = this.f7656a.iterator();
            while (it.hasNext()) {
                C0099a next = it.next();
                final c cVar = next.f7667b;
                next.f7666a.post(new Runnable() { // from class: com.anythink.expressad.exoplayer.d.c.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a(exc);
                    }
                });
            }
        }
    }
}
