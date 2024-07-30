package s1;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import b2.o;
import d0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import s1.m;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public final class c implements s1.a, z1.a {
    public static final String D = r1.h.e("Processor");

    /* renamed from: t, reason: collision with root package name */
    public final Context f35052t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.work.a f35053u;

    /* renamed from: v, reason: collision with root package name */
    public final d2.a f35054v;

    /* renamed from: w, reason: collision with root package name */
    public final WorkDatabase f35055w;

    /* renamed from: z, reason: collision with root package name */
    public final List<d> f35057z;
    public final HashMap y = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f35056x = new HashMap();
    public final HashSet A = new HashSet();
    public final ArrayList B = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public PowerManager.WakeLock f35051s = null;
    public final Object C = new Object();

    /* compiled from: Processor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final s1.a f35058s;

        /* renamed from: t, reason: collision with root package name */
        public final String f35059t;

        /* renamed from: u, reason: collision with root package name */
        public final m7.a<Boolean> f35060u;

        public a(s1.a aVar, String str, c2.c cVar) {
            this.f35058s = aVar;
            this.f35059t = str;
            this.f35060u = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                z10 = this.f35060u.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f35058s.b(this.f35059t, z10);
        }
    }

    public c(Context context, androidx.work.a aVar, d2.b bVar, WorkDatabase workDatabase, List list) {
        this.f35052t = context;
        this.f35053u = aVar;
        this.f35054v = bVar;
        this.f35055w = workDatabase;
        this.f35057z = list;
    }

    public static boolean c(String str, m mVar) {
        boolean z10;
        if (mVar != null) {
            mVar.J = true;
            mVar.i();
            m7.a<ListenableWorker.a> aVar = mVar.I;
            if (aVar != null) {
                z10 = aVar.isDone();
                mVar.I.cancel(true);
            } else {
                z10 = false;
            }
            ListenableWorker listenableWorker = mVar.f35090w;
            if (listenableWorker != null && !z10) {
                listenableWorker.f();
            } else {
                r1.h.c().a(m.K, String.format("WorkSpec %s is already done. Not interrupting.", mVar.f35089v), new Throwable[0]);
            }
            r1.h.c().a(D, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        r1.h.c().a(D, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    public final void a(s1.a aVar) {
        synchronized (this.C) {
            this.B.add(aVar);
        }
    }

    @Override // s1.a
    public final void b(String str, boolean z10) {
        synchronized (this.C) {
            this.y.remove(str);
            r1.h.c().a(D, String.format("%s %s executed; reschedule = %s", c.class.getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((s1.a) it.next()).b(str, z10);
            }
        }
    }

    public final boolean d(String str) {
        boolean z10;
        synchronized (this.C) {
            if (!this.y.containsKey(str) && !this.f35056x.containsKey(str)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public final void e(String str, r1.d dVar) {
        synchronized (this.C) {
            r1.h.c().d(D, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            m mVar = (m) this.y.remove(str);
            if (mVar != null) {
                if (this.f35051s == null) {
                    PowerManager.WakeLock a10 = o.a(this.f35052t, "ProcessorForegroundLck");
                    this.f35051s = a10;
                    a10.acquire();
                }
                this.f35056x.put(str, mVar);
                Intent d10 = androidx.work.impl.foreground.a.d(this.f35052t, str, dVar);
                Context context = this.f35052t;
                Object obj = d0.a.f27248a;
                if (Build.VERSION.SDK_INT >= 26) {
                    a.f.b(context, d10);
                } else {
                    context.startService(d10);
                }
            }
        }
    }

    public final boolean f(String str, WorkerParameters.a aVar) {
        synchronized (this.C) {
            if (d(str)) {
                r1.h.c().a(D, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            m.a aVar2 = new m.a(this.f35052t, this.f35053u, this.f35054v, this, this.f35055w, str);
            aVar2.f35098g = this.f35057z;
            if (aVar != null) {
                aVar2.f35099h = aVar;
            }
            m mVar = new m(aVar2);
            c2.c<Boolean> cVar = mVar.H;
            cVar.a(new a(this, str, cVar), ((d2.b) this.f35054v).f27267c);
            this.y.put(str, mVar);
            ((d2.b) this.f35054v).f27265a.execute(mVar);
            r1.h.c().a(D, String.format("%s: processing %s", c.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final void g() {
        synchronized (this.C) {
            if (!(!this.f35056x.isEmpty())) {
                Context context = this.f35052t;
                String str = androidx.work.impl.foreground.a.B;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f35052t.startService(intent);
                } catch (Throwable th) {
                    r1.h.c().b(D, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f35051s;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f35051s = null;
                }
            }
        }
    }

    public final boolean h(String str) {
        boolean c10;
        synchronized (this.C) {
            r1.h.c().a(D, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            c10 = c(str, (m) this.f35056x.remove(str));
        }
        return c10;
    }

    public final boolean i(String str) {
        boolean c10;
        synchronized (this.C) {
            r1.h.c().a(D, String.format("Processor stopping background work %s", str), new Throwable[0]);
            c10 = c(str, (m) this.y.remove(str));
        }
        return c10;
    }
}
