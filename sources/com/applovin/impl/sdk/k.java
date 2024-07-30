package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class k extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    public static int f18988a = -1;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f18989b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f18990c;

    /* renamed from: d, reason: collision with root package name */
    private final p f18991d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<a> f18992e = new HashSet();
    private final Object f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private boolean f18993g;

    /* renamed from: h, reason: collision with root package name */
    private int f18994h;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10);
    }

    public k(p pVar) {
        this.f18991d = pVar;
        Context y = p.y();
        this.f18990c = y;
        this.f18989b = (AudioManager) y.getSystemService(com.anythink.expressad.exoplayer.k.o.f9069b);
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void c() {
        this.f18991d.L();
        if (y.a()) {
            this.f18991d.L().b("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f18990c.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void b(a aVar) {
        synchronized (this.f) {
            if (this.f18992e.contains(aVar)) {
                this.f18992e.remove(aVar);
                if (this.f18992e.isEmpty()) {
                    c();
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f18989b.getRingerMode());
        }
    }

    public int a() {
        return this.f18989b.getRingerMode();
    }

    public void a(a aVar) {
        synchronized (this.f) {
            if (this.f18992e.contains(aVar)) {
                return;
            }
            this.f18992e.add(aVar);
            if (this.f18992e.size() == 1) {
                b();
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f18993g = true;
            this.f18994h = this.f18989b.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f18993g = false;
            if (this.f18994h != this.f18989b.getRingerMode()) {
                this.f18994h = f18988a;
                b(this.f18989b.getRingerMode());
            }
        }
    }

    private void b() {
        this.f18991d.L();
        if (y.a()) {
            this.f18991d.L().b("AudioSessionManager", "Observing ringer mode...");
        }
        this.f18994h = f18988a;
        this.f18990c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(final int i10) {
        if (this.f18993g) {
            return;
        }
        this.f18991d.L();
        if (y.a()) {
            this.f18991d.L().b("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f) {
            for (final a aVar : this.f18992e) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k.1
                    @Override // java.lang.Runnable
                    public void run() {
                        aVar.a(i10);
                    }
                });
            }
        }
    }
}
