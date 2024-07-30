package t7;

import com.applovin.exoplayer2.h.f0;
import com.applovin.exoplayer2.m.q;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import t7.h;

/* compiled from: DelegatingScheduledExecutorService.java */
/* loaded from: classes2.dex */
public final class g implements ScheduledExecutorService {

    /* renamed from: s, reason: collision with root package name */
    public final ExecutorService f35539s;

    /* renamed from: t, reason: collision with root package name */
    public final ScheduledExecutorService f35540t;

    public g(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f35539s = executorService;
        this.f35540t = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f35539s.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f35539s.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f35539s.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f35539s.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f35539s.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f35539s.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new h(new h.c() { // from class: t7.c
            @Override // t7.h.c
            public final ScheduledFuture a(h.a aVar) {
                g gVar = g.this;
                gVar.getClass();
                return gVar.f35540t.schedule(new q(gVar, runnable, aVar, 3), j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new h(new h.c() { // from class: t7.e
            @Override // t7.h.c
            public final ScheduledFuture a(h.a aVar) {
                long j12 = j10;
                long j13 = j11;
                TimeUnit timeUnit2 = timeUnit;
                g gVar = g.this;
                return gVar.f35540t.scheduleAtFixedRate(new f0(gVar, runnable, aVar, 3), j12, j13, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new h(new h.c() { // from class: t7.d
            @Override // t7.h.c
            public final ScheduledFuture a(h.a aVar) {
                long j12 = j10;
                long j13 = j11;
                TimeUnit timeUnit2 = timeUnit;
                g gVar = g.this;
                return gVar.f35540t.scheduleWithFixedDelay(new androidx.emoji2.text.g(gVar, runnable, aVar, 6), j12, j13, timeUnit2);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f35539s.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f35539s.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f35539s.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new h(new h.c() { // from class: t7.b
            @Override // t7.h.c
            public final ScheduledFuture a(final h.a aVar) {
                final g gVar = g.this;
                gVar.getClass();
                final Callable callable2 = callable;
                return gVar.f35540t.schedule(new Callable() { // from class: t7.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        g gVar2 = g.this;
                        gVar2.getClass();
                        return gVar2.f35539s.submit(new e0.g(11, callable2, aVar));
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f35539s.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f35539s.submit(runnable);
    }
}
