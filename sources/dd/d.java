package dd;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: Executors.kt */
/* loaded from: classes2.dex */
public final class d extends c {

    /* renamed from: t, reason: collision with root package name */
    public final Executor f27610t;

    public d(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f27610t = executor;
        Method method2 = fd.a.f28353a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = fd.a.f28353a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f27610t;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && ((d) obj).f27610t == this.f27610t) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f27610t);
    }

    @Override // dd.a
    public final String toString() {
        return this.f27610t.toString();
    }
}
