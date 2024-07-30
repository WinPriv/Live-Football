package com.vungle.warren.tasks;

import android.os.Bundle;
import com.vungle.warren.log.LogManager;

/* loaded from: classes2.dex */
public class SendLogsJob implements Job {
    static final String TAG = "SendLogsJob";
    private LogManager logManager;

    public SendLogsJob(LogManager logManager) {
        this.logManager = logManager;
    }

    public static JobInfo makeJobInfo() {
        return new JobInfo(TAG).setPriority(2);
    }

    @Override // com.vungle.warren.tasks.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        this.logManager.sendSdkLogs();
        return 0;
    }
}
