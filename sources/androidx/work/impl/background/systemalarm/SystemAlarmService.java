package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.d;
import b2.o;
import java.util.HashMap;
import java.util.WeakHashMap;
import r1.h;

/* loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService implements d.c {

    /* renamed from: v, reason: collision with root package name */
    public static final String f2642v = h.e("SystemAlarmService");

    /* renamed from: t, reason: collision with root package name */
    public d f2643t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2644u;

    public final void a() {
        d dVar = new d(this);
        this.f2643t = dVar;
        if (dVar.B != null) {
            h.c().b(d.C, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            dVar.B = this;
        }
    }

    public final void b() {
        this.f2644u = true;
        h.c().a(f2642v, "All commands completed in dispatcher", new Throwable[0]);
        String str = o.f2830a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = o.f2831b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                h.c().f(o.f2830a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
        this.f2644u = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2644u = true;
        this.f2643t.d();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f2644u) {
            h.c().d(f2642v, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f2643t.d();
            a();
            this.f2644u = false;
        }
        if (intent != null) {
            this.f2643t.a(i11, intent);
            return 3;
        }
        return 3;
    }
}
