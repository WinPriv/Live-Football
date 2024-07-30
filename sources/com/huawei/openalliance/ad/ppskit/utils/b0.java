package com.huawei.openalliance.ad.ppskit.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.huawei.openalliance.ad.ppskit.utils.c0;
import ka.n7;

/* loaded from: classes2.dex */
public final class b0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c0.a f22809s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f22810t;

    public b0(c0 c0Var, c0.a aVar) {
        this.f22810t = c0Var;
        this.f22809s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.f22810t;
        if (c0Var.f()) {
            synchronized (c0Var.f22815b) {
                try {
                    if (c0Var.f22818e == null) {
                        n7.e("HandlerExecAgent", "init handler thread");
                        HandlerThread handlerThread = new HandlerThread(c0Var.f22816c);
                        handlerThread.start();
                        Looper looper = handlerThread.getLooper();
                        if (looper != null) {
                            c0Var.f22818e = handlerThread;
                            z zVar = new z(new Handler(looper));
                            synchronized (c0Var.f22814a) {
                                c0Var.f22817d = zVar;
                            }
                        } else {
                            handlerThread.quit();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        z g6 = this.f22810t.g();
        if (g6 != null) {
            c0.a aVar = this.f22809s;
            int i10 = aVar.f22819a;
            if (i10 == 1) {
                g6.a(aVar.f22820b, aVar.f22821c, aVar.f22822d);
                return;
            }
            if (i10 == 2) {
                String str = aVar.f22821c;
                Handler handler = g6.f23071a;
                if (handler != null && str != null) {
                    handler.removeCallbacksAndMessages(str);
                }
            }
        }
    }
}
