package b2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* compiled from: WorkForegroundRunnable.java */
/* loaded from: classes.dex */
public final class p implements Runnable {
    public static final String y = r1.h.e("WorkForegroundRunnable");

    /* renamed from: s, reason: collision with root package name */
    public final c2.c<Void> f2832s = new c2.c<>();

    /* renamed from: t, reason: collision with root package name */
    public final Context f2833t;

    /* renamed from: u, reason: collision with root package name */
    public final a2.o f2834u;

    /* renamed from: v, reason: collision with root package name */
    public final ListenableWorker f2835v;

    /* renamed from: w, reason: collision with root package name */
    public final r1.e f2836w;

    /* renamed from: x, reason: collision with root package name */
    public final d2.a f2837x;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c2.c f2838s;

        public a(c2.c cVar) {
            this.f2838s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p.this.f2835v.getClass();
            c2.c cVar = new c2.c();
            cVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
            this.f2838s.k(cVar);
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c2.c f2840s;

        public b(c2.c cVar) {
            this.f2840s = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            p pVar = p.this;
            try {
                r1.d dVar = (r1.d) this.f2840s.get();
                if (dVar != null) {
                    r1.h.c().a(p.y, String.format("Updating notification for %s", pVar.f2834u.f58c), new Throwable[0]);
                    ListenableWorker listenableWorker = pVar.f2835v;
                    listenableWorker.f2594w = true;
                    c2.c<Void> cVar = pVar.f2832s;
                    r1.e eVar = pVar.f2836w;
                    Context context = pVar.f2833t;
                    UUID uuid = listenableWorker.f2591t.f2599a;
                    r rVar = (r) eVar;
                    rVar.getClass();
                    c2.c cVar2 = new c2.c();
                    ((d2.b) rVar.f2847a).a(new q(rVar, cVar2, uuid, dVar, context));
                    cVar.k(cVar2);
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", pVar.f2834u.f58c));
            } catch (Throwable th) {
                pVar.f2832s.j(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public p(Context context, a2.o oVar, ListenableWorker listenableWorker, r1.e eVar, d2.a aVar) {
        this.f2833t = context;
        this.f2834u = oVar;
        this.f2835v = listenableWorker;
        this.f2836w = eVar;
        this.f2837x = aVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (this.f2834u.f70q && !j0.a.b()) {
            c2.c cVar = new c2.c();
            d2.b bVar = (d2.b) this.f2837x;
            bVar.f27267c.execute(new a(cVar));
            cVar.a(new b(cVar), bVar.f27267c);
            return;
        }
        this.f2832s.i(null);
    }
}
