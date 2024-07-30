package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
import r1.h;
import s1.a;
import s1.c;
import s1.j;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* renamed from: u, reason: collision with root package name */
    public static final String f2672u = h.e("SystemJobService");

    /* renamed from: s, reason: collision with root package name */
    public j f2673s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f2674t = new HashMap();

    @Override // s1.a
    public final void b(String str, boolean z10) {
        JobParameters jobParameters;
        h.c().a(f2672u, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f2674t) {
            jobParameters = (JobParameters) this.f2674t.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            j b10 = j.b(getApplicationContext());
            this.f2673s = b10;
            b10.f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                h.c().f(f2672u, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        j jVar = this.f2673s;
        if (jVar != null) {
            c cVar = jVar.f;
            synchronized (cVar.C) {
                cVar.B.remove(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            s1.j r0 = r8.f2673s
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            r1.h r0 = r1.h.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f2672u
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L17:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r9.getExtras()     // Catch: java.lang.NullPointerException -> L2a
            if (r3 == 0) goto L2a
            boolean r4 = r3.containsKey(r0)     // Catch: java.lang.NullPointerException -> L2a
            if (r4 == 0) goto L2a
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.NullPointerException -> L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L3f
            r1.h r9 = r1.h.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f2672u
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L3f:
            java.util.HashMap r3 = r8.f2674t
            monitor-enter(r3)
            java.util.HashMap r4 = r8.f2674t     // Catch: java.lang.Throwable -> Lb0
            boolean r4 = r4.containsKey(r0)     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L61
            r1.h r9 = r1.h.c()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r4 = androidx.work.impl.background.systemjob.SystemJobService.f2672u     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb0
            r1[r2] = r0     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb0
            r9.a(r4, r0, r1)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb0
            return r2
        L61:
            r1.h r4 = r1.h.c()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r5 = androidx.work.impl.background.systemjob.SystemJobService.f2672u     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb0
            r7[r2] = r0     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb0
            r4.a(r5, r6, r2)     // Catch: java.lang.Throwable -> Lb0
            java.util.HashMap r2 = r8.f2674t     // Catch: java.lang.Throwable -> Lb0
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb0
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L93
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f2605b = r4
        L93:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto La3
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f2604a = r4
        La3:
            r4 = 28
            if (r2 < r4) goto Laa
            o0.f.c(r9)
        Laa:
            s1.j r9 = r8.f2673s
            r9.f(r0, r3)
            return r1
        Lb0:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStopJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            s1.j r0 = r6.f2673s
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            r1.h r7 = r1.h.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f2672u
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r7.a(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r7 = r7.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r7 == 0) goto L27
            boolean r3 = r7.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r7 = r7.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r7 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L3c
            r1.h r7 = r1.h.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f2672u
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r7.b(r0, r1, r3)
            return r2
        L3c:
            r1.h r0 = r1.h.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f2672u
            java.lang.String r4 = "onStopJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r7
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r2)
            java.util.HashMap r0 = r6.f2674t
            monitor-enter(r0)
            java.util.HashMap r2 = r6.f2674t     // Catch: java.lang.Throwable -> L72
            r2.remove(r7)     // Catch: java.lang.Throwable -> L72
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            s1.j r0 = r6.f2673s
            r0.g(r7)
            s1.j r0 = r6.f2673s
            s1.c r0 = r0.f
            java.lang.Object r2 = r0.C
            monitor-enter(r2)
            java.util.HashSet r0 = r0.A     // Catch: java.lang.Throwable -> L6f
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6f
            r7 = r7 ^ r1
            return r7
        L6f:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6f
            throw r7
        L72:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
