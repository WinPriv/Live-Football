package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: OSTimeoutHandler.java */
/* loaded from: classes2.dex */
public final class y2 extends HandlerThread {

    /* renamed from: t, reason: collision with root package name */
    public static final Object f27201t = new Object();

    /* renamed from: u, reason: collision with root package name */
    public static y2 f27202u;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f27203s;

    public y2() {
        super("com.onesignal.y2");
        start();
        this.f27203s = new Handler(getLooper());
    }

    public static y2 b() {
        if (f27202u == null) {
            synchronized (f27201t) {
                if (f27202u == null) {
                    f27202u = new y2();
                }
            }
        }
        return f27202u;
    }

    public final void a(Runnable runnable) {
        synchronized (f27201t) {
            e3.b(6, "Running destroyTimeout with runnable: " + runnable.toString(), null);
            this.f27203s.removeCallbacks(runnable);
        }
    }

    public final void c(long j10, Runnable runnable) {
        synchronized (f27201t) {
            a(runnable);
            e3.b(6, "Running startTimeout with timeout: " + j10 + " and runnable: " + runnable.toString(), null);
            this.f27203s.postDelayed(runnable, j10);
        }
    }
}
