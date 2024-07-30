package b2;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s1.j f2803t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ UUID f2804u;

    public a(s1.j jVar, UUID uuid) {
        this.f2803t = jVar;
        this.f2804u = uuid;
    }

    @Override // b2.d
    public final void b() {
        s1.j jVar = this.f2803t;
        WorkDatabase workDatabase = jVar.f35074c;
        workDatabase.c();
        try {
            d.a(jVar, this.f2804u.toString());
            workDatabase.h();
            workDatabase.f();
            s1.e.a(jVar.f35073b, jVar.f35074c, jVar.f35076e);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
