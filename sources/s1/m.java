package s1;

import a2.n;
import a2.o;
import a2.p;
import a2.q;
import a2.s;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class m implements Runnable {
    public static final String K = r1.h.e("WorkerWrapper");
    public final z1.a A;
    public final WorkDatabase B;
    public final p C;
    public final a2.b D;
    public final s E;
    public ArrayList F;
    public String G;
    public volatile boolean J;

    /* renamed from: s, reason: collision with root package name */
    public final Context f35086s;

    /* renamed from: t, reason: collision with root package name */
    public final String f35087t;

    /* renamed from: u, reason: collision with root package name */
    public final List<d> f35088u;

    /* renamed from: v, reason: collision with root package name */
    public o f35089v;

    /* renamed from: w, reason: collision with root package name */
    public ListenableWorker f35090w;

    /* renamed from: x, reason: collision with root package name */
    public final d2.a f35091x;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.work.a f35092z;
    public ListenableWorker.a y = new ListenableWorker.a.C0023a();
    public final c2.c<Boolean> H = new c2.c<>();
    public m7.a<ListenableWorker.a> I = null;

    /* compiled from: WorkerWrapper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f35093a;

        /* renamed from: b, reason: collision with root package name */
        public final z1.a f35094b;

        /* renamed from: c, reason: collision with root package name */
        public final d2.a f35095c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.work.a f35096d;

        /* renamed from: e, reason: collision with root package name */
        public final WorkDatabase f35097e;
        public final String f;

        /* renamed from: g, reason: collision with root package name */
        public List<d> f35098g;

        /* renamed from: h, reason: collision with root package name */
        public WorkerParameters.a f35099h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, d2.a aVar2, z1.a aVar3, WorkDatabase workDatabase, String str) {
            this.f35093a = context.getApplicationContext();
            this.f35095c = aVar2;
            this.f35094b = aVar3;
            this.f35096d = aVar;
            this.f35097e = workDatabase;
            this.f = str;
        }
    }

    public m(a aVar) {
        this.f35086s = aVar.f35093a;
        this.f35091x = aVar.f35095c;
        this.A = aVar.f35094b;
        this.f35087t = aVar.f;
        this.f35088u = aVar.f35098g;
        WorkerParameters.a aVar2 = aVar.f35099h;
        this.f35090w = null;
        this.f35092z = aVar.f35096d;
        WorkDatabase workDatabase = aVar.f35097e;
        this.B = workDatabase;
        this.C = workDatabase.n();
        this.D = workDatabase.i();
        this.E = workDatabase.o();
    }

    public final void a(ListenableWorker.a aVar) {
        boolean z10 = aVar instanceof ListenableWorker.a.c;
        String str = K;
        if (z10) {
            r1.h.c().d(str, String.format("Worker result SUCCESS for %s", this.G), new Throwable[0]);
            if (this.f35089v.c()) {
                e();
                return;
            }
            a2.b bVar = this.D;
            String str2 = this.f35087t;
            p pVar = this.C;
            WorkDatabase workDatabase = this.B;
            workDatabase.c();
            try {
                ((q) pVar).n(r1.l.SUCCEEDED, str2);
                ((q) pVar).l(str2, ((ListenableWorker.a.c) this.y).f2596a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((a2.c) bVar).a(str2).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (((q) pVar).f(str3) == r1.l.BLOCKED && ((a2.c) bVar).b(str3)) {
                        r1.h.c().d(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                        ((q) pVar).n(r1.l.ENQUEUED, str3);
                        ((q) pVar).m(currentTimeMillis, str3);
                    }
                }
                workDatabase.h();
                return;
            } finally {
                workDatabase.f();
                f(false);
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            r1.h.c().d(str, String.format("Worker result RETRY for %s", this.G), new Throwable[0]);
            d();
            return;
        }
        r1.h.c().d(str, String.format("Worker result FAILURE for %s", this.G), new Throwable[0]);
        if (this.f35089v.c()) {
            e();
        } else {
            h();
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            q qVar = (q) this.C;
            if (qVar.f(str2) != r1.l.CANCELLED) {
                qVar.n(r1.l.FAILED, str2);
            }
            linkedList.addAll(((a2.c) this.D).a(str2));
        }
    }

    public final void c() {
        boolean i10 = i();
        String str = this.f35087t;
        WorkDatabase workDatabase = this.B;
        if (!i10) {
            workDatabase.c();
            try {
                r1.l f = ((q) this.C).f(str);
                n nVar = (n) workDatabase.m();
                f1.h hVar = nVar.f53a;
                hVar.b();
                n.a aVar = nVar.f54b;
                k1.e a10 = aVar.a();
                if (str == null) {
                    a10.e(1);
                } else {
                    a10.f(1, str);
                }
                hVar.c();
                try {
                    a10.g();
                    hVar.h();
                    if (f == null) {
                        f(false);
                    } else if (f == r1.l.RUNNING) {
                        a(this.y);
                    } else if (!f.k()) {
                        d();
                    }
                    workDatabase.h();
                } finally {
                    hVar.f();
                    aVar.c(a10);
                }
            } finally {
                workDatabase.f();
            }
        }
        List<d> list = this.f35088u;
        if (list != null) {
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(str);
            }
            e.a(this.f35092z, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f35087t;
        p pVar = this.C;
        WorkDatabase workDatabase = this.B;
        workDatabase.c();
        try {
            ((q) pVar).n(r1.l.ENQUEUED, str);
            ((q) pVar).m(System.currentTimeMillis(), str);
            ((q) pVar).k(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f35087t;
        p pVar = this.C;
        WorkDatabase workDatabase = this.B;
        workDatabase.c();
        try {
            ((q) pVar).m(System.currentTimeMillis(), str);
            ((q) pVar).n(r1.l.ENQUEUED, str);
            q qVar = (q) pVar;
            f1.h hVar = qVar.f74a;
            hVar.b();
            q.f fVar = qVar.f79g;
            k1.e a10 = fVar.a();
            if (str == null) {
                a10.e(1);
            } else {
                a10.f(1, str);
            }
            hVar.c();
            try {
                a10.g();
                hVar.h();
                hVar.f();
                fVar.c(a10);
                ((q) pVar).k(-1L, str);
                workDatabase.h();
            } catch (Throwable th) {
                hVar.f();
                fVar.c(a10);
                throw th;
            }
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x009b, TryCatch #1 {all -> 0x009b, blocks: (B:3:0x0005, B:10:0x0030, B:12:0x0038, B:14:0x0041, B:15:0x005b, B:17:0x005f, B:19:0x0063, B:21:0x0069, B:22:0x0071, B:30:0x007e, B:32:0x007f, B:38:0x0094, B:39:0x009a, B:5:0x0020, B:7:0x0027, B:24:0x0072, B:25:0x007a), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: all -> 0x009b, TryCatch #1 {all -> 0x009b, blocks: (B:3:0x0005, B:10:0x0030, B:12:0x0038, B:14:0x0041, B:15:0x005b, B:17:0x005f, B:19:0x0063, B:21:0x0069, B:22:0x0071, B:30:0x007e, B:32:0x007f, B:38:0x0094, B:39:0x009a, B:5:0x0020, B:7:0x0027, B:24:0x0072, B:25:0x007a), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.B
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.B     // Catch: java.lang.Throwable -> L9b
            a2.p r0 = r0.n()     // Catch: java.lang.Throwable -> L9b
            a2.q r0 = (a2.q) r0     // Catch: java.lang.Throwable -> L9b
            r0.getClass()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            f1.j r1 = f1.j.c(r2, r1)     // Catch: java.lang.Throwable -> L9b
            f1.h r0 = r0.f74a     // Catch: java.lang.Throwable -> L9b
            r0.b()     // Catch: java.lang.Throwable -> L9b
            android.database.Cursor r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L9b
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L93
            r4 = 1
            if (r3 == 0) goto L2f
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L2f
            r3 = r4
            goto L30
        L2f:
            r3 = r2
        L30:
            r0.close()     // Catch: java.lang.Throwable -> L9b
            r1.release()     // Catch: java.lang.Throwable -> L9b
            if (r3 != 0) goto L3f
            android.content.Context r0 = r5.f35086s     // Catch: java.lang.Throwable -> L9b
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            b2.i.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L9b
        L3f:
            if (r6 == 0) goto L5b
            a2.p r0 = r5.C     // Catch: java.lang.Throwable -> L9b
            r1.l r1 = r1.l.ENQUEUED     // Catch: java.lang.Throwable -> L9b
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = r5.f35087t     // Catch: java.lang.Throwable -> L9b
            r3[r2] = r4     // Catch: java.lang.Throwable -> L9b
            a2.q r0 = (a2.q) r0     // Catch: java.lang.Throwable -> L9b
            r0.n(r1, r3)     // Catch: java.lang.Throwable -> L9b
            a2.p r0 = r5.C     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = r5.f35087t     // Catch: java.lang.Throwable -> L9b
            a2.q r0 = (a2.q) r0     // Catch: java.lang.Throwable -> L9b
            r2 = -1
            r0.k(r2, r1)     // Catch: java.lang.Throwable -> L9b
        L5b:
            a2.o r0 = r5.f35089v     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L7f
            androidx.work.ListenableWorker r0 = r5.f35090w     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L7f
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L7f
            z1.a r0 = r5.A     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = r5.f35087t     // Catch: java.lang.Throwable -> L9b
            s1.c r0 = (s1.c) r0     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r2 = r0.C     // Catch: java.lang.Throwable -> L9b
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L9b
            java.util.HashMap r3 = r0.f35056x     // Catch: java.lang.Throwable -> L7c
            r3.remove(r1)     // Catch: java.lang.Throwable -> L7c
            r0.g()     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7c
            goto L7f
        L7c:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7c
            throw r6     // Catch: java.lang.Throwable -> L9b
        L7f:
            androidx.work.impl.WorkDatabase r0 = r5.B     // Catch: java.lang.Throwable -> L9b
            r0.h()     // Catch: java.lang.Throwable -> L9b
            androidx.work.impl.WorkDatabase r0 = r5.B
            r0.f()
            c2.c<java.lang.Boolean> r0 = r5.H
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.i(r6)
            return
        L93:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L9b
            r1.release()     // Catch: java.lang.Throwable -> L9b
            throw r6     // Catch: java.lang.Throwable -> L9b
        L9b:
            r6 = move-exception
            androidx.work.impl.WorkDatabase r0 = r5.B
            r0.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.m.f(boolean):void");
    }

    public final void g() {
        q qVar = (q) this.C;
        String str = this.f35087t;
        r1.l f = qVar.f(str);
        r1.l lVar = r1.l.RUNNING;
        String str2 = K;
        if (f == lVar) {
            r1.h.c().a(str2, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new Throwable[0]);
            f(true);
        } else {
            r1.h.c().a(str2, String.format("Status for %s is %s; not doing any work", str, f), new Throwable[0]);
            f(false);
        }
    }

    public final void h() {
        String str = this.f35087t;
        WorkDatabase workDatabase = this.B;
        workDatabase.c();
        try {
            b(str);
            ((q) this.C).l(str, ((ListenableWorker.a.C0023a) this.y).f2595a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.J) {
            return false;
        }
        r1.h.c().a(K, String.format("Work interrupted for %s", this.G), new Throwable[0]);
        if (((q) this.C).f(this.f35087t) == null) {
            f(false);
        } else {
            f(!r0.k());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (r0 != false) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.m.run():void");
    }
}
