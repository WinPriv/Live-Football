package com.onesignal;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: OSTaskController.java */
/* loaded from: classes2.dex */
public class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f27137a = new ConcurrentLinkedQueue<>();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f27138b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    public ExecutorService f27139c;

    /* renamed from: d, reason: collision with root package name */
    public final s1 f27140d;

    /* compiled from: OSTaskController.java */
    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("OS_PENDING_EXECUTOR_" + thread.getId());
            return thread;
        }
    }

    /* compiled from: OSTaskController.java */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final v2 f27141s;

        /* renamed from: t, reason: collision with root package name */
        public final Runnable f27142t;

        /* renamed from: u, reason: collision with root package name */
        public long f27143u;

        public b(v2 v2Var, Runnable runnable) {
            this.f27141s = v2Var;
            this.f27142t = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27142t.run();
            long j10 = this.f27143u;
            v2 v2Var = this.f27141s;
            if (v2Var.f27138b.get() == j10) {
                e3.b(5, "Last Pending Task has ran, shutting down", null);
                v2Var.f27139c.shutdown();
            }
        }

        public final String toString() {
            return "PendingTaskRunnable{innerTask=" + this.f27142t + ", taskId=" + this.f27143u + '}';
        }
    }

    public v2(c3 c3Var) {
        this.f27140d = c3Var;
    }

    public final void a(Runnable runnable) {
        b bVar = new b(this, runnable);
        bVar.f27143u = this.f27138b.incrementAndGet();
        ExecutorService executorService = this.f27139c;
        s1 s1Var = this.f27140d;
        if (executorService == null) {
            ((c3) s1Var).c("Adding a task to the pending queue with ID: " + bVar.f27143u);
            this.f27137a.add(bVar);
            return;
        }
        if (!executorService.isShutdown()) {
            ((c3) s1Var).c("Executor is still running, add to the executor with ID: " + bVar.f27143u);
            try {
                this.f27139c.submit(bVar);
            } catch (RejectedExecutionException e10) {
                e3.b(5, "Executor is shutdown, running task manually with ID: " + bVar.f27143u, null);
                bVar.run();
                e10.printStackTrace();
            }
        }
    }

    public final boolean b() {
        if (Thread.currentThread().getName().contains("OS_PENDING_EXECUTOR_")) {
            return false;
        }
        boolean z10 = e3.f26767n;
        if (z10 && this.f27139c == null) {
            return false;
        }
        if (!z10 && this.f27139c == null) {
            return true;
        }
        return !this.f27139c.isShutdown();
    }

    public final void c() {
        StringBuilder sb2 = new StringBuilder("startPendingTasks with task queue quantity: ");
        ConcurrentLinkedQueue<Runnable> concurrentLinkedQueue = this.f27137a;
        sb2.append(concurrentLinkedQueue.size());
        e3.b(6, sb2.toString(), null);
        if (!concurrentLinkedQueue.isEmpty()) {
            this.f27139c = Executors.newSingleThreadExecutor(new a());
            while (!concurrentLinkedQueue.isEmpty()) {
                this.f27139c.submit(concurrentLinkedQueue.poll());
            }
        }
    }
}
