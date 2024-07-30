package com.ironsource.sdk.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.sdk.utils.SDKUtils;

/* loaded from: classes2.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s, reason: collision with root package name */
    public final c f26400s;

    public a(c cVar) {
        this.f26400s = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!SDKUtils.isIronSourceActivity(activity)) {
            this.f26400s.d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!SDKUtils.isIronSourceActivity(activity)) {
            this.f26400s.e(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
