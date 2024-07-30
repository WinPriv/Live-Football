package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final a f19556a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final p f19557b;

    /* renamed from: d, reason: collision with root package name */
    private long f19559d;

    /* renamed from: g, reason: collision with root package name */
    private long f19561g;

    /* renamed from: h, reason: collision with root package name */
    private Object f19562h;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f19558c = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final Object f19560e = new Object();
    private final AtomicBoolean f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, a> f19563i = CollectionUtils.map();

    /* renamed from: j, reason: collision with root package name */
    private final Object f19564j = new Object();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f19570a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f19571b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f19571b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a((Object) this) && a() == aVar.a() && b() == aVar.b()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long a10 = a();
            return b() + ((((int) (a10 ^ (a10 >>> 32))) + 59) * 59);
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + a() + ", attemptCount=" + b() + ")";
        }

        public static /* synthetic */ int a(a aVar) {
            int i10 = aVar.f19571b;
            aVar.f19571b = i10 + 1;
            return i10;
        }

        public long a() {
            return this.f19570a;
        }
    }

    public w(p pVar) {
        this.f19557b = pVar;
    }

    public boolean a() {
        return this.f.get();
    }

    public boolean b() {
        return this.f19558c.get();
    }

    public Object c() {
        return this.f19562h;
    }

    public void a(boolean z10) {
        synchronized (this.f19560e) {
            this.f.set(z10);
            if (z10) {
                this.f19561g = System.currentTimeMillis();
                this.f19557b.L();
                if (y.a()) {
                    this.f19557b.L().b("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f19561g);
                }
                final long longValue = ((Long) this.f19557b.a(com.applovin.impl.sdk.c.b.ct)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.w.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (w.this.a() && System.currentTimeMillis() - w.this.f19561g >= longValue) {
                                w.this.f19557b.L();
                                if (y.a()) {
                                    w.this.f19557b.L().b("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                }
                                w.this.f.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.f19561g = 0L;
                this.f19557b.L();
                if (y.a()) {
                    this.f19557b.L().b("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                }
            }
        }
    }

    public void b(Object obj) {
        if (!com.applovin.impl.mediation.d.c.a(obj) && this.f19558c.compareAndSet(true, false)) {
            this.f19562h = null;
            this.f19557b.L();
            if (y.a()) {
                this.f19557b.L().b("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void c(String str) {
        synchronized (this.f19564j) {
            this.f19563i.remove(str);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f19564j) {
            aVar = this.f19563i.get(str);
            if (aVar == null) {
                aVar = f19556a;
            }
        }
        return aVar;
    }

    public void a(final Object obj) {
        if (!com.applovin.impl.mediation.d.c.a(obj) && this.f19558c.compareAndSet(false, true)) {
            this.f19562h = obj;
            this.f19559d = System.currentTimeMillis();
            this.f19557b.L();
            if (y.a()) {
                this.f19557b.L().b("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f19559d);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            final long longValue = ((Long) this.f19557b.a(com.applovin.impl.sdk.c.b.cu)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.w.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (w.this.f19558c.get() && System.currentTimeMillis() - w.this.f19559d >= longValue) {
                            w.this.f19557b.L();
                            if (y.a()) {
                                w.this.f19557b.L().b("FullScreenAdTracker", "Resetting \"display\" state...");
                            }
                            w.this.b(obj);
                        }
                    }
                }, longValue);
            }
        }
    }

    public void a(String str) {
        synchronized (this.f19564j) {
            a aVar = this.f19563i.get(str);
            if (aVar == null) {
                aVar = new a();
                this.f19563i.put(str, aVar);
            }
            aVar.f19570a = System.currentTimeMillis();
            a.a(aVar);
        }
    }
}
