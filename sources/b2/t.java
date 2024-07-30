package b2;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final String f2850e = r1.h.e("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f2851a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2852b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2853c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2854d;

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f2855a = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f2855a);
            this.f2855a = this.f2855a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final t f2856s;

        /* renamed from: t, reason: collision with root package name */
        public final String f2857t;

        public c(t tVar, String str) {
            this.f2856s = tVar;
            this.f2857t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f2856s.f2854d) {
                if (((c) this.f2856s.f2852b.remove(this.f2857t)) != null) {
                    b bVar = (b) this.f2856s.f2853c.remove(this.f2857t);
                    if (bVar != null) {
                        bVar.a(this.f2857t);
                    }
                } else {
                    r1.h.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f2857t), new Throwable[0]);
                }
            }
        }
    }

    public t() {
        a aVar = new a();
        this.f2852b = new HashMap();
        this.f2853c = new HashMap();
        this.f2854d = new Object();
        this.f2851a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public final void a(String str, b bVar) {
        synchronized (this.f2854d) {
            r1.h.c().a(f2850e, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f2852b.put(str, cVar);
            this.f2853c.put(str, bVar);
            this.f2851a.schedule(cVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f2854d) {
            if (((c) this.f2852b.remove(str)) != null) {
                r1.h.c().a(f2850e, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f2853c.remove(str);
            }
        }
    }
}
