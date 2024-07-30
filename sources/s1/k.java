package s1;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m7.a f35080s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c2.c f35081t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f35082u;

    public k(m mVar, c2.c cVar, c2.c cVar2) {
        this.f35082u = mVar;
        this.f35080s = cVar;
        this.f35081t = cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c2.c cVar = this.f35081t;
        m mVar = this.f35082u;
        try {
            this.f35080s.get();
            r1.h.c().a(m.K, String.format("Starting work for %s", mVar.f35089v.f58c), new Throwable[0]);
            c2.c d10 = mVar.f35090w.d();
            mVar.I = d10;
            cVar.k(d10);
        } catch (Throwable th) {
            cVar.j(th);
        }
    }
}
