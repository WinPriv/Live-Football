package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class TU implements H9 {
    @Override // com.facebook.ads.redexgen.X.H9
    public final HJ A4J(Looper looper, @Nullable Handler.Callback callback) {
        return new TT(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final long A57() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final long AFA() {
        return SystemClock.uptimeMillis();
    }
}
