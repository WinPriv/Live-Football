package com.onesignal;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.onesignal.a;
import java.lang.ref.WeakReference;

/* compiled from: OSViewUtils.java */
/* loaded from: classes2.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f26684a = b(24);

    /* compiled from: OSViewUtils.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26685s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Runnable f26686t;

        /* compiled from: OSViewUtils.java */
        /* renamed from: com.onesignal.b3$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0347a extends a.b {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.onesignal.a f26687a;

            public C0347a(com.onesignal.a aVar) {
                this.f26687a = aVar;
            }

            @Override // com.onesignal.a.b
            public final void a(Activity activity) {
                a aVar = a.this;
                String str = aVar.f26685s;
                this.f26687a.getClass();
                com.onesignal.a.f26632d.remove(str);
                boolean e10 = b3.e(activity);
                Runnable runnable = aVar.f26686t;
                if (e10) {
                    runnable.run();
                } else {
                    b3.a(activity, runnable);
                }
            }
        }

        public a(Runnable runnable, String str) {
            this.f26685s = str;
            this.f26686t = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.onesignal.a aVar = c.f26699t;
            if (aVar != null) {
                C0347a c0347a = new C0347a(aVar);
                com.onesignal.a.f26632d.put(this.f26685s, c0347a);
                Activity activity = aVar.f26635b;
                if (activity != null) {
                    c0347a.a(activity);
                }
            }
        }
    }

    public static void a(Activity activity, Runnable runnable) {
        activity.getWindow().getDecorView().post(new a(runnable, "decorViewReady:" + runnable));
    }

    public static int b(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0047, code lost:
    
        r5 = r5.getWindowManager().getDefaultDisplay().getCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] c(android.app.Activity r5) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.Window r1 = r5.getWindow()
            android.view.View r1 = r1.getDecorView()
            r1.getWindowVisibleDisplayFrame(r0)
            android.view.Window r1 = r5.getWindow()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)
            int r2 = r0.top
            int r3 = r1.getTop()
            int r2 = r2 - r3
            float r2 = (float) r2
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 / r3
            int r1 = r1.getBottom()
            int r0 = r0.bottom
            int r1 = r1 - r0
            float r0 = (float) r1
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 / r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r1 != r3) goto L76
            android.view.WindowManager r5 = r5.getWindowManager()
            android.view.Display r5 = r5.getDefaultDisplay()
            android.view.DisplayCutout r5 = androidx.appcompat.widget.u.f(r5)
            if (r5 == 0) goto L76
            int r1 = androidx.appcompat.widget.r.C(r5)
            float r1 = (float) r1
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 / r3
            int r5 = androidx.appcompat.widget.r.c(r5)
            float r5 = (float) r5
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r5 = r5 / r3
            goto L78
        L76:
            r1 = 0
            r5 = r1
        L78:
            r3 = 4
            int[] r3 = new int[r3]
            r4 = 0
            int r2 = java.lang.Math.round(r2)
            r3[r4] = r2
            r2 = 1
            int r0 = java.lang.Math.round(r0)
            r3[r2] = r0
            r0 = 2
            int r1 = java.lang.Math.round(r1)
            r3[r0] = r1
            r0 = 3
            int r5 = java.lang.Math.round(r5)
            r3[r0] = r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.b3.c(android.app.Activity):int[]");
    }

    public static int d(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return decorView.getHeight();
        }
        return (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    public static boolean e(Activity activity) {
        boolean z10;
        boolean z11;
        if (activity.getWindow().getDecorView().getApplicationWindowToken() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (activity.getWindow().getDecorView().getRootWindowInsets() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            return true;
        }
        return false;
    }

    public static boolean f(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = weakReference.get().getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        if (view != null && displayMetrics.heightPixels - rect.bottom > f26684a) {
            return true;
        }
        return false;
    }
}
