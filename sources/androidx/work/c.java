package androidx.work;

/* compiled from: Worker.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Worker f2617s;

    public c(Worker worker) {
        this.f2617s = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Worker worker = this.f2617s;
        try {
            worker.f2598x.i(worker.g());
        } catch (Throwable th) {
            worker.f2598x.j(th);
        }
    }
}
