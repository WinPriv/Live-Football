package g2;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask.java */
/* loaded from: classes.dex */
public final class g0<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorService f28400e = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f28401a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f28402b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f28403c;

    /* renamed from: d, reason: collision with root package name */
    public volatile f0<T> f28404d;

    /* compiled from: LottieTask.java */
    /* loaded from: classes.dex */
    public class a extends FutureTask<f0<T>> {
        public a(Callable<f0<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            g0 g0Var = g0.this;
            if (isCancelled()) {
                return;
            }
            try {
                g0Var.a(get());
            } catch (InterruptedException | ExecutionException e10) {
                g0Var.a(new f0<>(e10));
            }
        }
    }

    public g0() {
        throw null;
    }

    public g0(Callable<f0<T>> callable, boolean z10) {
        this.f28401a = new LinkedHashSet(1);
        this.f28402b = new LinkedHashSet(1);
        this.f28403c = new Handler(Looper.getMainLooper());
        this.f28404d = null;
        if (z10) {
            try {
                a(callable.call());
                return;
            } catch (Throwable th) {
                a(new f0<>(th));
                return;
            }
        }
        f28400e.execute(new a(callable));
    }

    public final void a(f0<T> f0Var) {
        if (this.f28404d == null) {
            this.f28404d = f0Var;
            this.f28403c.post(new androidx.activity.k(this, 1));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
