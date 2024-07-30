package com.huawei.openalliance.ad.ppskit.utils;

import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ka.n7;
import ka.ti;

/* loaded from: classes2.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static SparseArray<ExecutorService> f22957a;

    static {
        synchronized (p2.class) {
            if (f22957a == null) {
                SparseArray<ExecutorService> sparseArray = new SparseArray<>();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 60L, timeUnit, new LinkedBlockingQueue(), new ti("IO", 5));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(3, 5, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Net", 5));
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(3, 3, 60L, timeUnit, new LinkedBlockingQueue(1000), new ti("Download", 5), new ThreadPoolExecutor.DiscardOldestPolicy());
                threadPoolExecutor3.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(3, 3, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Cal", 5));
                threadPoolExecutor4.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Seq", 5));
                threadPoolExecutor5.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor6 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Event", 5));
                threadPoolExecutor6.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor7 = new ThreadPoolExecutor(3, 3, 60L, timeUnit, new LinkedBlockingQueue(), new ti("SyncCall", 10));
                threadPoolExecutor7.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor8 = new ThreadPoolExecutor(0, 3, 60L, timeUnit, new LinkedBlockingQueue(), new ti("SplashNet", 10));
                threadPoolExecutor8.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor9 = new ThreadPoolExecutor(5, 5, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Cmd", 5));
                threadPoolExecutor9.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor10 = new ThreadPoolExecutor(4, 4, 60L, timeUnit, new LinkedBlockingQueue(), new ti("CmdAdReq", 10));
                threadPoolExecutor10.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor11 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new ti("agDownload", 5));
                threadPoolExecutor11.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor12 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new ti("DiskCache", 5));
                threadPoolExecutor12.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor13 = new ThreadPoolExecutor(0, 3, 60L, timeUnit, new LinkedBlockingQueue(), new ti("PreloadSplashNet", 10));
                threadPoolExecutor13.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor14 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Device", 5));
                threadPoolExecutor14.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor15 = new ThreadPoolExecutor(0, 2, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Check", 5));
                threadPoolExecutor15.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor16 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Tv_Screen_off_On", 5));
                threadPoolExecutor16.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor17 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Cache_Insre", 5));
                threadPoolExecutor17.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor18 = new ThreadPoolExecutor(0, 7, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Media", 5));
                threadPoolExecutor18.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor19 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Oaid", 5));
                threadPoolExecutor19.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor20 = new ThreadPoolExecutor(0, 3, 60L, timeUnit, new LinkedBlockingQueue(), new ti("Cache_webView", 5));
                threadPoolExecutor20.allowCoreThreadTimeOut(true);
                ThreadPoolExecutor threadPoolExecutor21 = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingQueue(), new ti("PPS-FE", 5));
                threadPoolExecutor21.allowCoreThreadTimeOut(true);
                new ThreadPoolExecutor(0, 1, 60L, timeUnit, new LinkedBlockingQueue(), new ti("oaid_track", 5)).allowCoreThreadTimeOut(true);
                sparseArray.put(0, threadPoolExecutor);
                sparseArray.put(1, threadPoolExecutor2);
                sparseArray.put(4, threadPoolExecutor3);
                sparseArray.put(2, threadPoolExecutor4);
                sparseArray.put(3, threadPoolExecutor5);
                sparseArray.put(5, threadPoolExecutor6);
                sparseArray.put(6, threadPoolExecutor7);
                sparseArray.put(7, threadPoolExecutor8);
                sparseArray.put(8, threadPoolExecutor11);
                sparseArray.put(10, threadPoolExecutor12);
                sparseArray.put(11, threadPoolExecutor9);
                sparseArray.put(12, threadPoolExecutor10);
                sparseArray.put(13, threadPoolExecutor13);
                sparseArray.put(14, threadPoolExecutor14);
                sparseArray.put(15, threadPoolExecutor15);
                sparseArray.put(16, threadPoolExecutor16);
                sparseArray.put(17, threadPoolExecutor17);
                sparseArray.put(18, threadPoolExecutor18);
                sparseArray.put(19, threadPoolExecutor19);
                sparseArray.put(20, threadPoolExecutor20);
                sparseArray.put(21, threadPoolExecutor21);
                f22957a = sparseArray;
            }
        }
    }

    public static void a(Runnable runnable, int i10) {
        if (runnable == null) {
            return;
        }
        ExecutorService executorService = f22957a.get(i10);
        if (executorService != null) {
            executorService.execute(new b2(runnable));
        } else {
            n7.h("AsyncExec", "no executor for type: %s", Integer.valueOf(i10));
        }
    }

    public static void b(Runnable runnable) {
        a(runnable, 1);
    }

    public static void c(Runnable runnable) {
        a(runnable, 4);
    }

    public static void d(Runnable runnable) {
        a(runnable, 2);
    }

    public static void e(Runnable runnable) {
        a(runnable, 3);
    }

    public static void f(Runnable runnable) {
        a(runnable, 5);
    }

    public static void g(Runnable runnable) {
        a(runnable, 14);
    }
}
