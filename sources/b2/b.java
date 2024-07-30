package b2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s1.j f2805t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f2806u = "FOCUS_LOST_WORKER_TAG";

    public b(s1.j jVar) {
        this.f2805t = jVar;
    }

    @Override // b2.d
    public final void b() {
        s1.j jVar = this.f2805t;
        WorkDatabase workDatabase = jVar.f35074c;
        workDatabase.c();
        try {
            Iterator it = ((a2.q) workDatabase.n()).h(this.f2806u).iterator();
            while (it.hasNext()) {
                d.a(jVar, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            s1.e.a(jVar.f35073b, jVar.f35074c, jVar.f35076e);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
