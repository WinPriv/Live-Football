package com.ironsource.environment.e;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import zc.d;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f24668a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f24669b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public static final b f24670c;

    static {
        b bVar = new b("background");
        bVar.start();
        bVar.a();
        f24670c = bVar;
    }

    private c() {
    }

    public static ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final void b(Runnable runnable) {
        d.d(runnable, "action");
        a(runnable, 0L);
    }

    public final void c(Runnable runnable) {
        d.d(runnable, "action");
        b(runnable, 0L);
    }

    public static void a(Runnable runnable) {
        d.d(runnable, "action");
        f24669b.removeCallbacks(runnable);
    }

    public static void b(Runnable runnable, long j10) {
        d.d(runnable, "action");
        f24670c.a(runnable, j10);
    }

    public static void a(Runnable runnable, long j10) {
        d.d(runnable, "action");
        f24669b.postDelayed(runnable, j10);
    }
}
