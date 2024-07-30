package t3;

import java.util.concurrent.Executor;

/* compiled from: Executors.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35414a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f35415b = new b();

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            l.e().post(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* loaded from: classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
