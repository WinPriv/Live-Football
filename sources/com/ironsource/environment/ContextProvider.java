package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ContextProvider {

    /* renamed from: e, reason: collision with root package name */
    public static volatile ContextProvider f24614e;

    /* renamed from: a, reason: collision with root package name */
    public Activity f24615a;

    /* renamed from: b, reason: collision with root package name */
    public Context f24616b;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f24618d = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f24617c = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f24614e == null) {
            synchronized (ContextProvider.class) {
                if (f24614e == null) {
                    f24614e = new ContextProvider();
                }
            }
        }
        return f24614e;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f24616b;
        if (context == null && (activity = this.f24615a) != null) {
            return activity.getApplicationContext();
        }
        return context;
    }

    public Activity getCurrentActiveActivity() {
        return this.f24615a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator<a> it = this.f24617c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f24615a = activity;
            Iterator<a> it = this.f24617c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f24615a);
            }
        }
    }

    @Deprecated
    public void postOnUIThread(Runnable runnable) {
        Handler handler = this.f24618d;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f24617c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f24615a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f24616b = context;
        }
    }
}
