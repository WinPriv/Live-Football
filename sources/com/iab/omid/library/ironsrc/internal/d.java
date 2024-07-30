package com.iab.omid.library.ironsrc.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f24386a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f24387b;

    /* renamed from: c, reason: collision with root package name */
    private a f24388c;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z10);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean c() {
        return this.f24387b;
    }

    public boolean d() {
        return false;
    }

    public void e() {
        this.f24386a = true;
        boolean a10 = a();
        this.f24387b = a10;
        b(a10);
    }

    public void f() {
        this.f24386a = false;
        this.f24388c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a());
    }

    public void a(a aVar) {
        this.f24388c = aVar;
    }

    public void b(boolean z10) {
    }

    private void a(boolean z10) {
        if (this.f24387b != z10) {
            this.f24387b = z10;
            if (this.f24386a) {
                b(z10);
                a aVar = this.f24388c;
                if (aVar != null) {
                    aVar.a(z10);
                }
            }
        }
    }

    private boolean a() {
        return (b().importance == 100) || d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
