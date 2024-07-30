package b2;

import androidx.work.impl.WorkDatabase;

/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f2826v = r1.h.e("StopWorkRunnable");

    /* renamed from: s, reason: collision with root package name */
    public final s1.j f2827s;

    /* renamed from: t, reason: collision with root package name */
    public final String f2828t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2829u;

    public n(s1.j jVar, String str, boolean z10) {
        this.f2827s = jVar;
        this.f2828t = str;
        this.f2829u = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean i10;
        s1.j jVar = this.f2827s;
        WorkDatabase workDatabase = jVar.f35074c;
        s1.c cVar = jVar.f;
        a2.p n10 = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f2828t;
            synchronized (cVar.C) {
                containsKey = cVar.f35056x.containsKey(str);
            }
            if (this.f2829u) {
                i10 = this.f2827s.f.h(this.f2828t);
            } else {
                if (!containsKey) {
                    a2.q qVar = (a2.q) n10;
                    if (qVar.f(this.f2828t) == r1.l.RUNNING) {
                        qVar.n(r1.l.ENQUEUED, this.f2828t);
                    }
                }
                i10 = this.f2827s.f.i(this.f2828t);
            }
            r1.h.c().a(f2826v, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f2828t, Boolean.valueOf(i10)), new Throwable[0]);
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }
}
