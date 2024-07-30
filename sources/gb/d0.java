package gb;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class d0 implements ThreadFactory {

    /* renamed from: c, reason: collision with root package name */
    public final String f28570c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28571d;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f28569b = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f28568a = Thread.currentThread().getThreadGroup();

    public d0(String str, int i10) {
        this.f28571d = i10;
        this.f28570c = str.concat("-pool-thread-");
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f28568a, runnable, this.f28570c + this.f28569b.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int priority = thread.getPriority();
        int i10 = this.f28571d;
        if (priority != i10) {
            thread.setPriority(i10);
        }
        return thread;
    }
}
