package com.anythink.core.common.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6016a = "TimeOutHandlerImpl";

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f6017b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f6018c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f6019d;

    private c() {
        HandlerThread handlerThread = new HandlerThread("timeout_handler_thread");
        handlerThread.start();
        this.f6019d = new Handler(handlerThread.getLooper());
        this.f6018c = new Handler(Looper.getMainLooper());
    }

    public static a a() {
        if (f6017b == null) {
            synchronized (c.class) {
                if (f6017b == null) {
                    f6017b = new c();
                }
            }
        }
        return f6017b;
    }

    private Handler a(boolean z10) {
        return z10 ? this.f6018c : this.f6019d;
    }

    @Override // com.anythink.core.common.i.a
    public final void a(b bVar, long j10) {
        a(bVar, j10, true);
    }

    @Override // com.anythink.core.common.i.a
    public final void a(b bVar, long j10, boolean z10) {
        Handler a10 = a(z10);
        if (a10 == null) {
            return;
        }
        a10.postDelayed(bVar, j10);
    }

    @Override // com.anythink.core.common.i.a
    public final void a(b bVar) {
        Handler handler = this.f6018c;
        if (handler != null) {
            handler.removeCallbacks(bVar);
        }
        Handler handler2 = this.f6019d;
        if (handler2 != null) {
            handler2.removeCallbacks(bVar);
        }
    }
}
