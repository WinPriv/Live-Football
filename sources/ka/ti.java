package ka;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ti implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f31915a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f31916b = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public final String f31917c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31918d;

    public ti(String str, int i10) {
        this.f31918d = i10;
        this.f31915a = new ThreadGroup(str);
        this.f31917c = a3.k.l("PPS-", str, "-pool-thread-");
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f31915a, runnable, this.f31917c + this.f31916b.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int priority = thread.getPriority();
        int i10 = this.f31918d;
        if (priority != i10) {
            thread.setPriority(i10);
        }
        return thread;
    }
}
