package com.ironsource.environment.e;

import android.os.Handler;
import android.os.HandlerThread;
import zc.d;

/* loaded from: classes2.dex */
public final class b extends HandlerThread {

    /* renamed from: s, reason: collision with root package name */
    public Handler f24664s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str);
        d.d(str, "name");
    }

    public final void a() {
        this.f24664s = new Handler(getLooper());
    }

    public final void a(Runnable runnable, long j10) {
        d.d(runnable, "task");
        Handler handler = this.f24664s;
        if (handler == null) {
            return;
        }
        handler.postDelayed(runnable, j10);
    }
}
