package c2;

import a3.l;
import com.anythink.core.common.t;
import com.huawei.hms.ads.ep;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements m7.a<V> {

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f3200v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", ep.V));

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f3201w = Logger.getLogger(a.class.getName());

    /* renamed from: x, reason: collision with root package name */
    public static final AbstractC0035a f3202x;
    public static final Object y;

    /* renamed from: s, reason: collision with root package name */
    public volatile Object f3203s;

    /* renamed from: t, reason: collision with root package name */
    public volatile d f3204t;

    /* renamed from: u, reason: collision with root package name */
    public volatile h f3205u;

    /* compiled from: AbstractFuture.java */
    /* renamed from: c2.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0035a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f3206c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f3207d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3208a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f3209b;

        static {
            if (a.f3200v) {
                f3207d = null;
                f3206c = null;
            } else {
                f3207d = new b(null, false);
                f3206c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z10) {
            this.f3208a = z10;
            this.f3209b = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f3210b = new c(new C0036a());

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f3211a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: c2.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0036a extends Throwable {
            public C0036a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            boolean z10 = a.f3200v;
            th.getClass();
            this.f3211a = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f3212d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f3213a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f3214b;

        /* renamed from: c, reason: collision with root package name */
        public d f3215c;

        public d(Runnable runnable, Executor executor) {
            this.f3213a = runnable;
            this.f3214b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC0035a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f3216a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f3217b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f3218c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f3219d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f3220e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f3216a = atomicReferenceFieldUpdater;
            this.f3217b = atomicReferenceFieldUpdater2;
            this.f3218c = atomicReferenceFieldUpdater3;
            this.f3219d = atomicReferenceFieldUpdater4;
            this.f3220e = atomicReferenceFieldUpdater5;
        }

        @Override // c2.a.AbstractC0035a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f3219d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // c2.a.AbstractC0035a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f3220e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // c2.a.AbstractC0035a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f3218c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        @Override // c2.a.AbstractC0035a
        public final void d(h hVar, h hVar2) {
            this.f3217b.lazySet(hVar, hVar2);
        }

        @Override // c2.a.AbstractC0035a
        public final void e(h hVar, Thread thread) {
            this.f3216a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class f<V> implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final a<V> f3221s;

        /* renamed from: t, reason: collision with root package name */
        public final m7.a<? extends V> f3222t;

        public f(a<V> aVar, m7.a<? extends V> aVar2) {
            this.f3221s = aVar;
            this.f3222t = aVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f3221s.f3203s != this) {
                return;
            }
            if (a.f3202x.b(this.f3221s, this, a.f(this.f3222t))) {
                a.c(this.f3221s);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC0035a {
        @Override // c2.a.AbstractC0035a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f3204t == dVar) {
                    aVar.f3204t = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // c2.a.AbstractC0035a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f3203s == obj) {
                    aVar.f3203s = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // c2.a.AbstractC0035a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f3205u == hVar) {
                    aVar.f3205u = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // c2.a.AbstractC0035a
        public final void d(h hVar, h hVar2) {
            hVar.f3225b = hVar2;
        }

        @Override // c2.a.AbstractC0035a
        public final void e(h hVar, Thread thread) {
            hVar.f3224a = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f3223c = new h(0);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f3224a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f3225b;

        public h(int i10) {
        }

        public h() {
            a.f3202x.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0035a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "u"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, t.f6511a), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "s"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f3202x = gVar;
        if (th != null) {
            f3201w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        y = new Object();
    }

    public static void c(a<?> aVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = aVar.f3205u;
            if (f3202x.c(aVar, hVar, h.f3223c)) {
                while (hVar != null) {
                    Thread thread = hVar.f3224a;
                    if (thread != null) {
                        hVar.f3224a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f3225b;
                }
                do {
                    dVar = aVar.f3204t;
                } while (!f3202x.a(aVar, dVar, d.f3212d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f3215c;
                    dVar3.f3215c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f3215c;
                    Runnable runnable = dVar2.f3213a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar = fVar.f3221s;
                        if (aVar.f3203s == fVar) {
                            if (f3202x.b(aVar, fVar, f(fVar.f3222t))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f3214b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f3201w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(m7.a<?> aVar) {
        Object obj;
        if (aVar instanceof a) {
            Object obj2 = ((a) aVar).f3203s;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.f3208a) {
                    if (bVar.f3209b != null) {
                        return new b(bVar.f3209b, false);
                    }
                    return b.f3207d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = aVar.isCancelled();
        boolean z10 = true;
        if ((!f3200v) & isCancelled) {
            return b.f3207d;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e10) {
                if (!isCancelled) {
                    return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
                }
                return new b(e10, false);
            } catch (ExecutionException e11) {
                return new c(e11.getCause());
            } catch (Throwable th2) {
                return new c(th2);
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return y;
        }
        return obj;
    }

    @Override // m7.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f3204t;
        d dVar2 = d.f3212d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f3215c = dVar;
                if (f3202x.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f3204t;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        V v3;
        String valueOf;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v3 = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (v3 == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(v3);
        }
        sb2.append(valueOf);
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        b bVar;
        boolean z12;
        Object obj = this.f3203s;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z11 | (obj instanceof f))) {
            return false;
        }
        if (f3200v) {
            bVar = new b(new CancellationException("Future.cancel() was called."), z10);
        } else if (z10) {
            bVar = b.f3206c;
        } else {
            bVar = b.f3207d;
        }
        a<V> aVar = this;
        boolean z13 = false;
        while (true) {
            if (f3202x.b(aVar, obj, bVar)) {
                c(aVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                m7.a<? extends V> aVar2 = ((f) obj).f3222t;
                if (aVar2 instanceof a) {
                    aVar = (a) aVar2;
                    obj = aVar.f3203s;
                    if (obj == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!(z12 | (obj instanceof f))) {
                        return true;
                    }
                    z13 = true;
                } else {
                    aVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = aVar.f3203s;
                if (!(obj instanceof f)) {
                    return z13;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V e(Object obj) throws ExecutionException {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == y) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f3211a);
        }
        Throwable th = ((b) obj).f3209b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        String valueOf;
        Object obj = this.f3203s;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            m7.a<? extends V> aVar = ((f) obj).f3222t;
            if (aVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(aVar);
            }
            return l.p(sb2, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a7 -> B:33:0x00ad). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r13, java.util.concurrent.TimeUnit r15) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(h hVar) {
        hVar.f3224a = null;
        while (true) {
            h hVar2 = this.f3205u;
            if (hVar2 == h.f3223c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f3225b;
                if (hVar2.f3224a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f3225b = hVar4;
                    if (hVar3.f3224a == null) {
                        break;
                    }
                } else if (!f3202x.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3203s instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        if (this.f3203s != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(r0 instanceof f)) & z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f3203s instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = g();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3203s;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f3205u;
            h hVar2 = h.f3223c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0035a abstractC0035a = f3202x;
                    abstractC0035a.d(hVar3, hVar);
                    if (abstractC0035a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3203s;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f3205u;
                } while (hVar != hVar2);
            }
            return e(this.f3203s);
        }
        throw new InterruptedException();
    }
}
