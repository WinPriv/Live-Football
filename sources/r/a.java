package r;

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

/* compiled from: AbstractResolvableFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements m7.a<V> {

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f34754v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", ep.V));

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f34755w = Logger.getLogger(a.class.getName());

    /* renamed from: x, reason: collision with root package name */
    public static final AbstractC0465a f34756x;
    public static final Object y;

    /* renamed from: s, reason: collision with root package name */
    public volatile Object f34757s;

    /* renamed from: t, reason: collision with root package name */
    public volatile d f34758t;

    /* renamed from: u, reason: collision with root package name */
    public volatile h f34759u;

    /* compiled from: AbstractResolvableFuture.java */
    /* renamed from: r.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0465a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f34760c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f34761d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f34762a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f34763b;

        static {
            if (a.f34754v) {
                f34761d = null;
                f34760c = null;
            } else {
                f34761d = new b(null, false);
                f34760c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z10) {
            this.f34762a = z10;
            this.f34763b = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f34764a;

        /* compiled from: AbstractResolvableFuture.java */
        /* renamed from: r.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0466a extends Throwable {
            public C0466a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0466a());
        }

        public c(Throwable th) {
            boolean z10 = a.f34754v;
            th.getClass();
            this.f34764a = th;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f34765d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f34766a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f34767b;

        /* renamed from: c, reason: collision with root package name */
        public d f34768c;

        public d(Runnable runnable, Executor executor) {
            this.f34766a = runnable;
            this.f34767b = executor;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC0465a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f34769a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f34770b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f34771c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f34772d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f34773e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f34769a = atomicReferenceFieldUpdater;
            this.f34770b = atomicReferenceFieldUpdater2;
            this.f34771c = atomicReferenceFieldUpdater3;
            this.f34772d = atomicReferenceFieldUpdater4;
            this.f34773e = atomicReferenceFieldUpdater5;
        }

        @Override // r.a.AbstractC0465a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f34772d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // r.a.AbstractC0465a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f34773e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // r.a.AbstractC0465a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f34771c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        @Override // r.a.AbstractC0465a
        public final void d(h hVar, h hVar2) {
            this.f34770b.lazySet(hVar, hVar2);
        }

        @Override // r.a.AbstractC0465a
        public final void e(h hVar, Thread thread) {
            this.f34769a.lazySet(hVar, thread);
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC0465a {
        @Override // r.a.AbstractC0465a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f34758t == dVar) {
                    aVar.f34758t = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // r.a.AbstractC0465a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f34757s == obj) {
                    aVar.f34757s = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // r.a.AbstractC0465a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f34759u == hVar) {
                    aVar.f34759u = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // r.a.AbstractC0465a
        public final void d(h hVar, h hVar2) {
            hVar.f34776b = hVar2;
        }

        @Override // r.a.AbstractC0465a
        public final void e(h hVar, Thread thread) {
            hVar.f34775a = thread;
        }
    }

    /* compiled from: AbstractResolvableFuture.java */
    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f34774c = new h(0);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f34775a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f34776b;

        public h(int i10) {
        }

        public h() {
            a.f34756x.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0465a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "u"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, t.f6511a), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "s"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f34756x = gVar;
        if (th != null) {
            f34755w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        y = new Object();
    }

    public static void d(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.f34759u;
        } while (!f34756x.c(aVar, hVar, h.f34774c));
        while (hVar != null) {
            Thread thread = hVar.f34775a;
            if (thread != null) {
                hVar.f34775a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f34776b;
        }
        aVar.c();
        do {
            dVar = aVar.f34758t;
        } while (!f34756x.a(aVar, dVar, d.f34765d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f34768c;
            dVar.f34768c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f34768c;
            Runnable runnable = dVar2.f34766a;
            if (!(runnable instanceof f)) {
                e(runnable, dVar2.f34767b);
                dVar2 = dVar4;
            } else {
                ((f) runnable).getClass();
                throw null;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f34755w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // m7.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f34758t;
        d dVar2 = d.f34765d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f34768c = dVar;
                if (f34756x.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f34758t;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
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
        Object obj = this.f34757s;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 | (obj instanceof f)) {
            if (f34754v) {
                bVar = new b(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                bVar = b.f34760c;
            } else {
                bVar = b.f34761d;
            }
            while (!f34756x.b(this, obj, bVar)) {
                obj = this.f34757s;
                if (!(obj instanceof f)) {
                }
            }
            d(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V f(Object obj) throws ExecutionException {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == y) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f34764a);
        }
        Throwable th = ((b) obj).f34763b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f34757s;
        if (obj instanceof f) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb2.append("null");
            sb2.append("]");
            return sb2.toString();
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
        throw new UnsupportedOperationException("Method not decompiled: r.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(h hVar) {
        hVar.f34775a = null;
        while (true) {
            h hVar2 = this.f34759u;
            if (hVar2 == h.f34774c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f34776b;
                if (hVar2.f34775a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f34776b = hVar4;
                    if (hVar3.f34775a == null) {
                        break;
                    }
                } else if (!f34756x.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34757s instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        if (this.f34757s != null) {
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
        if (this.f34757s instanceof b) {
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

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f34757s;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return f(obj2);
            }
            h hVar = this.f34759u;
            h hVar2 = h.f34774c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    AbstractC0465a abstractC0465a = f34756x;
                    abstractC0465a.d(hVar3, hVar);
                    if (abstractC0465a.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f34757s;
                            } else {
                                h(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return f(obj);
                    }
                    hVar = this.f34759u;
                } while (hVar != hVar2);
            }
            return f(this.f34757s);
        }
        throw new InterruptedException();
    }
}
