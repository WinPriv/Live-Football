package com.vungle.warren.tasks;

import android.os.Bundle;
import com.vungle.warren.analytics.AdAnalytics;
import com.vungle.warren.tasks.JobInfo;
import m8.i;
import m8.n;

/* loaded from: classes2.dex */
public class AnalyticsJob implements Job {
    private static final long DEFAULT_DELAY = 2000;
    public static final String EXTRA_ACTION = "action_extra";
    private static final String EXTRA_BODY = "extra_body";
    private static final String EXTRA_URLS = "extra_urls";
    public static final String TAG = "AnalyticsJob";
    private final AdAnalytics adAnalytics;

    /* loaded from: classes2.dex */
    public @interface Action {
        public static final int PING = 1;
        public static final int RETRY_UNSENT = 2;
        public static final int RI = 0;
        public static final int STORE_URL = 3;
    }

    public AnalyticsJob(AdAnalytics adAnalytics) {
        this.adAnalytics = adAnalytics;
    }

    public static JobInfo makeJob(@Action int i10, String str, String[] strArr, @JobInfo.NetworkType int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt(EXTRA_ACTION, i10);
        bundle.putString(EXTRA_BODY, str);
        bundle.putStringArray(EXTRA_URLS, strArr);
        return new JobInfo(TAG).setUpdateCurrent(false).setExtras(bundle).setReschedulePolicy(2000L, 1).setRequiredNetworkType(i11).setPriority(5);
    }

    @Override // com.vungle.warren.tasks.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        String[] stringArray;
        int i10 = bundle.getInt(EXTRA_ACTION, -1);
        if (i10 == 0) {
            this.adAnalytics.ri(((n) new i().b(n.class, bundle.getString(EXTRA_BODY))).j());
            return 0;
        }
        if (i10 == 1) {
            String[] stringArray2 = bundle.getStringArray(EXTRA_URLS);
            if (stringArray2 != null) {
                String[] ping = this.adAnalytics.ping(stringArray2);
                if (ping.length != 0) {
                    bundle.putStringArray(EXTRA_URLS, ping);
                    return 2;
                }
                return 0;
            }
            return 0;
        }
        if (i10 == 2) {
            String[] retryUnsent = this.adAnalytics.retryUnsent();
            if (retryUnsent.length != 0) {
                bundle.putStringArray(EXTRA_URLS, retryUnsent);
                return 2;
            }
            return 0;
        }
        if (i10 == 3 && (stringArray = bundle.getStringArray(EXTRA_URLS)) != null) {
            this.adAnalytics.saveVungleUrls(stringArray);
            return 0;
        }
        return 0;
    }
}
