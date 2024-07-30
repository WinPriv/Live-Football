package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.huawei.openalliance.ad.constant.av;
import e0.g;
import f4.e;
import f4.h;
import j4.a;
import z3.j;
import z3.s;
import z3.w;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f19904s = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(av.K);
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        w.b(getApplicationContext());
        j.a a10 = s.a();
        a10.b(string);
        a10.c(a.b(i10));
        if (string2 != null) {
            a10.f36945b = Base64.decode(string2, 0);
        }
        h hVar = w.a().f36971d;
        j a11 = a10.a();
        g gVar = new g(3, this, jobParameters);
        hVar.getClass();
        hVar.f28093e.execute(new e(hVar, a11, i11, gVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
