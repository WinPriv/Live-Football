package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.p f18953a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18954b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18955c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private boolean f18956d;

    /* renamed from: e, reason: collision with root package name */
    private final p f18957e;
    private final WeakReference<a> f;

    /* renamed from: g, reason: collision with root package name */
    private long f18958g;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRefresh();
    }

    public f(p pVar, a aVar) {
        this.f = new WeakReference<>(aVar);
        this.f18957e = pVar;
    }

    private void i() {
        synchronized (this.f18954b) {
            com.applovin.impl.sdk.utils.p pVar = this.f18953a;
            if (pVar != null) {
                pVar.b();
            } else {
                this.f18957e.L();
                if (y.a()) {
                    this.f18957e.L().b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f18955c.set(true);
            }
        }
    }

    private void j() {
        synchronized (this.f18954b) {
            com.applovin.impl.sdk.utils.p pVar = this.f18953a;
            if (pVar != null) {
                pVar.c();
            } else {
                this.f18955c.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        synchronized (this.f18954b) {
            this.f18953a = null;
            if (!((Boolean) this.f18957e.a(com.applovin.impl.sdk.c.a.f18696r)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void l() {
        if (((Boolean) this.f18957e.a(com.applovin.impl.sdk.c.a.f18695q)).booleanValue()) {
            i();
        }
    }

    private void m() {
        if (((Boolean) this.f18957e.a(com.applovin.impl.sdk.c.a.f18695q)).booleanValue()) {
            synchronized (this.f18954b) {
                if (this.f18956d) {
                    this.f18957e.L();
                    if (y.a()) {
                        this.f18957e.L().b("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f18957e.Y().isApplicationPaused()) {
                    this.f18957e.L();
                    if (y.a()) {
                        this.f18957e.L().b("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    com.applovin.impl.sdk.utils.p pVar = this.f18953a;
                    if (pVar != null) {
                        pVar.c();
                    }
                }
            }
        }
    }

    public void c() {
        synchronized (this.f18954b) {
            com.applovin.impl.sdk.utils.p pVar = this.f18953a;
            if (pVar != null) {
                pVar.d();
                k();
            }
        }
    }

    public void d() {
        synchronized (this.f18954b) {
            i();
            this.f18956d = true;
        }
    }

    public void e() {
        synchronized (this.f18954b) {
            j();
            this.f18956d = false;
        }
    }

    public boolean f() {
        return this.f18956d;
    }

    public void g() {
        if (((Boolean) this.f18957e.a(com.applovin.impl.sdk.c.a.f18694p)).booleanValue()) {
            i();
        }
    }

    public void h() {
        a aVar;
        if (((Boolean) this.f18957e.a(com.applovin.impl.sdk.c.a.f18694p)).booleanValue()) {
            synchronized (this.f18954b) {
                if (this.f18956d) {
                    this.f18957e.L();
                    if (y.a()) {
                        this.f18957e.L().b("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.f18957e.Z().b()) {
                    this.f18957e.L();
                    if (y.a()) {
                        this.f18957e.L().b("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                boolean z10 = false;
                if (this.f18953a != null) {
                    long b10 = this.f18958g - b();
                    long longValue = ((Long) this.f18957e.a(com.applovin.impl.sdk.c.a.o)).longValue();
                    if (longValue >= 0 && b10 > longValue) {
                        c();
                        z10 = true;
                    } else {
                        this.f18953a.c();
                    }
                }
                if (z10 && (aVar = this.f.get()) != null) {
                    aVar.onAdRefresh();
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            g();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m();
        }
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f18954b) {
            z10 = this.f18953a != null;
        }
        return z10;
    }

    public long b() {
        long a10;
        synchronized (this.f18954b) {
            com.applovin.impl.sdk.utils.p pVar = this.f18953a;
            a10 = pVar != null ? pVar.a() : -1L;
        }
        return a10;
    }

    public void a(long j10) {
        synchronized (this.f18954b) {
            c();
            this.f18958g = j10;
            this.f18953a = com.applovin.impl.sdk.utils.p.a(j10, this.f18957e, new Runnable() { // from class: com.applovin.impl.sdk.f.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.k();
                    a aVar = (a) f.this.f.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f18957e.a(com.applovin.impl.sdk.c.a.f18696r)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f18957e.a(com.applovin.impl.sdk.c.a.f18695q)).booleanValue() && (this.f18957e.Z().b() || this.f18957e.Y().isApplicationPaused())) {
                this.f18953a.b();
            }
            if (this.f18955c.compareAndSet(true, false) && ((Boolean) this.f18957e.a(com.applovin.impl.sdk.c.a.f18697s)).booleanValue()) {
                this.f18957e.L();
                if (y.a()) {
                    this.f18957e.L().b("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f18953a.b();
            }
        }
    }
}
