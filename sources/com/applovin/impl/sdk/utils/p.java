package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.y;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f19525a;

    /* renamed from: b, reason: collision with root package name */
    private Timer f19526b;

    /* renamed from: c, reason: collision with root package name */
    private long f19527c;

    /* renamed from: d, reason: collision with root package name */
    private long f19528d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f19529e;
    private long f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f19530g = new Object();

    private p(com.applovin.impl.sdk.p pVar, Runnable runnable) {
        this.f19525a = pVar;
        this.f19529e = runnable;
    }

    private TimerTask e() {
        return new TimerTask() { // from class: com.applovin.impl.sdk.utils.p.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    p.this.f19529e.run();
                    synchronized (p.this.f19530g) {
                        p.this.f19526b = null;
                    }
                } catch (Throwable th) {
                    try {
                        if (p.this.f19525a != null) {
                            p.this.f19525a.L();
                            if (y.a()) {
                                p.this.f19525a.L();
                                if (y.a()) {
                                    p.this.f19525a.L().b("Timer", "Encountered error while executing timed task", th);
                                }
                            }
                        }
                        synchronized (p.this.f19530g) {
                            p.this.f19526b = null;
                        }
                    } catch (Throwable th2) {
                        synchronized (p.this.f19530g) {
                            p.this.f19526b = null;
                            throw th2;
                        }
                    }
                }
            }
        };
    }

    public void d() {
        synchronized (this.f19530g) {
            Timer timer = this.f19526b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f19526b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.p pVar = this.f19525a;
                        if (pVar != null) {
                            pVar.L();
                            if (y.a()) {
                                this.f19525a.L();
                                if (y.a()) {
                                    this.f19525a.L().b("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.f19526b = null;
                    } catch (Throwable th2) {
                        this.f19526b = null;
                        this.f = 0L;
                        throw th2;
                    }
                }
                this.f = 0L;
            }
        }
    }

    public void b() {
        synchronized (this.f19530g) {
            Timer timer = this.f19526b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f = Math.max(1L, System.currentTimeMillis() - this.f19527c);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    public void c() {
        synchronized (this.f19530g) {
            long j10 = this.f;
            if (j10 > 0) {
                try {
                    long j11 = this.f19528d - j10;
                    this.f19528d = j11;
                    if (j11 < 0) {
                        this.f19528d = 0L;
                    }
                    Timer timer = new Timer();
                    this.f19526b = timer;
                    timer.schedule(e(), this.f19528d);
                    this.f19527c = System.currentTimeMillis();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    public static p a(long j10, com.applovin.impl.sdk.p pVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException(a3.l.k("Cannot create a scheduled timer. Invalid fire time passed in: ", j10, "."));
        }
        if (runnable != null) {
            p pVar2 = new p(pVar, runnable);
            pVar2.f19527c = System.currentTimeMillis();
            pVar2.f19528d = j10;
            try {
                Timer timer = new Timer();
                pVar2.f19526b = timer;
                timer.schedule(pVar2.e(), j10);
            } catch (OutOfMemoryError e10) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b("Timer", "Failed to create timer due to OOM error", e10);
                }
            }
            return pVar2;
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public long a() {
        if (this.f19526b != null) {
            return this.f19528d - (System.currentTimeMillis() - this.f19527c);
        }
        return this.f19528d - this.f;
    }
}
