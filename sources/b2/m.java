package b2;

import androidx.work.WorkerParameters;

/* compiled from: StartWorkRunnable.java */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final s1.j f2823s;

    /* renamed from: t, reason: collision with root package name */
    public final String f2824t;

    /* renamed from: u, reason: collision with root package name */
    public final WorkerParameters.a f2825u;

    public m(s1.j jVar, String str, WorkerParameters.a aVar) {
        this.f2823s = jVar;
        this.f2824t = str;
        this.f2825u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2823s.f.f(this.f2824t, this.f2825u);
    }
}
