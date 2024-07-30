package qa;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class d implements ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f34726d = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f34728b = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    public final ThreadGroup f34727a = Thread.currentThread().getThreadGroup();

    /* renamed from: c, reason: collision with root package name */
    public final String f34729c = "PPS-download-pool-" + f34726d.getAndIncrement() + "-thread-";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f34727a, runnable, this.f34729c + this.f34728b.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        thread.setPriority(1);
        return thread;
    }
}
