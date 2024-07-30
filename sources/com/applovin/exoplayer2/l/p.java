package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.l.m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class p<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d f16315a;

    /* renamed from: b, reason: collision with root package name */
    private final o f16316b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f16317c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f16318d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f16319e;
    private final ArrayDeque<Runnable> f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16320g;

    /* loaded from: classes.dex */
    public interface a<T> {
        void invoke(T t10);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void invoke(T t10, m mVar);
    }

    public p(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    public p<T> a(Looper looper, b<T> bVar) {
        return new p<>(this.f16318d, looper, this.f16315a, bVar);
    }

    private p(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f16315a = dVar;
        this.f16318d = copyOnWriteArraySet;
        this.f16317c = bVar;
        this.f16319e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.f16316b = dVar.a(looper, new Handler.Callback() { // from class: com.applovin.exoplayer2.l.a0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean a10;
                a10 = p.this.a(message);
                return a10;
            }
        });
    }

    public void a(T t10) {
        if (this.f16320g) {
            return;
        }
        com.applovin.exoplayer2.l.a.b(t10);
        this.f16318d.add(new c<>(t10));
    }

    public void b(T t10) {
        Iterator<c<T>> it = this.f16318d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f16321a.equals(t10)) {
                next.a(this.f16317c);
                this.f16318d.remove(next);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f16321a;

        /* renamed from: b, reason: collision with root package name */
        private m.a f16322b = new m.a();

        /* renamed from: c, reason: collision with root package name */
        private boolean f16323c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16324d;

        public c(T t10) {
            this.f16321a = t10;
        }

        public void a(b<T> bVar) {
            this.f16324d = true;
            if (this.f16323c) {
                bVar.invoke(this.f16321a, this.f16322b.a());
            }
        }

        public void b(b<T> bVar) {
            if (!this.f16324d && this.f16323c) {
                m a10 = this.f16322b.a();
                this.f16322b = new m.a();
                this.f16323c = false;
                bVar.invoke(this.f16321a, a10);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                return this.f16321a.equals(((c) obj).f16321a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16321a.hashCode();
        }

        public void a(int i10, a<T> aVar) {
            if (this.f16324d) {
                return;
            }
            if (i10 != -1) {
                this.f16322b.a(i10);
            }
            this.f16323c = true;
            aVar.invoke(this.f16321a);
        }
    }

    public void a(final int i10, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f16318d);
        this.f.add(new Runnable() { // from class: com.applovin.exoplayer2.l.b0
            @Override // java.lang.Runnable
            public final void run() {
                p.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void b(int i10, a<T> aVar) {
        a(i10, aVar);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void b() {
        Iterator<c<T>> it = this.f16318d.iterator();
        while (it.hasNext()) {
            it.next().a(this.f16317c);
        }
        this.f16318d.clear();
        this.f16320g = true;
    }

    public void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.f16316b.a(0)) {
            o oVar = this.f16316b;
            oVar.a(oVar.b(0));
        }
        boolean z10 = !this.f16319e.isEmpty();
        this.f16319e.addAll(this.f);
        this.f.clear();
        if (z10) {
            return;
        }
        while (!this.f16319e.isEmpty()) {
            this.f16319e.peekFirst().run();
            this.f16319e.removeFirst();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator<c<T>> it = this.f16318d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f16317c);
            if (this.f16316b.a(0)) {
                return true;
            }
        }
        return true;
    }
}
