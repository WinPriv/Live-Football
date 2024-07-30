package b2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s1.j f2807t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f2808u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f2809v = false;

    public c(s1.j jVar, String str) {
        this.f2807t = jVar;
        this.f2808u = str;
    }

    @Override // b2.d
    public final void b() {
        s1.j jVar = this.f2807t;
        WorkDatabase workDatabase = jVar.f35074c;
        workDatabase.c();
        try {
            Iterator it = ((a2.q) workDatabase.n()).g(this.f2808u).iterator();
            while (it.hasNext()) {
                d.a(jVar, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f2809v) {
                s1.e.a(jVar.f35073b, jVar.f35074c, jVar.f35076e);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
