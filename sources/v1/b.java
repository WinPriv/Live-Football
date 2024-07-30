package v1;

import a2.f;
import a2.g;
import a2.i;
import a2.o;
import a2.q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import r1.c;
import r1.h;
import r1.l;
import s1.d;
import s1.j;

/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: w, reason: collision with root package name */
    public static final String f35910w = h.e("SystemJobScheduler");

    /* renamed from: s, reason: collision with root package name */
    public final Context f35911s;

    /* renamed from: t, reason: collision with root package name */
    public final JobScheduler f35912t;

    /* renamed from: u, reason: collision with root package name */
    public final j f35913u;

    /* renamed from: v, reason: collision with root package name */
    public final a f35914v;

    public b(Context context, j jVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f35911s = context;
        this.f35913u = jVar;
        this.f35912t = jobScheduler;
        this.f35914v = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            h.c().b(f35910w, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            h.c().b(f35910w, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // s1.d
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[SYNTHETIC] */
    @Override // s1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cancel(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f35911s
            android.app.job.JobScheduler r1 = r8.f35912t
            java.util.ArrayList r0 = c(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L49
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            java.lang.String r5 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r4.getExtras()
            if (r6 == 0) goto L35
            boolean r7 = r6.containsKey(r5)     // Catch: java.lang.NullPointerException -> L35
            if (r7 == 0) goto L35
            java.lang.String r5 = r6.getString(r5)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r5 = r2
        L36:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L16
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L16
        L48:
            r2 = r3
        L49:
            if (r2 == 0) goto L76
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L76
            java.util.Iterator r0 = r2.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            b(r1, r2)
            goto L55
        L69:
            s1.j r0 = r8.f35913u
            androidx.work.impl.WorkDatabase r0 = r0.f35074c
            a2.h r0 = r0.k()
            a2.i r0 = (a2.i) r0
            r0.b(r9)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.b.cancel(java.lang.String):void");
    }

    @Override // s1.d
    public final void d(o... oVarArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        j jVar = this.f35913u;
        WorkDatabase workDatabase = jVar.f35074c;
        int length = oVarArr.length;
        int i14 = 0;
        int i15 = 0;
        while (i15 < length) {
            o oVar = oVarArr[i15];
            workDatabase.c();
            try {
                o i16 = ((q) workDatabase.n()).i(oVar.f56a);
                String str = f35910w;
                if (i16 == null) {
                    h.c().f(str, "Skipping scheduling " + oVar.f56a + " because it's no longer in the DB", new Throwable[i14]);
                    workDatabase.h();
                } else if (i16.f57b != l.ENQUEUED) {
                    h.c().f(str, "Skipping scheduling " + oVar.f56a + " because it is no longer enqueued", new Throwable[i14]);
                    workDatabase.h();
                } else {
                    g a10 = ((i) workDatabase.k()).a(oVar.f56a);
                    if (a10 != null) {
                        i13 = a10.f45b;
                        i12 = i15;
                    } else {
                        jVar.f35073b.getClass();
                        int i17 = jVar.f35073b.f2611g;
                        synchronized (b2.h.class) {
                            workDatabase.c();
                            try {
                                Long a11 = ((f) workDatabase.j()).a("next_job_scheduler_id");
                                if (a11 != null) {
                                    i10 = a11.intValue();
                                } else {
                                    i10 = i14;
                                }
                                if (i10 == Integer.MAX_VALUE) {
                                    i11 = i14;
                                } else {
                                    i11 = i10 + 1;
                                }
                                i12 = i15;
                                ((f) workDatabase.j()).b(new a2.d("next_job_scheduler_id", i11));
                                workDatabase.h();
                                if (i10 >= 0 && i10 <= i17) {
                                    i13 = i10;
                                }
                                ((f) workDatabase.j()).b(new a2.d("next_job_scheduler_id", 1));
                                i13 = 0;
                            } finally {
                            }
                        }
                    }
                    if (a10 == null) {
                        g gVar = new g(oVar.f56a, i13);
                        i iVar = (i) jVar.f35074c.k();
                        f1.h hVar = iVar.f46a;
                        hVar.b();
                        hVar.c();
                        try {
                            iVar.f47b.e(gVar);
                            hVar.h();
                            hVar.f();
                        } catch (Throwable th) {
                            hVar.f();
                            throw th;
                        }
                    }
                    e(oVar, i13);
                    workDatabase.h();
                    workDatabase.f();
                    i15 = i12 + 1;
                    i14 = 0;
                }
                i12 = i15;
                workDatabase.f();
                i15 = i12 + 1;
                i14 = 0;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(o oVar, int i10) {
        int i11;
        Object[] objArr;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        JobScheduler jobScheduler = this.f35912t;
        a aVar = this.f35914v;
        aVar.getClass();
        r1.b bVar = oVar.f64j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", oVar.f56a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i10, aVar.f35909a).setRequiresCharging(bVar.f34802b).setRequiresDeviceIdle(bVar.f34803c).setExtras(persistableBundle);
        r1.i iVar = bVar.f34801a;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30 && iVar == r1.i.TEMPORARILY_UNMETERED) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int ordinal = iVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            i11 = 4;
                            if (ordinal != 4 || i14 < 26) {
                                h.c().a(a.f35908b, String.format("API version too low. Cannot convert network type value %s", iVar), new Throwable[0]);
                            }
                        } else {
                            i11 = 3;
                        }
                    } else {
                        i11 = 2;
                    }
                }
                i11 = 1;
            } else {
                i11 = 0;
            }
            extras.setRequiredNetworkType(i11);
        }
        if (!bVar.f34803c) {
            if (oVar.f66l == 2) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            extras.setBackoffCriteria(oVar.f67m, i13);
        }
        long max = Math.max(oVar.a() - System.currentTimeMillis(), 0L);
        if (i14 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!oVar.f70q) {
            extras.setImportantWhileForeground(true);
        }
        if (bVar.f34807h.f34810a.size() > 0) {
            objArr = true;
        } else {
            objArr = false;
        }
        if (objArr != false) {
            Iterator it = bVar.f34807h.f34810a.iterator();
            while (it.hasNext()) {
                c.a aVar2 = (c.a) it.next();
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar2.f34811a, aVar2.f34812b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(bVar.f);
            extras.setTriggerContentMaxDelay(bVar.f34806g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f34804d);
            extras.setRequiresStorageNotLow(bVar.f34805e);
        }
        if (oVar.f65k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (max > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (j0.a.b() && oVar.f70q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        h c10 = h.c();
        Object[] objArr2 = {oVar.f56a, Integer.valueOf(i10)};
        String str = f35910w;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", objArr2), new Throwable[0]);
        try {
            if (jobScheduler.schedule(build) == 0) {
                h.c().f(str, String.format("Unable to schedule work ID %s", oVar.f56a), new Throwable[0]);
                if (oVar.f70q && oVar.f71r == 1) {
                    oVar.f70q = false;
                    h.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", oVar.f56a), new Throwable[0]);
                    e(oVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList c11 = c(this.f35911s, jobScheduler);
            if (c11 != null) {
                i12 = c11.size();
            } else {
                i12 = 0;
            }
            Locale locale = Locale.getDefault();
            j jVar = this.f35913u;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i12), Integer.valueOf(((q) jVar.f35074c.n()).e().size()), Integer.valueOf(jVar.f35073b.f2612h));
            h.c().b(str, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            h.c().b(str, String.format("Unable to schedule %s", oVar), th);
        }
    }
}
