package com.vungle.warren.tasks;

/* loaded from: classes2.dex */
public interface JobRunner {
    void cancelPendingJob(String str);

    void execute(JobInfo jobInfo);
}
