package i8;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: FcmLifecycleCallbacks.java */
/* loaded from: classes2.dex */
public final class l implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s, reason: collision with root package name */
    public final Set<Intent> f29284s = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Intent r5) {
        /*
            java.lang.String r0 = "FirebaseMessaging"
            android.os.Bundle r5 = r5.getExtras()     // Catch: java.lang.RuntimeException -> Lf
            if (r5 == 0) goto L15
            java.lang.String r1 = "gcm.n.analytics_data"
            android.os.Bundle r5 = r5.getBundle(r1)     // Catch: java.lang.RuntimeException -> Lf
            goto L16
        Lf:
            r5 = move-exception
            java.lang.String r1 = "Failed trying to get analytics data from Intent extras."
            android.util.Log.w(r0, r1, r5)
        L15:
            r5 = 0
        L16:
            java.lang.String r1 = "1"
            if (r5 != 0) goto L1c
            r2 = 0
            goto L26
        L1c:
            java.lang.String r2 = "google.c.a.e"
            java.lang.String r2 = r5.getString(r2)
            boolean r2 = r1.equals(r2)
        L26:
            if (r2 == 0) goto L93
            if (r5 != 0) goto L2b
            goto L8e
        L2b:
            java.lang.String r2 = "google.c.a.tc"
            java.lang.String r2 = r5.getString(r2)
            boolean r1 = r1.equals(r2)
            r2 = 3
            if (r1 == 0) goto L83
            n7.e r1 = n7.e.b()
            r1.a()
            s7.j r1 = r1.f33461d
            java.lang.Class<p7.a> r3 = p7.a.class
            java.lang.Object r1 = r1.a(r3)
            p7.a r1 = (p7.a) r1
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L54
            java.lang.String r2 = "Received event with track-conversion=true. Setting user property and reengagement event"
            android.util.Log.d(r0, r2)
        L54:
            if (r1 == 0) goto L7d
            java.lang.String r0 = "google.c.a.c_id"
            java.lang.String r0 = r5.getString(r0)
            r1.b(r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "source"
            java.lang.String r4 = "Firebase"
            r2.putString(r3, r4)
            java.lang.String r3 = "medium"
            java.lang.String r4 = "notification"
            r2.putString(r3, r4)
            java.lang.String r3 = "campaign"
            r2.putString(r3, r0)
            java.lang.String r0 = "_cmp"
            r1.a(r0, r2)
            goto L8e
        L7d:
            java.lang.String r1 = "Unable to set user property for conversion tracking:  analytics library is missing"
            android.util.Log.w(r0, r1)
            goto L8e
        L83:
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L8e
            java.lang.String r1 = "Received event with track-conversion=false. Do not set user property"
            android.util.Log.d(r0, r1)
        L8e:
            java.lang.String r0 = "_no"
            i8.q.a(r5, r0)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.l.a(android.content.Intent):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.f29284s.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new e0.g(12, this, intent));
            } else {
                a(intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f29284s.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
