package com.applovin.impl.sdk;

import android.os.Process;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private static final AppLovinExceptionHandler f18442a = new AppLovinExceptionHandler();

    /* renamed from: b, reason: collision with root package name */
    private final Set<p> f18443b = new HashSet(2);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18444c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f18445d;

    public static AppLovinExceptionHandler shared() {
        return f18442a;
    }

    public void addSdk(p pVar) {
        this.f18443b.add(pVar);
    }

    public void enable() {
        if (this.f18444c.compareAndSet(false, true)) {
            this.f18445d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        long j10 = 1000;
        for (p pVar : this.f18443b) {
            if (!pVar.e()) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b("AppLovinExceptionHandler", "Detected unhandled exception");
                }
                pVar.aj().a(t.a.CRASH, CollectionUtils.map("top_main_method", th.toString()));
                pVar.G().trackEventSynchronously("paused");
                j10 = ((Long) pVar.a(com.applovin.impl.sdk.c.b.dz)).longValue();
            }
        }
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18445d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
