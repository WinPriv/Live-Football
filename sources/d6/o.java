package d6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d6.j;
import d6.o;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ListenerSet.java */
/* loaded from: classes2.dex */
public final class o<T> {

    /* renamed from: a, reason: collision with root package name */
    public final d6.c f27330a;

    /* renamed from: b, reason: collision with root package name */
    public final m f27331b;

    /* renamed from: c, reason: collision with root package name */
    public final b<T> f27332c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f27333d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f27334e;
    public final ArrayDeque<Runnable> f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f27335g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27336h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27337i;

    /* compiled from: ListenerSet.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        void invoke(T t10);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes2.dex */
    public interface b<T> {
        void d(T t10, j jVar);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes2.dex */
    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f27338a;

        /* renamed from: b, reason: collision with root package name */
        public j.a f27339b = new j.a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f27340c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f27341d;

        public c(T t10) {
            this.f27338a = t10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                return this.f27338a.equals(((c) obj).f27338a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f27338a.hashCode();
        }
    }

    public o(Looper looper, d6.c cVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, cVar, bVar);
    }

    public final void a(T t10) {
        t10.getClass();
        synchronized (this.f27335g) {
            if (this.f27336h) {
                return;
            }
            this.f27333d.add(new c<>(t10));
        }
    }

    public final void b() {
        f();
        ArrayDeque<Runnable> arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        m mVar = this.f27331b;
        if (!mVar.a()) {
            mVar.h(mVar.d(0));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f27334e;
        boolean z10 = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z10) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            arrayDeque2.peekFirst().run();
            arrayDeque2.removeFirst();
        }
    }

    public final void c(int i10, a<T> aVar) {
        f();
        this.f.add(new o4.b(new CopyOnWriteArraySet(this.f27333d), i10, aVar));
    }

    public final void d() {
        f();
        synchronized (this.f27335g) {
            this.f27336h = true;
        }
        Iterator<c<T>> it = this.f27333d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.f27332c;
            next.f27341d = true;
            if (next.f27340c) {
                next.f27340c = false;
                bVar.d(next.f27338a, next.f27339b.b());
            }
        }
        this.f27333d.clear();
    }

    public final void e(int i10, a<T> aVar) {
        c(i10, aVar);
        b();
    }

    public final void f() {
        boolean z10;
        if (!this.f27337i) {
            return;
        }
        if (Thread.currentThread() == this.f27331b.k().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
    }

    public o(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d6.c cVar, b<T> bVar) {
        this.f27330a = cVar;
        this.f27333d = copyOnWriteArraySet;
        this.f27332c = bVar;
        this.f27335g = new Object();
        this.f27334e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.f27331b = cVar.b(looper, new Handler.Callback() { // from class: d6.n
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                o oVar = o.this;
                Iterator it = oVar.f27333d.iterator();
                while (it.hasNext()) {
                    o.c cVar2 = (o.c) it.next();
                    if (!cVar2.f27341d && cVar2.f27340c) {
                        j b10 = cVar2.f27339b.b();
                        cVar2.f27339b = new j.a();
                        cVar2.f27340c = false;
                        oVar.f27332c.d(cVar2.f27338a, b10);
                    }
                    if (oVar.f27331b.a()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f27337i = true;
    }
}
