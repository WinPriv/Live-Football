package com.onesignal;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import com.onesignal.a;
import com.onesignal.u2;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ActivityLifecycleListener.java */
/* loaded from: classes2.dex */
public final class b implements ComponentCallbacks {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        a aVar = c.f26699t;
        Activity activity = aVar.f26635b;
        if (activity != null) {
            boolean z10 = false;
            try {
                if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & 128) != 0) {
                    z10 = true;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                e10.printStackTrace();
            }
            if (z10) {
                int i10 = configuration.orientation;
                if (i10 == 2) {
                    e3.b(6, "Configuration Orientation Change: LANDSCAPE (" + i10 + ") on activity: " + activity, null);
                } else if (i10 == 1) {
                    e3.b(6, "Configuration Orientation Change: PORTRAIT (" + i10 + ") on activity: " + activity, null);
                }
                aVar.b();
                ConcurrentHashMap concurrentHashMap = a.f26632d;
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    ((a.b) ((Map.Entry) it.next()).getValue()).b(activity);
                }
                Iterator it2 = concurrentHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    ((a.b) ((Map.Entry) it2.next()).getValue()).a(aVar.f26635b);
                }
                ViewTreeObserver viewTreeObserver = aVar.f26635b.getWindow().getDecorView().getViewTreeObserver();
                for (Map.Entry entry : a.f26633e.entrySet()) {
                    a.c cVar = new a.c(aVar, (u2.b) entry.getValue(), (String) entry.getKey());
                    viewTreeObserver.addOnGlobalLayoutListener(cVar);
                    a.f.put((String) entry.getKey(), cVar);
                }
                aVar.a();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
