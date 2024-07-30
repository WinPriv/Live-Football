package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.os.Bundle;
import com.ironsource.lifecycle.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    public static final d A = new d();
    public static final AtomicBoolean B = new AtomicBoolean(false);

    /* renamed from: s, reason: collision with root package name */
    public int f24712s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f24713t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24714u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24715v = true;

    /* renamed from: w, reason: collision with root package name */
    public int f24716w = com.ironsource.lifecycle.e.f24724a;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f24717x = new CopyOnWriteArrayList();
    public final a y = new a();

    /* renamed from: z, reason: collision with root package name */
    public final e f24718z = new e();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            if (dVar.f24713t == 0) {
                dVar.f24714u = true;
                com.ironsource.environment.e.c.f24668a.c(new RunnableC0326d());
                dVar.f24716w = com.ironsource.lifecycle.e.f24727d;
            }
            if (dVar.f24712s == 0 && dVar.f24714u) {
                com.ironsource.environment.e.c.f24668a.c(new pb.a(dVar));
                dVar.f24715v = true;
                dVar.f24716w = com.ironsource.lifecycle.e.f24728e;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = d.this.f24717x.iterator();
            while (it.hasNext()) {
                ((com.ironsource.lifecycle.c) it.next()).a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = d.this.f24717x.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: com.ironsource.lifecycle.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0326d implements Runnable {
        public RunnableC0326d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = d.this.f24717x.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements b.a {
        public e() {
        }

        @Override // com.ironsource.lifecycle.b.a
        public final void a(Activity activity) {
            d dVar = d.this;
            int i10 = dVar.f24712s + 1;
            dVar.f24712s = i10;
            if (i10 == 1 && dVar.f24715v) {
                com.ironsource.environment.e.c.f24668a.c(new b());
                dVar.f24715v = false;
                dVar.f24716w = com.ironsource.lifecycle.e.f24725b;
            }
        }

        @Override // com.ironsource.lifecycle.b.a
        public final void b(Activity activity) {
            d dVar = d.this;
            int i10 = dVar.f24713t + 1;
            dVar.f24713t = i10;
            if (i10 == 1) {
                if (dVar.f24714u) {
                    com.ironsource.environment.e.c.f24668a.c(new c());
                    dVar.f24714u = false;
                    dVar.f24716w = com.ironsource.lifecycle.e.f24726c;
                } else {
                    com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.f24668a;
                    com.ironsource.environment.e.c.a(dVar.y);
                }
            }
        }
    }

    public static d a() {
        return A;
    }

    public final void b(com.ironsource.lifecycle.c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f24717x;
        if (copyOnWriteArrayList.contains(cVar)) {
            copyOnWriteArrayList.remove(cVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i10 = com.ironsource.lifecycle.b.f24710t;
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager != null && fragmentManager.findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment") == null) {
            fragmentManager.beginTransaction().add(new com.ironsource.lifecycle.b(), "com.ironsource.lifecycle.IronsourceLifecycleFragment").commit();
            fragmentManager.executePendingTransactions();
        }
        com.ironsource.lifecycle.b bVar = (com.ironsource.lifecycle.b) activity.getFragmentManager().findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment");
        if (bVar != null) {
            bVar.f24711s = this.f24718z;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i10 = this.f24713t - 1;
        this.f24713t = i10;
        if (i10 == 0) {
            com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.f24668a;
            com.ironsource.environment.e.c.a(this.y, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i10 = this.f24712s - 1;
        this.f24712s = i10;
        if (i10 == 0 && this.f24714u) {
            com.ironsource.environment.e.c.f24668a.c(new pb.a(this));
            this.f24715v = true;
            this.f24716w = com.ironsource.lifecycle.e.f24728e;
        }
    }

    public final void a(com.ironsource.lifecycle.c cVar) {
        if (!IronsourceLifecycleProvider.f24701s || cVar == null) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f24717x;
        if (copyOnWriteArrayList.contains(cVar)) {
            return;
        }
        copyOnWriteArrayList.add(cVar);
    }

    public final boolean b() {
        return this.f24716w == com.ironsource.lifecycle.e.f24728e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
