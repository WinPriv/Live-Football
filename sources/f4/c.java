package f4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.huawei.openalliance.ad.constant.av;
import f4.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import z3.s;

/* compiled from: JobInfoScheduler.java */
/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28071a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.d f28072b;

    /* renamed from: c, reason: collision with root package name */
    public final d f28073c;

    public c(Context context, g4.d dVar, d dVar2) {
        this.f28071a = context;
        this.f28072b = dVar;
        this.f28073c = dVar2;
    }

    @Override // f4.k
    public final void a(s sVar, int i10) {
        b(sVar, i10, false);
    }

    @Override // f4.k
    public final void b(s sVar, int i10, boolean z10) {
        boolean z11;
        Context context = this.f28071a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(sVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(j4.a.a(sVar.d())).array());
        if (sVar.c() != null) {
            adler32.update(sVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
                d4.a.a(sVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                return;
            }
        }
        long x10 = this.f28072b.x(sVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        w3.d d10 = sVar.d();
        d dVar = this.f28073c;
        builder.setMinimumLatency(dVar.b(d10, x10, i10));
        Set<d.b> b10 = dVar.c().get(d10).b();
        if (b10.contains(d.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b10.contains(d.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (b10.contains(d.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", sVar.b());
        persistableBundle.putInt("priority", j4.a.a(sVar.d()));
        if (sVar.c() != null) {
            persistableBundle.putString(av.K, Base64.encodeToString(sVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {sVar, Integer.valueOf(value), Long.valueOf(dVar.b(sVar.d(), x10, i10)), Long.valueOf(x10), Integer.valueOf(i10)};
        String c10 = d4.a.c("JobInfoScheduler");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
