package b2;

import android.content.Context;
import c2.a;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c2.c f2842s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UUID f2843t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r1.d f2844u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f2845v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f2846w;

    public q(r rVar, c2.c cVar, UUID uuid, r1.d dVar, Context context) {
        this.f2846w = rVar;
        this.f2842s = cVar;
        this.f2843t = uuid;
        this.f2844u = dVar;
        this.f2845v = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f2842s.f3203s instanceof a.b)) {
                String uuid = this.f2843t.toString();
                r1.l f = ((a2.q) this.f2846w.f2849c).f(uuid);
                if (f != null && !f.k()) {
                    ((s1.c) this.f2846w.f2848b).e(uuid, this.f2844u);
                    this.f2845v.startService(androidx.work.impl.foreground.a.a(this.f2845v, uuid, this.f2844u));
                } else {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.f2842s.i(null);
        } catch (Throwable th) {
            this.f2842s.j(th);
        }
    }
}
