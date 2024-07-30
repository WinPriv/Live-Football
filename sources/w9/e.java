package w9;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0.b f36180s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Callable f36181t;

    public e(d0.b bVar, o9.a aVar) {
        this.f36180s = bVar;
        this.f36181t = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0.b bVar = this.f36180s;
        try {
            bVar.g(this.f36181t.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }
}
