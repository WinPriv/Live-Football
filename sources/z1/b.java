package z1;

import a2.o;
import a2.q;
import androidx.work.impl.WorkDatabase;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f36882s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f36883t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.foreground.a f36884u;

    public b(androidx.work.impl.foreground.a aVar, WorkDatabase workDatabase, String str) {
        this.f36884u = aVar;
        this.f36882s = workDatabase;
        this.f36883t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o i10 = ((q) this.f36882s.n()).i(this.f36883t);
        if (i10 != null && i10.b()) {
            synchronized (this.f36884u.f2683u) {
                this.f36884u.f2686x.put(this.f36883t, i10);
                this.f36884u.y.add(i10);
                androidx.work.impl.foreground.a aVar = this.f36884u;
                aVar.f2687z.b(aVar.y);
            }
        }
    }
}
