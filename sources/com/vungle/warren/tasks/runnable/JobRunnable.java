package com.vungle.warren.tasks.runnable;

import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.vungle.warren.tasks.JobCreator;
import com.vungle.warren.tasks.JobInfo;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.tasks.UnknownTagException;
import com.vungle.warren.tasks.utility.ThreadPriorityHelper;
import com.vungle.warren.utility.PriorityRunnable;

/* loaded from: classes2.dex */
public class JobRunnable extends PriorityRunnable {
    private static final String TAG = "JobRunnable";
    private final JobCreator creator;
    private final JobRunner jobRunner;
    private final JobInfo jobinfo;
    private final ThreadPriorityHelper threadPriorityHelper;

    public JobRunnable(JobInfo jobInfo, JobCreator jobCreator, JobRunner jobRunner, ThreadPriorityHelper threadPriorityHelper) {
        this.jobinfo = jobInfo;
        this.creator = jobCreator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = threadPriorityHelper;
    }

    @Override // com.vungle.warren.utility.PriorityRunnable
    public Integer getPriority() {
        return Integer.valueOf(this.jobinfo.getPriority());
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPriorityHelper threadPriorityHelper = this.threadPriorityHelper;
        if (threadPriorityHelper != null) {
            try {
                int makeAndroidThreadPriority = threadPriorityHelper.makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(makeAndroidThreadPriority);
                Log.d(TAG, "Setting process thread prio = " + makeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                Log.e(TAG, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            String str = TAG;
            Log.d(str, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int onRunJob = this.creator.create(jobTag).onRunJob(extras, this.jobRunner);
            Log.d(str, "On job finished " + jobTag + " with result " + onRunJob);
            if (onRunJob == 2) {
                long makeNextRescedule = this.jobinfo.makeNextRescedule();
                if (makeNextRescedule > 0) {
                    this.jobinfo.setDelay(makeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                    Log.d(str, "Rescheduling " + jobTag + " in " + makeNextRescedule);
                }
            }
        } catch (UnknownTagException e10) {
            Log.e(TAG, "Cannot create job" + e10.getLocalizedMessage());
        } catch (Throwable th) {
            Log.e(TAG, "Can't start job", th);
        }
    }
}
