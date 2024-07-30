package d3;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GlideExecutor.java */
/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: t, reason: collision with root package name */
    public static final long f27269t = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: u, reason: collision with root package name */
    public static volatile int f27270u;

    /* renamed from: s, reason: collision with root package name */
    public final ExecutorService f27271s;

    /* compiled from: GlideExecutor.java */
    /* renamed from: d3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC0355a implements ThreadFactory {

        /* compiled from: GlideExecutor.java */
        /* renamed from: d3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0356a extends Thread {
            public C0356a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new C0356a(runnable);
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadFactory f27272a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27273b;

        /* renamed from: c, reason: collision with root package name */
        public final c f27274c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f27275d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f27276e;

        /* compiled from: GlideExecutor.java */
        /* renamed from: d3.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0357a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Runnable f27277s;

            public RunnableC0357a(Runnable runnable) {
                this.f27277s = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (bVar.f27275d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f27277s.run();
                } catch (Throwable th) {
                    bVar.f27274c.a(th);
                }
            }
        }

        public b(ThreadFactoryC0355a threadFactoryC0355a, String str, boolean z10) {
            c.C0358a c0358a = c.f27279a;
            this.f27276e = new AtomicInteger();
            this.f27272a = threadFactoryC0355a;
            this.f27273b = str;
            this.f27274c = c0358a;
            this.f27275d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = this.f27272a.newThread(new RunnableC0357a(runnable));
            newThread.setName("glide-" + this.f27273b + "-thread-" + this.f27276e.getAndIncrement());
            return newThread;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final C0358a f27279a = new C0358a();

        /* compiled from: GlideExecutor.java */
        /* renamed from: d3.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0358a implements c {
            @Override // d3.a.c
            public final void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        void a(Throwable th);
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f27271s = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f27271s.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f27271s.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f27271s.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f27271s.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f27271s.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f27271s.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f27271s.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f27271s.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f27271s.submit(runnable);
    }

    public final String toString() {
        return this.f27271s.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f27271s.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f27271s.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f27271s.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f27271s.submit(callable);
    }
}
