package com.vungle.warren;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.vungle.warren.tasks.JobCreator;
import com.vungle.warren.tasks.JobInfo;
import com.vungle.warren.tasks.JobRunner;
import com.vungle.warren.tasks.runnable.JobRunnable;
import com.vungle.warren.tasks.utility.ThreadPriorityHelper;
import com.vungle.warren.utility.NetworkProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class VungleJobRunner implements JobRunner {
    private JobCreator creator;
    private Executor executor;
    private final NetworkProvider networkProvider;
    private final ThreadPriorityHelper threadPriorityHelper;
    private static Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = "VungleJobRunner";
    private long nextCheck = Long.MAX_VALUE;
    private final NetworkProvider.NetworkListener networkListener = new NetworkProvider.NetworkListener() { // from class: com.vungle.warren.VungleJobRunner.1
        @Override // com.vungle.warren.utility.NetworkProvider.NetworkListener
        public void onChanged(int i10) {
            VungleJobRunner.this.executePendingJobs();
        }
    };
    private List<PendingJob> pendingJobs = new CopyOnWriteArrayList();
    private Runnable pendingRunnable = new PendingRunnable(new WeakReference(this));

    /* loaded from: classes2.dex */
    public static class PendingJob {
        JobInfo info;
        private final long uptimeMillis;

        public PendingJob(long j10, JobInfo jobInfo) {
            this.uptimeMillis = j10;
            this.info = jobInfo;
        }
    }

    /* loaded from: classes2.dex */
    public static class PendingRunnable implements Runnable {
        WeakReference<VungleJobRunner> runner;

        public PendingRunnable(WeakReference<VungleJobRunner> weakReference) {
            this.runner = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            VungleJobRunner vungleJobRunner = this.runner.get();
            if (vungleJobRunner != null) {
                vungleJobRunner.executePendingJobs();
            }
        }
    }

    public VungleJobRunner(JobCreator jobCreator, Executor executor, ThreadPriorityHelper threadPriorityHelper, NetworkProvider networkProvider) {
        this.creator = jobCreator;
        this.executor = executor;
        this.threadPriorityHelper = threadPriorityHelper;
        this.networkProvider = networkProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void executePendingJobs() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = Long.MAX_VALUE;
        long j11 = 0;
        for (PendingJob pendingJob : this.pendingJobs) {
            if (uptimeMillis >= pendingJob.uptimeMillis) {
                boolean z10 = true;
                if (pendingJob.info.getRequiredNetworkType() == 1 && this.networkProvider.getCurrentNetworkType() == -1) {
                    j11++;
                    z10 = false;
                }
                if (z10) {
                    this.pendingJobs.remove(pendingJob);
                    this.executor.execute(new JobRunnable(pendingJob.info, this.creator, this, this.threadPriorityHelper));
                }
            } else {
                j10 = Math.min(j10, pendingJob.uptimeMillis);
            }
        }
        if (j10 != Long.MAX_VALUE && j10 != this.nextCheck) {
            handler.removeCallbacks(this.pendingRunnable);
            handler.postAtTime(this.pendingRunnable, TAG, j10);
        }
        this.nextCheck = j10;
        if (j11 > 0) {
            this.networkProvider.addListener(this.networkListener);
        } else {
            this.networkProvider.removeListener(this.networkListener);
        }
    }

    @Override // com.vungle.warren.tasks.JobRunner
    public synchronized void cancelPendingJob(String str) {
        ArrayList arrayList = new ArrayList();
        for (PendingJob pendingJob : this.pendingJobs) {
            if (pendingJob.info.getJobTag().equals(str)) {
                arrayList.add(pendingJob);
            }
        }
        this.pendingJobs.removeAll(arrayList);
    }

    @Override // com.vungle.warren.tasks.JobRunner
    public synchronized void execute(JobInfo jobInfo) {
        JobInfo copy = jobInfo.copy();
        String jobTag = copy.getJobTag();
        long delay = copy.getDelay();
        copy.setDelay(0L);
        if (copy.getUpdateCurrent()) {
            for (PendingJob pendingJob : this.pendingJobs) {
                if (pendingJob.info.getJobTag().equals(jobTag)) {
                    Log.d(TAG, "replacing pending job with new " + jobTag);
                    this.pendingJobs.remove(pendingJob);
                }
            }
        }
        this.pendingJobs.add(new PendingJob(SystemClock.uptimeMillis() + delay, copy));
        executePendingJobs();
    }
}
