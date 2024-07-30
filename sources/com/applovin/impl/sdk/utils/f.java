package com.applovin.impl.sdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<f> f19402a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final p f19403b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f19404c;

    private f(long j10, com.applovin.impl.sdk.p pVar, final Runnable runnable) {
        this.f19403b = p.a(j10, pVar, new Runnable() { // from class: com.applovin.impl.sdk.utils.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.a();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.f19404c = pVar;
        f19402a.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public static f a(long j10, com.applovin.impl.sdk.p pVar, Runnable runnable) {
        return new f(j10, pVar, runnable);
    }

    public long b() {
        return this.f19403b.a();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f19403b.b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f19403b.c();
        }
    }

    public void a() {
        this.f19403b.d();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f19402a.remove(this);
    }
}
