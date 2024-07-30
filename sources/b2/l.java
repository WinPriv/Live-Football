package b2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SerialExecutor.java */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: t, reason: collision with root package name */
    public final Executor f2818t;

    /* renamed from: v, reason: collision with root package name */
    public volatile Runnable f2820v;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayDeque<a> f2817s = new ArrayDeque<>();

    /* renamed from: u, reason: collision with root package name */
    public final Object f2819u = new Object();

    /* compiled from: SerialExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final l f2821s;

        /* renamed from: t, reason: collision with root package name */
        public final Runnable f2822t;

        public a(l lVar, Runnable runnable) {
            this.f2821s = lVar;
            this.f2822t = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = this.f2821s;
            try {
                this.f2822t.run();
            } finally {
                lVar.a();
            }
        }
    }

    public l(ExecutorService executorService) {
        this.f2818t = executorService;
    }

    public final void a() {
        synchronized (this.f2819u) {
            a poll = this.f2817s.poll();
            this.f2820v = poll;
            if (poll != null) {
                this.f2818t.execute(this.f2820v);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2819u) {
            this.f2817s.add(new a(this, runnable));
            if (this.f2820v == null) {
                a();
            }
        }
    }
}
