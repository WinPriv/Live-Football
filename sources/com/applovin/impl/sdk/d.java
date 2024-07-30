package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private static final long f18763a = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: b, reason: collision with root package name */
    private final p f18764b;

    /* renamed from: c, reason: collision with root package name */
    private final y f18765c;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<c> f18766d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final Object f18767e = new Object();

    /* loaded from: classes.dex */
    public interface a {
        void onAdExpired(com.applovin.impl.sdk.ad.g gVar);
    }

    public d(p pVar) {
        this.f18764b = pVar;
        this.f18765c = pVar.L();
    }

    private c b(com.applovin.impl.sdk.ad.g gVar) {
        synchronized (this.f18767e) {
            Iterator<c> it = this.f18766d.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (gVar == next.a()) {
                    return next;
                }
            }
            return null;
        }
    }

    public boolean a(com.applovin.impl.sdk.ad.g gVar, a aVar) {
        synchronized (this.f18767e) {
            if (b(gVar) != null) {
                if (y.a()) {
                    this.f18765c.b("AdNewExpirationManager", "Ad expiration already scheduled for ad: " + gVar);
                }
                return true;
            }
            if (gVar.P() <= f18763a) {
                if (y.a()) {
                    this.f18765c.b("AdNewExpirationManager", "Ad has already expired: " + gVar);
                }
                gVar.R();
                return false;
            }
            if (y.a()) {
                this.f18765c.b("AdNewExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(gVar.P()) + " seconds from now for " + gVar + "...");
            }
            if (this.f18766d.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.f18766d.add(c.a(gVar, aVar, this.f18764b));
            return true;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.f18767e) {
            Iterator<c> it = this.f18766d.iterator();
            while (it.hasNext()) {
                c next = it.next();
                long P = next.a().P();
                if (P <= 0) {
                    if (y.a()) {
                        this.f18765c.b("AdNewExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + next.a());
                    }
                    hashSet.add(next);
                } else {
                    if (y.a()) {
                        this.f18765c.b("AdNewExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(P) + " seconds for ad: " + next.a());
                    }
                    next.a(P);
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            a(cVar);
            cVar.c();
        }
    }

    public void a(com.applovin.impl.sdk.ad.g gVar) {
        synchronized (this.f18767e) {
            c b10 = b(gVar);
            if (b10 != null) {
                if (y.a()) {
                    this.f18765c.b("AdNewExpirationManager", "Cancelling expiration timer for ad: " + gVar);
                }
                b10.b();
                a(b10);
            }
        }
    }

    public void a(c cVar) {
        synchronized (this.f18767e) {
            this.f18766d.remove(cVar);
            if (this.f18766d.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void a() {
        synchronized (this.f18767e) {
            Iterator<c> it = this.f18766d.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }
}
