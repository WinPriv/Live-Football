package j;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c5.e;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor.java */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: v, reason: collision with root package name */
    public final Object f29555v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final ExecutorService f29556w = Executors.newFixedThreadPool(4, new a());

    /* renamed from: x, reason: collision with root package name */
    public volatile Handler f29557x;

    /* compiled from: DefaultTaskExecutor.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f29558a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f29558a.getAndIncrement())));
            return thread;
        }
    }

    public static Handler i(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
