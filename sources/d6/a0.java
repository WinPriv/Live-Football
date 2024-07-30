package d6;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: SystemClock.java */
/* loaded from: classes2.dex */
public final class a0 implements c {
    @Override // d6.c
    public final long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // d6.c
    public final b0 b(Looper looper, Handler.Callback callback) {
        return new b0(new Handler(looper, callback));
    }

    @Override // d6.c
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // d6.c
    public final void c() {
    }
}
