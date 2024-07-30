package com.onesignal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;

/* compiled from: OSBackgroundSync.java */
/* loaded from: classes2.dex */
public abstract class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f26884c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f26885a = false;

    /* renamed from: b, reason: collision with root package name */
    public Thread f26886b;

    public final void a(Context context) {
        e3.b(6, getClass().getSimpleName().concat(" cancel background sync"), null);
        synchronized (f26884c) {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(2071862118);
        }
    }

    public final void b(Context context, long j10) {
        boolean z10;
        boolean z11;
        Thread thread;
        e3.b(7, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j10, null);
        Iterator<JobInfo> it = ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (true) {
            z10 = false;
            if (it.hasNext()) {
                if (it.next().getId() == 2071862118 && (thread = this.f26886b) != null && thread.isAlive()) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (z11) {
            e3.b(7, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null);
            this.f26885a = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(2071862118, new ComponentName(context, (Class<?>) SyncJobService.class));
        builder.setMinimumLatency(j10).setRequiredNetworkType(1);
        if (e.a(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            z10 = true;
        }
        if (z10) {
            builder.setPersisted(true);
        }
        try {
            e3.b(5, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build()), null);
        } catch (NullPointerException e10) {
            e3.b(3, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e10);
        }
    }
}
