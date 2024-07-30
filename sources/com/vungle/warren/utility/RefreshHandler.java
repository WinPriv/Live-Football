package com.vungle.warren.utility;

import android.os.Handler;

/* loaded from: classes2.dex */
public class RefreshHandler extends Handler {
    private static final int DISABLE_REFRESH_VALUE = 0;
    private static final int ID = 0;
    private long handlerStartTime;
    private long handlerTimeElapsed;
    private final long refreshDuration;
    private Runnable runnable;

    public RefreshHandler(Runnable runnable, long j10) {
        this.refreshDuration = j10;
        this.runnable = runnable;
    }

    public synchronized void clean() {
        removeMessages(0);
        removeCallbacks(this.runnable);
        this.handlerTimeElapsed = 0L;
        this.handlerStartTime = 0L;
    }

    public synchronized void pause() {
        if (hasMessages(0)) {
            this.handlerTimeElapsed = (System.currentTimeMillis() - this.handlerStartTime) + this.handlerTimeElapsed;
            removeMessages(0);
            removeCallbacks(this.runnable);
        }
    }

    public synchronized void start() {
        if (this.refreshDuration <= 0) {
            return;
        }
        if (!hasMessages(0)) {
            long j10 = this.refreshDuration - this.handlerTimeElapsed;
            this.handlerStartTime = System.currentTimeMillis();
            postDelayed(this.runnable, j10);
        }
    }
}
