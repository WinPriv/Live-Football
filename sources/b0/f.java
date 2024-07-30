package b0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f2707a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f2708b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f2709c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f2710d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f2711e;
    public static final Method f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f2712g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[ADDED_TO_REGION] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            b0.f.f2712g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            b0.f.f2707a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            b0.f.f2708b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            b0.f.f2709c = r0
            java.lang.Class<?> r0 = b0.f.f2707a
            r3 = 0
            r4 = 3
            java.lang.String r5 = "performStopActivity"
            r6 = 2
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            if (r0 != 0) goto L3f
            goto L53
        L3f:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L53
            r8[r3] = r7     // Catch: java.lang.Throwable -> L53
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L53
            r8[r2] = r9     // Catch: java.lang.Throwable -> L53
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r6] = r9     // Catch: java.lang.Throwable -> L53
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L53
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L53
            goto L54
        L53:
            r0 = r1
        L54:
            b0.f.f2710d = r0
            java.lang.Class<?> r0 = b0.f.f2707a
            if (r0 != 0) goto L5b
            goto L6b
        L5b:
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L6b
            r8[r3] = r7     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L6b
            r8[r2] = r9     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L6b
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L6b
            goto L6c
        L6b:
            r0 = r1
        L6c:
            b0.f.f2711e = r0
            java.lang.Class<?> r0 = b0.f.f2707a
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            java.lang.Class<java.util.List> r8 = java.util.List.class
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r9 == r10) goto L81
            r10 = 27
            if (r9 != r10) goto L7f
            goto L81
        L7f:
            r9 = r3
            goto L82
        L81:
            r9 = r2
        L82:
            if (r9 == 0) goto Lb1
            if (r0 != 0) goto L87
            goto Lb1
        L87:
            java.lang.String r9 = "requestRelaunchActivity"
            r10 = 9
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> Lb1
            r10[r3] = r7     // Catch: java.lang.Throwable -> Lb1
            r10[r2] = r8     // Catch: java.lang.Throwable -> Lb1
            r10[r6] = r8     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb1
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb1
            r4 = 4
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            r4 = 5
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb1
            r4 = 6
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb1
            r4 = 7
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            r4 = 8
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb1
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch: java.lang.Throwable -> Lb1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lb1
            r1 = r0
        Lb1:
            b0.f.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.<clinit>():void");
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: s, reason: collision with root package name */
        public Object f2713s;

        /* renamed from: t, reason: collision with root package name */
        public Activity f2714t;

        /* renamed from: u, reason: collision with root package name */
        public final int f2715u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f2716v = false;

        /* renamed from: w, reason: collision with root package name */
        public boolean f2717w = false;

        /* renamed from: x, reason: collision with root package name */
        public boolean f2718x = false;

        public a(Activity activity) {
            this.f2714t = activity;
            this.f2715u = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f2714t == activity) {
                this.f2714t = null;
                this.f2717w = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (this.f2717w && !this.f2718x && !this.f2716v) {
                Object obj = this.f2713s;
                boolean z10 = false;
                try {
                    Object obj2 = f.f2709c.get(activity);
                    if (obj2 == obj && activity.hashCode() == this.f2715u) {
                        f.f2712g.postAtFrontOfQueue(new e(f.f2708b.get(activity), obj2));
                        z10 = true;
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z10) {
                    this.f2718x = true;
                    this.f2713s = null;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f2714t == activity) {
                this.f2716v = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
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
}
