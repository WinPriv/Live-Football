package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: x, reason: collision with root package name */
    public static final HashMap<ComponentName, f> f1546x = new HashMap<>();

    /* renamed from: s, reason: collision with root package name */
    public e f1547s;

    /* renamed from: t, reason: collision with root package name */
    public f f1548t;

    /* renamed from: u, reason: collision with root package name */
    public a f1549u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1550v = false;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList<c> f1551w;

    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[LOOP:0: B:2:0x0002->B:13:0x004a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Void doInBackground(java.lang.Void[] r5) {
            /*
                r4 = this;
                java.lang.Void[] r5 = (java.lang.Void[]) r5
            L2:
                androidx.core.app.JobIntentService r5 = androidx.core.app.JobIntentService.this
                androidx.core.app.JobIntentService$e r0 = r5.f1547s
                r1 = 0
                if (r0 == 0) goto L2f
                java.lang.Object r2 = r0.f1560b
                monitor-enter(r2)
                android.app.job.JobParameters r5 = r0.f1561c     // Catch: java.lang.Throwable -> L2c
                if (r5 != 0) goto L12
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
                goto L47
            L12:
                android.app.job.JobWorkItem r5 = a8.k.h(r5)     // Catch: java.lang.Throwable -> L2c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
                if (r5 == 0) goto L47
                android.content.Intent r2 = a8.j.i(r5)
                androidx.core.app.JobIntentService r3 = r0.f1559a
                java.lang.ClassLoader r3 = r3.getClassLoader()
                r2.setExtrasClassLoader(r3)
                androidx.core.app.JobIntentService$e$a r2 = new androidx.core.app.JobIntentService$e$a
                r2.<init>(r5)
                goto L48
            L2c:
                r5 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
                throw r5
            L2f:
                java.util.ArrayList<androidx.core.app.JobIntentService$c> r0 = r5.f1551w
                monitor-enter(r0)
                java.util.ArrayList<androidx.core.app.JobIntentService$c> r2 = r5.f1551w     // Catch: java.lang.Throwable -> L57
                int r2 = r2.size()     // Catch: java.lang.Throwable -> L57
                if (r2 <= 0) goto L46
                java.util.ArrayList<androidx.core.app.JobIntentService$c> r5 = r5.f1551w     // Catch: java.lang.Throwable -> L57
                r2 = 0
                java.lang.Object r5 = r5.remove(r2)     // Catch: java.lang.Throwable -> L57
                r2 = r5
                androidx.core.app.JobIntentService$d r2 = (androidx.core.app.JobIntentService.d) r2     // Catch: java.lang.Throwable -> L57
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
                goto L48
            L46:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            L47:
                r2 = r1
            L48:
                if (r2 == 0) goto L56
                androidx.core.app.JobIntentService r5 = androidx.core.app.JobIntentService.this
                r2.getIntent()
                r5.b()
                r2.complete()
                goto L2
            L56:
                return r1
            L57:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onCancelled(Void r12) {
            JobIntentService.this.c();
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r12) {
            JobIntentService.this.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final PowerManager.WakeLock f1553a;

        /* renamed from: b, reason: collision with root package name */
        public final PowerManager.WakeLock f1554b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1555c;

        public b(Context context, ComponentName componentName) {
            super(componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f1553a = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f1554b = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void a() {
            synchronized (this) {
                if (this.f1555c) {
                    this.f1555c = false;
                    this.f1554b.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void b() {
            synchronized (this) {
                if (!this.f1555c) {
                    this.f1555c = true;
                    this.f1554b.acquire(600000L);
                    this.f1553a.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.f
        public final void c() {
            synchronized (this) {
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f1556a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1557b;

        public c(Intent intent, int i10) {
            this.f1556a = intent;
            this.f1557b = i10;
        }

        @Override // androidx.core.app.JobIntentService.d
        public final void complete() {
            JobIntentService.this.stopSelf(this.f1557b);
        }

        @Override // androidx.core.app.JobIntentService.d
        public final Intent getIntent() {
            return this.f1556a;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void complete();

        Intent getIntent();
    }

    /* loaded from: classes.dex */
    public static final class e extends JobServiceEngine {

        /* renamed from: a, reason: collision with root package name */
        public final JobIntentService f1559a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f1560b;

        /* renamed from: c, reason: collision with root package name */
        public JobParameters f1561c;

        /* loaded from: classes.dex */
        public final class a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final JobWorkItem f1562a;

            public a(JobWorkItem jobWorkItem) {
                this.f1562a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.d
            public final void complete() {
                synchronized (e.this.f1560b) {
                    JobParameters jobParameters = e.this.f1561c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f1562a);
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.d
            public final Intent getIntent() {
                Intent intent;
                intent = this.f1562a.getIntent();
                return intent;
            }
        }

        public e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f1560b = new Object();
            this.f1559a = jobIntentService;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStartJob(JobParameters jobParameters) {
            this.f1561c = jobParameters;
            this.f1559a.a(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public final boolean onStopJob(JobParameters jobParameters) {
            a aVar = this.f1559a.f1549u;
            if (aVar != null) {
                aVar.cancel(false);
            }
            synchronized (this.f1560b) {
                this.f1561c = null;
            }
            return true;
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1551w = null;
        } else {
            this.f1551w = new ArrayList<>();
        }
    }

    public final void a(boolean z10) {
        if (this.f1549u == null) {
            this.f1549u = new a();
            f fVar = this.f1548t;
            if (fVar != null && z10) {
                fVar.b();
            }
            this.f1549u.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void b();

    public final void c() {
        ArrayList<c> arrayList = this.f1551w;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f1549u = null;
                ArrayList<c> arrayList2 = this.f1551w;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    a(false);
                } else if (!this.f1550v) {
                    this.f1548t.a();
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        e eVar = this.f1547s;
        if (eVar != null) {
            return eVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f1547s = new e(this);
            this.f1548t = null;
            return;
        }
        this.f1547s = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap<ComponentName, f> hashMap = f1546x;
        f fVar = hashMap.get(componentName);
        if (fVar == null) {
            if (i10 < 26) {
                fVar = new b(this, componentName);
                hashMap.put(componentName, fVar);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
        }
        this.f1548t = fVar;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList<c> arrayList = this.f1551w;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f1550v = true;
                this.f1548t.a();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f1551w != null) {
            this.f1548t.c();
            synchronized (this.f1551w) {
                ArrayList<c> arrayList = this.f1551w;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new c(intent, i11));
                a(true);
            }
            return 3;
        }
        return 2;
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public f(ComponentName componentName) {
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }
}
