package com.huawei.openalliance.ad.ppskit.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f22833a = new z(new Handler(Looper.getMainLooper()));

    public static void a(Runnable runnable) {
        f22833a.a(runnable, null, 0L);
    }

    public static void b(Runnable runnable, long j10) {
        f22833a.a(runnable, null, j10);
    }

    public static void c(Runnable runnable, String str, long j10) {
        f22833a.a(runnable, str, j10);
    }

    public static void d(String str) {
        Handler handler = f22833a.f23071a;
        if (handler != null && str != null) {
            handler.removeCallbacksAndMessages(str);
        }
    }
}
