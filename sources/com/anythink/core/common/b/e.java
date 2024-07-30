package com.anythink.core.common.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4975a = "start_time";

    /* renamed from: b, reason: collision with root package name */
    public static final String f4976b = "end_time";

    /* renamed from: c, reason: collision with root package name */
    public static final String f4977c = "psid";

    /* renamed from: d, reason: collision with root package name */
    public static final String f4978d = "launch_mode";

    /* renamed from: e, reason: collision with root package name */
    public static final int f4979e = 0;
    public static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    long f4980g;

    /* renamed from: i, reason: collision with root package name */
    JSONObject f4982i;

    /* renamed from: l, reason: collision with root package name */
    private final String f4985l = e.class.getName();

    /* renamed from: j, reason: collision with root package name */
    Handler f4983j = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    Runnable f4984k = new Runnable() { // from class: com.anythink.core.common.b.e.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.e.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.a();
                }
            });
        }
    };

    /* renamed from: h, reason: collision with root package name */
    int f4981h = 0;

    public e(long j10) {
        this.f4980g = j10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.e.3
            @Override // java.lang.Runnable
            public final void run() {
                e.this.b();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        final long currentTimeMillis = System.currentTimeMillis();
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.e.2
            @Override // java.lang.Runnable
            public final void run() {
                e.this.a(currentTimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        System.currentTimeMillis();
        String p10 = n.a().p();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f4977c, n.a().r());
            jSONObject.put(f4975a, this.f4980g);
            jSONObject.put(f4976b, System.currentTimeMillis());
            jSONObject.put(f4978d, this.f4981h);
            this.f4982i = jSONObject;
            com.anythink.core.common.k.p.a(n.a().g(), g.o, p10 + "playRecord", jSONObject.toString());
            jSONObject.toString();
        } catch (Exception unused) {
        }
        if (com.anythink.core.c.b.a(n.a().g()).b(p10).D() == 1) {
            this.f4983j.postDelayed(this.f4984k, r0.B());
        }
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        if (this.f4982i != null) {
            com.anythink.core.common.k.p.a(n.a().g(), g.o, n.a().p() + "playRecord", "");
            this.f4980g = 0L;
            JSONObject jSONObject = this.f4982i;
            long optLong = jSONObject.optLong(f4975a);
            long optLong2 = jSONObject.optLong(f4976b);
            String optString = jSONObject.optString(f4977c);
            int optInt = jSONObject.optInt(f4978d);
            this.f4982i = null;
            com.anythink.core.common.j.c.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
            long j10 = (optLong2 - optLong) / 1000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(long j10) {
        this.f4983j.removeCallbacks(this.f4984k);
        com.anythink.core.c.a b10 = com.anythink.core.c.b.a(n.a().g()).b(n.a().p());
        JSONObject jSONObject = this.f4982i;
        if (jSONObject != null) {
            long optLong = jSONObject.optLong(f4975a);
            long optLong2 = jSONObject.optLong(f4976b);
            String optString = jSONObject.optString(f4977c);
            int optInt = jSONObject.optInt(f4978d);
            if (System.currentTimeMillis() - optLong2 > b10.B()) {
                long j11 = (optLong2 - optLong) / 1000;
                com.anythink.core.common.k.p.a(n.a().g(), g.o, n.a().p() + "playRecord", "");
                com.anythink.core.common.j.c.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
                this.f4980g = 0L;
            }
        }
        this.f4982i = null;
        if (this.f4980g == 0) {
            this.f4981h = 1;
            try {
                this.f4980g = n.a().a(n.a().g(), n.a().p(), 1);
            } catch (Exception unused) {
            }
        } else {
            String p10 = n.a().p();
            com.anythink.core.common.k.p.a(n.a().g(), g.o, p10 + "playRecord", "");
        }
        if (this.f4980g == 0) {
            this.f4980g = System.currentTimeMillis();
        }
        System.currentTimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
