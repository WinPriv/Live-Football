package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.Utils;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f18881a = Executors.newFixedThreadPool(4);

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f18882b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f18883c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f18884d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f18885e;
    private final List<c> f = new ArrayList(5);

    /* renamed from: g, reason: collision with root package name */
    private final Object f18886g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private boolean f18887h;

    /* loaded from: classes.dex */
    public enum a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_NATIVE,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_APP_OPEN,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    /* loaded from: classes.dex */
    public class b implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        private final String f18910b;

        public b(String str) {
            this.f18910b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f18910b + com.huawei.openalliance.ad.constant.w.bE + Utils.shortenKey(o.this.f18882b.B()));
            thread.setDaemon(true);
            thread.setPriority(((Integer) o.this.f18882b.a(com.applovin.impl.sdk.c.b.fP)).intValue());
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.impl.sdk.e.o.b.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    com.applovin.impl.sdk.y unused = o.this.f18883c;
                    if (com.applovin.impl.sdk.y.a()) {
                        o.this.f18883c.b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f18912a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18913b;

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.y f18914c;

        /* renamed from: d, reason: collision with root package name */
        private final com.applovin.impl.sdk.e.a f18915d;

        /* renamed from: e, reason: collision with root package name */
        private final a f18916e;

        public c(com.applovin.impl.sdk.p pVar, com.applovin.impl.sdk.e.a aVar, a aVar2) {
            this.f18912a = pVar;
            this.f18914c = pVar.L();
            this.f18913b = aVar.e();
            this.f18915d = aVar;
            this.f18916e = aVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.sdk.utils.h.a()     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.p r1 = r6.f18912a     // Catch: java.lang.Throwable -> L4a
                boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L35
                com.applovin.impl.sdk.e.a r1 = r6.f18915d     // Catch: java.lang.Throwable -> L4a
                boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L16
                goto L35
            L16:
                boolean r1 = com.applovin.impl.sdk.y.a()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L25
                com.applovin.impl.sdk.y r1 = r6.f18914c     // Catch: java.lang.Throwable -> L4a
                java.lang.String r2 = r6.f18913b     // Catch: java.lang.Throwable -> L4a
                java.lang.String r3 = "Task re-scheduled..."
                r1.c(r2, r3)     // Catch: java.lang.Throwable -> L4a
            L25:
                com.applovin.impl.sdk.p r1 = r6.f18912a     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.e.o r1 = r1.M()     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.e.a r2 = r6.f18915d     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.e.o$a r3 = r6.f18916e     // Catch: java.lang.Throwable -> L4a
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L4a
                goto L3a
            L35:
                com.applovin.impl.sdk.e.a r1 = r6.f18915d     // Catch: java.lang.Throwable -> L4a
                r1.run()     // Catch: java.lang.Throwable -> L4a
            L3a:
                boolean r1 = com.applovin.impl.sdk.y.a()
                if (r1 == 0) goto L81
                com.applovin.impl.sdk.y r1 = r6.f18914c
                java.lang.String r2 = r6.f18913b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                goto L69
            L4a:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.y.a()     // Catch: java.lang.Throwable -> L82
                if (r2 == 0) goto L5a
                com.applovin.impl.sdk.y r2 = r6.f18914c     // Catch: java.lang.Throwable -> L82
                java.lang.String r3 = r6.f18913b     // Catch: java.lang.Throwable -> L82
                java.lang.String r4 = "Task failed execution"
                r2.b(r3, r4, r1)     // Catch: java.lang.Throwable -> L82
            L5a:
                boolean r1 = com.applovin.impl.sdk.y.a()
                if (r1 == 0) goto L81
                com.applovin.impl.sdk.y r1 = r6.f18914c
                java.lang.String r2 = r6.f18913b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L69:
                com.applovin.impl.sdk.e.o$a r4 = r6.f18916e
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f18915d
                java.lang.String r0 = r0.e()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.c(r2, r0)
            L81:
                return
            L82:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.y.a()
                if (r2 == 0) goto Laa
                com.applovin.impl.sdk.y r2 = r6.f18914c
                java.lang.String r3 = r6.f18913b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sdk.e.o$a r5 = r6.f18916e
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f18915d
                java.lang.String r0 = r0.e()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.c(r3, r0)
            Laa:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.o.c.run():void");
        }
    }

    public o(com.applovin.impl.sdk.p pVar) {
        this.f18882b = pVar;
        this.f18883c = pVar.L();
        this.f18884d = a("auxiliary_operations", ((Integer) pVar.a(com.applovin.impl.sdk.c.b.cr)).intValue());
        this.f18885e = a("shared_thread_pool", ((Integer) pVar.a(com.applovin.impl.sdk.c.b.as)).intValue());
    }

    public void d() {
        synchronized (this.f18886g) {
            this.f18887h = false;
        }
    }

    public void e() {
        synchronized (this.f18886g) {
            this.f18887h = true;
            for (c cVar : this.f) {
                a(cVar.f18915d, cVar.f18916e);
            }
            this.f.clear();
        }
    }

    public boolean a() {
        return this.f18887h;
    }

    public Executor b() {
        return this.f18885e;
    }

    public ExecutorService c() {
        return f18881a;
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2) {
        a(aVar, aVar2, 0L);
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j10) {
        a(aVar, aVar2, j10, false);
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j10, boolean z10) {
        if (aVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 >= 0) {
            if (!a(new c(this.f18882b, aVar, aVar2))) {
                a(aVar, j10, z10);
                return;
            } else {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18883c.c(aVar.e(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(a3.k.k("Invalid delay (millis) specified: ", j10));
    }

    public void a(Runnable runnable) {
        this.f18884d.submit(runnable);
    }

    public void a(com.applovin.impl.sdk.e.a aVar) {
        if (aVar != null) {
            try {
                if (Utils.isMainThread() && ((Boolean) this.f18882b.a(com.applovin.impl.sdk.c.b.fO)).booleanValue()) {
                    this.f18885e.submit(aVar);
                } else {
                    aVar.run();
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18883c.b(aVar.e(), "Task failed execution", th);
                    return;
                }
                return;
            }
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18883c.e("TaskManager", "Attempted to execute null task immediately");
        }
    }

    private void a(final Runnable runnable, long j10, boolean z10) {
        if (j10 <= 0) {
            this.f18885e.submit(runnable);
        } else if (z10) {
            com.applovin.impl.sdk.utils.f.a(j10, this.f18882b, new Runnable() { // from class: com.applovin.impl.sdk.e.o.1
                @Override // java.lang.Runnable
                public void run() {
                    o.this.f18885e.execute(runnable);
                }
            });
        } else {
            this.f18885e.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        }
    }

    private boolean a(c cVar) {
        if (cVar.f18915d.g()) {
            return false;
        }
        synchronized (this.f18886g) {
            if (this.f18887h) {
                return false;
            }
            this.f.add(cVar);
            return true;
        }
    }

    private ScheduledThreadPoolExecutor a(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new b(str));
    }
}
