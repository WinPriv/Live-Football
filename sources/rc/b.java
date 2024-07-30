package rc;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f34992b;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f34993a;

    public b() {
        this.f34993a = null;
        this.f34993a = new ThreadPoolExecutor(0, 50, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public static b a() {
        if (f34992b == null) {
            f34992b = new b();
        }
        return f34992b;
    }

    public final void b(Runnable runnable) {
        a aVar = new a(0L, runnable);
        Long.valueOf(System.currentTimeMillis() / 1000).intValue();
        this.f34993a.execute(aVar);
    }
}
