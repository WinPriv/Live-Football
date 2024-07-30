package s1;

import a2.q;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import b2.n;
import com.hamkho.livefoot.R;
import f1.h;
import j.a;
import j1.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import r1.h;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public final class j extends r1.m {

    /* renamed from: j, reason: collision with root package name */
    public static j f35069j;

    /* renamed from: k, reason: collision with root package name */
    public static j f35070k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f35071l;

    /* renamed from: a, reason: collision with root package name */
    public Context f35072a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.work.a f35073b;

    /* renamed from: c, reason: collision with root package name */
    public WorkDatabase f35074c;

    /* renamed from: d, reason: collision with root package name */
    public d2.a f35075d;

    /* renamed from: e, reason: collision with root package name */
    public List<d> f35076e;
    public c f;

    /* renamed from: g, reason: collision with root package name */
    public b2.j f35077g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35078h;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f35079i;

    static {
        r1.h.e("WorkManagerImpl");
        f35069j = null;
        f35070k = null;
        f35071l = new Object();
    }

    public j(Context context, androidx.work.a aVar, d2.b bVar) {
        h.a aVar2;
        Executor executor;
        int i10;
        String str;
        boolean z10;
        boolean z11 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        b2.l lVar = bVar.f27265a;
        int i11 = WorkDatabase.f2619k;
        if (z11) {
            aVar2 = new h.a(applicationContext, null);
            aVar2.f27965h = true;
        } else {
            String str2 = i.f35067a;
            aVar2 = new h.a(applicationContext, "androidx.work.workdb");
            aVar2.f27964g = new g(applicationContext);
        }
        aVar2.f27963e = lVar;
        h hVar = new h();
        if (aVar2.f27962d == null) {
            aVar2.f27962d = new ArrayList<>();
        }
        aVar2.f27962d.add(hVar);
        aVar2.a(androidx.work.impl.a.f2628a);
        aVar2.a(new a.h(applicationContext, 2, 3));
        aVar2.a(androidx.work.impl.a.f2629b);
        aVar2.a(androidx.work.impl.a.f2630c);
        aVar2.a(new a.h(applicationContext, 5, 6));
        aVar2.a(androidx.work.impl.a.f2631d);
        aVar2.a(androidx.work.impl.a.f2632e);
        aVar2.a(androidx.work.impl.a.f);
        aVar2.a(new a.i(applicationContext));
        aVar2.a(new a.h(applicationContext, 10, 11));
        aVar2.a(androidx.work.impl.a.f2633g);
        aVar2.f27966i = false;
        aVar2.f27967j = true;
        Context context2 = aVar2.f27961c;
        if (context2 != null) {
            Class<T> cls = aVar2.f27959a;
            if (cls != 0) {
                Executor executor2 = aVar2.f27963e;
                if (executor2 == null && aVar2.f == null) {
                    a.ExecutorC0402a executorC0402a = j.a.f29553x;
                    aVar2.f = executorC0402a;
                    aVar2.f27963e = executorC0402a;
                } else if (executor2 != null && aVar2.f == null) {
                    aVar2.f = executor2;
                } else if (executor2 == null && (executor = aVar2.f) != null) {
                    aVar2.f27963e = executor;
                }
                if (aVar2.f27964g == null) {
                    aVar2.f27964g = new k1.c();
                }
                String str3 = aVar2.f27960b;
                c.InterfaceC0403c interfaceC0403c = aVar2.f27964g;
                h.c cVar = aVar2.f27968k;
                ArrayList<h.b> arrayList = aVar2.f27962d;
                boolean z12 = aVar2.f27965h;
                ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                if (activityManager != null && !activityManager.isLowRamDevice()) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                Executor executor3 = aVar2.f27963e;
                f1.a aVar3 = new f1.a(context2, str3, interfaceC0403c, cVar, arrayList, z12, i10, executor3, aVar2.f, aVar2.f27966i, aVar2.f27967j);
                String name = cls.getPackage().getName();
                String canonicalName = cls.getCanonicalName();
                String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
                try {
                    if (name.isEmpty()) {
                        str = str4;
                    } else {
                        str = name + "." + str4;
                    }
                    f1.h hVar2 = (f1.h) Class.forName(str).newInstance();
                    j1.c e10 = hVar2.e(aVar3);
                    hVar2.f27953c = e10;
                    if (e10 instanceof f1.k) {
                        ((f1.k) e10).f27983s = aVar3;
                    }
                    if (i10 == 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e10.setWriteAheadLoggingEnabled(z10);
                    hVar2.f27956g = arrayList;
                    hVar2.f27952b = executor3;
                    new ArrayDeque();
                    hVar2.f27955e = z12;
                    hVar2.f = z10;
                    WorkDatabase workDatabase = (WorkDatabase) hVar2;
                    Context applicationContext2 = context.getApplicationContext();
                    h.a aVar4 = new h.a(aVar.f);
                    synchronized (r1.h.class) {
                        r1.h.f34817a = aVar4;
                    }
                    String str5 = e.f35061a;
                    v1.b bVar2 = new v1.b(applicationContext2, this);
                    b2.i.a(applicationContext2, SystemJobService.class, true);
                    r1.h.c().a(e.f35061a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                    List<d> asList = Arrays.asList(bVar2, new t1.c(applicationContext2, aVar, bVar, this));
                    c cVar2 = new c(context, aVar, bVar, workDatabase, asList);
                    Context applicationContext3 = context.getApplicationContext();
                    this.f35072a = applicationContext3;
                    this.f35073b = aVar;
                    this.f35075d = bVar;
                    this.f35074c = workDatabase;
                    this.f35076e = asList;
                    this.f = cVar2;
                    this.f35077g = new b2.j(workDatabase);
                    this.f35078h = false;
                    if (!applicationContext3.isDeviceProtectedStorage()) {
                        ((d2.b) this.f35075d).a(new ForceStopRunnable(applicationContext3, this));
                        return;
                    }
                    throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                } catch (ClassNotFoundException unused) {
                    throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
                } catch (IllegalAccessException unused2) {
                    throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
                } catch (InstantiationException unused3) {
                    throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
                }
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j b(Context context) {
        j jVar;
        Object obj = f35071l;
        synchronized (obj) {
            synchronized (obj) {
                jVar = f35069j;
                if (jVar == null) {
                    jVar = f35070k;
                }
            }
            return jVar;
        }
        if (jVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof a.b) {
                c(applicationContext, ((a.b) applicationContext).a());
                jVar = b(applicationContext);
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (s1.j.f35070k != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        s1.j.f35070k = new s1.j(r4, r5, new d2.b(r5.f2607b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        s1.j.f35069j = s1.j.f35070k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = s1.j.f35071l
            monitor-enter(r0)
            s1.j r1 = s1.j.f35069j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            s1.j r2 = s1.j.f35070k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            s1.j r1 = s1.j.f35070k     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            s1.j r1 = new s1.j     // Catch: java.lang.Throwable -> L32
            d2.b r2 = new d2.b     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ExecutorService r3 = r5.f2607b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            s1.j.f35070k = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            s1.j r4 = s1.j.f35070k     // Catch: java.lang.Throwable -> L32
            s1.j.f35069j = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.j.c(android.content.Context, androidx.work.a):void");
    }

    public final void d() {
        synchronized (f35071l) {
            this.f35078h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f35079i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f35079i = null;
            }
        }
    }

    public final void e() {
        ArrayList c10;
        Context context = this.f35072a;
        String str = v1.b.f35910w;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (c10 = v1.b.c(context, jobScheduler)) != null && !c10.isEmpty()) {
            Iterator it = c10.iterator();
            while (it.hasNext()) {
                v1.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        q qVar = (q) this.f35074c.n();
        f1.h hVar = qVar.f74a;
        hVar.b();
        q.h hVar2 = qVar.f81i;
        k1.e a10 = hVar2.a();
        hVar.c();
        try {
            a10.g();
            hVar.h();
            hVar.f();
            hVar2.c(a10);
            e.a(this.f35073b, this.f35074c, this.f35076e);
        } catch (Throwable th) {
            hVar.f();
            hVar2.c(a10);
            throw th;
        }
    }

    public final void f(String str, WorkerParameters.a aVar) {
        ((d2.b) this.f35075d).a(new b2.m(this, str, aVar));
    }

    public final void g(String str) {
        ((d2.b) this.f35075d).a(new n(this, str, false));
    }
}
