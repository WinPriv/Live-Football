package com.ironsource.mediationsdk.a;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public final class i extends Thread {

    /* renamed from: t, reason: collision with root package name */
    public static i f25068t;

    /* renamed from: s, reason: collision with root package name */
    public final a f25069s;

    /* loaded from: classes2.dex */
    public class a extends HandlerThread {

        /* renamed from: s, reason: collision with root package name */
        public Handler f25070s;

        public a() {
            super(com.anythink.basead.d.i.f3957a);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }
    }

    private i() {
        a aVar = new a();
        this.f25069s = aVar;
        aVar.start();
        aVar.f25070s = new Handler(aVar.getLooper());
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (f25068t == null) {
                f25068t = new i();
            }
            iVar = f25068t;
        }
        return iVar;
    }

    public final synchronized void a(Runnable runnable) {
        a aVar = this.f25069s;
        if (aVar == null) {
            return;
        }
        Handler handler = aVar.f25070s;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
