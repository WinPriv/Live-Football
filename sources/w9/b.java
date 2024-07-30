package w9;

import java.util.concurrent.Executor;
import v9.Task;
import w9.a;

/* loaded from: classes2.dex */
public final class b<TResult> implements v9.a<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final v9.b f36165a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f36166b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36167c = new Object();

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Task f36168s;

        public a(Task task) {
            this.f36168s = task;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Exception exc;
            synchronized (b.this.f36167c) {
                v9.b bVar = b.this.f36165a;
                if (bVar != null) {
                    d dVar = (d) this.f36168s;
                    synchronized (dVar.f36175a) {
                        exc = dVar.f36178d;
                    }
                    bVar.onFailure(exc);
                }
            }
        }
    }

    public b(a.ExecutorC0500a executorC0500a, v9.b bVar) {
        this.f36165a = bVar;
        this.f36166b = executorC0500a;
    }

    @Override // v9.a
    public final void a(Task<TResult> task) {
        if (!task.d()) {
            this.f36166b.execute(new a(task));
        }
    }
}
