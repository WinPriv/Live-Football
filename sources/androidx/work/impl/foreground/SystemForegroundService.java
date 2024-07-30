package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.a;
import d2.b;
import java.util.UUID;
import r1.h;
import s1.c;
import s1.j;

/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements a.InterfaceC0027a {

    /* renamed from: x, reason: collision with root package name */
    public static final String f2676x = h.e("SystemFgService");

    /* renamed from: t, reason: collision with root package name */
    public Handler f2677t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2678u;

    /* renamed from: v, reason: collision with root package name */
    public a f2679v;

    /* renamed from: w, reason: collision with root package name */
    public NotificationManager f2680w;

    public final void a() {
        this.f2677t = new Handler(Looper.getMainLooper());
        this.f2680w = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f2679v = aVar;
        if (aVar.A != null) {
            h.c().b(a.B, "A callback already exists.", new Throwable[0]);
        } else {
            aVar.A = this;
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f2679v;
        aVar.A = null;
        synchronized (aVar.f2683u) {
            aVar.f2687z.c();
        }
        c cVar = aVar.f2681s.f;
        synchronized (cVar.C) {
            cVar.B.remove(aVar);
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.f2678u;
        String str = f2676x;
        if (z10) {
            h.c().d(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            a aVar = this.f2679v;
            aVar.A = null;
            synchronized (aVar.f2683u) {
                aVar.f2687z.c();
            }
            c cVar = aVar.f2681s.f;
            synchronized (cVar.C) {
                cVar.B.remove(aVar);
            }
            a();
            this.f2678u = false;
        }
        if (intent != null) {
            a aVar2 = this.f2679v;
            aVar2.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = a.B;
            j jVar = aVar2.f2681s;
            if (equals) {
                h.c().d(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
                ((b) aVar2.f2682t).a(new z1.b(aVar2, jVar.f35074c, intent.getStringExtra("KEY_WORKSPEC_ID")));
                aVar2.f(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                aVar2.f(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                h.c().d(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    jVar.getClass();
                    ((b) jVar.f35075d).a(new b2.a(jVar, fromString));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                h.c().d(str2, "Stopping foreground service", new Throwable[0]);
                a.InterfaceC0027a interfaceC0027a = aVar2.A;
                if (interfaceC0027a != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0027a;
                    systemForegroundService.f2678u = true;
                    h.c().a(str, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
