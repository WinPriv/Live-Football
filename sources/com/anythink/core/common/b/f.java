package com.anythink.core.common.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    int f4991a;

    /* renamed from: d, reason: collision with root package name */
    boolean f4994d;

    /* renamed from: c, reason: collision with root package name */
    boolean f4993c = false;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f4992b = new ConcurrentHashMap<>(3);

    public f(boolean z10) {
        this.f4994d = false;
        if (z10) {
            this.f4994d = true;
            a();
        }
    }

    private static void a() {
        com.anythink.core.common.j.c.a();
        com.anythink.core.common.j.a.a(n.a().g()).a(21, new com.anythink.core.common.e.e());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4994d) {
            this.f4994d = true;
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        n.a().a(activity);
        this.f4991a++;
        this.f4992b.put(activity.toString(), Boolean.TRUE);
        if (this.f4991a == 1 && !this.f4994d) {
            this.f4994d = true;
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f4991a--;
        boolean containsKey = this.f4992b.containsKey(activity.toString());
        if (!this.f4993c && !containsKey) {
            this.f4993c = true;
            this.f4991a++;
        }
        if (containsKey) {
            try {
                this.f4992b.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        if (this.f4991a == 0) {
            this.f4994d = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
