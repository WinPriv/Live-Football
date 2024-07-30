package t1;

import a2.o;
import r1.h;

/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f35365s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f35366t;

    public a(b bVar, o oVar) {
        this.f35366t = bVar;
        this.f35365s = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h c10 = h.c();
        String str = b.f35367d;
        o oVar = this.f35365s;
        c10.a(str, String.format("Scheduling work %s", oVar.f56a), new Throwable[0]);
        this.f35366t.f35368a.d(oVar);
    }
}
