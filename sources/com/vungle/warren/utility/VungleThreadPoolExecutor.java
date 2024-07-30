package com.vungle.warren.utility;

import com.vungle.warren.persistence.FutureResult;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class VungleThreadPoolExecutor extends ThreadPoolExecutor {
    public VungleThreadPoolExecutor(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        try {
            return super.submit(runnable);
        } catch (OutOfMemoryError unused) {
            return new FutureResult(null);
        }
    }

    public void execute(Runnable runnable, Runnable runnable2) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        try {
            return super.submit(runnable, (Runnable) t10);
        } catch (OutOfMemoryError unused) {
            return new FutureResult(null);
        }
    }

    public Future<?> submit(Runnable runnable, Runnable runnable2) {
        try {
            return super.submit(runnable);
        } catch (OutOfMemoryError unused) {
            runnable2.run();
            return new FutureResult(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        try {
            return super.submit(callable);
        } catch (OutOfMemoryError unused) {
            return new FutureResult(null);
        }
    }
}
