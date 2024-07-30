package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* loaded from: classes2.dex */
abstract class OneSignalJobServiceBase extends JobService {

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JobParameters f26622s;

        public a(JobService jobService, JobParameters jobParameters) {
            this.f26622s = jobParameters;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OneSignalJobServiceBase oneSignalJobServiceBase = OneSignalJobServiceBase.this;
            oneSignalJobServiceBase.a();
            oneSignalJobServiceBase.jobFinished(this.f26622s, false);
        }
    }

    public abstract void a();

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getExtras() == null) {
            return false;
        }
        new Thread(new a(this, jobParameters), "OS_JOBSERVICE_BASE").start();
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
