package w9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f36161b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f36162c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f36163d;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorC0500a f36164a = new ExecutorC0500a();

    /* renamed from: w9.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class ExecutorC0500a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f36162c = availableProcessors + 1;
        f36163d = (availableProcessors * 2) + 1;
    }
}
