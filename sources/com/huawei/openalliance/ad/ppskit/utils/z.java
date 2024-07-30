package com.huawei.openalliance.ad.ppskit.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f23071a;

    public z(Handler handler) {
        this.f23071a = handler;
    }

    public final void a(Runnable runnable, String str, long j10) {
        Looper looper;
        Handler handler = this.f23071a;
        if (handler == null || runnable == null) {
            return;
        }
        if (j10 < 0) {
            j10 = 0;
        }
        b2 b2Var = new b2(runnable);
        if (j10 == 0) {
            boolean z10 = false;
            if (handler != null && (looper = handler.getLooper()) != null) {
                if (Thread.currentThread() == looper.getThread()) {
                    z10 = true;
                }
            }
            if (z10) {
                b2Var.run();
                return;
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis() + j10;
        try {
            Message obtain = Message.obtain(handler, b2Var);
            obtain.setAsynchronous(true);
            obtain.obj = str;
            handler.sendMessageAtTime(obtain, uptimeMillis);
        } catch (Throwable unused) {
            handler.postAtTime(b2Var, str, uptimeMillis);
        }
    }
}
