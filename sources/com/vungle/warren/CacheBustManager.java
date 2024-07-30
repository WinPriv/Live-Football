package com.vungle.warren;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.vungle.warren.tasks.CacheBustJob;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.utility.ActivityManager;

/* loaded from: classes2.dex */
public class CacheBustManager {
    public static final String CACHE_BUST_INTERVAL = "cache_bust_interval";
    private static final int DEFAULT_REFRESH_RATE = 0;
    static final long MINIMUM_REFRESH_RATE = 900000;
    public static final String NEXT_CACHE_BUST = "next_cache_bust";
    public static final int NO_VALUE = Integer.MIN_VALUE;
    private JobRunner jobRunner;
    private long refreshElapsed;
    private long startTrackingTime;
    private int status;
    long refreshRate = 0;
    private long overrideRefreshRate = -2147483648L;

    public CacheBustManager(JobRunner jobRunner) {
        this.jobRunner = jobRunner;
        if (ActivityManager.getInstance().isInitialized()) {
            setLifecycleListener();
        } else {
            Log.e("CacheBustManager", "No lifecycle listener set");
            VungleLogger.error("CacheBustManager#deliverError", "No lifecycle listener set");
        }
        this.status = 0;
    }

    private void setLifecycleListener() {
        ActivityManager.getInstance().addListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.warren.CacheBustManager.1
            @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
            public void onStart() {
                super.onStart();
                CacheBustManager.this.resumeCacheBust();
            }

            @Override // com.vungle.warren.utility.ActivityManager.LifeCycleCallback
            public void onStop() {
                super.onStop();
                CacheBustManager.this.stopCacheBust();
            }
        });
    }

    public long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }

    public void overrideRefreshRate(long j10) {
        this.overrideRefreshRate = j10;
        this.refreshRate = j10;
    }

    public void resumeCacheBust() {
        if (this.status == 0 && this.refreshRate != 0) {
            this.status = 1;
            Bundle bundle = new Bundle();
            bundle.putLong(CACHE_BUST_INTERVAL, this.refreshRate);
            bundle.putLong(NEXT_CACHE_BUST, getCurrentTime() + this.refreshRate);
            this.jobRunner.execute(CacheBustJob.makeJobInfo().setDelay(this.refreshRate - this.refreshElapsed).setReschedulePolicy(this.refreshRate, 0).setExtras(bundle));
            this.refreshElapsed = 0L;
            this.startTrackingTime = getCurrentTime();
        }
    }

    public void setRefreshRate(long j10) {
        long j11 = this.overrideRefreshRate;
        if (j11 != -2147483648L) {
            this.refreshRate = j11;
            return;
        }
        long j12 = 0;
        if (j10 > 0) {
            j12 = Math.max(j10, MINIMUM_REFRESH_RATE);
        }
        if (j12 != this.refreshRate) {
            this.refreshRate = j12;
            if (this.status == 1) {
                this.jobRunner.cancelPendingJob(CacheBustJob.TAG);
                this.status = 0;
                startBust();
            }
        }
    }

    public synchronized void startBust() {
        if (this.status == 1) {
            return;
        }
        this.status = 1;
        if (this.refreshRate == 0) {
            this.jobRunner.execute(CacheBustJob.makeJobInfo());
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong(CACHE_BUST_INTERVAL, this.refreshRate);
            bundle.putLong(NEXT_CACHE_BUST, getCurrentTime() + this.refreshRate);
            this.jobRunner.execute(CacheBustJob.makeJobInfo().setReschedulePolicy(this.refreshRate, 0).setExtras(bundle));
        }
        this.startTrackingTime = getCurrentTime();
    }

    public void stopCacheBust() {
        if (this.refreshRate != 0) {
            this.refreshElapsed = (getCurrentTime() - this.startTrackingTime) % this.refreshRate;
        }
        this.jobRunner.cancelPendingJob(CacheBustJob.TAG);
        this.status = 0;
    }
}
