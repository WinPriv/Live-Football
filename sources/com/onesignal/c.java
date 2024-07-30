package com.onesignal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.onesignal.a;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ActivityLifecycleListener.java */
/* loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s, reason: collision with root package name */
    public static c f26698s;

    /* renamed from: t, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static a f26699t;

    /* renamed from: u, reason: collision with root package name */
    public static b f26700u;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a aVar = f26699t;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a aVar = f26699t;
        if (aVar != null) {
            e3.b(6, "onActivityDestroyed: " + activity, null);
            a.f.clear();
            if (activity == aVar.f26635b) {
                aVar.f26635b = null;
                aVar.b();
            }
            aVar.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a aVar = f26699t;
        if (aVar != null) {
            e3.b(6, "onActivityPaused: " + activity, null);
            if (activity == aVar.f26635b) {
                aVar.f26635b = null;
                aVar.b();
            }
            aVar.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a aVar = f26699t;
        if (aVar != null) {
            e3.b(6, "onActivityResumed: " + activity, null);
            aVar.d(activity);
            aVar.c();
            aVar.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a aVar = f26699t;
        if (aVar != null) {
            boolean z10 = OSFocusHandler.f26606b;
            boolean z11 = false;
            OSFocusHandler oSFocusHandler = aVar.f26634a;
            if (z10) {
                oSFocusHandler.getClass();
                OSFocusHandler.f26606b = false;
                oSFocusHandler.f26609a = null;
                e3.b(6, "OSFocusHandler running onAppStartFocusLogic", null);
                m2 j10 = e3.j(e3.f26748b);
                j10.getClass();
                boolean a10 = OSUtils.a();
                if (j10.f26924t != a10) {
                    z11 = true;
                }
                j10.f26924t = a10;
                if (z11) {
                    j10.f26923s.a(j10);
                    return;
                }
                return;
            }
            oSFocusHandler.getClass();
            OSFocusHandler.f26606b = false;
            o0 o0Var = oSFocusHandler.f26609a;
            if (o0Var != null) {
                y2.b().a(o0Var);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a aVar = f26699t;
        if (aVar != null) {
            e3.b(6, "onActivityStopped: " + activity, null);
            if (activity == aVar.f26635b) {
                aVar.f26635b = null;
                aVar.b();
            }
            Iterator it = a.f26632d.entrySet().iterator();
            while (it.hasNext()) {
                ((a.b) ((Map.Entry) it.next()).getValue()).b(activity);
            }
            aVar.c();
            if (aVar.f26635b == null) {
                OSFocusHandler oSFocusHandler = aVar.f26634a;
                oSFocusHandler.getClass();
                o0 o0Var = o0.f26955s;
                y2.b().c(1500L, o0Var);
                oSFocusHandler.f26609a = o0Var;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
