package z3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: s, reason: collision with root package name */
    public final Executor f36957s;

    /* compiled from: SafeLoggingExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final Runnable f36958s;

        public a(Runnable runnable) {
            this.f36958s = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f36958s.run();
            } catch (Exception e10) {
                d4.a.b("Executor", "Background execution failure.", e10);
            }
        }
    }

    public q(ExecutorService executorService) {
        this.f36957s = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f36957s.execute(new a(runnable));
    }
}
