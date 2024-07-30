package com.vungle.warren.tasks;

import android.os.Bundle;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class JobInfo implements Cloneable {
    private static final String TAG = "JobInfo";
    private long delay;
    private long nextRescheduleTimeout;
    private long rescheduleTimeout;
    private final String tag;
    private boolean updateCurrent;
    private Bundle extras = new Bundle();
    private int reschedulePolicy = 1;
    private int priority = 2;

    @NetworkType
    private int requiredNetworkType = 0;

    /* loaded from: classes2.dex */
    public @interface NetworkType {
        public static final int ANY = 0;
        public static final int CONNECTED = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Priority {
        public static final int CRITICAL = 5;
        public static final int HIGH = 3;
        public static final int HIGHEST = 4;
        public static final int LOW = 1;
        public static final int LOWEST = 0;
        public static final int NORMAL = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ReschedulePolicy {
        public static final int EXPONENTIAL = 1;
        public static final int LINEAR = 0;
    }

    public JobInfo(String str) {
        this.tag = str;
    }

    public JobInfo copy() {
        try {
            return (JobInfo) super.clone();
        } catch (CloneNotSupportedException e10) {
            Log.e(TAG, Log.getStackTraceString(e10));
            return null;
        }
    }

    public long getDelay() {
        return this.delay;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public String getJobTag() {
        return this.tag;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public long makeNextRescedule() {
        long j10 = this.rescheduleTimeout;
        if (j10 == 0) {
            return 0L;
        }
        long j11 = this.nextRescheduleTimeout;
        if (j11 == 0) {
            this.nextRescheduleTimeout = j10;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j11 * 2;
        }
        return this.nextRescheduleTimeout;
    }

    public JobInfo setDelay(long j10) {
        this.delay = j10;
        return this;
    }

    public JobInfo setExtras(Bundle bundle) {
        if (bundle != null) {
            this.extras = bundle;
        }
        return this;
    }

    public JobInfo setPriority(int i10) {
        this.priority = i10;
        return this;
    }

    public JobInfo setRequiredNetworkType(@NetworkType int i10) {
        this.requiredNetworkType = i10;
        return this;
    }

    public JobInfo setReschedulePolicy(long j10, int i10) {
        this.rescheduleTimeout = j10;
        this.reschedulePolicy = i10;
        return this;
    }

    public JobInfo setUpdateCurrent(boolean z10) {
        this.updateCurrent = z10;
        return this;
    }
}
