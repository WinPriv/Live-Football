package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final p f18634a;

    /* renamed from: b, reason: collision with root package name */
    private final y f18635b;

    /* renamed from: c, reason: collision with root package name */
    private final a f18636c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.p f18637d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f18638e = new Object();
    private long f;

    /* loaded from: classes.dex */
    public interface a {
        void onAdExpired();
    }

    public b(p pVar, a aVar) {
        this.f18634a = pVar;
        this.f18635b = pVar.L();
        this.f18636c = aVar;
    }

    private void b() {
        com.applovin.impl.sdk.utils.p pVar = this.f18637d;
        if (pVar != null) {
            pVar.d();
            this.f18637d = null;
        }
    }

    private void c() {
        synchronized (this.f18638e) {
            b();
        }
    }

    private void d() {
        boolean z10;
        synchronized (this.f18638e) {
            long currentTimeMillis = this.f - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                a();
                z10 = true;
            } else {
                a(currentTimeMillis);
                z10 = false;
            }
        }
        if (z10) {
            this.f18636c.onAdExpired();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        }
    }

    public boolean a(com.applovin.impl.mediation.a.a aVar) {
        long I;
        if (aVar instanceof com.applovin.impl.mediation.a.c) {
            I = ((com.applovin.impl.mediation.a.c) aVar).Q();
        } else if (aVar instanceof com.applovin.impl.mediation.a.d) {
            I = ((com.applovin.impl.mediation.a.d) aVar).I();
        } else {
            throw new IllegalArgumentException("Ad does not support scheduling expiration");
        }
        long elapsedRealtime = I - (SystemClock.elapsedRealtime() - aVar.w());
        if (elapsedRealtime > 2000) {
            if (y.a()) {
                this.f18635b.b("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime) + " seconds from now for " + aVar.getAdUnitId() + "...");
            }
            a(elapsedRealtime);
            return true;
        }
        if (!y.a()) {
            return false;
        }
        this.f18635b.b("AdExpirationManager", "Ad is already expired");
        return false;
    }

    private void a(long j10) {
        synchronized (this.f18638e) {
            a();
            this.f = System.currentTimeMillis() + j10;
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            if (((Boolean) this.f18634a.a(com.applovin.impl.sdk.c.b.bF)).booleanValue() || !this.f18634a.Y().isApplicationPaused()) {
                this.f18637d = com.applovin.impl.sdk.utils.p.a(j10, this.f18634a, new Runnable() { // from class: com.applovin.impl.sdk.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.a();
                        b.this.f18636c.onAdExpired();
                    }
                });
            }
        }
    }

    public void a() {
        synchronized (this.f18638e) {
            b();
            AppLovinBroadcastManager.unregisterReceiver(this);
        }
    }
}
