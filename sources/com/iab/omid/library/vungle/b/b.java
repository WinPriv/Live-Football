package com.iab.omid.library.vungle.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f24491a = new b();

    /* renamed from: b, reason: collision with root package name */
    private boolean f24492b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24493c;

    /* renamed from: d, reason: collision with root package name */
    private a f24494d;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z10);
    }

    private b() {
    }

    public static b a() {
        return f24491a;
    }

    private void e() {
        boolean z10 = !this.f24493c;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    public void b() {
        this.f24492b = true;
        this.f24493c = false;
        e();
    }

    public void c() {
        this.f24492b = false;
        this.f24493c = false;
        this.f24494d = null;
    }

    public ActivityManager.RunningAppProcessInfo d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        boolean z10;
        View d10;
        boolean z11 = true;
        if (d().importance != 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = true;
        for (com.iab.omid.library.vungle.adsession.a aVar : com.iab.omid.library.vungle.b.a.a().c()) {
            if (aVar.e() && (d10 = aVar.d()) != null && d10.hasWindowFocus()) {
                z12 = false;
            }
        }
        if (!z10 || !z12) {
            z11 = false;
        }
        a(z11);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void a(a aVar) {
        this.f24494d = aVar;
    }

    private void a(boolean z10) {
        if (this.f24493c != z10) {
            this.f24493c = z10;
            if (this.f24492b) {
                e();
                a aVar = this.f24494d;
                if (aVar != null) {
                    aVar.a(!z10);
                }
            }
        }
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
