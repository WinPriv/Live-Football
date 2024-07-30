package com.anythink.expressad.exoplayer.scheduler;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.anythink.expressad.exoplayer.k.af;

@TargetApi(21)
/* loaded from: classes.dex */
public final class PlatformScheduler implements c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9310b = "PlatformScheduler";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9311c = "service_action";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9312d = "service_package";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9313e = "requirements";
    private final int f;

    /* renamed from: g, reason: collision with root package name */
    private final ComponentName f9314g;

    /* renamed from: h, reason: collision with root package name */
    private final JobScheduler f9315h;

    /* loaded from: classes.dex */
    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            if (new a(extras.getInt(PlatformScheduler.f9313e)).a(this)) {
                String string = extras.getString(PlatformScheduler.f9311c);
                af.a((Context) this, new Intent(string).setPackage(extras.getString(PlatformScheduler.f9312d)));
                return false;
            }
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    private PlatformScheduler(Context context, int i10) {
        this.f = i10;
        this.f9314g = new ComponentName(context, (Class<?>) PlatformSchedulerService.class);
        this.f9315h = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.anythink.expressad.exoplayer.scheduler.c
    public final boolean a(a aVar, String str, String str2) {
        int i10;
        JobInfo.Builder builder = new JobInfo.Builder(this.f, this.f9314g);
        int a10 = aVar.a();
        if (a10 == 0) {
            i10 = 0;
        } else if (a10 != 1) {
            i10 = 2;
            if (a10 != 2) {
                i10 = 3;
                if (a10 != 3) {
                    i10 = 4;
                    if (a10 == 4) {
                        if (af.f8993a < 26) {
                            throw new UnsupportedOperationException();
                        }
                    } else {
                        throw new UnsupportedOperationException();
                    }
                } else if (af.f8993a < 24) {
                    throw new UnsupportedOperationException();
                }
            }
        } else {
            i10 = 1;
        }
        builder.setRequiredNetworkType(i10);
        builder.setRequiresDeviceIdle(aVar.c());
        builder.setRequiresCharging(aVar.b());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f9311c, str2);
        persistableBundle.putString(f9312d, str);
        persistableBundle.putInt(f9313e, aVar.d());
        builder.setExtras(persistableBundle);
        return this.f9315h.schedule(builder.build()) == 1;
    }

    @Override // com.anythink.expressad.exoplayer.scheduler.c
    public final boolean a() {
        this.f9315h.cancel(this.f);
        return true;
    }

    @SuppressLint({"WrongConstant"})
    private static JobInfo a(int i10, ComponentName componentName, a aVar, String str, String str2) {
        int i11;
        JobInfo.Builder builder = new JobInfo.Builder(i10, componentName);
        int a10 = aVar.a();
        if (a10 == 0) {
            i11 = 0;
        } else if (a10 != 1) {
            i11 = 2;
            if (a10 != 2) {
                i11 = 3;
                if (a10 != 3) {
                    i11 = 4;
                    if (a10 == 4) {
                        if (af.f8993a < 26) {
                            throw new UnsupportedOperationException();
                        }
                    } else {
                        throw new UnsupportedOperationException();
                    }
                } else if (af.f8993a < 24) {
                    throw new UnsupportedOperationException();
                }
            }
        } else {
            i11 = 1;
        }
        builder.setRequiredNetworkType(i11);
        builder.setRequiresDeviceIdle(aVar.c());
        builder.setRequiresCharging(aVar.b());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f9311c, str);
        persistableBundle.putString(f9312d, str2);
        persistableBundle.putInt(f9313e, aVar.d());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    private static void b() {
    }

    private static /* synthetic */ void c() {
    }
}
