package j;

import android.os.Looper;
import c5.e;
import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: w, reason: collision with root package name */
    public static volatile a f29552w;

    /* renamed from: x, reason: collision with root package name */
    public static final ExecutorC0402a f29553x = new ExecutorC0402a();

    /* renamed from: v, reason: collision with root package name */
    public final b f29554v = new b();

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: j.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ExecutorC0402a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a.i().f29554v.f29556w.execute(runnable);
        }
    }

    public static a i() {
        if (f29552w != null) {
            return f29552w;
        }
        synchronized (a.class) {
            if (f29552w == null) {
                f29552w = new a();
            }
        }
        return f29552w;
    }

    public final void j(Runnable runnable) {
        b bVar = this.f29554v;
        if (bVar.f29557x == null) {
            synchronized (bVar.f29555v) {
                if (bVar.f29557x == null) {
                    bVar.f29557x = b.i(Looper.getMainLooper());
                }
            }
        }
        bVar.f29557x.post(runnable);
    }
}
