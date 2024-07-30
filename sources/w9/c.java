package w9;

import java.util.concurrent.Executor;
import v9.Task;
import w9.a;

/* loaded from: classes2.dex */
public final class c<TResult> implements v9.a<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final v9.c<TResult> f36170a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f36171b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36172c = new Object();

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Task f36173s;

        public a(Task task) {
            this.f36173s = task;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (c.this.f36172c) {
                v9.c<TResult> cVar = c.this.f36170a;
                if (cVar != 0) {
                    cVar.onSuccess(this.f36173s.c());
                }
            }
        }
    }

    public c(a.ExecutorC0500a executorC0500a, v9.c cVar) {
        this.f36170a = cVar;
        this.f36171b = executorC0500a;
    }

    @Override // v9.a
    public final void a(Task<TResult> task) {
        if (task.d()) {
            this.f36171b.execute(new a(task));
        }
    }
}
