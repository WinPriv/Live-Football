package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.s2;

/* loaded from: classes2.dex */
public class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        s2 c10 = s2.c();
        s2.b bVar = new s2.b(this, jobParameters);
        c10.getClass();
        e3.b(6, "OSBackground sync, calling initWithContext", null);
        e3.y(this);
        Thread thread = new Thread(bVar, "OS_SYNCSRV_BG_SYNC");
        c10.f26886b = thread;
        thread.start();
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean z10;
        s2 c10 = s2.c();
        Thread thread = c10.f26886b;
        if (thread == null || !thread.isAlive()) {
            z10 = false;
        } else {
            c10.f26886b.interrupt();
            z10 = true;
        }
        e3.b(6, "SyncJobService onStopJob called, system conditions not available reschedule: " + z10, null);
        return z10;
    }
}
