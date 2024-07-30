package com.anythink.expressad.exoplayer.k;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
final class aa implements c {
    @Override // com.anythink.expressad.exoplayer.k.c
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.anythink.expressad.exoplayer.k.c
    public final long b() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.anythink.expressad.exoplayer.k.c
    public final void a(long j10) {
        SystemClock.sleep(j10);
    }

    @Override // com.anythink.expressad.exoplayer.k.c
    public final k a(Looper looper, Handler.Callback callback) {
        return new ab(new Handler(looper, callback));
    }
}
