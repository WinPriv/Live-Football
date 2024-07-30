package gb;

import com.huawei.hms.ads.ex;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static HashMap f28551a;

    /* loaded from: classes2.dex */
    public enum a {
        IO,
        NETWORK,
        CALCULATION,
        SEQUENCE,
        SYNC_CALL,
        SPLASH_NET,
        COLLECT_SEQUENCE
    }

    static {
        synchronized (c0.class) {
            if (f28551a == null) {
                HashMap hashMap = new HashMap();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 60L, timeUnit, new LinkedBlockingQueue(), new d0("IO", 5));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(3, 5, 60L, timeUnit, new LinkedBlockingQueue(), new d0("Net", 5));
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(3, 5, 60L, timeUnit, new LinkedBlockingQueue(), new d0("Cal", 5));
                threadPoolExecutor3.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new d0("Seq", 5));
                ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(3, 5, 60L, timeUnit, new LinkedBlockingQueue(), new d0("SyncCall", 10));
                ThreadPoolExecutor threadPoolExecutor6 = new ThreadPoolExecutor(0, 3, 60L, timeUnit, new LinkedBlockingQueue(), new d0("SplashNet", 10));
                ThreadPoolExecutor threadPoolExecutor7 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new d0("ClctSeq", 5));
                hashMap.put(a.IO, threadPoolExecutor);
                hashMap.put(a.NETWORK, threadPoolExecutor2);
                hashMap.put(a.CALCULATION, threadPoolExecutor3);
                hashMap.put(a.SEQUENCE, threadPoolExecutor4);
                hashMap.put(a.SYNC_CALL, threadPoolExecutor5);
                hashMap.put(a.SPLASH_NET, threadPoolExecutor6);
                hashMap.put(a.COLLECT_SEQUENCE, threadPoolExecutor7);
                f28551a = hashMap;
            }
        }
    }

    public static void a(Runnable runnable) {
        b(runnable, a.IO);
    }

    public static void b(Runnable runnable, a aVar) {
        ExecutorService executorService = (ExecutorService) f28551a.get(aVar);
        if (executorService != null) {
            executorService.execute(new v(runnable));
        } else {
            ex.I("AsyncExec", "no executor for type: %s", aVar);
        }
    }

    public static void c(Runnable runnable) {
        b(runnable, a.CALCULATION);
    }

    public static void d(Runnable runnable) {
        b(runnable, a.NETWORK);
    }
}
