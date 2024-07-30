package a3;

import a3.c;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f89s;

    public b(c cVar) {
        this.f89s = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f89s;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f95d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
