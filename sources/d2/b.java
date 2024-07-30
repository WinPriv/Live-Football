package d2;

import android.os.Handler;
import android.os.Looper;
import b2.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public final class b implements d2.a {

    /* renamed from: a, reason: collision with root package name */
    public final l f27265a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f27266b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final a f27267c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b.this.f27266b.post(runnable);
        }
    }

    public b(ExecutorService executorService) {
        this.f27265a = new l(executorService);
    }

    public final void a(Runnable runnable) {
        this.f27265a.execute(runnable);
    }
}
