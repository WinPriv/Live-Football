package com.google.firebase.messaging;

import a8.i;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.k;
import androidx.annotation.Keep;
import com.applovin.exoplayer2.a.m;
import com.applovin.exoplayer2.a.x;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import i8.d0;
import i8.l;
import i8.o;
import i8.r;
import i8.v;
import i8.z;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k8.g;
import w3.e;
import z7.d;

/* loaded from: classes2.dex */
public class FirebaseMessaging {

    /* renamed from: m, reason: collision with root package name */
    public static final long f21278m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n, reason: collision with root package name */
    public static com.google.firebase.messaging.a f21279n;

    @SuppressLint({"FirebaseUnknownNullness"})
    public static e o;

    /* renamed from: p, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f21280p;

    /* renamed from: a, reason: collision with root package name */
    public final n7.e f21281a;

    /* renamed from: b, reason: collision with root package name */
    public final b8.a f21282b;

    /* renamed from: c, reason: collision with root package name */
    public final d8.c f21283c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f21284d;

    /* renamed from: e, reason: collision with root package name */
    public final o f21285e;
    public final v f;

    /* renamed from: g, reason: collision with root package name */
    public final a f21286g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f21287h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f21288i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f21289j;

    /* renamed from: k, reason: collision with root package name */
    public final r f21290k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21291l;

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final d f21292a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21293b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f21294c;

        public a(d dVar) {
            this.f21292a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [i8.m] */
        public final synchronized void a() {
            if (this.f21293b) {
                return;
            }
            Boolean b10 = b();
            this.f21294c = b10;
            if (b10 == null) {
                this.f21292a.b(new z7.b() { // from class: i8.m
                    @Override // z7.b
                    public final void a(z7.a aVar) {
                        boolean z10;
                        boolean z11;
                        FirebaseMessaging.a aVar2 = FirebaseMessaging.a.this;
                        synchronized (aVar2) {
                            aVar2.a();
                            Boolean bool = aVar2.f21294c;
                            if (bool != null) {
                                z11 = bool.booleanValue();
                            } else {
                                n7.e eVar = FirebaseMessaging.this.f21281a;
                                eVar.a();
                                h8.a aVar3 = eVar.f33463g.get();
                                synchronized (aVar3) {
                                    z10 = aVar3.f28789b;
                                }
                                z11 = z10;
                            }
                        }
                        if (z11) {
                            com.google.firebase.messaging.a aVar4 = FirebaseMessaging.f21279n;
                            FirebaseMessaging.this.d();
                        }
                    }
                });
            }
            this.f21293b = true;
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            n7.e eVar = FirebaseMessaging.this.f21281a;
            eVar.a();
            Context context = eVar.f33458a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(n7.e eVar, b8.a aVar, c8.a<g> aVar2, c8.a<i> aVar3, d8.c cVar, e eVar2, d dVar) {
        eVar.a();
        Context context = eVar.f33458a;
        final r rVar = new r(context);
        final o oVar = new o(eVar, rVar, aVar2, aVar3, cVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f21291l = false;
        o = eVar2;
        this.f21281a = eVar;
        this.f21282b = aVar;
        this.f21283c = cVar;
        this.f21286g = new a(dVar);
        eVar.a();
        final Context context2 = eVar.f33458a;
        this.f21284d = context2;
        l lVar = new l();
        this.f21290k = rVar;
        this.f21288i = newSingleThreadExecutor;
        this.f21285e = oVar;
        this.f = new v(newSingleThreadExecutor);
        this.f21287h = scheduledThreadPoolExecutor;
        this.f21289j = threadPoolExecutor;
        eVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(lVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.c();
        }
        scheduledThreadPoolExecutor.execute(new androidx.activity.b(this, 14));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i10 = d0.f29249j;
        int i11 = 9;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: i8.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b0 b0Var;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                r rVar2 = rVar;
                o oVar2 = oVar;
                synchronized (b0.class) {
                    WeakReference<b0> weakReference = b0.f29236c;
                    if (weakReference != null) {
                        b0Var = weakReference.get();
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                        b0 b0Var2 = new b0(sharedPreferences, scheduledExecutorService);
                        synchronized (b0Var2) {
                            b0Var2.f29237a = y.a(sharedPreferences, scheduledExecutorService);
                        }
                        b0.f29236c = new WeakReference<>(b0Var2);
                        b0Var = b0Var2;
                    }
                }
                return new d0(firebaseMessaging, rVar2, b0Var, oVar2, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new x(this, i11));
        scheduledThreadPoolExecutor.execute(new k(this, i11));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(long j10, z zVar) {
        synchronized (FirebaseMessaging.class) {
            if (f21280p == null) {
                f21280p = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f21280p.schedule(zVar, j10, TimeUnit.SECONDS);
        }
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(n7.e eVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            eVar.a();
            firebaseMessaging = (FirebaseMessaging) eVar.f33461d.a(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() throws IOException {
        Task task;
        b8.a aVar = this.f21282b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        a.C0239a c10 = c();
        if (!f(c10)) {
            return c10.f21299a;
        }
        String a10 = r.a(this.f21281a);
        v vVar = this.f;
        synchronized (vVar) {
            task = (Task) vVar.f29304b.getOrDefault(a10, null);
            if (task != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + a10);
                }
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + a10);
                }
                o oVar = this.f21285e;
                task = oVar.a(oVar.c(r.a(oVar.f29286a), "*", new Bundle())).onSuccessTask(this.f21289j, new m(this, a10, c10, 5)).continueWithTask(vVar.f29303a, new com.applovin.exoplayer2.a.o(7, vVar, a10));
                vVar.f29304b.put(a10, task);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    public final a.C0239a c() {
        com.google.firebase.messaging.a aVar;
        String c10;
        a.C0239a b10;
        Context context = this.f21284d;
        synchronized (FirebaseMessaging.class) {
            if (f21279n == null) {
                f21279n = new com.google.firebase.messaging.a(context);
            }
            aVar = f21279n;
        }
        n7.e eVar = this.f21281a;
        eVar.a();
        if ("[DEFAULT]".equals(eVar.f33459b)) {
            c10 = "";
        } else {
            c10 = eVar.c();
        }
        String a10 = r.a(this.f21281a);
        synchronized (aVar) {
            b10 = a.C0239a.b(aVar.f21297a.getString(c10 + "|T|" + a10 + "|*", null));
        }
        return b10;
    }

    public final void d() {
        b8.a aVar = this.f21282b;
        if (aVar != null) {
            aVar.a();
        } else if (f(c())) {
            synchronized (this) {
                if (!this.f21291l) {
                    e(0L);
                }
            }
        }
    }

    public final synchronized void e(long j10) {
        b(j10, new z(this, Math.min(Math.max(30L, 2 * j10), f21278m)));
        this.f21291l = true;
    }

    public final boolean f(a.C0239a c0239a) {
        String str;
        boolean z10;
        if (c0239a == null) {
            return true;
        }
        r rVar = this.f21290k;
        synchronized (rVar) {
            if (rVar.f29295b == null) {
                rVar.d();
            }
            str = rVar.f29295b;
        }
        if (System.currentTimeMillis() <= c0239a.f21301c + a.C0239a.f21298d && str.equals(c0239a.f21300b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return false;
    }
}
