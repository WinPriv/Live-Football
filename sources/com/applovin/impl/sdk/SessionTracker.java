package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f18463b = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    final p f18464a;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18465c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f18466d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f18467e = new AtomicInteger();
    private Date f;

    /* renamed from: g, reason: collision with root package name */
    private Date f18468g;

    public SessionTracker(p pVar) {
        this.f18464a = pVar;
        final Application application = (Application) p.y();
        application.registerActivityLifecycleCallbacks(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.SessionTracker.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                SessionTracker.this.a();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.applovin.impl.sdk.SessionTracker.2
            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i10) {
                SessionTracker.this.f18467e.set(i10);
                if (i10 == 20) {
                    SessionTracker.this.b();
                }
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() { // from class: com.applovin.impl.sdk.SessionTracker.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        SessionTracker.this.a();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    SessionTracker.this.b();
                }
            }
        }, intentFilter);
        if ((((Boolean) pVar.a(com.applovin.impl.sdk.c.b.cD)).booleanValue() || ((Boolean) pVar.a(com.applovin.impl.sdk.c.b.f18718db)).booleanValue()) && f18463b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, (Class<?>) AppKilledService.class);
            application.startService(intent);
            AppLovinBroadcastManager.registerReceiver(new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.sdk.SessionTracker.4
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Intent intent2, Map<String, Object> map) {
                    application.stopService(intent);
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    private void d() {
        this.f18464a.L();
        if (y.a()) {
            this.f18464a.L().b("SessionTracker", "Application Resumed");
        }
        boolean booleanValue = ((Boolean) this.f18464a.a(com.applovin.impl.sdk.c.b.dB)).booleanValue();
        long longValue = ((Long) this.f18464a.a(com.applovin.impl.sdk.c.b.dC)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f18465c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.f18468g == null || System.currentTimeMillis() - this.f18468g.getTime() >= millis) {
            this.f18464a.G().trackEvent("resumed");
            if (booleanValue) {
                this.f18468g = new Date();
            }
        }
        if (!booleanValue) {
            this.f18468g = new Date();
        }
        this.f18464a.P().a(com.applovin.impl.sdk.d.f.f18818m);
    }

    public int getLastTrimMemoryLevel() {
        return this.f18467e.get();
    }

    public boolean isApplicationPaused() {
        return this.f18466d.get();
    }

    public void pauseForClick() {
        this.f18465c.set(true);
    }

    public void resumeForClick() {
        this.f18465c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f18466d.compareAndSet(true, false)) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f18466d.compareAndSet(false, true)) {
            c();
        }
    }

    private void c() {
        this.f18464a.L();
        if (y.a()) {
            this.f18464a.L().b("SessionTracker", "Application Paused");
        }
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f18465c.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.f18464a.a(com.applovin.impl.sdk.c.b.dB)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f18464a.a(com.applovin.impl.sdk.c.b.dD)).longValue());
        if (this.f == null || System.currentTimeMillis() - this.f.getTime() >= millis) {
            this.f18464a.G().trackEvent("paused");
            if (booleanValue) {
                this.f = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.f = new Date();
    }
}
