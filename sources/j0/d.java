package j0;

/* compiled from: CancellationSignal.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29559a;

    /* renamed from: b, reason: collision with root package name */
    public a f29560b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29561c;

    /* compiled from: CancellationSignal.java */
    /* loaded from: classes.dex */
    public interface a {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            if (this.f29559a) {
                return;
            }
            this.f29559a = true;
            this.f29561c = true;
            a aVar = this.f29560b;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f29561c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f29561c = false;
                notifyAll();
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            while (this.f29561c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f29560b == aVar) {
                return;
            }
            this.f29560b = aVar;
            if (this.f29559a) {
                aVar.onCancel();
            }
        }
    }
}
