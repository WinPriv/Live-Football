package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.applovin.impl.sdk.utils.a> f18484a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Activity> f18485b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Activity> f18486c;

    public a(Context context) {
        this.f18485b = new WeakReference<>(null);
        this.f18486c = new WeakReference<>(null);
        y.f("AppLovinSdk", "Attaching Activity lifecycle manager...");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f18485b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.f18486c = this.f18485b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return this.f18485b.get();
    }

    public Activity b() {
        return this.f18486c.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f18484a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f18484a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f18486c = new WeakReference<>(null);
        Iterator it = new ArrayList(this.f18484a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f18485b = weakReference;
        this.f18486c = weakReference;
        Iterator it = new ArrayList(this.f18484a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f18484a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f18484a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f18484a).iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.sdk.utils.a) it.next()).onActivityStopped(activity);
        }
    }

    public void a(com.applovin.impl.sdk.utils.a aVar) {
        this.f18484a.add(aVar);
    }

    public void b(com.applovin.impl.sdk.utils.a aVar) {
        this.f18484a.remove(aVar);
    }
}
