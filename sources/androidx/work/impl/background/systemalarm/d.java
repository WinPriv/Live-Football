package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import b2.l;
import b2.o;
import b2.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import r1.h;
import s1.j;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public final class d implements s1.a {
    public static final String C = h.e("SystemAlarmDispatcher");
    public Intent A;
    public c B;

    /* renamed from: s, reason: collision with root package name */
    public final Context f2660s;

    /* renamed from: t, reason: collision with root package name */
    public final d2.a f2661t;

    /* renamed from: u, reason: collision with root package name */
    public final t f2662u;

    /* renamed from: v, reason: collision with root package name */
    public final s1.c f2663v;

    /* renamed from: w, reason: collision with root package name */
    public final j f2664w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.work.impl.background.systemalarm.a f2665x;
    public final Handler y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f2666z;

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            RunnableC0026d runnableC0026d;
            synchronized (d.this.f2666z) {
                d dVar2 = d.this;
                dVar2.A = (Intent) dVar2.f2666z.get(0);
            }
            Intent intent = d.this.A;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.A.getIntExtra("KEY_START_ID", 0);
                h c10 = h.c();
                String str = d.C;
                c10.a(str, String.format("Processing command %s, %s", d.this.A, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock a10 = o.a(d.this.f2660s, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    h.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, a10), new Throwable[0]);
                    a10.acquire();
                    d dVar3 = d.this;
                    dVar3.f2665x.d(intExtra, dVar3.A, dVar3);
                    h.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                    a10.release();
                    dVar = d.this;
                    runnableC0026d = new RunnableC0026d(dVar);
                } catch (Throwable th) {
                    try {
                        h c11 = h.c();
                        String str2 = d.C;
                        c11.b(str2, "Unexpected error in onHandleIntent", th);
                        h.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                        a10.release();
                        dVar = d.this;
                        runnableC0026d = new RunnableC0026d(dVar);
                    } catch (Throwable th2) {
                        h.c().a(d.C, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                        a10.release();
                        d dVar4 = d.this;
                        dVar4.e(new RunnableC0026d(dVar4));
                        throw th2;
                    }
                }
                dVar.e(runnableC0026d);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final d f2668s;

        /* renamed from: t, reason: collision with root package name */
        public final Intent f2669t;

        /* renamed from: u, reason: collision with root package name */
        public final int f2670u;

        public b(int i10, Intent intent, d dVar) {
            this.f2668s = dVar;
            this.f2669t = intent;
            this.f2670u = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2668s.a(this.f2670u, this.f2669t);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0026d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final d f2671s;

        public RunnableC0026d(d dVar) {
            this.f2671s = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            d dVar = this.f2671s;
            dVar.getClass();
            h c10 = h.c();
            String str = d.C;
            c10.a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.c();
            synchronized (dVar.f2666z) {
                boolean z11 = true;
                if (dVar.A != null) {
                    h.c().a(str, String.format("Removing command %s", dVar.A), new Throwable[0]);
                    if (((Intent) dVar.f2666z.remove(0)).equals(dVar.A)) {
                        dVar.A = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                l lVar = ((d2.b) dVar.f2661t).f27265a;
                androidx.work.impl.background.systemalarm.a aVar = dVar.f2665x;
                synchronized (aVar.f2648u) {
                    if (!aVar.f2647t.isEmpty()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10 && dVar.f2666z.isEmpty()) {
                    synchronized (lVar.f2819u) {
                        if (lVar.f2817s.isEmpty()) {
                            z11 = false;
                        }
                    }
                    if (!z11) {
                        h.c().a(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = dVar.B;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).b();
                        }
                    }
                }
                if (!dVar.f2666z.isEmpty()) {
                    dVar.f();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2660s = applicationContext;
        this.f2665x = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.f2662u = new t();
        j b10 = j.b(context);
        this.f2664w = b10;
        s1.c cVar = b10.f;
        this.f2663v = cVar;
        this.f2661t = b10.f35075d;
        cVar.a(this);
        this.f2666z = new ArrayList();
        this.A = null;
        this.y = new Handler(Looper.getMainLooper());
    }

    public final void a(int i10, Intent intent) {
        h c10 = h.c();
        String str = C;
        boolean z10 = false;
        c10.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            h.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f2666z) {
                Iterator it = this.f2666z.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f2666z) {
            boolean z11 = !this.f2666z.isEmpty();
            this.f2666z.add(intent);
            if (!z11) {
                f();
            }
        }
    }

    @Override // s1.a
    public final void b(String str, boolean z10) {
        String str2 = androidx.work.impl.background.systemalarm.a.f2645v;
        Intent intent = new Intent(this.f2660s, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        e(new b(0, intent, this));
    }

    public final void c() {
        if (this.y.getLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        h.c().a(C, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        s1.c cVar = this.f2663v;
        synchronized (cVar.C) {
            cVar.B.remove(this);
        }
        ScheduledExecutorService scheduledExecutorService = this.f2662u.f2851a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.B = null;
    }

    public final void e(Runnable runnable) {
        this.y.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock a10 = o.a(this.f2660s, "ProcessCommand");
        try {
            a10.acquire();
            ((d2.b) this.f2664w.f35075d).a(new a());
        } finally {
            a10.release();
        }
    }
}
