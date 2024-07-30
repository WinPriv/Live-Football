package b2;

import androidx.work.impl.WorkDatabase;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public final class r implements r1.e {

    /* renamed from: a, reason: collision with root package name */
    public final d2.a f2847a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.a f2848b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.p f2849c;

    static {
        r1.h.e("WMFgUpdater");
    }

    public r(WorkDatabase workDatabase, z1.a aVar, d2.a aVar2) {
        this.f2848b = aVar;
        this.f2847a = aVar2;
        this.f2849c = workDatabase.n();
    }
}
